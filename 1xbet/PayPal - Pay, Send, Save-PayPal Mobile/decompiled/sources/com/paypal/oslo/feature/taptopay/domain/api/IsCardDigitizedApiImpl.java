package com.paypal.oslo.feature.taptopay.domain.api;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/api/IsCardDigitizedApiImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/usecase/card/IsCardDigitizedApi;", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalIsCardDigitizedUseCase;", "payPalIsCardDigitizedUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalIsCardDigitizedUseCase;)V", "", "Lcom/paypal/oslo/feature/taptopay/api/domain/model/card/CardId$PayPalCardId;", "paypalCardIds", "", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalIsCardDigitizedUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class IsCardDigitizedApiImpl implements com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase getHighSpeedVideoSizes;

    @javax.inject.Inject
    public IsCardDigitizedApiImpl(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase payPalIsCardDigitizedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalIsCardDigitizedUseCase, "");
        this.getHighSpeedVideoSizes = payPalIsCardDigitizedUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.feature.taptopay.api.domain.usecase.card.IsCardDigitizedApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId> list, kotlin.coroutines.Continuation<? super java.util.Map<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl$invoke$1 isCardDigitizedApiImpl$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl$invoke$1) {
            isCardDigitizedApiImpl$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl$invoke$1) continuation;
            if ((isCardDigitizedApiImpl$invoke$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                isCardDigitizedApiImpl$invoke$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = isCardDigitizedApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = isCardDigitizedApiImpl$invoke$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId> list2 = list;
                    java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                    java.util.Iterator<T> it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList.add(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(((com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId) it.next()).getId()));
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase payPalIsCardDigitizedUseCase = this.getHighSpeedVideoSizes;
                    isCardDigitizedApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor = list;
                    isCardDigitizedApiImpl$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(arrayList2);
                    isCardDigitizedApiImpl$invoke$1.Camera2StreamConfigurationMap = 1;
                    obj = payPalIsCardDigitizedUseCase.invoke(arrayList2, isCardDigitizedApiImpl$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) isCardDigitizedApiImpl$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.Map map = (java.util.Map) obj;
                java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId> list3 = list;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                for (java.lang.Object obj2 : list3) {
                    java.lang.Boolean bool = (java.lang.Boolean) map.get(new com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId(((com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId) obj2).getId()));
                    linkedHashMap.put(obj2, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(bool != null ? bool.booleanValue() : false));
                }
                return linkedHashMap;
            }
        }
        isCardDigitizedApiImpl$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.api.IsCardDigitizedApiImpl$invoke$1(this, continuation);
        java.lang.Object obj3 = isCardDigitizedApiImpl$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = isCardDigitizedApiImpl$invoke$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        java.util.Map map2 = (java.util.Map) obj3;
        java.util.List<com.paypal.oslo.feature.taptopay.api.domain.model.card.CardId.PayPalCardId> list32 = list;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list32, 10)), 16));
        while (r8.hasNext()) {
        }
        return linkedHashMap2;
    }
}
