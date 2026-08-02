package D9;

import com.google.protobuf.DescriptorProtos$FileOptions;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import o9.C8663e;
import o9.EnumC8662d;

/* loaded from: classes9.dex */
final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f6178a = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f6179b = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();

    /* renamed from: c, reason: collision with root package name */
    private static final BigInteger[] f6180c;

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6181a;

        static {
            int[] iArr = new int[b.values().length];
            f6181a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6181a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6181a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6181a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6181a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6181a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b ALPHA;
        public static final b ALPHA_SHIFT;
        public static final b LOWER;
        public static final b MIXED;
        public static final b PUNCT;
        public static final b PUNCT_SHIFT;

        static {
            b bVar = new b("ALPHA", 0);
            ALPHA = bVar;
            b bVar2 = new b("LOWER", 1);
            LOWER = bVar2;
            b bVar3 = new b("MIXED", 2);
            MIXED = bVar3;
            b bVar4 = new b("PUNCT", 3);
            PUNCT = bVar4;
            b bVar5 = new b("ALPHA_SHIFT", 4);
            ALPHA_SHIFT = bVar5;
            b bVar6 = new b("PUNCT_SHIFT", 5);
            PUNCT_SHIFT = bVar6;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6};
        }

        private b() {
            throw null;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        f6180c = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger valueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = valueOf;
        int i11 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = f6180c;
            if (i11 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i11] = bigIntegerArr2[i11 - 1].multiply(valueOf);
            i11++;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:82:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0169 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static C8663e a(String str, int[] iArr) throws h9.h {
        int i11;
        int i12;
        long j11;
        StringBuilder sb2 = new StringBuilder(iArr.length << 1);
        Charset charset = StandardCharsets.ISO_8859_1;
        int i13 = iArr[1];
        C9.c cVar = new C9.c();
        int i14 = 2;
        int i15 = 2;
        while (true) {
            int i16 = iArr[0];
            if (i15 >= i16) {
                if (sb2.length() == 0) {
                    throw h9.h.a();
                }
                C8663e c8663e = new C8663e(null, sb2.toString(), null, str);
                c8663e.i(cVar);
                return c8663e;
            }
            if (i13 != 913) {
                switch (i13) {
                    case EDITION_LEGACY_VALUE:
                        i11 = d(iArr, i15, sb2);
                        break;
                    case 901:
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        int i17 = 928;
                        long j12 = 900;
                        if (i13 == 901) {
                            int[] iArr2 = new int[6];
                            int i18 = iArr[i15];
                            i15++;
                            boolean z11 = false;
                            int i19 = 0;
                            long j13 = 0;
                            while (true) {
                                i12 = iArr[0];
                                if (i15 < i12 && !z11) {
                                    int i21 = i19 + 1;
                                    iArr2[i19] = i18;
                                    long j14 = (j13 * 900) + i18;
                                    int i22 = i15 + 1;
                                    int i23 = iArr[i15];
                                    if (i23 != i17) {
                                        switch (i23) {
                                            case EDITION_LEGACY_VALUE:
                                            case 901:
                                            case 902:
                                                break;
                                            default:
                                                switch (i23) {
                                                    case 922:
                                                    case 923:
                                                    case 924:
                                                        break;
                                                    default:
                                                        if (i21 % 5 != 0 || i21 <= 0) {
                                                            i15 = i22;
                                                            i18 = i23;
                                                            j13 = j14;
                                                            i17 = 928;
                                                            i19 = i21;
                                                            break;
                                                        } else {
                                                            int i24 = 0;
                                                            while (i24 < 6) {
                                                                byteArrayOutputStream.write((byte) (r22 >> ((5 - i24) * 8)));
                                                                i24++;
                                                                j14 = j14;
                                                                i17 = 928;
                                                            }
                                                            i15 = i22;
                                                            i18 = i23;
                                                            j13 = 0;
                                                            i19 = 0;
                                                            break;
                                                        }
                                                        break;
                                                }
                                        }
                                    }
                                    i18 = i23;
                                    j13 = j14;
                                    z11 = true;
                                    i17 = 928;
                                    i19 = i21;
                                }
                            }
                            if (i15 == i12 && i18 < 900) {
                                iArr2[i19] = i18;
                                i19++;
                            }
                            for (int i25 = 0; i25 < i19; i25++) {
                                byteArrayOutputStream.write((byte) iArr2[i25]);
                            }
                        } else if (i13 == 924) {
                            boolean z12 = false;
                            int i26 = 0;
                            long j15 = 0;
                            while (i15 < iArr[0] && !z12) {
                                int i27 = i15 + 1;
                                int i28 = iArr[i15];
                                if (i28 < 900) {
                                    i26++;
                                    j15 = (j15 * j12) + i28;
                                } else {
                                    if (i28 != 928) {
                                        switch (i28) {
                                            default:
                                                switch (i28) {
                                                }
                                            case EDITION_LEGACY_VALUE:
                                            case 901:
                                            case 902:
                                                z12 = true;
                                                break;
                                        }
                                        if (i26 % 5 == 0 || i26 <= 0) {
                                            j11 = j12;
                                        } else {
                                            int i29 = 0;
                                            while (i29 < 6) {
                                                byteArrayOutputStream.write((byte) (j15 >> ((5 - i29) * 8)));
                                                i29++;
                                                j12 = j12;
                                            }
                                            j11 = j12;
                                            i26 = 0;
                                            j15 = 0;
                                        }
                                        j12 = j11;
                                    }
                                    z12 = true;
                                    if (i26 % 5 == 0) {
                                    }
                                    j11 = j12;
                                    j12 = j11;
                                }
                                i15 = i27;
                                if (i26 % 5 == 0) {
                                }
                                j11 = j12;
                                j12 = j11;
                            }
                        }
                        sb2.append(new String(byteArrayOutputStream.toByteArray(), charset));
                        i11 = i15;
                        break;
                    case 902:
                        i11 = c(iArr, i15, sb2);
                        break;
                    default:
                        switch (i13) {
                            case 922:
                            case 923:
                                throw h9.h.a();
                            case 924:
                                break;
                            case 925:
                                i11 = i15 + 1;
                                break;
                            case 926:
                                i11 = i15 + 2;
                                break;
                            case 927:
                                i11 = i15 + 1;
                                charset = Charset.forName(EnumC8662d.b(iArr[i15]).name());
                                break;
                            case 928:
                                if (i15 + 2 > i16) {
                                    throw h9.h.a();
                                }
                                int[] iArr3 = new int[i14];
                                int i31 = 0;
                                while (i31 < i14) {
                                    iArr3[i31] = iArr[i15];
                                    i31++;
                                    i15++;
                                }
                                Integer.parseInt(b(iArr3, i14));
                                i11 = d(iArr, i15, new StringBuilder());
                                int i32 = iArr[i11] == 923 ? i11 + 1 : -1;
                                while (i11 < iArr[0]) {
                                    int i33 = iArr[i11];
                                    if (i33 == 922) {
                                        i11++;
                                        cVar.b();
                                    } else {
                                        if (i33 != 923) {
                                            throw h9.h.a();
                                        }
                                        switch (iArr[i11 + 1]) {
                                            case 0:
                                                i11 = d(iArr, i11 + 2, new StringBuilder());
                                                break;
                                            case 1:
                                                StringBuilder sb3 = new StringBuilder();
                                                i11 = c(iArr, i11 + 2, sb3);
                                                Integer.parseInt(sb3.toString());
                                                break;
                                            case 2:
                                                StringBuilder sb4 = new StringBuilder();
                                                i11 = c(iArr, i11 + 2, sb4);
                                                Long.parseLong(sb4.toString());
                                                break;
                                            case 3:
                                                i11 = d(iArr, i11 + 2, new StringBuilder());
                                                break;
                                            case 4:
                                                i11 = d(iArr, i11 + 2, new StringBuilder());
                                                break;
                                            case 5:
                                                StringBuilder sb5 = new StringBuilder();
                                                i11 = c(iArr, i11 + 2, sb5);
                                                Long.parseLong(sb5.toString());
                                                break;
                                            case 6:
                                                StringBuilder sb6 = new StringBuilder();
                                                i11 = c(iArr, i11 + 2, sb6);
                                                Integer.parseInt(sb6.toString());
                                                break;
                                            default:
                                                throw h9.h.a();
                                        }
                                    }
                                }
                                if (i32 != -1) {
                                    int i34 = i11 - i32;
                                    if (cVar.a()) {
                                        i34--;
                                    }
                                    Arrays.copyOfRange(iArr, i32, i34 + i32);
                                    break;
                                }
                                break;
                            default:
                                i11 = d(iArr, i15 - 1, sb2);
                                break;
                        }
                }
            } else {
                i11 = i15 + 1;
                sb2.append((char) iArr[i15]);
            }
            if (i11 >= iArr.length) {
                throw h9.h.a();
            }
            i15 = i11 + 1;
            i13 = iArr[i11];
            i14 = 2;
        }
    }

    private static String b(int[] iArr, int i11) throws h9.h {
        BigInteger bigInteger = BigInteger.ZERO;
        for (int i12 = 0; i12 < i11; i12++) {
            bigInteger = bigInteger.add(f6180c[(i11 - i12) - 1].multiply(BigInteger.valueOf(iArr[i12])));
        }
        String bigInteger2 = bigInteger.toString();
        if (bigInteger2.charAt(0) == '1') {
            return bigInteger2.substring(1);
        }
        throw h9.h.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003a, code lost:
    
        r10.append(b(r0, r3));
        r3 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int c(int[] iArr, int i11, StringBuilder sb2) throws h9.h {
        int[] iArr2 = new int[15];
        boolean z11 = false;
        int i12 = 0;
        while (true) {
            int i13 = iArr[0];
            if (i11 < i13 && !z11) {
                int i14 = i11 + 1;
                int i15 = iArr[i11];
                if (i14 == i13) {
                    z11 = true;
                }
                if (i15 < 900) {
                    iArr2[i12] = i15;
                    i12++;
                } else {
                    if (i15 != 900 && i15 != 901 && i15 != 928) {
                        switch (i15) {
                        }
                        if (i12 % 15 == 0 || i15 == 902 || z11) {
                        }
                    }
                    z11 = true;
                    if (i12 % 15 == 0) {
                    }
                }
                i11 = i14;
                if (i12 % 15 == 0) {
                }
            }
        }
        return i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0035. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:16:0x0038. Please report as an issue. */
    private static int d(int[] iArr, int i11, StringBuilder sb2) {
        b bVar;
        b bVar2;
        int i12;
        int i13 = (iArr[0] - i11) << 1;
        int[] iArr2 = new int[i13];
        int[] iArr3 = new int[i13];
        int i14 = i11;
        boolean z11 = false;
        int i15 = 0;
        while (i14 < iArr[0] && !z11) {
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            if (i17 < 900) {
                iArr2[i15] = i17 / 30;
                iArr2[i15 + 1] = i17 % 30;
                i15 += 2;
            } else if (i17 != 913) {
                if (i17 != 928) {
                    switch (i17) {
                        case EDITION_LEGACY_VALUE:
                            iArr2[i15] = 900;
                            i15++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i17) {
                            }
                    }
                }
                z11 = true;
            } else {
                iArr2[i15] = 913;
                i14 += 2;
                iArr3[i15] = iArr[i16];
                i15++;
            }
            i14 = i16;
        }
        b bVar3 = b.ALPHA;
        b bVar4 = bVar3;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = iArr2[i18];
            int i21 = a.f6181a[bVar3.ordinal()];
            char[] cArr = f6178a;
            char c11 = ' ';
            switch (i21) {
                case 1:
                    if (i19 < 26) {
                        i12 = i19 + 65;
                        c11 = (char) i12;
                        break;
                    } else {
                        if (i19 == 900) {
                            bVar3 = b.ALPHA;
                        } else if (i19 != 913) {
                            switch (i19) {
                                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    bVar = b.LOWER;
                                    bVar3 = bVar;
                                    break;
                                case 28:
                                    bVar = b.MIXED;
                                    bVar3 = bVar;
                                    break;
                                case 29:
                                    bVar2 = b.PUNCT_SHIFT;
                                    bVar4 = bVar3;
                                    c11 = 0;
                                    bVar3 = bVar2;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i18]);
                        }
                        c11 = 0;
                        break;
                    }
                case 2:
                    if (i19 < 26) {
                        i12 = i19 + 97;
                        c11 = (char) i12;
                        break;
                    } else {
                        if (i19 == 900) {
                            bVar3 = b.ALPHA;
                        } else if (i19 != 913) {
                            switch (i19) {
                                case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                    bVar2 = b.ALPHA_SHIFT;
                                    bVar4 = bVar3;
                                    c11 = 0;
                                    bVar3 = bVar2;
                                    break;
                                case 28:
                                    bVar = b.MIXED;
                                    bVar3 = bVar;
                                    break;
                                case 29:
                                    bVar2 = b.PUNCT_SHIFT;
                                    bVar4 = bVar3;
                                    c11 = 0;
                                    bVar3 = bVar2;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr3[i18]);
                        }
                        c11 = 0;
                        break;
                    }
                case 3:
                    if (i19 < 25) {
                        c11 = f6179b[i19];
                        break;
                    } else {
                        if (i19 != 900) {
                            if (i19 != 913) {
                                switch (i19) {
                                    case TombstoneProtos$Tombstone.GUEST_THREADS_FIELD_NUMBER /* 25 */:
                                        bVar = b.PUNCT;
                                        bVar3 = bVar;
                                        break;
                                    case DescriptorProtos$FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                                        bVar = b.LOWER;
                                        bVar3 = bVar;
                                        break;
                                    case 29:
                                        bVar2 = b.PUNCT_SHIFT;
                                        bVar4 = bVar3;
                                        c11 = 0;
                                        bVar3 = bVar2;
                                        break;
                                }
                            } else {
                                sb2.append((char) iArr3[i18]);
                            }
                            c11 = 0;
                            break;
                        }
                        bVar = b.ALPHA;
                        bVar3 = bVar;
                        c11 = 0;
                    }
                    break;
                case 4:
                    if (i19 < 29) {
                        c11 = cArr[i19];
                        break;
                    } else if (i19 == 29 || i19 == 900) {
                        bVar = b.ALPHA;
                        bVar3 = bVar;
                        c11 = 0;
                        break;
                    } else {
                        if (i19 == 913) {
                            sb2.append((char) iArr3[i18]);
                        }
                        c11 = 0;
                    }
                case 5:
                    if (i19 < 26) {
                        c11 = (char) (i19 + 65);
                    } else if (i19 != 26) {
                        bVar = i19 != 900 ? bVar4 : b.ALPHA;
                        bVar3 = bVar;
                        c11 = 0;
                        break;
                    }
                    bVar3 = bVar4;
                    break;
                case 6:
                    if (i19 < 29) {
                        c11 = cArr[i19];
                        bVar3 = bVar4;
                        break;
                    } else if (i19 == 29 || i19 == 900) {
                        bVar = b.ALPHA;
                        bVar3 = bVar;
                        c11 = 0;
                        break;
                    } else {
                        if (i19 == 913) {
                            sb2.append((char) iArr3[i18]);
                        }
                        bVar3 = bVar4;
                        c11 = 0;
                    }
                default:
                    c11 = 0;
                    break;
            }
            if (c11 != 0) {
                sb2.append(c11);
            }
        }
        return i14;
    }
}
