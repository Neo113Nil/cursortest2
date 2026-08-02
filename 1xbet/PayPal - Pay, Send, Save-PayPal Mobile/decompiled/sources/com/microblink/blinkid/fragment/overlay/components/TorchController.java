package com.microblink.blinkid.fragment.overlay.components;

/* loaded from: classes10.dex */
public class TorchController {
    private android.graphics.drawable.Drawable Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private com.microblink.blinkid.view.recognition.RecognizerRunnerView getHighSpeedVideoFpsRanges;
    private android.graphics.drawable.Drawable getHighSpeedVideoFpsRangesFor;
    private com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener getHighSpeedVideoSizes;
    private android.widget.ImageView getInputSizeshNQ4ISI;

    /* renamed from: com.microblink.blinkid.fragment.overlay.components.TorchController$2, reason: invalid class name */
    class AnonymousClass2 implements android.view.View.OnClickListener {
        AnonymousClass2() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            com.microblink.blinkid.fragment.overlay.components.TorchController.this.updateTorchState(!r2.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    /* renamed from: com.microblink.blinkid.fragment.overlay.components.TorchController$3, reason: invalid class name */
    class AnonymousClass3 implements java.lang.Runnable {
        AnonymousClass3() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.microblink.blinkid.fragment.overlay.components.TorchController.this.getHighResolutionOutputSizeshNQ4ISI) {
                com.microblink.blinkid.fragment.overlay.components.TorchController.this.getInputSizeshNQ4ISI.setImageDrawable(com.microblink.blinkid.fragment.overlay.components.TorchController.this.Camera2StreamConfigurationMap);
            } else {
                com.microblink.blinkid.fragment.overlay.components.TorchController.this.getInputSizeshNQ4ISI.setImageDrawable(com.microblink.blinkid.fragment.overlay.components.TorchController.this.getHighSpeedVideoFpsRangesFor);
            }
            com.microblink.blinkid.fragment.overlay.components.TorchController.this.getInputSizeshNQ4ISI.requestLayout();
        }
    }

    static void Camera2StreamConfigurationMap(com.microblink.blinkid.fragment.overlay.components.TorchController torchController) {
        android.widget.ImageView imageView = torchController.getInputSizeshNQ4ISI;
        if (imageView == null) {
            return;
        }
        imageView.post(torchController.new AnonymousClass3());
    }

    public void onTorchSupportStatusAvailable() {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getHighSpeedVideoFpsRanges;
        if (recognizerRunnerView != null) {
            boolean z = this.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighResolutionOutputSizeshNQ4ISI = false;
            boolean isCameraTorchSupported = recognizerRunnerView.isCameraTorchSupported();
            android.widget.ImageView imageView = this.getInputSizeshNQ4ISI;
            if (imageView != null) {
                if (isCameraTorchSupported) {
                    imageView.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
            if (isCameraTorchSupported) {
                android.widget.ImageView imageView2 = this.getInputSizeshNQ4ISI;
                if (imageView2 != null) {
                    imageView2.setOnClickListener(new com.microblink.blinkid.fragment.overlay.components.TorchController.AnonymousClass2());
                }
                android.widget.ImageView imageView3 = this.getInputSizeshNQ4ISI;
                if (imageView3 != null) {
                    imageView3.post(new com.microblink.blinkid.fragment.overlay.components.TorchController.AnonymousClass3());
                }
            }
            com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener overlayTorchStateListener = this.getHighSpeedVideoSizes;
            if (overlayTorchStateListener != null) {
                overlayTorchStateListener.onTorchStateInitialised(isCameraTorchSupported);
                if (z) {
                    this.getHighSpeedVideoSizes.onTorchStateChanged(this.getHighResolutionOutputSizeshNQ4ISI);
                }
            }
        }
    }

    public void setTorchStateListener(com.microblink.blinkid.fragment.overlay.verification.OverlayTorchStateListener overlayTorchStateListener) {
        this.getHighSpeedVideoSizes = overlayTorchStateListener;
    }

    public void setup(com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        setup(null, recognizerRunnerView);
    }

    public void toggleTorchState() {
        updateTorchState(!this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public void updateTorchState(final boolean z) {
        com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView = this.getHighSpeedVideoFpsRanges;
        if (recognizerRunnerView == null) {
            return;
        }
        recognizerRunnerView.setTorchState(z, new com.microblink.blinkid.hardware.SuccessCallback() { // from class: com.microblink.blinkid.fragment.overlay.components.TorchController.1
            @Override // com.microblink.blinkid.hardware.SuccessCallback
            public void onOperationDone(boolean z2) {
                com.microblink.blinkid.util.Log.d(this, "Setting torch to {}. Success: {}", java.lang.Boolean.valueOf(z), java.lang.Boolean.valueOf(z2));
                if (z2) {
                    com.microblink.blinkid.fragment.overlay.components.TorchController.this.getHighResolutionOutputSizeshNQ4ISI = z;
                    com.microblink.blinkid.fragment.overlay.components.TorchController.Camera2StreamConfigurationMap(com.microblink.blinkid.fragment.overlay.components.TorchController.this);
                    if (com.microblink.blinkid.fragment.overlay.components.TorchController.this.getHighSpeedVideoSizes != null) {
                        com.microblink.blinkid.fragment.overlay.components.TorchController.this.getHighSpeedVideoSizes.onTorchStateChanged(com.microblink.blinkid.fragment.overlay.components.TorchController.this.getHighResolutionOutputSizeshNQ4ISI);
                    }
                }
            }
        });
    }

    public void setup(android.widget.ImageView imageView, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView) {
        if (imageView == null) {
            setup(null, recognizerRunnerView, null, null);
        } else {
            android.content.Context context = imageView.getContext();
            setup(imageView, recognizerRunnerView, androidx.core.content.ContextCompat.getDrawable(context, com.microblink.blinkid.library.R.drawable.mb_ic_flash_off), androidx.core.content.ContextCompat.getDrawable(context, com.microblink.blinkid.library.R.drawable.mb_ic_flash_on));
        }
    }

    public void setup(android.widget.ImageView imageView, com.microblink.blinkid.view.recognition.RecognizerRunnerView recognizerRunnerView, android.graphics.drawable.Drawable drawable, android.graphics.drawable.Drawable drawable2) {
        if (recognizerRunnerView != null) {
            this.getInputSizeshNQ4ISI = imageView;
            this.getHighSpeedVideoFpsRanges = recognizerRunnerView;
            this.getHighSpeedVideoFpsRangesFor = drawable;
            this.Camera2StreamConfigurationMap = drawable2;
            boolean isCameraTorchSupported = recognizerRunnerView.isCameraTorchSupported();
            android.widget.ImageView imageView2 = this.getInputSizeshNQ4ISI;
            if (imageView2 != null) {
                if (isCameraTorchSupported) {
                    imageView2.setVisibility(0);
                } else {
                    imageView2.setVisibility(8);
                }
            }
            if (isCameraTorchSupported) {
                android.widget.ImageView imageView3 = this.getInputSizeshNQ4ISI;
                if (imageView3 != null) {
                    imageView3.setOnClickListener(new com.microblink.blinkid.fragment.overlay.components.TorchController.AnonymousClass2());
                }
            } else {
                this.getHighResolutionOutputSizeshNQ4ISI = false;
            }
            android.widget.ImageView imageView4 = this.getInputSizeshNQ4ISI;
            if (imageView4 == null) {
                return;
            }
            imageView4.post(new com.microblink.blinkid.fragment.overlay.components.TorchController.AnonymousClass3());
        }
    }
}
