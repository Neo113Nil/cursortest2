package com.paypal.android.taptopay.data.thales.logging;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/fcm/model/PushNotification;", "", "", "toLogAttributes", "(Lcom/paypal/android/taptopay/data/thales/fcm/model/PushNotification;)Ljava/util/Map;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ExtensionsKt {
    public static final java.util.Map<java.lang.String, java.lang.String> toLogAttributes(com.paypal.android.taptopay.data.thales.fcm.model.PushNotification pushNotification) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotification, "");
        return kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("sender", pushNotification.getSender().name()), kotlin.TuplesKt.to("action", pushNotification.getAction()), kotlin.TuplesKt.to("digitalCardId", pushNotification.getDigitalCardId()));
    }
}
