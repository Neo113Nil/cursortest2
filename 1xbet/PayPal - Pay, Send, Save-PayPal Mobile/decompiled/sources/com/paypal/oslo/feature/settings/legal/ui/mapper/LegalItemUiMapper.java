package com.paypal.oslo.feature.settings.legal.ui.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/legal/ui/mapper/LegalItemUiMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/settings/legal/domain/model/LegalItem;", "items", "Lcom/paypal/oslo/feature/settings/legal/ui/model/LegalItemUiData;", "mapToUiData", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class LegalItemUiMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.settings.legal.ui.mapper.LegalItemUiMapper INSTANCE = new com.paypal.oslo.feature.settings.legal.ui.mapper.LegalItemUiMapper();

    private LegalItemUiMapper() {
    }

    public final java.util.List<com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData> mapToUiData(java.util.List<com.paypal.oslo.feature.settings.legal.domain.model.LegalItem> items) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(items, "");
        java.util.List<com.paypal.oslo.feature.settings.legal.domain.model.LegalItem> list = items;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (java.lang.Object obj : list) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            com.paypal.oslo.feature.settings.legal.domain.model.LegalItem legalItem = (com.paypal.oslo.feature.settings.legal.domain.model.LegalItem) obj;
            arrayList.add(new com.paypal.oslo.feature.settings.legal.ui.model.LegalItemUiData(legalItem.getId(), legalItem.getTitle(), legalItem.getSubtitle(), legalItem.getUrl(), !(i == kotlin.collections.CollectionsKt.getLastIndex(items)), true));
            i++;
        }
        return arrayList;
    }
}
