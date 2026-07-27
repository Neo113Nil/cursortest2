package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPrivateKeySpec;
import java.security.spec.ECPublicKeySpec;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ڗ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0630 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final byte[] f1724;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final byte[] f1725;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final SecureRandom f1731 = new SecureRandom();

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f1730 = StringFog.decrypt("UPY=\n", "FbVxVaADrGM=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f1729 = StringFog.decrypt("ch4ADg==\n", "N11ERjS4MUM=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f1728 = StringFog.decrypt("Gru4LNjYFXln4A==\n", "UtbZT4uQVEs=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f1727 = StringFog.decrypt("C/GKr78bSsAE24nhnDxugS0=\n", "SrTZgPhYB+8=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f1726 = StringFog.decrypt("Ffd+Ez4sCVdX\n", "ZpIdYwwZPyU=\n");

    static {
        String decrypt = StringFog.decrypt("gdg5CDF2rVuV3Dwd\n", "1Jl9WRwAnHY=\n");
        Charset charset = StandardCharsets.US_ASCII;
        f1725 = decrypt.getBytes(charset);
        f1724 = StringFog.decrypt("Wm7dFbv44X1dasoU\n", "Dy+ZRJaO0FA=\n").getBytes(charset);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0618 m5591(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length != 32) {
            throw new IllegalArgumentException(StringFog.decrypt("hte3miZb1myq55fObVzKbPSgxNg0Sso/67KD1Tke\n", "x5Lkuk0+r0w=\n") + bArr.length);
        }
        if (bArr2.length != 12) {
            throw new IllegalArgumentException(StringFog.decrypt("2TyFTSPqgc/7X6UYPvHPzvtf+V9t55bY+wzkTSrqm4w=\n", "nn/IbU2F76w=\n") + bArr2.length);
        }
        try {
            Cipher cipher = Cipher.getInstance(f1727);
            cipher.init(1, new SecretKeySpec(bArr, StringFog.decrypt("pCy4\n", "5Wnr0fpASeM=\n")), new GCMParameterSpec(128, bArr2));
            cipher.updateAAD(bArr4);
            return new C0618(cipher.doFinal(bArr3));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(StringFog.decrypt("DJvvx9JvC0kosN+Y7FwyACKwnIz0RSoMKQ==\n", "Td686pUsRmk=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0610 m5592() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f1730);
            keyPairGenerator.initialize(new ECGenParameterSpec(f1726), this.f1731);
            KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
            ECPrivateKey eCPrivateKey = (ECPrivateKey) generateKeyPair.getPrivate();
            ECPublicKey eCPublicKey = (ECPublicKey) generateKeyPair.getPublic();
            byte[] m5590 = m5590(eCPrivateKey.getS());
            ECPoint w = eCPublicKey.getW();
            byte[] m55902 = m5590(w.getAffineX());
            byte[] m55903 = m5590(w.getAffineY());
            byte[] bArr = new byte[65];
            bArr[0] = 4;
            System.arraycopy(m55902, 0, bArr, 1, 32);
            System.arraycopy(m55903, 0, bArr, 33, 32);
            return new C0610(m5590, bArr);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(StringFog.decrypt("QiAjVxUwUdlrYS1eHjEDzHAkal4APBTAYTMrV1A/FNQkMStSAg==\n", "BEFKO3BUca0=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5593(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            if (bArr2.length == 65) {
                if (bArr2[0] == 4) {
                    try {
                        String str = f1730;
                        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(str);
                        keyPairGenerator.initialize(new ECGenParameterSpec(f1726));
                        ECParameterSpec params = ((ECPublicKey) keyPairGenerator.generateKeyPair().getPublic()).getParams();
                        ECPrivateKey eCPrivateKey = (ECPrivateKey) KeyFactory.getInstance(str).generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArr), params));
                        ECPublicKey m5589 = m5589(bArr2, params);
                        KeyAgreement keyAgreement = KeyAgreement.getInstance(f1729);
                        keyAgreement.init(eCPrivateKey);
                        keyAgreement.doPhase(m5589, true);
                        byte[] generateSecret = keyAgreement.generateSecret();
                        if (generateSecret.length == 32) {
                            return generateSecret;
                        }
                        if (generateSecret.length < 32) {
                            byte[] bArr3 = new byte[32];
                            System.arraycopy(generateSecret, 0, bArr3, 32 - generateSecret.length, generateSecret.length);
                            return bArr3;
                        }
                        if (generateSecret.length == 65 && generateSecret[0] == 4) {
                            return Arrays.copyOfRange(generateSecret, 1, 33);
                        }
                        return Arrays.copyOfRange(generateSecret, generateSecret.length - 32, generateSecret.length);
                    } catch (GeneralSecurityException e) {
                        throw new RuntimeException(StringFog.decrypt("AKDJvgVnNa9lguqEQGk9syuXrZBEZTyzIQ==\n", "ReON9iUMUNY=\n"), e);
                    }
                }
                throw new IllegalArgumentException(StringFog.decrypt("QAs0vlVgA7R1B3a/SXBX/2MKN6BII1S2ZBZ24kQzFw==\n", "EH5W0jwDI98=\n"));
            }
            throw new IllegalArgumentException(StringFog.decrypt("BeROEyKqMkMw6AwSPrpmCDf0DEl+6XBRIfRfX2O8fEs6/FwNLrphTTG4AF8spmYI\n", "VZEsf0vJEig=\n") + bArr2.length);
        }
        throw new IllegalArgumentException(StringFog.decrypt("3u0qT93+TFLl+joZ0f9aBq79JhmPuAkQ9+smSpCqTh36vw==\n", "jp9DObyKKXI=\n") + bArr.length);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5595(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr.length == 32) {
            if (bArr2.length == 12) {
                if (bArr3.length >= 16) {
                    try {
                        Cipher cipher = Cipher.getInstance(f1727);
                        cipher.init(2, new SecretKeySpec(bArr, StringFog.decrypt("dolO\n", "N8wdb+AeqrM=\n")), new GCMParameterSpec(128, bArr2));
                        cipher.updateAAD(bArr4);
                        return cipher.doFinal(bArr3);
                    } catch (GeneralSecurityException e) {
                        throw new RuntimeException(StringFog.decrypt("mosgcjaTayG/qxAtCKBSaLSgUzkQuUpkvw==\n", "285zX3HQJgE=\n"), e);
                    }
                }
                throw new IllegalArgumentException(StringFog.decrypt("8D8OcudqHhXLIl5t62wCUMc3GTrvbRkEkzQbOuNsShzWNw1uoilcUNEvCn/x\n", "s1Z+GoIYanA=\n"));
            }
            throw new IllegalArgumentException(StringFog.decrypt("l2whVc8N/c61DwEA0hazz7UPXUeBAOrZtVxAVcYN540=\n", "0C9sdaFik60=\n") + bArr2.length);
        }
        throw new IllegalArgumentException(StringFog.decrypt("5eRoaI04iwLJ1Eg8xj+XApeTGyqfKZdRiIFcJ5J9\n", "pKE7SOZd8iI=\n") + bArr.length);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final byte[] m5594(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            String str = f1728;
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(bArr2, str));
            byte[] doFinal = mac.doFinal(bArr);
            byte[] bArr4 = new byte[bArr3.length + 1];
            System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
            bArr4[bArr3.length] = 1;
            Mac mac2 = Mac.getInstance(str);
            mac2.init(new SecretKeySpec(doFinal, str));
            return mac2.doFinal(bArr4);
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(StringFog.decrypt("NGQ8T38gnmRcSx17Nj2aaRVAFik5KpJxGUs=\n", "fC94CV9L+x0=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ECPublicKey m5589(byte[] bArr, ECParameterSpec eCParameterSpec) {
        if (bArr.length == 65 && bArr[0] == 4) {
            return (ECPublicKey) KeyFactory.getInstance(f1730).generatePublic(new ECPublicKeySpec(new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, 33)), new BigInteger(1, Arrays.copyOfRange(bArr, 33, 65))), eCParameterSpec));
        }
        throw new IllegalArgumentException(StringFog.decrypt("dRVyZ3yJeHVJFWdpfZBuME8IYWIwpV91TBRtaGQ=\n", "PHsEBhDgHFU=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static byte[] m5590(BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == 32) {
            return byteArray;
        }
        if (byteArray.length > 32) {
            return Arrays.copyOfRange(byteArray, byteArray.length - 32, byteArray.length);
        }
        byte[] bArr = new byte[32];
        System.arraycopy(byteArray, 0, bArr, 32 - byteArray.length, byteArray.length);
        return bArr;
    }
}
