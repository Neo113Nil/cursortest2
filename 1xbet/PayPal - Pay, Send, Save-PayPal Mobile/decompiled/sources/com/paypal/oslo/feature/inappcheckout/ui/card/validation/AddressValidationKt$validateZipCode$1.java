package com.paypal.oslo.feature.inappcheckout.ui.card.validation;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class AddressValidationKt$validateZipCode$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<java.lang.String, java.lang.Boolean> {
    public static final com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$validateZipCode$1 getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt$validateZipCode$1();

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ java.lang.Boolean invoke(java.lang.String str) {
        boolean matches;
        java.lang.String str2 = str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        matches = new kotlin.text.Regex(com.paypal.oslo.feature.onboarding.signup.personalinfo.domain.usecase.ValidateAddressUseCaseKt.PostalCodeRegex).matches(str2);
        return java.lang.Boolean.valueOf(matches);
    }

    AddressValidationKt$validateZipCode$1() {
        super(1, com.paypal.oslo.feature.inappcheckout.ui.card.validation.AddressValidationKt.class, "isValidZipCode", "isValidZipCode(Ljava/lang/String;)Z", 1);
    }
}
