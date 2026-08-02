package com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.mapping;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinField;", "Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinValidationError;", "pinField", "Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;", "toUiString", "(Ljava/util/Map;Lcom/paypal/oslo/feature/revolvingcreditservicing/domain/model/managepin/PinField;)Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/common/components/UiString;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PinValidationErrorMappingKt {
    public static final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString toUiString(java.util.Map<com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField, ? extends com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError> map, com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField pinField) {
        com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly stringResOnly;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pinField, "");
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError pinValidationError = map.get(pinField);
        if (pinValidationError == null) {
            pinValidationError = null;
        }
        com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError pinValidationError2 = pinValidationError;
        int i = pinValidationError2 == null ? -1 : com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.mapping.PinValidationErrorMappingKt.WhenMappings.$EnumSwitchMapping$1[pinValidationError2.ordinal()];
        if (i == -1) {
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_sequential_digits_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            if (i == 3) {
                return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_same_digits_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            }
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_mismatch_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        int i2 = com.paypal.oslo.feature.revolvingcreditservicing.ui.managepin.createpin.mapping.PinValidationErrorMappingKt.WhenMappings.$EnumSwitchMapping$0[pinField.ordinal()];
        if (i2 == 1) {
            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_short_pin_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        } else {
            if (i2 != 2) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            stringResOnly = new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.UiString.StringResOnly(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_manage_pin_short_confirmation_error, (com.paypal.oslo.feature.revolvingcreditservicing.api.model.CreditProductIdentifier) null, false, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null);
        }
        return stringResOnly;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.PIN.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinField.CONFIRMATION.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.values().length];
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.TOO_SHORT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.SEQUENTIAL_DIGITS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.SAME_DIGITS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.paypal.oslo.feature.revolvingcreditservicing.domain.model.managepin.PinValidationError.MISMATCH.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
