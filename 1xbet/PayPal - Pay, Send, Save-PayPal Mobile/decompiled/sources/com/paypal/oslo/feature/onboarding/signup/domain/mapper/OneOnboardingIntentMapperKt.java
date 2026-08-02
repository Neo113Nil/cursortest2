package com.paypal.oslo.feature.onboarding.signup.domain.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\u000b\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Email;", "toOneOnboardingEmail", "(Ljava/lang/String;)Ljava/lang/String;", "Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;", "Lcom/paypal/oslo/core/i18n/domain/model/CountryCode;", "countryCode", "email", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "toOneOnboardingIntentId-JmYZZyY", "(Lcom/paypal/oslo/feature/onboarding/api/signup/domain/model/SignupIntent;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "toOneOnboardingIntentId"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OneOnboardingIntentMapperKt {
    public static final java.lang.String toOneOnboardingEmail(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.oneonboarding.api.domain.Email.m16627constructorimpl(str);
    }

    /* renamed from: toOneOnboardingIntentId-JmYZZyY, reason: not valid java name */
    public static final com.paypal.oslo.feature.oneonboarding.api.domain.IntentId m16299toOneOnboardingIntentIdJmYZZyY(com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent signupIntent, java.lang.String str, java.lang.String str2) {
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signupIntent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        int i = com.paypal.oslo.feature.onboarding.signup.domain.mapper.OneOnboardingIntentMapperKt.WhenMappings.$EnumSwitchMapping$0[signupIntent.getFlowEntryPoint().ordinal()];
        if (i == 1) {
            accountCreationEntryPoint = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.PaymentLinks;
        } else if (i == 2) {
            accountCreationEntryPoint = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.MetaP2p;
        } else if (i == 3) {
            accountCreationEntryPoint = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.SharedAuth;
        } else {
            if (i != 4) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            accountCreationEntryPoint = com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint.Organic;
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.AccountCreationEntryPoint accountCreationEntryPoint2 = accountCreationEntryPoint;
        if (signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) {
            com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone signupWithPhone = (com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithPhone) signupIntent;
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation(str, toOneOnboardingEmail(str2), new com.paypal.oslo.feature.oneonboarding.api.domain.Phone(com.paypal.oslo.feature.oneonboarding.api.domain.CountryCode.m16618constructorimpl(com.paypal.oslo.feature.onboarding.api.signup.domain.model.InternationalDialingCode.m15965toStringimpl(signupWithPhone.m16018getDialingCodeWKAk_us())), com.paypal.oslo.feature.oneonboarding.api.domain.PhoneNumber.m16664constructorimpl(signupWithPhone.m16019getPhoneNumbervCycbc()), (kotlin.jvm.internal.DefaultConstructorMarker) null), accountCreationEntryPoint2, null);
        }
        if ((signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithEmail) || (signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithOnboardingEmail)) {
            return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation(str, toOneOnboardingEmail(str2), null, accountCreationEntryPoint2, null);
        }
        if (!(signupIntent instanceof com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle(str, com.paypal.oslo.feature.oneonboarding.api.domain.GoogleToken.m16636constructorimpl(((com.paypal.oslo.feature.onboarding.api.signup.domain.model.SignupIntent.SignupWithGoogle) signupIntent).m16010getGoogleToken7eVPCio()), accountCreationEntryPoint2, null);
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.values().length];
            try {
                iArr[com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.PAYMENT_LINK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.META_P2P.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.SHARED_AUTH.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.onboarding.api.signup.domain.model.FlowEntryPoint.ORGANIC.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
