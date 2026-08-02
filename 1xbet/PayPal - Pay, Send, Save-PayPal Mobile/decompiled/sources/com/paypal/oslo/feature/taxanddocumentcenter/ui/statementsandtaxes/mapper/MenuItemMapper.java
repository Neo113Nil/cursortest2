package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuItemMapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/mapper/Mapper;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuItemDomain;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuItem;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuCardTypeMapper;", "cardTypeMapper", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuCardTypeMapper;)V", "input", "map", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuItemDomain;)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuItem;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/mapper/MenuCardTypeMapper;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MenuItemMapper implements com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper<com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem> {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public MenuItemMapper(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper menuCardTypeMapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuCardTypeMapper, "");
        this.getHighSpeedVideoFpsRangesFor = menuCardTypeMapper;
    }

    @Override // com.paypal.oslo.feature.taxanddocumentcenter.domain.mapper.Mapper
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem map(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain input) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem(this.getHighSpeedVideoFpsRangesFor.map(input.getCardType()), input.getTitle().getId(), input.getDescription().getId());
    }
}
