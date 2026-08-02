package com.paypal.oslo.feature.identity.userverification.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00000\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Challenge;", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "toAuthOption", "(Lcom/paypal/oslo/feature/identity/graphql/LoginUserMutation$Challenge;)Lcom/paypal/oslo/feature/identity/login/domain/model/AuthOptions;", "", "toAuthOptions", "(Ljava/util/List;)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthChallengeMapperKt {
    public static final com.paypal.oslo.feature.identity.login.domain.model.AuthOptions toAuthOption(com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge challenge) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challenge, "");
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnOneTimePasswordGenerateCodeAuthenticationChallenge onOneTimePasswordGenerateCodeAuthenticationChallenge = challenge.getOnOneTimePasswordGenerateCodeAuthenticationChallenge();
        if (onOneTimePasswordGenerateCodeAuthenticationChallenge != null) {
            java.lang.String nonce = onOneTimePasswordGenerateCodeAuthenticationChallenge.getNonce();
            java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone> phones = onOneTimePasswordGenerateCodeAuthenticationChallenge.getPhones();
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(phones, 10));
            for (com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Phone phone : phones) {
                arrayList.add(new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PhoneChallenge(phone.getPhoneChallengeId(), phone.getMaskedPhoneNumber(), false));
            }
            return new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.OTPAuthOption(nonce, arrayList);
        }
        com.paypal.oslo.feature.identity.graphql.LoginUserMutation.OnGenericAuthenticationChallenge onGenericAuthenticationChallenge = challenge.getOnGenericAuthenticationChallenge();
        if (onGenericAuthenticationChallenge == null) {
            return null;
        }
        int i = com.paypal.oslo.feature.identity.userverification.data.mapper.AuthChallengeMapperKt.WhenMappings.$EnumSwitchMapping$0[onGenericAuthenticationChallenge.getChallengeType().ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasswordAuthOption.INSTANCE;
        }
        if (i != 2) {
            return null;
        }
        return new com.paypal.oslo.feature.identity.login.domain.model.AuthOptions.PasskeyAuthOption(kotlin.collections.CollectionsKt.emptyList());
    }

    public static final java.util.List<com.paypal.oslo.feature.identity.login.domain.model.AuthOptions> toAuthOptions(java.util.List<com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.identity.login.domain.model.AuthOptions authOption = toAuthOption((com.paypal.oslo.feature.identity.graphql.LoginUserMutation.Challenge) it.next());
            if (authOption != null) {
                arrayList.add(authOption);
            }
        }
        return arrayList;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSWORD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.AuthenticationChallengeType.PASSKEY.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
