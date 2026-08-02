package com.paypal.oslo.feature.identity.shared.data;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/data/PKCEGeneratorImpl;", "Lcom/paypal/oslo/feature/identity/shared/domain/PKCEGenerator;", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEPair;", "generate", "()Lcom/paypal/oslo/feature/identity/shared/domain/model/PKCEPair;", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PKCEGeneratorImpl implements com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator {
    public static final int $stable = 0;

    @javax.inject.Inject
    public PKCEGeneratorImpl() {
    }

    @Override // com.paypal.oslo.feature.identity.shared.domain.PKCEGenerator
    public final com.paypal.oslo.feature.identity.shared.domain.model.PKCEPair generate() {
        byte[] bArr = new byte[32];
        new java.security.SecureRandom().nextBytes(bArr);
        java.lang.String encodeToString = java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(bArr);
        kotlin.jvm.internal.Intrinsics.checkNotNull(encodeToString);
        byte[] bytes = encodeToString.getBytes(kotlin.text.Charsets.US_ASCII);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        java.lang.String encodeToString2 = java.util.Base64.getUrlEncoder().withoutPadding().encodeToString(java.security.MessageDigest.getInstance("SHA-256").digest(bytes));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encodeToString2, "");
        return new com.paypal.oslo.feature.identity.shared.domain.model.PKCEPair(encodeToString, encodeToString2, com.paypal.oslo.feature.identity.sso.data.mapper.PKCEChallengeMethodMapper.S256_STRING);
    }
}
