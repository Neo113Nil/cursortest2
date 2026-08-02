package com.paypal.oslo.core.i18n.domain.strategy;

/* loaded from: classes10.dex */
public final class RelativeTimeFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter get() {
        return newInstance();
    }

    public static com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter_Factory create() {
        return com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter_Factory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter newInstance() {
        return new com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter_Factory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormatter_Factory();

        private InstanceHolder() {
        }
    }
}
