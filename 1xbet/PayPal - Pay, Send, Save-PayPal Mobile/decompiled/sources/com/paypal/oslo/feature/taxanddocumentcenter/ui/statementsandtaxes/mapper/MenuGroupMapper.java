package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuGroupMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuGroupDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuGroup;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuItemMapper;", "menuItemMapper", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuItemMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuGroupDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuGroup;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuItemMapper;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuGroupMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuGroup> {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public MenuGroupMapper(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper menuItemMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuItemMapper, "");
        this.Camera2StreamConfigurationMap = menuItemMapper;
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuGroup map(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuGroupDomain input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        int id = input.getTitle().getId();
        java.util.List<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain> menu = input.getMenu();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(menu, 10));
        java.util.Iterator<T> it = menu.iterator();
        while (it.hasNext()) {
            arrayList.add(this.Camera2StreamConfigurationMap.map((com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain) it.next()));
        }
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuGroup(id, arrayList);
    }
}
