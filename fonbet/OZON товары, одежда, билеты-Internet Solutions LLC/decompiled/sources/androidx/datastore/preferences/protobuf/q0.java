package androidx.datastore.preferences.protobuf;

import B0.A0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.nio.charset.Charset;
import java.util.Arrays;

/* loaded from: classes.dex */
final class q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final b f42609a;

    private static class a {
        static void a(byte b11, byte b12, byte b13, byte b14, char[] cArr, int i11) throws C5379z {
            if (!d(b12)) {
                if ((((b12 + 112) + (b11 << 28)) >> 30) == 0 && !d(b13) && !d(b14)) {
                    int i12 = ((b11 & 7) << 18) | ((b12 & 63) << 12) | ((b13 & 63) << 6) | (b14 & 63);
                    cArr[i11] = (char) ((i12 >>> 10) + 55232);
                    cArr[i11 + 1] = (char) ((i12 & 1023) + 56320);
                    return;
                }
            }
            throw C5379z.b();
        }

        static void b(byte b11, byte b12, char[] cArr, int i11) throws C5379z {
            if (b11 < -62 || d(b12)) {
                throw C5379z.b();
            }
            cArr[i11] = (char) (((b11 & 31) << 6) | (b12 & 63));
        }

        static void c(byte b11, byte b12, byte b13, char[] cArr, int i11) throws C5379z {
            if (d(b12) || ((b11 == -32 && b12 < -96) || ((b11 == -19 && b12 >= -96) || d(b13)))) {
                throw C5379z.b();
            }
            cArr[i11] = (char) (((b11 & 15) << 12) | ((b12 & 63) << 6) | (b13 & 63));
        }

        private static boolean d(byte b11) {
            return b11 > -65;
        }
    }

    static abstract class b {
        abstract String a(byte[] bArr, int i11, int i12) throws C5379z;

        abstract int b(String str, byte[] bArr, int i11, int i12);
    }

    static final class c extends b {
        @Override // androidx.datastore.preferences.protobuf.q0.b
        final String a(byte[] bArr, int i11, int i12) throws C5379z {
            if ((i11 | i12 | ((bArr.length - i11) - i12)) < 0) {
                throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
            }
            int i13 = i11 + i12;
            char[] cArr = new char[i12];
            int i14 = 0;
            while (i11 < i13) {
                byte b11 = bArr[i11];
                if (b11 < 0) {
                    break;
                }
                i11++;
                cArr[i14] = (char) b11;
                i14++;
            }
            int i15 = i14;
            while (i11 < i13) {
                int i16 = i11 + 1;
                byte b12 = bArr[i11];
                if (b12 >= 0) {
                    int i17 = i15 + 1;
                    cArr[i15] = (char) b12;
                    int i18 = i16;
                    while (i18 < i13) {
                        byte b13 = bArr[i18];
                        if (b13 < 0) {
                            break;
                        }
                        i18++;
                        cArr[i17] = (char) b13;
                        i17++;
                    }
                    i15 = i17;
                    i11 = i18;
                } else if (b12 < -32) {
                    if (i16 >= i13) {
                        throw C5379z.b();
                    }
                    i11 += 2;
                    a.b(b12, bArr[i16], cArr, i15);
                    i15++;
                } else if (b12 < -16) {
                    if (i16 >= i13 - 1) {
                        throw C5379z.b();
                    }
                    int i19 = i11 + 2;
                    i11 += 3;
                    a.c(b12, bArr[i16], bArr[i19], cArr, i15);
                    i15++;
                } else {
                    if (i16 >= i13 - 2) {
                        throw C5379z.b();
                    }
                    byte b14 = bArr[i16];
                    int i21 = i11 + 3;
                    byte b15 = bArr[i11 + 2];
                    i11 += 4;
                    a.a(b12, b14, b15, bArr[i21], cArr, i15);
                    i15 += 2;
                }
            }
            return new String(cArr, 0, i15);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x001d, code lost:
        
            return r10 + r0;
         */
        @Override // androidx.datastore.preferences.protobuf.q0.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        final int b(String str, byte[] bArr, int i11, int i12) {
            int i13;
            int i14;
            char charAt;
            int length = str.length();
            int i15 = i12 + i11;
            int i16 = 0;
            while (i16 < length && (i14 = i16 + i11) < i15 && (charAt = str.charAt(i16)) < 128) {
                bArr[i14] = (byte) charAt;
                i16++;
            }
            int i17 = i11 + i16;
            while (i16 < length) {
                char charAt2 = str.charAt(i16);
                if (charAt2 < 128 && i17 < i15) {
                    bArr[i17] = (byte) charAt2;
                    i17++;
                } else if (charAt2 < 2048 && i17 <= i15 - 2) {
                    int i18 = i17 + 1;
                    bArr[i17] = (byte) ((charAt2 >>> 6) | 960);
                    i17 += 2;
                    bArr[i18] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                } else {
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || i17 > i15 - 3) {
                        if (i17 > i15 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i16 + 1) == str.length() || !Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                                throw new d(i16, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i17);
                        }
                        int i19 = i16 + 1;
                        if (i19 != str.length()) {
                            char charAt3 = str.charAt(i19);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                bArr[i17] = (byte) ((codePoint >>> 18) | 240);
                                bArr[i17 + 1] = (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                int i21 = i17 + 3;
                                bArr[i17 + 2] = (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i17 += 4;
                                bArr[i21] = (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                                i16 = i19;
                            } else {
                                i16 = i19;
                            }
                        }
                        throw new d(i16 - 1, length);
                    }
                    bArr[i17] = (byte) ((charAt2 >>> '\f') | 480);
                    int i22 = i17 + 2;
                    bArr[i17 + 1] = (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN);
                    i17 += 3;
                    bArr[i22] = (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN);
                }
                i16++;
            }
            return i17;
        }
    }

    static class d extends IllegalArgumentException {
        d(int i11, int i12) {
            super(A0.a(i11, i12, "Unpaired surrogate at index ", " of "));
        }
    }

    static final class e extends b {
        @Override // androidx.datastore.preferences.protobuf.q0.b
        final String a(byte[] bArr, int i11, int i12) throws C5379z {
            Charset charset = C5378y.f42628a;
            String str = new String(bArr, i11, i12, charset);
            if (str.indexOf(65533) >= 0 && !Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i11, i12 + i11))) {
                throw C5379z.b();
            }
            return str;
        }

        @Override // androidx.datastore.preferences.protobuf.q0.b
        final int b(String str, byte[] bArr, int i11, int i12) {
            long j11;
            long j12;
            long j13;
            int i13;
            char charAt;
            long j14 = i11;
            long j15 = i12 + j14;
            int length = str.length();
            if (length > i12 || bArr.length - i12 < i11) {
                throw new ArrayIndexOutOfBoundsException("Failed writing " + str.charAt(length - 1) + " at index " + (i11 + i12));
            }
            int i14 = 0;
            while (true) {
                j11 = 1;
                if (i14 >= length || (charAt = str.charAt(i14)) >= 128) {
                    break;
                }
                p0.x(bArr, j14, (byte) charAt);
                i14++;
                j14 = 1 + j14;
            }
            if (i14 == length) {
                return (int) j14;
            }
            while (i14 < length) {
                char charAt2 = str.charAt(i14);
                if (charAt2 < 128 && j14 < j15) {
                    p0.x(bArr, j14, (byte) charAt2);
                    j13 = j15;
                    j12 = j11;
                    j14 += j11;
                } else if (charAt2 >= 2048 || j14 > j15 - 2) {
                    j12 = j11;
                    if ((charAt2 >= 55296 && 57343 >= charAt2) || j14 > j15 - 3) {
                        j13 = j15;
                        if (j14 > j13 - 4) {
                            if (55296 <= charAt2 && charAt2 <= 57343 && ((i13 = i14 + 1) == length || !Character.isSurrogatePair(charAt2, str.charAt(i13)))) {
                                throw new d(i14, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + j14);
                        }
                        int i15 = i14 + 1;
                        if (i15 != length) {
                            char charAt3 = str.charAt(i15);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                p0.x(bArr, j14, (byte) ((codePoint >>> 18) | 240));
                                p0.x(bArr, j14 + j12, (byte) (((codePoint >>> 12) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                long j16 = j14 + 3;
                                p0.x(bArr, j14 + 2, (byte) (((codePoint >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                j14 += 4;
                                p0.x(bArr, j16, (byte) ((codePoint & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                                i14 = i15;
                            } else {
                                i14 = i15;
                            }
                        }
                        throw new d(i14 - 1, length);
                    }
                    p0.x(bArr, j14, (byte) ((charAt2 >>> '\f') | 480));
                    long j17 = j14 + 2;
                    j13 = j15;
                    p0.x(bArr, j14 + j12, (byte) (((charAt2 >>> 6) & 63) | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j14 += 3;
                    p0.x(bArr, j17, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                } else {
                    j12 = j11;
                    long j18 = j14 + j12;
                    p0.x(bArr, j14, (byte) ((charAt2 >>> 6) | 960));
                    j14 += 2;
                    p0.x(bArr, j18, (byte) ((charAt2 & '?') | UserVerificationMethods.USER_VERIFY_PATTERN));
                    j13 = j15;
                }
                i14++;
                j11 = j12;
                j15 = j13;
            }
            return (int) j14;
        }
    }

    static {
        f42609a = (p0.u() && p0.v() && !C5358d.b()) ? new e() : new c();
    }

    static String a(byte[] bArr, int i11, int i12) throws C5379z {
        return f42609a.a(bArr, i11, i12);
    }

    static int b(String str, byte[] bArr, int i11, int i12) {
        return f42609a.b(str, bArr, i11, i12);
    }

    static int c(String str) {
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i12 < length && str.charAt(i12) < 128) {
            i12++;
        }
        int i13 = length;
        while (true) {
            if (i12 >= length) {
                break;
            }
            char charAt = str.charAt(i12);
            if (charAt < 2048) {
                i13 += (127 - charAt) >>> 31;
                i12++;
            } else {
                int length2 = str.length();
                while (i12 < length2) {
                    char charAt2 = str.charAt(i12);
                    if (charAt2 < 2048) {
                        i11 += (127 - charAt2) >>> 31;
                    } else {
                        i11 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(str, i12) < 65536) {
                                throw new d(i12, length2);
                            }
                            i12++;
                        }
                    }
                    i12++;
                }
                i13 += i11;
            }
        }
        if (i13 >= length) {
            return i13;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (i13 + 4294967296L));
    }
}
