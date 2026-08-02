package com.nimbusds.jose.crypto.impl;

/* loaded from: classes10.dex */
public class AAD {
    public static byte[] compute(com.nimbusds.jose.JWEHeader jWEHeader) {
        return compute(jWEHeader.toBase64URL());
    }

    public static byte[] compute(com.nimbusds.jose.util.Base64URL base64URL) {
        return base64URL.toString().getBytes(java.nio.charset.StandardCharsets.US_ASCII);
    }

    public static byte[] computeLength(byte[] bArr) throws com.nimbusds.jose.util.IntegerOverflowException {
        return java.nio.ByteBuffer.allocate(8).putLong(com.nimbusds.jose.util.ByteUtils.safeBitLength(bArr)).array();
    }
}
