package N1;

import A1.C0042s;
import A1.C0045t0;
import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import E4.y;
import F1.v;
import W5.AbstractC0486a1;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.emsg.EventMessage;
import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ChromeCustomTabsActivity;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class j implements F1.k {

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final byte[] f4670H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final X f4671I;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f4672A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public int f4673B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f4674C;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f4678G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f4680b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final byte[] f4685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0095a f4686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p151v2.s f4687i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p040f2.m f4691n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4692o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f4693p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f4694q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4695r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C0095a f4696s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f4697t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4698u;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i f4702y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4703z;
    public final V0 j = new V0(21);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0095a f4688k = new C0095a(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0095a f4682d = new C0095a(p151v2.a.f17092c);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0095a f4683e = new C0095a(5);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0095a f4684f = new C0095a(4, false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayDeque f4689l = new ArrayDeque();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayDeque f4690m = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f4681c = new SparseArray();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f4700w = -9223372036854775807L;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f4699v = -9223372036854775807L;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f4701x = -9223372036854775807L;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public F1.m f4675D = F1.m.f2545g;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public v[] f4676E = new v[0];

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public v[] f4677F = new v[0];

    static {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "application/x-emsg";
        f4671I = new X(format$Builder);
    }

    public j(int i7, p151v2.s sVar, List list, p040f2.m mVar) {
        this.f4679a = i7;
        this.f4687i = sVar;
        this.f4680b = Collections.unmodifiableList(list);
        this.f4691n = mVar;
        byte[] bArr = new byte[16];
        this.f4685g = bArr;
        this.f4686h = new C0095a(bArr);
    }

    public static DrmInitData b(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = (b) arrayList.get(i7);
            if (bVar.f1675b == 1886614376) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = (byte[]) bVar.f4636c.f1465c;
                p096n1.e eVarB = p.b(bArr);
                UUID uuid = eVarB == null ? null : (UUID) eVarB.f15314b;
                if (uuid == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new DrmInitData.SchemeData(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new DrmInitData(null, false, (DrmInitData.SchemeData[]) arrayList2.toArray(new DrmInitData.SchemeData[0]));
    }

    public static void c(C0095a c0095a, int i7, s sVar) throws C0045t0 {
        c0095a.D(i7 + 8);
        int iG = c0095a.g();
        if ((iG & 1) != 0) {
            throw C0045t0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (iG & 2) != 0;
        int iW = c0095a.w();
        if (iW == 0) {
            Arrays.fill(sVar.f4764l, 0, sVar.f4758e, false);
            return;
        }
        if (iW != sVar.f4758e) {
            StringBuilder sbJ = AbstractC0486a1.j(iW, "Senc sample count ", " is different from fragment sample count");
            sbJ.append(sVar.f4758e);
            throw C0045t0.a(null, sbJ.toString());
        }
        Arrays.fill(sVar.f4764l, 0, iW, z4);
        int iD = c0095a.d();
        C0095a c0095a2 = sVar.f4766n;
        c0095a2.A(iD);
        sVar.f4763k = true;
        sVar.f4767o = true;
        c0095a.f((byte[]) c0095a2.f1465c, 0, c0095a2.f1464b);
        c0095a2.D(0);
        sVar.f4767o = false;
    }

    @Override // F1.k
    public final boolean a(F1.l lVar) {
        return p.c(lVar, true, false);
    }

    /* JADX WARN: Code duplicated, block: B:302:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x0288  */
    public final void d(long j) throws C0045t0 {
        j jVar;
        int i7;
        j jVar2;
        SparseArray sparseArray;
        ArrayList arrayList;
        int i8;
        int i9;
        ArrayList arrayList2;
        int i10;
        int i11;
        int i12;
        boolean z4;
        int i13;
        i iVar;
        int i14;
        i iVar2;
        int i15;
        g gVar;
        g gVar2;
        ArrayList arrayList3;
        j jVar3 = this;
        int i16 = 1;
        while (true) {
            ArrayDeque arrayDeque = jVar3.f4689l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).f4633c != j) {
                break;
            }
            a aVar = (a) arrayDeque.pop();
            int i17 = aVar.f1675b;
            SparseArray sparseArray2 = jVar3.f4681c;
            ArrayList arrayList4 = aVar.f4634d;
            int i18 = jVar3.f4679a;
            int i19 = 12;
            if (i17 == 1836019574) {
                DrmInitData drmInitDataB = b(arrayList4);
                a aVarT = aVar.t(1836475768);
                aVarT.getClass();
                SparseArray sparseArray3 = new SparseArray();
                ArrayList arrayList5 = aVarT.f4634d;
                int size = arrayList5.size();
                long jU = -9223372036854775807L;
                int i20 = 0;
                while (i20 < size) {
                    b bVar = (b) arrayList5.get(i20);
                    int i21 = bVar.f1675b;
                    C0095a c0095a = bVar.f4636c;
                    if (i21 == 1953654136) {
                        c0095a.D(i19);
                        arrayList3 = arrayList5;
                        Pair pairCreate = Pair.create(Integer.valueOf(c0095a.g()), new g(c0095a.g() - i16, c0095a.g(), c0095a.g(), c0095a.g()));
                        sparseArray3.put(((Integer) pairCreate.first).intValue(), (g) pairCreate.second);
                    } else {
                        arrayList3 = arrayList5;
                        if (i21 == 1835362404) {
                            c0095a.D(8);
                            jU = D1.a.l(c0095a.g()) == 0 ? c0095a.u() : c0095a.x();
                        }
                    }
                    i20++;
                    i16 = 1;
                    arrayList5 = arrayList3;
                    i19 = 12;
                }
                ArrayList arrayListE = f.e(aVar, new F1.p(), jU, drmInitDataB, (i18 & 16) != 0, false, new C0042s(jVar3, 26));
                int size2 = arrayListE.size();
                if (sparseArray2.size() == 0) {
                    for (int i22 = 0; i22 < size2; i22++) {
                        t tVar = (t) arrayListE.get(i22);
                        q qVar = tVar.f4770a;
                        v vVarR = jVar3.f4675D.r(i22, qVar.f4740b);
                        int size3 = sparseArray3.size();
                        int i23 = qVar.f4739a;
                        if (size3 == 1) {
                            gVar2 = (g) sparseArray3.valueAt(0);
                        } else {
                            gVar2 = (g) sparseArray3.get(i23);
                            gVar2.getClass();
                        }
                        sparseArray2.put(i23, new i(vVarR, tVar, gVar2));
                        jVar3.f4700w = Math.max(jVar3.f4700w, qVar.f4743e);
                    }
                    jVar3.f4675D.n();
                } else {
                    p151v2.a.h(sparseArray2.size() == size2);
                    for (int i24 = 0; i24 < size2; i24++) {
                        t tVar2 = (t) arrayListE.get(i24);
                        q qVar2 = tVar2.f4770a;
                        i iVar3 = (i) sparseArray2.get(qVar2.f4739a);
                        if (sparseArray3.size() == 1) {
                            gVar = (g) sparseArray3.valueAt(0);
                        } else {
                            gVar = (g) sparseArray3.get(qVar2.f4739a);
                            gVar.getClass();
                        }
                        iVar3.f4662d = tVar2;
                        iVar3.f4663e = gVar;
                        iVar3.f4659a.a(tVar2.f4770a.f4744f);
                        iVar3.d();
                    }
                }
                jVar = jVar3;
                i7 = 1;
            } else {
                SparseArray sparseArray4 = sparseArray2;
                if (i17 == 1836019558) {
                    ArrayList arrayList6 = aVar.f4635e;
                    int size4 = arrayList6.size();
                    int i25 = 0;
                    while (i25 < size4) {
                        a aVar2 = (a) arrayList6.get(i25);
                        if (aVar2.f1675b == 1953653094) {
                            b bVarY = aVar2.y(1952868452);
                            bVarY.getClass();
                            C0095a c0095a2 = bVarY.f4636c;
                            c0095a2.D(8);
                            int iG = c0095a2.g();
                            i iVar4 = (i) sparseArray4.get(c0095a2.g());
                            if (iVar4 == null) {
                                iVar4 = null;
                            } else {
                                int i26 = iG & 1;
                                s sVar = iVar4.f4660b;
                                if (i26 != 0) {
                                    long jX = c0095a2.x();
                                    sVar.f4755b = jX;
                                    sVar.f4756c = jX;
                                }
                                g gVar3 = iVar4.f4663e;
                                sVar.f4754a = new g((iG & 2) != 0 ? c0095a2.g() - 1 : gVar3.f4652a, (iG & 8) != 0 ? c0095a2.g() : gVar3.f4653b, (iG & 16) != 0 ? c0095a2.g() : gVar3.f4654c, (iG & 32) != 0 ? c0095a2.g() : gVar3.f4655d);
                            }
                            if (iVar4 != null) {
                                s sVar2 = iVar4.f4660b;
                                long j3 = sVar2.f4768p;
                                boolean z7 = sVar2.f4769q;
                                iVar4.d();
                                iVar4.f4669l = true;
                                b bVarY2 = aVar2.y(1952867444);
                                if (bVarY2 == null || (i18 & 2) != 0) {
                                    sVar2.f4768p = j3;
                                    sVar2.f4769q = z7;
                                } else {
                                    C0095a c0095a3 = bVarY2.f4636c;
                                    c0095a3.D(8);
                                    sVar2.f4768p = D1.a.l(c0095a3.g()) == 1 ? c0095a3.x() : c0095a3.u();
                                    sVar2.f4769q = true;
                                }
                                ArrayList arrayList7 = aVar2.f4634d;
                                int size5 = arrayList7.size();
                                int i27 = 0;
                                int i28 = 0;
                                int i29 = 0;
                                while (true) {
                                    i11 = 1953658222;
                                    if (i27 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList8 = arrayList6;
                                    b bVar2 = (b) arrayList7.get(i27);
                                    int i30 = size4;
                                    if (bVar2.f1675b == 1953658222) {
                                        C0095a c0095a4 = bVar2.f4636c;
                                        c0095a4.D(12);
                                        int iW = c0095a4.w();
                                        if (iW > 0) {
                                            i29 += iW;
                                            i15 = 1;
                                            i28++;
                                        } else {
                                            i15 = 1;
                                        }
                                    } else {
                                        i15 = 1;
                                    }
                                    i27 += i15;
                                    size4 = i30;
                                    arrayList6 = arrayList8;
                                }
                                arrayList = arrayList6;
                                i8 = size4;
                                iVar4.f4666h = 0;
                                iVar4.f4665g = 0;
                                iVar4.f4664f = 0;
                                sVar2.f4757d = i28;
                                sVar2.f4758e = i29;
                                if (sVar2.f4760g.length < i28) {
                                    sVar2.f4759f = new long[i28];
                                    sVar2.f4760g = new int[i28];
                                }
                                if (sVar2.f4761h.length < i29) {
                                    int i31 = (i29 * 125) / 100;
                                    sVar2.f4761h = new int[i31];
                                    sVar2.f4762i = new long[i31];
                                    sVar2.j = new boolean[i31];
                                    sVar2.f4764l = new boolean[i31];
                                }
                                int i32 = 0;
                                int i33 = 0;
                                int i34 = 0;
                                while (true) {
                                    long j7 = 0;
                                    if (i32 >= size5) {
                                        sparseArray = sparseArray4;
                                        ArrayList arrayList9 = arrayList7;
                                        i9 = i25;
                                        a aVar3 = aVar2;
                                        arrayList2 = arrayList4;
                                        i10 = i18;
                                        t tVar3 = iVar4.f4662d;
                                        g gVar4 = sVar2.f4754a;
                                        gVar4.getClass();
                                        r rVar = tVar3.f4770a.f4748k[gVar4.f4652a];
                                        b bVarY3 = aVar3.y(1935763834);
                                        if (bVarY3 != null) {
                                            rVar.getClass();
                                            C0095a c0095a5 = bVarY3.f4636c;
                                            c0095a5.D(8);
                                            if ((c0095a5.g() & 1) == 1) {
                                                c0095a5.E(8);
                                            }
                                            int iT = c0095a5.t();
                                            int iW2 = c0095a5.w();
                                            if (iW2 > sVar2.f4758e) {
                                                StringBuilder sbJ = AbstractC0486a1.j(iW2, "Saiz sample count ", " is greater than fragment sample count");
                                                sbJ.append(sVar2.f4758e);
                                                throw C0045t0.a(null, sbJ.toString());
                                            }
                                            int i35 = rVar.f4752d;
                                            if (iT == 0) {
                                                boolean[] zArr = sVar2.f4764l;
                                                i12 = 0;
                                                for (int i36 = 0; i36 < iW2; i36++) {
                                                    int iT2 = c0095a5.t();
                                                    i12 += iT2;
                                                    zArr[i36] = iT2 > i35;
                                                }
                                                z4 = false;
                                            } else {
                                                boolean z8 = iT > i35;
                                                i12 = iT * iW2;
                                                z4 = false;
                                                Arrays.fill(sVar2.f4764l, 0, iW2, z8);
                                            }
                                            Arrays.fill(sVar2.f4764l, iW2, sVar2.f4758e, z4);
                                            if (i12 > 0) {
                                                sVar2.f4766n.A(i12);
                                                sVar2.f4763k = true;
                                                sVar2.f4767o = true;
                                            }
                                        }
                                        b bVarY4 = aVar3.y(1935763823);
                                        if (bVarY4 != null) {
                                            C0095a c0095a6 = bVarY4.f4636c;
                                            c0095a6.D(8);
                                            int iG2 = c0095a6.g();
                                            if ((iG2 & 1) == 1) {
                                                c0095a6.E(8);
                                            }
                                            int iW3 = c0095a6.w();
                                            if (iW3 != 1) {
                                                throw C0045t0.a(null, "Unexpected saio entry count: " + iW3);
                                            }
                                            sVar2.f4756c += D1.a.l(iG2) == 0 ? c0095a6.u() : c0095a6.x();
                                        }
                                        byte[] bArr = null;
                                        b bVarY5 = aVar3.y(1936027235);
                                        if (bVarY5 != null) {
                                            c(bVarY5.f4636c, 0, sVar2);
                                        }
                                        String str = rVar != null ? rVar.f4750b : null;
                                        C0095a c0095a7 = null;
                                        C0095a c0095a8 = null;
                                        int i37 = 0;
                                        while (i37 < arrayList9.size()) {
                                            ArrayList arrayList10 = arrayList9;
                                            b bVar3 = (b) arrayList10.get(i37);
                                            C0095a c0095a9 = bVar3.f4636c;
                                            int i38 = bVar3.f1675b;
                                            if (i38 == 1935828848) {
                                                c0095a9.D(12);
                                                if (c0095a9.g() == 1936025959) {
                                                    c0095a7 = c0095a9;
                                                }
                                            } else if (i38 == 1936158820) {
                                                c0095a9.D(12);
                                                if (c0095a9.g() == 1936025959) {
                                                    c0095a8 = c0095a9;
                                                }
                                            }
                                            i37++;
                                            arrayList9 = arrayList10;
                                        }
                                        ArrayList arrayList11 = arrayList9;
                                        if (c0095a7 != null && c0095a8 != null) {
                                            c0095a7.D(8);
                                            int iL = D1.a.l(c0095a7.g());
                                            c0095a7.E(4);
                                            if (iL == 1) {
                                                c0095a7.E(4);
                                            }
                                            if (c0095a7.g() != 1) {
                                                throw C0045t0.c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c0095a8.D(8);
                                            int iL2 = D1.a.l(c0095a8.g());
                                            c0095a8.E(4);
                                            if (iL2 == 1) {
                                                if (c0095a8.u() == 0) {
                                                    throw C0045t0.c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (iL2 >= 2) {
                                                c0095a8.E(4);
                                            }
                                            if (c0095a8.u() != 1) {
                                                throw C0045t0.c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c0095a8.E(1);
                                            int iT3 = c0095a8.t();
                                            int i39 = (iT3 & 240) >> 4;
                                            int i40 = iT3 & 15;
                                            boolean z9 = c0095a8.t() == 1;
                                            if (z9) {
                                                int iT4 = c0095a8.t();
                                                byte[] bArr2 = new byte[16];
                                                c0095a8.f(bArr2, 0, 16);
                                                if (iT4 == 0) {
                                                    int iT5 = c0095a8.t();
                                                    bArr = new byte[iT5];
                                                    c0095a8.f(bArr, 0, iT5);
                                                }
                                                sVar2.f4763k = true;
                                                sVar2.f4765m = new r(z9, str, iT4, bArr2, i39, i40, bArr);
                                            }
                                        }
                                        int size6 = arrayList11.size();
                                        for (int i41 = 0; i41 < size6; i41++) {
                                            b bVar4 = (b) arrayList11.get(i41);
                                            if (bVar4.f1675b == 1970628964) {
                                                C0095a c0095a10 = bVar4.f4636c;
                                                c0095a10.D(8);
                                                byte[] bArr3 = this.f4685g;
                                                c0095a10.f(bArr3, 0, 16);
                                                if (Arrays.equals(bArr3, f4670H)) {
                                                    c(c0095a10, 16, sVar2);
                                                }
                                            }
                                        }
                                        jVar2 = this;
                                        break;
                                    }
                                    b bVar5 = (b) arrayList7.get(i32);
                                    if (bVar5.f1675b == i11) {
                                        int i42 = i33 + 1;
                                        C0095a c0095a11 = bVar5.f4636c;
                                        c0095a11.D(8);
                                        int iG3 = c0095a11.g();
                                        t tVar4 = iVar4.f4662d;
                                        g gVar5 = sVar2.f4754a;
                                        int i43 = p151v2.t.f17159a;
                                        sVar2.f4760g[i33] = c0095a11.w();
                                        long[] jArr = sVar2.f4759f;
                                        int i44 = i34;
                                        long j8 = sVar2.f4755b;
                                        jArr[i33] = j8;
                                        if ((iG3 & 1) != 0) {
                                            jArr[i33] = j8 + ((long) c0095a11.g());
                                        }
                                        boolean z10 = (iG3 & 4) != 0;
                                        int iG4 = gVar5.f4655d;
                                        if (z10) {
                                            iG4 = c0095a11.g();
                                        }
                                        boolean z11 = (iG3 & 256) != 0;
                                        boolean z12 = (iG3 & 512) != 0;
                                        boolean z13 = (iG3 & 1024) != 0;
                                        boolean z14 = (iG3 & 2048) != 0;
                                        q qVar3 = tVar4.f4770a;
                                        long[] jArr2 = qVar3.f4746h;
                                        if (jArr2 != null) {
                                            i14 = iG4;
                                            i13 = i25;
                                            if (jArr2.length == 1 && jArr2[0] == 0) {
                                                j7 = qVar3.f4747i[0];
                                            }
                                        } else {
                                            i13 = i25;
                                            i14 = iG4;
                                        }
                                        int[] iArr = sVar2.f4761h;
                                        long[] jArr3 = sVar2.f4762i;
                                        boolean[] zArr2 = sVar2.j;
                                        boolean z15 = qVar3.f4740b == 2 && (i18 & 1) != 0;
                                        int i45 = i44 + sVar2.f4760g[i33];
                                        long j9 = sVar2.f4768p;
                                        int i46 = i44;
                                        while (i46 < i45) {
                                            int iG5 = z11 ? c0095a11.g() : gVar5.f4653b;
                                            if (iG5 < 0) {
                                                throw C0045t0.a(null, "Unexpected negative value: " + iG5);
                                            }
                                            int iG6 = z12 ? c0095a11.g() : gVar5.f4654c;
                                            if (iG6 < 0) {
                                                throw C0045t0.a(null, "Unexpected negative value: " + iG6);
                                            }
                                            int iG7 = z13 ? c0095a11.g() : (i46 == 0 && z10) ? i14 : gVar5.f4655d;
                                            long jK = p151v2.t.K((((long) (z14 ? c0095a11.g() : 0)) + j9) - j7, 1000000L, qVar3.f4741c);
                                            jArr3[i46] = jK;
                                            if (sVar2.f4769q) {
                                                iVar2 = iVar4;
                                            } else {
                                                iVar2 = iVar4;
                                                jArr3[i46] = jK + iVar2.f4662d.f4777h;
                                            }
                                            iArr[i46] = iG6;
                                            zArr2[i46] = ((iG7 >> 16) & 1) == 0 && (!z15 || i46 == 0);
                                            j9 += (long) iG5;
                                            i46++;
                                            gVar5 = gVar5;
                                            i45 = i45;
                                            z11 = z11;
                                            z12 = z12;
                                            c0095a11 = c0095a11;
                                            z13 = z13;
                                            z14 = z14;
                                            qVar3 = qVar3;
                                            iVar4 = iVar2;
                                            z10 = z10;
                                        }
                                        iVar = iVar4;
                                        sVar2.f4768p = j9;
                                        i33 = i42;
                                        i34 = i45;
                                    } else {
                                        i13 = i25;
                                        arrayList4 = arrayList4;
                                        i18 = i18;
                                        iVar = iVar4;
                                    }
                                    i32++;
                                    iVar4 = iVar;
                                    size5 = size5;
                                    sparseArray4 = sparseArray4;
                                    aVar2 = aVar2;
                                    arrayList4 = arrayList4;
                                    i18 = i18;
                                    i25 = i13;
                                    arrayList7 = arrayList7;
                                    i11 = 1953658222;
                                }
                            } else {
                                jVar2 = jVar3;
                                sparseArray = sparseArray4;
                                arrayList = arrayList6;
                                i8 = size4;
                                i9 = i25;
                                arrayList2 = arrayList4;
                                i10 = i18;
                            }
                        } else {
                            jVar2 = jVar3;
                            sparseArray = sparseArray4;
                            arrayList = arrayList6;
                            i8 = size4;
                            i9 = i25;
                            arrayList2 = arrayList4;
                            i10 = i18;
                        }
                        i25 = i9 + 1;
                        jVar3 = jVar2;
                        size4 = i8;
                        arrayList6 = arrayList;
                        sparseArray4 = sparseArray;
                        arrayList4 = arrayList2;
                        i18 = i10;
                    }
                    jVar = jVar3;
                    SparseArray sparseArray5 = sparseArray4;
                    DrmInitData drmInitDataB2 = b(arrayList4);
                    if (drmInitDataB2 != null) {
                        int size7 = sparseArray5.size();
                        int i47 = 0;
                        while (i47 < size7) {
                            SparseArray sparseArray6 = sparseArray5;
                            i iVar5 = (i) sparseArray6.valueAt(i47);
                            t tVar5 = iVar5.f4662d;
                            g gVar6 = iVar5.f4660b.f4754a;
                            int i48 = p151v2.t.f17159a;
                            r rVar2 = tVar5.f4770a.f4748k[gVar6.f4652a];
                            DrmInitData drmInitDataA = drmInitDataB2.a(rVar2 != null ? rVar2.f4750b : null);
                            Format$Builder format$BuilderA = iVar5.f4662d.f4770a.f4744f.a();
                            format$BuilderA.f10540n = drmInitDataA;
                            iVar5.f4659a.a(new X(format$BuilderA));
                            i47++;
                            sparseArray5 = sparseArray6;
                        }
                    }
                    SparseArray sparseArray7 = sparseArray5;
                    if (jVar.f4699v != -9223372036854775807L) {
                        int size8 = sparseArray7.size();
                        for (int i49 = 0; i49 < size8; i49++) {
                            i iVar6 = (i) sparseArray7.valueAt(i49);
                            long j10 = jVar.f4699v;
                            int i50 = iVar6.f4664f;
                            while (true) {
                                s sVar3 = iVar6.f4660b;
                                if (i50 >= sVar3.f4758e || sVar3.f4762i[i50] >= j10) {
                                    break;
                                }
                                if (sVar3.j[i50]) {
                                    iVar6.f4667i = i50;
                                }
                                i50++;
                            }
                        }
                        i7 = 1;
                        jVar.f4699v = -9223372036854775807L;
                    } else {
                        i7 = 1;
                    }
                } else {
                    jVar = jVar3;
                    i7 = 1;
                    if (!arrayDeque.isEmpty()) {
                        ((a) arrayDeque.peek()).f4635e.add(aVar);
                    }
                }
            }
            jVar3 = jVar;
            i16 = i7;
        }
        j jVar4 = jVar3;
        jVar4.f4692o = 0;
        jVar4.f4695r = 0;
    }

    @Override // F1.k
    public final void e(F1.m mVar) {
        int i7;
        this.f4675D = mVar;
        int i8 = 0;
        this.f4692o = 0;
        this.f4695r = 0;
        v[] vVarArr = new v[2];
        this.f4676E = vVarArr;
        p040f2.m mVar2 = this.f4691n;
        if (mVar2 != null) {
            vVarArr[0] = mVar2;
            i7 = 1;
        } else {
            i7 = 0;
        }
        int i9 = 100;
        if ((this.f4679a & 4) != 0) {
            vVarArr[i7] = mVar.r(100, 5);
            i9 = ChromeCustomTabsActivity.NO_HISTORY_CHROME_CUSTOM_TAB_REQUEST_CODE;
            i7++;
        }
        v[] vVarArr2 = (v[]) p151v2.t.G(i7, this.f4676E);
        this.f4676E = vVarArr2;
        for (v vVar : vVarArr2) {
            vVar.a(f4671I);
        }
        List list = this.f4680b;
        this.f4677F = new v[list.size()];
        while (i8 < this.f4677F.length) {
            v vVarR = this.f4675D.r(i9, 3);
            vVarR.a((X) list.get(i8));
            this.f4677F[i8] = vVarR;
            i8++;
            i9++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // F1.k
    public final int f(F1.l lVar, y yVar) throws C0045t0, EOFException, InterruptedIOException {
        ArrayDeque arrayDeque;
        p151v2.s sVar;
        i iVar;
        p151v2.s sVar2;
        int iD;
        int i7;
        boolean z4;
        long jK;
        String str;
        long j;
        String str2;
        long jA;
        long jU;
        long jX;
        long jX2;
        while (true) {
            int i8 = this.f4692o;
            ArrayDeque arrayDeque2 = this.f4689l;
            SparseArray sparseArray = this.f4681c;
            if (i8 != 0) {
                arrayDeque = this.f4690m;
                sVar = this.f4687i;
                if (i8 != 1) {
                    long j3 = Long.MAX_VALUE;
                    if (i8 != 2) {
                        iVar = this.f4702y;
                        if (iVar != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        long j7 = Long.MAX_VALUE;
                        i iVar2 = null;
                        for (int i9 = 0; i9 < size; i9++) {
                            i iVar3 = (i) sparseArray.valueAt(i9);
                            boolean z7 = iVar3.f4669l;
                            if (z7 || iVar3.f4664f != iVar3.f4662d.f4771b) {
                                s sVar3 = iVar3.f4660b;
                                if (!z7 || iVar3.f4666h != sVar3.f4757d) {
                                    long j8 = !z7 ? iVar3.f4662d.f4772c[iVar3.f4664f] : sVar3.f4759f[iVar3.f4666h];
                                    if (j8 < j7) {
                                        iVar2 = iVar3;
                                        j7 = j8;
                                    }
                                }
                            }
                        }
                        if (iVar2 != null) {
                            int i10 = (int) ((!iVar2.f4669l ? iVar2.f4662d.f4772c[iVar2.f4664f] : iVar2.f4660b.f4759f[iVar2.f4666h]) - ((F1.h) lVar).f2534d);
                            if (i10 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i10 = 0;
                            }
                            ((F1.h) lVar).q(i10);
                            this.f4702y = iVar2;
                            iVar = iVar2;
                            break;
                        }
                        int i11 = (int) (this.f4697t - ((F1.h) lVar).f2534d);
                        if (i11 < 0) {
                            throw C0045t0.a(null, "Offset to end of mdat was negative.");
                        }
                        ((F1.h) lVar).q(i11);
                        this.f4692o = 0;
                        this.f4695r = 0;
                    } else {
                        int size2 = sparseArray.size();
                        i iVar4 = null;
                        for (int i12 = 0; i12 < size2; i12++) {
                            s sVar4 = ((i) sparseArray.valueAt(i12)).f4660b;
                            if (sVar4.f4767o) {
                                long j9 = sVar4.f4756c;
                                if (j9 < j3) {
                                    iVar4 = (i) sparseArray.valueAt(i12);
                                    j3 = j9;
                                }
                            }
                        }
                        if (iVar4 == null) {
                            this.f4692o = 3;
                        } else {
                            int i13 = (int) (j3 - ((F1.h) lVar).f2534d);
                            if (i13 < 0) {
                                throw C0045t0.a(null, "Offset to encryption data was negative.");
                            }
                            F1.h hVar = (F1.h) lVar;
                            hVar.q(i13);
                            s sVar5 = iVar4.f4660b;
                            C0095a c0095a = sVar5.f4766n;
                            hVar.a((byte[]) c0095a.f1465c, 0, c0095a.f1464b, false);
                            c0095a.D(0);
                            sVar5.f4767o = false;
                        }
                    }
                } else {
                    int i14 = ((int) this.f4694q) - this.f4695r;
                    C0095a c0095a2 = this.f4696s;
                    if (c0095a2 != null) {
                        ((F1.h) lVar).a((byte[]) c0095a2.f1465c, 8, i14, false);
                        int i15 = this.f4693p;
                        b bVar = new b(i15, c0095a2);
                        long j10 = ((F1.h) lVar).f2534d;
                        if (!arrayDeque2.isEmpty()) {
                            ((a) arrayDeque2.peek()).f4634d.add(bVar);
                        } else if (i15 == 1936286840) {
                            c0095a2.D(8);
                            int iL = D1.a.l(c0095a2.g());
                            c0095a2.E(4);
                            long jU2 = c0095a2.u();
                            if (iL == 0) {
                                jX = c0095a2.u();
                                jX2 = c0095a2.u();
                            } else {
                                jX = c0095a2.x();
                                jX2 = c0095a2.x();
                            }
                            long j11 = jX2 + j10;
                            long jK2 = p151v2.t.K(jX, 1000000L, jU2);
                            c0095a2.E(2);
                            int iY = c0095a2.y();
                            int[] iArr = new int[iY];
                            long[] jArr = new long[iY];
                            long[] jArr2 = new long[iY];
                            long[] jArr3 = new long[iY];
                            long j12 = j11;
                            long jK3 = jK2;
                            int i16 = 0;
                            while (i16 < iY) {
                                int iG = c0095a2.g();
                                if ((iG & Integer.MIN_VALUE) != 0) {
                                    throw C0045t0.a(null, "Unhandled indirect reference");
                                }
                                long jU3 = c0095a2.u();
                                iArr[i16] = iG & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                jArr[i16] = j12;
                                jArr3[i16] = jK3;
                                long j13 = jX + jU3;
                                jK3 = p151v2.t.K(j13, 1000000L, jU2);
                                jArr2[i16] = jK3 - jArr3[i16];
                                c0095a2.E(4);
                                j12 += (long) iArr[i16];
                                i16++;
                                jX = j13;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jK2), new F1.f(iArr, jArr, jArr2, jArr3));
                            this.f4701x = ((Long) pairCreate.first).longValue();
                            this.f4675D.m((F1.s) pairCreate.second);
                            this.f4678G = true;
                        } else if (i15 == 1701671783 && this.f4676E.length != 0) {
                            c0095a2.D(8);
                            int iL2 = D1.a.l(c0095a2.g());
                            long j14 = -9223372036854775807L;
                            if (iL2 == 0) {
                                String strO = c0095a2.o();
                                strO.getClass();
                                String strO2 = c0095a2.o();
                                strO2.getClass();
                                long jU4 = c0095a2.u();
                                long jK4 = p151v2.t.K(c0095a2.u(), 1000000L, jU4);
                                long j15 = this.f4701x;
                                long j16 = j15 != -9223372036854775807L ? j15 + jK4 : -9223372036854775807L;
                                jK = p151v2.t.K(c0095a2.u(), 1000L, jU4);
                                str = strO;
                                j = jK4;
                                str2 = strO2;
                                jA = j16;
                                jU = c0095a2.u();
                            } else if (iL2 != 1) {
                                p150v0.a.j(iL2, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long jU5 = c0095a2.u();
                                jA = p151v2.t.K(c0095a2.x(), 1000000L, jU5);
                                long jK5 = p151v2.t.K(c0095a2.u(), 1000L, jU5);
                                long jU6 = c0095a2.u();
                                String strO3 = c0095a2.o();
                                strO3.getClass();
                                String strO4 = c0095a2.o();
                                strO4.getClass();
                                jK = jK5;
                                str = strO3;
                                j = -9223372036854775807L;
                                str2 = strO4;
                                jU = jU6;
                            }
                            byte[] bArr = new byte[c0095a2.d()];
                            c0095a2.f(bArr, 0, c0095a2.d());
                            C0095a c0095a3 = new C0095a(this.j.O(new EventMessage(str, str2, jK, jU, bArr)));
                            int iD2 = c0095a3.d();
                            v[] vVarArr = this.f4676E;
                            int length = vVarArr.length;
                            int i17 = 0;
                            while (i17 < length) {
                                v vVar = vVarArr[i17];
                                c0095a3.D(0);
                                vVar.c(iD2, c0095a3);
                                i17++;
                                j14 = -9223372036854775807L;
                            }
                            if (jA == j14) {
                                arrayDeque.addLast(new h(j, true, iD2));
                                this.f4698u += iD2;
                            } else if (arrayDeque.isEmpty()) {
                                if (sVar != null) {
                                    jA = sVar.a(jA);
                                }
                                for (v vVar2 : this.f4676E) {
                                    vVar2.e(jA, 1, iD2, 0, null);
                                }
                            } else {
                                arrayDeque.addLast(new h(jA, false, iD2));
                                this.f4698u += iD2;
                            }
                        }
                    } else {
                        ((F1.h) lVar).q(i14);
                    }
                    d(((F1.h) lVar).f2534d);
                }
            } else {
                int i18 = this.f4695r;
                C0095a c0095a4 = this.f4688k;
                if (i18 == 0) {
                    if (!((F1.h) lVar).a((byte[]) c0095a4.f1465c, 0, 8, true)) {
                        return -1;
                    }
                    this.f4695r = 8;
                    c0095a4.D(0);
                    this.f4694q = c0095a4.u();
                    this.f4693p = c0095a4.g();
                }
                long j17 = this.f4694q;
                if (j17 == 1) {
                    ((F1.h) lVar).a((byte[]) c0095a4.f1465c, 8, 8, false);
                    this.f4695r += 8;
                    this.f4694q = c0095a4.x();
                } else if (j17 == 0) {
                    long j18 = ((F1.h) lVar).f2533c;
                    if (j18 == -1 && !arrayDeque2.isEmpty()) {
                        j18 = ((a) arrayDeque2.peek()).f4633c;
                    }
                    if (j18 != -1) {
                        this.f4694q = (j18 - ((F1.h) lVar).f2534d) + ((long) this.f4695r);
                    }
                }
                long j19 = this.f4694q;
                int i19 = this.f4695r;
                if (j19 < i19) {
                    throw C0045t0.c("Atom size less than header length (unsupported).");
                }
                long j20 = ((F1.h) lVar).f2534d - ((long) i19);
                int i20 = this.f4693p;
                if ((i20 == 1836019558 || i20 == 1835295092) && !this.f4678G) {
                    this.f4675D.m(new F1.n(this.f4700w, j20));
                    this.f4678G = true;
                }
                if (this.f4693p == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i21 = 0; i21 < size3; i21++) {
                        s sVar6 = ((i) sparseArray.valueAt(i21)).f4660b;
                        sVar6.getClass();
                        sVar6.f4756c = j20;
                        sVar6.f4755b = j20;
                    }
                }
                int i22 = this.f4693p;
                if (i22 == 1835295092) {
                    this.f4702y = null;
                    this.f4697t = j20 + this.f4694q;
                    this.f4692o = 2;
                } else if (i22 == 1836019574 || i22 == 1953653099 || i22 == 1835297121 || i22 == 1835626086 || i22 == 1937007212 || i22 == 1836019558 || i22 == 1953653094 || i22 == 1836475768 || i22 == 1701082227) {
                    long j21 = (((F1.h) lVar).f2534d + this.f4694q) - 8;
                    arrayDeque2.push(new a(i22, j21));
                    if (this.f4694q == this.f4695r) {
                        d(j21);
                    } else {
                        this.f4692o = 0;
                        this.f4695r = 0;
                    }
                } else if (i22 == 1751411826 || i22 == 1835296868 || i22 == 1836476516 || i22 == 1936286840 || i22 == 1937011556 || i22 == 1937011827 || i22 == 1668576371 || i22 == 1937011555 || i22 == 1937011578 || i22 == 1937013298 || i22 == 1937007471 || i22 == 1668232756 || i22 == 1937011571 || i22 == 1952867444 || i22 == 1952868452 || i22 == 1953196132 || i22 == 1953654136 || i22 == 1953658222 || i22 == 1886614376 || i22 == 1935763834 || i22 == 1935763823 || i22 == 1936027235 || i22 == 1970628964 || i22 == 1935828848 || i22 == 1936158820 || i22 == 1701606260 || i22 == 1835362404 || i22 == 1701671783) {
                    if (this.f4695r != 8) {
                        throw C0045t0.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j22 = this.f4694q;
                    if (j22 > 2147483647L) {
                        throw C0045t0.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C0095a c0095a5 = new C0095a((int) j22);
                    System.arraycopy((byte[]) c0095a4.f1465c, 0, (byte[]) c0095a5.f1465c, 0, 8);
                    this.f4696s = c0095a5;
                    this.f4692o = 1;
                } else {
                    if (this.f4694q > 2147483647L) {
                        throw C0045t0.c("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f4696s = null;
                    this.f4692o = 1;
                }
            }
        }
        int i23 = this.f4692o;
        s sVar7 = iVar.f4660b;
        if (i23 == 3) {
            int i24 = !iVar.f4669l ? iVar.f4662d.f4773d[iVar.f4664f] : sVar7.f4761h[iVar.f4664f];
            this.f4703z = i24;
            if (iVar.f4664f < iVar.f4667i) {
                ((F1.h) lVar).q(i24);
                r rVarA = iVar.a();
                if (rVarA != null) {
                    C0095a c0095a6 = sVar7.f4766n;
                    int i25 = rVarA.f4752d;
                    if (i25 != 0) {
                        c0095a6.E(i25);
                    }
                    int i26 = iVar.f4664f;
                    if (sVar7.f4763k && sVar7.f4764l[i26]) {
                        c0095a6.E(c0095a6.y() * 6);
                    }
                }
                if (!iVar.b()) {
                    this.f4702y = null;
                }
                this.f4692o = 3;
                return 0;
            }
            if (iVar.f4662d.f4770a.f4745g == 1) {
                this.f4703z = i24 - 8;
                ((F1.h) lVar).q(8);
            }
            if ("audio/ac4".equals(iVar.f4662d.f4770a.f4744f.f283C)) {
                this.f4672A = iVar.c(this.f4703z, 7);
                int i27 = this.f4703z;
                C0095a c0095a7 = this.f4686h;
                AbstractC0096b.c(i27, c0095a7);
                iVar.f4659a.c(7, c0095a7);
                this.f4672A += 7;
            } else {
                this.f4672A = iVar.c(this.f4703z, 0);
            }
            this.f4703z += this.f4672A;
            this.f4692o = 4;
            this.f4673B = 0;
        }
        t tVar = iVar.f4662d;
        long jA2 = iVar.f4669l ? sVar7.f4762i[iVar.f4664f] : tVar.f4775f[iVar.f4664f];
        if (sVar != null) {
            jA2 = sVar.a(jA2);
        }
        q qVar = tVar.f4770a;
        int i28 = qVar.j;
        v vVar3 = iVar.f4659a;
        if (i28 == 0) {
            sVar2 = sVar;
            while (true) {
                int i29 = this.f4672A;
                int i30 = this.f4703z;
                if (i29 >= i30) {
                    break;
                }
                this.f4672A += vVar3.d(lVar, i30 - i29, false);
            }
        } else {
            C0095a c0095a8 = this.f4683e;
            byte[] bArr2 = (byte[]) c0095a8.f1465c;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i31 = i28 + 1;
            int i32 = 4 - i28;
            while (this.f4672A < this.f4703z) {
                int i33 = this.f4673B;
                p151v2.s sVar8 = sVar;
                X x4 = qVar.f4744f;
                if (i33 == 0) {
                    q qVar2 = qVar;
                    ((F1.h) lVar).a(bArr2, i32, i31, false);
                    c0095a8.D(0);
                    int iG2 = c0095a8.g();
                    if (iG2 < 1) {
                        throw C0045t0.a(null, "Invalid NAL length");
                    }
                    this.f4673B = iG2 - 1;
                    C0095a c0095a9 = this.f4682d;
                    c0095a9.D(0);
                    vVar3.c(4, c0095a9);
                    vVar3.c(1, c0095a8);
                    if (this.f4677F.length > 0) {
                        String str3 = x4.f283C;
                        byte b7 = bArr2[4];
                        if ("video/avc".equals(str3)) {
                            i7 = i31;
                            if ((b7 & 31) != 6) {
                            }
                            z4 = true;
                            this.f4674C = z4;
                            this.f4672A += 5;
                            this.f4703z += i32;
                            qVar = qVar2;
                            i31 = i7;
                        } else {
                            i7 = i31;
                        }
                        if ("video/hevc".equals(str3) && ((b7 & 126) >> 1) == 39) {
                            z4 = true;
                        }
                        this.f4674C = z4;
                        this.f4672A += 5;
                        this.f4703z += i32;
                        qVar = qVar2;
                        i31 = i7;
                    } else {
                        i7 = i31;
                    }
                    z4 = false;
                    this.f4674C = z4;
                    this.f4672A += 5;
                    this.f4703z += i32;
                    qVar = qVar2;
                    i31 = i7;
                } else {
                    q qVar3 = qVar;
                    int i34 = i31;
                    if (this.f4674C) {
                        C0095a c0095a10 = this.f4684f;
                        c0095a10.A(i33);
                        ((F1.h) lVar).a((byte[]) c0095a10.f1465c, 0, this.f4673B, false);
                        vVar3.c(this.f4673B, c0095a10);
                        iD = this.f4673B;
                        int iF = p151v2.a.F(c0095a10.f1464b, (byte[]) c0095a10.f1465c);
                        c0095a10.D("video/hevc".equals(x4.f283C) ? 1 : 0);
                        c0095a10.C(iF);
                        P6.b.e(jA2, c0095a10, this.f4677F);
                    } else {
                        iD = vVar3.d(lVar, i33, false);
                    }
                    this.f4672A += iD;
                    this.f4673B -= iD;
                    qVar = qVar3;
                    i31 = i34;
                    i32 = i32;
                    c0095a8 = c0095a8;
                }
                sVar = sVar8;
            }
            sVar2 = sVar;
        }
        int i35 = iVar.f4669l ? sVar7.j[iVar.f4664f] ? 1 : 0 : iVar.f4662d.f4776g[iVar.f4664f];
        int i36 = iVar.a() != null ? 1073741824 | i35 : i35;
        r rVarA2 = iVar.a();
        vVar3.e(jA2, i36, this.f4703z, 0, rVarA2 != null ? rVarA2.f4751c : null);
        while (!arrayDeque.isEmpty()) {
            h hVar2 = (h) arrayDeque.removeFirst();
            this.f4698u -= hVar2.f4658c;
            boolean z8 = hVar2.f4657b;
            long jA3 = hVar2.f4656a;
            if (z8) {
                jA3 += jA2;
            }
            p151v2.s sVar9 = sVar2;
            if (sVar2 != null) {
                jA3 = sVar9.a(jA3);
            }
            for (v vVar4 : this.f4676E) {
                vVar4.e(jA3, 1, hVar2.f4658c, this.f4698u, null);
            }
            sVar2 = sVar9;
        }
        if (!iVar.b()) {
            this.f4702y = null;
        }
        this.f4692o = 3;
        return 0;
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        SparseArray sparseArray = this.f4681c;
        int size = sparseArray.size();
        for (int i7 = 0; i7 < size; i7++) {
            ((i) sparseArray.valueAt(i7)).d();
        }
        this.f4690m.clear();
        this.f4698u = 0;
        this.f4699v = j3;
        this.f4689l.clear();
        this.f4692o = 0;
        this.f4695r = 0;
    }

    @Override // F1.k
    public final void release() {
    }
}
