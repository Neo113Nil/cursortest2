package com.paypal.oslo.core.pushnotification.domain;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/pushnotification/domain/PushNotificationTokenProvider;", "", "Larrow/core/Either;", "Lcom/paypal/oslo/core/pushnotification/domain/error/PushNotificationTokenError;", "", "getToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface PushNotificationTokenProvider {
    java.lang.Object getToken(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.pushnotification.domain.error.PushNotificationTokenError, java.lang.String>> continuation);
}
