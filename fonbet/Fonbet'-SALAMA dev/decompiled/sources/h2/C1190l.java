package h2;

import A1.C0045t0;
import A1.H0;
import A1.X;
import A1.x0;
import B.v;
import B4.V;
import E3.AbstractC0158p;
import E3.AbstractC0167z;
import W5.AbstractC0486a1;
import android.net.Uri;
import android.util.SparseArray;
import c2.I;
import c2.InterfaceC0793A;
import c2.InterfaceC0794B;
import c2.W;
import c2.Y;
import c2.e0;
import c2.f0;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import e3.C1023h;
import i2.C1246b;
import i2.C1247c;
import i2.C1251g;
import i2.C1254j;
import i2.C1255k;
import i2.C1256l;
import i2.C1257m;
import i2.InterfaceC1262r;
import io.sentry.protocol.SentryThread;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import n1.C1450e;
import u2.K;
import u2.U;
import v2.AbstractC1664a;
import v2.t;

/* renamed from: h2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1190l implements InterfaceC0794B, InterfaceC1262r {

    /* renamed from: A, reason: collision with root package name */
    public final IdentityHashMap f13420A;

    /* renamed from: B, reason: collision with root package name */
    public final u1.c f13421B;

    /* renamed from: C, reason: collision with root package name */
    public final V f13422C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f13423D;

    /* renamed from: E, reason: collision with root package name */
    public final int f13424E;

    /* renamed from: F, reason: collision with root package name */
    public final B1.p f13425F;

    /* renamed from: G, reason: collision with root package name */
    public final C1450e f13426G = new C1450e(this, 13);

    /* renamed from: H, reason: collision with root package name */
    public InterfaceC0793A f13427H;

    /* renamed from: I, reason: collision with root package name */
    public int f13428I;

    /* renamed from: J, reason: collision with root package name */
    public f0 f13429J;

    /* renamed from: K, reason: collision with root package name */
    public C1196r[] f13430K;

    /* renamed from: L, reason: collision with root package name */
    public C1196r[] f13431L;

    /* renamed from: M, reason: collision with root package name */
    public int f13432M;

    /* renamed from: N, reason: collision with root package name */
    public C1023h f13433N;

    /* renamed from: a, reason: collision with root package name */
    public final C1181c f13434a;

    /* renamed from: b, reason: collision with root package name */
    public final C1247c f13435b;

    /* renamed from: c, reason: collision with root package name */
    public final x0 f13436c;

    /* renamed from: d, reason: collision with root package name */
    public final U f13437d;

    /* renamed from: e, reason: collision with root package name */
    public final E1.h f13438e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.m f13439f;

    /* renamed from: x, reason: collision with root package name */
    public final M4.e f13440x;

    /* renamed from: y, reason: collision with root package name */
    public final I f13441y;

    /* renamed from: z, reason: collision with root package name */
    public final u2.r f13442z;

    public C1190l(C1181c c1181c, C1247c c1247c, x0 x0Var, U u4, E1.h hVar, B1.m mVar, M4.e eVar, I i7, u2.r rVar, V v6, boolean z4, int i8, B1.p pVar) {
        this.f13434a = c1181c;
        this.f13435b = c1247c;
        this.f13436c = x0Var;
        this.f13437d = u4;
        this.f13438e = hVar;
        this.f13439f = mVar;
        this.f13440x = eVar;
        this.f13441y = i7;
        this.f13442z = rVar;
        this.f13422C = v6;
        this.f13423D = z4;
        this.f13424E = i8;
        this.f13425F = pVar;
        v6.getClass();
        this.f13433N = new C1023h(new Y[0]);
        this.f13420A = new IdentityHashMap();
        this.f13421B = new u1.c(18);
        this.f13430K = new C1196r[0];
        this.f13431L = new C1196r[0];
    }

    public static X d(X x4, X x7, boolean z4) {
        String q7;
        Metadata metadata;
        int i7;
        String str;
        int i8;
        int i9;
        String str2;
        if (x7 != null) {
            q7 = x7.f312z;
            metadata = x7.f281A;
            i8 = x7.f296P;
            i7 = x7.f307d;
            i9 = x7.f308e;
            str = x7.f306c;
            str2 = x7.f305b;
        } else {
            q7 = t.q(1, x4.f312z);
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
        String c3 = v2.i.c(q7);
        int i10 = z4 ? x4.f309f : -1;
        int i11 = z4 ? x4.f310x : -1;
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = x4.f304a;
        format$Builder.f10529b = str2;
        format$Builder.j = x4.f282B;
        format$Builder.f10537k = c3;
        format$Builder.f10535h = q7;
        format$Builder.f10536i = metadata;
        format$Builder.f10533f = i10;
        format$Builder.f10534g = i11;
        format$Builder.f10550x = i8;
        format$Builder.f10531d = i7;
        format$Builder.f10532e = i9;
        format$Builder.f10530c = str;
        return new X(format$Builder);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x01de, code lost:
    
        if (r10.f16298c[r10.e()] != r5.f13381h.a(r0.f12596d)) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01ed  */
    @Override // c2.InterfaceC0794B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long I(t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        IdentityHashMap identityHashMap2;
        boolean z4;
        boolean z7;
        C1190l c1190l;
        IdentityHashMap identityHashMap3;
        int i7;
        t2.c[] cVarArr2;
        int[] iArr;
        W[] wArr2;
        C1190l c1190l2 = this;
        W[] wArr3 = wArr;
        int[] iArr2 = new int[cVarArr.length];
        int[] iArr3 = new int[cVarArr.length];
        int i8 = 0;
        while (true) {
            int length = cVarArr.length;
            identityHashMap = c1190l2.f13420A;
            if (i8 >= length) {
                break;
            }
            W w7 = wArr3[i8];
            iArr2[i8] = w7 == null ? -1 : ((Integer) identityHashMap.get(w7)).intValue();
            iArr3[i8] = -1;
            t2.c cVar = cVarArr[i8];
            if (cVar != null) {
                int i9 = 0;
                while (true) {
                    C1196r[] c1196rArr = c1190l2.f13430K;
                    if (i9 < c1196rArr.length) {
                        C1196r c1196r = c1196rArr[i9];
                        c1196r.c();
                        if (c1196r.f13495Z.b(cVar.f16296a) != -1) {
                            iArr3[i8] = i9;
                            break;
                        }
                        i9++;
                    }
                }
            }
            i8++;
        }
        identityHashMap.clear();
        int length2 = cVarArr.length;
        W[] wArr4 = new W[length2];
        int length3 = cVarArr.length;
        W[] wArr5 = new W[length3];
        int length4 = cVarArr.length;
        t2.c[] cVarArr3 = new t2.c[length4];
        C1196r[] c1196rArr2 = new C1196r[c1190l2.f13430K.length];
        int i10 = 0;
        int i11 = 0;
        boolean z8 = false;
        while (i11 < c1190l2.f13430K.length) {
            int i12 = i10;
            int i13 = 0;
            while (true) {
                identityHashMap2 = identityHashMap;
                if (i13 >= cVarArr.length) {
                    break;
                }
                wArr5[i13] = iArr2[i13] == i11 ? wArr3[i13] : null;
                cVarArr3[i13] = iArr3[i13] == i11 ? cVarArr[i13] : null;
                i13++;
                identityHashMap = identityHashMap2;
            }
            C1196r c1196r2 = c1190l2.f13430K[i11];
            c1196r2.c();
            int i14 = c1196r2.f13491V;
            int i15 = 0;
            while (i15 < length4) {
                C1192n c1192n = (C1192n) wArr5[i15];
                if (c1192n == null || (cVarArr3[i15] != null && zArr[i15])) {
                    iArr = iArr2;
                    wArr2 = wArr4;
                } else {
                    c1196r2.f13491V--;
                    iArr = iArr2;
                    if (c1192n.f13457c != -1) {
                        C1196r c1196r3 = c1192n.f13456b;
                        c1196r3.c();
                        c1196r3.f13499b0.getClass();
                        wArr2 = wArr4;
                        int i16 = c1196r3.f13499b0[c1192n.f13455a];
                        AbstractC1664a.h(c1196r3.f13504e0[i16]);
                        c1196r3.f13504e0[i16] = false;
                        c1192n.f13457c = -1;
                    } else {
                        wArr2 = wArr4;
                    }
                    wArr5[i15] = null;
                }
                i15++;
                iArr2 = iArr;
                wArr4 = wArr2;
            }
            int[] iArr4 = iArr2;
            W[] wArr6 = wArr4;
            boolean z9 = z8 || (!c1196r2.f13510j0 ? j == c1196r2.f13507g0 : i14 != 0);
            C1187i c1187i = c1196r2.f13501d;
            t2.c cVar2 = c1187i.f13389q;
            boolean z10 = z9;
            t2.c cVar3 = cVar2;
            int i17 = 0;
            while (i17 < length4) {
                t2.c cVar4 = cVarArr3[i17];
                if (cVar4 == null) {
                    i7 = length4;
                    cVarArr2 = cVarArr3;
                } else {
                    i7 = length4;
                    cVarArr2 = cVarArr3;
                    int b7 = c1196r2.f13495Z.b(cVar4.f16296a);
                    if (b7 == c1196r2.c0) {
                        c1187i.f13389q = cVar4;
                        cVar3 = cVar4;
                    }
                    if (wArr5[i17] == null) {
                        c1196r2.f13491V++;
                        C1192n c1192n2 = new C1192n(c1196r2, b7);
                        wArr5[i17] = c1192n2;
                        zArr2[i17] = true;
                        if (c1196r2.f13499b0 != null) {
                            c1192n2.a();
                            if (!z10) {
                                C1195q c1195q = c1196r2.f13482M[c1196r2.f13499b0[b7]];
                                z10 = (c1195q.z(j, true) || c1195q.n() == 0) ? false : true;
                            }
                        }
                    }
                }
                i17++;
                length4 = i7;
                cVarArr3 = cVarArr2;
            }
            int i18 = length4;
            t2.c[] cVarArr4 = cVarArr3;
            int i19 = c1196r2.f13491V;
            ArrayList arrayList = c1196r2.f13474E;
            if (i19 == 0) {
                c1187i.f13386n = null;
                c1196r2.f13493X = null;
                c1196r2.f13509i0 = true;
                arrayList.clear();
                K k7 = c1196r2.f13470A;
                if (k7.d()) {
                    if (c1196r2.f13489T) {
                        for (C1195q c1195q2 : c1196r2.f13482M) {
                            c1195q2.h();
                        }
                    }
                    k7.a();
                } else {
                    c1196r2.A();
                }
            } else {
                if (!arrayList.isEmpty() && !t.a(cVar3, cVar2)) {
                    if (!c1196r2.f13510j0) {
                        long j3 = j < 0 ? -j : 0L;
                        C1189k j7 = c1196r2.j();
                        cVar3.l(j3, -9223372036854775807L, c1196r2.f13475F, c1187i.a(j7, j));
                    }
                    z4 = true;
                    c1196r2.f13509i0 = true;
                    z7 = true;
                    z10 = true;
                    if (z10) {
                        c1196r2.B(j, z7);
                        int i20 = 0;
                        while (i20 < length3) {
                            if (wArr5[i20] != null) {
                                zArr2[i20] = z4;
                            }
                            i20++;
                            z4 = true;
                        }
                    }
                }
                z4 = true;
                z7 = z8;
                if (z10) {
                }
            }
            ArrayList arrayList2 = c1196r2.f13479J;
            arrayList2.clear();
            for (int i21 = 0; i21 < length3; i21++) {
                W w8 = wArr5[i21];
                if (w8 != null) {
                    arrayList2.add((C1192n) w8);
                }
            }
            c1196r2.f13510j0 = true;
            int i22 = 0;
            boolean z11 = false;
            while (i22 < cVarArr.length) {
                W w9 = wArr5[i22];
                if (iArr3[i22] == i11) {
                    w9.getClass();
                    wArr6[i22] = w9;
                    identityHashMap3 = identityHashMap2;
                    identityHashMap3.put(w9, Integer.valueOf(i11));
                    z11 = true;
                } else {
                    identityHashMap3 = identityHashMap2;
                    if (iArr4[i22] == i11) {
                        AbstractC1664a.h(w9 == null);
                    }
                }
                i22++;
                identityHashMap2 = identityHashMap3;
            }
            identityHashMap = identityHashMap2;
            if (z11) {
                c1196rArr2[i12] = c1196r2;
                i10 = i12 + 1;
                if (i12 == 0) {
                    c1187i.f13384l = true;
                    c1190l = this;
                    if (!z10) {
                        C1196r[] c1196rArr3 = c1190l.f13431L;
                        if (c1196rArr3.length != 0 && c1196r2 == c1196rArr3[0]) {
                        }
                    }
                    ((SparseArray) c1190l.f13421B.f16591b).clear();
                    z8 = true;
                } else {
                    c1190l = this;
                    c1187i.f13384l = i11 < c1190l.f13432M;
                }
            } else {
                c1190l = this;
                i10 = i12;
            }
            i11++;
            c1190l2 = c1190l;
            iArr2 = iArr4;
            wArr4 = wArr6;
            length4 = i18;
            cVarArr3 = cVarArr4;
            wArr3 = wArr;
        }
        W[] wArr7 = wArr3;
        C1190l c1190l3 = c1190l2;
        System.arraycopy(wArr4, 0, wArr7, 0, length2);
        C1196r[] c1196rArr4 = (C1196r[]) t.G(i10, c1196rArr2);
        c1190l3.f13431L = c1196rArr4;
        c1190l3.f13422C.getClass();
        c1190l3.f13433N = new C1023h(c1196rArr4);
        return j;
    }

    @Override // c2.InterfaceC0794B
    public final long M() {
        return -9223372036854775807L;
    }

    @Override // c2.InterfaceC0794B
    public final f0 P() {
        f0 f0Var = this.f13429J;
        f0Var.getClass();
        return f0Var;
    }

    @Override // c2.Y
    public final long T() {
        return this.f13433N.T();
    }

    @Override // c2.Y
    public final void Y(long j) {
        this.f13433N.Y(j);
    }

    @Override // i2.InterfaceC1262r
    public final void a() {
        for (C1196r c1196r : this.f13430K) {
            ArrayList arrayList = c1196r.f13474E;
            if (!arrayList.isEmpty()) {
                C1189k c1189k = (C1189k) AbstractC0158p.f(arrayList);
                int b7 = c1196r.f13501d.b(c1189k);
                if (b7 == 1) {
                    c1189k.f13419b0 = true;
                } else if (b7 == 2 && !c1196r.f13511k0) {
                    K k7 = c1196r.f13470A;
                    if (k7.d()) {
                        k7.a();
                    }
                }
            }
        }
        this.f13427H.b(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x008e, code lost:
    
        if (r4 != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0053 A[SYNTHETIC] */
    @Override // i2.InterfaceC1262r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(Uri uri, v vVar, boolean z4) {
        long j;
        int i7;
        int h6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = true;
        for (C1196r c1196r : this.f13430K) {
            C1187i c1187i = c1196r.f13501d;
            Uri[] uriArr = c1187i.f13378e;
            if (t.l(uriArr, uri)) {
                if (!z4) {
                    H2.o a2 = q2.g.a(c1187i.f13389q);
                    c1196r.f13518z.getClass();
                    Q1.e t7 = M4.e.t(a2, vVar);
                    if (t7 != null && t7.f5785a == 2) {
                        j = t7.f5786b;
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
                        if (i7 == -1 || (h6 = c1187i.f13389q.h(i7)) == -1) {
                            z8 = true;
                            z7 = true;
                        } else {
                            c1187i.f13391s |= uri.equals(c1187i.f13387o);
                            if (j == -9223372036854775807L) {
                                if (c1187i.f13389q.a(h6, j)) {
                                    C1246b c1246b = (C1246b) c1187i.f13380g.f13858d.get(uri);
                                    if (c1246b != null) {
                                        z7 = true;
                                        z9 = !C1246b.a(c1246b, j);
                                    } else {
                                        z7 = true;
                                        z9 = false;
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
                        z10 = (z8 || j == -9223372036854775807L) ? false : z7;
                    }
                }
                j = -9223372036854775807L;
                i7 = 0;
                while (true) {
                    if (i7 < uriArr.length) {
                    }
                    i7++;
                }
                if (i7 == -1) {
                    c1187i.f13391s |= uri.equals(c1187i.f13387o);
                    if (j == -9223372036854775807L) {
                    }
                    z8 = z7;
                    if (z8) {
                    }
                }
                z8 = true;
                z7 = true;
                if (z8) {
                }
            } else {
                z10 = true;
            }
            z11 &= z10;
        }
        this.f13427H.b(this);
        return z11;
    }

    public final C1196r c(String str, int i7, Uri[] uriArr, X[] xArr, X x4, List list, Map map, long j) {
        C1187i c1187i = new C1187i(this.f13434a, this.f13435b, uriArr, xArr, this.f13436c, this.f13437d, this.f13421B, list, this.f13425F);
        I i8 = this.f13441y;
        return new C1196r(str, i7, this.f13426G, c1187i, map, this.f13442z, j, x4, this.f13438e, this.f13439f, this.f13440x, i8, this.f13424E);
    }

    @Override // c2.Y
    public final boolean isLoading() {
        return this.f13433N.isLoading();
    }

    @Override // c2.Y
    public final long k() {
        return this.f13433N.k();
    }

    @Override // c2.InterfaceC0794B
    public final long o(long j, H0 h02) {
        C1254j c1254j;
        C1196r[] c1196rArr = this.f13431L;
        int length = c1196rArr.length;
        int i7 = 0;
        while (true) {
            if (i7 >= length) {
                break;
            }
            C1196r c1196r = c1196rArr[i7];
            if (c1196r.f13487R == 2) {
                C1187i c1187i = c1196r.f13501d;
                int e7 = c1187i.f13389q.e();
                Uri[] uriArr = c1187i.f13378e;
                int length2 = uriArr.length;
                C1247c c1247c = c1187i.f13380g;
                if (e7 >= length2 || e7 == -1) {
                    c1254j = null;
                } else {
                    t2.c cVar = c1187i.f13389q;
                    c1254j = c1247c.a(true, uriArr[cVar.f16298c[cVar.e()]]);
                }
                if (c1254j != null) {
                    AbstractC0167z abstractC0167z = c1254j.f13900r;
                    if (!abstractC0167z.isEmpty() && c1254j.f13926c) {
                        long j3 = c1254j.f13891h - c1247c.f13854E;
                        long j7 = j - j3;
                        int d7 = t.d(abstractC0167z, Long.valueOf(j7), true);
                        long j8 = ((C1251g) abstractC0167z.get(d7)).f13877e;
                        return h02.a(j7, j8, d7 != abstractC0167z.size() - 1 ? ((C1251g) abstractC0167z.get(d7 + 1)).f13877e : j8) + j3;
                    }
                }
            } else {
                i7++;
            }
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r2[r14] != 1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01cb  */
    @Override // c2.InterfaceC0794B
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(InterfaceC0793A interfaceC0793A, long j) {
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
        int i10;
        int p5;
        C1196r c3;
        boolean z9;
        int i11;
        int i12;
        int i13;
        this.f13427H = interfaceC0793A;
        C1247c c1247c = this.f13435b;
        c1247c.getClass();
        c1247c.f13859e.add(this);
        C1257m c1257m = c1247c.f13850A;
        c1257m.getClass();
        Map emptyMap = Collections.emptyMap();
        List list3 = c1257m.f13916e;
        boolean isEmpty = list3.isEmpty();
        this.f13428I = 0;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        boolean z10 = this.f13423D;
        List list4 = c1257m.f13918g;
        if (isEmpty) {
            list = list4;
            z4 = z10;
            map = emptyMap;
            arrayList = arrayList3;
        } else {
            int size = list3.size();
            int[] iArr = new int[size];
            int i14 = 0;
            int i15 = 0;
            int i16 = 0;
            while (i14 < list3.size()) {
                X x4 = ((C1256l) list3.get(i14)).f13909b;
                if (x4.f289I <= 0) {
                    String str = x4.f312z;
                    if (t.q(2, str) == null) {
                        i13 = 1;
                        if (t.q(1, str) != null) {
                            iArr[i14] = 1;
                            i16++;
                        } else {
                            iArr[i14] = -1;
                        }
                        i14 += i13;
                    }
                }
                i13 = 1;
                iArr[i14] = 2;
                i15++;
                i14 += i13;
            }
            if (i15 > 0) {
                i9 = i15;
                z7 = true;
            } else if (i16 < size) {
                i9 = size - i16;
                z7 = false;
                z8 = true;
                Uri[] uriArr = new Uri[i9];
                X[] xArr = new X[i9];
                int[] iArr2 = new int[i9];
                i10 = 0;
                int i17 = 0;
                while (i10 < list3.size()) {
                    if (z7) {
                        z9 = z10;
                        if (iArr[i10] != 2) {
                            i12 = 1;
                            i11 = i12;
                            i10 += i11;
                            z10 = z9;
                        }
                    } else {
                        z9 = z10;
                    }
                    if (z8) {
                        i12 = 1;
                    }
                    C1256l c1256l = (C1256l) list3.get(i10);
                    uriArr[i17] = c1256l.f13908a;
                    xArr[i17] = c1256l.f13909b;
                    i11 = 1;
                    iArr2[i17] = i10;
                    i17++;
                    i10 += i11;
                    z10 = z9;
                }
                boolean z11 = z10;
                String str2 = xArr[0].f312z;
                p5 = t.p(2, str2);
                int p7 = t.p(1, str2);
                boolean z12 = (p7 != 1 || (p7 == 0 && list4.isEmpty())) && p5 <= 1 && p7 + p5 > 0;
                list = list4;
                map = emptyMap;
                arrayList = arrayList3;
                z4 = z11;
                c3 = c(SentryThread.JsonKeys.MAIN, (!z7 || p7 <= 0) ? 0 : 1, uriArr, xArr, c1257m.j, c1257m.f13921k, emptyMap, j);
                arrayList2.add(c3);
                arrayList.add(iArr2);
                if (z4 && z12) {
                    ArrayList arrayList4 = new ArrayList();
                    X x7 = c1257m.j;
                    if (p5 <= 0) {
                        X[] xArr2 = new X[i9];
                        for (int i18 = 0; i18 < i9; i18++) {
                            X x8 = xArr[i18];
                            String q7 = t.q(2, x8.f312z);
                            String c4 = v2.i.c(q7);
                            Format$Builder format$Builder = new Format$Builder();
                            format$Builder.f10528a = x8.f304a;
                            format$Builder.f10529b = x8.f305b;
                            format$Builder.j = x8.f282B;
                            format$Builder.f10537k = c4;
                            format$Builder.f10535h = q7;
                            format$Builder.f10536i = x8.f281A;
                            format$Builder.f10533f = x8.f309f;
                            format$Builder.f10534g = x8.f310x;
                            format$Builder.f10542p = x8.f288H;
                            format$Builder.f10543q = x8.f289I;
                            format$Builder.f10544r = x8.f290J;
                            format$Builder.f10531d = x8.f307d;
                            format$Builder.f10532e = x8.f308e;
                            xArr2[i18] = new X(format$Builder);
                        }
                        arrayList4.add(new e0(SentryThread.JsonKeys.MAIN, xArr2));
                        if (p7 > 0 && (x7 != null || list.isEmpty())) {
                            arrayList4.add(new e0("main:audio", d(xArr[0], x7, false)));
                        }
                        List list5 = c1257m.f13921k;
                        if (list5 != null) {
                            for (int i19 = 0; i19 < list5.size(); i19++) {
                                arrayList4.add(new e0(e1.k.d(i19, "main:cc:"), (X) list5.get(i19)));
                            }
                        }
                    } else {
                        X[] xArr3 = new X[i9];
                        for (int i20 = 0; i20 < i9; i20++) {
                            xArr3[i20] = d(xArr[i20], x7, true);
                        }
                        arrayList4.add(new e0(SentryThread.JsonKeys.MAIN, xArr3));
                    }
                    Format$Builder format$Builder2 = new Format$Builder();
                    format$Builder2.f10528a = "ID3";
                    format$Builder2.f10537k = "application/id3";
                    e0 e0Var = new e0("main:id3", new X(format$Builder2));
                    arrayList4.add(e0Var);
                    c3.z((e0[]) arrayList4.toArray(new e0[0]), arrayList4.indexOf(e0Var));
                }
            } else {
                i9 = size;
                z7 = false;
            }
            z8 = false;
            Uri[] uriArr2 = new Uri[i9];
            X[] xArr4 = new X[i9];
            int[] iArr22 = new int[i9];
            i10 = 0;
            int i172 = 0;
            while (i10 < list3.size()) {
            }
            boolean z112 = z10;
            String str22 = xArr4[0].f312z;
            p5 = t.p(2, str22);
            int p72 = t.p(1, str22);
            if (p72 != 1) {
            }
            list = list4;
            map = emptyMap;
            arrayList = arrayList3;
            z4 = z112;
            c3 = c(SentryThread.JsonKeys.MAIN, (!z7 || p72 <= 0) ? 0 : 1, uriArr2, xArr4, c1257m.j, c1257m.f13921k, emptyMap, j);
            arrayList2.add(c3);
            arrayList.add(iArr22);
            if (z4) {
                ArrayList arrayList42 = new ArrayList();
                X x72 = c1257m.j;
                if (p5 <= 0) {
                }
                Format$Builder format$Builder22 = new Format$Builder();
                format$Builder22.f10528a = "ID3";
                format$Builder22.f10537k = "application/id3";
                e0 e0Var2 = new e0("main:id3", new X(format$Builder22));
                arrayList42.add(e0Var2);
                c3.z((e0[]) arrayList42.toArray(new e0[0]), arrayList42.indexOf(e0Var2));
            }
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        HashSet hashSet2 = new HashSet();
        int i21 = 0;
        while (i21 < list.size()) {
            List list6 = list;
            String str3 = ((C1255k) list6.get(i21)).f13907c;
            if (hashSet2.add(str3)) {
                arrayList5.clear();
                arrayList6.clear();
                arrayList7.clear();
                int i22 = 0;
                boolean z13 = true;
                while (i22 < list6.size()) {
                    String str4 = ((C1255k) list6.get(i22)).f13907c;
                    int i23 = t.f17153a;
                    if (str3.equals(str4)) {
                        C1255k c1255k = (C1255k) list6.get(i22);
                        arrayList7.add(Integer.valueOf(i22));
                        arrayList5.add(c1255k.f13905a);
                        X x9 = c1255k.f13906b;
                        arrayList6.add(x9);
                        i8 = 1;
                        z13 &= t.p(1, x9.f312z) == 1;
                    } else {
                        i8 = 1;
                    }
                    i22 += i8;
                }
                String concat = "audio:".concat(str3);
                int i24 = t.f17153a;
                list2 = list6;
                hashSet = hashSet2;
                i7 = i21;
                C1196r c7 = c(concat, 1, (Uri[]) arrayList5.toArray(new Uri[0]), (X[]) arrayList6.toArray(new X[0]), null, Collections.emptyList(), map, j);
                arrayList.add(Q0.a.Z(arrayList7));
                arrayList2.add(c7);
                if (z4 && z13) {
                    c7.z(new e0[]{new e0(concat, (X[]) arrayList6.toArray(new X[0]))}, new int[0]);
                }
            } else {
                list2 = list6;
                hashSet = hashSet2;
                i7 = i21;
            }
            i21 = i7 + 1;
            list = list2;
            hashSet2 = hashSet;
        }
        this.f13432M = arrayList2.size();
        int i25 = 0;
        while (true) {
            List list7 = c1257m.f13919h;
            if (i25 >= list7.size()) {
                break;
            }
            C1255k c1255k2 = (C1255k) list7.get(i25);
            StringBuilder j3 = AbstractC0486a1.j(i25, "subtitle:", ":");
            j3.append(c1255k2.f13907c);
            String sb = j3.toString();
            Uri[] uriArr3 = {c1255k2.f13905a};
            X x10 = c1255k2.f13906b;
            C1196r c8 = c(sb, 3, uriArr3, new X[]{x10}, null, Collections.emptyList(), map, j);
            arrayList.add(new int[]{i25});
            arrayList2.add(c8);
            c8.z(new e0[]{new e0(sb, x10)}, new int[0]);
            i25++;
        }
        this.f13430K = (C1196r[]) arrayList2.toArray(new C1196r[0]);
        this.f13428I = this.f13430K.length;
        for (int i26 = 0; i26 < this.f13432M; i26++) {
            this.f13430K[i26].f13501d.f13384l = true;
        }
        for (C1196r c1196r : this.f13430K) {
            if (!c1196r.f13490U) {
                c1196r.y(c1196r.f13507g0);
            }
        }
        this.f13431L = this.f13430K;
    }

    @Override // c2.InterfaceC0794B
    public final void q() {
        for (C1196r c1196r : this.f13430K) {
            c1196r.x();
            if (c1196r.f13511k0 && !c1196r.f13490U) {
                throw C0045t0.a(null, "Loading finished before preparation is complete.");
            }
        }
    }

    @Override // c2.InterfaceC0794B
    public final long v(long j) {
        C1196r[] c1196rArr = this.f13431L;
        if (c1196rArr.length > 0) {
            boolean B7 = c1196rArr[0].B(j, false);
            int i7 = 1;
            while (true) {
                C1196r[] c1196rArr2 = this.f13431L;
                if (i7 >= c1196rArr2.length) {
                    break;
                }
                c1196rArr2[i7].B(j, B7);
                i7++;
            }
            if (B7) {
                ((SparseArray) this.f13421B.f16591b).clear();
            }
        }
        return j;
    }

    @Override // c2.InterfaceC0794B
    public final void w(long j) {
        for (C1196r c1196r : this.f13431L) {
            if (c1196r.f13489T && !c1196r.t()) {
                int length = c1196r.f13482M.length;
                for (int i7 = 0; i7 < length; i7++) {
                    c1196r.f13482M[i7].g(j, c1196r.f13504e0[i7]);
                }
            }
        }
    }

    @Override // c2.Y
    public final boolean y(long j) {
        if (this.f13429J != null) {
            return this.f13433N.y(j);
        }
        for (C1196r c1196r : this.f13430K) {
            if (!c1196r.f13490U) {
                c1196r.y(c1196r.f13507g0);
            }
        }
        return false;
    }
}
