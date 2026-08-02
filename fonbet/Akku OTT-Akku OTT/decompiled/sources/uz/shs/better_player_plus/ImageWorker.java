package uz.shs.better_player_plus;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.media3.common.util.UnstableApi;
import androidx.work.Data;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002¨\u0006\u0014"}, d2 = {"Luz/shs/better_player_plus/ImageWorker;", "Landroidx/work/Worker;", "context", "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "getBitmapFromExternalURL", "Landroid/graphics/Bitmap;", "src", "", "calculateBitmapInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "getBitmapFromInternalURL", "Companion", "better_player_plus_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@UnstableApi
@SourceDebugExtension({"SMAP\nImageWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageWorker.kt\nuz/shs/better_player_plus/ImageWorker\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,117:1\n29#2:118\n*S KotlinDebug\n*F\n+ 1 ImageWorker.kt\nuz/shs/better_player_plus/ImageWorker\n*L\n27#1:118\n*E\n"})
/* loaded from: classes5.dex */
public final class ImageWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageWorker(Context context, WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public static int b(BitmapFactory.Options options) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i <= 256 && i2 <= 256) {
            return 1;
        }
        int i4 = i / 2;
        int i5 = i2 / 2;
        while (i4 / i3 >= 256 && i5 / i3 >= 256) {
            i3 *= 2;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003f, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x003d, code lost:
    
        if (r5 != null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap c(String str) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        r1 = null;
        Bitmap bitmap = null;
        try {
            URL url = new URL(str);
            URLConnection openConnection = url.openConnection();
            Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            inputStream = ((HttpURLConnection) openConnection).getInputStream();
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeStream(inputStream, null, options);
                inputStream.close();
                URLConnection openConnection2 = url.openConnection();
                Intrinsics.checkNotNull(openConnection2, "null cannot be cast to non-null type java.net.HttpURLConnection");
                inputStream = ((HttpURLConnection) openConnection2).getInputStream();
                options.inSampleSize = b(options);
                options.inJustDecodeBounds = false;
                bitmap = BitmapFactory.decodeStream(inputStream, null, options);
            } catch (Exception unused) {
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                if (inputStream2 != null) {
                    try {
                        inputStream2.close();
                    } catch (Exception unused2) {
                    }
                }
                throw th;
            }
        } catch (Exception unused3) {
            inputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return bitmap;
    }

    @Override // androidx.work.Worker
    public final ListenableWorker.Result doWork() {
        Bitmap bitmap;
        try {
            String string = getInputData().getString("url");
            if (string == null) {
                ListenableWorker.Result failure = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(failure, "failure(...)");
                return failure;
            }
            if (m.b(Uri.parse(string))) {
                bitmap = c(string);
            } else {
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    options.inSampleSize = b(options);
                    options.inJustDecodeBounds = false;
                    bitmap = BitmapFactory.decodeFile(string);
                } catch (Exception unused) {
                    bitmap = null;
                }
            }
            String str = string.hashCode() + ".png";
            String str2 = getApplicationContext().getCacheDir().getAbsolutePath() + str;
            if (bitmap == null) {
                ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                Intrinsics.checkNotNullExpressionValue(failure2, "failure(...)");
                return failure2;
            }
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, new FileOutputStream(str2));
            ListenableWorker.Result success = ListenableWorker.Result.success(new Data.Builder().putString("filePath", str2).build());
            Intrinsics.checkNotNull(success);
            return success;
        } catch (Exception e) {
            e.printStackTrace();
            ListenableWorker.Result failure3 = ListenableWorker.Result.failure();
            Intrinsics.checkNotNull(failure3);
            return failure3;
        }
    }
}
