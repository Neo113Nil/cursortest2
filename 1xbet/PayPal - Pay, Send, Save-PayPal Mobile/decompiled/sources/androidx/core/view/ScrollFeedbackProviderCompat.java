package androidx.core.view;

/* loaded from: classes3.dex */
public class ScrollFeedbackProviderCompat {
    private final androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl getHighResolutionOutputSizeshNQ4ISI;

    interface ScrollFeedbackProviderImpl {
        void Camera2StreamConfigurationMap(int i, int i2, int i3);

        void getHighSpeedVideoFpsRanges(int i, int i2, int i3, boolean z);

        void getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4);
    }

    private ScrollFeedbackProviderCompat(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderApi35Impl(view);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderBaseImpl();
        }
    }

    public static androidx.core.view.ScrollFeedbackProviderCompat createProvider(android.view.View view) {
        return new androidx.core.view.ScrollFeedbackProviderCompat(view);
    }

    public void onSnapToItem(int i, int i2, int i3) {
        this.getHighResolutionOutputSizeshNQ4ISI.Camera2StreamConfigurationMap(i, i2, i3);
    }

    public void onScrollLimit(int i, int i2, int i3, boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRanges(i, i2, i3, z);
    }

    public void onScrollProgress(int i, int i2, int i3, int i4) {
        this.getHighResolutionOutputSizeshNQ4ISI.getHighSpeedVideoFpsRangesFor(i, i2, i3, i4);
    }

    static class ScrollFeedbackProviderApi35Impl implements androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl {
        private final android.view.ScrollFeedbackProvider getHighSpeedVideoFpsRangesFor;

        ScrollFeedbackProviderApi35Impl(android.view.View view) {
            this.getHighSpeedVideoFpsRangesFor = android.view.ScrollFeedbackProvider.createProvider(view);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void Camera2StreamConfigurationMap(int i, int i2, int i3) {
            this.getHighSpeedVideoFpsRangesFor.onSnapToItem(i, i2, i3);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void getHighSpeedVideoFpsRanges(int i, int i2, int i3, boolean z) {
            this.getHighSpeedVideoFpsRangesFor.onScrollLimit(i, i2, i3, z);
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4) {
            this.getHighSpeedVideoFpsRangesFor.onScrollProgress(i, i2, i3, i4);
        }
    }

    static class ScrollFeedbackProviderBaseImpl implements androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl {
        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void Camera2StreamConfigurationMap(int i, int i2, int i3) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void getHighSpeedVideoFpsRanges(int i, int i2, int i3, boolean z) {
        }

        @Override // androidx.core.view.ScrollFeedbackProviderCompat.ScrollFeedbackProviderImpl
        public void getHighSpeedVideoFpsRangesFor(int i, int i2, int i3, int i4) {
        }

        private ScrollFeedbackProviderBaseImpl() {
        }
    }
}
