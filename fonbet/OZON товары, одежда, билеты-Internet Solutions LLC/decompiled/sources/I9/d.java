package I9;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.EnumMap;
import o9.C8661c;
import o9.C8663e;
import o9.C8668j;
import o9.EnumC8662d;

/* loaded from: classes9.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f12008a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ $%*+-./:".toCharArray();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12009a;

        static {
            int[] iArr = new int[h.values().length];
            f12009a = iArr;
            try {
                iArr[h.NUMERIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12009a[h.ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12009a[h.BYTE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12009a[h.KANJI.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12009a[h.TERMINATOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12009a[h.FNC1_FIRST_POSITION.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12009a[h.FNC1_SECOND_POSITION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12009a[h.STRUCTURED_APPEND.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12009a[h.ECI.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f12009a[h.HANZI.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0174 A[LOOP:0: B:2:0x001a->B:31:0x0174, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0159 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C8663e a(byte[] bArr, j jVar, f fVar, EnumMap enumMap) throws h9.h {
        h hVar;
        h hVar2;
        int d11;
        int i11;
        int i12;
        byte[] bArr2 = bArr;
        C8661c c8661c = new C8661c(bArr2);
        StringBuilder sb2 = new StringBuilder(50);
        ArrayList arrayList = new ArrayList(1);
        int i13 = -1;
        int i14 = -1;
        boolean z11 = false;
        EnumC8662d enumC8662d = null;
        while (true) {
            try {
                if (c8661c.a() < 4) {
                    hVar2 = h.TERMINATOR;
                } else {
                    int d12 = c8661c.d(4);
                    if (d12 == 0) {
                        hVar = h.TERMINATOR;
                    } else if (d12 == 1) {
                        hVar = h.NUMERIC;
                    } else if (d12 == 2) {
                        hVar = h.ALPHANUMERIC;
                    } else if (d12 == 3) {
                        hVar = h.STRUCTURED_APPEND;
                    } else if (d12 == 4) {
                        hVar = h.BYTE;
                    } else if (d12 == 5) {
                        hVar = h.FNC1_FIRST_POSITION;
                    } else if (d12 == 7) {
                        hVar = h.ECI;
                    } else if (d12 == 8) {
                        hVar = h.KANJI;
                    } else if (d12 == 9) {
                        hVar = h.FNC1_SECOND_POSITION;
                    } else {
                        if (d12 != 13) {
                            throw new IllegalArgumentException();
                        }
                        hVar = h.HANZI;
                    }
                    hVar2 = hVar;
                }
                int[] iArr = a.f12009a;
                switch (iArr[hVar2.ordinal()]) {
                    case 5:
                        if (hVar2 != h.TERMINATOR) {
                            return new C8663e(bArr2, sb2.toString(), arrayList.isEmpty() ? null : arrayList, fVar.toString(), i13, i14);
                        }
                        bArr2 = bArr;
                    case 6:
                    case 7:
                        z11 = true;
                        if (hVar2 != h.TERMINATOR) {
                        }
                        break;
                    case 8:
                        if (c8661c.a() < 16) {
                            throw h9.h.a();
                        }
                        i13 = c8661c.d(8);
                        i14 = c8661c.d(8);
                        if (hVar2 != h.TERMINATOR) {
                        }
                        break;
                    case 9:
                        int d13 = c8661c.d(8);
                        if ((d13 & UserVerificationMethods.USER_VERIFY_PATTERN) == 0) {
                            i12 = d13 & 127;
                        } else {
                            if ((d13 & 192) == 128) {
                                d11 = c8661c.d(8);
                                i11 = (d13 & 63) << 8;
                            } else {
                                if ((d13 & 224) != 192) {
                                    throw h9.h.a();
                                }
                                d11 = c8661c.d(16);
                                i11 = (d13 & 31) << 16;
                            }
                            i12 = i11 | d11;
                        }
                        enumC8662d = EnumC8662d.b(i12);
                        if (enumC8662d == null) {
                            throw h9.h.a();
                        }
                        if (hVar2 != h.TERMINATOR) {
                        }
                        break;
                    case 10:
                        int d14 = c8661c.d(4);
                        int d15 = c8661c.d(hVar2.b(jVar));
                        if (d14 == 1) {
                            c(c8661c, sb2, d15);
                        }
                        if (hVar2 != h.TERMINATOR) {
                        }
                        break;
                    default:
                        int d16 = c8661c.d(hVar2.b(jVar));
                        int i15 = iArr[hVar2.ordinal()];
                        if (i15 == 1) {
                            e(c8661c, sb2, d16);
                        } else if (i15 == 2) {
                            b(c8661c, sb2, d16, z11);
                        } else if (i15 != 3) {
                            if (i15 != 4) {
                                throw h9.h.a();
                            }
                            d(c8661c, sb2, d16);
                        } else {
                            if ((d16 << 3) > c8661c.a()) {
                                throw h9.h.a();
                            }
                            byte[] bArr3 = new byte[d16];
                            for (int i16 = 0; i16 < d16; i16++) {
                                bArr3[i16] = (byte) c8661c.d(8);
                            }
                            try {
                                sb2.append(new String(bArr3, enumC8662d == null ? C8668j.a(bArr3, enumMap) : enumC8662d.name()));
                                arrayList.add(bArr3);
                            } catch (UnsupportedEncodingException unused) {
                                throw h9.h.a();
                            }
                        }
                        if (hVar2 != h.TERMINATOR) {
                        }
                        break;
                }
            } catch (IllegalArgumentException unused2) {
                throw h9.h.a();
            }
        }
    }

    private static void b(C8661c c8661c, StringBuilder sb2, int i11, boolean z11) throws h9.h {
        while (i11 > 1) {
            if (c8661c.a() < 11) {
                throw h9.h.a();
            }
            int d11 = c8661c.d(11);
            sb2.append(f(d11 / 45));
            sb2.append(f(d11 % 45));
            i11 -= 2;
        }
        if (i11 == 1) {
            if (c8661c.a() < 6) {
                throw h9.h.a();
            }
            sb2.append(f(c8661c.d(6)));
        }
        if (z11) {
            for (int length = sb2.length(); length < sb2.length(); length++) {
                if (sb2.charAt(length) == '%') {
                    if (length < sb2.length() - 1) {
                        int i12 = length + 1;
                        if (sb2.charAt(i12) == '%') {
                            sb2.deleteCharAt(i12);
                        }
                    }
                    sb2.setCharAt(length, (char) 29);
                }
            }
        }
    }

    private static void c(C8661c c8661c, StringBuilder sb2, int i11) throws h9.h {
        if (i11 * 13 > c8661c.a()) {
            throw h9.h.a();
        }
        byte[] bArr = new byte[i11 * 2];
        int i12 = 0;
        while (i11 > 0) {
            int d11 = c8661c.d(13);
            int i13 = (d11 % 96) | ((d11 / 96) << 8);
            int i14 = i13 + (i13 < 2560 ? 41377 : 42657);
            bArr[i12] = (byte) (i14 >> 8);
            bArr[i12 + 1] = (byte) i14;
            i12 += 2;
            i11--;
        }
        try {
            sb2.append(new String(bArr, "GB2312"));
        } catch (UnsupportedEncodingException unused) {
            throw h9.h.a();
        }
    }

    private static void d(C8661c c8661c, StringBuilder sb2, int i11) throws h9.h {
        if (i11 * 13 > c8661c.a()) {
            throw h9.h.a();
        }
        byte[] bArr = new byte[i11 * 2];
        int i12 = 0;
        while (i11 > 0) {
            int d11 = c8661c.d(13);
            int i13 = (d11 % 192) | ((d11 / 192) << 8);
            int i14 = i13 + (i13 < 7936 ? 33088 : 49472);
            bArr[i12] = (byte) (i14 >> 8);
            bArr[i12 + 1] = (byte) i14;
            i12 += 2;
            i11--;
        }
        try {
            sb2.append(new String(bArr, "SJIS"));
        } catch (UnsupportedEncodingException unused) {
            throw h9.h.a();
        }
    }

    private static void e(C8661c c8661c, StringBuilder sb2, int i11) throws h9.h {
        while (i11 >= 3) {
            if (c8661c.a() < 10) {
                throw h9.h.a();
            }
            int d11 = c8661c.d(10);
            if (d11 >= 1000) {
                throw h9.h.a();
            }
            sb2.append(f(d11 / 100));
            sb2.append(f((d11 / 10) % 10));
            sb2.append(f(d11 % 10));
            i11 -= 3;
        }
        if (i11 == 2) {
            if (c8661c.a() < 7) {
                throw h9.h.a();
            }
            int d12 = c8661c.d(7);
            if (d12 >= 100) {
                throw h9.h.a();
            }
            sb2.append(f(d12 / 10));
            sb2.append(f(d12 % 10));
            return;
        }
        if (i11 == 1) {
            if (c8661c.a() < 4) {
                throw h9.h.a();
            }
            int d13 = c8661c.d(4);
            if (d13 >= 10) {
                throw h9.h.a();
            }
            sb2.append(f(d13));
        }
    }

    private static char f(int i11) throws h9.h {
        char[] cArr = f12008a;
        if (i11 < cArr.length) {
            return cArr[i11];
        }
        throw h9.h.a();
    }
}
