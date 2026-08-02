package O1;

import A1.C0045t0;
import A1.X;
import C1.C0095a;
import C1.I;
import E3.AbstractC0167z;
import F1.x;
import F1.y;
import F1.z;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import java.util.ArrayList;
import java.util.Arrays;
import v2.AbstractC1664a;
import w1.C1761y0;
import w1.L;
import w1.P2;

/* loaded from: classes.dex */
public final class l extends j {

    /* renamed from: n, reason: collision with root package name */
    public k f4975n;

    /* renamed from: o, reason: collision with root package name */
    public int f4976o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4977p;

    /* renamed from: q, reason: collision with root package name */
    public I f4978q;

    /* renamed from: r, reason: collision with root package name */
    public C1761y0 f4979r;

    @Override // O1.j
    public final void a(long j) {
        this.f4963g = j;
        this.f4977p = j != 0;
        I i7 = this.f4978q;
        this.f4976o = i7 != null ? i7.f1408e : 0;
    }

    @Override // O1.j
    public final long b(C0095a c0095a) {
        byte b7 = ((byte[]) c0095a.f1465c)[0];
        if ((b7 & 1) == 1) {
            return -1L;
        }
        k kVar = this.f4975n;
        AbstractC1664a.i(kVar);
        boolean z4 = ((y[]) kVar.f4974e)[(b7 >> 1) & (255 >>> (8 - kVar.f4970a))].f2588a;
        I i7 = (I) kVar.f4971b;
        int i8 = !z4 ? i7.f1408e : i7.f1409f;
        long j = this.f4977p ? (this.f4976o + i8) / 4 : 0;
        byte[] bArr = (byte[]) c0095a.f1465c;
        int length = bArr.length;
        int i9 = c0095a.f1464b + 4;
        if (length < i9) {
            byte[] copyOf = Arrays.copyOf(bArr, i9);
            c0095a.B(copyOf.length, copyOf);
        } else {
            c0095a.C(i9);
        }
        byte[] bArr2 = (byte[]) c0095a.f1465c;
        int i10 = c0095a.f1464b;
        bArr2[i10 - 4] = (byte) (j & 255);
        bArr2[i10 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i10 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i10 - 1] = (byte) ((j >>> 24) & 255);
        this.f4977p = true;
        this.f4976o = i8;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v52, types: [byte[], java.io.Serializable] */
    @Override // O1.j
    public final boolean c(C0095a c0095a, long j, P2 p22) {
        k kVar;
        int i7;
        byte[] bArr;
        int i8;
        int i9;
        if (this.f4975n != null) {
            ((X) p22.f17508b).getClass();
            return false;
        }
        I i10 = this.f4978q;
        int i11 = 4;
        if (i10 == null) {
            z.d(1, c0095a, false);
            c0095a.l();
            int t7 = c0095a.t();
            int l7 = c0095a.l();
            int i12 = c0095a.i();
            if (i12 <= 0) {
                i12 = -1;
            }
            int i13 = c0095a.i();
            int i14 = i13 <= 0 ? -1 : i13;
            c0095a.i();
            int t8 = c0095a.t();
            int pow = (int) Math.pow(2.0d, t8 & 15);
            int pow2 = (int) Math.pow(2.0d, (t8 & 240) >> 4);
            c0095a.t();
            ?? copyOf = Arrays.copyOf((byte[]) c0095a.f1465c, c0095a.f1464b);
            I i15 = new I();
            i15.f1404a = t7;
            i15.f1405b = l7;
            i15.f1406c = i12;
            i15.f1407d = i14;
            i15.f1408e = pow;
            i15.f1409f = pow2;
            i15.f1410g = copyOf;
            this.f4978q = i15;
        } else {
            C1761y0 c1761y0 = this.f4979r;
            if (c1761y0 == null) {
                this.f4979r = z.c(c0095a, true, true);
            } else {
                int i16 = c0095a.f1464b;
                byte[] bArr2 = new byte[i16];
                System.arraycopy((byte[]) c0095a.f1465c, 0, bArr2, 0, i16);
                int i17 = 5;
                z.d(5, c0095a, false);
                int t9 = c0095a.t() + 1;
                x xVar = new x((byte[]) c0095a.f1465c);
                xVar.r(c0095a.f1463a * 8);
                int i18 = 0;
                while (true) {
                    int i19 = 16;
                    if (i18 >= t9) {
                        byte[] bArr3 = bArr2;
                        int i20 = 6;
                        int i21 = xVar.i(6) + 1;
                        for (int i22 = 0; i22 < i21; i22++) {
                            if (xVar.i(16) != 0) {
                                throw C0045t0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i23 = 1;
                        int i24 = xVar.i(6) + 1;
                        int i25 = 0;
                        while (true) {
                            int i26 = 3;
                            if (i25 < i24) {
                                int i27 = xVar.i(i19);
                                if (i27 == 0) {
                                    int i28 = 8;
                                    xVar.r(8);
                                    xVar.r(16);
                                    xVar.r(16);
                                    xVar.r(6);
                                    xVar.r(8);
                                    int i29 = xVar.i(4) + 1;
                                    int i30 = 0;
                                    while (i30 < i29) {
                                        xVar.r(i28);
                                        i30++;
                                        i28 = 8;
                                    }
                                } else {
                                    if (i27 != i23) {
                                        throw C0045t0.a(null, "floor type greater than 1 not decodable: " + i27);
                                    }
                                    int i31 = xVar.i(5);
                                    int[] iArr = new int[i31];
                                    int i32 = -1;
                                    for (int i33 = 0; i33 < i31; i33++) {
                                        int i34 = xVar.i(4);
                                        iArr[i33] = i34;
                                        if (i34 > i32) {
                                            i32 = i34;
                                        }
                                    }
                                    int i35 = i32 + 1;
                                    int[] iArr2 = new int[i35];
                                    int i36 = 0;
                                    while (i36 < i35) {
                                        iArr2[i36] = xVar.i(i26) + 1;
                                        int i37 = xVar.i(2);
                                        int i38 = 8;
                                        if (i37 > 0) {
                                            xVar.r(8);
                                        }
                                        int i39 = 0;
                                        for (int i40 = 1; i39 < (i40 << i37); i40 = 1) {
                                            xVar.r(i38);
                                            i39++;
                                            i38 = 8;
                                        }
                                        i36++;
                                        i26 = 3;
                                    }
                                    xVar.r(2);
                                    int i41 = xVar.i(4);
                                    int i42 = 0;
                                    int i43 = 0;
                                    for (int i44 = 0; i44 < i31; i44++) {
                                        i42 += iArr2[iArr[i44]];
                                        while (i43 < i42) {
                                            xVar.r(i41);
                                            i43++;
                                        }
                                    }
                                }
                                i25++;
                                i20 = 6;
                                i19 = 16;
                                i23 = 1;
                            } else {
                                int i45 = 1;
                                int i46 = xVar.i(i20) + 1;
                                int i47 = 0;
                                while (i47 < i46) {
                                    if (xVar.i(16) > 2) {
                                        throw C0045t0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    xVar.r(24);
                                    xVar.r(24);
                                    xVar.r(24);
                                    int i48 = xVar.i(i20) + i45;
                                    int i49 = 8;
                                    xVar.r(8);
                                    int[] iArr3 = new int[i48];
                                    for (int i50 = 0; i50 < i48; i50++) {
                                        iArr3[i50] = ((xVar.h() ? xVar.i(5) : 0) * 8) + xVar.i(3);
                                    }
                                    int i51 = 0;
                                    while (i51 < i48) {
                                        int i52 = 0;
                                        while (i52 < i49) {
                                            if ((iArr3[i51] & (1 << i52)) != 0) {
                                                xVar.r(i49);
                                            }
                                            i52++;
                                            i49 = 8;
                                        }
                                        i51++;
                                        i49 = 8;
                                    }
                                    i47++;
                                    i20 = 6;
                                    i45 = 1;
                                }
                                int i53 = xVar.i(i20) + 1;
                                for (int i54 = 0; i54 < i53; i54++) {
                                    int i55 = xVar.i(16);
                                    if (i55 != 0) {
                                        L.k(i55, "mapping type other than 0 not supported: ", "VorbisUtil");
                                    } else {
                                        int i56 = xVar.h() ? xVar.i(4) + 1 : 1;
                                        boolean h6 = xVar.h();
                                        int i57 = i10.f1404a;
                                        if (h6) {
                                            int i58 = xVar.i(8) + 1;
                                            for (int i59 = 0; i59 < i58; i59++) {
                                                int i60 = i57 - 1;
                                                xVar.r(z.a(i60));
                                                xVar.r(z.a(i60));
                                            }
                                        }
                                        if (xVar.i(2) != 0) {
                                            throw C0045t0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i56 > 1) {
                                            for (int i61 = 0; i61 < i57; i61++) {
                                                xVar.r(4);
                                            }
                                        }
                                        for (int i62 = 0; i62 < i56; i62++) {
                                            xVar.r(8);
                                            xVar.r(8);
                                            xVar.r(8);
                                        }
                                    }
                                }
                                int i63 = xVar.i(6);
                                int i64 = i63 + 1;
                                y[] yVarArr = new y[i64];
                                for (int i65 = 0; i65 < i64; i65++) {
                                    boolean h7 = xVar.h();
                                    xVar.i(16);
                                    xVar.i(16);
                                    xVar.i(8);
                                    y yVar = new y();
                                    yVar.f2588a = h7;
                                    yVarArr[i65] = yVar;
                                }
                                if (!xVar.h()) {
                                    throw C0045t0.a(null, "framing bit after modes not set as expected");
                                }
                                kVar = new k(i10, c1761y0, bArr3, yVarArr, z.a(i63));
                            }
                        }
                    } else {
                        if (xVar.i(24) != 5653314) {
                            throw C0045t0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((xVar.f2585c * 8) + xVar.f2587e));
                        }
                        int i66 = xVar.i(16);
                        int i67 = xVar.i(24);
                        long[] jArr = new long[i67];
                        long j3 = 0;
                        if (xVar.h()) {
                            i7 = i66;
                            int i68 = xVar.i(i17) + 1;
                            int i69 = 0;
                            while (i69 < i67) {
                                int i70 = xVar.i(z.a(i67 - i69));
                                int i71 = 0;
                                while (i71 < i70 && i69 < i67) {
                                    jArr[i69] = i68;
                                    i69++;
                                    i71++;
                                    bArr2 = bArr2;
                                }
                                i68++;
                                bArr2 = bArr2;
                            }
                            bArr = bArr2;
                            i8 = 4;
                        } else {
                            boolean h8 = xVar.h();
                            int i72 = 0;
                            while (i72 < i67) {
                                if (!h8) {
                                    i9 = i66;
                                    jArr[i72] = xVar.i(i17) + 1;
                                } else if (xVar.h()) {
                                    i9 = i66;
                                    jArr[i72] = xVar.i(i17) + 1;
                                } else {
                                    i9 = i66;
                                    jArr[i72] = 0;
                                }
                                i72++;
                                i66 = i9;
                                i11 = 4;
                            }
                            i7 = i66;
                            i8 = i11;
                            bArr = bArr2;
                        }
                        int i73 = xVar.i(i8);
                        if (i73 > 2) {
                            throw C0045t0.a(null, "lookup type greater than 2 not decodable: " + i73);
                        }
                        if (i73 == 1 || i73 == 2) {
                            xVar.r(32);
                            xVar.r(32);
                            int i74 = xVar.i(i8) + 1;
                            xVar.r(1);
                            if (i73 != 1) {
                                j3 = i67 * i7;
                            } else if (i7 != 0) {
                                j3 = (long) Math.floor(Math.pow(i67, 1.0d / i7));
                            }
                            xVar.r((int) (i74 * j3));
                        }
                        i18++;
                        bArr2 = bArr;
                        i11 = 4;
                        i17 = 5;
                    }
                }
            }
        }
        kVar = null;
        this.f4975n = kVar;
        if (kVar == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        I i75 = (I) kVar.f4971b;
        arrayList.add((byte[]) i75.f1410g);
        arrayList.add((byte[]) kVar.f4973d);
        Metadata b7 = z.b(AbstractC0167z.F((String[]) ((C1761y0) kVar.f4972c).f17932b));
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "audio/vorbis";
        format$Builder.f10533f = i75.f1407d;
        format$Builder.f10534g = i75.f1406c;
        format$Builder.f10550x = i75.f1404a;
        format$Builder.f10551y = i75.f1405b;
        format$Builder.f10539m = arrayList;
        format$Builder.f10536i = b7;
        p22.f17508b = new X(format$Builder);
        return true;
    }

    @Override // O1.j
    public final void d(boolean z4) {
        super.d(z4);
        if (z4) {
            this.f4975n = null;
            this.f4978q = null;
            this.f4979r = null;
        }
        this.f4976o = 0;
        this.f4977p = false;
    }
}
