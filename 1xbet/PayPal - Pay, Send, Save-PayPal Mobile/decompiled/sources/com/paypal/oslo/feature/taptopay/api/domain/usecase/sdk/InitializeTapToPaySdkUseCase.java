package com.paypal.oslo.feature.taptopay.api.domain.usecase.sdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J4\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004H¦B¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/sdk/InitializeTapToPaySdkUseCase;", "", "", "baseUrl", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/sdk/InitializeSdkError;", "", "invoke", "(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface InitializeTapToPaySdkUseCase {
    java.lang.Object invoke(java.lang.String str, java.lang.Class<? extends android.app.Activity> cls, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.api.domain.model.sdk.InitializeSdkError, kotlin.Unit>> continuation);
}
