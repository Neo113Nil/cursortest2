package J;

import C.AbstractC2690j;
import C.I;
import C.InterfaceC2688h;
import C.InterfaceC2689i;
import C.InterfaceC2694n;
import C.Q;
import C.S;
import C.Y;
import G.r;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.AbstractC5081a;
import androidx.camera.core.impl.AbstractC5094g0;
import androidx.camera.core.impl.C5098i0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.D0;
import androidx.camera.core.impl.E;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.L0;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.w;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.collections.K;
import v.B0;

/* loaded from: classes8.dex */
public final class f implements InterfaceC2688h {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    private final I f12614a;

    /* renamed from: b, reason: collision with root package name */
    private final I f12615b;

    /* renamed from: c, reason: collision with root package name */
    private final F f12616c;

    /* renamed from: d, reason: collision with root package name */
    private final c1 f12617d;

    /* renamed from: e, reason: collision with root package name */
    private final b f12618e;

    /* renamed from: h, reason: collision with root package name */
    private final D.a f12621h;

    /* renamed from: j, reason: collision with root package name */
    @NonNull
    private final A f12623j;

    /* renamed from: n, reason: collision with root package name */
    private w f12627n;

    /* renamed from: o, reason: collision with root package name */
    private R.c f12628o;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    private final L0 f12629p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private final M0 f12630q;

    /* renamed from: r, reason: collision with root package name */
    private final M0 f12631r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    private final Q f12632s;

    /* renamed from: t, reason: collision with root package name */
    @NonNull
    private final Q f12633t;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList f12619f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f12620g = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private List<AbstractC2690j> f12622i = Collections.EMPTY_LIST;

    /* renamed from: k, reason: collision with root package name */
    private final Object f12624k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private boolean f12625l = true;

    /* renamed from: m, reason: collision with root package name */
    private T f12626m = null;

    public static final class a extends Exception {
    }

    public static abstract class b {
        @NonNull
        public static b a(@NonNull String str, @NonNull AbstractC5094g0 abstractC5094g0) {
            return new J.a(str, abstractC5094g0);
        }

        @NonNull
        public abstract AbstractC5094g0 b();

        @NonNull
        public abstract String c();
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        b1<?> f12634a;

        /* renamed from: b, reason: collision with root package name */
        b1<?> f12635b;

        c() {
            throw null;
        }
    }

    public f(@NonNull I i11, I i12, @NonNull M0 m02, M0 m03, @NonNull Q q11, @NonNull Q q12, @NonNull D.a aVar, @NonNull F f7, @NonNull c1 c1Var) {
        this.f12614a = i11;
        this.f12615b = i12;
        this.f12632s = q11;
        this.f12633t = q12;
        this.f12621h = aVar;
        this.f12616c = f7;
        this.f12617d = c1Var;
        A r11 = m02.r();
        this.f12623j = r11;
        this.f12629p = new L0(i11.k(), r11.H());
        this.f12630q = m02;
        this.f12631r = m03;
        this.f12618e = v(m02, m03);
    }

