package com.paypal.android.threeds.security;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/android/threeds/security/TransactionEncrypter;", "Lcom/nimbusds/jose/crypto/DirectEncrypter;", "", "key", "", "counter", "<init>", "([BB)V", "Lcom/nimbusds/jose/JWEHeader;", com.paypal.oslo.feature.p2p.ui.success.utils.SuccessConstants.HEADER, "clearText", "Lcom/nimbusds/jose/JWECryptoParts;", "encrypt", "(Lcom/nimbusds/jose/JWEHeader;[B)Lcom/nimbusds/jose/JWECryptoParts;", "getHighSpeedVideoFpsRangesFor", "B", "getHighSpeedVideoSizes", com.paypal.oslo.feature.taxanddocumentcenter.config.TaxDocumentConstants.SECTION_CRYPTO}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class TransactionEncrypter extends com.nimbusds.jose.crypto.DirectEncrypter {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final byte getHighSpeedVideoSizes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransactionEncrypter(byte[] bArr, byte b) throws com.nimbusds.jose.KeyLengthException {
        super(new javax.crypto.spec.SecretKeySpec(bArr, org.jose4j.keys.AesKey.ALGORITHM));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        this.getHighSpeedVideoSizes = b;
    }

    @Override // com.nimbusds.jose.crypto.DirectEncrypter
    public final com.nimbusds.jose.JWECryptoParts encrypt(com.nimbusds.jose.JWEHeader header, byte[] clearText) throws com.nimbusds.jose.JOSEException {
        byte[] gcmIvStoA;
        com.nimbusds.jose.crypto.impl.AuthenticatedCipherText encrypt;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(header, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clearText, "");
        com.nimbusds.jose.JWEAlgorithm algorithm = header.getAlgorithm();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(algorithm, com.nimbusds.jose.JWEAlgorithm.DIR)) {
            com.paypal.android.logger.Logger logger = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid algorithm: ");
            sb.append(algorithm);
            sb.append(", expected DIR");
            com.paypal.android.logger.Logger.e$default(logger, sb.toString(), null, null, null, 14, null);
            throw new com.nimbusds.jose.JOSEException("Invalid algorithm ".concat(java.lang.String.valueOf(algorithm)));
        }
        com.nimbusds.jose.EncryptionMethod encryptionMethod = header.getEncryptionMethod();
        if (encryptionMethod.cekBitLength() != com.nimbusds.jose.util.ByteUtils.bitLength(getKey().getEncoded())) {
            com.paypal.android.logger.Logger logger2 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            int cekBitLength = encryptionMethod.cekBitLength();
            int bitLength = com.nimbusds.jose.util.ByteUtils.bitLength(getKey().getEncoded());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Key length mismatch: expected ");
            sb2.append(cekBitLength);
            sb2.append(" bits, got ");
            sb2.append(bitLength);
            sb2.append(" bits");
            com.paypal.android.logger.Logger.e$default(logger2, sb2.toString(), null, null, null, 14, null);
            throw new com.nimbusds.jose.KeyLengthException(encryptionMethod.cekBitLength(), encryptionMethod);
        }
        if (encryptionMethod.cekBitLength() != com.nimbusds.jose.util.ByteUtils.bitLength(getKey().getEncoded())) {
            com.paypal.android.logger.Logger logger3 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
            int cekBitLength2 = encryptionMethod.cekBitLength();
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Content Encryption Key length validation failed: expected ");
            sb3.append(cekBitLength2);
            sb3.append(" bits");
            com.paypal.android.logger.Logger.e$default(logger3, sb3.toString(), null, null, null, 14, null);
            int cekBitLength3 = encryptionMethod.cekBitLength();
            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("The Content Encryption Key length for ");
            sb4.append(encryptionMethod);
            sb4.append(" must be ");
            sb4.append(cekBitLength3);
            sb4.append(" bits");
            throw new com.nimbusds.jose.KeyLengthException(sb4.toString());
        }
        byte[] applyCompression = com.nimbusds.jose.crypto.impl.DeflateHelper.applyCompression(header, clearText);
        byte[] compute = com.nimbusds.jose.crypto.impl.AAD.compute(header);
        com.nimbusds.jose.EncryptionMethod encryptionMethod2 = header.getEncryptionMethod();
        if (kotlin.jvm.internal.Intrinsics.areEqual(encryptionMethod2, com.nimbusds.jose.EncryptionMethod.A128CBC_HS256)) {
            gcmIvStoA = com.paypal.android.threeds.security.TransactionEncrypter.Crypto.INSTANCE.getGcmIvStoA(128, this.getHighSpeedVideoSizes);
            encrypt = com.nimbusds.jose.crypto.impl.AESCBC.encryptAuthenticated(getKey(), gcmIvStoA, applyCompression, compute, getJCAContext().getContentEncryptionProvider(), getJCAContext().getMACProvider());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encrypt, "");
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(encryptionMethod2, com.nimbusds.jose.EncryptionMethod.A128GCM)) {
            gcmIvStoA = com.paypal.android.threeds.security.TransactionEncrypter.Crypto.INSTANCE.getGcmIvStoA(96, this.getHighSpeedVideoSizes);
            encrypt = com.nimbusds.jose.crypto.impl.AESGCM.encrypt(getKey(), new com.nimbusds.jose.util.Container(gcmIvStoA), applyCompression, compute, null);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(encrypt, "");
        } else {
            com.paypal.android.logger.Logger.e$default(com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger, "Unsupported encryption method: ".concat(java.lang.String.valueOf(header.getEncryptionMethod())), null, null, null, 14, null);
            throw new com.nimbusds.jose.JOSEException(com.nimbusds.jose.crypto.impl.AlgorithmSupportMessage.unsupportedEncryptionMethod(header.getEncryptionMethod(), com.nimbusds.jose.crypto.DirectEncrypter.SUPPORTED_ENCRYPTION_METHODS));
        }
        com.paypal.android.logger.Logger logger4 = com.paypal.android.threeds.logger.PayPalThreeDsUnifiedLoggerKt.logger;
        com.nimbusds.jose.EncryptionMethod encryptionMethod3 = header.getEncryptionMethod();
        int length = encrypt.getCipherText().length;
        java.lang.StringBuilder sb5 = new java.lang.StringBuilder("Encryption successful for method: ");
        sb5.append(encryptionMethod3);
        sb5.append(", ciphertext size: ");
        sb5.append(length);
        sb5.append(" bytes");
        com.paypal.android.logger.Logger.i$default(logger4, sb5.toString(), null, null, 6, null);
        return new com.nimbusds.jose.JWECryptoParts(header, null, com.nimbusds.jose.util.Base64URL.encode(gcmIvStoA), com.nimbusds.jose.util.Base64URL.encode(encrypt.getCipherText()), com.nimbusds.jose.util.Base64URL.encode(encrypt.getAuthenticationTag()));
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/android/threeds/security/TransactionEncrypter$Crypto;", "", "<init>", "()V", "", "length", "", "sdkCounterStoA", "", "getGcmIvStoA", "(IB)[B"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Crypto {
        public static final int $stable = 0;
        public static final com.paypal.android.threeds.security.TransactionEncrypter.Crypto INSTANCE = new com.paypal.android.threeds.security.TransactionEncrypter.Crypto();

        private Crypto() {
        }

        public final byte[] getGcmIvStoA(int length, byte sdkCounterStoA) {
            int i = length / 8;
            byte[] bArr = new byte[i];
            java.util.Arrays.fill(bArr, (byte) 0);
            bArr[i - 1] = sdkCounterStoA;
            return bArr;
        }
    }
}
