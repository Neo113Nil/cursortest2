package com.google.android.material.motion;

/* loaded from: classes8.dex */
public final class MaterialBackOrchestrator {
    private final com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate backCallbackDelegate;
    private final com.google.android.material.motion.MaterialBackHandler backHandler;
    private final android.view.View view;

    interface BackCallbackDelegate {
        void startListeningForBackCallbacks(com.google.android.material.motion.MaterialBackHandler materialBackHandler, android.view.View view, boolean z);

        void stopListeningForBackCallbacks(android.view.View view);
    }

    public <T extends android.view.View & com.google.android.material.motion.MaterialBackHandler> MaterialBackOrchestrator(T t) {
        this(t, t);
    }

    public MaterialBackOrchestrator(com.google.android.material.motion.MaterialBackHandler materialBackHandler, android.view.View view) {
        this.backCallbackDelegate = createBackCallbackDelegate();
        this.backHandler = materialBackHandler;
        this.view = view;
    }

    public final boolean shouldListenForBackCallbacks() {
        return this.backCallbackDelegate != null;
    }

    public final void startListeningForBackCallbacksWithPriorityOverlay() {
        startListeningForBackCallbacks(true);
    }

    public final void startListeningForBackCallbacks() {
        startListeningForBackCallbacks(false);
    }

    private void startListeningForBackCallbacks(boolean z) {
        com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.startListeningForBackCallbacks(this.backHandler, this.view, z);
        }
    }

    public final void stopListeningForBackCallbacks() {
        com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate backCallbackDelegate = this.backCallbackDelegate;
        if (backCallbackDelegate != null) {
            backCallbackDelegate.stopListeningForBackCallbacks(this.view);
        }
    }

    private static com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate createBackCallbackDelegate() {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return new com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate();
        }
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            return new com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate();
        }
        return null;
    }

    static class Api34BackCallbackDelegate extends com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate {
        private Api34BackCallbackDelegate() {
            super();
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.Api33BackCallbackDelegate
        android.window.OnBackInvokedCallback createOnBackInvokedCallback(final com.google.android.material.motion.MaterialBackHandler materialBackHandler) {
            return new android.window.OnBackAnimationCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.1
                @Override // android.window.OnBackAnimationCallback
                public void onBackStarted(android.window.BackEvent backEvent) {
                    if (com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.startBackProgress(new androidx.view.BackEventCompat(backEvent));
                    }
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackProgressed(android.window.BackEvent backEvent) {
                    if (com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.updateBackProgress(new androidx.view.BackEventCompat(backEvent));
                    }
                }

                @Override // android.window.OnBackInvokedCallback
                public void onBackInvoked() {
                    materialBackHandler.handleBackInvoked();
                }

                @Override // android.window.OnBackAnimationCallback
                public void onBackCancelled() {
                    if (com.google.android.material.motion.MaterialBackOrchestrator.Api34BackCallbackDelegate.this.isListeningForBackCallbacks()) {
                        materialBackHandler.cancelBackProgress();
                    }
                }
            };
        }
    }

    static class Api33BackCallbackDelegate implements com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate {
        private android.window.OnBackInvokedCallback onBackInvokedCallback;

        private Api33BackCallbackDelegate() {
        }

        boolean isListeningForBackCallbacks() {
            return this.onBackInvokedCallback != null;
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void startListeningForBackCallbacks(com.google.android.material.motion.MaterialBackHandler materialBackHandler, android.view.View view, boolean z) {
            android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (this.onBackInvokedCallback != null || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            android.window.OnBackInvokedCallback createOnBackInvokedCallback = createOnBackInvokedCallback(materialBackHandler);
            this.onBackInvokedCallback = createOnBackInvokedCallback;
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(z ? 1000000 : 0, createOnBackInvokedCallback);
        }

        @Override // com.google.android.material.motion.MaterialBackOrchestrator.BackCallbackDelegate
        public void stopListeningForBackCallbacks(android.view.View view) {
            android.window.OnBackInvokedDispatcher findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher();
            if (findOnBackInvokedDispatcher == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.onBackInvokedCallback);
            this.onBackInvokedCallback = null;
        }

        android.window.OnBackInvokedCallback createOnBackInvokedCallback(final com.google.android.material.motion.MaterialBackHandler materialBackHandler) {
            java.util.Objects.requireNonNull(materialBackHandler);
            return new android.window.OnBackInvokedCallback() { // from class: com.google.android.material.motion.MaterialBackOrchestrator$Api33BackCallbackDelegate$$ExternalSyntheticLambda0
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    com.google.android.material.motion.MaterialBackHandler.this.handleBackInvoked();
                }
            };
        }
    }
}
