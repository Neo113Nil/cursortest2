package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.phone;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/data/formatter/phone/PhoneNumberFormatterFacadeImpl;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/formatter/phone/PhoneNumberFormatterFacade;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;", "formatPhoneNumberUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;)V", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;", "phone", "", "shouldObscure", "Lcom/paypal/oslo/core/i18n/domain/model/Style;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "", "format", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/common/profiles/PhoneNumber;ZLcom/paypal/oslo/core/i18n/domain/model/Style;)Ljava/lang/String;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;", "getFormatPhoneNumberUseCase", "()Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PhoneNumberFormatterFacadeImpl implements com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase;

    @javax.inject.Inject
    public PhoneNumberFormatterFacadeImpl(com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatPhoneNumberUseCase, "");
        this.formatPhoneNumberUseCase = formatPhoneNumberUseCase;
    }

    public final com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase getFormatPhoneNumberUseCase() {
        return this.formatPhoneNumberUseCase;
    }

    @Override // com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.phone.PhoneNumberFormatterFacade
    public final java.lang.String format(com.paypal.oslo.feature.revolvingcreditservicing.domain.model.common.profiles.PhoneNumber phone, boolean shouldObscure, com.paypal.oslo.core.i18n.domain.model.Style style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        if (phone == null) {
            return null;
        }
        com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase = this.formatPhoneNumberUseCase;
        java.lang.Integer countryCode = phone.getCountryCode();
        int intValue = countryCode != null ? countryCode.intValue() : 1;
        java.lang.String nationalNumber = phone.getNationalNumber();
        arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> invoke = formatPhoneNumberUseCase.invoke(new com.paypal.oslo.core.i18n.domain.model.PhoneNumber(intValue, nationalNumber != null ? nationalNumber : "", phone.getExtensionNumber()), new com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration(style, shouldObscure));
        if (invoke instanceof arrow.core.Either.Right) {
            return (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
        }
        if (!(invoke instanceof arrow.core.Either.Left)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return null;
    }
}
