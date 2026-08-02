package com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount;

/* renamed from: com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0323CustomAmountViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;

    private C0323CustomAmountViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel get(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem) {
        return newInstance(lineItem, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.C0323CustomAmountViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.C0323CustomAmountViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel newInstance(com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.domain.model.LineItem lineItem, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.payandgetpaid.ui.customamount.CustomAmountViewModel(lineItem, userStore);
    }
}
