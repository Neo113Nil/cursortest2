package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter$sortCardsByPriority$2", f = "CardPrioritySorter.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, nl = {}, s = {}, v = 2)
/* loaded from: classes15.dex */
final class CardPrioritySorter$sortCardsByPriority$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>>, java.lang.Object> {
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list = this.getHighSpeedVideoFpsRangesFor;
        final com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter cardPrioritySorter = this.getHighSpeedVideoSizes;
        return kotlin.collections.CollectionsKt.sortedWith(list, new java.util.Comparator() { // from class: com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter$sortCardsByPriority$2$invokeSuspend$$inlined$compareBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.util.Map map;
                java.lang.Integer valueOf;
                java.util.Map map2;
                java.lang.Integer valueOf2;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) t;
                map = com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter.this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo = payPalDigitizedCard.getCardInfo();
                java.lang.Integer num = (java.lang.Integer) map.get(cardInfo != null ? cardInfo.getType() : null);
                int intValue = num != null ? num.intValue() : 4;
                if (payPalDigitizedCard.getDigitizedCard().isDefault() && intValue == 4) {
                    valueOf = (java.lang.Comparable) 3;
                } else {
                    valueOf = java.lang.Integer.valueOf(intValue);
                }
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard payPalDigitizedCard2 = (com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard) t2;
                map2 = com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter.this.getHighSpeedVideoFpsRangesFor;
                com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardInfo cardInfo2 = payPalDigitizedCard2.getCardInfo();
                java.lang.Integer num2 = (java.lang.Integer) map2.get(cardInfo2 != null ? cardInfo2.getType() : null);
                int intValue2 = num2 != null ? num2.intValue() : 4;
                if (payPalDigitizedCard2.getDigitizedCard().isDefault() && intValue2 == 4) {
                    valueOf2 = (java.lang.Comparable) 3;
                } else {
                    valueOf2 = java.lang.Integer.valueOf(intValue2);
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, valueOf2);
            }
        });
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super java.util.List<? extends com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> continuation) {
        return ((com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter$sortCardsByPriority$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter$sortCardsByPriority$2(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CardPrioritySorter$sortCardsByPriority$2(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list, com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter cardPrioritySorter, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter$sortCardsByPriority$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = list;
        this.getHighSpeedVideoSizes = cardPrioritySorter;
    }
}
