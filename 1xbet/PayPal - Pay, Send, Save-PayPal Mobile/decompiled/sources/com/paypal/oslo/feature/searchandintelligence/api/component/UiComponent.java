package com.paypal.oslo.feature.searchandintelligence.api.component;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/searchandintelligence/api/component/UiComponent;", "", "", "Lcom/paypal/oslo/feature/searchandintelligence/api/domain/AgenticAction;", "getAgenticActions", "()Ljava/util/List;", "agenticActions"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface UiComponent {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes14.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction> getAgenticActions(com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent uiComponent) {
            return com.paypal.oslo.feature.searchandintelligence.api.component.UiComponent.super.getAgenticActions();
        }
    }

    default java.util.List<com.paypal.oslo.feature.searchandintelligence.api.domain.AgenticAction> getAgenticActions() {
        return kotlin.collections.CollectionsKt.emptyList();
    }
}
