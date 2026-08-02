package com.paypal.oslo.feature.onboarding.validators.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationErrorStyle;", "Lcom/paypal/pds/components/ContextualAlertStyle;", "toAlertStyle", "(Lcom/paypal/oslo/feature/onboarding/validators/domain/ValidationErrorStyle;)Lcom/paypal/pds/components/ContextualAlertStyle;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ValidatorMapperKt {
    public static final com.paypal.pds.components.ContextualAlertStyle toAlertStyle(com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle validationErrorStyle) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(validationErrorStyle, "");
        int i = com.paypal.oslo.feature.onboarding.validators.ui.ValidatorMapperKt.WhenMappings.$EnumSwitchMapping$0[validationErrorStyle.ordinal()];
        if (i == 1) {
            return com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle.NEGATIVE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.validators.domain.ValidationErrorStyle.NEUTRAL.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
