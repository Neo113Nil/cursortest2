package com.paypal.oslo.core.telemetry.vendors.adjust;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/telemetry/vendors/adjust/AdjustEventTrackingListener;", "Lcom/adjust/sdk/OnEventTrackingSucceededListener;", "Lcom/adjust/sdk/OnEventTrackingFailedListener;", "<init>", "()V", "Lcom/adjust/sdk/AdjustEventSuccess;", "event", "", "onEventTrackingSucceeded", "(Lcom/adjust/sdk/AdjustEventSuccess;)V", "Lcom/adjust/sdk/AdjustEventFailure;", "onEventTrackingFailed", "(Lcom/adjust/sdk/AdjustEventFailure;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdjustEventTrackingListener implements com.adjust.sdk.OnEventTrackingSucceededListener, com.adjust.sdk.OnEventTrackingFailedListener {
    public static final int $stable = 0;

    @Override // com.adjust.sdk.OnEventTrackingSucceededListener
    public final void onEventTrackingSucceeded(com.adjust.sdk.AdjustEventSuccess event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Analytics] Adjust Event Tracking Succeed", null, null, 6, null);
    }

    @Override // com.adjust.sdk.OnEventTrackingFailedListener
    public final void onEventTrackingFailed(com.adjust.sdk.AdjustEventFailure event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        com.paypal.android.logger.Logger.e$default(com.paypal.oslo.core.telemetry.LoggerKt.log, "[Analytics] Adjust Event Tracking Failed", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("error_message", event.message)), null, null, 12, null);
    }
}
