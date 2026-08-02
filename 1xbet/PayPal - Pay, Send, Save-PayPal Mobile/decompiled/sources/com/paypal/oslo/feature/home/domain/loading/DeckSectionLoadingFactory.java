package com.paypal.oslo.feature.home.domain.loading;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/home/domain/loading/DeckSectionLoadingFactory;", "Lcom/paypal/oslo/feature/home/domain/loading/SectionLoadingFactory;", "<init>", "()V", "", "sectionId", "", "Lcom/paypal/oslo/feature/home/domain/model/Section;", "Lcom/paypal/oslo/feature/home/domain/model/SectionLoading;", "createLoadingSections", "(Ljava/lang/String;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeckSectionLoadingFactory implements com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DeckSectionLoadingFactory() {
    }

    @Override // com.paypal.oslo.feature.home.domain.loading.SectionLoadingFactory
    public final java.util.List<com.paypal.oslo.feature.home.domain.model.Section<com.paypal.oslo.feature.home.domain.model.SectionLoading>> createLoadingSections(java.lang.String sectionId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sectionId, "");
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        arrayList.add(new com.paypal.oslo.feature.home.domain.model.DeckCardContent("deck_card_0", "", "", "", "", "", "", "", "", "", null, null, null, 7168, null));
        return kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.domain.model.Section(sectionId, com.paypal.oslo.feature.home.domain.model.SectionTypes.DECK_CARD, (java.lang.String) null, (java.lang.String) null, kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.home.domain.model.SectionLoading(arrayList)), (java.lang.String) null, (java.lang.String) null, (com.paypal.oslo.feature.home.domain.model.SectionInstrumentation) null, 224, (kotlin.jvm.internal.DefaultConstructorMarker) null));
    }
}
