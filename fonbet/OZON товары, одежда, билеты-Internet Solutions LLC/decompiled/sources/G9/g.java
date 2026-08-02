package G9;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.protobuf.DescriptorProtos$Edition;
import h9.v;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o9.EnumC8662d;

/* loaded from: classes9.dex */
final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f9786a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f9787b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c, reason: collision with root package name */
    private static final byte[] f9788c;

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f9789d;

    /* renamed from: e, reason: collision with root package name */
    private static final Charset f9790e;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f9791a;

        static {
            int[] iArr = new int[c.values().length];
            f9791a = iArr;
            try {
                iArr[c.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9791a[c.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9791a[c.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        int i11 = 0;
        byte[] bArr = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        f9788c = bArr;
        f9789d = new byte[UserVerificationMethods.USER_VERIFY_PATTERN];
        f9790e = StandardCharsets.ISO_8859_1;
        Arrays.fill(bArr, (byte) -1);
        int i12 = 0;
        while (true) {
            byte[] bArr2 = f9786a;
            if (i12 >= bArr2.length) {
                break;
            }
            byte b11 = bArr2[i12];
            if (b11 > 0) {
                f9788c[b11] = (byte) i12;
            }
            i12++;
        }
        Arrays.fill(f9789d, (byte) -1);
        while (true) {
            byte[] bArr3 = f9787b;
            if (i11 >= bArr3.length) {
                return;
            }
            byte b12 = bArr3[i11];
            if (b12 > 0) {
                f9789d[b12] = (byte) i11;
            }
            i11++;
        }
    }

    private static void a(byte[] bArr, int i11, int i12, StringBuilder sb2) {
        if (i11 == 1 && i12 == 0) {
            sb2.append((char) 913);
        } else if (i11 % 6 == 0) {
            sb2.append((char) 924);
        } else {
            sb2.append((char) 901);
        }
        int i13 = 0;
        if (i11 >= 6) {
            char[] cArr = new char[5];
            int i14 = 0;
            while (i11 - i14 >= 6) {
                long j11 = 0;
                for (int i15 = 0; i15 < 6; i15++) {
                    j11 = (j11 << 8) + (bArr[i14 + i15] & 255);
                }
                for (int i16 = 0; i16 < 5; i16++) {
                    cArr[i16] = (char) (j11 % 900);
                    j11 /= 900;
                }
                for (int i17 = 4; i17 >= 0; i17--) {
                    sb2.append(cArr[i17]);
                }
                i14 += 6;
            }
            i13 = i14;
        }
        while (i13 < i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x00e2, code lost:
    
        r10 = (r10 - r6) - r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static String b(String str, c cVar, Charset charset) throws v {
        EnumC8662d a11;
        int i11;
        Charset charset2 = charset;
        StringBuilder sb2 = new StringBuilder(str.length());
        Charset charset3 = f9790e;
        if (charset2 == null) {
            charset2 = charset3;
        } else if (!charset3.equals(charset2) && (a11 = EnumC8662d.a(charset2.name())) != null) {
            int d11 = a11.d();
            if (d11 >= 0 && d11 < 900) {
                sb2.append((char) 927);
                sb2.append((char) d11);
            } else if (d11 < 810900) {
                sb2.append((char) 926);
                sb2.append((char) ((d11 / DescriptorProtos$Edition.EDITION_LEGACY_VALUE) - 1));
                sb2.append((char) (d11 % DescriptorProtos$Edition.EDITION_LEGACY_VALUE));
            } else {
                if (d11 >= 811800) {
                    throw new v("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(d11)));
                }
                sb2.append((char) 925);
                sb2.append((char) (810900 - d11));
            }
        }
        int length = str.length();
        int i12 = a.f9791a[cVar.ordinal()];
        if (i12 == 1) {
            d(str, 0, length, sb2, 0);
        } else if (i12 != 2) {
            char c11 = 902;
            if (i12 != 3) {
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < length) {
                    int length2 = str.length();
                    if (i13 < length2) {
                        char charAt = str.charAt(i13);
                        int i16 = i13;
                        int i17 = 0;
                        while (charAt >= '0' && charAt <= '9' && i16 < length2) {
                            i17++;
                            i16++;
                            if (i16 < length2) {
                                charAt = str.charAt(i16);
                            }
                        }
                        i11 = i17;
                    } else {
                        i11 = 0;
                    }
                    if (i11 >= 13) {
                        sb2.append(c11);
                        c(i13, i11, str, sb2);
                        i13 += i11;
                        i14 = 0;
                        i15 = 2;
                    } else {
                        int length3 = str.length();
                        int i18 = i13;
                        while (i18 < length3) {
                            char charAt2 = str.charAt(i18);
                            int i19 = 0;
                            while (i19 < 13 && charAt2 >= '0' && charAt2 <= '9' && i18 < length3) {
                                i19++;
                                i18++;
                                if (i18 < length3) {
                                    charAt2 = str.charAt(i18);
                                }
                            }
                            if (i19 <= 0) {
                                char charAt3 = str.charAt(i18);
                                if (charAt3 != '\t' && charAt3 != '\n' && charAt3 != '\r' && (charAt3 < ' ' || charAt3 > '~')) {
                                    break;
                                }
                                i18++;
                            }
                        }
                        int i21 = i18 - i13;
                        if (i21 >= 5 || i11 == length) {
                            if (i15 != 0) {
                                sb2.append((char) 900);
                                i14 = 0;
                                i15 = 0;
                            }
                            i14 = d(str, i13, i21, sb2, i14);
                            i13 += i21;
                        } else {
                            CharsetEncoder newEncoder = charset2.newEncoder();
                            int length4 = str.length();
                            int i22 = i13;
                            while (i22 < length4) {
                                char charAt4 = str.charAt(i22);
                                int i23 = 0;
                                while (i23 < 13 && charAt4 >= '0' && charAt4 <= '9') {
                                    i23++;
                                    int i24 = i22 + i23;
                                    if (i24 >= length4) {
                                        break;
                                    }
                                    charAt4 = str.charAt(i24);
                                }
                                char charAt5 = str.charAt(i22);
                                if (!newEncoder.canEncode(charAt5)) {
                                    throw new v("Non-encodable character detected: " + charAt5 + " (Unicode: " + ((int) charAt5) + ')');
                                }
                                i22++;
                            }
                            int i25 = i22 - i13;
                            if (i25 == 0) {
                                i25 = 1;
                            }
                            int i26 = i13 + i25;
                            byte[] bytes = str.substring(i13, i26).getBytes(charset2);
                            if (bytes.length == 1 && i15 == 0) {
                                a(bytes, 1, 0, sb2);
                            } else {
                                a(bytes, bytes.length, i15, sb2);
                                i15 = 1;
                                i14 = 0;
                            }
                            i13 = i26;
                        }
                        c11 = 902;
                    }
                }
            } else {
                sb2.append((char) 902);
                c(0, length, str, sb2);
            }
        } else {
            byte[] bytes2 = str.getBytes(charset2);
            a(bytes2, bytes2.length, 1, sb2);
        }
        return sb2.toString();
    }

    private static void c(int i11, int i12, String str, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i12 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i13 = 0;
        while (i13 < i12) {
            sb3.setLength(0);
            int min = Math.min(44, i12 - i13);
            StringBuilder sb4 = new StringBuilder("1");
            int i14 = i11 + i13;
            sb4.append(str.substring(i14, i14 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i13 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e4 A[EDGE_INSN: B:21:0x00e4->B:22:0x00e4 BREAK  A[LOOP:0: B:2:0x000e->B:16:0x000e], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x000e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int d(String str, int i11, int i12, StringBuilder sb2, int i13) {
        char charAt;
        StringBuilder sb3 = new StringBuilder(i12);
        int i14 = i13;
        int i15 = 0;
        while (true) {
            int i16 = i11 + i15;
            char charAt2 = str.charAt(i16);
            byte[] bArr = f9789d;
            byte[] bArr2 = f9788c;
            if (i14 != 0) {
                if (i14 != 1) {
                    if (i14 != 2) {
                        byte b11 = bArr[charAt2];
                        if (b11 != -1) {
                            sb3.append((char) b11);
                        } else {
                            sb3.append((char) 29);
                            i14 = 0;
                        }
                    } else {
                        byte b12 = bArr2[charAt2];
                        if (b12 != -1) {
                            sb3.append((char) b12);
                        } else if (f(charAt2)) {
                            sb3.append((char) 28);
                            i14 = 0;
                        } else if (e(charAt2)) {
                            sb3.append((char) 27);
                            i14 = 1;
                        } else {
                            int i17 = i16 + 1;
                            if (i17 >= i12 || bArr[str.charAt(i17)] == -1) {
                                sb3.append((char) 29);
                                sb3.append((char) bArr[charAt2]);
                            } else {
                                sb3.append((char) 25);
                                i14 = 3;
                            }
                        }
                    }
                } else if (e(charAt2)) {
                    if (charAt2 == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt2 - 'a'));
                    }
                } else if (f(charAt2)) {
                    sb3.append((char) 27);
                    sb3.append((char) (charAt2 - 'A'));
                } else if (bArr2[charAt2] != -1) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr[charAt2]);
                }
                i15++;
                if (i15 < i12) {
                    break;
                }
            } else {
                if (f(charAt2)) {
                    if (charAt2 == ' ') {
                        sb3.append((char) 26);
                    } else {
                        sb3.append((char) (charAt2 - 'A'));
                    }
                } else if (e(charAt2)) {
                    sb3.append((char) 27);
                    i14 = 1;
                } else if (bArr2[charAt2] != -1) {
                    sb3.append((char) 28);
                    i14 = 2;
                } else {
                    sb3.append((char) 29);
                    sb3.append((char) bArr[charAt2]);
                }
                i15++;
                if (i15 < i12) {
                }
            }
        }
        int length = sb3.length();
        char c11 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            if (i18 % 2 != 0) {
                charAt = (char) (sb3.charAt(i18) + (c11 * 30));
                sb2.append(charAt);
            } else {
                charAt = sb3.charAt(i18);
            }
            c11 = charAt;
        }
        if (length % 2 != 0) {
            sb2.append((char) ((c11 * 30) + 29));
        }
        return i14;
    }

    private static boolean e(char c11) {
        if (c11 != ' ') {
            return c11 >= 'a' && c11 <= 'z';
        }
        return true;
    }

    private static boolean f(char c11) {
        if (c11 != ' ') {
            return c11 >= 'A' && c11 <= 'Z';
        }
        return true;
    }
}
