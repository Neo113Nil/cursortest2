package com.paypal.oslo.feature.oneonboarding.data.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002*\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\u000b\u001a\n\u0018\u00010\tj\u0004\u0018\u0001`\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardAccountCreationInput;", "toAccountCreationInitialInput", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationInput;", "Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;", "Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "toPhoneInput", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/Phone;)Lcom/paypal/oslo/api/graphql/schema/type/PhoneInput;", "Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInput;", "Lcom/paypal/oslo/feature/oneonboarding/graphql/type/OnboardAccountCreationSignUpWithGoogleInput;", "toAccountCreationSignUpWithGoogleInput", "(Lcom/paypal/oslo/feature/oneonboarding/api/domain/IntentId;)Lcom/paypal/oslo/api/graphql/schema/type/OnboardAccountCreationSignUpWithGoogleInput;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OnboardAccountCreationInitialInputExtensionsKt {
    public static final com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput toAccountCreationInitialInput(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if (!(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation)) {
            return null;
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation accountCreation = (com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreation) intentId;
        java.lang.String m16649getCountryALGuh4w = accountCreation.m16649getCountryALGuh4w();
        java.lang.String m16650getEmailpoA_XDo = accountCreation.m16650getEmailpoA_XDo();
        com.apollographql.apollo.api.Optional.Companion companion = com.apollographql.apollo.api.Optional.INSTANCE;
        com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone = accountCreation.getPhone();
        return new com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationInput(m16649getCountryALGuh4w, m16650getEmailpoA_XDo, companion.presentIfNotNull(phone != null ? toPhoneInput(phone) : null), com.apollographql.apollo.api.Optional.INSTANCE.presentIfNotNull(accountCreation.getPhone() != null ? accountCreation.m16649getCountryALGuh4w() : null), null, 16, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.PhoneInput toPhoneInput(com.paypal.oslo.feature.oneonboarding.api.domain.Phone phone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(phone, "");
        return new com.paypal.oslo.api.graphql.schema.type.PhoneInput(kotlin.text.StringsKt.removePrefix(phone.m16661getCountryCodedGTghNU(), (java.lang.CharSequence) "+"), phone.m16662getPhoneNumber0u3eDS4(), null, 4, null);
    }

    public static final com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput toAccountCreationSignUpWithGoogleInput(com.paypal.oslo.feature.oneonboarding.api.domain.IntentId intentId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intentId, "");
        if (!(intentId instanceof com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle)) {
            return null;
        }
        com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle accountCreationSignupWithGoogle = (com.paypal.oslo.feature.oneonboarding.api.domain.IntentId.AccountCreationSignupWithGoogle) intentId;
        return new com.paypal.oslo.api.graphql.schema.type.OnboardAccountCreationSignUpWithGoogleInput(accountCreationSignupWithGoogle.m16655getCountryALGuh4w(), accountCreationSignupWithGoogle.m16656getGoogleTokenxfBUY5w(), null, 4, null);
    }
}
