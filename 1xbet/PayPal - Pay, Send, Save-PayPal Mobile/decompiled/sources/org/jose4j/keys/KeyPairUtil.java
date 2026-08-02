package org.jose4j.keys;

/* loaded from: classes18.dex */
abstract class KeyPairUtil {
    protected java.lang.String provider;
    protected java.security.SecureRandom secureRandom;

    abstract java.lang.String getHighSpeedVideoFpsRangesFor();

    protected KeyPairUtil(java.lang.String str, java.security.SecureRandom secureRandom) {
        this.provider = str;
        this.secureRandom = secureRandom;
    }

    protected java.security.KeyFactory getKeyFactory() throws org.jose4j.lang.JoseException {
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.String str = this.provider;
            return str == null ? java.security.KeyFactory.getInstance(highSpeedVideoFpsRangesFor) : java.security.KeyFactory.getInstance(highSpeedVideoFpsRangesFor, str);
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't find ");
            sb.append(highSpeedVideoFpsRangesFor);
            sb.append(" KeyFactory! ");
            sb.append(e);
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot get KeyFactory instance with provider ");
            sb2.append(this.provider);
            throw new org.jose4j.lang.JoseException(sb2.toString(), e2);
        }
    }

    protected java.security.KeyPairGenerator getKeyPairGenerator() throws org.jose4j.lang.JoseException {
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        try {
            java.lang.String str = this.provider;
            return str == null ? java.security.KeyPairGenerator.getInstance(highSpeedVideoFpsRangesFor) : java.security.KeyPairGenerator.getInstance(highSpeedVideoFpsRangesFor, str);
        } catch (java.security.NoSuchAlgorithmException e) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't find ");
            sb.append(highSpeedVideoFpsRangesFor);
            sb.append(" KeyPairGenerator! ");
            sb.append(e);
            throw new org.jose4j.lang.JoseException(sb.toString(), e);
        } catch (java.security.NoSuchProviderException e2) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot get KeyPairGenerator instance with provider ");
            sb2.append(this.provider);
            throw new org.jose4j.lang.JoseException(sb2.toString(), e2);
        }
    }

    public java.security.PublicKey fromPemEncoded(java.lang.String str) throws org.jose4j.lang.JoseException, java.security.spec.InvalidKeySpecException {
        return getKeyFactory().generatePublic(new java.security.spec.X509EncodedKeySpec(org.jose4j.base64url.SimplePEMEncoder.decode(str.substring(str.indexOf("-----BEGIN PUBLIC KEY-----") + 26, str.indexOf("-----END PUBLIC KEY-----")).trim())));
    }

    public static java.lang.String pemEncode(java.security.PublicKey publicKey) {
        byte[] encoded = publicKey.getEncoded();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("-----BEGIN PUBLIC KEY-----\r\n");
        sb.append(org.jose4j.base64url.SimplePEMEncoder.encode(encoded));
        sb.append("-----END PUBLIC KEY-----");
        return sb.toString();
    }

    public boolean isAvailable() {
        java.util.Set<java.lang.String> algorithms = java.security.Security.getAlgorithms("KeyFactory");
        java.util.Set<java.lang.String> algorithms2 = java.security.Security.getAlgorithms("KeyPairGenerator");
        java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor();
        return algorithms2.contains(highSpeedVideoFpsRangesFor) && algorithms.contains(highSpeedVideoFpsRangesFor);
    }
}
