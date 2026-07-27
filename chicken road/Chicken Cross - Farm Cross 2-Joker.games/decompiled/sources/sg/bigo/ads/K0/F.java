package sg.bigo.ads.K0;

import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f12342a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    public static final byte[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN};

    public static byte[] a(byte[] bArr, byte[] bArr2, sg.bigo.ads.Q0.a aVar) {
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(f12342a);
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return cipher.doFinal(bArr);
        } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
            if (aVar != null) {
                aVar.onReceiveValue(e);
            }
            AbstractC5496a.a("SDKCipher", "sdk cipher.decrypt new key failed,input len:" + bArr.length + ",input data:" + Arrays.toString(bArr));
            if (e instanceof NoSuchAlgorithmException) {
                return bArr;
            }
            return null;
        }
    }

    public static String b(String str, sg.bigo.ads.Q0.a aVar) {
        try {
            byte[] a2 = a(str, aVar);
            if (a2 != null) {
                return new String(a2, "UTF-8");
            }
        } catch (Exception e) {
            if (aVar != null) {
                aVar.onReceiveValue(e);
            }
            AbstractC5496a.a("SDKCipher", "Failed to decrypt data: " + str);
        }
        return null;
    }

    public static byte[] a(String str, sg.bigo.ads.Q0.a aVar) {
        try {
            return a(I.a(str), I.a("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F"), aVar);
        } catch (Exception e) {
            if (aVar != null) {
                aVar.onReceiveValue(e);
            }
            AbstractC5496a.a("SDKCipher", "Failed to decrypt data: " + str);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f12342a);
            try {
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                if (e instanceof NoSuchAlgorithmException) {
                    AbstractC5496a.a("SDKCipher", "sdk cipher.encrypt failed, no such algorithm");
                    return bArr;
                }
                AbstractC5496a.a("SDKCipher", "sdk cipher.encrypt failed");
            }
        }
        return null;
    }

    public static String a(String str) {
        try {
            byte[] a2 = a(str.getBytes("UTF-8"), I.a("FEFFFFFFFFFAFFFDCBFFFFFFFFFFFF4F"));
            if (a2 != null && a2.length > 0) {
                StringBuilder sb = new StringBuilder();
                for (byte b2 : a2) {
                    String upperCase = Integer.toHexString(b2 & 255).toUpperCase();
                    if (upperCase.length() < 2) {
                        sb.append(0);
                    }
                    sb.append(upperCase);
                }
                return sb.toString();
            }
            return "";
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }
}
