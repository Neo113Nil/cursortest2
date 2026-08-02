package androidx.compose.ui.platform.coreshims;

/* loaded from: classes6.dex */
public class ContentCaptureSessionCompat implements androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper {
    private final android.view.View Camera2StreamConfigurationMap;
    private final java.lang.Object getHighSpeedVideoFpsRanges;

    public static androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat toContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        return new androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public android.view.contentcapture.ContentCaptureSession toContentCaptureSession() {
        return (android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges;
    }

    private ContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        this.getHighSpeedVideoFpsRanges = contentCaptureSession;
        this.Camera2StreamConfigurationMap = view;
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public android.view.autofill.AutofillId newAutofillId(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aN_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, ((androidx.compose.ui.platform.coreshims.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(this.Camera2StreamConfigurationMap))).toAutofillId(), j);
        }
        return null;
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public androidx.compose.ui.platform.coreshims.ViewStructureCompat newVirtualViewStructure(android.view.autofill.AutofillId autofillId, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.compose.ui.platform.coreshims.ViewStructureCompat.toViewStructureCompat(androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aP_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, autofillId, j));
        }
        return null;
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewAppeared(android.view.ViewStructure viewStructure) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aQ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, viewStructure);
        }
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewDisappeared(android.view.autofill.AutofillId autofillId) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aR_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, autofillId);
        }
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void flush() {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aT_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, ((androidx.compose.ui.platform.coreshims.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(this.Camera2StreamConfigurationMap))).toAutofillId(), new long[]{Long.MIN_VALUE});
        }
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewsAppeared(java.util.List<android.view.ViewStructure> list) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api34Impl.aU_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, list);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.ViewStructure aO_ = androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aO_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api23Impl.getHighSpeedVideoFpsRanges(aO_).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aQ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, aO_);
            for (int i = 0; i < list.size(); i++) {
                androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aQ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, list.get(i));
            }
            android.view.ViewStructure aO_2 = androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aO_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api23Impl.getHighSpeedVideoFpsRanges(aO_2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aQ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, aO_2);
        }
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewsDisappeared(long[] jArr) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aT_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, ((androidx.compose.ui.platform.coreshims.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(this.Camera2StreamConfigurationMap))).toAutofillId(), jArr);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.ViewStructure aO_ = androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aO_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api23Impl.getHighSpeedVideoFpsRanges(aO_).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aQ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, aO_);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aT_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, ((androidx.compose.ui.platform.coreshims.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.compose.ui.platform.coreshims.ViewCompatShims.getAutofillId(this.Camera2StreamConfigurationMap))).toAutofillId(), jArr);
            android.view.ViewStructure aO_2 = androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aO_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api23Impl.getHighSpeedVideoFpsRanges(aO_2).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aQ_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, aO_2);
        }
    }

    @Override // androidx.compose.ui.contentcapture.ContentCaptureSessionWrapper
    public void notifyViewTextChanged(android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.compose.ui.platform.coreshims.ContentCaptureSessionCompat.Api29Impl.aS_((android.view.contentcapture.ContentCaptureSession) this.getHighSpeedVideoFpsRanges, autofillId, charSequence);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static void aU_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, java.util.List<android.view.ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void aT_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        static void aR_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        static void aQ_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static android.view.ViewStructure aO_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static android.view.ViewStructure aP_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static android.view.autofill.AutofillId aN_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static void aS_(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.os.Bundle getHighSpeedVideoFpsRanges(android.view.ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }
}
