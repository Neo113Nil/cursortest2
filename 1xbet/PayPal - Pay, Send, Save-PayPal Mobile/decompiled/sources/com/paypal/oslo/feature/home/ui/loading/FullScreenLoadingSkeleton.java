package com.paypal.oslo.feature.home.ui.loading;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/home/ui/loading/FullScreenLoadingSkeleton;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;", "loadingSectionProvider", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "create", "(Lcom/paypal/oslo/feature/home/domain/loading/LoadingSectionProvider;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FullScreenLoadingSkeleton {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.home.ui.loading.FullScreenLoadingSkeleton INSTANCE = new com.paypal.oslo.feature.home.ui.loading.FullScreenLoadingSkeleton();

    private FullScreenLoadingSkeleton() {
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<?>> create(com.paypal.oslo.feature.home.domain.loading.LoadingSectionProvider loadingSectionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadingSectionProvider, "");
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        createListBuilder.addAll(loadingSectionProvider.createLoadingSections("account_snapshot_loading_placeholder_1", com.paypal.oslo.feature.home.domain.model.SectionTypes.ACCOUNT_SNAPSHOT));
        createListBuilder.addAll(loadingSectionProvider.createLoadingSections("hero_product_loading_placeholder_1", com.paypal.oslo.feature.home.domain.model.SectionTypes.HERO_PRODUCT));
        createListBuilder.addAll(loadingSectionProvider.createLoadingSections("deck_cards_loading_placeholder_1", com.paypal.oslo.feature.home.domain.model.SectionTypes.DECK_CARD));
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }
}
