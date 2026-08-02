package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/payair/logic/implementation/CipherEncryptionManager;", "Lcom/payair/logic/implementation/CardEncryptionManager;", "<init>", "()V", "", "certificate", "Lcom/payair/model/CardData;", "cardData", "encryptCardData", "(Ljava/lang/String;Lcom/payair/model/CardData;)Ljava/lang/String;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv, "encryptCvv", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "getEncryptionAlgorithm", "(Ljava/lang/String;)Ljava/lang/String;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CipherEncryptionManager implements com.payair.logic.implementation.CardEncryptionManager {
    @Override // com.payair.logic.implementation.CardEncryptionManager
    public final java.lang.String encryptCardData(java.lang.String certificate, com.payair.model.CardData cardData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardData, "");
        java.lang.String json = new com.google.gson.Gson().toJson(cardData);
        kotlin.jvm.internal.Intrinsics.checkNotNull(json);
        com.nimbusds.jose.jwk.RSAKey parse = com.nimbusds.jose.jwk.RSAKey.parse(certificate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        com.nimbusds.jose.JWEObject jWEObject = new com.nimbusds.jose.JWEObject(new com.nimbusds.jose.JWEHeader.Builder(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256, com.nimbusds.jose.EncryptionMethod.A256CBC_HS512).keyID(parse.getKeyID()).build(), new com.nimbusds.jose.Payload(json));
        jWEObject.encrypt(new com.nimbusds.jose.crypto.RSAEncrypter(parse.toRSAPublicKey()));
        java.lang.String serialize = jWEObject.serialize();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialize, "");
        return serialize;
    }

    @Override // com.payair.logic.implementation.CardEncryptionManager
    public final java.lang.String encryptCvv(java.lang.String certificate, java.lang.String cvv) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cvv, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{\"cvv\":\"");
        sb.append(cvv);
        sb.append("\"}");
        java.lang.String obj = sb.toString();
        com.nimbusds.jose.jwk.RSAKey parse = com.nimbusds.jose.jwk.RSAKey.parse(certificate);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parse, "");
        com.nimbusds.jose.JWEObject jWEObject = new com.nimbusds.jose.JWEObject(new com.nimbusds.jose.JWEHeader.Builder(com.nimbusds.jose.JWEAlgorithm.RSA_OAEP_256, com.nimbusds.jose.EncryptionMethod.A256CBC_HS512).keyID(parse.getKeyID()).build(), new com.nimbusds.jose.Payload(obj));
        jWEObject.encrypt(new com.nimbusds.jose.crypto.RSAEncrypter(parse.toRSAPublicKey()));
        java.lang.String serialize = jWEObject.serialize();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(serialize, "");
        return serialize;
    }

    @Override // com.payair.logic.implementation.CardEncryptionManager
    public final java.lang.String getEncryptionAlgorithm(java.lang.String certificate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificate, "");
        return ((com.payair.logic.implementation.Certificate) new com.google.gson.Gson().fromJson(certificate, com.payair.logic.implementation.Certificate.class)).alg;
    }
}
