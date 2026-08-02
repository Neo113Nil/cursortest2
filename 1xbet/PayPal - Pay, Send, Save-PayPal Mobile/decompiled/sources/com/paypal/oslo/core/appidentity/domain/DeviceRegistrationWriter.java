package com.paypal.oslo.core.appidentity.domain;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0004H¦@¢\u0006\u0004\b\r\u0010\u000eÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/appidentity/domain/DeviceRegistrationWriter;", "", "", "paypalDeviceId", "", "persistPayPalDeviceId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "confirmed", "persistDeviceConfirmationStatus", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registered", "persistPaymentAppInstanceIdRegistered", "clearDeviceRegistrationState", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface DeviceRegistrationWriter {
    java.lang.Object clearDeviceRegistrationState(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object persistDeviceConfirmationStatus(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object persistPayPalDeviceId(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object persistPaymentAppInstanceIdRegistered(boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
