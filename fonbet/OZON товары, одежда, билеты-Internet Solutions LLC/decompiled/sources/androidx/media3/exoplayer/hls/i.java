package androidx.media3.exoplayer.hls;

import E0.C2946s0;
import F3.C3003h;
import F3.F;
import F3.InterfaceC3017w;
import F3.U;
import F3.d0;
import I3.y;
import J3.i;
import android.net.Uri;
import androidx.media3.exoplayer.M;
import androidx.media3.exoplayer.hls.o;
import com.google.common.collect.AbstractC5880y;
import com.google.common.collect.G;
import j3.C7251G;
import j3.C7253I;
import j3.C7270l;
import j3.C7272n;
import j3.C7274p;
import j3.t;
import j3.u;
import java.io.IOException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import m3.N;
import p3.z;
import t3.I;
import u3.P;
import w3.i;
import x3.C10652a;
import z3.C10978b;
import z3.g;
import z3.k;

/* loaded from: classes8.dex */
final class i implements InterfaceC3017w, k.a {

    /* renamed from: a, reason: collision with root package name */
    private final c f43968a;

    /* renamed from: b, reason: collision with root package name */
    private final C10978b f43969b;

    /* renamed from: c, reason: collision with root package name */
    private final C10652a f43970c;

    /* renamed from: d, reason: collision with root package name */
    private final z f43971d;

    /* renamed from: e, reason: collision with root package name */
    private final w3.j f43972e;

    /* renamed from: f, reason: collision with root package name */
    private final i.a f43973f;

    /* renamed from: g, reason: collision with root package name */
    private final J3.h f43974g;

    /* renamed from: h, reason: collision with root package name */
    private final F.a f43975h;

    /* renamed from: i, reason: collision with root package name */
    private final J3.b f43976i;

    /* renamed from: j, reason: collision with root package name */
    private final IdentityHashMap<U, Integer> f43977j;

    /* renamed from: k, reason: collision with root package name */
    private final x3.f f43978k;

    /* renamed from: l, reason: collision with root package name */
    private final C2946s0 f43979l;

    /* renamed from: m, reason: collision with root package name */
    private final boolean f43980m;

    /* renamed from: n, reason: collision with root package name */
    private final int f43981n;

    /* renamed from: o, reason: collision with root package name */
    private final P f43982o;

    /* renamed from: p, reason: collision with root package name */
    private final o.a f43983p = new a();

    /* renamed from: q, reason: collision with root package name */
    private InterfaceC3017w.a f43984q;

    /* renamed from: r, reason: collision with root package name */
    private int f43985r;

    /* renamed from: s, reason: collision with root package name */
    private d0 f43986s;

    /* renamed from: t, reason: collision with root package name */
    private o[] f43987t;

    /* renamed from: u, reason: collision with root package name */
    private o[] f43988u;

    /* renamed from: v, reason: collision with root package name */
    private int[][] f43989v;

    /* renamed from: w, reason: collision with root package name */
    private int f43990w;

    /* renamed from: x, reason: collision with root package name */
    private C3003h f43991x;

    /* JADX INFO: Access modifiers changed from: private */
    class a implements o.a {
        a() {
        }

        public final void a() {
            i iVar = i.this;
            if (i.c(iVar) > 0) {
                return;
            }
            int i11 = 0;
            for (o oVar : iVar.f43987t) {
                i11 += oVar.getTrackGroups().f8644a;
            }
            C7253I[] c7253iArr = new C7253I[i11];
            int i12 = 0;
            for (o oVar2 : iVar.f43987t) {
                int i13 = oVar2.getTrackGroups().f8644a;
                int i14 = 0;
                while (i14 < i13) {
                    c7253iArr[i12] = oVar2.getTrackGroups().a(i14);
                    i14++;
                    i12++;
                }
            }
            iVar.f43986s = new d0(c7253iArr);
            iVar.f43984q.e(iVar);
        }

        @Override // F3.V.a
        public final void c(o oVar) {
            i iVar = i.this;
            iVar.f43984q.c(iVar);
        }
    }

