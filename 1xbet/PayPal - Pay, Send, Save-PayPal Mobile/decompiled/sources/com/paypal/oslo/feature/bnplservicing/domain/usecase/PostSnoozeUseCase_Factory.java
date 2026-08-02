package com.paypal.oslo.feature.bnplservicing.domain.usecase;

/* loaded from: classes11.dex */
public final class PostSnoozeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase_Factory create() {
        return com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase newInstance() {
        return new com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.bnplservicing.domain.usecase.PostSnoozeUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
