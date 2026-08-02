package androidx.dynamicanimation.animation;

/* loaded from: classes3.dex */
class AnimationHandler {
    public static final java.lang.ThreadLocal<androidx.dynamicanimation.animation.AnimationHandler> getHighSpeedVideoSizes = new java.lang.ThreadLocal<>();
    androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider getInputFormats;
    final androidx.collection.SimpleArrayMap<androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback, java.lang.Long> Camera2StreamConfigurationMap = new androidx.collection.SimpleArrayMap<>();
    final java.util.ArrayList<androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback> getHighSpeedVideoFpsRanges = new java.util.ArrayList<>();
    final androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher getHighResolutionOutputSizeshNQ4ISI = new androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher();
    long getHighSpeedVideoFpsRangesFor = 0;
    boolean getHighSpeedVideoSizesFor = false;

    interface AnimationFrameCallback {
        boolean doAnimationFrame(long j);
    }

    AnimationHandler() {
    }

    class AnimationCallbackDispatcher {
        AnimationCallbackDispatcher() {
        }

        final void getHighSpeedVideoFpsRanges() {
            androidx.dynamicanimation.animation.AnimationHandler.this.getHighSpeedVideoFpsRangesFor = android.os.SystemClock.uptimeMillis();
            androidx.dynamicanimation.animation.AnimationHandler animationHandler = androidx.dynamicanimation.animation.AnimationHandler.this;
            long j = animationHandler.getHighSpeedVideoFpsRangesFor;
            long uptimeMillis = android.os.SystemClock.uptimeMillis();
            for (int i = 0; i < animationHandler.getHighSpeedVideoFpsRanges.size(); i++) {
                androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallback animationFrameCallback = animationHandler.getHighSpeedVideoFpsRanges.get(i);
                if (animationFrameCallback != null) {
                    java.lang.Long l = animationHandler.Camera2StreamConfigurationMap.get(animationFrameCallback);
                    if (l != null) {
                        if (l.longValue() < uptimeMillis) {
                            animationHandler.Camera2StreamConfigurationMap.remove(animationFrameCallback);
                        }
                    }
                    animationFrameCallback.doAnimationFrame(j);
                }
            }
            if (animationHandler.getHighSpeedVideoSizesFor) {
                for (int size = animationHandler.getHighSpeedVideoFpsRanges.size() - 1; size >= 0; size--) {
                    if (animationHandler.getHighSpeedVideoFpsRanges.get(size) == null) {
                        animationHandler.getHighSpeedVideoFpsRanges.remove(size);
                    }
                }
                animationHandler.getHighSpeedVideoSizesFor = false;
            }
            if (androidx.dynamicanimation.animation.AnimationHandler.this.getHighSpeedVideoFpsRanges.size() > 0) {
                androidx.dynamicanimation.animation.AnimationHandler animationHandler2 = androidx.dynamicanimation.animation.AnimationHandler.this;
                if (animationHandler2.getInputFormats == null) {
                    animationHandler2.getInputFormats = new androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16(animationHandler2.getHighResolutionOutputSizeshNQ4ISI);
                }
                animationHandler2.getInputFormats.getHighSpeedVideoFpsRangesFor();
            }
        }
    }

    public static androidx.dynamicanimation.animation.AnimationHandler getHighSpeedVideoFpsRanges() {
        java.lang.ThreadLocal<androidx.dynamicanimation.animation.AnimationHandler> threadLocal = getHighSpeedVideoSizes;
        if (threadLocal.get() == null) {
            threadLocal.set(new androidx.dynamicanimation.animation.AnimationHandler());
        }
        return threadLocal.get();
    }

    static class FrameCallbackProvider16 extends androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider {
        private final android.view.Choreographer getHighResolutionOutputSizeshNQ4ISI;
        private final android.view.Choreographer.FrameCallback getHighSpeedVideoFpsRangesFor;

        FrameCallbackProvider16(androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher animationCallbackDispatcher) {
            super(animationCallbackDispatcher);
            this.getHighResolutionOutputSizeshNQ4ISI = android.view.Choreographer.getInstance();
            this.getHighSpeedVideoFpsRangesFor = new android.view.Choreographer.FrameCallback() { // from class: androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.1
                @Override // android.view.Choreographer.FrameCallback
                public void doFrame(long j) {
                    androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider16.this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
                }
            };
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighResolutionOutputSizeshNQ4ISI.postFrameCallback(this.getHighSpeedVideoFpsRangesFor);
        }
    }

    /* loaded from: classes7.dex */
    static class FrameCallbackProvider14 extends androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider {
        private final java.lang.Runnable getHighResolutionOutputSizeshNQ4ISI;
        private final android.os.Handler getHighSpeedVideoFpsRanges;
        long getHighSpeedVideoSizes;

        /* renamed from: androidx.dynamicanimation.animation.AnimationHandler$FrameCallbackProvider14$1, reason: invalid class name */
        class AnonymousClass1 implements java.lang.Runnable {
            final /* synthetic */ androidx.dynamicanimation.animation.AnimationHandler.FrameCallbackProvider14 Camera2StreamConfigurationMap;

            @Override // java.lang.Runnable
            public void run() {
                this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes = android.os.SystemClock.uptimeMillis();
                this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges();
            }
        }

        @Override // androidx.dynamicanimation.animation.AnimationHandler.AnimationFrameCallbackProvider
        final void getHighSpeedVideoFpsRangesFor() {
            this.getHighSpeedVideoFpsRanges.postDelayed(this.getHighResolutionOutputSizeshNQ4ISI, java.lang.Math.max(10 - (android.os.SystemClock.uptimeMillis() - this.getHighSpeedVideoSizes), 0L));
        }
    }

    static abstract class AnimationFrameCallbackProvider {
        final androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher Camera2StreamConfigurationMap;

        abstract void getHighSpeedVideoFpsRangesFor();

        AnimationFrameCallbackProvider(androidx.dynamicanimation.animation.AnimationHandler.AnimationCallbackDispatcher animationCallbackDispatcher) {
            this.Camera2StreamConfigurationMap = animationCallbackDispatcher;
        }
    }
}
