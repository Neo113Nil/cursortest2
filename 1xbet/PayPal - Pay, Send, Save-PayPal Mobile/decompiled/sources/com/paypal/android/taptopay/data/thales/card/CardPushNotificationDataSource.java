package com.paypal.android.taptopay.data.thales.card;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\r8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/card/CardPushNotificationDataSource;", "", "<init>", "()V", "Lcom/paypal/android/taptopay/data/thales/fcm/model/CardPushNotification;", "change", "", "notify", "(Lcom/paypal/android/taptopay/data/thales/fcm/model/CardPushNotification;)V", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/SharedFlow;", "pushNotification", "Lkotlinx/coroutines/flow/SharedFlow;", "getPushNotification", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CardPushNotificationDataSource {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification> Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification> pushNotification;

    public CardPushNotificationDataSource() {
        kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification> MutableSharedFlow$default = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 1, kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST, 1, null);
        this.Camera2StreamConfigurationMap = MutableSharedFlow$default;
        this.pushNotification = kotlinx.coroutines.flow.FlowKt.asSharedFlow(MutableSharedFlow$default);
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification> getPushNotification() {
        return this.pushNotification;
    }

    public final void notify(com.paypal.android.taptopay.data.thales.fcm.model.CardPushNotification change) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(change, "");
        this.Camera2StreamConfigurationMap.tryEmit(change);
    }
}
