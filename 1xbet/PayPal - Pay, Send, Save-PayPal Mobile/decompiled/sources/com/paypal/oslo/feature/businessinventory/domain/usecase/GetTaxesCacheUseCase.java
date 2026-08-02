package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0086B¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/GetTaxesCacheUseCase;", "", "<init>", "()V", "Larrow/core/Either;", "", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "invoke", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetTaxesCacheUseCase {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GetTaxesCacheUseCase() {
    }

    public final java.lang.Object invoke(kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Throwable, ? extends java.util.List<com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>>> continuation) {
        return arrow.core.EitherKt.right(com.paypal.oslo.feature.businessinventory.domaintest.MakeTaxesMockKt.makeTaxesMock());
    }
}
