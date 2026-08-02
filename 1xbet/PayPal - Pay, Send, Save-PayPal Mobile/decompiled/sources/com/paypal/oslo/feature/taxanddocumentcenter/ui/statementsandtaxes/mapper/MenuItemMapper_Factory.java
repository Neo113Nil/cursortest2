package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper;

/* loaded from: classes15.dex */
public final class MenuItemMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper> getHighSpeedVideoFpsRanges;

    private MenuItemMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper> provider) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper newInstance(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuCardTypeMapper menuCardTypeMapper) {
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.mapper.MenuItemMapper(menuCardTypeMapper);
    }
}
