package com.paypal.oslo.feature.bnplservicing.ui.prequal;

/* loaded from: classes11.dex */
public final class PreQualMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> Camera2StreamConfigurationMap;

    private PreQualMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> provider) {
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper newInstance(com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter bnplServFormatter) {
        return new com.paypal.oslo.feature.bnplservicing.ui.prequal.PreQualMapper(bnplServFormatter);
    }
}
