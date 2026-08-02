package N1;

import A1.C0042s;
import A1.C0045t0;
import A1.X;
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
import f2.C1081m;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import n1.C1450e;
import v0.AbstractC1663a;
import v2.AbstractC1664a;
import w1.V0;

/* loaded from: classes.dex */
public final class j implements F1.k {

    /* renamed from: H, reason: collision with root package name */
    public static final byte[] f4670H = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};

    /* renamed from: I, reason: collision with root package name */
    public static final X f4671I;

    /* renamed from: A, reason: collision with root package name */
    public int f4672A;

    /* renamed from: B, reason: collision with root package name */
    public int f4673B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f4674C;

    /* renamed from: G, reason: collision with root package name */
    public boolean f4678G;

    /* renamed from: a, reason: collision with root package name */
    public final int f4679a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4680b;

    /* renamed from: g, reason: collision with root package name */
    public final byte[] f4685g;

    /* renamed from: h, reason: collision with root package name */
    public final C0095a f4686h;

    /* renamed from: i, reason: collision with root package name */
    public final v2.s f4687i;

    /* renamed from: n, reason: collision with root package name */
    public final C1081m f4691n;

    /* renamed from: o, reason: collision with root package name */
    public int f4692o;

    /* renamed from: p, reason: collision with root package name */
    public int f4693p;

    /* renamed from: q, reason: collision with root package name */
    public long f4694q;

    /* renamed from: r, reason: collision with root package name */
    public int f4695r;

    /* renamed from: s, reason: collision with root package name */
    public C0095a f4696s;

    /* renamed from: t, reason: collision with root package name */
    public long f4697t;

    /* renamed from: u, reason: collision with root package name */
    public int f4698u;

    /* renamed from: y, reason: collision with root package name */
    public i f4702y;

    /* renamed from: z, reason: collision with root package name */
    public int f4703z;
    public final V0 j = new V0(21);

    /* renamed from: k, reason: collision with root package name */
    public final C0095a f4688k = new C0095a(16);

    /* renamed from: d, reason: collision with root package name */
    public final C0095a f4682d = new C0095a(AbstractC1664a.f17086c);

    /* renamed from: e, reason: collision with root package name */
    public final C0095a f4683e = new C0095a(5);

    /* renamed from: f, reason: collision with root package name */
    public final C0095a f4684f = new C0095a(4, false);

    /* renamed from: l, reason: collision with root package name */
    public final ArrayDeque f4689l = new ArrayDeque();

    /* renamed from: m, reason: collision with root package name */
    public final ArrayDeque f4690m = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final SparseArray f4681c = new SparseArray();

    /* renamed from: w, reason: collision with root package name */
    public long f4700w = -9223372036854775807L;

    /* renamed from: v, reason: collision with root package name */
    public long f4699v = -9223372036854775807L;

    /* renamed from: x, reason: collision with root package name */
    public long f4701x = -9223372036854775807L;

    /* renamed from: D, reason: collision with root package name */
    public F1.m f4675D = F1.m.f2545g;

    /* renamed from: E, reason: collision with root package name */
    public v[] f4676E = new v[0];

    /* renamed from: F, reason: collision with root package name */
    public v[] f4677F = new v[0];

    static {
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10537k = "application/x-emsg";
        f4671I = new X(format$Builder);
    }

    public j(int i7, v2.s sVar, List list, C1081m c1081m) {
        this.f4679a = i7;
        this.f4687i = sVar;
        this.f4680b = Collections.unmodifiableList(list);
        this.f4691n = c1081m;
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
                C1450e b7 = p.b(bArr);
                UUID uuid = b7 == null ? null : (UUID) b7.f15308b;
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

    public static void c(C0095a c0095a, int i7, s sVar) {
        c0095a.D(i7 + 8);
        int g3 = c0095a.g();
        if ((g3 & 1) != 0) {
            throw C0045t0.c("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z4 = (g3 & 2) != 0;
        int w7 = c0095a.w();
        if (w7 == 0) {
            Arrays.fill(sVar.f4764l, 0, sVar.f4758e, false);
            return;
        }
        if (w7 != sVar.f4758e) {
            StringBuilder j = AbstractC0486a1.j(w7, "Senc sample count ", " is different from fragment sample count");
            j.append(sVar.f4758e);
            throw C0045t0.a(null, j.toString());
        }
        Arrays.fill(sVar.f4764l, 0, w7, z4);
        int d7 = c0095a.d();
        C0095a c0095a2 = sVar.f4766n;
        c0095a2.A(d7);
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

    /* JADX WARN: Code restructure failed: missing block: B:376:0x0792, code lost:
    
        r4 = r0;
        r4.f4692o = 0;
        r4.f4695r = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x0798, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j) {
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
        SparseArray sparseArray2;
        int i13;
        ArrayList arrayList3;
        int i14;
        int i15;
        a aVar;
        ArrayList arrayList4;
        int i16;
        i iVar;
        i iVar2;
        int i17;
        int i18;
        int i19;
        boolean z7;
        boolean z8;
        int i20;
        boolean z9;
        C0095a c0095a;
        boolean z10;
        int i21;
        boolean z11;
        q qVar;
        i iVar3;
        g gVar;
        int i22;
        g gVar2;
        g gVar3;
        ArrayList arrayList5;
        j jVar3 = this;
        int i23 = 1;
        while (true) {
            ArrayDeque arrayDeque = jVar3.f4689l;
            if (arrayDeque.isEmpty() || ((a) arrayDeque.peek()).f4633c != j) {
                break;
            }
            a aVar2 = (a) arrayDeque.pop();
            int i24 = aVar2.f1675b;
            SparseArray sparseArray3 = jVar3.f4681c;
            ArrayList arrayList6 = aVar2.f4634d;
            int i25 = jVar3.f4679a;
            int i26 = 12;
            if (i24 == 1836019574) {
                DrmInitData b7 = b(arrayList6);
                a t7 = aVar2.t(1836475768);
                t7.getClass();
                SparseArray sparseArray4 = new SparseArray();
                ArrayList arrayList7 = t7.f4634d;
                int size = arrayList7.size();
                long j3 = -9223372036854775807L;
                int i27 = 0;
                while (i27 < size) {
                    b bVar = (b) arrayList7.get(i27);
                    int i28 = bVar.f1675b;
                    C0095a c0095a2 = bVar.f4636c;
                    if (i28 == 1953654136) {
                        c0095a2.D(i26);
                        arrayList5 = arrayList7;
                        Pair create = Pair.create(Integer.valueOf(c0095a2.g()), new g(c0095a2.g() - i23, c0095a2.g(), c0095a2.g(), c0095a2.g()));
                        sparseArray4.put(((Integer) create.first).intValue(), (g) create.second);
                    } else {
                        arrayList5 = arrayList7;
                        if (i28 == 1835362404) {
                            c0095a2.D(8);
                            j3 = D1.a.l(c0095a2.g()) == 0 ? c0095a2.u() : c0095a2.x();
                        }
                    }
                    i27++;
                    i23 = 1;
                    arrayList7 = arrayList5;
                    i26 = 12;
                }
                ArrayList e7 = f.e(aVar2, new F1.p(), j3, b7, (i25 & 16) != 0, false, new C0042s(jVar3, 26));
                int size2 = e7.size();
                if (sparseArray3.size() == 0) {
                    for (int i29 = 0; i29 < size2; i29++) {
                        t tVar = (t) e7.get(i29);
                        q qVar2 = tVar.f4770a;
                        v r7 = jVar3.f4675D.r(i29, qVar2.f4740b);
                        int size3 = sparseArray4.size();
                        int i30 = qVar2.f4739a;
                        if (size3 == 1) {
                            gVar3 = (g) sparseArray4.valueAt(0);
                        } else {
                            gVar3 = (g) sparseArray4.get(i30);
                            gVar3.getClass();
                        }
                        sparseArray3.put(i30, new i(r7, tVar, gVar3));
                        jVar3.f4700w = Math.max(jVar3.f4700w, qVar2.f4743e);
                    }
                    jVar3.f4675D.n();
                } else {
                    AbstractC1664a.h(sparseArray3.size() == size2);
                    for (int i31 = 0; i31 < size2; i31++) {
                        t tVar2 = (t) e7.get(i31);
                        q qVar3 = tVar2.f4770a;
                        i iVar4 = (i) sparseArray3.get(qVar3.f4739a);
                        if (sparseArray4.size() == 1) {
                            gVar2 = (g) sparseArray4.valueAt(0);
                        } else {
                            gVar2 = (g) sparseArray4.get(qVar3.f4739a);
                            gVar2.getClass();
                        }
                        iVar4.f4662d = tVar2;
                        iVar4.f4663e = gVar2;
                        iVar4.f4659a.a(tVar2.f4770a.f4744f);
                        iVar4.d();
                    }
                }
                jVar = jVar3;
                i7 = 1;
            } else {
                SparseArray sparseArray5 = sparseArray3;
                if (i24 == 1836019558) {
                    ArrayList arrayList8 = aVar2.f4635e;
                    int size4 = arrayList8.size();
                    int i32 = 0;
                    while (i32 < size4) {
                        a aVar3 = (a) arrayList8.get(i32);
                        if (aVar3.f1675b == 1953653094) {
                            b y4 = aVar3.y(1952868452);
                            y4.getClass();
                            C0095a c0095a3 = y4.f4636c;
                            c0095a3.D(8);
                            int g3 = c0095a3.g();
                            i iVar5 = (i) sparseArray5.get(c0095a3.g());
                            if (iVar5 == null) {
                                iVar5 = null;
                            } else {
                                int i33 = g3 & 1;
                                s sVar = iVar5.f4660b;
                                if (i33 != 0) {
                                    long x4 = c0095a3.x();
                                    sVar.f4755b = x4;
                                    sVar.f4756c = x4;
                                }
                                g gVar4 = iVar5.f4663e;
                                sVar.f4754a = new g((g3 & 2) != 0 ? c0095a3.g() - 1 : gVar4.f4652a, (g3 & 8) != 0 ? c0095a3.g() : gVar4.f4653b, (g3 & 16) != 0 ? c0095a3.g() : gVar4.f4654c, (g3 & 32) != 0 ? c0095a3.g() : gVar4.f4655d);
                            }
                            if (iVar5 != null) {
                                s sVar2 = iVar5.f4660b;
                                long j7 = sVar2.f4768p;
                                boolean z12 = sVar2.f4769q;
                                iVar5.d();
                                iVar5.f4669l = true;
                                b y5 = aVar3.y(1952867444);
                                if (y5 == null || (i25 & 2) != 0) {
                                    sVar2.f4768p = j7;
                                    sVar2.f4769q = z12;
                                } else {
                                    C0095a c0095a4 = y5.f4636c;
                                    c0095a4.D(8);
                                    sVar2.f4768p = D1.a.l(c0095a4.g()) == 1 ? c0095a4.x() : c0095a4.u();
                                    sVar2.f4769q = true;
                                }
                                ArrayList arrayList9 = aVar3.f4634d;
                                int size5 = arrayList9.size();
                                int i34 = 0;
                                int i35 = 0;
                                int i36 = 0;
                                while (true) {
                                    i11 = 1953658222;
                                    if (i34 >= size5) {
                                        break;
                                    }
                                    ArrayList arrayList10 = arrayList8;
                                    b bVar2 = (b) arrayList9.get(i34);
                                    int i37 = size4;
                                    if (bVar2.f1675b == 1953658222) {
                                        C0095a c0095a5 = bVar2.f4636c;
                                        c0095a5.D(12);
                                        int w7 = c0095a5.w();
                                        if (w7 > 0) {
                                            i36 += w7;
                                            i22 = 1;
                                            i35++;
                                            i34 += i22;
                                            size4 = i37;
                                            arrayList8 = arrayList10;
                                        }
                                    }
                                    i22 = 1;
                                    i34 += i22;
                                    size4 = i37;
                                    arrayList8 = arrayList10;
                                }
                                arrayList = arrayList8;
                                i8 = size4;
                                iVar5.f4666h = 0;
                                iVar5.f4665g = 0;
                                iVar5.f4664f = 0;
                                sVar2.f4757d = i35;
                                sVar2.f4758e = i36;
                                if (sVar2.f4760g.length < i35) {
                                    sVar2.f4759f = new long[i35];
                                    sVar2.f4760g = new int[i35];
                                }
                                if (sVar2.f4761h.length < i36) {
                                    int i38 = (i36 * 125) / 100;
                                    sVar2.f4761h = new int[i38];
                                    sVar2.f4762i = new long[i38];
                                    sVar2.j = new boolean[i38];
                                    sVar2.f4764l = new boolean[i38];
                                }
                                int i39 = 0;
                                int i40 = 0;
                                int i41 = 0;
                                while (true) {
                                    long j8 = 0;
                                    if (i39 < size5) {
                                        b bVar3 = (b) arrayList9.get(i39);
                                        if (bVar3.f1675b == i11) {
                                            int i42 = i40 + 1;
                                            C0095a c0095a6 = bVar3.f4636c;
                                            c0095a6.D(8);
                                            int g7 = c0095a6.g();
                                            t tVar3 = iVar5.f4662d;
                                            i15 = size5;
                                            g gVar5 = sVar2.f4754a;
                                            int i43 = v2.t.f17153a;
                                            sparseArray2 = sparseArray5;
                                            sVar2.f4760g[i40] = c0095a6.w();
                                            long[] jArr = sVar2.f4759f;
                                            aVar = aVar3;
                                            int i44 = i41;
                                            long j9 = sVar2.f4755b;
                                            jArr[i40] = j9;
                                            if ((g7 & 1) != 0) {
                                                arrayList4 = arrayList6;
                                                i16 = i25;
                                                iVar2 = iVar5;
                                                jArr[i40] = j9 + c0095a6.g();
                                            } else {
                                                arrayList4 = arrayList6;
                                                i16 = i25;
                                                iVar2 = iVar5;
                                            }
                                            boolean z13 = (g7 & 4) != 0;
                                            int i45 = gVar5.f4655d;
                                            if (z13) {
                                                i45 = c0095a6.g();
                                            }
                                            boolean z14 = (g7 & 256) != 0;
                                            boolean z15 = (g7 & 512) != 0;
                                            boolean z16 = (g7 & 1024) != 0;
                                            boolean z17 = (g7 & 2048) != 0;
                                            q qVar4 = tVar3.f4770a;
                                            long[] jArr2 = qVar4.f4746h;
                                            if (jArr2 != null) {
                                                i17 = i45;
                                                i14 = i32;
                                                if (jArr2.length == 1 && jArr2[0] == 0) {
                                                    j8 = qVar4.f4747i[0];
                                                }
                                            } else {
                                                i14 = i32;
                                                i17 = i45;
                                            }
                                            int[] iArr = sVar2.f4761h;
                                            long[] jArr3 = sVar2.f4762i;
                                            boolean[] zArr = sVar2.j;
                                            arrayList3 = arrayList9;
                                            boolean z18 = qVar4.f4740b == 2 && (i16 & 1) != 0;
                                            int i46 = i44 + sVar2.f4760g[i40];
                                            long j10 = sVar2.f4768p;
                                            i13 = i39;
                                            int i47 = i44;
                                            while (i47 < i46) {
                                                if (z14) {
                                                    i18 = i46;
                                                    z7 = z14;
                                                    i19 = c0095a6.g();
                                                } else {
                                                    i18 = i46;
                                                    i19 = gVar5.f4653b;
                                                    z7 = z14;
                                                }
                                                if (i19 < 0) {
                                                    throw C0045t0.a(null, "Unexpected negative value: " + i19);
                                                }
                                                if (z15) {
                                                    z8 = z15;
                                                    i20 = c0095a6.g();
                                                } else {
                                                    z8 = z15;
                                                    i20 = gVar5.f4654c;
                                                }
                                                if (i20 < 0) {
                                                    throw C0045t0.a(null, "Unexpected negative value: " + i20);
                                                }
                                                int g8 = z16 ? c0095a6.g() : (i47 == 0 && z13) ? i17 : gVar5.f4655d;
                                                if (z17) {
                                                    z9 = z13;
                                                    c0095a = c0095a6;
                                                    z10 = z16;
                                                    i21 = c0095a6.g();
                                                } else {
                                                    z9 = z13;
                                                    c0095a = c0095a6;
                                                    z10 = z16;
                                                    i21 = 0;
                                                }
                                                long K7 = v2.t.K((i21 + j10) - j8, 1000000L, qVar4.f4741c);
                                                jArr3[i47] = K7;
                                                if (sVar2.f4769q) {
                                                    z11 = z17;
                                                    qVar = qVar4;
                                                    iVar3 = iVar2;
                                                    gVar = gVar5;
                                                } else {
                                                    iVar3 = iVar2;
                                                    gVar = gVar5;
                                                    z11 = z17;
                                                    qVar = qVar4;
                                                    jArr3[i47] = K7 + iVar3.f4662d.f4777h;
                                                }
                                                iArr[i47] = i20;
                                                zArr[i47] = ((g8 >> 16) & 1) == 0 && (!z18 || i47 == 0);
                                                j10 += i19;
                                                i47++;
                                                gVar5 = gVar;
                                                i46 = i18;
                                                z14 = z7;
                                                z15 = z8;
                                                c0095a6 = c0095a;
                                                z16 = z10;
                                                z17 = z11;
                                                qVar4 = qVar;
                                                iVar2 = iVar3;
                                                z13 = z9;
                                            }
                                            iVar = iVar2;
                                            sVar2.f4768p = j10;
                                            i40 = i42;
                                            i41 = i46;
                                        } else {
                                            sparseArray2 = sparseArray5;
                                            i13 = i39;
                                            arrayList3 = arrayList9;
                                            i14 = i32;
                                            i15 = size5;
                                            aVar = aVar3;
                                            arrayList4 = arrayList6;
                                            i16 = i25;
                                            iVar = iVar5;
                                        }
                                        i39 = i13 + 1;
                                        iVar5 = iVar;
                                        size5 = i15;
                                        sparseArray5 = sparseArray2;
                                        aVar3 = aVar;
                                        arrayList6 = arrayList4;
                                        i25 = i16;
                                        i32 = i14;
                                        arrayList9 = arrayList3;
                                        i11 = 1953658222;
                                    } else {
                                        sparseArray = sparseArray5;
                                        ArrayList arrayList11 = arrayList9;
                                        i9 = i32;
                                        a aVar4 = aVar3;
                                        arrayList2 = arrayList6;
                                        i10 = i25;
                                        t tVar4 = iVar5.f4662d;
                                        g gVar6 = sVar2.f4754a;
                                        gVar6.getClass();
                                        r rVar = tVar4.f4770a.f4748k[gVar6.f4652a];
                                        b y7 = aVar4.y(1935763834);
                                        if (y7 != null) {
                                            rVar.getClass();
                                            C0095a c0095a7 = y7.f4636c;
                                            c0095a7.D(8);
                                            if ((c0095a7.g() & 1) == 1) {
                                                c0095a7.E(8);
                                            }
                                            int t8 = c0095a7.t();
                                            int w8 = c0095a7.w();
                                            if (w8 > sVar2.f4758e) {
                                                StringBuilder j11 = AbstractC0486a1.j(w8, "Saiz sample count ", " is greater than fragment sample count");
                                                j11.append(sVar2.f4758e);
                                                throw C0045t0.a(null, j11.toString());
                                            }
                                            int i48 = rVar.f4752d;
                                            if (t8 == 0) {
                                                boolean[] zArr2 = sVar2.f4764l;
                                                i12 = 0;
                                                for (int i49 = 0; i49 < w8; i49++) {
                                                    int t9 = c0095a7.t();
                                                    i12 += t9;
                                                    zArr2[i49] = t9 > i48;
                                                }
                                                z4 = false;
                                            } else {
                                                boolean z19 = t8 > i48;
                                                i12 = t8 * w8;
                                                z4 = false;
                                                Arrays.fill(sVar2.f4764l, 0, w8, z19);
                                            }
                                            Arrays.fill(sVar2.f4764l, w8, sVar2.f4758e, z4);
                                            if (i12 > 0) {
                                                sVar2.f4766n.A(i12);
                                                sVar2.f4763k = true;
                                                sVar2.f4767o = true;
                                            }
                                        }
                                        b y8 = aVar4.y(1935763823);
                                        if (y8 != null) {
                                            C0095a c0095a8 = y8.f4636c;
                                            c0095a8.D(8);
                                            int g9 = c0095a8.g();
                                            if ((g9 & 1) == 1) {
                                                c0095a8.E(8);
                                            }
                                            int w9 = c0095a8.w();
                                            if (w9 != 1) {
                                                throw C0045t0.a(null, "Unexpected saio entry count: " + w9);
                                            }
                                            sVar2.f4756c += D1.a.l(g9) == 0 ? c0095a8.u() : c0095a8.x();
                                        }
                                        byte[] bArr = null;
                                        b y9 = aVar4.y(1936027235);
                                        if (y9 != null) {
                                            c(y9.f4636c, 0, sVar2);
                                        }
                                        String str = rVar != null ? rVar.f4750b : null;
                                        C0095a c0095a9 = null;
                                        C0095a c0095a10 = null;
                                        int i50 = 0;
                                        while (i50 < arrayList11.size()) {
                                            ArrayList arrayList12 = arrayList11;
                                            b bVar4 = (b) arrayList12.get(i50);
                                            C0095a c0095a11 = bVar4.f4636c;
                                            int i51 = bVar4.f1675b;
                                            if (i51 == 1935828848) {
                                                c0095a11.D(12);
                                                if (c0095a11.g() == 1936025959) {
                                                    c0095a9 = c0095a11;
                                                }
                                            } else if (i51 == 1936158820) {
                                                c0095a11.D(12);
                                                if (c0095a11.g() == 1936025959) {
                                                    c0095a10 = c0095a11;
                                                }
                                            }
                                            i50++;
                                            arrayList11 = arrayList12;
                                        }
                                        ArrayList arrayList13 = arrayList11;
                                        if (c0095a9 != null && c0095a10 != null) {
                                            c0095a9.D(8);
                                            int l7 = D1.a.l(c0095a9.g());
                                            c0095a9.E(4);
                                            if (l7 == 1) {
                                                c0095a9.E(4);
                                            }
                                            if (c0095a9.g() != 1) {
                                                throw C0045t0.c("Entry count in sbgp != 1 (unsupported).");
                                            }
                                            c0095a10.D(8);
                                            int l8 = D1.a.l(c0095a10.g());
                                            c0095a10.E(4);
                                            if (l8 == 1) {
                                                if (c0095a10.u() == 0) {
                                                    throw C0045t0.c("Variable length description in sgpd found (unsupported)");
                                                }
                                            } else if (l8 >= 2) {
                                                c0095a10.E(4);
                                            }
                                            if (c0095a10.u() != 1) {
                                                throw C0045t0.c("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c0095a10.E(1);
                                            int t10 = c0095a10.t();
                                            int i52 = (t10 & 240) >> 4;
                                            int i53 = t10 & 15;
                                            boolean z20 = c0095a10.t() == 1;
                                            if (z20) {
                                                int t11 = c0095a10.t();
                                                byte[] bArr2 = new byte[16];
                                                c0095a10.f(bArr2, 0, 16);
                                                if (t11 == 0) {
                                                    int t12 = c0095a10.t();
                                                    bArr = new byte[t12];
                                                    c0095a10.f(bArr, 0, t12);
                                                }
                                                sVar2.f4763k = true;
                                                sVar2.f4765m = new r(z20, str, t11, bArr2, i52, i53, bArr);
                                            }
                                        }
                                        int size6 = arrayList13.size();
                                        for (int i54 = 0; i54 < size6; i54++) {
                                            b bVar5 = (b) arrayList13.get(i54);
                                            if (bVar5.f1675b == 1970628964) {
                                                C0095a c0095a12 = bVar5.f4636c;
                                                c0095a12.D(8);
                                                byte[] bArr3 = this.f4685g;
                                                c0095a12.f(bArr3, 0, 16);
                                                if (Arrays.equals(bArr3, f4670H)) {
                                                    c(c0095a12, 16, sVar2);
                                                }
                                            }
                                        }
                                        jVar2 = this;
                                    }
                                }
                                i32 = i9 + 1;
                                jVar3 = jVar2;
                                size4 = i8;
                                arrayList8 = arrayList;
                                sparseArray5 = sparseArray;
                                arrayList6 = arrayList2;
                                i25 = i10;
                            }
                        }
                        jVar2 = jVar3;
                        sparseArray = sparseArray5;
                        arrayList = arrayList8;
                        i8 = size4;
                        i9 = i32;
                        arrayList2 = arrayList6;
                        i10 = i25;
                        i32 = i9 + 1;
                        jVar3 = jVar2;
                        size4 = i8;
                        arrayList8 = arrayList;
                        sparseArray5 = sparseArray;
                        arrayList6 = arrayList2;
                        i25 = i10;
                    }
                    jVar = jVar3;
                    SparseArray sparseArray6 = sparseArray5;
                    DrmInitData b8 = b(arrayList6);
                    if (b8 != null) {
                        int size7 = sparseArray6.size();
                        int i55 = 0;
                        while (i55 < size7) {
                            SparseArray sparseArray7 = sparseArray6;
                            i iVar6 = (i) sparseArray7.valueAt(i55);
                            t tVar5 = iVar6.f4662d;
                            g gVar7 = iVar6.f4660b.f4754a;
                            int i56 = v2.t.f17153a;
                            r rVar2 = tVar5.f4770a.f4748k[gVar7.f4652a];
                            DrmInitData a2 = b8.a(rVar2 != null ? rVar2.f4750b : null);
                            Format$Builder a4 = iVar6.f4662d.f4770a.f4744f.a();
                            a4.f10540n = a2;
                            iVar6.f4659a.a(new X(a4));
                            i55++;
                            sparseArray6 = sparseArray7;
                        }
                    }
                    SparseArray sparseArray8 = sparseArray6;
                    if (jVar.f4699v != -9223372036854775807L) {
                        int size8 = sparseArray8.size();
                        for (int i57 = 0; i57 < size8; i57++) {
                            i iVar7 = (i) sparseArray8.valueAt(i57);
                            long j12 = jVar.f4699v;
                            int i58 = iVar7.f4664f;
                            while (true) {
                                s sVar3 = iVar7.f4660b;
                                if (i58 < sVar3.f4758e && sVar3.f4762i[i58] < j12) {
                                    if (sVar3.j[i58]) {
                                        iVar7.f4667i = i58;
                                    }
                                    i58++;
                                }
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
                        ((a) arrayDeque.peek()).f4635e.add(aVar2);
                    }
                }
            }
            jVar3 = jVar;
            i23 = i7;
        }
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
        C1081m c1081m = this.f4691n;
        if (c1081m != null) {
            vVarArr[0] = c1081m;
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
        v[] vVarArr2 = (v[]) v2.t.G(i7, this.f4676E);
        this.f4676E = vVarArr2;
        for (v vVar : vVarArr2) {
            vVar.a(f4671I);
        }
        List list = this.f4680b;
        this.f4677F = new v[list.size()];
        while (i8 < this.f4677F.length) {
            v r7 = this.f4675D.r(i9, 3);
            r7.a((X) list.get(i8));
            this.f4677F[i8] = r7;
            i8++;
            i9++;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:314:0x00bc, code lost:
    
        r3 = r29.f4692o;
        r6 = r2.f4660b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x00c2, code lost:
    
        if (r3 != 3) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x00c6, code lost:
    
        if (r2.f4669l != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:318:0x00c8, code lost:
    
        r3 = r2.f4662d.f4773d[r2.f4664f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x00d7, code lost:
    
        r29.f4703z = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:320:0x00dd, code lost:
    
        if (r2.f4664f >= r2.f4667i) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x00df, code lost:
    
        ((F1.h) r30).q(r3);
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x00e8, code lost:
    
        if (r1 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x00eb, code lost:
    
        r3 = r6.f4766n;
        r1 = r1.f4752d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x00ef, code lost:
    
        if (r1 == 0) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:325:0x00f1, code lost:
    
        r3.E(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:326:0x00f4, code lost:
    
        r1 = r2.f4664f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:327:0x00f8, code lost:
    
        if (r6.f4763k == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:329:0x00fe, code lost:
    
        if (r6.f4764l[r1] == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:330:0x0100, code lost:
    
        r3.E(r3.y() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:332:0x010c, code lost:
    
        if (r2.b() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:333:0x010e, code lost:
    
        r29.f4702y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:334:0x0110, code lost:
    
        r29.f4692o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:335:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:337:0x011d, code lost:
    
        if (r2.f4662d.f4770a.f4745g != 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:338:0x011f, code lost:
    
        r29.f4703z = r3 - 8;
        ((F1.h) r30).q(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x0138, code lost:
    
        if ("audio/ac4".equals(r2.f4662d.f4770a.f4744f.f283C) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x013a, code lost:
    
        r29.f4672A = r2.c(r29.f4703z, 7);
        r3 = r29.f4703z;
        r8 = r29.f4686h;
        C1.AbstractC0096b.c(r3, r8);
        r2.f4659a.c(7, r8);
        r29.f4672A += 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:342:0x015d, code lost:
    
        r29.f4703z += r29.f4672A;
        r29.f4692o = 4;
        r29.f4673B = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:343:0x0155, code lost:
    
        r29.f4672A = r2.c(r29.f4703z, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:344:0x00d1, code lost:
    
        r3 = r6.f4761h[r2.f4664f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0169, code lost:
    
        r3 = r2.f4662d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x016d, code lost:
    
        if (r2.f4669l != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x016f, code lost:
    
        r8 = r3.f4775f[r2.f4664f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x017d, code lost:
    
        if (r13 == null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x017f, code lost:
    
        r8 = r13.a(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:350:0x0183, code lost:
    
        r3 = r3.f4770a;
        r7 = r3.j;
        r11 = r2.f4659a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:351:0x0189, code lost:
    
        if (r7 == 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x018b, code lost:
    
        r14 = r29.f4683e;
        r15 = (byte[]) r14.f1465c;
        r15[0] = 0;
        r15[1] = 0;
        r15[2] = 0;
        r10 = r7 + 1;
        r7 = 4 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:354:0x01a5, code lost:
    
        if (r29.f4672A >= r29.f4703z) goto L430;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x01a7, code lost:
    
        r4 = r29.f4673B;
        r28 = r13;
        r13 = r3.f4744f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01af, code lost:
    
        if (r4 != 0) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x01b1, code lost:
    
        r19 = r3;
        ((F1.h) r30).a(r15, r7, r10, false);
        r14.D(0);
        r4 = r14.g();
     */
    /* JADX WARN: Code restructure failed: missing block: B:358:0x01c2, code lost:
    
        if (r4 < 1) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:359:0x01c4, code lost:
    
        r29.f4673B = r4 - 1;
        r4 = r29.f4682d;
        r4.D(0);
        r11.c(4, r4);
        r11.c(1, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x01d9, code lost:
    
        if (r29.f4677F.length <= 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x01db, code lost:
    
        r4 = r13.f283C;
        r13 = r15[4];
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x01e5, code lost:
    
        if ("video/avc".equals(r4) == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x01e7, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x01ec, code lost:
    
        if ((r13 & 31) == 6) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:365:0x0200, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x0206, code lost:
    
        r29.f4674C = r3;
        r29.f4672A += 5;
        r29.f4703z += r7;
        r3 = r19;
        r10 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:368:0x0217, code lost:
    
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x01f6, code lost:
    
        if ("video/hevc".equals(r4) == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x01fe, code lost:
    
        if (((r13 & 126) >> 1) != 39) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x0205, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x01ef, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:375:0x0202, code lost:
    
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:378:0x0222, code lost:
    
        throw A1.C0045t0.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:379:0x0223, code lost:
    
        r19 = r3;
        r21 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x022a, code lost:
    
        if (r29.f4674C == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:381:0x022c, code lost:
    
        r3 = r29.f4684f;
        r3.A(r4);
        r22 = r7;
        r23 = r14;
        ((F1.h) r30).a((byte[]) r3.f1465c, 0, r29.f4673B, false);
        r11.c(r29.f4673B, r3);
        r4 = r29.f4673B;
        r7 = v2.AbstractC1664a.F(r3.f1464b, (byte[]) r3.f1465c);
        r3.D("video/hevc".equals(r13.f283C) ? 1 : 0);
        r3.C(r7);
        P6.b.e(r8, r3, r29.f4677F);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x026e, code lost:
    
        r29.f4672A += r4;
        r29.f4673B -= r4;
        r3 = r19;
        r10 = r21;
        r7 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x0265, code lost:
    
        r22 = r7;
        r23 = r14;
        r4 = r11.d(r30, r4, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x0281, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:388:0x029a, code lost:
    
        if (r2.f4669l != false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:389:0x029c, code lost:
    
        r6 = r2.f4662d.f4776g[r2.f4664f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x02b4, code lost:
    
        if (r2.a() == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:392:0x02b6, code lost:
    
        r24 = 1073741824 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x02be, code lost:
    
        r1 = r2.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x02c2, code lost:
    
        if (r1 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x02c4, code lost:
    
        r27 = r1.f4751c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:396:0x02cb, code lost:
    
        r11.e(r8, r24, r29.f4703z, 0, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x02dc, code lost:
    
        if (r12.isEmpty() != false) goto L433;
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x02de, code lost:
    
        r1 = (N1.h) r12.removeFirst();
        r29.f4698u -= r1.f4658c;
        r3 = r1.f4657b;
        r4 = r1.f4656a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:400:0x02ef, code lost:
    
        if (r3 == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x02f1, code lost:
    
        r4 = r4 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x02f2, code lost:
    
        r6 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x02f4, code lost:
    
        if (r28 == null) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:404:0x02f6, code lost:
    
        r4 = r6.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x02fa, code lost:
    
        r3 = r29.f4676E;
        r7 = r3.length;
        r10 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:406:0x02fe, code lost:
    
        if (r10 >= r7) goto L434;
     */
    /* JADX WARN: Code restructure failed: missing block: B:407:0x0300, code lost:
    
        r3[r10].e(r4, 1, r1.f4658c, r29.f4698u, null);
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x0316, code lost:
    
        r28 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x031d, code lost:
    
        if (r2.b() != false) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x031f, code lost:
    
        r29.f4702y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x0322, code lost:
    
        r29.f4692o = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x0326, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x02c9, code lost:
    
        r27 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:417:0x02bc, code lost:
    
        r24 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:419:0x02ab, code lost:
    
        if (r6.j[r2.f4664f] == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x02ad, code lost:
    
        r6 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x02af, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:422:0x0284, code lost:
    
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x0286, code lost:
    
        r3 = r29.f4672A;
        r4 = r29.f4703z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x028a, code lost:
    
        if (r3 >= r4) goto L435;
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x028c, code lost:
    
        r29.f4672A += r11.d(r30, r4 - r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x0176, code lost:
    
        r8 = r6.f4762i[r2.f4664f];
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(F1.l lVar, y yVar) {
        long K7;
        String str;
        long j;
        String str2;
        long j3;
        long u4;
        long x4;
        long x7;
        while (true) {
            int i7 = this.f4692o;
            ArrayDeque arrayDeque = this.f4689l;
            SparseArray sparseArray = this.f4681c;
            if (i7 != 0) {
                ArrayDeque arrayDeque2 = this.f4690m;
                v2.s sVar = this.f4687i;
                if (i7 != 1) {
                    long j7 = Long.MAX_VALUE;
                    if (i7 != 2) {
                        i iVar = this.f4702y;
                        if (iVar != null) {
                            break;
                        }
                        int size = sparseArray.size();
                        long j8 = Long.MAX_VALUE;
                        i iVar2 = null;
                        for (int i8 = 0; i8 < size; i8++) {
                            i iVar3 = (i) sparseArray.valueAt(i8);
                            boolean z4 = iVar3.f4669l;
                            if (z4 || iVar3.f4664f != iVar3.f4662d.f4771b) {
                                s sVar2 = iVar3.f4660b;
                                if (!z4 || iVar3.f4666h != sVar2.f4757d) {
                                    long j9 = !z4 ? iVar3.f4662d.f4772c[iVar3.f4664f] : sVar2.f4759f[iVar3.f4666h];
                                    if (j9 < j8) {
                                        iVar2 = iVar3;
                                        j8 = j9;
                                    }
                                }
                            }
                        }
                        if (iVar2 == null) {
                            int i9 = (int) (this.f4697t - ((F1.h) lVar).f2534d);
                            if (i9 < 0) {
                                throw C0045t0.a(null, "Offset to end of mdat was negative.");
                            }
                            ((F1.h) lVar).q(i9);
                            this.f4692o = 0;
                            this.f4695r = 0;
                        } else {
                            int i10 = (int) ((!iVar2.f4669l ? iVar2.f4662d.f4772c[iVar2.f4664f] : iVar2.f4660b.f4759f[iVar2.f4666h]) - ((F1.h) lVar).f2534d);
                            if (i10 < 0) {
                                Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                i10 = 0;
                            }
                            ((F1.h) lVar).q(i10);
                            this.f4702y = iVar2;
                            iVar = iVar2;
                        }
                    } else {
                        int size2 = sparseArray.size();
                        i iVar4 = null;
                        for (int i11 = 0; i11 < size2; i11++) {
                            s sVar3 = ((i) sparseArray.valueAt(i11)).f4660b;
                            if (sVar3.f4767o) {
                                long j10 = sVar3.f4756c;
                                if (j10 < j7) {
                                    iVar4 = (i) sparseArray.valueAt(i11);
                                    j7 = j10;
                                }
                            }
                        }
                        if (iVar4 == null) {
                            this.f4692o = 3;
                        } else {
                            int i12 = (int) (j7 - ((F1.h) lVar).f2534d);
                            if (i12 < 0) {
                                throw C0045t0.a(null, "Offset to encryption data was negative.");
                            }
                            F1.h hVar = (F1.h) lVar;
                            hVar.q(i12);
                            s sVar4 = iVar4.f4660b;
                            C0095a c0095a = sVar4.f4766n;
                            hVar.a((byte[]) c0095a.f1465c, 0, c0095a.f1464b, false);
                            c0095a.D(0);
                            sVar4.f4767o = false;
                        }
                    }
                } else {
                    int i13 = ((int) this.f4694q) - this.f4695r;
                    C0095a c0095a2 = this.f4696s;
                    if (c0095a2 != null) {
                        ((F1.h) lVar).a((byte[]) c0095a2.f1465c, 8, i13, false);
                        int i14 = this.f4693p;
                        b bVar = new b(i14, c0095a2);
                        long j11 = ((F1.h) lVar).f2534d;
                        if (!arrayDeque.isEmpty()) {
                            ((a) arrayDeque.peek()).f4634d.add(bVar);
                        } else if (i14 == 1936286840) {
                            c0095a2.D(8);
                            int l7 = D1.a.l(c0095a2.g());
                            c0095a2.E(4);
                            long u7 = c0095a2.u();
                            if (l7 == 0) {
                                x4 = c0095a2.u();
                                x7 = c0095a2.u();
                            } else {
                                x4 = c0095a2.x();
                                x7 = c0095a2.x();
                            }
                            long j12 = x7 + j11;
                            long K8 = v2.t.K(x4, 1000000L, u7);
                            c0095a2.E(2);
                            int y4 = c0095a2.y();
                            int[] iArr = new int[y4];
                            long[] jArr = new long[y4];
                            long[] jArr2 = new long[y4];
                            long[] jArr3 = new long[y4];
                            long j13 = j12;
                            long j14 = K8;
                            int i15 = 0;
                            while (i15 < y4) {
                                int g3 = c0095a2.g();
                                if ((g3 & Integer.MIN_VALUE) != 0) {
                                    throw C0045t0.a(null, "Unhandled indirect reference");
                                }
                                long u8 = c0095a2.u();
                                iArr[i15] = g3 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                jArr[i15] = j13;
                                jArr3[i15] = j14;
                                long j15 = x4 + u8;
                                j14 = v2.t.K(j15, 1000000L, u7);
                                jArr2[i15] = j14 - jArr3[i15];
                                c0095a2.E(4);
                                j13 += iArr[i15];
                                i15++;
                                x4 = j15;
                            }
                            Pair create = Pair.create(Long.valueOf(K8), new F1.f(iArr, jArr, jArr2, jArr3));
                            this.f4701x = ((Long) create.first).longValue();
                            this.f4675D.m((F1.s) create.second);
                            this.f4678G = true;
                        } else if (i14 == 1701671783 && this.f4676E.length != 0) {
                            c0095a2.D(8);
                            int l8 = D1.a.l(c0095a2.g());
                            long j16 = -9223372036854775807L;
                            if (l8 == 0) {
                                String o7 = c0095a2.o();
                                o7.getClass();
                                String o8 = c0095a2.o();
                                o8.getClass();
                                long u9 = c0095a2.u();
                                long K9 = v2.t.K(c0095a2.u(), 1000000L, u9);
                                long j17 = this.f4701x;
                                long j18 = j17 != -9223372036854775807L ? j17 + K9 : -9223372036854775807L;
                                K7 = v2.t.K(c0095a2.u(), 1000L, u9);
                                str = o7;
                                j = K9;
                                str2 = o8;
                                j3 = j18;
                                u4 = c0095a2.u();
                            } else if (l8 != 1) {
                                AbstractC1663a.j(l8, "Skipping unsupported emsg version: ", "FragmentedMp4Extractor");
                            } else {
                                long u10 = c0095a2.u();
                                j3 = v2.t.K(c0095a2.x(), 1000000L, u10);
                                long K10 = v2.t.K(c0095a2.u(), 1000L, u10);
                                long u11 = c0095a2.u();
                                String o9 = c0095a2.o();
                                o9.getClass();
                                String o10 = c0095a2.o();
                                o10.getClass();
                                K7 = K10;
                                str = o9;
                                j = -9223372036854775807L;
                                str2 = o10;
                                u4 = u11;
                            }
                            byte[] bArr = new byte[c0095a2.d()];
                            c0095a2.f(bArr, 0, c0095a2.d());
                            C0095a c0095a3 = new C0095a(this.j.O(new EventMessage(str, str2, K7, u4, bArr)));
                            int d7 = c0095a3.d();
                            v[] vVarArr = this.f4676E;
                            int length = vVarArr.length;
                            int i16 = 0;
                            while (i16 < length) {
                                v vVar = vVarArr[i16];
                                c0095a3.D(0);
                                vVar.c(d7, c0095a3);
                                i16++;
                                j16 = -9223372036854775807L;
                            }
                            if (j3 == j16) {
                                arrayDeque2.addLast(new h(j, true, d7));
                                this.f4698u += d7;
                            } else if (arrayDeque2.isEmpty()) {
                                if (sVar != null) {
                                    j3 = sVar.a(j3);
                                }
                                for (v vVar2 : this.f4676E) {
                                    vVar2.e(j3, 1, d7, 0, null);
                                }
                            } else {
                                arrayDeque2.addLast(new h(j3, false, d7));
                                this.f4698u += d7;
                            }
                        }
                    } else {
                        ((F1.h) lVar).q(i13);
                    }
                    d(((F1.h) lVar).f2534d);
                }
            } else {
                int i17 = this.f4695r;
                C0095a c0095a4 = this.f4688k;
                if (i17 == 0) {
                    if (!((F1.h) lVar).a((byte[]) c0095a4.f1465c, 0, 8, true)) {
                        return -1;
                    }
                    this.f4695r = 8;
                    c0095a4.D(0);
                    this.f4694q = c0095a4.u();
                    this.f4693p = c0095a4.g();
                }
                long j19 = this.f4694q;
                if (j19 == 1) {
                    ((F1.h) lVar).a((byte[]) c0095a4.f1465c, 8, 8, false);
                    this.f4695r += 8;
                    this.f4694q = c0095a4.x();
                } else if (j19 == 0) {
                    long j20 = ((F1.h) lVar).f2533c;
                    if (j20 == -1 && !arrayDeque.isEmpty()) {
                        j20 = ((a) arrayDeque.peek()).f4633c;
                    }
                    if (j20 != -1) {
                        this.f4694q = (j20 - ((F1.h) lVar).f2534d) + this.f4695r;
                    }
                }
                long j21 = this.f4694q;
                int i18 = this.f4695r;
                if (j21 < i18) {
                    throw C0045t0.c("Atom size less than header length (unsupported).");
                }
                long j22 = ((F1.h) lVar).f2534d - i18;
                int i19 = this.f4693p;
                if ((i19 == 1836019558 || i19 == 1835295092) && !this.f4678G) {
                    this.f4675D.m(new F1.n(this.f4700w, j22));
                    this.f4678G = true;
                }
                if (this.f4693p == 1836019558) {
                    int size3 = sparseArray.size();
                    for (int i20 = 0; i20 < size3; i20++) {
                        s sVar5 = ((i) sparseArray.valueAt(i20)).f4660b;
                        sVar5.getClass();
                        sVar5.f4756c = j22;
                        sVar5.f4755b = j22;
                    }
                }
                int i21 = this.f4693p;
                if (i21 == 1835295092) {
                    this.f4702y = null;
                    this.f4697t = j22 + this.f4694q;
                    this.f4692o = 2;
                } else if (i21 == 1836019574 || i21 == 1953653099 || i21 == 1835297121 || i21 == 1835626086 || i21 == 1937007212 || i21 == 1836019558 || i21 == 1953653094 || i21 == 1836475768 || i21 == 1701082227) {
                    long j23 = (((F1.h) lVar).f2534d + this.f4694q) - 8;
                    arrayDeque.push(new a(i21, j23));
                    if (this.f4694q == this.f4695r) {
                        d(j23);
                    } else {
                        this.f4692o = 0;
                        this.f4695r = 0;
                    }
                } else if (i21 == 1751411826 || i21 == 1835296868 || i21 == 1836476516 || i21 == 1936286840 || i21 == 1937011556 || i21 == 1937011827 || i21 == 1668576371 || i21 == 1937011555 || i21 == 1937011578 || i21 == 1937013298 || i21 == 1937007471 || i21 == 1668232756 || i21 == 1937011571 || i21 == 1952867444 || i21 == 1952868452 || i21 == 1953196132 || i21 == 1953654136 || i21 == 1953658222 || i21 == 1886614376 || i21 == 1935763834 || i21 == 1935763823 || i21 == 1936027235 || i21 == 1970628964 || i21 == 1935828848 || i21 == 1936158820 || i21 == 1701606260 || i21 == 1835362404 || i21 == 1701671783) {
                    if (this.f4695r != 8) {
                        throw C0045t0.c("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j24 = this.f4694q;
                    if (j24 > 2147483647L) {
                        throw C0045t0.c("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C0095a c0095a5 = new C0095a((int) j24);
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
