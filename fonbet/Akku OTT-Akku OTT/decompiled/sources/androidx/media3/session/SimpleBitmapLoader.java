package androidx.media3.session;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@UnstableApi
@Deprecated
/* loaded from: classes3.dex */
public final class SimpleBitmapLoader implements androidx.media3.common.util.BitmapLoader {
    private static final com.google.common.base.s<com.google.common.util.concurrent.v> DEFAULT_EXECUTOR_SERVICE = com.google.common.base.t.a(new I5());
    private static final String FILE_URI_EXCEPTION_MESSAGE = "Could not read image from file";
    private final com.google.common.util.concurrent.v executorService;

    public SimpleBitmapLoader() {
        this((ExecutorService) Assertions.checkStateNotNull(DEFAULT_EXECUTOR_SERVICE.get2()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap decode(byte[] bArr) {
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        Assertions.checkArgument(decodeByteArray != null, "Could not decode image data");
        return decodeByteArray;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.google.common.util.concurrent.v lambda$static$0() {
        return com.google.common.util.concurrent.w.a(Executors.newSingleThreadExecutor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Bitmap load(Uri uri) throws IOException {
        if (Constants.FILE.equals(uri.getScheme())) {
            String path = uri.getPath();
            if (path == null) {
                throw new IllegalArgumentException(FILE_URI_EXCEPTION_MESSAGE);
            }
            Bitmap decodeFile = BitmapFactory.decodeFile(path);
            if (decodeFile != null) {
                return decodeFile;
            }
            throw new IllegalArgumentException(FILE_URI_EXCEPTION_MESSAGE);
        }
        URLConnection openConnection = new URL(uri.toString()).openConnection();
        if (!(openConnection instanceof HttpURLConnection)) {
            throw new UnsupportedOperationException("Unsupported scheme: " + uri.getScheme());
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode != 200) {
            throw new IOException(android.support.v4.media.a.a(responseCode, "Invalid response status code: "));
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            Bitmap decode = decode(com.google.common.io.a.b(inputStream));
            inputStream.close();
            return decode;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.u<Bitmap> decodeBitmap(final byte[] bArr) {
        return this.executorService.submit(new Callable() { // from class: androidx.media3.session.J5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap decode;
                decode = SimpleBitmapLoader.decode(bArr);
                return decode;
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public com.google.common.util.concurrent.u<Bitmap> loadBitmap(final Uri uri) {
        return this.executorService.submit(new Callable() { // from class: androidx.media3.session.H5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Bitmap load;
                load = SimpleBitmapLoader.load(uri);
                return load;
            }
        });
    }

    @Override // androidx.media3.common.util.BitmapLoader
    public boolean supportsMimeType(String str) {
        return Util.isBitmapFactorySupportedMimeType(str);
    }

    public SimpleBitmapLoader(ExecutorService executorService) {
        this.executorService = com.google.common.util.concurrent.w.a(executorService);
    }
}
