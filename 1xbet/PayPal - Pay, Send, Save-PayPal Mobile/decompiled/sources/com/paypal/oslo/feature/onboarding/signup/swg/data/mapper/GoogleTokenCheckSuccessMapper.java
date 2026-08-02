package com.paypal.oslo.feature.onboarding.signup.swg.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/swg/data/mapper/GoogleTokenCheckSuccessMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/model/SwgCheckResult;", "result", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckError;", "Lcom/paypal/oslo/feature/onboarding/api/swg/model/GoogleTokenCheckSuccess;", "map", "(Lcom/paypal/oslo/feature/onboarding/signup/swg/domain/model/SwgCheckResult;)Larrow/core/Either;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GoogleTokenCheckSuccessMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public GoogleTokenCheckSuccessMapper() {
    }

    public final arrow.core.Either<com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError, com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess> map(com.paypal.oslo.feature.onboarding.signup.swg.domain.model.SwgCheckResult result) {
        arrow.core.Either<com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError, com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess> left;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker = null;
        if (result.isExistingAccount()) {
            java.lang.String m16434getEmailOzvLBP0 = result.m16434getEmailOzvLBP0();
            if (m16434getEmailOzvLBP0 == null) {
                return arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.DataNotFound("No email found in token details"));
            }
            java.lang.String challengeCorrelationId = result.getChallengeCorrelationId();
            return arrow.core.EitherKt.right(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.ExistingAccount(m16434getEmailOzvLBP0, new com.paypal.oslo.feature.onboarding.api.swg.model.ChallengeInfo(challengeCorrelationId != null ? challengeCorrelationId : ""), defaultConstructorMarker));
        }
        java.lang.String m16434getEmailOzvLBP02 = result.m16434getEmailOzvLBP0();
        if (m16434getEmailOzvLBP02 == null) {
            return arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.DataNotFound("No email found in token details"));
        }
        com.paypal.oslo.feature.onboarding.signup.email.domain.model.OnboardingEmailStatus emailStatus = result.getEmailStatus();
        if (emailStatus != null) {
            java.lang.String m16435getFirstNamef_wG9To = result.m16435getFirstNamef_wG9To();
            java.lang.String m16436getLastNameb7a_E3E = result.m16436getLastNameb7a_E3E();
            java.lang.String m16437getProfilePictureUrlnuj4skw = result.m16437getProfilePictureUrlnuj4skw();
            int i = com.paypal.oslo.feature.onboarding.signup.swg.data.mapper.GoogleTokenCheckSuccessMapper.WhenMappings.$EnumSwitchMapping$0[emailStatus.getValidity().ordinal()];
            if (i == 1) {
                left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.BlockedEmail(m16434getEmailOzvLBP02, "This email address cannot be used for registration.", null));
            } else if (i == 2) {
                com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email email = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.Email) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) emailStatus.getSuggestions());
                java.lang.String m15927unboximpl = email != null ? email.m15927unboximpl() : null;
                if (m15927unboximpl != null) {
                    left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.SuggestedCorrection(m16434getEmailOzvLBP02, m15927unboximpl, defaultConstructorMarker));
                } else {
                    left = arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.ConfirmationRequired(m16434getEmailOzvLBP02, null));
                }
            } else {
                if (i != 3) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                left = arrow.core.EitherKt.right(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckSuccess.AvailableForSignup(m16434getEmailOzvLBP02, m16435getFirstNamef_wG9To, m16436getLastNameb7a_E3E, m16437getProfilePictureUrlnuj4skw, null));
            }
            if (left != null) {
                return left;
            }
        }
        return arrow.core.EitherKt.left(new com.paypal.oslo.feature.onboarding.api.swg.model.GoogleTokenCheckError.DataNotFound("No onboarding email status returned for new user"));
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
