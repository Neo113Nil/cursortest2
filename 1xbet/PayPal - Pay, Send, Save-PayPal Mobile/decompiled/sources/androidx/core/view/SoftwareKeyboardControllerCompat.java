package androidx.core.view;

/* loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {
    private final androidx.core.view.SoftwareKeyboardControllerCompat.Impl getHighSpeedVideoFpsRanges;

    public SoftwareKeyboardControllerCompat(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.getHighSpeedVideoFpsRanges = new androidx.core.view.SoftwareKeyboardControllerCompat.Impl30(view);
        } else {
            this.getHighSpeedVideoFpsRanges = new androidx.core.view.SoftwareKeyboardControllerCompat.Impl20(view);
        }
    }

    @java.lang.Deprecated
    SoftwareKeyboardControllerCompat(android.view.WindowInsetsController windowInsetsController) {
        this.getHighSpeedVideoFpsRanges = new androidx.core.view.SoftwareKeyboardControllerCompat.Impl30(windowInsetsController);
    }

    public final void show() {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoFpsRangesFor();
    }

    public final void hide() {
        this.getHighSpeedVideoFpsRanges.getHighSpeedVideoSizes();
    }

    /* loaded from: classes7.dex */
    static class Impl {
        void getHighSpeedVideoFpsRangesFor() {
        }

        void getHighSpeedVideoSizes() {
        }

        Impl() {
        }
    }

    /* loaded from: classes7.dex */
    static class Impl20 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl {
        private final android.view.View getHighSpeedVideoSizes;

        Impl20(android.view.View view) {
            this.getHighSpeedVideoSizes = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void getHighSpeedVideoFpsRangesFor() {
            final android.view.View view = this.getHighSpeedVideoSizes;
            if (view != null) {
                if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                    view.requestFocus();
                } else {
                    view = view.getRootView().findFocus();
                }
                if (view == null) {
                    view = this.getHighSpeedVideoSizes.getRootView().findViewById(android.R.id.content);
                }
                if (view == null || !view.hasWindowFocus()) {
                    return;
                }
                view.post(new java.lang.Runnable() { // from class: androidx.core.view.SoftwareKeyboardControllerCompat$Impl20$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((android.view.inputmethod.InputMethodManager) r0.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                    }
                });
            }
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void getHighSpeedVideoSizes() {
            android.view.View view = this.getHighSpeedVideoSizes;
            if (view != null) {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.getHighSpeedVideoSizes.getWindowToken(), 0);
            }
        }
    }

    /* loaded from: classes7.dex */
    static class Impl30 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl20 {
        private android.view.View getHighSpeedVideoFpsRanges;
        private android.view.WindowInsetsController getHighSpeedVideoFpsRangesFor;

        Impl30(android.view.View view) {
            super(view);
            this.getHighSpeedVideoFpsRanges = view;
        }

        Impl30(android.view.WindowInsetsController windowInsetsController) {
            super(null);
            this.getHighSpeedVideoFpsRangesFor = windowInsetsController;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void getHighSpeedVideoFpsRangesFor() {
            if (this.getHighSpeedVideoFpsRanges != null && android.os.Build.VERSION.SDK_INT < 33) {
                ((android.view.inputmethod.InputMethodManager) this.getHighSpeedVideoFpsRanges.getContext().getSystemService("input_method")).isActive();
            }
            android.view.WindowInsetsController windowInsetsController = this.getHighSpeedVideoFpsRangesFor;
            if (windowInsetsController == null) {
                android.view.View view = this.getHighSpeedVideoFpsRanges;
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(android.view.WindowInsets.Type.ime());
            }
            super.getHighSpeedVideoFpsRangesFor();
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void getHighSpeedVideoSizes() {
            android.view.View view;
            android.view.WindowInsetsController windowInsetsController = this.getHighSpeedVideoFpsRangesFor;
            if (windowInsetsController == null) {
                android.view.View view2 = this.getHighSpeedVideoFpsRanges;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final java.util.concurrent.atomic.AtomicBoolean atomicBoolean = new java.util.concurrent.atomic.AtomicBoolean(false);
                android.view.WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.SoftwareKeyboardControllerCompat$Impl30$$ExternalSyntheticLambda0
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController2, int i) {
                        atomicBoolean.set((r2 & 8) != 0);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.getHighSpeedVideoFpsRanges) != null) {
                    ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.getHighSpeedVideoFpsRanges.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                windowInsetsController.hide(android.view.WindowInsets.Type.ime());
                return;
            }
            super.getHighSpeedVideoSizes();
        }
    }
}
