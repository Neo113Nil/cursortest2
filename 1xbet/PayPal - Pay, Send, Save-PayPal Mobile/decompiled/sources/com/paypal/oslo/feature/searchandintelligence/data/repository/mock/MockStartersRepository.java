package com.paypal.oslo.feature.searchandintelligence.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\f0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/mock/MockStartersRepository;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/repository/StartersRepository;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters$Surface;", "surfaces", "Larrow/core/Either;", "Lcom/paypal/oslo/core/network/http/error/NetworkError;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "getPrompts", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/Starters;", "getStarters", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MockStartersRepository implements com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository {
    public static final int $stable = 0;
    private static final com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository.Companion Companion = new com.paypal.oslo.feature.searchandintelligence.data.repository.mock.MockStartersRepository.Companion(null);
    private static final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public MockStartersRepository() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository
    public final java.lang.Object getPrompts(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, ? extends java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>>> continuation) {
        return arrow.core.EitherKt.right(getHighSpeedVideoFpsRanges);
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.repository.StartersRepository
    public final java.lang.Object getStarters(java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.network.http.error.NetworkError, com.paypal.oslo.feature.searchandintelligence.domain.model.Starters>> continuation) {
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.String[]{"Hi! How can I help you today?", "Hello! What would you like to do?", "Welcome back! How can I assist you?"});
        java.util.List<? extends com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface> list2 = list;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
        for (java.lang.Object obj : list2) {
            linkedHashMap.put(obj, getHighSpeedVideoFpsRanges);
        }
        return arrow.core.EitherKt.right(new com.paypal.oslo.feature.searchandintelligence.domain.model.Starters(listOf, linkedHashMap));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/data/repository/mock/MockStartersRepository$Companion;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface surface = null;
        java.lang.String str = null;
        java.lang.String str2 = null;
        int i = 38;
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        getHighSpeedVideoFpsRanges = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt[]{new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt("Find noise canceling headphones under $500", surface, str, com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.SHOPPING_BAG, "Find noise canceling headphones under $500", str2, i, defaultConstructorMarker), new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt("How do I add money to my PayPal balance?", (com.paypal.oslo.feature.searchandintelligence.domain.model.Starters.Surface) null, (java.lang.String) null, com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.MONEY_BILL, "How do I add money to my PayPal balance?", (java.lang.String) null, 38, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt("How do I send money to a friend?", surface, str, com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartIconNames.CURRENCY_CIRCLE, "How do I send money to a friend?", str2, i, defaultConstructorMarker)});
    }
}
