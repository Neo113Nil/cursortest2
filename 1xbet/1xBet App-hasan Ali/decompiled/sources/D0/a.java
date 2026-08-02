package D0;

import android.app.Notification;
import android.graphics.Insets;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;

/* loaded from: classes.dex */
public abstract class a {
    public static ContentCaptureSession a(View view) {
        return view.getContentCaptureSession();
    }

    public static AutofillId b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
        return contentCaptureSession.newAutofillId(autofillId, j5);
    }

    public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j5) {
        return contentCaptureSession.newVirtualViewStructure(autofillId, j5);
    }

    public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
        contentCaptureSession.notifyViewAppeared(viewStructure);
    }

    public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
        contentCaptureSession.notifyViewDisappeared(autofillId);
    }

    public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, String str) {
        contentCaptureSession.notifyViewTextChanged(autofillId, str);
    }

    public static void g(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
        contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
    }

    public static Insets h(int i, int i5, int i6, int i7) {
        return Insets.of(i, i5, i6, i7);
    }

    public static void i(Notification.Builder builder, boolean z3) {
        builder.setAllowSystemGeneratedContextualActions(z3);
    }

    public static void j(Notification.Builder builder) {
        builder.setBubbleMetadata(null);
    }

    public static void k(Notification.Action.Builder builder) {
        builder.setContextual(false);
    }
}
