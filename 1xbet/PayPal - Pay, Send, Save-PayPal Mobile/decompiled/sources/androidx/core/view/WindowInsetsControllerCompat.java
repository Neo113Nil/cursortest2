package androidx.core.view;

/* loaded from: classes7.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_DEFAULT = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;

    @java.lang.Deprecated
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final androidx.core.view.WindowInsetsControllerCompat.Impl getHighSpeedVideoSizes;

    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, int i);
    }

    @java.lang.Deprecated
    private WindowInsetsControllerCompat(android.view.WindowInsetsController windowInsetsController) {
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.getHighSpeedVideoSizes = new androidx.core.view.WindowInsetsControllerCompat.Impl35(windowInsetsController, this, new androidx.core.view.SoftwareKeyboardControllerCompat(windowInsetsController));
        } else {
            this.getHighSpeedVideoSizes = new androidx.core.view.WindowInsetsControllerCompat.Impl30(windowInsetsController, this, new androidx.core.view.SoftwareKeyboardControllerCompat(windowInsetsController));
        }
    }

    public WindowInsetsControllerCompat(android.view.Window window, android.view.View view) {
        androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat = new androidx.core.view.SoftwareKeyboardControllerCompat(view);
        if (android.os.Build.VERSION.SDK_INT >= 35) {
            this.getHighSpeedVideoSizes = new androidx.core.view.WindowInsetsControllerCompat.Impl35(window, this, softwareKeyboardControllerCompat);
        } else if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.getHighSpeedVideoSizes = new androidx.core.view.WindowInsetsControllerCompat.Impl30(window, this, softwareKeyboardControllerCompat);
        } else {
            this.getHighSpeedVideoSizes = new androidx.core.view.WindowInsetsControllerCompat.Impl26(window, softwareKeyboardControllerCompat);
        }
    }

    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat toWindowInsetsControllerCompat(android.view.WindowInsetsController windowInsetsController) {
        return new androidx.core.view.WindowInsetsControllerCompat(windowInsetsController);
    }

    public final void show(int i) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor(i);
    }

    public final void hide(int i) {
        this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI(i);
    }

    public final boolean isAppearanceLightStatusBars() {
        return this.getHighSpeedVideoSizes.getHighResolutionOutputSizeshNQ4ISI();
    }

    public final void setAppearanceLightStatusBars(boolean z) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(z);
    }

    public final boolean isAppearanceLightNavigationBars() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges();
    }

    public final void setAppearanceLightNavigationBars(boolean z) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges(z);
    }

    public final void controlWindowInsetsAnimation(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(i, j, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    public final void setSystemBarsBehavior(int i) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(i);
    }

    public final int getSystemBarsBehavior() {
        return this.getHighSpeedVideoSizes.getHighSpeedVideoSizes();
    }

    public final void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(onControllableInsetsChangedListener);
    }

    public final void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.getHighSpeedVideoSizes.Camera2StreamConfigurationMap(onControllableInsetsChangedListener);
    }

    static class Impl {
        void Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        void getHighResolutionOutputSizeshNQ4ISI(int i) {
        }

        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return false;
        }

        public void getHighSpeedVideoFpsRanges(boolean z) {
        }

        public boolean getHighSpeedVideoFpsRanges() {
            return false;
        }

        void getHighSpeedVideoFpsRangesFor(int i) {
        }

        int getHighSpeedVideoSizes() {
            return 1;
        }

        void getHighSpeedVideoSizes(int i) {
        }

        void getHighSpeedVideoSizes(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        void getHighSpeedVideoSizes(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void getHighSpeedVideoSizes(boolean z) {
        }

        Impl() {
        }
    }

    static class Impl20 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        private final androidx.core.view.SoftwareKeyboardControllerCompat getHighResolutionOutputSizeshNQ4ISI;
        protected final android.view.Window getHighSpeedVideoSizes;

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        Impl20(android.view.Window window, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.getHighSpeedVideoSizes = window;
            this.getHighResolutionOutputSizeshNQ4ISI = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoFpsRangesFor(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    getHighSpeedVideoSizesFor(i2);
                }
            }
        }

        private void getHighSpeedVideoSizesFor(int i) {
            if (i == 1) {
                getOutputMinFrameDuration(4);
                getOutputFormats(1024);
            } else if (i == 2) {
                getOutputMinFrameDuration(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.show();
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighResolutionOutputSizeshNQ4ISI(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    getInputFormats(i2);
                }
            }
        }

        private void getInputFormats(int i) {
            if (i == 1) {
                Camera2StreamConfigurationMap(4);
            } else if (i == 2) {
                Camera2StreamConfigurationMap(2);
            } else {
                if (i != 8) {
                    return;
                }
                this.getHighResolutionOutputSizeshNQ4ISI.hide();
            }
        }

        protected void Camera2StreamConfigurationMap(int i) {
            android.view.View decorView = this.getHighSpeedVideoSizes.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void getOutputMinFrameDuration(int i) {
            android.view.View decorView = this.getHighSpeedVideoSizes.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void getHighSpeedVideoFpsRanges(int i) {
            this.getHighSpeedVideoSizes.addFlags(i);
        }

        protected void getOutputFormats(int i) {
            this.getHighSpeedVideoSizes.clearFlags(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoSizes.getDecorView().setTag(356039078, java.lang.Integer.valueOf(i));
            if (i == 0) {
                getOutputMinFrameDuration(6144);
                return;
            }
            if (i == 1) {
                getOutputMinFrameDuration(4096);
                Camera2StreamConfigurationMap(2048);
            } else {
                if (i != 2) {
                    return;
                }
                getOutputMinFrameDuration(2048);
                Camera2StreamConfigurationMap(4096);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getHighSpeedVideoSizes() {
            java.lang.Object tag = this.getHighSpeedVideoSizes.getDecorView().getTag(356039078);
            if (tag != null) {
                return ((java.lang.Integer) tag).intValue();
            }
            return 1;
        }
    }

    static class Impl23 extends androidx.core.view.WindowInsetsControllerCompat.Impl20 {
        Impl23(android.view.Window window, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return (this.getHighSpeedVideoSizes.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void getHighSpeedVideoSizes(boolean z) {
            if (z) {
                getOutputFormats(67108864);
                getHighSpeedVideoFpsRanges(Integer.MIN_VALUE);
                Camera2StreamConfigurationMap(8192);
                return;
            }
            getOutputMinFrameDuration(8192);
        }
    }

    static class Impl26 extends androidx.core.view.WindowInsetsControllerCompat.Impl23 {
        Impl26(android.view.Window window, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean getHighSpeedVideoFpsRanges() {
            return (this.getHighSpeedVideoSizes.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void getHighSpeedVideoFpsRanges(boolean z) {
            if (z) {
                getOutputFormats(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
                getHighSpeedVideoFpsRanges(Integer.MIN_VALUE);
                Camera2StreamConfigurationMap(16);
                return;
            }
            getOutputMinFrameDuration(16);
        }
    }

    static class Impl30 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        final androidx.core.view.WindowInsetsControllerCompat Camera2StreamConfigurationMap;
        private final androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener, android.view.WindowInsetsController.OnControllableInsetsChangedListener> getHighResolutionOutputSizeshNQ4ISI;
        final androidx.core.view.SoftwareKeyboardControllerCompat getHighSpeedVideoFpsRanges;
        protected android.view.Window getHighSpeedVideoFpsRangesFor;
        final android.view.WindowInsetsController getHighSpeedVideoSizes;

        Impl30(android.view.Window window, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this(window.getInsetsController(), windowInsetsControllerCompat, softwareKeyboardControllerCompat);
            this.getHighSpeedVideoFpsRangesFor = window;
        }

        Impl30(android.view.WindowInsetsController windowInsetsController, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            this.getHighResolutionOutputSizeshNQ4ISI = new androidx.collection.SimpleArrayMap<>();
            this.getHighSpeedVideoSizes = windowInsetsController;
            this.Camera2StreamConfigurationMap = windowInsetsControllerCompat;
            this.getHighSpeedVideoFpsRanges = softwareKeyboardControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoFpsRangesFor(int i) {
            if ((i & 8) != 0) {
                this.getHighSpeedVideoFpsRanges.show();
            }
            this.getHighSpeedVideoSizes.show(i & (-9));
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighResolutionOutputSizeshNQ4ISI(int i) {
            if ((i & 8) != 0) {
                this.getHighSpeedVideoFpsRanges.hide();
            }
            this.getHighSpeedVideoSizes.hide(i & (-9));
        }

        private boolean getHighSpeedVideoSizes(int i, int i2) {
            android.view.Window window = this.getHighSpeedVideoFpsRangesFor;
            if (window != null) {
                return (i & window.getDecorView().getSystemUiVisibility()) != 0;
            }
            this.getHighSpeedVideoSizes.setSystemBarsAppearance(0, 0);
            return (this.getHighSpeedVideoSizes.getSystemBarsAppearance() & i2) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return getHighSpeedVideoSizes(8192, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean getHighSpeedVideoFpsRanges() {
            return getHighSpeedVideoSizes(16, 16);
        }

        private void Camera2StreamConfigurationMap(boolean z, int i, int i2) {
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                if (z) {
                    getHighSpeedVideoFpsRanges(i);
                    return;
                } else {
                    Camera2StreamConfigurationMap(i);
                    return;
                }
            }
            if (z) {
                this.getHighSpeedVideoSizes.setSystemBarsAppearance(i2, i2);
            } else {
                this.getHighSpeedVideoSizes.setSystemBarsAppearance(0, i2);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void getHighSpeedVideoSizes(boolean z) {
            Camera2StreamConfigurationMap(z, 8192, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void getHighSpeedVideoFpsRanges(boolean z) {
            Camera2StreamConfigurationMap(z, 16, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, final androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.getHighSpeedVideoSizes.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new android.view.WindowInsetsAnimationControlListener() { // from class: androidx.core.view.WindowInsetsControllerCompat.Impl30.1
                private androidx.core.view.WindowInsetsAnimationControllerCompat getHighSpeedVideoFpsRangesFor = null;

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onReady(android.view.WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                    androidx.core.view.WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new androidx.core.view.WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                    this.getHighSpeedVideoFpsRangesFor = windowInsetsAnimationControllerCompat;
                    windowInsetsAnimationControlListenerCompat.onReady(windowInsetsAnimationControllerCompat, i2);
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onFinished(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onFinished(this.getHighSpeedVideoFpsRangesFor);
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onCancelled(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onCancelled(windowInsetsAnimationController == null ? null : this.getHighSpeedVideoFpsRangesFor);
                }
            });
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(int i) {
            android.view.Window window = this.getHighSpeedVideoFpsRangesFor;
            if (window != null) {
                window.getDecorView().setTag(356039078, java.lang.Integer.valueOf(i));
                if (i == 0) {
                    Camera2StreamConfigurationMap(6144);
                    return;
                }
                if (i == 1) {
                    Camera2StreamConfigurationMap(4096);
                    getHighSpeedVideoFpsRanges(2048);
                    return;
                } else {
                    if (i != 2) {
                        return;
                    }
                    Camera2StreamConfigurationMap(2048);
                    getHighSpeedVideoFpsRanges(4096);
                    return;
                }
            }
            this.getHighSpeedVideoSizes.setSystemBarsBehavior(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getHighSpeedVideoSizes() {
            android.view.Window window = this.getHighSpeedVideoFpsRangesFor;
            if (window != null) {
                java.lang.Object tag = window.getDecorView().getTag(356039078);
                if (tag != null) {
                    return ((java.lang.Integer) tag).intValue();
                }
                return 1;
            }
            return this.getHighSpeedVideoSizes.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(final androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            if (this.getHighResolutionOutputSizeshNQ4ISI.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            android.view.WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController, int i) {
                    androidx.core.view.WindowInsetsControllerCompat.Impl30.this.cG_(onControllableInsetsChangedListener, windowInsetsController, i);
                }
            };
            this.getHighResolutionOutputSizeshNQ4ISI.put(onControllableInsetsChangedListener, onControllableInsetsChangedListener2);
            this.getHighSpeedVideoSizes.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener2);
        }

        /* synthetic */ void cG_(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener, android.view.WindowInsetsController windowInsetsController, int i) {
            if (this.getHighSpeedVideoSizes == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(this.Camera2StreamConfigurationMap, i);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void Camera2StreamConfigurationMap(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            android.view.WindowInsetsController.OnControllableInsetsChangedListener remove = this.getHighResolutionOutputSizeshNQ4ISI.remove(onControllableInsetsChangedListener);
            if (remove != null) {
                this.getHighSpeedVideoSizes.removeOnControllableInsetsChangedListener(remove);
            }
        }

        protected void Camera2StreamConfigurationMap(int i) {
            android.view.View decorView = this.getHighSpeedVideoFpsRangesFor.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void getHighSpeedVideoFpsRanges(int i) {
            android.view.View decorView = this.getHighSpeedVideoFpsRangesFor.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }

    static class Impl31 extends androidx.core.view.WindowInsetsControllerCompat.Impl30 {
        Impl31(android.view.Window window, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        Impl31(android.view.WindowInsetsController windowInsetsController, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(windowInsetsController, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        void getHighSpeedVideoSizes(int i) {
            this.getHighSpeedVideoSizes.setSystemBarsBehavior(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        int getHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes.getSystemBarsBehavior();
        }
    }

    static class Impl35 extends androidx.core.view.WindowInsetsControllerCompat.Impl31 {
        Impl35(android.view.Window window, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(window, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        Impl35(android.view.WindowInsetsController windowInsetsController, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, androidx.core.view.SoftwareKeyboardControllerCompat softwareKeyboardControllerCompat) {
            super(windowInsetsController, windowInsetsControllerCompat, softwareKeyboardControllerCompat);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean getHighResolutionOutputSizeshNQ4ISI() {
            return (this.getHighSpeedVideoSizes.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean getHighSpeedVideoFpsRanges() {
            return (this.getHighSpeedVideoSizes.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public void getHighSpeedVideoSizes(boolean z) {
            this.getHighSpeedVideoSizes.setSystemBarsAppearance(z ? 8 : 0, 8);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, androidx.core.view.WindowInsetsControllerCompat.Impl
        public void getHighSpeedVideoFpsRanges(boolean z) {
            this.getHighSpeedVideoSizes.setSystemBarsAppearance(z ? 16 : 0, 16);
        }
    }
}
