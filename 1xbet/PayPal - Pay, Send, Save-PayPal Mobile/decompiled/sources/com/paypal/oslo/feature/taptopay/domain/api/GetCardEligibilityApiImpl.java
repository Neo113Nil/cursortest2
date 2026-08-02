package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nH\u0096B¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/api/GetCardEligibilityApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/GetCardEligibilityApi;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "payPalGetCardEligibilityUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;)V", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;", "id", "", "clientMetadataId", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardType;", "cardTypes", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/GetCardEligibilityError;", "", "invoke", "(Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId;Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardEligibilityUseCase;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetCardEligibilityApiImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public GetCardEligibilityApiImpl(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardEligibilityUseCase, "");
        this.Camera2StreamConfigurationMap = payPalGetCardEligibilityUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.card.GetCardEligibilityApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId cardId, java.lang.String str, java.util.List<? extends com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType> list, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardEligibilityError, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl$invoke$1 getCardEligibilityApiImpl$invoke$1;
        int i;
        java.util.ArrayList arrayList;
        arrow.core.Either.Right right;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl$invoke$1) {
            getCardEligibilityApiImpl$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl$invoke$1) continuation;
            if ((getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getCardEligibilityApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object obj2 = null;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase = this.Camera2StreamConfigurationMap;
                    java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId> listOf = kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toInternal(cardId));
                    if (list != null) {
                        java.util.List<? extends com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType> list2 = list;
                        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                        java.util.Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toCardType((com.paypal.oslo.feature.taptopay.api.domain.model.card.CardType) it.next()));
                        }
                        arrayList = arrayList2;
                    } else {
                        arrayList = null;
                    }
                    getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRanges = cardId;
                    getCardEligibilityApiImpl$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(list);
                    getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = payPalGetCardEligibilityUseCase.invoke(listOf, str, arrayList, getCardEligibilityApiImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cardId = (com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId) getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                right = (arrow.core.Either) obj;
                if (!(right instanceof arrow.core.Either.Right)) {
                    java.util.Iterator<T> it2 = ((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibilityResult) ((arrow.core.Either.Right) right).getValue()).getCardEligibility().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it2.next();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility) next).getId(), com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toInternal(cardId))) {
                            obj2 = next;
                            break;
                        }
                    }
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility cardEligibility = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.eligibility.CardEligibility) obj2;
                    right = new arrow.core.Either.Right(kotlin.coroutines.jvm.internal.Boxing.boxBoolean(cardEligibility != null ? cardEligibility.isEligible() : false));
                } else if (!(right instanceof arrow.core.Either.Left)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (!(right instanceof arrow.core.Either.Left)) {
                    return new arrow.core.Either.Left(new com.paypal.oslo.feature.taptopay.api.domain.model.card.GetCardEligibilityError(com.paypal.oslo.feature.taptopay.domain.api.ApiDomainMapperKt.toApiServiceApiError(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.GetCardEligibilityError) ((arrow.core.Either.Left) right).getValue()).getServiceApiError())));
                }
                if (right instanceof arrow.core.Either.Right) {
                    return new arrow.core.Either.Right(((arrow.core.Either.Right) right).getValue());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getCardEligibilityApiImpl$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.api.GetCardEligibilityApiImpl$invoke$1(this, continuation);
        java.lang.Object obj3 = getCardEligibilityApiImpl$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCardEligibilityApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object obj22 = null;
        if (i != 0) {
        }
        right = (arrow.core.Either) obj3;
        if (!(right instanceof arrow.core.Either.Right)) {
        }
        if (!(right instanceof arrow.core.Either.Left)) {
        }
    }
}
