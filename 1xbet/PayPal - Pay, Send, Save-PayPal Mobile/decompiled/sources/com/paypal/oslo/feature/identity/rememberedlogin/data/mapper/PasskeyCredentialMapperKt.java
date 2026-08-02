package com.paypal.oslo.feature.identity.rememberedlogin.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0000*\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyAllowedCredential;", "Lcom/paypal/oslo/feature/identity/rememberedlogin/data/model/PasskeyAllowedCredentialData;", "toData", "(Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyAllowedCredential;)Lcom/paypal/oslo/feature/identity/rememberedlogin/data/model/PasskeyAllowedCredentialData;", "toDomain", "(Lcom/paypal/oslo/feature/identity/rememberedlogin/data/model/PasskeyAllowedCredentialData;)Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/PasskeyAllowedCredential;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PasskeyCredentialMapperKt {
    public static final com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData toData(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential passkeyAllowedCredential) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAllowedCredential, "");
        return new com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData(passkeyAllowedCredential.getId(), passkeyAllowedCredential.getType(), passkeyAllowedCredential.getTransports());
    }

    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential toDomain(com.paypal.oslo.feature.identity.rememberedlogin.data.model.PasskeyAllowedCredentialData passkeyAllowedCredentialData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(passkeyAllowedCredentialData, "");
        return new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.PasskeyAllowedCredential(passkeyAllowedCredentialData.getId(), passkeyAllowedCredentialData.getType(), passkeyAllowedCredentialData.getTransports());
    }
}
