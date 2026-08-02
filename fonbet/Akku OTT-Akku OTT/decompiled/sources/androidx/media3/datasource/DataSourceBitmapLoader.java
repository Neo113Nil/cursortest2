package androidx.media3.datasource;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BitmapLoader;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import com.google.common.base.s;
import com.google.common.base.t;
import com.google.common.util.concurrent.u;
import com.google.common.util.concurrent.v;
import com.google.common.util.concurrent.w;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

@UnstableApi
/* loaded from: classes3.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final s<v> DEFAULT_EXECUTOR_SERVICE = t.a(new b());
    private final DataSource.Factory dataSourceFactory;
    private final v listeningExecutorService;
    private final int maximumOutputDimension;

    @Nullable
    private final BitmapFactory.Options options;

    public DataSourceBitmapLoader(Context context) {
        this((v) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get2()), new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$decodeBitmap$1(byte[] bArr) throws Exception {
        return BitmapUtil.decode(bArr, bArr.length, this.options, this.maximumOutputDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.dataSourceFactory.createDataSource(), uri, this.options, this.maximumOutputDimension);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v lambda$static$0() {
        return w.a(Executors.newSingleThreadExecutor());
    }

    private static Bitmap load(DataSource dataSource, Uri uri, @Nullable BitmapFactory.Options options, int i) throws IOException {
        try {
            dataSource.open(new DataSpec(uri));
            byte[] readToEnd = DataSourceUtil.readToEnd(dataSource);
            return BitmapUtil.decode(readToEnd, readToEnd.length, options, i);
        } finally {
            dataSource.close();
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public u<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap lambda$decodeBitmap$1;
                lambda$decodeBitmap$1 = DataSourceBitmapLoader.this.lambda$decodeBitmap$1(bArr);
                return lambda$decodeBitmap$1;
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public u<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: androidx.media3.datasource.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap lambda$loadBitmap$2;
                lambda$loadBitmap$2 = DataSourceBitmapLoader.this.lambda$loadBitmap$2(uri);
                return lambda$loadBitmap$2;
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public DataSourceBitmapLoader(v vVar, DataSource.Factory factory) {
        this(vVar, factory, null);
    }

    public DataSourceBitmapLoader(v vVar, DataSource.Factory factory, @Nullable BitmapFactory.Options options) {
        this(vVar, factory, options, -1);
    }

    public DataSourceBitmapLoader(v vVar, DataSource.Factory factory, @Nullable BitmapFactory.Options options, int i) {
        this.listeningExecutorService = vVar;
        this.dataSourceFactory = factory;
        this.options = options;
        this.maximumOutputDimension = i;
    }
}
