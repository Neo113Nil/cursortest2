package com.microblink.blinkid.fragment.overlay.components.statusmsg;

/* loaded from: classes10.dex */
public class StatusTextManager {
    private boolean Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI;
    private java.lang.CharSequence getHighSpeedVideoFpsRanges;
    private java.lang.CharSequence getHighSpeedVideoFpsRangesFor;
    private final java.lang.Runnable getHighSpeedVideoSizes;
    private boolean getHighSpeedVideoSizesFor;
    private final java.util.concurrent.atomic.AtomicBoolean getInputFormats;
    private final android.os.Handler getInputSizeshNQ4ISI;
    private final android.view.animation.Animation getOutputFormats;
    private final android.widget.TextSwitcher getOutputMinFrameDuration;
    private final android.view.animation.Animation getOutputSizes;

    public StatusTextManager(android.widget.TextSwitcher textSwitcher, final com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler statusTextStyler, int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = null;
        this.getHighSpeedVideoFpsRanges = null;
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getHighResolutionOutputSizeshNQ4ISI = true;
        this.getInputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
        this.getHighSpeedVideoSizesFor = false;
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoSizes = new java.lang.Runnable() { // from class: com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager.$r8$lambda$eYSiqLbihwsy583CD4p07aQ1ReI(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager.this);
            }
        };
        this.getOutputMinFrameDuration = textSwitcher;
        final android.content.Context context = textSwitcher.getContext();
        textSwitcher.setFactory(new android.widget.ViewSwitcher.ViewFactory() { // from class: com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager.1
            @Override // android.widget.ViewSwitcher.ViewFactory
            public android.view.View makeView() {
                android.widget.TextView textView = new android.widget.TextView(context);
                textView.setGravity(17);
                statusTextStyler.applyStyle(textView);
                return textView;
            }
        });
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, i);
        this.getOutputSizes = loadAnimation;
        android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, i2);
        this.getOutputFormats = loadAnimation2;
        if (this.Camera2StreamConfigurationMap) {
            return;
        }
        loadAnimation2.setStartOffset(loadAnimation.getDuration() + 150);
    }

    private void getHighSpeedVideoFpsRanges(java.lang.CharSequence charSequence, boolean z) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            java.lang.CharSequence charSequence2 = this.getHighSpeedVideoFpsRangesFor;
            if (charSequence2 == null) {
                z = true;
            }
            this.getHighSpeedVideoFpsRanges = charSequence;
            if (z) {
                this.getInputSizeshNQ4ISI.removeCallbacks(this.getHighSpeedVideoSizes);
                this.getInputSizeshNQ4ISI.post(this.getHighSpeedVideoSizes);
            } else {
                if (charSequence.equals(charSequence2) || !this.getInputFormats.compareAndSet(false, true)) {
                    return;
                }
                this.getInputSizeshNQ4ISI.postDelayed(this.getHighSpeedVideoSizes, 1500L);
            }
        }
    }

    public void setShouldAnimate(boolean z) {
        this.getHighSpeedVideoSizesFor = z;
        if (z) {
            this.getOutputMinFrameDuration.setInAnimation(this.getOutputFormats);
            this.getOutputMinFrameDuration.setOutAnimation(this.getOutputSizes);
        } else {
            this.getOutputMinFrameDuration.setInAnimation(null);
            this.getOutputMinFrameDuration.setOutAnimation(null);
        }
    }

    public void setSimultaneouslyStartAnimations(boolean z) {
        this.Camera2StreamConfigurationMap = z;
        if (z) {
            this.getOutputFormats.setStartOffset(0L);
        } else {
            this.getOutputFormats.setStartOffset(this.getOutputSizes.getDuration() + 150);
        }
    }

    public void setStatusMessagesEnabled(boolean z) {
        this.getHighResolutionOutputSizeshNQ4ISI = z;
        if (z) {
            this.getOutputMinFrameDuration.setVisibility(0);
        } else {
            this.getOutputMinFrameDuration.setVisibility(4);
        }
    }

    public boolean shouldAnimate() {
        return this.getHighSpeedVideoSizesFor;
    }

    public void updateStatus(int i) {
        if (i == 0) {
            updateStatus("");
        } else {
            updateStatus(this.getOutputMinFrameDuration.getContext().getString(i));
        }
    }

    public void updateStatusImmediately(int i) {
        if (i == 0) {
            updateStatusImmediately("");
        } else {
            updateStatusImmediately(this.getOutputMinFrameDuration.getContext().getString(i));
        }
    }

    public void updateStatus(java.lang.String str) {
        getHighSpeedVideoFpsRanges(str, false);
    }

    public void updateStatusImmediately(java.lang.CharSequence charSequence) {
        getHighSpeedVideoFpsRanges(charSequence, true);
    }

    public StatusTextManager(android.widget.TextSwitcher textSwitcher, com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextStyler statusTextStyler) {
        this(textSwitcher, statusTextStyler, com.microblink.blinkid.library.R.anim.mb_hide_text, com.microblink.blinkid.library.R.anim.mb_show_text);
    }

    public static /* synthetic */ void $r8$lambda$eYSiqLbihwsy583CD4p07aQ1ReI(com.microblink.blinkid.fragment.overlay.components.statusmsg.StatusTextManager statusTextManager) {
        if (!statusTextManager.getHighSpeedVideoFpsRanges.equals(statusTextManager.getHighSpeedVideoFpsRangesFor)) {
            if (statusTextManager.getHighSpeedVideoFpsRangesFor != null) {
                statusTextManager.getOutputMinFrameDuration.setText(statusTextManager.getHighSpeedVideoFpsRanges);
            } else {
                statusTextManager.getOutputMinFrameDuration.setCurrentText(statusTextManager.getHighSpeedVideoFpsRanges);
            }
            statusTextManager.getHighSpeedVideoFpsRangesFor = statusTextManager.getHighSpeedVideoFpsRanges;
        }
        statusTextManager.getInputFormats.set(false);
        if (android.text.TextUtils.isEmpty(statusTextManager.getHighSpeedVideoFpsRangesFor)) {
            statusTextManager.getOutputMinFrameDuration.setVisibility(4);
            return;
        }
        statusTextManager.getOutputMinFrameDuration.setVisibility(0);
        if (statusTextManager.getOutputMinFrameDuration.getCurrentView().isAccessibilityFocused()) {
            return;
        }
        statusTextManager.getOutputMinFrameDuration.getCurrentView().sendAccessibilityEvent(32768);
    }
}
