package com.paypal.oslo.feature.identity.userverification.ui.util;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00068\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/ui/util/FormatCredentialUtil;", "", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;", "formatAsTypedUseCase", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;)V", "", "credential", "", "isPhoneMode", "wasPhoneMode", "countryCode", "Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;", "phoneNumberRequest", "format", "(Ljava/lang/String;ZZLjava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/PhoneNumberRequest;)Ljava/lang/String;", "p0", "p1", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAsTypedUseCase;", "rawInput", "Ljava/lang/String;", "getRawInput", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FormatCredentialUtil {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase getHighSpeedVideoFpsRanges;
    private java.lang.String rawInput;
    public static final int $stable = 8;
    private static final kotlin.text.Regex Camera2StreamConfigurationMap = new kotlin.text.Regex("[^a-zA-Z0-9@._+]");

    @javax.inject.Inject
    public FormatCredentialUtil(com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAsTypedUseCase, "");
        this.getHighSpeedVideoFpsRanges = formatAsTypedUseCase;
        this.rawInput = "";
    }

    public final java.lang.String getRawInput() {
        return this.rawInput;
    }

    public final java.lang.String format(java.lang.String credential, boolean isPhoneMode, boolean wasPhoneMode, java.lang.String countryCode, com.paypal.oslo.core.i18n.domain.model.PhoneNumberRequest phoneNumberRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(credential, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phoneNumberRequest, "");
        java.lang.String str = credential;
        if (kotlin.text.StringsKt.isBlank(str)) {
            this.rawInput = "";
            return "";
        }
        if (isPhoneMode) {
            java.lang.String highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(credential, countryCode);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            int length = highSpeedVideoFpsRanges.length();
            for (int i = 0; i < length; i++) {
                char charAt = highSpeedVideoFpsRanges.charAt(i);
                if (java.lang.Character.isDigit(charAt)) {
                    sb.append(charAt);
                }
            }
            java.lang.String obj = sb.toString();
            this.rawInput = obj;
            if (obj.length() == 0) {
                return "";
            }
            arrow.core.Either<com.paypal.oslo.core.i18n.domain.model.PhoneNumberError, java.lang.String> invoke = this.getHighSpeedVideoFpsRanges.invoke(obj, phoneNumberRequest);
            if (invoke instanceof arrow.core.Either.Right) {
                java.lang.String str2 = (java.lang.String) ((arrow.core.Either.Right) invoke).getValue();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("+");
                sb2.append(countryCode);
                sb2.append(" ");
                sb2.append(str2);
                return sb2.toString();
            }
            if (invoke instanceof arrow.core.Either.Left) {
                java.lang.StringBuilder sb3 = new java.lang.StringBuilder("+");
                sb3.append(countryCode);
                sb3.append(" ");
                sb3.append(obj);
                return sb3.toString();
            }
            throw new kotlin.NoWhenBranchMatchedException();
        }
        java.lang.String obj2 = kotlin.text.StringsKt.trim(str).toString();
        if (wasPhoneMode) {
            obj2 = Camera2StreamConfigurationMap.replace(getHighSpeedVideoFpsRanges(credential, countryCode), "");
        }
        this.rawInput = obj2;
        return obj2;
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(java.lang.String p0, java.lang.String p1) {
        java.lang.String concat = "+".concat(java.lang.String.valueOf(p1));
        return kotlin.text.StringsKt.startsWith$default(p0, concat, false, 2, (java.lang.Object) null) ? kotlin.text.StringsKt.removePrefix(p0, (java.lang.CharSequence) concat) : p0;
    }
}
