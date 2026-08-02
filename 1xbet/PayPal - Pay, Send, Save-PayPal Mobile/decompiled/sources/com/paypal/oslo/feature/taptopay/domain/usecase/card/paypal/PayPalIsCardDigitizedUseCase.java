package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalIsCardDigitizedUseCase;", "", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;", "payPalGetCardIdGroupsUseCase", "<init>", "(Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardId$PayPalCardId;", "paypalCardIds", "", "", "invoke", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taptopay/domain/usecase/card/paypal/PayPalGetCardIdGroupsUseCase;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalIsCardDigitizedUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public PayPalIsCardDigitizedUseCase(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(payPalGetCardIdGroupsUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = payPalGetCardIdGroupsUseCase;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId> list, kotlin.coroutines.Continuation<? super java.util.Map<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId, java.lang.Boolean>> continuation) {
        com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase$invoke$1 payPalIsCardDigitizedUseCase$invoke$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase$invoke$1) {
            payPalIsCardDigitizedUseCase$invoke$1 = (com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase$invoke$1) continuation;
            if ((payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardIdGroupsUseCase payPalGetCardIdGroupsUseCase = this.getHighResolutionOutputSizeshNQ4ISI;
                    payPalIsCardDigitizedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = list;
                    payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoSizes = 1;
                    obj = payPalGetCardIdGroupsUseCase.invoke(payPalIsCardDigitizedUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (java.util.List) payPalIsCardDigitizedUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                java.util.List list2 = (java.util.List) obj;
                java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId> list3 = list;
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10)), 16));
                for (java.lang.Object obj2 : list3) {
                    com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId payPalCardId = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId) obj2;
                    java.util.List list4 = list2;
                    boolean z = false;
                    if (!(list4 instanceof java.util.Collection) || !list4.isEmpty()) {
                        java.util.Iterator it = list4.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardIdGroup) it.next()).getPayPalCardId(), payPalCardId)) {
                                z = true;
                                break;
                            }
                        }
                    }
                    linkedHashMap.put(obj2, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(z));
                }
                return linkedHashMap;
            }
        }
        payPalIsCardDigitizedUseCase$invoke$1 = new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalIsCardDigitizedUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoFpsRanges;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = payPalIsCardDigitizedUseCase$invoke$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        java.util.List list22 = (java.util.List) obj3;
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardId.PayPalCardId> list32 = list;
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list32, 10)), 16));
        while (r8.hasNext()) {
        }
        return linkedHashMap2;
    }
}
