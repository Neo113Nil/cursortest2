package com.paypal.oslo.feature.xoom.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J@\u0010\u000e\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/usecase/CreateSendMoneyInitialUrlUseCase;", "", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "localeInformation", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;", "dynamicConfiguration", "<init>", "(Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;)V", "", "sendCurrencyCode", "receiveCurrencyCode", "destinationCountryCode", "amount", "refTag", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/appidentity/domain/LocaleInformation;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/remoteconfig/contract/DynamicConfiguration;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class CreateSendMoneyInitialUrlUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.LocaleInformation getHighSpeedVideoSizes;
    private final com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public CreateSendMoneyInitialUrlUseCase(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(localeInformation, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dynamicConfiguration, "");
        this.getHighSpeedVideoSizes = localeInformation;
        this.getHighSpeedVideoFpsRangesFor = dynamicConfiguration;
    }

    public final java.lang.String invoke(java.lang.String sendCurrencyCode, java.lang.String receiveCurrencyCode, java.lang.String destinationCountryCode, java.lang.String amount, java.lang.String refTag) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refTag, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder((java.lang.String) this.getHighSpeedVideoFpsRangesFor.getValue(com.paypal.oslo.feature.xoom.domain.config.XoomConfigs.INSTANCE.getBaseWebsiteUrl()));
        java.lang.String languageTag = this.getHighSpeedVideoSizes.getUserLocale().toLanguageTag();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(languageTag, "");
        java.util.Locale locale = java.util.Locale.ROOT;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        java.lang.String lowerCase = languageTag.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "");
        sb.append(lowerCase);
        if (sendCurrencyCode != null && receiveCurrencyCode != null && destinationCountryCode != null && amount != null) {
            sb.append(androidx.view.exceptions.publickeycredential.DomExceptionUtils.SEPARATOR);
            java.util.Locale locale2 = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale2, "");
            java.lang.String lowerCase2 = sendCurrencyCode.toLowerCase(locale2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            sb.append(lowerCase2);
            sb.append("/send-money/transfer?countryCode=");
            java.util.Locale locale3 = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale3, "");
            java.lang.String upperCase = destinationCountryCode.toUpperCase(locale3);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "");
            sb.append(upperCase);
            sb.append("&destinationCurrencyCode=");
            java.util.Locale locale4 = java.util.Locale.ROOT;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale4, "");
            java.lang.String upperCase2 = receiveCurrencyCode.toUpperCase(locale4);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase2, "");
            sb.append(upperCase2);
            java.lang.String str = amount;
            if (str != null && str.length() != 0) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                int length = str.length();
                int i = 0;
                for (int i2 = 0; i2 < length; i2++) {
                    char charAt = str.charAt(i2);
                    if (java.lang.Character.isDigit(charAt)) {
                        sb2.append(charAt);
                    }
                }
                java.lang.String obj = sb2.toString();
                if (obj.length() != 0) {
                    while (true) {
                        if (i >= obj.length()) {
                            break;
                        }
                        if (kotlin.text.CharsKt.digitToInt(obj.charAt(i)) != 0) {
                            sb.append("&sendAmount=");
                            sb.append(amount);
                            break;
                        }
                        i++;
                    }
                }
            }
            sb.append("&");
        } else {
            sb.append("/usd/send-money/transfer?");
        }
        sb.append("_rt=");
        sb.append(refTag);
        java.lang.String obj2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj2, "");
        return obj2;
    }
}
