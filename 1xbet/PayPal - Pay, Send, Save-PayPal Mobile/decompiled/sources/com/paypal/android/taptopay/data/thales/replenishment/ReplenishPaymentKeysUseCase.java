package com.paypal.android.taptopay.data.thales.replenishment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/android/taptopay/data/thales/replenishment/ReplenishPaymentKeysUseCase;", "", "<init>", "()V", "", "tokenizedCardId", "", "forceReplenishment", "Lcom/paypal/android/taptopay/domain/Result;", "", "Lcom/paypal/android/taptopay/domain/model/replenishment/ReplenishPaymentKeysError;", "invoke", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ReplenishPaymentKeysUseCase {
    @javax.inject.Inject
    public ReplenishPaymentKeysUseCase() {
    }

    public final java.lang.Object invoke(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.paypal.android.taptopay.domain.Result<kotlin.Unit, com.paypal.android.taptopay.domain.model.replenishment.ReplenishPaymentKeysError>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.Dispatchers.getMain(), new com.paypal.android.taptopay.data.thales.replenishment.ReplenishPaymentKeysUseCase$invoke$2(str, z, null), continuation);
    }
}
