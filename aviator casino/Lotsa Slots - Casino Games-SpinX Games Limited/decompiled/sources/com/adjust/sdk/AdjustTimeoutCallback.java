package com.adjust.sdk;

/* loaded from: classes2.dex */
public class AdjustTimeoutCallback {
    private com.adjust.sdk.OnAdidReadListener onAdidReadListener;
    private com.adjust.sdk.OnAttributionReadListener onAttributionReadListener;
    private com.adjust.sdk.scheduler.TimerOnce timeoutTimer;

    public AdjustTimeoutCallback(com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        this.onAdidReadListener = onAdidReadListener;
    }

    public com.adjust.sdk.OnAdidReadListener getOnAdidReadListener() {
        return this.onAdidReadListener;
    }

    public com.adjust.sdk.OnAttributionReadListener getOnAttributionReadListener() {
        return this.onAttributionReadListener;
    }

    public com.adjust.sdk.scheduler.TimerOnce getTimeoutTimer() {
        return this.timeoutTimer;
    }

    public void setOnAdidReadListener(com.adjust.sdk.OnAdidReadListener onAdidReadListener) {
        this.onAdidReadListener = onAdidReadListener;
    }

    public void setOnAttributionReadListener(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        this.onAttributionReadListener = onAttributionReadListener;
    }

    public void setTimer(com.adjust.sdk.scheduler.TimerOnce timerOnce) {
        this.timeoutTimer = timerOnce;
    }

    public AdjustTimeoutCallback(com.adjust.sdk.OnAttributionReadListener onAttributionReadListener) {
        this.onAttributionReadListener = onAttributionReadListener;
    }
}
