package com.paypal.oslo.feature.pushnotification.delivery.domain.eligibility;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/pushnotification/delivery/domain/eligibility/CommsOsloPushNotificationEligibilityChecker;", "Lcom/paypal/oslo/feature/pushnotification/shared/domain/eligibility/CommsNotificationEligibilityChecker;", "<init>", "()V", "Lcom/google/firebase/messaging/RemoteMessage;", "message", "", "isEligible", "(Lcom/google/firebase/messaging/RemoteMessage;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class CommsOsloPushNotificationEligibilityChecker implements com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker {
    public static final int $stable = 0;

    @javax.inject.Inject
    public CommsOsloPushNotificationEligibilityChecker() {
    }

    @Override // com.paypal.oslo.feature.pushnotification.shared.domain.eligibility.CommsNotificationEligibilityChecker
    public final boolean isEligible(com.google.firebase.messaging.RemoteMessage message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(message.getData().get("source"), "PAYPAL");
    }
}