    public i(c cVar, C10978b c10978b, C10652a c10652a, z zVar, w3.j jVar, i.a aVar, J3.h hVar, F.a aVar2, J3.b bVar, C2946s0 c2946s0, boolean z11, int i11, P p11) {
        this.f43968a = cVar;
        this.f43969b = c10978b;
        this.f43970c = c10652a;
        this.f43971d = zVar;
        this.f43972e = jVar;
        this.f43973f = aVar;
        this.f43974g = hVar;
        this.f43975h = aVar2;
        this.f43976i = bVar;
        this.f43979l = c2946s0;
        this.f43980m = z11;
        this.f43981n = i11;
        this.f43982o = p11;
        c2946s0.getClass();
        this.f43991x = new C3003h(AbstractC5880y.v(), AbstractC5880y.v());
        this.f43977j = new IdentityHashMap<>();
        this.f43978k = new x3.f();
        this.f43987t = new o[0];
        this.f43988u = new o[0];
        this.f43989v = new int[0][];
    }

    static /* synthetic */ int c(i iVar) {
        int i11 = iVar.f43985r - 1;
        iVar.f43985r = i11;
        return i11;
    }

    private o i(String str, int i11, Uri[] uriArr, C7272n[] c7272nArr, C7272n c7272n, List<C7272n> list, Map<String, C7270l> map, long j11) {
        f fVar = new f(this.f43968a, this.f43969b, uriArr, c7272nArr, this.f43970c, this.f43971d, this.f43978k, list, this.f43982o);
        return new o(str, i11, this.f43983p, fVar, map, this.f43976i, j11, c7272n, this.f43972e, this.f43973f, this.f43974g, this.f43975h, this.f43981n);
    }

    private static C7272n j(C7272n c7272n, C7272n c7272n2, boolean z11) {
        t tVar;
        int i11;
        String str;
        String str2;
        List<C7274p> list;
        int i12;
        int i13;
        String str3;
        AbstractC5880y v11 = AbstractC5880y.v();
        if (c7272n2 != null) {
            str2 = c7272n2.f69123k;
            tVar = c7272n2.f69124l;
            i12 = c7272n2.f69102G;
            i11 = c7272n2.f69117e;
            i13 = c7272n2.f69118f;
            str = c7272n2.f69116d;
            str3 = c7272n2.f69114b;
            list = c7272n2.f69115c;
        } else {
            String w11 = N.w(1, c7272n.f69123k);
            tVar = c7272n.f69124l;
            if (z11) {
                i12 = c7272n.f69102G;
                i11 = c7272n.f69117e;
                i13 = c7272n.f69118f;
                str = c7272n.f69116d;
                str3 = c7272n.f69114b;
                str2 = w11;
                list = c7272n.f69115c;
            } else {
                i11 = 0;
                str = null;
                str2 = w11;
                list = v11;
                i12 = -1;
                i13 = 0;
                str3 = null;
            }
        }
        String d11 = u.d(str2);
        int i14 = z11 ? c7272n.f69120h : -1;
        int i15 = z11 ? c7272n.f69121i : -1;
        C7272n.a aVar = new C7272n.a();
        aVar.j0(c7272n.f69113a);
        aVar.l0(str3);
        aVar.m0(list);
        aVar.W(c7272n.f69126n);
        aVar.y0(d11);
        aVar.U(str2);
        aVar.r0(tVar);
        aVar.S(i14);
        aVar.t0(i15);
        aVar.T(i12);
        aVar.A0(i11);
        aVar.w0(i13);
        aVar.n0(str);
        return aVar.P();
    }

    @Override // z3.k.a
    public final void a() {
        for (o oVar : this.f43987t) {
            oVar.x();
        }
        this.f43984q.c(this);
    }

    @Override // z3.k.a
    public final boolean b(Uri uri, i.c cVar, boolean z11) {
        boolean z12 = true;
        for (o oVar : this.f43987t) {
            z12 &= oVar.w(uri, cVar, z11);
        }
        this.f43984q.c(this);
        return z12;
    }

