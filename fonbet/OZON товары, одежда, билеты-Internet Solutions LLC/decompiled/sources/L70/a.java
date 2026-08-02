package L70;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.math.BigInteger;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16591a = {1, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000};

    public static String a(String str, String str2, String str3, String str4) {
        String str5;
        int i11;
        String str6;
        int i12;
        String str7;
        int i13;
        String str8;
        int i14;
        int i15;
        String str9;
        int i16;
        byte[] bArr;
        int length = "OCRA-1:HOTP-SHA1-6:QN08-S128-T1M".getBytes().length;
        String str10 = "OCRA-1:HOTP-SHA1-6:QN08-S128-T1M".split(ProductContainerDTO.RATIO_DELIMITER)[1];
        String str11 = "OCRA-1:HOTP-SHA1-6:QN08-S128-T1M".split(ProductContainerDTO.RATIO_DELIMITER)[2];
        String str12 = str10.toLowerCase().indexOf("sha1") > 1 ? "HmacSHA1" : "";
        if (str10.toLowerCase().indexOf("sha256") > 1) {
            str12 = "HmacSHA256";
        }
        if (str10.toLowerCase().indexOf("sha512") > 1) {
            str12 = "HmacSHA512";
        }
        int intValue = Integer.decode(str10.substring(str10.lastIndexOf("-") + 1)).intValue();
        if (str11.toLowerCase().startsWith("c")) {
            str5 = null;
            while (str5.length() < 16) {
                str5 = "0".concat(str5);
            }
            i11 = 8;
        } else {
            str5 = null;
            i11 = 0;
        }
        if (str11.toLowerCase().startsWith("q") || str11.toLowerCase().indexOf("-q") >= 0) {
            str6 = str2;
            while (str6.length() < 256) {
                str6 = str6.concat("0");
            }
            i12 = 128;
        } else {
            str6 = str2;
            i12 = 0;
        }
        if (str11.toLowerCase().indexOf("psha1") > 1) {
            str7 = null;
            while (str7.length() < 40) {
                str7 = "0".concat(str7);
            }
            i13 = 20;
        } else {
            str7 = null;
            i13 = 0;
        }
        if (str11.toLowerCase().indexOf("psha256") > 1) {
            while (str7.length() < 64) {
                str7 = "0".concat(str7);
            }
            i13 = 32;
        }
        if (str11.toLowerCase().indexOf("psha512") > 1) {
            while (str7.length() < 128) {
                str7 = "0".concat(str7);
            }
            i13 = 64;
        }
        if (str11.toLowerCase().indexOf("s064") > 1) {
            str8 = str3;
            while (str8.length() < 128) {
                str8 = "0".concat(str8);
            }
            i14 = 64;
        } else {
            str8 = str3;
            i14 = 0;
        }
        if (str11.toLowerCase().indexOf("s128") > 1) {
            while (str8.length() < 256) {
                str8 = "0".concat(str8);
            }
            i14 = UserVerificationMethods.USER_VERIFY_PATTERN;
        }
        if (str11.toLowerCase().indexOf("s256") > 1) {
            while (str8.length() < 512) {
                str8 = "0".concat(str8);
            }
            i14 = 256;
        }
        if (str11.toLowerCase().indexOf("s512") > 1) {
            while (str8.length() < 1024) {
                str8 = "0".concat(str8);
            }
            i15 = UserVerificationMethods.USER_VERIFY_NONE;
        } else {
            i15 = i14;
        }
        if (str11.toLowerCase().startsWith("t") || str11.toLowerCase().indexOf("-t") > 1) {
            str9 = str4;
            while (str9.length() < 16) {
                str9 = "0".concat(str9);
            }
            i16 = 8;
        } else {
            str9 = str4;
            i16 = 0;
        }
        byte[] bArr2 = new byte[length + i11 + i12 + i13 + i15 + i16 + 1];
        byte[] bytes = "OCRA-1:HOTP-SHA1-6:QN08-S128-T1M".getBytes();
        String str13 = str9;
        System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
        bArr2[bytes.length] = 0;
        if (i11 > 0) {
            byte[] b11 = b(str5);
            System.arraycopy(b11, 0, bArr2, length + 1, b11.length);
        }
        if (i12 > 0) {
            byte[] b12 = b(str6);
            System.arraycopy(b12, 0, bArr2, length + 1 + i11, b12.length);
        }
        if (i13 > 0) {
            byte[] b13 = b(str7);
            System.arraycopy(b13, 0, bArr2, length + 1 + i11 + i12, b13.length);
        }
        if (i15 > 0) {
            byte[] b14 = b(str8);
            System.arraycopy(b14, 0, bArr2, length + 1 + i11 + i12 + i13, b14.length);
        }
        if (i16 > 0) {
            byte[] b15 = b(str13);
            System.arraycopy(b15, 0, bArr2, length + 1 + i11 + i12 + i13 + i15, b15.length);
        }
        byte[] b16 = b(str);
        try {
            Mac mac = Mac.getInstance(str12);
            mac.init(new SecretKeySpec(b16, "RAW"));
            bArr = mac.doFinal(bArr2);
        } catch (Exception e11) {
            e11.printStackTrace();
            bArr = null;
        }
        int i17 = bArr[bArr.length - 1] & 15;
        String num = Integer.toString(((bArr[i17 + 3] & 255) | ((((bArr[i17] & Byte.MAX_VALUE) << 24) | ((bArr[i17 + 1] & 255) << 16)) | ((bArr[i17 + 2] & 255) << 8))) % f16591a[intValue]);
        while (num.length() < intValue) {
            num = "0".concat(num);
        }
        return num;
    }

    private static byte[] b(String str) {
        byte[] byteArray = new BigInteger(Nk.a.b("10", str), 16).toByteArray();
        int length = byteArray.length - 1;
        byte[] bArr = new byte[length];
        System.arraycopy(byteArray, 1, bArr, 0, length);
        return bArr;
    }
}
