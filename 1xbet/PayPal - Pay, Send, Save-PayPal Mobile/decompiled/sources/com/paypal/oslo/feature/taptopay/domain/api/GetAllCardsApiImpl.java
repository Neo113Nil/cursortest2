package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/api/GetAllCardsApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetAllCardsApi;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;", "payPalGetAllCardsUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;)V", "", "getCardArt", "waitForRefresh", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/GetAllCardsError;", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/PayPalDigitizedCard;", "invoke", "(ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetAllCardsUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetAllCardsApiImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetAllCardsApiImpl(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetAllCardsUseCase, "");
        this.getHighSpeedVideoFpsRanges = payPalGetAllCardsUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetAllCardsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(boolean z, boolean z2, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.api.domain.model.card.GetAllCardsError, ? extends java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.PayPalDigitizedCard>>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl$invoke$1 getAllCardsApiImpl$invoke$1;
        int i;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl$invoke$1) {
            getAllCardsApiImpl$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl$invoke$1) continuation;
            if ((getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = getAllCardsApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase = this.getHighSpeedVideoFpsRanges;
                    getAllCardsApiImpl$invoke$1.Camera2StreamConfigurationMap = z;
                    getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor = z2;
                    getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRanges = 1;
                    obj = payPalGetAllCardsUseCase.invoke(z, z2, getAllCardsApiImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    boolean z3 = getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                    boolean z4 = getAllCardsApiImpl$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    java.util.List list = (java.util.List) ((arrow.core.Either.Right) right).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                    java.util.Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiPayPalDigitizedCard((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) it.next()));
                    }
                    right = new arrow.core.Either.Right(arrayList);
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(com.paypal.oslo.feature.taptopay.api.domain.model.card.GetAllCardsError.INSTANCE);
                }
                if (right instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAllCardsApiImpl$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.api.GetAllCardsApiImpl$invoke$1(this, continuation);
        java.lang.Object obj2 = getAllCardsApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAllCardsApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj2;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (!(right instanceof arrow.core.Either.Left)) {
        }
    }
}
