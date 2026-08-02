package com.paypal.oslo.feature.moneymovement.ui.amount;

/* loaded from: classes13.dex */
public final class AmountScreenComponentsImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup> getHighSpeedVideoSizes;

    private AmountScreenComponentsImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup> provider) {
        return new com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl newInstance(com.paypal.oslo.feature.moneymovement.ui.amount.component.actionbuttongroup.ActionButtonGroup actionButtonGroup) {
        return new com.paypal.oslo.feature.moneymovement.ui.amount.AmountScreenComponentsImpl(actionButtonGroup);
    }
}
