package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetWalletStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase_Factory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase_Factory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase newInstance() {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase_Factory getHighSpeedVideoSizes = new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetWalletStatusUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
