package com.paypal.oslo.core.telemetry.compose;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleObserver;", "", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;", "event", "", "onScreenAppeared", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Appeared;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;", "onScreenReady", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Ready;)V", "Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;", "onScreenDisappeared", "(Lcom/paypal/oslo/core/telemetry/compose/ScreenLifecycleEvent$Disappeared;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ScreenLifecycleObserver {
    void onScreenAppeared(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Appeared event);

    void onScreenDisappeared(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Disappeared event);

    void onScreenReady(com.paypal.oslo.core.telemetry.compose.ScreenLifecycleEvent.Ready event);
}
