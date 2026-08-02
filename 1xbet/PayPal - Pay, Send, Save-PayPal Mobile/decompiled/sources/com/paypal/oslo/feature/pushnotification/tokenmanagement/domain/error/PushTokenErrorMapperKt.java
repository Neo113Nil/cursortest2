package com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0017\u0010\u0003\u001a\u00020\u0002*\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004*\n\u0010\u0005\"\u00020\u00002\u00020\u0000*\n\u0010\u0007\"\u00020\u00062\u00020\u0006"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/error/PushNotificationTokenError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/CorePushTokenError;", "Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "toPushTokenDomainError", "(Lcom/paypal/oslo/core/pushnotification/domain/error/PushNotificationTokenError;)Lcom/paypal/oslo/feature/pushnotification/tokenmanagement/domain/error/PushNotificationTokenError;", "CorePushTokenError", "Lcom/paypal/oslo/core/pushnotification/domain/error/PushNotificationTokenError$SdkError;", "CoreSdkError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PushTokenErrorMapperKt {
    public static final com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError toPushTokenDomainError(com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError pushNotificationTokenError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushNotificationTokenError, "");
        if (!(pushNotificationTokenError instanceof com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError.SdkError)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.domain.error.PushNotificationTokenError.TokenGenerationFailed(((com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError.SdkError) pushNotificationTokenError).getCause());
    }
}
