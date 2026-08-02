package androidx.core.view;

/* loaded from: classes7.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final androidx.core.view.WindowInsetsAnimationControllerCompat.Impl Camera2StreamConfigurationMap;

    WindowInsetsAnimationControllerCompat(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
        this.Camera2StreamConfigurationMap = new androidx.core.view.WindowInsetsAnimationControllerCompat.Impl30(windowInsetsAnimationController);
    }

    public final androidx.core.graphics.Insets getHiddenStateInsets() {
        return this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap();
    }

    public final androidx.core.graphics.Insets getShownStateInsets() {
        return this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final androidx.core.graphics.Insets getCurrentInsets() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor();
    }

    public final float getCurrentFraction() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes();
    }

    public final float getCurrentAlpha() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
    }

    public final int getTypes() {
        return this.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI();
    }

    public final void setInsetsAndAlpha(androidx.core.graphics.Insets insets, float f, float f2) {
        this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes(insets, f, f2);
    }

    public final void finish(boolean z) {
        this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI(z);
    }

    public final boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public final boolean isFinished() {
        return this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor();
    }

    public final boolean isCancelled() {
        return this.Camera2StreamConfigurationMap.getInputFormats();
    }

    static class Impl {
        void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
        }

        public float getHighSpeedVideoFpsRanges() {
            return 0.0f;
        }

        public float getHighSpeedVideoSizes() {
            return 0.0f;
        }

        public void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets, float f, float f2) {
        }

        boolean getHighSpeedVideoSizesFor() {
            return false;
        }

        boolean getInputFormats() {
            return true;
        }

        public int getInputSizeshNQ4ISI() {
            return 0;
        }

        Impl() {
        }

        public androidx.core.graphics.Insets Camera2StreamConfigurationMap() {
            return androidx.core.graphics.Insets.NONE;
        }

        public androidx.core.graphics.Insets getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.core.graphics.Insets.NONE;
        }

        public androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor() {
            return androidx.core.graphics.Insets.NONE;
        }
    }

    static class Impl30 extends androidx.core.view.WindowInsetsAnimationControllerCompat.Impl {
        private final android.view.WindowInsetsAnimationController getHighResolutionOutputSizeshNQ4ISI;

        Impl30(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
            this.getHighResolutionOutputSizeshNQ4ISI = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets Camera2StreamConfigurationMap() {
            return androidx.core.graphics.Insets.toCompatInsets(this.getHighResolutionOutputSizeshNQ4ISI.getHiddenStateInsets());
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getHighResolutionOutputSizeshNQ4ISI() {
            return androidx.core.graphics.Insets.toCompatInsets(this.getHighResolutionOutputSizeshNQ4ISI.getShownStateInsets());
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getHighSpeedVideoFpsRangesFor() {
            return androidx.core.graphics.Insets.toCompatInsets(this.getHighResolutionOutputSizeshNQ4ISI.getCurrentInsets());
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getHighSpeedVideoSizes() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getCurrentFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getHighSpeedVideoFpsRanges() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getCurrentAlpha();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public int getInputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI.getTypes();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void getHighSpeedVideoSizes(androidx.core.graphics.Insets insets, float f, float f2) {
            this.getHighResolutionOutputSizeshNQ4ISI.setInsetsAndAlpha(insets == null ? null : insets.toPlatformInsets(), f, f2);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        void getHighResolutionOutputSizeshNQ4ISI(boolean z) {
            this.getHighResolutionOutputSizeshNQ4ISI.finish(z);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        boolean getHighSpeedVideoSizesFor() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isFinished();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        boolean getInputFormats() {
            return this.getHighResolutionOutputSizeshNQ4ISI.isCancelled();
        }
    }
}
