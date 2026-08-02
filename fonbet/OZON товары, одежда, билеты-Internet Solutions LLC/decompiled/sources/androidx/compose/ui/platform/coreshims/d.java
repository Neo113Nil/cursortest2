package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;

/* loaded from: classes.dex */
public final class d {

    /* loaded from: classes8.dex */
    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i11) {
            view.setImportantForContentCapture(i11);
        }
    }

    public static androidx.compose.ui.platform.coreshims.a a(@NonNull View view) {
        return androidx.compose.ui.platform.coreshims.a.b(a.a(view));
    }

    public static androidx.compose.ui.platform.coreshims.c b(@NonNull View view) {
        ContentCaptureSession a11;
        if (Build.VERSION.SDK_INT < 29 || (a11 = b.a(view)) == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.c.f(a11, view);
    }

    public static void c(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, 1);
        }
    }
}
