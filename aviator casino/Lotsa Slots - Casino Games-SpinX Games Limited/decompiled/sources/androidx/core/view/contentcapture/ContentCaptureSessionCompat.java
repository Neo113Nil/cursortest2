package androidx.core.view.contentcapture;

/* loaded from: classes2.dex */
public class ContentCaptureSessionCompat {
    private static final java.lang.String KEY_VIEW_TREE_APPEARED = "TREAT_AS_VIEW_TREE_APPEARED";
    private static final java.lang.String KEY_VIEW_TREE_APPEARING = "TREAT_AS_VIEW_TREE_APPEARING";
    private final android.view.View mView;
    private final java.lang.Object mWrappedObj;

    public static androidx.core.view.contentcapture.ContentCaptureSessionCompat toContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        return new androidx.core.view.contentcapture.ContentCaptureSessionCompat(contentCaptureSession, view);
    }

    public android.view.contentcapture.ContentCaptureSession toContentCaptureSession() {
        return (android.view.contentcapture.ContentCaptureSession) this.mWrappedObj;
    }

    private ContentCaptureSessionCompat(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
        this.mWrappedObj = contentCaptureSession;
        this.mView = view;
    }

    public android.view.autofill.AutofillId newAutofillId(long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newAutofillId((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, ((androidx.core.view.autofill.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.core.view.ViewCompat.getAutofillId(this.mView))).toAutofillId(), j);
        }
        return null;
    }

    public androidx.core.view.ViewStructureCompat newVirtualViewStructure(android.view.autofill.AutofillId autofillId, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.ViewStructureCompat.toViewStructureCompat(androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newVirtualViewStructure((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, autofillId, j));
        }
        return null;
    }

    public void notifyViewsAppeared(java.util.List<android.view.ViewStructure> list) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api34Impl.notifyViewsAppeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, list);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.ViewStructure newViewStructure = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, this.mView);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, newViewStructure);
            for (int i = 0; i < list.size(); i++) {
                androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, list.get(i));
            }
            android.view.ViewStructure newViewStructure2 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, this.mView);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, newViewStructure2);
        }
    }

    public void notifyViewsDisappeared(long[] jArr) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewsDisappeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, ((androidx.core.view.autofill.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.core.view.ViewCompat.getAutofillId(this.mView))).toAutofillId(), jArr);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            android.view.ViewStructure newViewStructure = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, this.mView);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(newViewStructure).putBoolean(KEY_VIEW_TREE_APPEARING, true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, newViewStructure);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewsDisappeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, ((androidx.core.view.autofill.AutofillIdCompat) java.util.Objects.requireNonNull(androidx.core.view.ViewCompat.getAutofillId(this.mView))).toAutofillId(), jArr);
            android.view.ViewStructure newViewStructure2 = androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.newViewStructure((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, this.mView);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api23Impl.getExtras(newViewStructure2).putBoolean(KEY_VIEW_TREE_APPEARED, true);
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewAppeared((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, newViewStructure2);
        }
    }

    public void notifyViewTextChanged(android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.view.contentcapture.ContentCaptureSessionCompat.Api29Impl.notifyViewTextChanged((android.view.contentcapture.ContentCaptureSession) this.mWrappedObj, autofillId, charSequence);
        }
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static void notifyViewsAppeared(android.view.contentcapture.ContentCaptureSession contentCaptureSession, java.util.List<android.view.ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void notifyViewsDisappeared(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }

        static void notifyViewAppeared(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static android.view.ViewStructure newViewStructure(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        static android.view.ViewStructure newVirtualViewStructure(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j);
        }

        static android.view.autofill.AutofillId newAutofillId(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, long j) {
            return contentCaptureSession.newAutofillId(autofillId, j);
        }

        public static void notifyViewTextChanged(android.view.contentcapture.ContentCaptureSession contentCaptureSession, android.view.autofill.AutofillId autofillId, java.lang.CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        static android.os.Bundle getExtras(android.view.ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }
}
