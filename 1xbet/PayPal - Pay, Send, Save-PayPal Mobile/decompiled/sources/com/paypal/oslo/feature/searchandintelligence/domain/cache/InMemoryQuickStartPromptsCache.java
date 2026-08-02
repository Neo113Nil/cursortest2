package com.paypal.oslo.feature.searchandintelligence.domain.cache;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\f\u001a\u00020\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/cache/InMemoryQuickStartPromptsCache;", "Lcom/paypal/oslo/feature/searchandintelligence/domain/cache/QuickStartPromptsCache;", "<init>", "()V", "cachedPrompts", "Lkotlin/concurrent/atomics/AtomicReference;", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "Ljava/util/concurrent/atomic/AtomicReference;", "prompts", "getPrompts", "()Ljava/util/List;", "update", "", "search-and-intelligence_prodRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InMemoryQuickStartPromptsCache implements com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache {
    public static final int $stable = 8;
    private final java.util.concurrent.atomic.AtomicReference<java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt>> getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference<>(kotlin.collections.CollectionsKt.emptyList());

    @javax.inject.Inject
    public InMemoryQuickStartPromptsCache() {
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache
    public final java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> getPrompts() {
        return this.getHighSpeedVideoFpsRanges.get();
    }

    @Override // com.paypal.oslo.feature.searchandintelligence.domain.cache.QuickStartPromptsCache
    public final void update(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> prompts) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prompts, "");
        this.getHighSpeedVideoFpsRanges.set(prompts);
    }
}
