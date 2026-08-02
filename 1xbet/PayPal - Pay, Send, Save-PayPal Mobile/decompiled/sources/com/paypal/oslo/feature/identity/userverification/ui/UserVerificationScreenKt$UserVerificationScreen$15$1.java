package com.paypal.oslo.feature.identity.userverification.ui;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class UserVerificationScreenKt$UserVerificationScreen$15$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail, kotlin.Unit> {
    public final void getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryPhoneDetail, "");
        ((com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel) this.receiver).onCountrySelected(countryPhoneDetail);
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ kotlin.Unit invoke(com.paypal.oslo.core.i18n.domain.model.CountryPhoneDetail countryPhoneDetail) {
        getHighSpeedVideoFpsRangesFor(countryPhoneDetail);
        return kotlin.Unit.INSTANCE;
    }

    UserVerificationScreenKt$UserVerificationScreen$15$1(java.lang.Object obj) {
        super(1, obj, com.paypal.oslo.feature.identity.userverification.ui.UserVerificationViewModel.class, "onCountrySelected", "onCountrySelected(Lcom/paypal/oslo/core/i18n/domain/model/CountryPhoneDetail;)V", 0);
    }
}
