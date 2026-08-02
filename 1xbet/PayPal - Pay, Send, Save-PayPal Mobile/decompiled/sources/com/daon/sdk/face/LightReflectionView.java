package com.daon.sdk.face;

/* loaded from: classes7.dex */
public class LightReflectionView extends android.view.SurfaceView {
    private com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.Thread getHighSpeedVideoFpsRanges;
    private final android.view.SurfaceHolder getHighSpeedVideoFpsRangesFor;
    private com.daon.research.clrmodule.ClrSequence getHighSpeedVideoSizes;

    public interface LightReflectionViewCallback {
        void onStart();

        void onStop(boolean z);
    }

    public LightReflectionView(android.content.Context context) {
        this(context, null);
    }

    public void init(com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback lightReflectionViewCallback) {
        this.getHighResolutionOutputSizeshNQ4ISI = lightReflectionViewCallback;
    }

    public void start(com.daon.research.clrmodule.ClrSequence clrSequence) {
        if (this.getHighSpeedVideoFpsRanges != null) {
            return;
        }
        this.getHighSpeedVideoSizes = clrSequence;
        java.lang.Thread thread = new java.lang.Thread(new java.lang.Runnable() { // from class: com.daon.sdk.face.LightReflectionView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.daon.sdk.face.LightReflectionView.$r8$lambda$Pp50PkjhyeDMcFKeIMjvAZ_7764(com.daon.sdk.face.LightReflectionView.this);
            }
        });
        this.getHighSpeedVideoFpsRanges = thread;
        thread.start();
    }

    public void stop() {
        java.lang.Thread thread = this.getHighSpeedVideoFpsRanges;
        if (thread != null) {
            try {
                try {
                    thread.interrupt();
                    this.getHighSpeedVideoFpsRanges.join();
                } catch (java.lang.Exception e) {
                    e.getLocalizedMessage();
                }
            } finally {
                this.getHighSpeedVideoFpsRanges = null;
            }
        }
    }

    public LightReflectionView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        setZOrderOnTop(true);
        android.view.SurfaceHolder holder = getHolder();
        this.getHighSpeedVideoFpsRangesFor = holder;
        holder.setFormat(-2);
    }

    private void Camera2StreamConfigurationMap() {
        android.graphics.Canvas lockCanvas = this.getHighSpeedVideoFpsRangesFor.lockCanvas();
        if (lockCanvas != null) {
            lockCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
            lockCanvas.drawColor(0);
            this.getHighSpeedVideoFpsRangesFor.unlockCanvasAndPost(lockCanvas);
        }
    }

    public static /* synthetic */ void $r8$lambda$Pp50PkjhyeDMcFKeIMjvAZ_7764(com.daon.sdk.face.LightReflectionView lightReflectionView) {
        com.daon.research.clrmodule.ClrSequence clrSequence;
        if (!lightReflectionView.getHighSpeedVideoFpsRangesFor.getSurface().isValid() || (clrSequence = lightReflectionView.getHighSpeedVideoSizes) == null) {
            return;
        }
        int flashDuration = clrSequence.getFlashDuration();
        int[] sequenceAsHex = lightReflectionView.getHighSpeedVideoSizes.getSequenceAsHex();
        try {
            java.lang.Thread.sleep(flashDuration / 2);
            com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback lightReflectionViewCallback = lightReflectionView.getHighResolutionOutputSizeshNQ4ISI;
            if (lightReflectionViewCallback != null) {
                lightReflectionViewCallback.onStart();
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            for (int i : sequenceAsHex) {
                android.graphics.Canvas lockCanvas = lightReflectionView.getHighSpeedVideoFpsRangesFor.lockCanvas();
                if (lockCanvas != null) {
                    lockCanvas.drawColor(i);
                    lightReflectionView.getHighSpeedVideoFpsRangesFor.unlockCanvasAndPost(lockCanvas);
                }
                currentTimeMillis += flashDuration;
                java.lang.Thread.sleep(currentTimeMillis - java.lang.System.currentTimeMillis());
            }
            java.lang.Thread.sleep(flashDuration / 2);
            lightReflectionView.Camera2StreamConfigurationMap();
            com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback lightReflectionViewCallback2 = lightReflectionView.getHighResolutionOutputSizeshNQ4ISI;
            if (lightReflectionViewCallback2 != null) {
                lightReflectionViewCallback2.onStop(false);
            }
        } catch (java.lang.Exception unused) {
            lightReflectionView.Camera2StreamConfigurationMap();
            com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback lightReflectionViewCallback3 = lightReflectionView.getHighResolutionOutputSizeshNQ4ISI;
            if (lightReflectionViewCallback3 != null) {
                lightReflectionViewCallback3.onStop(true);
            }
        } catch (java.lang.Throwable th) {
            lightReflectionView.Camera2StreamConfigurationMap();
            com.daon.sdk.face.LightReflectionView.LightReflectionViewCallback lightReflectionViewCallback4 = lightReflectionView.getHighResolutionOutputSizeshNQ4ISI;
            if (lightReflectionViewCallback4 != null) {
                lightReflectionViewCallback4.onStop(false);
            }
            throw th;
        }
    }
}
