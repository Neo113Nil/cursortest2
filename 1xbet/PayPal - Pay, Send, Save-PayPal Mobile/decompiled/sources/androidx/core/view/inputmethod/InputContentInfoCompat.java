package androidx.core.view.inputmethod;

/* loaded from: classes3.dex */
public final class InputContentInfoCompat {
    private final androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl getHighSpeedVideoFpsRangesFor;

    interface InputContentInfoCompatImpl {
        android.net.Uri Camera2StreamConfigurationMap();

        android.net.Uri getHighResolutionOutputSizeshNQ4ISI();

        android.content.ClipDescription getHighSpeedVideoFpsRanges();

        void getHighSpeedVideoFpsRangesFor();

        java.lang.Object getHighSpeedVideoSizes();

        void getOutputFormats();
    }

    /* loaded from: classes7.dex */
    static final class InputContentInfoCompatBaseImpl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {
        private final android.net.Uri Camera2StreamConfigurationMap;
        private final android.content.ClipDescription getHighSpeedVideoFpsRangesFor;
        private final android.net.Uri getHighSpeedVideoSizes;

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final void getHighSpeedVideoFpsRangesFor() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final java.lang.Object getHighSpeedVideoSizes() {
            return null;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final void getOutputFormats() {
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final android.net.Uri Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoSizes;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final android.content.ClipDescription getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final android.net.Uri getHighResolutionOutputSizeshNQ4ISI() {
            return this.Camera2StreamConfigurationMap;
        }
    }

    static final class InputContentInfoCompatApi25Impl implements androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl {
        final android.view.inputmethod.InputContentInfo getHighSpeedVideoFpsRangesFor;

        InputContentInfoCompatApi25Impl(java.lang.Object obj) {
            this.getHighSpeedVideoFpsRangesFor = (android.view.inputmethod.InputContentInfo) obj;
        }

        InputContentInfoCompatApi25Impl(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
            this.getHighSpeedVideoFpsRangesFor = new android.view.inputmethod.InputContentInfo(uri, clipDescription, uri2);
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final android.net.Uri Camera2StreamConfigurationMap() {
            return this.getHighSpeedVideoFpsRangesFor.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final android.content.ClipDescription getHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRangesFor.getDescription();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final android.net.Uri getHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighSpeedVideoFpsRangesFor.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final java.lang.Object getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final void getOutputFormats() {
            this.getHighSpeedVideoFpsRangesFor.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl
        public final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRangesFor.releasePermission();
        }
    }

    public InputContentInfoCompat(android.net.Uri uri, android.content.ClipDescription clipDescription, android.net.Uri uri2) {
        this.getHighSpeedVideoFpsRangesFor = new androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatApi25Impl(uri, clipDescription, uri2);
    }

    private InputContentInfoCompat(androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatImpl inputContentInfoCompatImpl) {
        this.getHighSpeedVideoFpsRangesFor = inputContentInfoCompatImpl;
    }

    public final android.net.Uri getContentUri() {
        return this.getHighSpeedVideoFpsRangesFor.Camera2StreamConfigurationMap();
    }

    public final android.content.ClipDescription getDescription() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRanges();
    }

    public final android.net.Uri getLinkUri() {
        return this.getHighSpeedVideoFpsRangesFor.getHighResolutionOutputSizeshNQ4ISI();
    }

    public static androidx.core.view.inputmethod.InputContentInfoCompat wrap(java.lang.Object obj) {
        if (obj == null) {
            return null;
        }
        return new androidx.core.view.inputmethod.InputContentInfoCompat(new androidx.core.view.inputmethod.InputContentInfoCompat.InputContentInfoCompatApi25Impl(obj));
    }

    public final java.lang.Object unwrap() {
        return this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes();
    }

    public final void requestPermission() {
        this.getHighSpeedVideoFpsRangesFor.getOutputFormats();
    }

    public final void releasePermission() {
        this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoFpsRangesFor();
    }
}
