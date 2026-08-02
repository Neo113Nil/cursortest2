package com.paypal.oslo.feature.oneonboarding.inventory.views.name.ui;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class NameViewComponentViewModelKt {
    public static final /* synthetic */ com.paypal.oslo.core.i18n.domain.model.NameLayout access$filterToRequiredOnly(com.paypal.oslo.core.i18n.domain.model.NameLayout nameLayout) {
        java.util.List<com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow> nameRow = nameLayout.getNameRow();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(nameRow, 10));
        for (com.paypal.oslo.core.i18n.domain.model.NameLayout.NameRow nameRow2 : nameRow) {
            java.util.List<com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent> nameComponent = nameRow2.getNameComponent();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : nameComponent) {
                if (((com.paypal.oslo.core.i18n.domain.model.NameLayout.NameComponent) obj).getRequired()) {
                    arrayList2.add(obj);
                }
            }
            arrayList.add(nameRow2.copy(arrayList2));
        }
        return nameLayout.copy(arrayList);
    }
}
