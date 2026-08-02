package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSource;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BitmapLoader;
import com.google.common.base.s;
import com.google.common.base.t;
import com.google.common.util.concurrent.u;
import com.google.common.util.concurrent.v;
import com.google.common.util.concurrent.w;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;

@Deprecated
/* loaded from: classes4.dex */
public final class DataSourceBitmapLoader implements BitmapLoader {
    public static final s<v> DEFAULT_EXECUTOR_SERVICE = t.a(new c());
    private final DataSource.Factory dataSourceFactory;
    private final v listeningExecutorService;

    public DataSourceBitmapLoader(Context context) {
        this((v) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get2()), new DefaultDataSource.Factory(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Assertions.checkArgument(decodeByteArray != null, "Could not decode image data");
        return decodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap lambda$loadBitmap$2(Uri uri) throws Exception {
        return load(this.dataSourceFactory.createDataSource(), uri);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ v lambda$static$0() {
        return w.a(Executors.newSingleThreadExecutor());
    }

    private static Bitmap load(DataSource dataSource, Uri uri) throws IOException {
        dataSource.open(new DataSpec(uri));
        return decode(DataSourceUtil.readToEnd(dataSource));
    }

    @Override // com.google.android.exoplayer2.util.BitmapLoader
    public u<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.listeningExecutorService.submit(new Callable() { // from class: com.google.android.exoplayer2.upstream.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap decode;
                decode = DataSourceBitmapLoader.decode(bArr);
                return decode;
            }
        });
    }

    @Override // com.google.android.exoplayer2.util.BitmapLoader
    public u<Bitmap> loadBitmap(final Uri uri) {
        return this.listeningExecutorService.submit(new Callable() { // from class: com.google.android.exoplayer2.upstream.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap lambda$loadBitmap$2;
                lambda$loadBitmap$2 = DataSourceBitmapLoader.this.lambda$loadBitmap$2(uri);
                return lambda$loadBitmap$2;
            }
        });
    }

    public DataSourceBitmapLoader(v vVar, DataSource.Factory factory) {
        this.listeningExecutorService = vVar;
        this.dataSourceFactory = factory;
    }
}
