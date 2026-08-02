package N3;

import java.io.IOException;
import m3.C8050C;

/* loaded from: classes8.dex */
public final class v {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f18649a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0085, code lost:
    
        if (r11 == r18.f18658f) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if ((r17.E() * 1000) == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a1, code lost:
    
        if (r4 == r0) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(C8050C c8050c, y yVar, int i11, a aVar) {
        int f7 = c8050c.f();
        long G11 = c8050c.G();
        long j11 = G11 >>> 16;
        if (j11 == i11) {
            boolean z11 = (j11 & 1) == 1;
            int i12 = (int) ((G11 >> 12) & 15);
            int i13 = (int) ((G11 >> 8) & 15);
            int i14 = (int) (15 & (G11 >> 4));
            int i15 = (int) ((G11 >> 1) & 7);
            boolean z12 = (G11 & 1) == 1;
            if (i14 > 7 ? !(i14 > 10 || yVar.f18659g != 2) : i14 == yVar.f18659g - 1) {
                if ((i15 == 0 || i15 == yVar.f18661i) && !z12) {
                    try {
                        long M11 = c8050c.M();
                        if (!z11) {
                            M11 *= yVar.f18654b;
                        }
                        aVar.f18649a = M11;
                        int c11 = c(i12, c8050c);
                        if (c11 != -1 && c11 <= yVar.f18654b) {
                            if (i13 != 0) {
                                if (i13 > 11) {
                                    int i16 = yVar.f18657e;
                                    if (i13 != 12) {
                                        if (i13 <= 14) {
                                            int L11 = c8050c.L();
                                            if (i13 == 14) {
                                                L11 *= 10;
                                            }
                                        }
                                    }
                                }
                            }
                            if (c8050c.E() == m3.N.o(f7, c8050c.f() - 1, c8050c.e())) {
                                return true;
                            }
                        }
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
        return false;
    }

    public static long b(C3659j c3659j, y yVar) throws IOException {
        long j11;
        c3659j.e();
        boolean z11 = true;
        c3659j.i(1, false);
        byte[] bArr = new byte[1];
        c3659j.d(bArr, 0, 1, false);
        boolean z12 = (bArr[0] & 1) == 1;
        c3659j.i(2, false);
        int i11 = z12 ? 7 : 6;
        C8050C c8050c = new C8050C(i11);
        byte[] e11 = c8050c.e();
        int i12 = 0;
        while (i12 < i11) {
            int k11 = c3659j.k(i12, i11 - i12, e11);
            if (k11 == -1) {
                break;
            }
            i12 += k11;
        }
        c8050c.Q(i12);
        c3659j.e();
        try {
            j11 = c8050c.M();
            if (!z12) {
                j11 *= yVar.f18654b;
            }
        } catch (NumberFormatException unused) {
            j11 = 0;
            z11 = false;
        }
        if (z11) {
            return j11;
        }
        throw j3.v.a(null, null);
    }

    public static int c(int i11, C8050C c8050c) {
        switch (i11) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i11 - 2);
            case 6:
                return c8050c.E() + 1;
            case 7:
                return c8050c.L() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i11 - 8);
            default:
                return -1;
        }
    }
}
