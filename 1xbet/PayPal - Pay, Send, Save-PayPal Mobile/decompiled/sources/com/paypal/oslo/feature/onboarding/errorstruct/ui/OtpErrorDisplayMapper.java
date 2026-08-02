package com.paypal.oslo.feature.onboarding.errorstruct.ui;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/errorstruct/ui/OtpErrorDisplayMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;", "error", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "mapToOtpErrorDisplay", "(Lcom/paypal/oslo/feature/onboarding/errorstruct/domain/model/ApiCallError;)Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay;", "Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$PageLevel;", "getHighSpeedVideoFpsRanges", "()Lcom/paypal/oslo/feature/onboarding/signup/ui/model/OtpErrorDisplay$PageLevel;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OtpErrorDisplayMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public OtpErrorDisplayMapper() {
    }

    public final com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay mapToOtpErrorDisplay(com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError error) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(error, "");
        if (error instanceof com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) {
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue issue = (com.paypal.oslo.feature.onboarding.errorstruct.domain.model.Issue) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) ((com.paypal.oslo.feature.onboarding.errorstruct.domain.model.ApiCallError.RequestError) error).getIssues());
            com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode errorCode = issue != null ? issue.getErrorCode() : null;
            int i = errorCode == null ? -1 : com.paypal.oslo.feature.onboarding.errorstruct.ui.OtpErrorDisplayMapper.WhenMappings.$EnumSwitchMapping$0[errorCode.ordinal()];
            if (i == 1) {
                return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_verification_invalid_code, new java.lang.Object[0]), "INVALID_CODE");
            }
            if (i == 2) {
                return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.FieldLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_verification_expired_code, new java.lang.Object[0]), "EXPIRED_CODE");
            }
            if (i == 3) {
                return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_verification_confirm_max_attempts, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_verification_confirm_max_attempts_desc, new java.lang.Object[0]), "CONFIRM_MAX_ATTEMPTS");
            }
            if (i == 4) {
                return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_verification_max_attempts, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_error_verification_max_attempts_desc, new java.lang.Object[0]), com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.domain.error.PhoneContextualErrorMapperKt.InitiateMaxAttempts);
            }
            return getHighSpeedVideoFpsRanges();
        }
        return getHighSpeedVideoFpsRanges();
    }

    private static com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel getHighSpeedVideoFpsRanges() {
        return new com.paypal.oslo.feature.onboarding.signup.ui.model.OtpErrorDisplay.PageLevel(com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_api_error_title, new java.lang.Object[0]), com.paypal.oslo.core.commonui.utils.RefTextKt.stringResourceRef(com.paypal.oslo.feature.onboarding.R.string.feature_onboarding_api_error_description, new java.lang.Object[0]), "UNKNOWN");
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.INVALID_CODE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.EXPIRED_CODE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.CONFIRM_MAX_ATTEMPTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.errorstruct.domain.model.CosErrorCode.INITIATE_MAX_ATTEMPTS.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
