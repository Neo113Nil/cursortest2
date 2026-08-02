package org.jose4j.keys;

/* loaded from: classes18.dex */
public class EdDsaKeyUtil extends org.jose4j.keys.OctetKeyPairUtil {
    public static final java.lang.String ED25519 = "Ed25519";
    public static final java.lang.String ED448 = "Ed448";

    public EdDsaKeyUtil() {
        this(null, null);
    }

    public EdDsaKeyUtil(java.lang.String str, java.security.SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    @Override // org.jose4j.keys.KeyPairUtil
    final java.lang.String getHighSpeedVideoFpsRangesFor() {
        return "EDDSA";
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public byte[] rawPublicKey(java.security.Key key) {
        java.security.interfaces.EdECPublicKey edECPublicKey = (java.security.interfaces.EdECPublicKey) key;
        java.security.spec.EdECPoint point = edECPublicKey.getPoint();
        byte[] reverse = org.jose4j.lang.ByteUtil.reverse(point.getY().toByteArray());
        int i = edECPublicKey.getParams().getName().equals("Ed25519") ? 32 : 57;
        if (reverse.length != i) {
            reverse = java.util.Arrays.copyOf(reverse, i);
        }
        byte b = point.isXOdd() ? Byte.MIN_VALUE : (byte) 0;
        int length = reverse.length - 1;
        reverse[length] = (byte) (b | reverse[length]);
        return reverse;
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public byte[] rawPrivateKey(java.security.PrivateKey privateKey) {
        return ((java.security.interfaces.EdECPrivateKey) privateKey).getBytes().orElse(org.jose4j.lang.ByteUtil.EMPTY_BYTES);
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public java.security.interfaces.EdECPublicKey publicKey(byte[] bArr, java.lang.String str) throws org.jose4j.lang.JoseException {
        byte[] bArr2 = (byte[]) bArr.clone();
        byte b = bArr2[bArr2.length - 1];
        int length = bArr2.length - 1;
        bArr2[length] = (byte) (bArr2[length] & Byte.MAX_VALUE);
        try {
            return (java.security.interfaces.EdECPublicKey) getKeyFactory().generatePublic(new java.security.spec.EdECPublicKeySpec(dM_(str), new java.security.spec.EdECPoint((b & Byte.MIN_VALUE) != 0, org.jose4j.keys.BigEndianBigInteger.fromBytes(org.jose4j.lang.ByteUtil.reverse(bArr2)))));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public java.security.interfaces.EdECPrivateKey privateKey(byte[] bArr, java.lang.String str) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.interfaces.EdECPrivateKey) getKeyFactory().generatePrivate(new java.security.spec.EdECPrivateKeySpec(dM_(str), bArr));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    public static boolean isEdECPublicKey(java.security.Key key) {
        return key instanceof java.security.interfaces.EdECPublicKey;
    }

    public static boolean isEdECPrivateKey(java.security.Key key) {
        return key instanceof java.security.interfaces.EdECPrivateKey;
    }
}
