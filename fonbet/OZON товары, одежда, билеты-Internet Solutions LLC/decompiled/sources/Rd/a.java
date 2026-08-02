package Rd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    static {
        String str;
        try {
            str = System.getProperty("kotlin.jvm.serialization.use8to7");
        } catch (SecurityException unused) {
            str = null;
        }
        "true".equals(str);
    }

    @NotNull
    public static byte[] a(@NotNull String[] strArr) {
        if (strArr == null) {
            Object[] objArr = new Object[3];
            objArr[0] = "data";
            objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/jvm/deserialization/BitEncoding";
            switch (7) {
                case 1:
                case 3:
                case 6:
                case 8:
                case 10:
                case 12:
                case 14:
                    break;
                case 2:
                    objArr[2] = "encode8to7";
                    break;
                case 4:
                    objArr[2] = "addModuloByte";
                    break;
                case 5:
                    objArr[2] = "splitBytesToStringArray";
                    break;
                case 7:
                    objArr[2] = "decodeBytes";
                    break;
                case 9:
                    objArr[2] = "dropMarker";
                    break;
                case 11:
                    objArr[2] = "combineStringArrayIntoBytes";
                    break;
                case 13:
                    objArr[2] = "decode7to8";
                    break;
                default:
                    objArr[2] = "encodeBytes";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
        if (strArr.length > 0 && !strArr[0].isEmpty()) {
            char charAt = strArr[0].charAt(0);
            if (charAt == 0) {
                String[] strings = (String[]) strArr.clone();
                strings[0] = strings[0].substring(1);
                Intrinsics.checkNotNullParameter(strings, "strings");
                int i11 = 0;
                for (String str : strings) {
                    i11 += str.length();
                }
                byte[] bArr = new byte[i11];
                int i12 = 0;
                for (String str2 : strings) {
                    int length = str2.length();
                    int i13 = 0;
                    while (i13 < length) {
                        bArr[i12] = (byte) str2.charAt(i13);
                        i13++;
                        i12++;
                    }
                }
                return bArr;
            }
            if (charAt == 65535) {
                strArr = (String[]) strArr.clone();
                strArr[0] = strArr[0].substring(1);
            }
        }
        int i14 = 0;
        for (String str3 : strArr) {
            i14 += str3.length();
        }
        byte[] bArr2 = new byte[i14];
        int i15 = 0;
        for (String str4 : strArr) {
            int length2 = str4.length();
            int i16 = 0;
            while (i16 < length2) {
                bArr2[i15] = (byte) str4.charAt(i16);
                i16++;
                i15++;
            }
        }
        for (int i17 = 0; i17 < i14; i17++) {
            bArr2[i17] = (byte) ((bArr2[i17] + Byte.MAX_VALUE) & 127);
        }
        int i18 = (i14 * 7) / 8;
        byte[] bArr3 = new byte[i18];
        int i19 = 0;
        int i21 = 0;
        for (int i22 = 0; i22 < i18; i22++) {
            int i23 = i19 + 1;
            int i24 = i21 + 1;
            bArr3[i22] = (byte) (((bArr2[i19] & 255) >>> i21) + ((bArr2[i23] & ((1 << i24) - 1)) << (7 - i21)));
            if (i21 == 6) {
                i19 += 2;
                i21 = 0;
            } else {
                i19 = i23;
                i21 = i24;
            }
        }
        return bArr3;
    }
}
