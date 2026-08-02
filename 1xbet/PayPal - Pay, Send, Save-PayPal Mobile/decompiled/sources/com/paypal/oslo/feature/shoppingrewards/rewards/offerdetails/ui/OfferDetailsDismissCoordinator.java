package com.paypal.oslo.feature.shoppingrewards.rewards.offerdetails.ui;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\u0003R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/rewards/offerdetails/ui/OfferDetailsDismissCoordinator;", "", "<init>", "()V", "Lkotlin/Function0;", "", com.sun.jna.Callback.METHOD_NAME, "registerCallback", "(Lkotlin/jvm/functions/Function0;)V", "invokeCallback", "Camera2StreamConfigurationMap", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class OfferDetailsDismissCoordinator {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    public final void registerCallback(kotlin.jvm.functions.Function0<kotlin.Unit> callback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighSpeedVideoFpsRanges = callback;
    }

    public final void invokeCallback() {
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
