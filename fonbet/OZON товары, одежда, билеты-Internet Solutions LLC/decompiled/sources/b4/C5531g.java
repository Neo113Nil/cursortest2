package b4;

import B90.C2618u;
import Ij.C3261b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.common.collect.AbstractC5880y;
import j3.t;
import j3.u;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import m3.C8049B;
import m3.C8050C;
import m3.N;
import m3.s;

/* renamed from: b4.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5531g extends W3.b {

    /* renamed from: b, reason: collision with root package name */
    public static final C2618u f55507b = new C2618u(4);

    /* renamed from: a, reason: collision with root package name */
    private final a f55508a;

    /* renamed from: b4.g$a */
    /* loaded from: classes.dex */
    public interface a {
        boolean a(int i11, int i12, int i13, int i14, int i15);
    }

    /* renamed from: b4.g$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f55509a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f55510b;

        /* renamed from: c, reason: collision with root package name */
        private final int f55511c;

        public b(int i11, boolean z11, int i12) {
            this.f55509a = i11;
            this.f55510b = z11;
            this.f55511c = i12;
        }
    }

    public C5531g(a aVar) {
        this.f55508a = aVar;
    }

    private static C5525a d(C8050C c8050c, int i11, int i12) {
        int v11;
        String concat;
        int E11 = c8050c.E();
        Charset s11 = s(E11);
        int i13 = i11 - 1;
        byte[] bArr = new byte[i13];
        c8050c.n(0, i13, bArr);
        if (i12 == 2) {
            concat = "image/" + O7.b.b(new String(bArr, 0, 3, StandardCharsets.ISO_8859_1));
            if ("image/jpg".equals(concat)) {
                concat = "image/jpeg";
            }
            v11 = 2;
        } else {
            v11 = v(0, bArr);
            String b11 = O7.b.b(new String(bArr, 0, v11, StandardCharsets.ISO_8859_1));
            concat = b11.indexOf(47) == -1 ? "image/".concat(b11) : b11;
        }
        int i14 = bArr[v11 + 1] & 255;
        int i15 = v11 + 2;
        int u11 = u(i15, E11, bArr);
        String str = new String(bArr, i15, u11 - i15, s11);
        int r11 = u11 + r(E11);
        return new C5525a(i14, concat, i13 <= r11 ? N.f74291c : Arrays.copyOfRange(bArr, r11, i13), str);
    }

    private static C5527c e(C8050C c8050c, int i11, int i12, boolean z11, int i13, a aVar) {
        int f7 = c8050c.f();
        int v11 = v(f7, c8050c.e());
        String str = new String(c8050c.e(), f7, v11 - f7, StandardCharsets.ISO_8859_1);
        c8050c.R(v11 + 1);
        int p11 = c8050c.p();
        int p12 = c8050c.p();
        long G11 = c8050c.G();
        if (G11 == 4294967295L) {
            G11 = -1;
        }
        long G12 = c8050c.G();
        long j11 = G12 == 4294967295L ? -1L : G12;
        ArrayList arrayList = new ArrayList();
        int i14 = f7 + i11;
        while (c8050c.f() < i14) {
            AbstractC5532h h11 = h(i12, c8050c, z11, i13, aVar);
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        return new C5527c(str, p11, p12, G11, j11, (AbstractC5532h[]) arrayList.toArray(new AbstractC5532h[0]));
    }

    private static C5528d f(C8050C c8050c, int i11, int i12, boolean z11, int i13, a aVar) {
        int f7 = c8050c.f();
        int v11 = v(f7, c8050c.e());
        String str = new String(c8050c.e(), f7, v11 - f7, StandardCharsets.ISO_8859_1);
        c8050c.R(v11 + 1);
        int E11 = c8050c.E();
        boolean z12 = (E11 & 2) != 0;
        boolean z13 = (E11 & 1) != 0;
        int E12 = c8050c.E();
        String[] strArr = new String[E12];
        for (int i14 = 0; i14 < E12; i14++) {
            int f11 = c8050c.f();
            int v12 = v(f11, c8050c.e());
            strArr[i14] = new String(c8050c.e(), f11, v12 - f11, StandardCharsets.ISO_8859_1);
            c8050c.R(v12 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i15 = f7 + i11;
        while (c8050c.f() < i15) {
            AbstractC5532h h11 = h(i12, c8050c, z11, i13, aVar);
            if (h11 != null) {
                arrayList.add(h11);
            }
        }
        return new C5528d(str, z12, z13, strArr, (AbstractC5532h[]) arrayList.toArray(new AbstractC5532h[0]));
    }

    private static C5529e g(int i11, C8050C c8050c) {
        if (i11 < 4) {
            return null;
        }
        int E11 = c8050c.E();
        Charset s11 = s(E11);
        byte[] bArr = new byte[3];
        c8050c.n(0, 3, bArr);
        String str = new String(bArr, 0, 3);
        int i12 = i11 - 4;
        byte[] bArr2 = new byte[i12];
        c8050c.n(0, i12, bArr2);
        int u11 = u(0, E11, bArr2);
        String str2 = new String(bArr2, 0, u11, s11);
        int r11 = u11 + r(E11);
        return new C5529e(str, str2, l(bArr2, r11, u(r11, E11, bArr2), s11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x01b0, code lost:
    
        if (r5 == 67) goto L144;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x024f  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [b4.h] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v20, types: [m3.C] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static AbstractC5532h h(int i11, C8050C c8050c, boolean z11, int i12, a aVar) {
        int I11;
        int i13;
        ?? r12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i14;
        int i15;
        int i16;
        Throwable th2;
        C8050C c8050c2;
        int i17;
        C8050C c8050c3;
        ?? r122;
        C8050C c8050c4;
        AbstractC5532h c5526b;
        int i18 = i11;
        int E11 = c8050c.E();
        int E12 = c8050c.E();
        int E13 = c8050c.E();
        int E14 = i18 >= 3 ? c8050c.E() : 0;
        if (i18 == 4) {
            I11 = c8050c.I();
            if (!z11) {
                I11 = (((I11 >> 24) & 255) << 21) | (I11 & 255) | (((I11 >> 8) & 255) << 7) | (((I11 >> 16) & 255) << 14);
            }
        } else {
            I11 = i18 == 3 ? c8050c.I() : c8050c.H();
        }
        int i19 = I11;
        int L11 = i18 >= 3 ? c8050c.L() : 0;
        if (E11 == 0 && E12 == 0 && E13 == 0 && E14 == 0 && i19 == 0 && L11 == 0) {
            c8050c.R(c8050c.i());
            return null;
        }
        int f7 = c8050c.f() + i19;
        if (f7 > c8050c.i()) {
            s.f("Id3Decoder", "Frame size exceeds remaining tag data");
            c8050c.R(c8050c.i());
            return null;
        }
        if (aVar != null) {
            boolean a11 = aVar.a(i18, E11, E12, E13, E14);
            i18 = i18;
            r12 = E11;
            i13 = E12;
            if (!a11) {
                c8050c.R(f7);
                return null;
            }
        } else {
            i13 = E12;
            r12 = E11;
        }
        if (i18 == 3) {
            z12 = (L11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0;
            z15 = (L11 & 64) != 0;
            z16 = false;
            z14 = (L11 & 32) != 0;
            z13 = z12;
        } else if (i18 == 4) {
            boolean z17 = (L11 & 64) != 0;
            boolean z18 = (L11 & 8) != 0;
            z15 = (L11 & 4) != 0;
            z16 = (L11 & 2) != 0;
            z13 = (L11 & 1) != 0;
            boolean z19 = z18;
            z14 = z17;
            z12 = z19;
        } else {
            z12 = false;
            z13 = false;
            z14 = false;
            z15 = false;
            z16 = false;
        }
        if (z12 || z15) {
            s.f("Id3Decoder", "Skipping unsupported compressed or encrypted frame");
            c8050c.R(f7);
            return null;
        }
        if (z14) {
            i19--;
            c8050c.S(1);
        }
        if (z13) {
            i19 -= 4;
            c8050c.S(4);
        }
        if (z16) {
            i19 = w(i19, c8050c);
        }
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
                c8050c2 = c8050c;
            }
        } catch (Exception e11) {
            e = e11;
            i14 = i13;
            i15 = E13;
            i16 = E14;
            i13 = i19;
            th2 = null;
            i17 = r12;
            c8050c3 = c8050c;
            c8050c3.R(f7);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        } catch (OutOfMemoryError e12) {
            e = e12;
            i14 = i13;
            i15 = E13;
            i16 = E14;
            i13 = i19;
            th2 = null;
            i17 = r12;
            c8050c3 = c8050c;
            c8050c3.R(f7);
            r122 = th2;
            if (r122 == 0) {
            }
            return r122;
        }
        if (r12 == 84 && i13 == 88 && E13 == 88 && (i18 == 2 || E14 == 88)) {
            c5526b = o(i19, c8050c);
        } else if (r12 == 84) {
            c5526b = m(i19, t(i18, r12, i13, E13, E14), c8050c);
        } else if (r12 == 87 && i13 == 88 && E13 == 88 && (i18 == 2 || E14 == 88)) {
            c5526b = q(i19, c8050c);
        } else if (r12 == 87) {
            c5526b = p(i19, t(i18, r12, i13, E13, E14), c8050c);
        } else {
            if (r12 != 80 || i13 != 82 || E13 != 73 || E14 != 86) {
                th2 = null;
                try {
                } catch (Exception e13) {
                    e = e13;
                    i14 = i13;
                    i15 = E13;
                    i16 = E14;
                    i13 = i19;
                    i17 = r12;
                    c8050c3 = c8050c;
                    c8050c3.R(f7);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                } catch (OutOfMemoryError e14) {
                    e = e14;
                    i14 = i13;
                    i15 = E13;
                    i16 = E14;
                    i13 = i19;
                    i17 = r12;
                    c8050c3 = c8050c;
                    c8050c3.R(f7);
                    r122 = th2;
                    if (r122 == 0) {
                    }
                    return r122;
                }
                if (r12 != 71 || i13 != 69 || E13 != 79 || (E14 != 66 && i18 != 2)) {
                    if (i18 == 2) {
                        if (r12 == 80 && i13 == 73 && E13 == 67) {
                            c5526b = d(c8050c, i19, i18);
                        }
                        if (r12 != 67 && i13 == 79 && E13 == 77 && (E14 == 77 || i18 == 2)) {
                            c5526b = g(i19, c8050c);
                        } else if (r12 != 67 && i13 == 72 && E13 == 65 && E14 == 80) {
                            i14 = i13;
                            i15 = E13;
                            i16 = E14;
                            i13 = i19;
                            i17 = r12;
                            try {
                                c5526b = e(c8050c, i13, i18, z11, i12, aVar);
                                i18 = i11;
                                r12 = c8050c;
                            } catch (Exception e15) {
                                e = e15;
                                i18 = i11;
                                c8050c3 = c8050c;
                                c8050c3.R(f7);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e16) {
                                e = e16;
                                i18 = i11;
                                c8050c3 = c8050c;
                                c8050c3.R(f7);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th4) {
                                th = th4;
                                c8050c2 = c8050c;
                                c8050c2.R(f7);
                                throw th;
                            }
                        } else {
                            i14 = i13;
                            i15 = E13;
                            i16 = E14;
                            i13 = i19;
                            i17 = r12;
                            try {
                                if (i17 != 67 && i14 == 84 && i15 == 79 && i16 == 67) {
                                    i18 = i11;
                                    C8050C c8050c5 = c8050c;
                                    c5526b = f(c8050c5, i13, i18, z11, i12, aVar);
                                    r12 = c8050c5;
                                } else {
                                    i18 = i11;
                                    c8050c4 = c8050c;
                                    if (i17 != 77 && i14 == 76 && i15 == 76 && i16 == 84) {
                                        c5526b = j(i13, c8050c4);
                                        r12 = c8050c4;
                                    } else {
                                        String t2 = t(i18, i17, i14, i15, i16);
                                        byte[] bArr = new byte[i13];
                                        c8050c4.n(0, i13, bArr);
                                        c5526b = new C5526b(t2, bArr);
                                        r12 = c8050c4;
                                    }
                                }
                            } catch (Exception e17) {
                                e = e17;
                                c8050c3 = r12;
                                c8050c3.R(f7);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (OutOfMemoryError e18) {
                                e = e18;
                                c8050c3 = r12;
                                c8050c3.R(f7);
                                r122 = th2;
                                if (r122 == 0) {
                                }
                                return r122;
                            } catch (Throwable th5) {
                                th = th5;
                                c8050c2 = r12;
                                c8050c2.R(f7);
                                throw th;
                            }
                        }
                    } else {
                        if (r12 == 65) {
                            if (i13 == 80) {
                                if (E13 == 73) {
                                }
                            }
                        }
                        if (r12 != 67) {
                        }
                        if (r12 != 67) {
                        }
                        i14 = i13;
                        i15 = E13;
                        i16 = E14;
                        i13 = i19;
                        i17 = r12;
                        if (i17 != 67) {
                        }
                        i18 = i11;
                        c8050c4 = c8050c;
                        if (i17 != 77) {
                        }
                        String t22 = t(i18, i17, i14, i15, i16);
                        byte[] bArr2 = new byte[i13];
                        c8050c4.n(0, i13, bArr2);
                        c5526b = new C5526b(t22, bArr2);
                        r12 = c8050c4;
                    }
                    r12.R(f7);
                    r122 = c5526b;
                    e = th2;
                    if (r122 == 0) {
                        s.g("Id3Decoder", "Failed to decode frame: id=" + t(i18, i17, i14, i15, i16) + ", frameSize=" + i13, e);
                    }
                    return r122;
                }
                c5526b = i(i19, c8050c);
                i14 = i13;
                i15 = E13;
                i16 = E14;
                i13 = i19;
                i17 = r12;
                r12 = c8050c;
                r12.R(f7);
                r122 = c5526b;
                e = th2;
                if (r122 == 0) {
                }
                return r122;
            }
            c5526b = k(i19, c8050c);
        }
        i14 = i13;
        i15 = E13;
        i16 = E14;
        i13 = i19;
        th2 = null;
        i17 = r12;
        r12 = c8050c;
        r12.R(f7);
        r122 = c5526b;
        e = th2;
        if (r122 == 0) {
        }
        return r122;
    }

    private static C5530f i(int i11, C8050C c8050c) {
        int E11 = c8050c.E();
        Charset s11 = s(E11);
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c8050c.n(0, i12, bArr);
        int v11 = v(0, bArr);
        String m11 = u.m(new String(bArr, 0, v11, StandardCharsets.ISO_8859_1));
        int i13 = v11 + 1;
        int u11 = u(i13, E11, bArr);
        String l11 = l(bArr, i13, u11, s11);
        int r11 = u11 + r(E11);
        int u12 = u(r11, E11, bArr);
        String l12 = l(bArr, r11, u12, s11);
        int r12 = u12 + r(E11);
        return new C5530f(m11, i12 <= r12 ? N.f74291c : Arrays.copyOfRange(bArr, r12, i12), l11, l12);
    }

    private static C5535k j(int i11, C8050C c8050c) {
        int L11 = c8050c.L();
        int H11 = c8050c.H();
        int H12 = c8050c.H();
        int E11 = c8050c.E();
        int E12 = c8050c.E();
        C8049B c8049b = new C8049B();
        c8049b.m(c8050c);
        int i12 = ((i11 - 10) * 8) / (E11 + E12);
        int[] iArr = new int[i12];
        int[] iArr2 = new int[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            int h11 = c8049b.h(E11);
            int h12 = c8049b.h(E12);
            iArr[i13] = h11;
            iArr2[i13] = h12;
        }
        return new C5535k(L11, H11, iArr, iArr2, H12);
    }

    private static C5536l k(int i11, C8050C c8050c) {
        byte[] bArr = new byte[i11];
        c8050c.n(0, i11, bArr);
        int v11 = v(0, bArr);
        String str = new String(bArr, 0, v11, StandardCharsets.ISO_8859_1);
        int i12 = v11 + 1;
        return new C5536l(str, i11 <= i12 ? N.f74291c : Arrays.copyOfRange(bArr, i12, i11));
    }

    private static String l(byte[] bArr, int i11, int i12, Charset charset) {
        return (i12 <= i11 || i12 > bArr.length) ? "" : new String(bArr, i11, i12 - i11, charset);
    }

    private static C5537m m(int i11, String str, C8050C c8050c) {
        if (i11 < 1) {
            return null;
        }
        int E11 = c8050c.E();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c8050c.n(0, i12, bArr);
        return new C5537m(str, null, n(E11, 0, bArr));
    }

    private static AbstractC5880y n(int i11, int i12, byte[] bArr) {
        if (i12 >= bArr.length) {
            return AbstractC5880y.B("");
        }
        int i13 = AbstractC5880y.f59142c;
        AbstractC5880y.a aVar = new AbstractC5880y.a();
        int u11 = u(i12, i11, bArr);
        while (i12 < u11) {
            aVar.e(new String(bArr, i12, u11 - i12, s(i11)));
            i12 = r(i11) + u11;
            u11 = u(i12, i11, bArr);
        }
        AbstractC5880y j11 = aVar.j();
        return j11.isEmpty() ? AbstractC5880y.B("") : j11;
    }

    private static C5537m o(int i11, C8050C c8050c) {
        if (i11 < 1) {
            return null;
        }
        int E11 = c8050c.E();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c8050c.n(0, i12, bArr);
        int u11 = u(0, E11, bArr);
        return new C5537m("TXXX", new String(bArr, 0, u11, s(E11)), n(E11, u11 + r(E11), bArr));
    }

    private static C5538n p(int i11, String str, C8050C c8050c) {
        byte[] bArr = new byte[i11];
        c8050c.n(0, i11, bArr);
        return new C5538n(str, null, new String(bArr, 0, v(0, bArr), StandardCharsets.ISO_8859_1));
    }

    private static C5538n q(int i11, C8050C c8050c) {
        if (i11 < 1) {
            return null;
        }
        int E11 = c8050c.E();
        int i12 = i11 - 1;
        byte[] bArr = new byte[i12];
        c8050c.n(0, i12, bArr);
        int u11 = u(0, E11, bArr);
        String str = new String(bArr, 0, u11, s(E11));
        int r11 = u11 + r(E11);
        return new C5538n("WXXX", str, l(bArr, r11, v(r11, bArr), StandardCharsets.ISO_8859_1));
    }

    private static int r(int i11) {
        return (i11 == 0 || i11 == 3) ? 1 : 2;
    }

    private static Charset s(int i11) {
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? StandardCharsets.ISO_8859_1 : StandardCharsets.UTF_8 : StandardCharsets.UTF_16BE : StandardCharsets.UTF_16;
    }

    private static String t(int i11, int i12, int i13, int i14, int i15) {
        return i11 == 2 ? String.format(Locale.US, "%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14)) : String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i12), Integer.valueOf(i13), Integer.valueOf(i14), Integer.valueOf(i15));
    }

    private static int u(int i11, int i12, byte[] bArr) {
        int v11 = v(i11, bArr);
        if (i12 == 0 || i12 == 3) {
            return v11;
        }
        while (v11 < bArr.length - 1) {
            if ((v11 - i11) % 2 == 0 && bArr[v11 + 1] == 0) {
                return v11;
            }
            v11 = v(v11 + 1, bArr);
        }
        return bArr.length;
    }

    private static int v(int i11, byte[] bArr) {
        while (i11 < bArr.length) {
            if (bArr[i11] == 0) {
                return i11;
            }
            i11++;
        }
        return bArr.length;
    }

    private static int w(int i11, C8050C c8050c) {
        byte[] e11 = c8050c.e();
        int f7 = c8050c.f();
        int i12 = f7;
        while (true) {
            int i13 = i12 + 1;
            if (i13 >= f7 + i11) {
                return i11;
            }
            if ((e11[i12] & 255) == 255 && e11[i13] == 0) {
                System.arraycopy(e11, i12 + 2, e11, i13, (i11 - (i12 - f7)) - 2);
                i11--;
            }
            i12 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        if ((r10 & 1) != 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007c, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0089, code lost:
    
        if ((r10 & com.google.android.gms.fido.fido2.api.common.UserVerificationMethods.USER_VERIFY_PATTERN) != 0) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean x(C8050C c8050c, int i11, int i12, boolean z11) {
        int H11;
        long H12;
        int i13;
        int i14;
        int f7 = c8050c.f();
        while (true) {
            try {
                boolean z12 = true;
                if (c8050c.a() < i12) {
                    c8050c.R(f7);
                    return true;
                }
                if (i11 >= 3) {
                    H11 = c8050c.p();
                    H12 = c8050c.G();
                    i13 = c8050c.L();
                } else {
                    H11 = c8050c.H();
                    H12 = c8050c.H();
                    i13 = 0;
                }
                if (H11 == 0 && H12 == 0 && i13 == 0) {
                    c8050c.R(f7);
                    return true;
                }
                if (i11 == 4 && !z11) {
                    if ((8421504 & H12) != 0) {
                        c8050c.R(f7);
                        return false;
                    }
                    H12 = (((H12 >> 24) & 255) << 21) | (H12 & 255) | (((H12 >> 8) & 255) << 7) | (((H12 >> 16) & 255) << 14);
                }
                if (i11 == 4) {
                    i14 = (i13 & 64) != 0 ? 1 : 0;
                } else {
                    if (i11 == 3) {
                        i14 = (i13 & 32) != 0 ? 1 : 0;
                    } else {
                        i14 = 0;
                        z12 = false;
                    }
                    if (z12) {
                        i14 += 4;
                    }
                    if (H12 < i14) {
                        c8050c.R(f7);
                        return false;
                    }
                    if (c8050c.a() < H12) {
                        c8050c.R(f7);
                        return false;
                    }
                    c8050c.S((int) H12);
                }
            } catch (Throwable th2) {
                c8050c.R(f7);
                throw th2;
            }
        }
    }

    @Override // W3.b
    protected final t b(W3.a aVar, ByteBuffer byteBuffer) {
        return c(byteBuffer.limit(), byteBuffer.array());
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x009b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final t c(int i11, byte[] bArr) {
        b bVar;
        ArrayList arrayList = new ArrayList();
        C8050C c8050c = new C8050C(i11, bArr);
        boolean z11 = false;
        if (c8050c.a() < 10) {
            s.f("Id3Decoder", "Data too short to be an ID3 tag");
        } else {
            int H11 = c8050c.H();
            if (H11 == 4801587) {
                int E11 = c8050c.E();
                c8050c.S(1);
                int E12 = c8050c.E();
                int D11 = c8050c.D();
                if (E11 == 2) {
                    if ((E12 & 64) != 0) {
                        s.f("Id3Decoder", "Skipped ID3 tag with majorVersion=2 and undefined compression scheme");
                    }
                    bVar = new b(E11, E11 >= 4 && (E12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0, D11);
                } else {
                    if (E11 == 3) {
                        if ((E12 & 64) != 0) {
                            int p11 = c8050c.p();
                            c8050c.S(p11);
                            D11 -= p11 + 4;
                        }
                    } else if (E11 == 4) {
                        if ((E12 & 64) != 0) {
                            int D12 = c8050c.D();
                            c8050c.S(D12 - 4);
                            D11 -= D12;
                        }
                        if ((E12 & 16) != 0) {
                            D11 -= 10;
                        }
                    } else {
                        C3261b.f(E11, "Skipped ID3 tag with unsupported majorVersion=", "Id3Decoder");
                    }
                    bVar = new b(E11, E11 >= 4 && (E12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0, D11);
                }
                if (bVar != null) {
                    return null;
                }
                int f7 = c8050c.f();
                int i12 = bVar.f55509a == 2 ? 6 : 10;
                int i13 = bVar.f55511c;
                if (bVar.f55510b) {
                    i13 = w(bVar.f55511c, c8050c);
                }
                c8050c.Q(f7 + i13);
                if (!x(c8050c, bVar.f55509a, i12, false)) {
                    if (bVar.f55509a != 4 || !x(c8050c, 4, i12, true)) {
                        s.f("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + bVar.f55509a);
                        return null;
                    }
                    z11 = true;
                }
                while (c8050c.a() >= i12) {
                    AbstractC5532h h11 = h(bVar.f55509a, c8050c, z11, i12, this.f55508a);
                    if (h11 != null) {
                        arrayList.add(h11);
                    }
                }
                return new t(arrayList);
            }
            s.f("Id3Decoder", "Unexpected first three bytes of ID3 tag header: 0x".concat(String.format("%06X", Integer.valueOf(H11))));
        }
        bVar = null;
        if (bVar != null) {
        }
    }

    public C5531g() {
        this(null);
    }
}
