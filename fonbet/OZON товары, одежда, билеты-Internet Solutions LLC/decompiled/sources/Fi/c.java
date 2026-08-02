package Fi;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Environment;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import bd.h;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10737n;

/* loaded from: classes10.dex */
public final class c {
    @NotNull
    public static final File a(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
        if (str == null) {
            Intrinsics.f(externalStoragePublicDirectory);
        } else {
            File file = new File(G.g.c(externalStoragePublicDirectory.getAbsolutePath(), "/", str));
            if (!file.exists()) {
                file.mkdir();
            }
            externalStoragePublicDirectory = file;
        }
        File createTempFile = File.createTempFile("photo", ".jpeg", externalStoragePublicDirectory);
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @NotNull
    public static final File b(String str) {
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        if (str == null) {
            Intrinsics.f(externalStoragePublicDirectory);
        } else {
            File file = new File(G.g.c(externalStoragePublicDirectory.getAbsolutePath(), "/", str));
            if (!file.exists()) {
                file.mkdir();
            }
            externalStoragePublicDirectory = file;
        }
        File createTempFile = File.createTempFile("video", ".mp4", externalStoragePublicDirectory);
        Intrinsics.checkNotNullExpressionValue(createTempFile, "createTempFile(...)");
        return createTempFile;
    }

    @NotNull
    public static final Uri c(@NotNull Context context, @NotNull File file) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Uri d11 = FileProvider.d(context, context.getPackageName() + ".fileprovider", file);
        Intrinsics.checkNotNullExpressionValue(d11, "getUriForFile(...)");
        return d11;
    }

    public static final Object d(@NotNull Context context, @NotNull File file, @NotNull j frame) {
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        MediaScannerConnection.scanFile(context, new String[]{file.toString()}, new String[]{MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file))}, new b(c10737n));
        Object n11 = c10737n.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    public static final void e(@NotNull Context context, @NotNull File file, @NotNull final Function2<? super String, ? super Uri, Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(file, "file");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        MediaScannerConnection.scanFile(context, new String[]{file.toString()}, new String[]{MimeTypeMap.getSingleton().getMimeTypeFromExtension(h.i(file))}, new MediaScannerConnection.OnScanCompletedListener(onSuccess) { // from class: Fi.a

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f9487a;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f9487a = (AbstractC7737t) onSuccess;
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.t] */
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri) {
                Intrinsics.f(str);
                Intrinsics.f(uri);
                this.f9487a.invoke(str, uri);
            }
        });
    }
}
