package androidx.compose.ui.platform.coreshims;

/* loaded from: classes.dex */
public class ViewCompatShims {
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    private ViewCompatShims() {
    }

    public static void setImportantForContentCapture(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.compose.ui.platform.coreshims.ViewCompatShims.Api30Impl.setImportantForContentCapture(view, i);
        }
    }

    public static androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat getContentCaptureSession(android.view.View view) {
        android.view.contentcapture.ContentCaptureSession contentCaptureSession;
        if (android.os.Build.VERSION.SDK_INT < 29 || (contentCaptureSession = androidx.compose.ui.platform.coreshims.ViewCompatShims.Api29Impl.getContentCaptureSession(view)) == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.toContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public static androidx.compose.ui.platform.coreshims.AutofillIdCompat getAutofillId(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.compose.ui.platform.coreshims.AutofillIdCompat.toAutofillIdCompat(androidx.compose.ui.platform.coreshims.ViewCompatShims.Api26Impl.getAutofillId(view));
        }
        return null;
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        public static android.view.autofill.AutofillId getAutofillId(android.view.View view) {
            return view.getAutofillId();
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static android.view.contentcapture.ContentCaptureSession getContentCaptureSession(android.view.View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class Api30Impl {
        private Api30Impl() {
        }

        static void setImportantForContentCapture(android.view.View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }
}
