package org.jose4j.keys;

/* loaded from: classes18.dex */
public class XDHKeyUtil extends org.jose4j.keys.OctetKeyPairUtil {
    public static final java.lang.String X25519 = "X25519";
    public static final java.lang.String X448 = "X448";
    private static final java.math.BigInteger getHighSpeedVideoSizes = new java.math.BigInteger("57896044618658097711785492504343953926634992332820282019728792003956564819949");
    private static final java.math.BigInteger getHighSpeedVideoFpsRangesFor = new java.math.BigInteger("726838724295606890549323807888004534353641360687318060281490199180612328166730772686396383698676545930088884461843637361053498018365439");

    public XDHKeyUtil() {
        this(null, null);
    }

    public XDHKeyUtil(java.lang.String str, java.security.SecureRandom secureRandom) {
        super(str, secureRandom);
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public byte[] rawPublicKey(java.security.Key key) {
        java.security.interfaces.XECPublicKey xECPublicKey = (java.security.interfaces.XECPublicKey) key;
        java.math.BigInteger u = xECPublicKey.getU();
        boolean equals = "X25519".equals(((java.security.spec.NamedParameterSpec) xECPublicKey.getParams()).getName());
        byte[] reverse = org.jose4j.lang.ByteUtil.reverse(u.mod(equals ? getHighSpeedVideoSizes : getHighSpeedVideoFpsRangesFor).toByteArray());
        int i = equals ? 32 : 57;
        return reverse.length != i ? java.util.Arrays.copyOf(reverse, i) : reverse;
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public byte[] rawPrivateKey(java.security.PrivateKey privateKey) {
        return ((java.security.interfaces.XECPrivateKey) privateKey).getScalar().orElse(org.jose4j.lang.ByteUtil.EMPTY_BYTES);
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public java.security.interfaces.XECPublicKey publicKey(byte[] bArr, java.lang.String str) throws org.jose4j.lang.JoseException {
        java.security.spec.NamedParameterSpec dM_ = dM_(str);
        byte[] reverse = org.jose4j.lang.ByteUtil.reverse(bArr);
        if (("X25519".equals(str) ? 255 : 448) % 8 != 0) {
            reverse[0] = (byte) (reverse[0] & Byte.MAX_VALUE);
        }
        try {
            return (java.security.interfaces.XECPublicKey) getKeyFactory().generatePublic(new java.security.spec.XECPublicKeySpec(dM_, new java.math.BigInteger(1, reverse)));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    @Override // org.jose4j.keys.OctetKeyPairUtil
    public java.security.interfaces.XECPrivateKey privateKey(byte[] bArr, java.lang.String str) throws org.jose4j.lang.JoseException {
        try {
            return (java.security.interfaces.XECPrivateKey) getKeyFactory().generatePrivate(new java.security.spec.XECPrivateKeySpec(dM_(str), bArr));
        } catch (java.security.spec.InvalidKeySpecException e) {
            throw new org.jose4j.lang.JoseException("Invalid key spec: ".concat(java.lang.String.valueOf(e)), e);
        }
    }

    @Override // org.jose4j.keys.KeyPairUtil
    final java.lang.String getHighSpeedVideoFpsRangesFor() {
        return "XDH";
    }

    public static boolean isXECPublicKey(java.security.Key key) {
        return key instanceof java.security.interfaces.XECPublicKey;
    }

    public static boolean isXECPrivateKey(java.security.Key key) {
        return key instanceof java.security.interfaces.XECPrivateKey;
    }
}
