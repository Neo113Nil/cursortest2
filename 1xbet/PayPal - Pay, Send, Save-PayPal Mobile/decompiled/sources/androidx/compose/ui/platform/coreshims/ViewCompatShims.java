package androidx.compose.ui.platform.coreshims;

/* loaded from: classes6.dex */
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
            androidx.compose.ui.platform.coreshims.ViewCompatShims.Api30Impl.getHighSpeedVideoFpsRanges(view, i);
        }
    }

    public static androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper getContentCaptureSession(android.view.View view) {
        android.view.contentcapture.ContentCaptureSession aV_;
        if (android.os.Build.VERSION.SDK_INT < 29 || (aV_ = androidx.compose.ui.platform.coreshims.ViewCompatShims.Api29Impl.aV_(view)) == null) {
            return null;
        }
        return androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.toContentCaptureSessionCompat(aV_, view);
    }

    public static androidx.compose.ui.platform.coreshims.AutofillIdCompat getAutofillId(android.view.View view) {
        return androidx.compose.ui.platform.coreshims.AutofillIdCompat.toAutofillIdCompat(androidx.compose.ui.platform.coreshims.ViewCompatShims.Api26Impl.getHighSpeedVideoFpsRangesFor(view));
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        public static android.view.autofill.AutofillId getHighSpeedVideoFpsRangesFor(android.view.View view) {
            return view.getAutofillId();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.view.contentcapture.ContentCaptureSession aV_(android.view.View view) {
            return view.getContentCaptureSession();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.view.View view, int i) {
            view.setImportantForContentCapture(i);
        }
    }
}
