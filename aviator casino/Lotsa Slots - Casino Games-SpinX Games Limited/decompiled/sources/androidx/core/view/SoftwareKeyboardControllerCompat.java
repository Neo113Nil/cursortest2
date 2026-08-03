package androidx.core.view;

/* loaded from: classes.dex */
public final class SoftwareKeyboardControllerCompat {
    private final androidx.core.view.SoftwareKeyboardControllerCompat.Impl mImpl;

    public SoftwareKeyboardControllerCompat(android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new androidx.core.view.SoftwareKeyboardControllerCompat.Impl30(view);
        } else {
            this.mImpl = new androidx.core.view.SoftwareKeyboardControllerCompat.Impl20(view);
        }
    }

    @java.lang.Deprecated
    SoftwareKeyboardControllerCompat(android.view.WindowInsetsController windowInsetsController) {
        this.mImpl = new androidx.core.view.SoftwareKeyboardControllerCompat.Impl30(windowInsetsController);
    }

    public void show() {
        this.mImpl.show();
    }

    public void hide() {
        this.mImpl.hide();
    }

    private static class Impl {
        void hide() {
        }

        void show() {
        }

        Impl() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Impl20 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl {
        private final android.view.View mView;

        Impl20(android.view.View view) {
            this.mView = view;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
            final android.view.View view = this.mView;
            if (view == null) {
                return;
            }
            if (view.isInEditMode() || view.onCheckIsTextEditor()) {
                view.requestFocus();
            } else {
                view = view.getRootView().findFocus();
            }
            if (view == null) {
                view = this.mView.getRootView().findViewById(android.R.id.content);
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

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
            android.view.View view = this.mView;
            if (view != null) {
                ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Impl30 extends androidx.core.view.SoftwareKeyboardControllerCompat.Impl20 {
        private android.view.View mView;
        private android.view.WindowInsetsController mWindowInsetsController;

        Impl30(android.view.View view) {
            super(view);
            this.mView = view;
        }

        Impl30(android.view.WindowInsetsController windowInsetsController) {
            super(null);
            this.mWindowInsetsController = windowInsetsController;
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void show() {
            if (this.mView != null && android.os.Build.VERSION.SDK_INT < 33) {
                ((android.view.inputmethod.InputMethodManager) this.mView.getContext().getSystemService("input_method")).isActive();
            }
            android.view.WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                android.view.View view = this.mView;
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(android.view.WindowInsets.Type.ime());
            }
            super.show();
        }

        @Override // androidx.core.view.SoftwareKeyboardControllerCompat.Impl20, androidx.core.view.SoftwareKeyboardControllerCompat.Impl
        void hide() {
            android.view.View view;
            android.view.WindowInsetsController windowInsetsController = this.mWindowInsetsController;
            if (windowInsetsController == null) {
                android.view.View view2 = this.mView;
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
                if (!atomicBoolean.get() && (view = this.mView) != null) {
                    ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mView.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                windowInsetsController.hide(android.view.WindowInsets.Type.ime());
                return;
            }
            super.hide();
        }
    }
}
