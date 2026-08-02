package com.paypal.oslo.core.appidentity.data;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/core/appidentity/data/RotatingSessionLifecycleListener;", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener;", "", "sessionTag", "", "inactivityThresholdMs", "Lcom/paypal/oslo/core/appidentity/data/SessionEditor;", "sessionEditor", "Lcom/paypal/oslo/core/appidentity/data/SessionReader;", "sessionReader", "<init>", "(Ljava/lang/String;JLcom/paypal/oslo/core/appidentity/data/SessionEditor;Lcom/paypal/oslo/core/appidentity/data/SessionReader;)V", "Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;", "event", "", "onStart", "(Lcom/paypal/oslo/core/appidentity/data/SessionLifecycleListener$StartEvent;)V", "Camera2StreamConfigurationMap", "Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "J", "getInactivityThresholdMs", "()J", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/appidentity/data/SessionEditor;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/appidentity/data/SessionReader;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RotatingSessionLifecycleListener implements com.paypal.oslo.core.appidentity.data.SessionLifecycleListener {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.data.SessionReader getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.data.SessionEditor getHighSpeedVideoFpsRangesFor;
    private final long inactivityThresholdMs;

    public RotatingSessionLifecycleListener(java.lang.String str, long j, com.paypal.oslo.core.appidentity.data.SessionEditor sessionEditor, com.paypal.oslo.core.appidentity.data.SessionReader sessionReader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionEditor, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionReader, "");
        this.getHighResolutionOutputSizeshNQ4ISI = str;
        this.inactivityThresholdMs = j;
        this.getHighSpeedVideoFpsRangesFor = sessionEditor;
        this.getHighSpeedVideoSizes = sessionReader;
    }

    @Override // com.paypal.oslo.core.appidentity.data.SessionLifecycleListener
    public final /* bridge */ void onStop() {
        super.onStop();
    }

    @Override // com.paypal.oslo.core.appidentity.data.SessionLifecycleListener
    public final long getInactivityThresholdMs() {
        return this.inactivityThresholdMs;
    }

    @Override // com.paypal.oslo.core.appidentity.data.SessionLifecycleListener
    public final void onStart(com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event instanceof com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout) {
            java.lang.String getHighSpeedVideoFpsRangesFor = this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRangesFor();
            this.getHighSpeedVideoFpsRangesFor.rotateSession();
            com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "session expired (inactivity)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sessionTag", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("elapsedMs", java.lang.String.valueOf(((com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.AfterTimeout) event).getElapsedMs())), kotlin.TuplesKt.to("thresholdMs", java.lang.String.valueOf(getInactivityThresholdMs())), kotlin.TuplesKt.to("oldSessionId", getHighSpeedVideoFpsRangesFor), kotlin.TuplesKt.to("newSessionId", this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRangesFor())), null, 4, null);
            return;
        }
        if (!(event instanceof com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.appidentity.LoggerKt.log, "session resumed (active)", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sessionTag", this.getHighResolutionOutputSizeshNQ4ISI), kotlin.TuplesKt.to("elapsedMs", java.lang.String.valueOf(((com.paypal.oslo.core.appidentity.data.SessionLifecycleListener.StartEvent.WithinThreshold) event).getElapsedMs())), kotlin.TuplesKt.to("thresholdMs", java.lang.String.valueOf(getInactivityThresholdMs())), kotlin.TuplesKt.to("sessionId", this.getHighSpeedVideoSizes.getGetHighSpeedVideoFpsRangesFor())), null, 4, null);
    }
}
