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
import p155w1.C1052y0;
import p155w1.L;
import p155w1.P2;

/* JADX INFO: loaded from: classes.dex */
public final class l extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f4975n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4976o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f4977p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public I f4978q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1052y0 f4979r;

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
        p151v2.a.i(kVar);
        boolean z4 = ((y[]) kVar.f4974e)[(b7 >> 1) & (255 >>> (8 - kVar.f4970a))].f2588a;
        I i7 = (I) kVar.f4971b;
        int i8 = !z4 ? i7.f1408e : i7.f1409f;
        long j = this.f4977p ? (this.f4976o + i8) / 4 : 0;
        byte[] bArr = (byte[]) c0095a.f1465c;
        int length = bArr.length;
        int i9 = c0095a.f1464b + 4;
        if (length < i9) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i9);
            c0095a.B(bArrCopyOf.length, bArrCopyOf);
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

    /* JADX WARN: Code duplicated, block: B:160:0x03c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:162:0x03c5  */
    /* JADX WARN: Type inference failed for: r1v52, types: [byte[], java.io.Serializable] */
    @Override // O1.j
    public final boolean c(C0095a c0095a, long j, P2 p5) throws C0045t0 {
        k kVar;
        int i7;
        byte[] bArr;
        int i8;
        if (this.f4975n != null) {
            ((X) p5.f17514b).getClass();
            return false;
        }
        I i9 = this.f4978q;
        int i10 = 4;
        if (i9 != null) {
            C1052y0 c1052y0 = this.f4979r;
            if (c1052y0 == null) {
                this.f4979r = z.c(c0095a, true, true);
            } else {
                int i11 = c0095a.f1464b;
                byte[] bArr2 = new byte[i11];
                System.arraycopy((byte[]) c0095a.f1465c, 0, bArr2, 0, i11);
                int i12 = 5;
                z.d(5, c0095a, false);
                int iT = c0095a.t() + 1;
                x xVar = new x((byte[]) c0095a.f1465c);
                xVar.r(c0095a.f1463a * 8);
                int i13 = 0;
                while (true) {
                    int i14 = 16;
                    if (i13 >= iT) {
                        byte[] bArr3 = bArr2;
                        int i15 = 6;
                        int i16 = xVar.i(6) + 1;
                        for (int i17 = 0; i17 < i16; i17++) {
                            if (xVar.i(16) != 0) {
                                throw C0045t0.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i18 = 1;
                        int i19 = xVar.i(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 >= i19) {
                                int i22 = 1;
                                int i23 = xVar.i(i15) + 1;
                                int i24 = 0;
                                while (i24 < i23) {
                                    if (xVar.i(16) > 2) {
                                        throw C0045t0.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    xVar.r(24);
                                    xVar.r(24);
                                    xVar.r(24);
                                    int i25 = xVar.i(i15) + i22;
                                    int i26 = 8;
                                    xVar.r(8);
                                    int[] iArr = new int[i25];
                                    for (int i27 = 0; i27 < i25; i27++) {
                                        iArr[i27] = ((xVar.h() ? xVar.i(5) : 0) * 8) + xVar.i(3);
                                    }
                                    int i28 = 0;
                                    while (i28 < i25) {
                                        int i29 = 0;
                                        while (i29 < i26) {
                                            if ((iArr[i28] & (1 << i29)) != 0) {
                                                xVar.r(i26);
                                            }
                                            i29++;
                                            i26 = 8;
                                        }
                                        i28++;
                                        i26 = 8;
                                    }
                                    i24++;
                                    i15 = 6;
                                    i22 = 1;
                                }
                                int i30 = xVar.i(i15) + 1;
                                for (int i31 = 0; i31 < i30; i31++) {
                                    int i32 = xVar.i(16);
                                    if (i32 != 0) {
                                        L.k(i32, "mapping type other than 0 not supported: ", "VorbisUtil");
                                    } else {
                                        int i33 = xVar.h() ? xVar.i(4) + 1 : 1;
                                        boolean zH = xVar.h();
                                        int i34 = i9.f1404a;
                                        if (zH) {
                                            int i35 = xVar.i(8) + 1;
                                            for (int i36 = 0; i36 < i35; i36++) {
                                                int i37 = i34 - 1;
                                                xVar.r(z.a(i37));
                                                xVar.r(z.a(i37));
                                            }
                                        }
                                        if (xVar.i(2) != 0) {
                                            throw C0045t0.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (i33 > 1) {
                                            for (int i38 = 0; i38 < i34; i38++) {
                                                xVar.r(4);
                                            }
                                        }
                                        for (int i39 = 0; i39 < i33; i39++) {
                                            xVar.r(8);
                                            xVar.r(8);
                                            xVar.r(8);
                                        }
                                    }
                                }
                                int i40 = xVar.i(6);
                                int i41 = i40 + 1;
                                y[] yVarArr = new y[i41];
                                for (int i42 = 0; i42 < i41; i42++) {
                                    boolean zH2 = xVar.h();
                                    xVar.i(16);
                                    xVar.i(16);
                                    xVar.i(8);
                                    y yVar = new y();
                                    yVar.f2588a = zH2;
                                    yVarArr[i42] = yVar;
                                }
                                if (!xVar.h()) {
                                    throw C0045t0.a(null, "framing bit after modes not set as expected");
                                }
                                kVar = new k(i9, c1052y0, bArr3, yVarArr, z.a(i40));
                                break;
                            }
                            int i43 = xVar.i(i14);
                            if (i43 == 0) {
                                int i44 = 8;
                                xVar.r(8);
                                xVar.r(16);
                                xVar.r(16);
                                xVar.r(6);
                                xVar.r(8);
                                int i45 = xVar.i(4) + 1;
                                int i46 = 0;
                                while (i46 < i45) {
                                    xVar.r(i44);
                                    i46++;
                                    i44 = 8;
                                }
                            } else {
                                if (i43 != i18) {
                                    throw C0045t0.a(null, "floor type greater than 1 not decodable: " + i43);
                                }
                                int i47 = xVar.i(5);
                                int[] iArr2 = new int[i47];
                                int i48 = -1;
                                for (int i49 = 0; i49 < i47; i49++) {
                                    int i50 = xVar.i(4);
                                    iArr2[i49] = i50;
                                    if (i50 > i48) {
                                        i48 = i50;
                                    }
                                }
                                int i51 = i48 + 1;
                                int[] iArr3 = new int[i51];
                                int i52 = 0;
                                while (i52 < i51) {
                                    iArr3[i52] = xVar.i(i21) + 1;
                                    int i53 = xVar.i(2);
                                    int i54 = 8;
                                    if (i53 > 0) {
                                        xVar.r(8);
                                    }
                                    int i55 = 0;
                                    for (int i56 = 1; i55 < (i56 << i53); i56 = 1) {
                                        xVar.r(i54);
                                        i55++;
                                        i54 = 8;
                                    }
                                    i52++;
                                    i21 = 3;
                                }
                                xVar.r(2);
                                int i57 = xVar.i(4);
                                int i58 = 0;
                                int i59 = 0;
                                for (int i60 = 0; i60 < i47; i60++) {
                                    i58 += iArr3[iArr2[i60]];
                                    while (i59 < i58) {
                                        xVar.r(i57);
                                        i59++;
                                    }
                                }
                            }
                            i20++;
                            i15 = 6;
                            i14 = 16;
                            i18 = 1;
                        }
                    } else {
                        if (xVar.i(24) != 5653314) {
                            throw C0045t0.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((xVar.f2585c * 8) + xVar.f2587e));
                        }
                        int i61 = xVar.i(16);
                        int i62 = xVar.i(24);
                        long[] jArr = new long[i62];
                        long jFloor = 0;
                        if (xVar.h()) {
                            i7 = i61;
                            int i63 = xVar.i(i12) + 1;
                            int i64 = 0;
                            while (i64 < i62) {
                                int i65 = xVar.i(z.a(i62 - i64));
                                int i66 = 0;
                                while (i66 < i65 && i64 < i62) {
                                    jArr[i64] = i63;
                                    i64++;
                                    i66++;
                                    bArr2 = bArr2;
                                }
                                i63++;
                                bArr2 = bArr2;
                            }
                            bArr = bArr2;
                            i8 = 4;
                        } else {
                            boolean zH3 = xVar.h();
                            int i67 = 0;
                            while (i67 < i62) {
                                if (!zH3) {
                                    jArr[i67] = xVar.i(i12) + 1;
                                } else if (xVar.h()) {
                                    jArr[i67] = xVar.i(i12) + 1;
                                } else {
                                    jArr[i67] = 0;
                                }
                                i67++;
                                i61 = i61;
                                i10 = 4;
                            }
                            i7 = i61;
                            i8 = i10;
                            bArr = bArr2;
                        }
                        int i68 = xVar.i(i8);
                        if (i68 > 2) {
                            throw C0045t0.a(null, "lookup type greater than 2 not decodable: " + i68);
                        }
                        if (i68 == 1 || i68 == 2) {
                            xVar.r(32);
                            xVar.r(32);
                            int i69 = xVar.i(i8) + 1;
                            xVar.r(1);
                            if (i68 != 1) {
                                jFloor = ((long) i62) * ((long) i7);
                            } else if (i7 != 0) {
                                jFloor = (long) Math.floor(Math.pow(i62, 1.0d / ((double) i7)));
                            }
                            xVar.r((int) (((long) i69) * jFloor));
                        }
                        i13++;
                        bArr2 = bArr;
                        i10 = 4;
                        i12 = 5;
                    }
                }
            }
            this.f4975n = kVar;
            if (kVar == null) {
                return true;
            }
            ArrayList arrayList = new ArrayList();
            I i70 = (I) kVar.f4971b;
            arrayList.add((byte[]) i70.f1410g);
            arrayList.add((byte[]) kVar.f4973d);
            Metadata metadataB = z.b(AbstractC0167z.F((String[]) ((C1052y0) kVar.f4972c).f17938b));
            Format$Builder format$Builder = new Format$Builder();
            format$Builder.f10537k = "audio/vorbis";
            format$Builder.f10533f = i70.f1407d;
            format$Builder.f10534g = i70.f1406c;
            format$Builder.f10550x = i70.f1404a;
            format$Builder.f10551y = i70.f1405b;
            format$Builder.f10539m = arrayList;
            format$Builder.f10536i = metadataB;
            p5.f17514b = new X(format$Builder);
            return true;
        }
        z.d(1, c0095a, false);
        c0095a.l();
        int iT2 = c0095a.t();
        int iL = c0095a.l();
        int i71 = c0095a.i();
        if (i71 <= 0) {
            i71 = -1;
        }
        int i72 = c0095a.i();
        int i73 = i72 <= 0 ? -1 : i72;
        c0095a.i();
        int iT3 = c0095a.t();
        int iPow = (int) Math.pow(2.0d, iT3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iT3 & 240) >> 4);
        c0095a.t();
        ?? CopyOf = Arrays.copyOf((byte[]) c0095a.f1465c, c0095a.f1464b);
        I i74 = new I();
        i74.f1404a = iT2;
        i74.f1405b = iL;
        i74.f1406c = i71;
        i74.f1407d = i73;
        i74.f1408e = iPow;
        i74.f1409f = iPow2;
        i74.f1410g = CopyOf;
        this.f4978q = i74;
        kVar = null;
        this.f4975n = kVar;
        if (kVar == null) {
            return true;
        }
        ArrayList arrayList2 = new ArrayList();
        I i75 = (I) kVar.f4971b;
        arrayList2.add((byte[]) i75.f1410g);
        arrayList2.add((byte[]) kVar.f4973d);
        Metadata metadataB2 = z.b(AbstractC0167z.F((String[]) ((C1052y0) kVar.f4972c).f17938b));
        Format$Builder format$Builder2 = new Format$Builder();
        format$Builder2.f10537k = "audio/vorbis";
        format$Builder2.f10533f = i75.f1407d;
        format$Builder2.f10534g = i75.f1406c;
        format$Builder2.f10550x = i75.f1404a;
        format$Builder2.f10551y = i75.f1405b;
        format$Builder2.f10539m = arrayList2;
        format$Builder2.f10536i = metadataB2;
        p5.f17514b = new X(format$Builder2);
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