    @NonNull
    private HashSet A(@NonNull LinkedHashSet linkedHashSet, boolean z11) {
        int i11;
        HashSet hashSet = new HashSet();
        synchronized (this.f12624k) {
            try {
                Iterator<AbstractC2690j> it = this.f12622i.iterator();
                while (it.hasNext()) {
                    it.next().getClass();
                }
                i11 = z11 ? 3 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            w wVar = (w) it2.next();
            x2.i.a("Only support one level of sharing for now.", !(wVar instanceof R.c));
            if (wVar.y(i11)) {
                hashSet.add(wVar);
            }
        }
        return hashSet;
    }

    private boolean C() {
        boolean z11;
        synchronized (this.f12624k) {
            z11 = this.f12623j.H() != null;
        }
        return z11;
    }

    private static boolean D(T0 t02, O0 o02) {
        T d11 = t02.d();
        T f7 = o02.f();
        if (d11.g().size() != ((A0) o02.f()).g().size()) {
            return true;
        }
        for (T.a<?> aVar : d11.g()) {
            A0 a02 = (A0) f7;
            if (!a02.d(aVar) || !Objects.equals(a02.a(aVar), d11.a(aVar))) {
                return true;
            }
        }
        return false;
    }

    private static boolean E(@NonNull LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof C.I) {
                b1<?> i11 = wVar.i();
                T.a<?> aVar = C5098i0.f38317L;
                if (i11.d(aVar)) {
                    Integer num = (Integer) i11.a(aVar);
                    num.getClass();
                    if (num.intValue() == 1) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    private static boolean F(@NonNull AbstractCollection abstractCollection) {
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar != null) {
                if (!wVar.i().d(b1.f38264D)) {
                    Log.e("CameraUseCaseAdapter", wVar + " UseCase does not have capture type.");
                } else if (wVar.i().N() == c1.b.VIDEO_CAPTURE) {
                    return true;
                }
            }
        }
        return false;
    }

    @NonNull
    private static ArrayList I(@NonNull ArrayList arrayList, @NonNull List list) {
        ArrayList arrayList2 = new ArrayList(list);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.O(null);
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                AbstractC2690j abstractC2690j = (AbstractC2690j) it2.next();
                abstractC2690j.getClass();
                if (wVar.y(0)) {
                    x2.i.f(wVar + " already has effect" + wVar.k(), wVar.k() == null);
                    wVar.O(abstractC2690j);
                    arrayList2.remove(abstractC2690j);
                }
            }
        }
        return arrayList2;
    }

    private void L(@NonNull HashMap hashMap, @NonNull ArrayList arrayList) {
        synchronized (this.f12624k) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    w wVar = (w) it.next();
                    Rect k11 = this.f12614a.k().k();
                    T0 t02 = (T0) hashMap.get(wVar);
                    t02.getClass();
                    wVar.P(q(k11, t02.e()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private w m(@NonNull LinkedHashSet linkedHashSet, R.c cVar) {
        boolean z11;
        boolean z12;
        w wVar;
        synchronized (this.f12624k) {
            try {
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (cVar != null) {
                    arrayList.add(cVar);
                    arrayList.removeAll(cVar.c0());
                }
                synchronized (this.f12624k) {
                    z11 = false;
                    z12 = ((Integer) this.f12623j.c(A.f38103f, 0)).intValue() == 1;
                }
                if (z12) {
                    Iterator it = arrayList.iterator();
                    boolean z13 = false;
                    boolean z14 = false;
                    while (it.hasNext()) {
                        w wVar2 = (w) it.next();
                        if (!(wVar2 instanceof Y) && !(wVar2 instanceof R.c)) {
                            if (wVar2 instanceof C.I) {
                                z13 = true;
                            }
                        }
                        z14 = true;
                    }
                    if (!z13 || z14) {
                        Iterator it2 = arrayList.iterator();
                        boolean z15 = false;
                        while (it2.hasNext()) {
                            w wVar3 = (w) it2.next();
                            if (!(wVar3 instanceof Y) && !(wVar3 instanceof R.c)) {
                                if (wVar3 instanceof C.I) {
                                    z15 = true;
                                }
                            }
                            z11 = true;
                        }
                        if (z11 && !z15) {
                            w wVar4 = this.f12627n;
                            if (wVar4 instanceof C.I) {
                                wVar = wVar4;
                            } else {
                                I.b bVar = new I.b();
                                bVar.n("ImageCapture-Extra");
                                wVar = bVar.c();
                            }
                        }
                    } else {
                        w wVar5 = this.f12627n;
                        if (!(wVar5 instanceof Y)) {
                            Y.a aVar = new Y.a();
                            aVar.j("Preview-Extra");
                            Y c11 = aVar.c();
                            c11.X(new d());
                            wVar = c11;
                        }
                    }
                }
                wVar = null;
            } finally {
            }
        }
        return wVar;
    }

    @NonNull
    private static Matrix q(@NonNull Rect rect, @NonNull Size size) {
        x2.i.a("Cannot compute viewport crop rects zero sized sensor rect.", rect.width() > 0 && rect.height() > 0);
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private HashMap r(int i11, @NonNull H h11, @NonNull ArrayList arrayList, @NonNull ArrayList arrayList2, @NonNull HashMap hashMap) {
        F f7;
        Rect rect;
        ArrayList arrayList3 = new ArrayList();
        String b11 = h11.b();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = arrayList2.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            f7 = this.f12616c;
            if (!hasNext) {
                break;
            }
            w wVar = (w) it.next();
            V0 b12 = ((B0) f7).b(i11, b11, wVar.l(), wVar.e());
            int l11 = wVar.l();
            Size e11 = wVar.e();
            T0 d11 = wVar.d();
            d11.getClass();
            AbstractC5081a a11 = AbstractC5081a.a(b12, l11, e11, d11.b(), R.c.b0(wVar), wVar.d().d(), wVar.i().I(null));
            arrayList3.add(a11);
            hashMap3.put(a11, wVar);
            hashMap2.put(wVar, wVar.d());
        }
        if (!arrayList.isEmpty()) {
            HashMap hashMap4 = new HashMap();
            HashMap hashMap5 = new HashMap();
            try {
                rect = this.f12614a.k().k();
            } catch (NullPointerException unused) {
                rect = null;
            }
            k kVar = new k(h11, rect != null ? r.e(rect) : null);
            Iterator it2 = arrayList.iterator();
            boolean z11 = false;
            while (it2.hasNext()) {
                w wVar2 = (w) it2.next();
                c cVar = (c) hashMap.get(wVar2);
                b1<?> A11 = wVar2.A(h11, cVar.f12634a, cVar.f12635b);
                hashMap4.put(A11, wVar2);
                hashMap5.put(A11, kVar.b(A11));
                if (wVar2.i() instanceof D0) {
                    z11 = ((D0) wVar2.i()).p() == 2;
                }
            }
            Pair a12 = ((B0) f7).a(i11, b11, arrayList3, hashMap5, z11, F(arrayList));
            for (Map.Entry entry : hashMap4.entrySet()) {
                hashMap2.put((w) entry.getValue(), (T0) ((Map) a12.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) a12.second).entrySet()) {
                if (hashMap3.containsKey(entry2.getKey())) {
                    hashMap2.put((w) hashMap3.get(entry2.getKey()), (T0) entry2.getValue());
                }
            }
        }
        return hashMap2;
    }

    private void s(@NonNull LinkedHashSet linkedHashSet) throws IllegalArgumentException {
        if (C()) {
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                C.A u11 = ((w) it.next()).i().u();
                boolean z11 = false;
                boolean z12 = u11.a() == 10;
                if (u11.b() != 1 && u11.b() != 0) {
                    z11 = true;
                }
                if (z12 || z11) {
                    throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
                }
            }
            if (E(linkedHashSet)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f12624k) {
            try {
                if (!this.f12622i.isEmpty() && E(linkedHashSet)) {
                    throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    private R.c t(@NonNull LinkedHashSet linkedHashSet, boolean z11) {
        synchronized (this.f12624k) {
            try {
                HashSet A11 = A(linkedHashSet, z11);
                if (A11.size() < 2 && (!C() || !F(A11))) {
                    return null;
                }
                R.c cVar = this.f12628o;
                if (cVar != null && cVar.c0().equals(A11)) {
                    R.c cVar2 = this.f12628o;
                    Objects.requireNonNull(cVar2);
                    return cVar2;
                }
                int[] iArr = {1, 2, 4};
                HashSet hashSet = new HashSet();
                Iterator it = A11.iterator();
                while (it.hasNext()) {
                    w wVar = (w) it.next();
                    for (int i11 = 0; i11 < 3; i11++) {
                        int i12 = iArr[i11];
                        if (wVar.y(i12)) {
                            if (hashSet.contains(Integer.valueOf(i12))) {
                                return null;
                            }
                            hashSet.add(Integer.valueOf(i12));
                        }
                    }
                }
                return new R.c(this.f12614a, this.f12615b, this.f12632s, this.f12633t, A11, this.f12617d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public static b v(@NonNull M0 m02, M0 m03) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m02.b());
        sb2.append(m03 == null ? "" : m03.b());
        return new J.a(sb2.toString(), m02.r().B());
    }

    private int x() {
        synchronized (this.f12624k) {
            try {
                return ((A.a) this.f12621h).b() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static HashMap y(@NonNull ArrayList arrayList, @NonNull c1 c1Var, @NonNull c1 c1Var2) {
        b1<?> j11;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof R.c) {
                R.c cVar = (R.c) wVar;
                b1<?> j12 = new Y.a().c().j(false, c1Var);
                if (j12 == null) {
                    j11 = null;
                } else {
                    C5123v0 S11 = C5123v0.S(j12);
                    S11.V(m.f12652c);
                    j11 = cVar.w(S11).b();
                }
            } else {
                j11 = wVar.j(false, c1Var);
            }
            b1<?> j13 = wVar.j(true, c1Var2);
            c cVar2 = new c();
            cVar2.f12634a = j11;
            cVar2.f12635b = j13;
            hashMap.put(wVar, cVar2);
        }
        return hashMap;
    }

    @NonNull
    public final List<w> B() {
        ArrayList arrayList;
        synchronized (this.f12624k) {
            arrayList = new ArrayList(this.f12619f);
        }
        return arrayList;
    }

    public final void G(@NonNull ArrayList arrayList) {
        synchronized (this.f12624k) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f12619f);
            linkedHashSet.removeAll(arrayList);
            K(linkedHashSet, this.f12615b != null);
        }
    }

    public final void H(K k11) {
        synchronized (this.f12624k) {
            this.f12622i = k11;
        }
    }

    public final void J() {
        synchronized (this.f12624k) {
        }
    }

    final void K(@NonNull LinkedHashSet linkedHashSet, boolean z11) {
        T0 t02;
        T d11;
        synchronized (this.f12624k) {
            try {
                s(linkedHashSet);
                if (!z11 && C() && F(linkedHashSet)) {
                    K(linkedHashSet, true);
                    return;
                }
                R.c t2 = t(linkedHashSet, z11);
                w m11 = m(linkedHashSet, t2);
                ArrayList arrayList = new ArrayList(linkedHashSet);
                if (m11 != null) {
                    arrayList.add(m11);
                }
                if (t2 != null) {
                    arrayList.add(t2);
                    arrayList.removeAll(t2.c0());
                }
                ArrayList arrayList2 = new ArrayList(arrayList);
                arrayList2.removeAll(this.f12620g);
                ArrayList arrayList3 = new ArrayList(arrayList);
                arrayList3.retainAll(this.f12620g);
                ArrayList arrayList4 = new ArrayList(this.f12620g);
                arrayList4.removeAll(arrayList);
                HashMap y11 = y(arrayList2, (c1) this.f12623j.c(A.f38102e, c1.f38274a), this.f12617d);
                Map map = Collections.EMPTY_MAP;
                try {
                    HashMap r11 = r(x(), this.f12614a.e(), arrayList2, arrayList3, y11);
                    if (this.f12615b != null) {
                        int x11 = x();
                        androidx.camera.core.impl.I i11 = this.f12615b;
                        Objects.requireNonNull(i11);
                        map = r(x11, i11.e(), arrayList2, arrayList3, y11);
                    }
                    L(r11, arrayList);
                    ArrayList I11 = I(arrayList, this.f12622i);
                    ArrayList arrayList5 = new ArrayList(linkedHashSet);
                    arrayList5.removeAll(arrayList);
                    ArrayList I12 = I(arrayList5, I11);
                    if (I12.size() > 0) {
                        S.k("CameraUseCaseAdapter", "Unused effects: " + I12);
                    }
                    Iterator it = arrayList4.iterator();
                    while (it.hasNext()) {
                        ((w) it.next()).R(this.f12614a);
                    }
                    this.f12614a.h(arrayList4);
                    if (this.f12615b != null) {
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            w wVar = (w) it2.next();
                            androidx.camera.core.impl.I i12 = this.f12615b;
                            Objects.requireNonNull(i12);
                            wVar.R(i12);
                        }
                        androidx.camera.core.impl.I i13 = this.f12615b;
                        Objects.requireNonNull(i13);
                        i13.h(arrayList4);
                    }
                    if (arrayList4.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            w wVar2 = (w) it3.next();
                            if (r11.containsKey(wVar2) && (d11 = (t02 = (T0) r11.get(wVar2)).d()) != null && D(t02, wVar2.t())) {
                                wVar2.U(d11);
                                if (this.f12625l) {
                                    this.f12614a.d(wVar2);
                                    androidx.camera.core.impl.I i14 = this.f12615b;
                                    if (i14 != null) {
                                        i14.d(wVar2);
                                    }
                                }
                            }
                        }
                    }
                    Iterator it4 = arrayList2.iterator();
                    while (it4.hasNext()) {
                        w wVar3 = (w) it4.next();
                        c cVar = (c) y11.get(wVar3);
                        Objects.requireNonNull(cVar);
                        androidx.camera.core.impl.I i15 = this.f12615b;
                        if (i15 != null) {
                            wVar3.a(this.f12614a, i15, cVar.f12634a, cVar.f12635b);
                            T0 t03 = (T0) r11.get(wVar3);
                            t03.getClass();
                            wVar3.T(t03, (T0) map.get(wVar3));
                        } else {
                            wVar3.a(this.f12614a, null, cVar.f12634a, cVar.f12635b);
                            T0 t04 = (T0) r11.get(wVar3);
                            t04.getClass();
                            wVar3.T(t04, null);
                        }
                    }
                    if (this.f12625l) {
                        this.f12614a.o(arrayList2);
                        androidx.camera.core.impl.I i16 = this.f12615b;
                        if (i16 != null) {
                            i16.o(arrayList2);
                        }
                    }
                    Iterator it5 = arrayList2.iterator();
                    while (it5.hasNext()) {
                        ((w) it5.next()).E();
                    }
                    this.f12619f.clear();
                    this.f12619f.addAll(linkedHashSet);
                    this.f12620g.clear();
                    this.f12620g.addAll(arrayList);
                    this.f12627n = m11;
                    this.f12628o = t2;
                } catch (IllegalArgumentException e11) {
                    if (z11 || C() || ((A.a) this.f12621h).b() == 2) {
                        throw e11;
                    }
                    K(linkedHashSet, true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // C.InterfaceC2688h
    @NonNull
    public final InterfaceC2689i a() {
        return this.f12629p;
    }

    @Override // C.InterfaceC2688h
    @NonNull
    public final InterfaceC2694n b() {
        return this.f12630q;
    }

    public final void d(@NonNull Collection<w> collection) throws a {
        synchronized (this.f12624k) {
            try {
                this.f12614a.g(this.f12623j);
                androidx.camera.core.impl.I i11 = this.f12615b;
                if (i11 != null) {
                    i11.g(this.f12623j);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f12619f);
                linkedHashSet.addAll(collection);
                try {
                    K(linkedHashSet, this.f12615b != null);
                } catch (IllegalArgumentException e11) {
                    throw new a(e11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void j() {
        synchronized (this.f12624k) {
            try {
                if (!this.f12625l) {
                    if (!this.f12620g.isEmpty()) {
                        this.f12614a.g(this.f12623j);
                        androidx.camera.core.impl.I i11 = this.f12615b;
                        if (i11 != null) {
                            i11.g(this.f12623j);
                        }
                    }
                    this.f12614a.o(this.f12620g);
                    androidx.camera.core.impl.I i12 = this.f12615b;
                    if (i12 != null) {
                        i12.o(this.f12620g);
                    }
                    synchronized (this.f12624k) {
                        try {
                            if (this.f12626m != null) {
                                this.f12614a.k().i(this.f12626m);
                            }
                        } finally {
                        }
                    }
                    Iterator it = this.f12620g.iterator();
                    while (it.hasNext()) {
                        ((w) it.next()).E();
                    }
                    this.f12625l = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void n(boolean z11) {
        this.f12614a.n(z11);
    }

    public final void u() {
        synchronized (this.f12624k) {
            try {
                if (this.f12625l) {
                    this.f12614a.h(new ArrayList(this.f12620g));
                    androidx.camera.core.impl.I i11 = this.f12615b;
                    if (i11 != null) {
                        i11.h(new ArrayList(this.f12620g));
                    }
                    synchronized (this.f12624k) {
                        E k11 = this.f12614a.k();
                        this.f12626m = k11.l();
                        k11.o();
                    }
                    this.f12625l = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final b w() {
        return this.f12618e;
    }

    public final M0 z() {
        return this.f12631r;
    }
}
