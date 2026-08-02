package com.paypal.oslo.feature.bnplacquisition.di;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class AcquisitionConfigModule$provideCountryGetter$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function0<com.paypal.oslo.feature.bnplacquisition.config.Country> {
    @Override // kotlin.jvm.functions.Function0
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final com.paypal.oslo.feature.bnplacquisition.config.Country invoke() {
        return ((com.paypal.oslo.feature.bnplacquisition.config.CountryResolver) this.receiver).getCountry();
    }

    AcquisitionConfigModule$provideCountryGetter$1(java.lang.Object obj) {
        super(0, obj, com.paypal.oslo.feature.bnplacquisition.config.CountryResolver.class, "getCountry", "getCountry()Lcom/paypal/oslo/feature/bnplacquisition/config/Country;", 0);
    }
}
