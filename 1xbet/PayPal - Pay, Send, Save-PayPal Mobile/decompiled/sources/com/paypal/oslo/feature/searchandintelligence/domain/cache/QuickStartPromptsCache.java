package com.paypal.oslo.feature.searchandintelligence.domain.cache;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/domain/cache/QuickStartPromptsCache;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/domain/model/QuickStartPrompt;", "prompts", "", "update", "(Ljava/util/List;)V", "getPrompts", "()Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface QuickStartPromptsCache {
    java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> getPrompts();

    void update(java.util.List<com.paypal.oslo.feature.searchandintelligence.domain.model.QuickStartPrompt> prompts);
}
