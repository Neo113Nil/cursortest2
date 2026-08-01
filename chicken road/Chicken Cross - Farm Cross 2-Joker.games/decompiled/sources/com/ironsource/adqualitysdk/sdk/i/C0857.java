package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.google.common.base.Ascii;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᔭ, reason: contains not printable characters */
/* loaded from: classes6.dex */
public final class C0857 {

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2469;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final byte[] f2470;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2471;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2472;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final SecretKeySpec f2473;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public Cipher f2474;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public Cipher f2475;

    static {
        StringFog.decrypt("ZAt4YmClm/VuHDdHdo+4xi0wRE12maHlawxkb1K+gfU=\n", "DXkXDDPK7oc=\n");
        f2472 = StringFog.decrypt("O9OJdfg=\n", "bofPWMBOQNk=\n");
        StringFog.decrypt("/93erzRI43jn3tq2OS6eHe3Wz7k4T4Zo7dy2uj4=\n", "r5+b+H0cqys=\n");
        f2471 = StringFog.decrypt("ZTe8XbnYCSJ0Oawhz8oraUAbgRU=\n", "JHLvcvqaSg0=\n");
        f2469 = StringFog.decrypt("9ifYSHHBaUr5KZsEa8JqTvsvmxN2x2oJ1A3mKWDIc1T2KcEJcIM3Ww==\n", "lUi1ZgKuBic=\n");
        f2470 = new byte[]{Ascii.DLE, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};
    }

    public C0857(byte[] bArr, String str, String str2, String str3) {
        byte[] digest;
        try {
            digest = SecretKeyFactory.getInstance(StringFog.decrypt("+mAF+RUnn3PiYwHgGEHiFuhrFO8ZIPpj6GFt7B8=\n", "qiJArlxz1yA=\n")).generateSecret(new PBEKeySpec((str + str2 + str3).toCharArray(), bArr, 1024, 256)).getEncoded();
        } catch (GeneralSecurityException unused) {
            String decrypt = StringFog.decrypt("LN++J4ze2R801ZkXuI37OxP1iQ==\n", "Z5r7cc3+mFo=\n");
            String decrypt2 = StringFog.decrypt("gto9VG1jXs3yyTwWZW9R27/YM0JlY17R8sw3QGViV5ry/CBPZW9VlLbBNFBpc1fapogzRnxzXdWx\nwHw=\n", "0qhSNgwBMrQ=\n");
            String str4 = AbstractC0831.f2409;
            AbstractC0544.m5503(decrypt, decrypt2);
            try {
                MessageDigest messageDigest = MessageDigest.getInstance(StringFog.decrypt("X4vL\n", "Es/+vW5ekQk=\n"));
                char[] charArray = (str + str2 + str3).toCharArray();
                for (char c : charArray) {
                    messageDigest.update((byte) c);
                }
                digest = messageDigest.digest();
            } catch (NoSuchAlgorithmException e) {
                throw new RuntimeException(StringFog.decrypt("jGYVcuEwknSgZhV6/zaYOaBmFw==\n", "xQhjE41Z9lQ=\n"), e);
            }
        }
        this.f2473 = new SecretKeySpec(digest, StringFog.decrypt("Y7Nj\n", "IvYwqrDTxzQ=\n"));
        m5686();
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized String m5684(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            try {
                String str2 = new String(this.f2474.doFinal(AbstractC0852.m5683(str)), f2472);
                String str3 = f2469;
                if (str2.indexOf(str3) != 0) {
                    throw new C0879(StringFog.decrypt("41jr09urRj7ESarR0awINIsV49nIuAo5zx3u1sq4Rj/ZHeHSx/Bc\n", "qz2Kt77ZZlA=\n") + str);
                }
                return str2.substring(str3.length(), str2.length());
            } catch (C0842 e) {
                m5686();
                throw new C0879(AbstractC0548.m5514("1w==\n", "7ZLs8NvhtNE=\n", new StringBuilder().append(e.getMessage()), str));
            } catch (BadPaddingException e2) {
                m5686();
                throw new C0879(AbstractC0548.m5514("Ew==\n", "KfSVY7/8piE=\n", new StringBuilder().append(e2.getMessage()), str));
            }
        } catch (UnsupportedEncodingException e3) {
            throw new RuntimeException(StringFog.decrypt("khABjCQpehq+EAGEOi9wV74QAw==\n", "23537UhAHjo=\n"), e3);
        } catch (IllegalBlockSizeException e4) {
            m5686();
            throw new C0879(AbstractC0548.m5514("Ow==\n", "AfqFc10jqGw=\n", new StringBuilder().append(e4.getMessage()), str));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m5686() {
        try {
            String str = f2471;
            Cipher cipher = Cipher.getInstance(str);
            this.f2475 = cipher;
            SecretKeySpec secretKeySpec = this.f2473;
            byte[] bArr = f2470;
            cipher.init(1, secretKeySpec, new IvParameterSpec(bArr));
            Cipher cipher2 = Cipher.getInstance(str);
            this.f2474 = cipher2;
            cipher2.init(2, this.f2473, new IvParameterSpec(bArr));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException(StringFog.decrypt("Mj8MtSA65UEePwy9PjzvDB4/DvR+\n", "e1F61ExTgWE=\n"), e);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized String m5685(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            try {
                return AbstractC0852.m5682(this.f2475.doFinal((f2469 + str).getBytes(f2472)));
            } catch (GeneralSecurityException e) {
                m5686();
                throw new RuntimeException(StringFog.decrypt("YLx5lHpI4OpMvHmcZE7qp0y8ew==\n", "KdIP9RYhhMo=\n"), e);
            }
        } catch (UnsupportedEncodingException e2) {
            m5686();
            throw new RuntimeException(StringFog.decrypt("R2Eb4uRYzxtrYRvq+l7FVmthGQ==\n", "Dg9tg4gxqzs=\n"), e2);
        }
    }
}