    @Override // F3.V
    public final boolean continueLoading(M m11) {
        if (this.f43986s != null) {
            return this.f43991x.continueLoading(m11);
        }
        for (o oVar : this.f43987t) {
            oVar.h();
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // F3.InterfaceC3017w
    public final List d(ArrayList arrayList) {
        int[] iArr;
        d0 d0Var;
        int i11;
        i iVar = this;
        z3.g s11 = iVar.f43969b.s();
        s11.getClass();
        List<g.b> list = s11.f107105e;
        boolean isEmpty = list.isEmpty();
        boolean z11 = !isEmpty;
        int i12 = 0;
        if (isEmpty) {
            iArr = new int[0];
            d0Var = d0.f8643d;
            i11 = 0;
        } else {
            o oVar = iVar.f43987t[0];
            iArr = iVar.f43989v[0];
            d0Var = oVar.getTrackGroups();
            i11 = oVar.n();
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        boolean z12 = false;
        boolean z13 = false;
        while (it.hasNext()) {
            y yVar = (y) it.next();
            C7253I g10 = yVar.g();
            int c11 = d0Var.c(g10);
            if (c11 == -1) {
                ?? r14 = z11;
                while (true) {
                    o[] oVarArr = iVar.f43987t;
                    if (r14 >= oVarArr.length) {
                        break;
                    }
                    d0 trackGroups = oVarArr[r14].getTrackGroups();
                    int c12 = trackGroups.c(g10);
                    if (c12 != -1) {
                        int i13 = trackGroups.a(c12).f68964c != 1 ? 2 : 1;
                        int[] iArr2 = iVar.f43989v[r14];
                        for (int i14 = 0; i14 < yVar.length(); i14++) {
                            arrayList2.add(new C7251G(0, i13, iArr2[yVar.c(i14)]));
                        }
                    } else {
                        iVar = this;
                        r14++;
                    }
                }
            } else if (c11 == i11) {
                for (int i15 = i12; i15 < yVar.length(); i15++) {
                    arrayList2.add(new C7251G(i12, i12, iArr[yVar.c(i15)]));
                }
                z13 = true;
            } else {
                z12 = true;
            }
            iVar = this;
            i12 = 0;
        }
        if (z12 && !z13) {
            int i16 = iArr[0];
            int i17 = list.get(i16).f107118b.f69122j;
            for (int i18 = 1; i18 < iArr.length; i18++) {
                int i19 = list.get(iArr[i18]).f107118b.f69122j;
                if (i19 < i17) {
                    i16 = iArr[i18];
                    i17 = i19;
                }
            }
            arrayList2.add(new C7251G(0, 0, i16));
        }
        return arrayList2;
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
        for (o oVar : this.f43988u) {
            oVar.discardBuffer(j11, z11);
        }
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, I i11) {
        for (o oVar : this.f43988u) {
            if (oVar.r()) {
                return oVar.getAdjustedSeekPositionUs(j11, i11);
            }
        }
        return j11;
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        return this.f43991x.getBufferedPositionUs();
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        return this.f43991x.getNextLoadPositionUs();
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        d0 d0Var = this.f43986s;
        d0Var.getClass();
        return d0Var;
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f43991x.isLoading();
    }

    public final void k() {
        this.f43969b.A(this);
        for (o oVar : this.f43987t) {
            oVar.A();
        }
        this.f43984q = null;
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() throws IOException {
        for (o oVar : this.f43987t) {
            oVar.maybeThrowPrepareError();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        if (r5[r0] != 1) goto L38;
     */
    @Override // F3.InterfaceC3017w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        boolean z11;
        List<g.a> list;
        HashSet hashSet;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        HashSet hashSet2;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        boolean z14;
        Uri[] uriArr;
        boolean z15;
        int i15;
        this.f43984q = aVar;
        C10978b c10978b = this.f43969b;
        c10978b.o(this);
        z3.g s11 = c10978b.s();
        s11.getClass();
        Map<String, C7270l> map = Collections.EMPTY_MAP;
        List<g.b> list2 = s11.f107105e;
        boolean isEmpty = list2.isEmpty();
        this.f43985r = 0;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        c cVar = this.f43968a;
        boolean z16 = this.f43980m;
        List<g.a> list3 = s11.f107107g;
        if (isEmpty) {
            z11 = z16;
            list = list3;
        } else {
            int size = list2.size();
            int[] iArr = new int[size];
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            while (i16 < list2.size()) {
                C7272n c7272n = list2.get(i16).f107118b;
                if (c7272n.f69135w <= 0) {
                    String str = c7272n.f69123k;
                    if (N.w(2, str) == null) {
                        i15 = 1;
                        if (N.w(1, str) != null) {
                            iArr[i16] = 1;
                            i18++;
                        } else {
                            iArr[i16] = -1;
                        }
                        i16 += i15;
                    }
                }
                i15 = 1;
                iArr[i16] = 2;
                i17++;
                i16 += i15;
            }
            if (i17 > 0) {
                z12 = false;
                i14 = i17;
                z14 = true;
                z13 = z16;
            } else if (i18 < size) {
                i14 = size - i18;
                z13 = z16;
                z12 = true;
                z14 = false;
            } else {
                z12 = false;
                i14 = size;
                z13 = z16;
                z14 = false;
            }
            Uri[] uriArr2 = new Uri[i14];
            C7272n[] c7272nArr = new C7272n[i14];
            int[] iArr2 = new int[i14];
            int i19 = 0;
            int i21 = 0;
            boolean z17 = z14;
            while (i19 < list2.size()) {
                if (z17) {
                    uriArr = uriArr2;
                    if (iArr[i19] != 2) {
                        z15 = true;
                        i19++;
                        uriArr2 = uriArr;
                    }
                } else {
                    uriArr = uriArr2;
                }
                if (z12) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                g.b bVar = list2.get(i19);
                uriArr[i21] = bVar.f107117a;
                c7272nArr[i21] = bVar.f107118b;
                iArr2[i21] = i19;
                i21++;
                i19++;
                uriArr2 = uriArr;
            }
            Uri[] uriArr3 = uriArr2;
            String str2 = c7272nArr[0].f69123k;
            int v11 = N.v(2, str2);
            int v12 = N.v(1, str2);
            boolean z18 = (v12 == 1 || (v12 == 0 && list3.isEmpty())) && v11 <= 1 && v12 + v11 > 0;
            int i22 = (z17 || v12 <= 0) ? 0 : 1;
            z11 = z13;
            list = list3;
            o i23 = i("main", i22, uriArr3, c7272nArr, s11.f107110j, s11.f107111k, map, j11);
            arrayList3.add(i23);
            arrayList4.add(iArr2);
            if (z11 && z18) {
                ArrayList arrayList5 = new ArrayList();
                C7272n c7272n2 = s11.f107110j;
                if (v11 > 0) {
                    C7272n[] c7272nArr2 = new C7272n[i14];
                    int i24 = 0;
                    while (i24 < i14) {
                        C7272n c7272n3 = c7272nArr[i24];
                        String w11 = N.w(2, c7272n3.f69123k);
                        String d11 = u.d(w11);
                        C7272n[] c7272nArr3 = c7272nArr;
                        C7272n.a aVar2 = new C7272n.a();
                        int i25 = i24;
                        aVar2.j0(c7272n3.f69113a);
                        aVar2.l0(c7272n3.f69114b);
                        aVar2.m0(c7272n3.f69115c);
                        aVar2.W(c7272n3.f69126n);
                        aVar2.y0(d11);
                        aVar2.U(w11);
                        aVar2.r0(c7272n3.f69124l);
                        aVar2.S(c7272n3.f69120h);
                        aVar2.t0(c7272n3.f69121i);
                        aVar2.F0(c7272n3.f69134v);
                        aVar2.h0(c7272n3.f69135w);
                        aVar2.f0(c7272n3.f69138z);
                        aVar2.A0(c7272n3.f69117e);
                        aVar2.w0(c7272n3.f69118f);
                        c7272nArr2[i25] = aVar2.P();
                        i24 = i25 + 1;
                        c7272nArr = c7272nArr3;
                    }
                    C7272n[] c7272nArr4 = c7272nArr;
                    arrayList5.add(new C7253I("main", c7272nArr2));
                    if (v12 > 0 && (c7272n2 != null || list.isEmpty())) {
                        arrayList5.add(new C7253I("main:audio", j(c7272nArr4[0], c7272n2, false)));
                    }
                    List<C7272n> list4 = s11.f107111k;
                    if (list4 != null) {
                        for (int i26 = 0; i26 < list4.size(); i26++) {
                            arrayList5.add(new C7253I(Ej.b.a(i26, "main:cc:"), cVar.d(list4.get(i26))));
                        }
                    }
                } else {
                    C7272n[] c7272nArr5 = new C7272n[i14];
                    for (int i27 = 0; i27 < i14; i27++) {
                        c7272nArr5[i27] = j(c7272nArr[i27], c7272n2, true);
                    }
                    arrayList5.add(new C7253I("main", c7272nArr5));
                }
                C7272n.a aVar3 = new C7272n.a();
                aVar3.j0("ID3");
                aVar3.y0("application/id3");
                C7253I c7253i = new C7253I("main:id3", aVar3.P());
                arrayList5.add(c7253i);
                i23.y((C7253I[]) arrayList5.toArray(new C7253I[0]), arrayList5.indexOf(c7253i));
            }
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        ArrayList arrayList7 = new ArrayList(list.size());
        ArrayList arrayList8 = new ArrayList(list.size());
        HashSet hashSet3 = new HashSet();
        int i28 = 0;
        while (i28 < list.size()) {
            List<g.a> list5 = list;
            String str3 = list5.get(i28).f107116c;
            if (hashSet3.add(str3)) {
                arrayList6.clear();
                arrayList7.clear();
                arrayList8.clear();
                int i29 = 0;
                boolean z19 = true;
                while (i29 < list5.size()) {
                    if (str3.equals(list5.get(i29).f107116c)) {
                        g.a aVar4 = list5.get(i29);
                        arrayList8.add(Integer.valueOf(i29));
                        arrayList6.add(aVar4.f107114a);
                        C7272n c7272n4 = aVar4.f107115b;
                        arrayList7.add(c7272n4);
                        i13 = 1;
                        z19 &= N.v(1, c7272n4.f69123k) == 1;
                    } else {
                        i13 = 1;
                    }
                    i29 += i13;
                }
                String concat = "audio:".concat(str3);
                int i31 = N.f74289a;
                list = list5;
                arrayList2 = arrayList8;
                i12 = i28;
                hashSet2 = hashSet3;
                o i32 = i(concat, 1, (Uri[]) arrayList6.toArray(new Uri[0]), (C7272n[]) arrayList7.toArray(new C7272n[0]), null, Collections.EMPTY_LIST, map, j11);
                arrayList4.add(com.google.common.primitives.b.f(arrayList2));
                arrayList3.add(i32);
                if (z11 && z19) {
                    i32.y(new C7253I[]{new C7253I(concat, (C7272n[]) arrayList7.toArray(new C7272n[0]))}, new int[0]);
                }
            } else {
                arrayList2 = arrayList8;
                hashSet2 = hashSet3;
                i12 = i28;
                list = list5;
            }
            i28 = i12 + 1;
            arrayList8 = arrayList2;
            hashSet3 = hashSet2;
        }
        this.f43990w = arrayList3.size();
        List<g.a> list6 = s11.f107108h;
        ArrayList arrayList9 = new ArrayList(list6.size());
        ArrayList arrayList10 = new ArrayList(list6.size());
        ArrayList arrayList11 = new ArrayList(list6.size());
        HashSet hashSet4 = new HashSet();
        int i33 = 0;
        while (i33 < list6.size()) {
            String str4 = list6.get(i33).f107116c;
            if (hashSet4.add(str4)) {
                arrayList9.clear();
                arrayList10.clear();
                arrayList11.clear();
                for (int i34 = 0; i34 < list6.size(); i34++) {
                    if (str4.equals(list6.get(i34).f107116c)) {
                        g.a aVar5 = list6.get(i34);
                        arrayList11.add(Integer.valueOf(i34));
                        arrayList9.add(aVar5.f107114a);
                        arrayList10.add(aVar5.f107115b);
                    }
                }
                String concat2 = "subtitle:".concat(str4);
                C7272n[] c7272nArr6 = (C7272n[]) arrayList10.toArray(new C7272n[0]);
                int i35 = N.f74289a;
                hashSet = hashSet4;
                i11 = i33;
                arrayList = arrayList11;
                o i36 = i(concat2, 3, (Uri[]) arrayList9.toArray(new Uri[0]), c7272nArr6, null, AbstractC5880y.v(), map, j11);
                arrayList4.add(com.google.common.primitives.b.f(arrayList));
                arrayList3.add(i36);
                int length = c7272nArr6.length;
                C7272n[] c7272nArr7 = new C7272n[length];
                for (int i37 = 0; i37 < length; i37++) {
                    c7272nArr7[i37] = cVar.d(c7272nArr6[i37]);
                }
                i36.y(new C7253I[]{new C7253I(concat2, c7272nArr7)}, new int[0]);
            } else {
                arrayList = arrayList11;
                hashSet = hashSet4;
                i11 = i33;
            }
            i33 = i11 + 1;
            arrayList11 = arrayList;
            hashSet4 = hashSet;
        }
        this.f43987t = (o[]) arrayList3.toArray(new o[0]);
        this.f43989v = (int[][]) arrayList4.toArray(new int[0][]);
        this.f43985r = this.f43987t.length;
        for (int i38 = 0; i38 < this.f43990w; i38++) {
            this.f43987t[i38].F(true);
        }
        for (o oVar : this.f43987t) {
            oVar.h();
        }
        this.f43988u = this.f43987t;
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        return -9223372036854775807L;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
        this.f43991x.reevaluateBuffer(j11);
    }

    @Override // F3.InterfaceC3017w
    public final long seekToUs(long j11) {
        o[] oVarArr = this.f43988u;
        if (oVarArr.length > 0) {
            boolean C11 = oVarArr[0].C(j11, false);
            int i11 = 1;
            while (true) {
                o[] oVarArr2 = this.f43988u;
                if (i11 >= oVarArr2.length) {
                    break;
                }
                oVarArr2[i11].C(j11, C11);
                i11++;
            }
            if (C11) {
                this.f43978k.b();
            }
        }
        return j11;
    }

    @Override // F3.InterfaceC3017w
    public final long selectTracks(y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        IdentityHashMap<U, Integer> identityHashMap;
        y[] yVarArr2 = yVarArr;
        int[] iArr = new int[yVarArr2.length];
        int[] iArr2 = new int[yVarArr2.length];
        int i11 = 0;
        while (true) {
            int length = yVarArr2.length;
            identityHashMap = this.f43977j;
            if (i11 >= length) {
                break;
            }
            U u11 = uArr[i11];
            iArr[i11] = u11 == null ? -1 : identityHashMap.get(u11).intValue();
            iArr2[i11] = -1;
            y yVar = yVarArr2[i11];
            if (yVar != null) {
                C7253I g10 = yVar.g();
                int i12 = 0;
                while (true) {
                    o[] oVarArr = this.f43987t;
                    if (i12 >= oVarArr.length) {
                        break;
                    }
                    if (oVarArr[i12].getTrackGroups().c(g10) != -1) {
                        iArr2[i11] = i12;
                        break;
                    }
                    i12++;
                }
            }
            i11++;
        }
        identityHashMap.clear();
        int length2 = yVarArr2.length;
        U[] uArr2 = new U[length2];
        U[] uArr3 = new U[yVarArr2.length];
        y[] yVarArr3 = new y[yVarArr2.length];
        o[] oVarArr2 = new o[this.f43987t.length];
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i13 < this.f43987t.length) {
            for (int i15 = 0; i15 < yVarArr2.length; i15++) {
                y yVar2 = null;
                uArr3[i15] = iArr[i15] == i13 ? uArr[i15] : null;
                if (iArr2[i15] == i13) {
                    yVar2 = yVarArr2[i15];
                }
                yVarArr3[i15] = yVar2;
            }
            o oVar = this.f43987t[i13];
            int[] iArr3 = iArr;
            int i16 = i13;
            int i17 = i14;
            boolean D11 = oVar.D(yVarArr3, zArr, uArr3, zArr2, j11, z11);
            int i18 = 0;
            boolean z12 = false;
            while (i18 < yVarArr2.length) {
                U u12 = uArr3[i18];
                if (iArr2[i18] == i16) {
                    u12.getClass();
                    uArr2[i18] = u12;
                    identityHashMap.put(u12, Integer.valueOf(i16));
                    z12 = true;
                } else if (iArr3[i18] == i16) {
                    G10.a.h(u12 == null);
                }
                i18++;
                yVarArr2 = yVarArr;
            }
            if (z12) {
                oVarArr2[i17] = oVar;
                i14 = i17 + 1;
                if (i17 == 0) {
                    oVar.F(true);
                    if (!D11) {
                        o[] oVarArr3 = this.f43988u;
                        if (oVarArr3.length != 0 && oVar == oVarArr3[0]) {
                        }
                    }
                    this.f43978k.b();
                    z11 = true;
                } else {
                    oVar.F(i16 < this.f43990w);
                }
            } else {
                i14 = i17;
            }
            i13 = i16 + 1;
            yVarArr2 = yVarArr;
            iArr = iArr3;
        }
        System.arraycopy(uArr2, 0, uArr, 0, length2);
        o[] oVarArr4 = (o[]) N.S(i14, oVarArr2);
        this.f43988u = oVarArr4;
        AbstractC5880y s11 = AbstractC5880y.s(oVarArr4);
        AbstractList a11 = G.a(s11, new h());
        this.f43979l.getClass();
        this.f43991x = new C3003h(s11, a11);
        return j11;
    }
}
