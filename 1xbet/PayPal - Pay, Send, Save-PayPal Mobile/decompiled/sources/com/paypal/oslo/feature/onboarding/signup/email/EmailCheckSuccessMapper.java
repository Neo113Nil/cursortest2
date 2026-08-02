package com.paypal.oslo.feature.onboarding.signup.email;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/email/EmailCheckSuccessMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;", "result", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/Email;", "email", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/email/model/EmailCheckSuccess;", "map-TNt61W4", "(Lcom/paypal/oslo/feature/onboarding/signup/email/domain/model/EmailCheckResult;Ljava/lang/String;)Larrow/core/Either;", "map"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EmailCheckSuccessMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public EmailCheckSuccessMapper() {
    }

    /* renamed from: map-TNt61W4, reason: not valid java name */
    public final arrow.core.Either<com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError, com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess> m16337mapTNt61W4(com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailCheckResult result, java.lang.String email) {
        arrow.core.Either<com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError, com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess> left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        if (result.isExistingAccount()) {
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.ExistingAccount(email, null));
        }
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus onboardingEmailStatus = result.getOnboardingEmailStatus();
        if (onboardingEmailStatus != null) {
            int i = com.paypal.oslo.feature.onboarding.signup.email.EmailCheckSuccessMapper.WhenMappings.$EnumSwitchMapping$0[onboardingEmailStatus.getValidity().ordinal()];
            if (i == 1) {
                left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.BlockedEmail(email, "This email address cannot be used for registration.", null));
            } else if (i == 2) {
                com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email2 = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) onboardingEmailStatus.getSuggestions());
                java.lang.String m15927unboximpl = email2 != null ? email2.m15927unboximpl() : null;
                if (m15927unboximpl != null) {
                    left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.SuggestedCorrection(email, m15927unboximpl, null));
                } else {
                    left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.ConfirmationRequired(email, null));
                }
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckSuccess.AvailableForSignup(email, null));
            }
            if (left != null) {
                return left;
            }
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.email.model.EmailCheckError.DataNotFound("No onboarding email status returned for new user"));
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.BLOCKED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.INVALID.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.signup.email.domain.model.EmailValidity.VALID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
