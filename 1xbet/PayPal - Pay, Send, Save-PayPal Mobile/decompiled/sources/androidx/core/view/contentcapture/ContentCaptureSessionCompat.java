package androidx.core.view.contentcapture;

/* loaded from: classes7.dex */
public class ContentCaptureSessionCompat {
    private final android.view.View getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoSizes;

    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat toContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        return new androidx.core.view.contentcapture.ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public android.view.contentcapture.ContentCaptureSession toContentCaptureSession() {
        return (android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes;
    }

    private ContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        this.getHighSpeedVideoSizes = contentCaptureSession;
        this.getHighResolutionOutputSizeshNQ4ISI = view;
    }

    public android.view.autofill.AutofillId newAutofillId(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cI_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, ((androidx.core.view.autofill.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.core.view.ViewCompat.getAutofillId(this.getHighResolutionOutputSizeshNQ4ISI))).toAutofillId(), j);
        }
        return null;
    }

    public androidx.core.view.ViewStructureCompat newVirtualViewStructure(android.view.autofill.AutofillId autofillId, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.ViewStructureCompat.toViewStructureCompat(androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cK_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, autofillId, j));
        }
        return null;
    }

    public void notifyViewsAppeared(java.util.List<android.view.ViewStructure> list) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api34Impl.cO_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, list);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.ViewStructure cJ_ = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cJ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            cJ_.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cL_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, cJ_);
            for (int i = 0; i < list.size(); i++) {
                androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cL_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, list.get(i));
            }
            android.view.ViewStructure cJ_2 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cJ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            cJ_2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cL_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, cJ_2);
        }
    }

    public void notifyViewsDisappeared(long[] jArr) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cN_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, ((androidx.core.view.autofill.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.core.view.ViewCompat.getAutofillId(this.getHighResolutionOutputSizeshNQ4ISI))).toAutofillId(), jArr);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.ViewStructure cJ_ = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cJ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            cJ_.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cL_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, cJ_);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cN_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, ((androidx.core.view.autofill.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.core.view.ViewCompat.getAutofillId(this.getHighResolutionOutputSizeshNQ4ISI))).toAutofillId(), jArr);
            android.view.ViewStructure cJ_2 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cJ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            cJ_2.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cL_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, cJ_2);
        }
    }

    public void notifyViewTextChanged(android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.cM_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoSizes, autofillId, charSequence);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static void cO_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, java.util.List<android.view.ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void cN_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        static void cL_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static android.view.ViewStructure cJ_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static android.view.ViewStructure cK_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static android.view.autofill.AutofillId cI_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static void cM_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }
}
