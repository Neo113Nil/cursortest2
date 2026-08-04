package p054h2;

import A1.C0045t0;
import A1.H0;
import A1.X;
import A1.x0;
import B.v;
import B1.m;
import B1.p;
import B4.V;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import H2.o;
import W5.AbstractC0486a1;
import android.net.Uri;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import io.sentry.protocol.SentryThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import p018c2.A;
import p018c2.B;
import p018c2.I;
import p018c2.W;
import p018c2.Y;
import p018c2.e0;
import p018c2.f0;
import p031e1.k;
import p033e3.h;
import p061i2.b;
import p061i2.j;
import p061i2.r;
import p096n1.e;
import p118q2.g;
import p145u1.c;
import p146u2.K;
import p146u2.U;
import p151v2.a;
import p151v2.i;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class l implements B, r {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final IdentityHashMap f13426A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f13427B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final V f13428C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f13429D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final int f13430E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final p f13431F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final e f13432G = new e(this, 13);

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public A f13433H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f13434I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public f0 f13435J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public r[] f13436K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public r[] f13437L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public int f13438M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public h f13439N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p061i2.c f13441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f13442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final U f13443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final E1.h f13444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f13445f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final M4.e f13446x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final I f13447y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final p146u2.r f13448z;

    public l(c cVar, p061i2.c cVar2, x0 x0Var, U u4, E1.h hVar, m mVar, M4.e eVar, I i7, p146u2.r rVar, V v6, boolean z4, int i8, p pVar) {
        this.f13440a = cVar;
        this.f13441b = cVar2;
        this.f13442c = x0Var;
        this.f13443d = u4;
        this.f13444e = hVar;
        this.f13445f = mVar;
        this.f13446x = eVar;
        this.f13447y = i7;
        this.f13448z = rVar;
        this.f13428C = v6;
        this.f13429D = z4;
        this.f13430E = i8;
        this.f13431F = pVar;
        v6.getClass();
        this.f13439N = new h(new Y[0]);
        this.f13426A = new IdentityHashMap();
        this.f13427B = new c(18);
        this.f13436K = new r[0];
        this.f13437L = new r[0];
    }

    public static X d(X x4, X x7, boolean z4) {
        String strQ;
        Metadata metadata;
        int i7;
        String str;
        int i8;
        int i9;
        String str2;
        if (x7 != null) {
            strQ = x7.f312z;
            metadata = x7.f281A;
            i8 = x7.f296P;
            i7 = x7.f307d;
            i9 = x7.f308e;
            str = x7.f306c;
            str2 = x7.f305b;
        } else {
            strQ = t.q(1, x4.f312z);
            metadata = x4.f281A;
            if (z4) {
                i8 = x4.f296P;
                i7 = x4.f307d;
                i9 = x4.f308e;
                str = x4.f306c;
                str2 = x4.f305b;
            } else {
                i7 = 0;
                str = null;
                i8 = -1;
                i9 = 0;
                str2 = null;
            }
        }
        String strC = i.c(strQ);
        int i10 = z4 ? x4.f309f : -1;
        int i11 = z4 ? x4.f310x : -1;
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = x4.f304a;
        format$Builder.f10529b = str2;
        format$Builder.j = x4.f282B;
        format$Builder.f10537k = strC;
        format$Builder.f10535h = strQ;
        format$Builder.f10536i = metadata;
        format$Builder.f10533f = i10;
        format$Builder.f10534g = i11;
        format$Builder.f10550x = i8;
        format$Builder.f10531d = i7;
        format$Builder.f10532e = i9;
        format$Builder.f10530c = str;
        return new X(format$Builder);
    }

    /* JADX WARN: Code duplicated, block: B:107:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:146:0x025d  */
    @Override // p018c2.B
    public final long I(p139t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        boolean z4;
        boolean z7;
        l lVar;
        IdentityHashMap identityHashMap3;
        int i7;
        p139t2.c[] cVarArr2;
        l lVar2 = this;
        W[] wArr2 = wArr;
        int[] iArr = new int[cVarArr.length];
        int[] iArr2 = new int[cVarArr.length];
        int i8 = 0;
        while (true) {
            int length = cVarArr.length;
            identityHashMap = lVar2.f13426A;
            if (i8 >= length) {
                break;
            }
            W w7 = wArr2[i8];
            iArr[i8] = w7 == null ? -1 : ((Integer) identityHashMap.get(w7)).intValue();
            iArr2[i8] = -1;
            p139t2.c cVar = cVarArr[i8];
            if (cVar != null) {
                int i9 = 0;
                while (true) {
                    r[] rVarArr = lVar2.f13436K;
                    if (i9 >= rVarArr.length) {
                        break;
                    }
                    r rVar = rVarArr[i9];
                    rVar.c();
                    if (rVar.f13501Z.b(cVar.f16302a) != -1) {
                        iArr2[i8] = i9;
                        break;
                    }
                    i9++;
                }
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = cVarArr.length;
        W[] wArr3 = new W[length2];
        int length3 = cVarArr.length;
        W[] wArr4 = new W[length3];
        int length4 = cVarArr.length;
        p139t2.c[] cVarArr3 = new p139t2.c[length4];
        r[] rVarArr2 = new r[lVar2.f13436K.length];
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (i11 < lVar2.f13436K.length) {
            int i12 = i10;
            int i13 = 0;
            while (true) {
                identityHashMap2 = identityHashMap;
                if (i13 >= cVarArr.length) {
                    break;
                }
                wArr4[i13] = iArr[i13] == i11 ? wArr2[i13] : null;
                cVarArr3[i13] = iArr2[i13] == i11 ? cVarArr[i13] : null;
                i13++;
                identityHashMap = identityHashMap2;
            }
            r rVar2 = lVar2.f13436K[i11];
            rVar2.c();
            int i14 = rVar2.f13497V;
            int i15 = 0;
            while (i15 < length4) {
                n nVar = (n) wArr4[i15];
                if (nVar == null || (cVarArr3[i15] != null && zArr[i15])) {
                    wArr3 = wArr3;
                } else {
                    rVar2.f13497V--;
                    if (nVar.f13463c != -1) {
                        r rVar3 = nVar.f13462b;
                        rVar3.c();
                        rVar3.f13505b0.getClass();
                        int i16 = rVar3.f13505b0[nVar.f13461a];
                        a.h(rVar3.f13510e0[i16]);
                        rVar3.f13510e0[i16] = false;
                        nVar.f13463c = -1;
                    }
                    wArr4[i15] = null;
                }
                i15++;
                iArr = iArr;
                wArr3 = wArr3;
            }
            int[] iArr3 = iArr;
            W[] wArr5 = wArr3;
            boolean z9 = z8 || (!rVar2.f13516j0 ? j == rVar2.f13513g0 : i14 != 0);
            i iVar = rVar2.f13507d;
            p139t2.c cVar2 = iVar.f13395q;
            boolean z10 = z9;
            p139t2.c cVar3 = cVar2;
            int i17 = 0;
            while (i17 < length4) {
                p139t2.c cVar4 = cVarArr3[i17];
                if (cVar4 == null) {
                    i7 = length4;
                    cVarArr2 = cVarArr3;
                } else {
                    i7 = length4;
                    cVarArr2 = cVarArr3;
                    int iB = rVar2.f13501Z.b(cVar4.f16302a);
                    if (iB == rVar2.c0) {
                        iVar.f13395q = cVar4;
                        cVar3 = cVar4;
                    }
                    if (wArr4[i17] == null) {
                        rVar2.f13497V++;
                        n nVar2 = new n(rVar2, iB);
                        wArr4[i17] = nVar2;
                        zArr2[i17] = true;
                        if (rVar2.f13505b0 != null) {
                            nVar2.a();
                            if (!z10) {
                                q qVar = rVar2.f13488M[rVar2.f13505b0[iB]];
                                z10 = (qVar.z(j, true) || qVar.n() == 0) ? false : true;
                            }
                        }
                    }
                }
                i17++;
                length4 = i7;
                cVarArr3 = cVarArr2;
            }
            int i18 = length4;
            p139t2.c[] cVarArr4 = cVarArr3;
            int i19 = rVar2.f13497V;
            ArrayList arrayList = rVar2.f13480E;
            if (i19 == 0) {
                iVar.f13392n = null;
                rVar2.f13499X = null;
                rVar2.f13515i0 = true;
                arrayList.clear();
                K k7 = rVar2.f13476A;
                if (k7.d()) {
                    if (rVar2.f13495T) {
                        for (q qVar2 : rVar2.f13488M) {
                            qVar2.h();
                        }
                    }
                    k7.a();
                } else {
                    rVar2.A();
                }
            } else {
                if (arrayList.isEmpty() || t.a(cVar3, cVar2)) {
                    z4 = true;
                    z7 = z8;
                } else {
                    if (!rVar2.f13516j0) {
                        long j3 = j < 0 ? -j : 0L;
                        k kVarJ = rVar2.j();
                        cVar3.l(j3, -9223372036854775807L, rVar2.f13481F, iVar.a(kVarJ, j));
                        if (cVar3.f16304c[cVar3.e()] == iVar.f13387h.a(kVarJ.f12602d)) {
                            z4 = true;
                            z7 = z8;
                        }
                    }
                    z4 = true;
                    rVar2.f13515i0 = true;
                    z7 = true;
                    z10 = true;
                }
                if (z10) {
                    rVar2.B(j, z7);
                    int i20 = 0;
                    while (i20 < length3) {
                        if (wArr4[i20] != null) {
                            zArr2[i20] = z4;
                        }
                        i20++;
                        z4 = true;
                    }
                }
            }
            ArrayList arrayList2 = rVar2.f13485J;
            arrayList2.clear();
            for (int i21 = 0; i21 < length3; i21++) {
                W w8 = wArr4[i21];
                if (w8 != null) {
                    arrayList2.add((n) w8);
                }
            }
            rVar2.f13516j0 = true;
            int i22 = 0;
            boolean z11 = false;
            while (i22 < cVarArr.length) {
                W w9 = wArr4[i22];
                if (iArr2[i22] == i11) {
                    w9.getClass();
                    wArr5[i22] = w9;
                    identityHashMap3 = identityHashMap2;
                    identityHashMap3.put(w9, Integer.valueOf(i11));
                    z11 = true;
                } else {
                    identityHashMap3 = identityHashMap2;
                    if (iArr3[i22] == i11) {
                        a.h(w9 == null);
                    }
                }
                i22++;
                identityHashMap2 = identityHashMap3;
            }
            identityHashMap = identityHashMap2;
            if (z11) {
                rVarArr2[i12] = rVar2;
                i10 = i12 + 1;
                if (i12 == 0) {
                    iVar.f13390l = true;
                    lVar = this;
                    if (z10) {
                        ((SparseArray) lVar.f13427B.f16597b).clear();
                        z8 = true;
                    } else {
                        r[] rVarArr3 = lVar.f13437L;
                        if (rVarArr3.length == 0 || rVar2 != rVarArr3[0]) {
                            ((SparseArray) lVar.f13427B.f16597b).clear();
                            z8 = true;
                        }
                    }
                } else {
                    lVar = this;
                    iVar.f13390l = i11 < lVar.f13438M;
                }
            } else {
                lVar = this;
                i10 = i12;
            }
            i11++;
            lVar2 = lVar;
            iArr = iArr3;
            wArr3 = wArr5;
            length4 = i18;
            cVarArr3 = cVarArr4;
            wArr2 = wArr;
        }
        W[] wArr6 = wArr2;
        l lVar3 = lVar2;
        System.arraycopy(wArr3, 0, wArr6, 0, length2);
        r[] rVarArr4 = (r[]) t.G(i10, rVarArr2);
        lVar3.f13437L = rVarArr4;
        lVar3.f13428C.getClass();
        lVar3.f13439N = new h(rVarArr4);
        return j;
    }

    @Override // p018c2.B
    public final long M() {
        return -9223372036854775807L;
    }

    @Override // p018c2.B
    public final f0 P() {
        f0 f0Var = this.f13435J;
        f0Var.getClass();
        return f0Var;
    }

    @Override // p018c2.Y
    public final long T() {
        return this.f13439N.T();
    }

    @Override // p018c2.Y
    public final void Y(long j) {
        this.f13439N.Y(j);
    }

    @Override // p061i2.r
    public final void a() {
        for (r rVar : this.f13436K) {
            ArrayList arrayList = rVar.f13480E;
            if (!arrayList.isEmpty()) {
                k kVar = (k) AbstractC0158p.f(arrayList);
                int iB = rVar.f13507d.b(kVar);
                if (iB == 1) {
                    kVar.f13425b0 = true;
                } else if (iB == 2 && !rVar.f13517k0) {
                    K k7 = rVar.f13476A;
                    if (k7.d()) {
                        k7.a();
                    }
                }
            }
        }
        this.f13433H.b(this);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x0050 A[LOOP:1: B:17:0x0043->B:22:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:31:0x0071  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:47:0x009e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0053 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0054 A[EDGE_INSN: B:56:0x0054->B:24:0x0054 BREAK  A[LOOP:1: B:17:0x0043->B:22:0x0050], SYNTHETIC] */
    @Override // p061i2.r
    public final boolean b(Uri uri, v vVar, boolean z4) {
        long j;
        int i7;
        int iH;
        boolean z7;
        boolean z8;
        b bVar;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        for (r rVar : this.f13436K) {
            i iVar = rVar.f13507d;
            Uri[] uriArr = iVar.f13384e;
            if (t.l(uriArr, uri)) {
                if (!z4) {
                    o oVarA = g.a(iVar.f13395q);
                    rVar.f13524z.getClass();
                    Q1.e eVarT = M4.e.t(oVarA, vVar);
                    if (eVarT != null && eVarT.f5785a == 2) {
                        j = eVarT.f5786b;
                    }
                    i7 = 0;
                    while (true) {
                        if (i7 < uriArr.length) {
                            i7 = -1;
                            break;
                        }
                        if (uriArr[i7].equals(uri)) {
                            break;
                        }
                        i7++;
                    }
                    if (i7 == -1 && (iH = iVar.f13395q.h(i7)) != -1) {
                        iVar.f13397s |= uri.equals(iVar.f13393o);
                        if (j != -9223372036854775807L) {
                            if (iVar.f13395q.a(iH, j)) {
                                bVar = (b) iVar.f13386g.f13864d.get(uri);
                                if (bVar != null) {
                                    z7 = true;
                                    z9 = !b.a(bVar, j);
                                } else {
                                    z7 = true;
                                    z9 = false;
                                }
                                if (z9) {
                                }
                            } else {
                                z7 = true;
                            }
                            z8 = false;
                        } else {
                            z7 = true;
                        }
                        z8 = z7;
                    } else {
                        z8 = true;
                        z7 = true;
                    }
                    if (z8 || j == -9223372036854775807L) {
                        z10 = false;
                    } else {
                        z10 = z7;
                    }
                }
                j = -9223372036854775807L;
                i7 = 0;
                while (true) {
                    if (i7 < uriArr.length) {
                        i7 = -1;
                        break;
                    }
                    if (uriArr[i7].equals(uri)) {
                        break;
                        break;
                    }
                    i7++;
                }
                if (i7 == -1) {
                    z8 = true;
                    z7 = true;
                } else {
                    iVar.f13397s |= uri.equals(iVar.f13393o);
                    if (j != -9223372036854775807L) {
                        if (iVar.f13395q.a(iH, j)) {
                            bVar = (b) iVar.f13386g.f13864d.get(uri);
                            if (bVar != null) {
                                z7 = true;
                                z9 = !b.a(bVar, j);
                            } else {
                                z7 = true;
                                z9 = false;
                            }
                            if (z9) {
                            }
                        } else {
                            z7 = true;
                        }
                        z8 = false;
                    } else {
                        z7 = true;
                    }
                    z8 = z7;
                }
                if (z8) {
                    z10 = false;
                } else {
                    z10 = false;
                }
            } else {
                z10 = true;
            }
            z11 &= z10;
        }
        this.f13433H.b(this);
        return z11;
    }

    public final r c(String str, int i7, Uri[] uriArr, X[] xArr, X x4, List list, Map map, long j) {
        i iVar = new i(this.f13440a, this.f13441b, uriArr, xArr, this.f13442c, this.f13443d, this.f13427B, list, this.f13431F);
        I i8 = this.f13447y;
        return new r(str, i7, this.f13432G, iVar, map, this.f13448z, j, x4, this.f13444e, this.f13445f, this.f13446x, i8, this.f13430E);
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        return this.f13439N.isLoading();
    }

    @Override // p018c2.Y
    public final long k() {
        return this.f13439N.k();
    }

    @Override // p018c2.B
    public final long o(long j, H0 h6) {
        j jVarA;
        for (r rVar : this.f13437L) {
            if (rVar.f13493R == 2) {
                i iVar = rVar.f13507d;
                int iE = iVar.f13395q.e();
                Uri[] uriArr = iVar.f13384e;
                int length = uriArr.length;
                p061i2.c cVar = iVar.f13386g;
                if (iE >= length || iE == -1) {
                    jVarA = null;
                } else {
                    p139t2.c cVar2 = iVar.f13395q;
                    jVarA = cVar.a(true, uriArr[cVar2.f16304c[cVar2.e()]]);
                }
                if (jVarA == null) {
                    break;
                }
                AbstractC0167z abstractC0167z = jVarA.f13906r;
                if (abstractC0167z.isEmpty() || !jVarA.f13932c) {
                    break;
                    break;
                }
                long j3 = jVarA.f13897h - cVar.f13860E;
                long j7 = j - j3;
                int iD = t.d(abstractC0167z, Long.valueOf(j7), true);
                long j8 = ((p061i2.g) abstractC0167z.get(iD)).f13883e;
                return h6.a(j7, j8, iD != abstractC0167z.size() - 1 ? ((p061i2.g) abstractC0167z.get(iD + 1)).f13883e : j8) + j3;
            }
        }
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x0098  */
    /* JADX WARN: Code duplicated, block: B:32:0x009a  */
    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a4 A[PHI: r9 r19
      0x00a4: PHI (r9v15 int) = (r9v13 int), (r9v17 int) binds: [B:35:0x00a1, B:31:0x0098] A[DONT_GENERATE, DONT_INLINE]
      0x00a4: PHI (r19v8 boolean) = (r19v6 boolean), (r19v9 boolean) binds: [B:35:0x00a1, B:31:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:60:0x0129  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e A[LOOP:2: B:61:0x012c->B:62:0x012e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ae A[LOOP:3: B:72:0x01a8->B:74:0x01ae, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3 A[LOOP:4: B:77:0x01d1->B:78:0x01d3, LOOP_END] */
    @Override // p018c2.B
    public final void p(A a2, long j) {
        List list;
        boolean z4;
        Map map;
        ArrayList arrayList;
        List list2;
        HashSet hashSet;
        int i7;
        int i8;
        int i9;
        boolean z7;
        boolean z8;
        Uri[] uriArr;
        X[] xArr;
        int[] iArr;
        int i10;
        int i11;
        int iP;
        int iP2;
        int i12;
        r rVarC;
        ArrayList arrayList2;
        X x4;
        X[] xArr2;
        int i13;
        X[] xArr3;
        int i14;
        List list3;
        int i15;
        boolean z9;
        int i16;
        int i17;
        int i18;
        this.f13433H = a2;
        p061i2.c cVar = this.f13441b;
        cVar.getClass();
        cVar.f13865e.add(this);
        p061i2.m mVar = cVar.f13856A;
        mVar.getClass();
        Map mapEmptyMap = Collections.emptyMap();
        List list4 = mVar.f13922e;
        boolean zIsEmpty = list4.isEmpty();
        this.f13434I = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean z10 = this.f13429D;
        List list5 = mVar.f13924g;
        if (zIsEmpty) {
            list = list5;
            z4 = z10;
            map = mapEmptyMap;
            arrayList = arrayList4;
        } else {
            int size = list4.size();
            int[] iArr2 = new int[size];
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            while (i19 < list4.size()) {
                X x7 = ((p061i2.l) list4.get(i19)).f13915b;
                if (x7.f289I <= 0) {
                    String str = x7.f312z;
                    if (t.q(2, str) != null) {
                        i18 = 1;
                        iArr2[i19] = 2;
                        i20++;
                    } else {
                        i18 = 1;
                        if (t.q(1, str) != null) {
                            iArr2[i19] = 1;
                            i21++;
                        } else {
                            iArr2[i19] = -1;
                        }
                    }
                } else {
                    i18 = 1;
                    iArr2[i19] = 2;
                    i20++;
                }
                i19 += i18;
            }
            if (i20 > 0) {
                i9 = i20;
                z7 = true;
            } else {
                if (i21 < size) {
                    i9 = size - i21;
                    z7 = false;
                    z8 = true;
                } else {
                    i9 = size;
                    z7 = false;
                }
                uriArr = new Uri[i9];
                xArr = new X[i9];
                iArr = new int[i9];
                i10 = 0;
                i11 = 0;
                while (i10 < list4.size()) {
                    if (z7) {
                        z9 = z10;
                        if (iArr2[i10] == 2) {
                            i17 = 1;
                        }
                        i16 = i17;
                        i10 += i16;
                        z10 = z9;
                    } else {
                        z9 = z10;
                    }
                    if (z8) {
                        i17 = 1;
                        if (iArr2[i10] != 1) {
                            i16 = i17;
                        }
                        i10 += i16;
                        z10 = z9;
                    }
                    p061i2.l lVar = (p061i2.l) list4.get(i10);
                    uriArr[i11] = lVar.f13914a;
                    xArr[i11] = lVar.f13915b;
                    i16 = 1;
                    iArr[i11] = i10;
                    i11++;
                    i10 += i16;
                    z10 = z9;
                }
                boolean z11 = z10;
                String str2 = xArr[0].f312z;
                iP = t.p(2, str2);
                iP2 = t.p(1, str2);
                boolean z12 = (iP2 != 1 || (iP2 == 0 && list5.isEmpty())) && iP <= 1 && iP2 + iP > 0;
                if (!z7 || iP2 <= 0) {
                    i12 = 0;
                } else {
                    i12 = 1;
                }
                list = list5;
                map = mapEmptyMap;
                arrayList = arrayList4;
                z4 = z11;
                rVarC = c(SentryThread.JsonKeys.MAIN, i12, uriArr, xArr, mVar.j, mVar.f13927k, mapEmptyMap, j);
                arrayList3.add(rVarC);
                arrayList.add(iArr);
                if (z4 && z12) {
                    arrayList2 = new ArrayList();
                    x4 = mVar.j;
                    if (iP > 0) {
                        xArr3 = new X[i9];
                        for (i14 = 0; i14 < i9; i14++) {
                            X x8 = xArr[i14];
                            String strQ = t.q(2, x8.f312z);
                            String strC = i.c(strQ);
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10528a = x8.f304a;
                            format$Builder.f10529b = x8.f305b;
                            format$Builder.j = x8.f282B;
                            format$Builder.f10537k = strC;
                            format$Builder.f10535h = strQ;
                            format$Builder.f10536i = x8.f281A;
                            format$Builder.f10533f = x8.f309f;
                            format$Builder.f10534g = x8.f310x;
                            format$Builder.f10542p = x8.f288H;
                            format$Builder.f10543q = x8.f289I;
                            format$Builder.f10544r = x8.f290J;
                            format$Builder.f10531d = x8.f307d;
                            format$Builder.f10532e = x8.f308e;
                            xArr3[i14] = new X(format$Builder);
                        }
                        arrayList2.add(new e0(SentryThread.JsonKeys.MAIN, xArr3));
                        if (iP2 > 0 && (x4 != null || list.isEmpty())) {
                            arrayList2.add(new e0("main:audio", d(xArr[0], x4, false)));
                        }
                        list3 = mVar.f13927k;
                        if (list3 != null) {
                            for (i15 = 0; i15 < list3.size(); i15++) {
                                arrayList2.add(new e0(k.d(i15, "main:cc:"), (X) list3.get(i15)));
                            }
                        }
                    } else {
                        xArr2 = new X[i9];
                        for (i13 = 0; i13 < i9; i13++) {
                            xArr2[i13] = d(xArr[i13], x4, true);
                        }
                        arrayList2.add(new e0(SentryThread.JsonKeys.MAIN, xArr2));
                    }
                    Format$Builder format$Builder2 = new Format$Builder();
                    format$Builder2.f10528a = "ID3";
                    format$Builder2.f10537k = "application/id3";
                    e0 e0Var = new e0("main:id3", new X(format$Builder2));
                    arrayList2.add(e0Var);
                    rVarC.z((e0[]) arrayList2.toArray(new e0[0]), arrayList2.indexOf(e0Var));
                }
            }
            z8 = false;
            uriArr = new Uri[i9];
            xArr = new X[i9];
            iArr = new int[i9];
            i10 = 0;
            i11 = 0;
            while (i10 < list4.size()) {
                if (z7) {
                    z9 = z10;
                    if (iArr2[i10] == 2) {
                        i17 = 1;
                    }
                    i16 = i17;
                    i10 += i16;
                    z10 = z9;
                } else {
                    z9 = z10;
                }
                if (z8) {
                    i17 = 1;
                    if (iArr2[i10] != 1) {
                        i16 = i17;
                    }
                    i10 += i16;
                    z10 = z9;
                }
                p061i2.l lVar2 = (p061i2.l) list4.get(i10);
                uriArr[i11] = lVar2.f13914a;
                xArr[i11] = lVar2.f13915b;
                i16 = 1;
                iArr[i11] = i10;
                i11++;
                i10 += i16;
                z10 = z9;
            }
            boolean z13 = z10;
            String str3 = xArr[0].f312z;
            iP = t.p(2, str3);
            iP2 = t.p(1, str3);
            if (iP2 != 1) {
            }
            if (z7) {
                i12 = 0;
            } else {
                i12 = 0;
            }
            list = list5;
            map = mapEmptyMap;
            arrayList = arrayList4;
            z4 = z13;
            rVarC = c(SentryThread.JsonKeys.MAIN, i12, uriArr, xArr, mVar.j, mVar.f13927k, mapEmptyMap, j);
            arrayList3.add(rVarC);
            arrayList.add(iArr);
            if (z4) {
                arrayList2 = new ArrayList();
                x4 = mVar.j;
                if (iP > 0) {
                    xArr3 = new X[i9];
                    while (i14 < i9) {
                        X x9 = xArr[i14];
                        String strQ2 = t.q(2, x9.f312z);
                        String strC2 = i.c(strQ2);
                        Format$Builder format$Builder3 = new Format$Builder();
                        format$Builder3.f10528a = x9.f304a;
                        format$Builder3.f10529b = x9.f305b;
                        format$Builder3.j = x9.f282B;
                        format$Builder3.f10537k = strC2;
                        format$Builder3.f10535h = strQ2;
                        format$Builder3.f10536i = x9.f281A;
                        format$Builder3.f10533f = x9.f309f;
                        format$Builder3.f10534g = x9.f310x;
                        format$Builder3.f10542p = x9.f288H;
                        format$Builder3.f10543q = x9.f289I;
                        format$Builder3.f10544r = x9.f290J;
                        format$Builder3.f10531d = x9.f307d;
                        format$Builder3.f10532e = x9.f308e;
                        xArr3[i14] = new X(format$Builder3);
                    }
                    arrayList2.add(new e0(SentryThread.JsonKeys.MAIN, xArr3));
                    if (iP2 > 0) {
                        arrayList2.add(new e0("main:audio", d(xArr[0], x4, false)));
                    }
                    list3 = mVar.f13927k;
                    if (list3 != null) {
                        while (i15 < list3.size()) {
                            arrayList2.add(new e0(k.d(i15, "main:cc:"), (X) list3.get(i15)));
                        }
                    }
                } else {
                    xArr2 = new X[i9];
                    while (i13 < i9) {
                        xArr2[i13] = d(xArr[i13], x4, true);
                    }
                    arrayList2.add(new e0(SentryThread.JsonKeys.MAIN, xArr2));
                }
                Format$Builder format$Builder4 = new Format$Builder();
                format$Builder4.f10528a = "ID3";
                format$Builder4.f10537k = "application/id3";
                e0 e0Var2 = new e0("main:id3", new X(format$Builder4));
                arrayList2.add(e0Var2);
                rVarC.z((e0[]) arrayList2.toArray(new e0[0]), arrayList2.indexOf(e0Var2));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i22 = 0;
        while (i22 < list.size()) {
            List list6 = list;
            String str4 = ((p061i2.k) list6.get(i22)).f13913c;
            if (hashSet2.add(str4)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i23 = 0;
                boolean z14 = true;
                while (i23 < list6.size()) {
                    String str5 = ((p061i2.k) list6.get(i23)).f13913c;
                    int i24 = t.f17159a;
                    if (str4.equals(str5)) {
                        p061i2.k kVar = (p061i2.k) list6.get(i23);
                        arrayList7.add(Integer.valueOf(i23));
                        arrayList5.add(kVar.f13911a);
                        X x10 = kVar.f13912b;
                        arrayList6.add(x10);
                        i8 = 1;
                        z14 &= t.p(1, x10.f312z) == 1;
                    } else {
                        i8 = 1;
                    }
                    i23 += i8;
                }
                String strConcat = "audio:".concat(str4);
                int i25 = t.f17159a;
                list2 = list6;
                hashSet = hashSet2;
                i7 = i22;
                r rVarC2 = c(strConcat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (X[]) arrayList6.toArray(new X[0]), null, Collections.emptyList(), map, j);
                arrayList.add(Q0.a.Z(arrayList7));
                arrayList3.add(rVarC2);
                if (z4 && z14) {
                    rVarC2.z(new e0[]{new e0(strConcat, (X[]) arrayList6.toArray(new X[0]))}, new int[0]);
                }
            } else {
                list2 = list6;
                hashSet = hashSet2;
                i7 = i22;
            }
            i22 = i7 + 1;
            list = list2;
            hashSet2 = hashSet;
        }
        this.f13438M = arrayList3.size();
        int i26 = 0;
        while (true) {
            List list7 = mVar.f13925h;
            if (i26 >= list7.size()) {
                break;
            }
            p061i2.k kVar2 = (p061i2.k) list7.get(i26);
            StringBuilder sbJ = AbstractC0486a1.j(i26, "subtitle:", ":");
            sbJ.append(kVar2.f13913c);
            String string = sbJ.toString();
            Uri[] uriArr2 = {kVar2.f13911a};
            X x11 = kVar2.f13912b;
            r rVarC3 = c(string, 3, uriArr2, new X[]{x11}, null, Collections.emptyList(), map, j);
            arrayList.add(new int[]{i26});
            arrayList3.add(rVarC3);
            rVarC3.z(new e0[]{new e0(string, x11)}, new int[0]);
            i26++;
        }
        this.f13436K = (r[]) arrayList3.toArray(new r[0]);
        this.f13434I = this.f13436K.length;
        for (int i27 = 0; i27 < this.f13438M; i27++) {
            this.f13436K[i27].f13507d.f13390l = true;
        }
        for (r rVar : this.f13436K) {
            if (!rVar.f13496U) {
                rVar.y(rVar.f13513g0);
            }
        }
        this.f13437L = this.f13436K;
    }

    @Override // p018c2.B
    public final void q() throws IOException {
        for (r rVar : this.f13436K) {
            rVar.x();
            if (rVar.f13517k0 && !rVar.f13496U) {
                throw C0045t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // p018c2.B
    public final long v(long j) {
        r[] rVarArr = this.f13437L;
        if (rVarArr.length > 0) {
            boolean zB = rVarArr[0].B(j, false);
            int i7 = 1;
            while (true) {
                r[] rVarArr2 = this.f13437L;
                if (i7 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i7].B(j, zB);
                i7++;
            }
            if (zB) {
                ((SparseArray) this.f13427B.f16597b).clear();
            }
        }
        return j;
    }

    @Override // p018c2.B
    public final void w(long j) {
        for (r rVar : this.f13437L) {
            if (rVar.f13495T && !rVar.t()) {
                int length = rVar.f13488M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    rVar.f13488M[i7].g(j, rVar.f13510e0[i7]);
                }
            }
        }
    }

    @Override // p018c2.Y
    public final boolean y(long j) {
        if (this.f13435J != null) {
            return this.f13439N.y(j);
        }
        for (r rVar : this.f13436K) {
            if (!rVar.f13496U) {
                rVar.y(rVar.f13513g0);
            }
        }
        return false;
    }
}
