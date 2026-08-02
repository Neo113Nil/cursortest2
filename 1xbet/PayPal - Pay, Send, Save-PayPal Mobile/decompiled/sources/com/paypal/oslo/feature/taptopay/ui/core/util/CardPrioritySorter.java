package com.paypal.oslo.feature.taptopay.ui.core.util;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@¢\u0006\u0004\b\r\u0010\u000eR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter;", "", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "", "cardTypePriorities", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Ljava/util/Map;Lkotlinx/coroutines/CoroutineDispatcher;)V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/PayPalDigitizedCard;", "cards", "sortCardsByPriority", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class CardPrioritySorter {
    public static final int DEFAULT_CARD_PRIORITY = 3;
    public static final int DEFAULT_PRIORITY = 4;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Map<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType, java.lang.Integer> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter.Companion INSTANCE = new com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter.Companion(null);
    public static final int $stable = 8;
    private static final java.util.Map<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType, java.lang.Integer> DEFAULT_CARD_TYPE_PRIORITIES = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayLaterToGo, 1), kotlin.TuplesKt.to(com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType.PayPalConsumerDebit, 2));

    public CardPrioritySorter(java.util.Map<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType, java.lang.Integer> map, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.getHighSpeedVideoFpsRangesFor = map;
        this.Camera2StreamConfigurationMap = coroutineDispatcher;
    }

    public /* synthetic */ CardPrioritySorter(java.util.Map map, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? DEFAULT_CARD_TYPE_PRIORITIES : map, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0087T¢\u0006\u0006\n\u0004\b\r\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/ui/core/util/CardPrioritySorter$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/taptopay/domain/model/card/paypal/CardType;", "", "DEFAULT_CARD_TYPE_PRIORITIES", "Ljava/util/Map;", "getDEFAULT_CARD_TYPE_PRIORITIES", "()Ljava/util/Map;", "DEFAULT_CARD_PRIORITY", com.visa.cbp.getEncExpo.warmup, "DEFAULT_PRIORITY"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final java.util.Map<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.CardType, java.lang.Integer> getDEFAULT_CARD_TYPE_PRIORITIES() {
            return com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter.DEFAULT_CARD_TYPE_PRIORITIES;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.Object sortCardsByPriority(java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard> list, kotlin.coroutines.Continuation<? super java.util.List<com.paypal.oslo.feature.taptopay.domain.model.card.paypal.PayPalDigitizedCard>> continuation) {
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.feature.taptopay.ui.core.util.CardPrioritySorter$sortCardsByPriority$2(list, this, null), continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardPrioritySorter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
