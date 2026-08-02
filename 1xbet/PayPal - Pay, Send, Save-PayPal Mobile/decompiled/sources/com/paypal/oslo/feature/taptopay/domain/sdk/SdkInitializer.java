package com.paypal.oslo.feature.taptopay.domain.sdk;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J8\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializer;", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "paymentActivity", "", "baseUrl", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/domain/sdk/SdkInitializationError;", "", "init", "(Ljava/lang/Class;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface SdkInitializer {
    java.lang.Object init(java.lang.Class<? extends android.app.Activity> cls, java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializationError, kotlin.Unit>> continuation);

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes15.dex */
    public static final class DefaultImpls {
    }

    static /* synthetic */ java.lang.Object init$default(com.paypal.oslo.feature.taptopay.domain.sdk.SdkInitializer sdkInitializer, java.lang.Class cls, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: init");
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return sdkInitializer.init(cls, str, continuation);
    }
}
