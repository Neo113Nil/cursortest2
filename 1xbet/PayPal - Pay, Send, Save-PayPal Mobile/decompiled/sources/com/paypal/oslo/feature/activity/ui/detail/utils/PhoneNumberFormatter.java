package com.paypal.oslo.feature.activity.ui.detail.utils;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;", "formatPhoneNumberUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;)V", "Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;", "phone", "", "formatForDisplay", "(Lcom/paypal/oslo/feature/activity/domain/detail/models/Phone;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatPhoneNumberUseCase;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PhoneNumberFormatter {

    @java.lang.Deprecated
    public static final int DEFAULT_COUNTRY_CODE = 1;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase getHighResolutionOutputSizeshNQ4ISI;
    private static final com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter.Companion Companion = new com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter.Companion(null);
    public static final int $stable = 8;

    @javax.inject.Inject
    public PhoneNumberFormatter(com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatPhoneNumberUseCase, "");
        this.getHighResolutionOutputSizeshNQ4ISI = formatPhoneNumberUseCase;
    }

    public final java.lang.String formatForDisplay(com.paypal.oslo.feature.activity.domain.detail.models.Phone phone) {
        java.lang.Integer intOrNull;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        java.lang.String nationalNumber = phone.getNationalNumber();
        java.lang.String str = nationalNumber != null ? nationalNumber : "";
        java.lang.String countryCode = phone.getCountryCode();
        if (countryCode != null) {
            com.paypal.oslo.core.i18n.domain.model.PhoneNumber phoneNumber = null;
            r4 = null;
            java.lang.String str2 = null;
            phoneNumber = null;
            if (kotlin.text.StringsKt.isBlank(countryCode)) {
                countryCode = null;
            }
            if (countryCode != null) {
                java.lang.String nationalNumber2 = phone.getNationalNumber();
                if (nationalNumber2 != null) {
                    java.lang.String str3 = kotlin.text.StringsKt.isBlank(nationalNumber2) ? null : nationalNumber2;
                    if (str3 != null) {
                        java.lang.String replace$default = kotlin.text.StringsKt.replace$default(kotlin.text.StringsKt.replace$default(str3, "-", "", false, 4, (java.lang.Object) null), " ", "", false, 4, (java.lang.Object) null);
                        java.lang.String countryCode2 = phone.getCountryCode();
                        java.lang.String removePrefix = countryCode2 != null ? kotlin.text.StringsKt.removePrefix(countryCode2, (java.lang.CharSequence) "+") : null;
                        int intValue = (removePrefix == null || (intOrNull = kotlin.text.StringsKt.toIntOrNull(removePrefix)) == null) ? 1 : intOrNull.intValue();
                        java.lang.String extensionNumber = phone.getExtensionNumber();
                        if (extensionNumber != null && !kotlin.text.StringsKt.isBlank(extensionNumber)) {
                            str2 = extensionNumber;
                        }
                        phoneNumber = new com.paypal.oslo.core.i18n.domain.model.PhoneNumber(intValue, replace$default, str2);
                    }
                }
                if (phoneNumber != null) {
                    arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> invoke = this.getHighResolutionOutputSizeshNQ4ISI.invoke(phoneNumber, new com.paypal.oslo.core.i18n.domain.model.PhoneNumber.Configuration(com.paypal.oslo.core.i18n.domain.model.Style.NATIONAL, false));
                    if (invoke instanceof arrow.core.Either.Right) {
                        return (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
                    }
                    if (!(invoke instanceof arrow.core.Either.Left)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    return str;
                }
            }
        }
        return str;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/detail/utils/PhoneNumberFormatter$Companion;", "", "<init>", "()V", "", "DEFAULT_COUNTRY_CODE", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
