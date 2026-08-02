package com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aY\u0010\f\u001a\u00020\u000b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r\u001aO\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a)\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\"\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001f"}, d2 = {"", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;", "type", "requiredErrorMessage", "invalidSsnMessage", "invalidItinMessage", "lengthErrorSsn", "lengthErrorItin", "lengthErrorSsn4", "lengthErrorItin4", "Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/ui/TaxpayerIdValidationResult;", "validateTaxpayerId", "(Ljava/lang/String;Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/ui/TaxpayerIdValidationResult;", "ssnErrorMessage", "itinErrorMessage", "ssn4ErrorMessage", "itin4ErrorMessage", "defaultErrorMessage", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "createTaxpayerIdValidationAlert", "(Lcom/paypal/oslo/feature/oneonboarding/inventory/views/taxpayer/domain/TaxpayerIdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/pds/components/textinput/ValidationAlert;", "p0", "", "p1", "p2", "Lcom/paypal/pds/components/textinput/ValidationAlertData;", "Camera2StreamConfigurationMap", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/pds/components/textinput/ValidationAlertData;", "Lkotlin/text/Regex;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlin/text/Regex;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TaxpayerIdViewComponentValidatorKt {
    private static final kotlin.text.Regex getHighResolutionOutputSizeshNQ4ISI = new kotlin.text.Regex("^(?!\\b(\\d)\\1+([ \\-]?)(\\d)\\1+([ \\-]?)(\\d)\\1+\\b)(?!123-45-6789|123 45 6789|123456789|219-09-9999|219099999|078-05-1120|078051120)(?!(000|666)|9\\d{2})\\d{3}([ \\-]?)(?!00)\\d{2}([ \\-]?)(?!0{4})\\d{4}$");
    private static final kotlin.text.Regex getHighSpeedVideoSizes = new kotlin.text.Regex("^9[0-9]{2}-?(5[0-9]|6[0-5]|7[0-9]|8[0-8]|9[0-24-9])-?[0-9]{4}$");

    public static final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult validateTaxpayerId(java.lang.String str, com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        java.lang.String str9 = str;
        if (str9 == null || str9.length() == 0) {
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.RequiredButEmpty(str2);
        }
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt.WhenMappings.$EnumSwitchMapping$0[taxpayerIdType.ordinal()];
        if (i == 1) {
            if (str.length() != 9) {
                return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str5);
            }
            if (!getHighResolutionOutputSizeshNQ4ISI.matches(str9)) {
                return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str3);
            }
            return com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE;
        }
        if (i == 2) {
            if (str.length() != 9) {
                return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str6);
            }
            if (!getHighSpeedVideoSizes.matches(str9)) {
                return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str4);
            }
            return com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE;
        }
        if (i == 3) {
            if (str.length() != 4) {
                return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str7);
            }
            return com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE;
        }
        if (i != 4) {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str2);
        }
        if (str.length() != 4) {
            return new com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Invalid(str8);
        }
        return com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdValidationResult.Valid.INSTANCE;
    }

    public static final com.paypal.pds.components.textinput.ValidationAlert createTaxpayerIdValidationAlert(final com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, final java.lang.String str, final java.lang.String str2, final java.lang.String str3, final java.lang.String str4, final java.lang.String str5, final java.lang.String str6, final java.lang.String str7) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(taxpayerIdType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        return com.paypal.pds.components.textinput.ValidationAlert.INSTANCE.invoke(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt.$r8$lambda$YdwV4Dk__zyTyZCnB4gCeYuHH0Y(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.this, str, str6, str2, str7, str3, str4, str5, (java.lang.String) obj);
            }
        });
    }

    private static final com.paypal.pds.components.textinput.ValidationAlertData Camera2StreamConfigurationMap(java.lang.String str, java.lang.String str2) {
        if (str.length() <= 0 || str.length() == 4) {
            return null;
        }
        return new com.paypal.pds.components.textinput.ValidationAlertData(str2, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$YdwV4Dk__zyTyZCnB4gCeYuHH0Y(com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType taxpayerIdType, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str8, "");
        int i = com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.ui.TaxpayerIdViewComponentValidatorKt.WhenMappings.$EnumSwitchMapping$0[taxpayerIdType.ordinal()];
        if (i == 1) {
            java.lang.String str9 = str8;
            if (str9.length() != 0) {
                if (str8.length() != 9) {
                    return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
                }
                if (!getHighResolutionOutputSizeshNQ4ISI.matches(str9)) {
                    return new com.paypal.pds.components.textinput.ValidationAlertData(str2, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
                }
            }
            return null;
        }
        if (i == 2) {
            java.lang.String str10 = str8;
            if (str10.length() != 0) {
                if (str8.length() != 9) {
                    return new com.paypal.pds.components.textinput.ValidationAlertData(str3, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
                }
                if (!getHighSpeedVideoSizes.matches(str10)) {
                    return new com.paypal.pds.components.textinput.ValidationAlertData(str4, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
                }
            }
            return null;
        }
        if (i == 3) {
            return Camera2StreamConfigurationMap(str8, str5);
        }
        if (i == 4) {
            return Camera2StreamConfigurationMap(str8, str6);
        }
        if (i != 5) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (str8.length() > 0) {
            return new com.paypal.pds.components.textinput.ValidationAlertData(str7, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
        }
        return null;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.values().length];
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.SSN4.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.ITIN4.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.oneonboarding.inventory.views.taxpayer.domain.TaxpayerIdType.UNKNOWN__.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
