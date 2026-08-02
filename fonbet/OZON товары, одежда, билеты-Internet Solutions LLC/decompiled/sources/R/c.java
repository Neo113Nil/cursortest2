package R;

import B90.b0;
import C.Q;
import G.q;
import N.F;
import N.l;
import N.y;
import O.k;
import O.m;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.util.Log;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.A0;
import androidx.camera.core.impl.C5123v0;
import androidx.camera.core.impl.H;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.InterfaceC5100j0;
import androidx.camera.core.impl.InterfaceC5102k0;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.T;
import androidx.camera.core.impl.T0;
import androidx.camera.core.impl.b1;
import androidx.camera.core.impl.c1;
import androidx.camera.core.w;
import androidx.concurrent.futures.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes8.dex */
public final class c extends w {

    /* renamed from: A, reason: collision with root package name */
    O0.b f23852A;

    /* renamed from: B, reason: collision with root package name */
    private O0.c f23853B;

    /* renamed from: p, reason: collision with root package name */
    @NonNull
    private final e f23854p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    private final h f23855q;

    /* renamed from: r, reason: collision with root package name */
    @NonNull
    private final Q f23856r;

    /* renamed from: s, reason: collision with root package name */
    @NonNull
    private final Q f23857s;

    /* renamed from: t, reason: collision with root package name */
    private F f23858t;

    /* renamed from: u, reason: collision with root package name */
    private m f23859u;

    /* renamed from: v, reason: collision with root package name */
    private y f23860v;

    /* renamed from: w, reason: collision with root package name */
    private y f23861w;

    /* renamed from: x, reason: collision with root package name */
    private y f23862x;

    /* renamed from: y, reason: collision with root package name */
    private y f23863y;

    /* renamed from: z, reason: collision with root package name */
    O0.b f23864z;

    public c(@NonNull I i11, I i12, @NonNull Q q11, @NonNull Q q12, @NonNull HashSet hashSet, @NonNull c1 c1Var) {
        super(d0(hashSet));
        this.f23854p = d0(hashSet);
        this.f23856r = q11;
        this.f23857s = q12;
        this.f23855q = new h(i11, i12, hashSet, c1Var, new b0(this, 3));
    }

    public static void V(c cVar, String str, String str2, b1 b1Var, T0 t02, T0 t03) {
        if (cVar.f() == null) {
            return;
        }
        cVar.X();
        cVar.S(cVar.Y(str, str2, b1Var, t02, t03));
        cVar.D();
        h hVar = cVar.f23855q;
        hVar.getClass();
        q.a();
        Iterator it = hVar.f23873a.iterator();
        while (it.hasNext()) {
            hVar.m((w) it.next());
        }
    }

    public static com.google.common.util.concurrent.m W(c cVar, final int i11, final int i12) {
        F f7 = cVar.f23858t;
        if (f7 == null) {
            return I.k.f(new Exception("Failed to take picture: pipeline is not ready."));
        }
        final N.l lVar = (N.l) f7.d();
        return I.k.i(androidx.concurrent.futures.b.a(new b.c() { // from class: N.f
            @Override // androidx.concurrent.futures.b.c
            public final Object c(b.a aVar) {
                l.g(l.this, i11, i12, aVar);
                return "DefaultSurfaceProcessor#snapshot";
            }
        }));
    }

    private void X() {
        O0.c cVar = this.f23853B;
        if (cVar != null) {
            cVar.b();
            this.f23853B = null;
        }
        y yVar = this.f23860v;
        if (yVar != null) {
            yVar.g();
            this.f23860v = null;
        }
        y yVar2 = this.f23861w;
        if (yVar2 != null) {
            yVar2.g();
            this.f23861w = null;
        }
        y yVar3 = this.f23862x;
        if (yVar3 != null) {
            yVar3.g();
            this.f23862x = null;
        }
        y yVar4 = this.f23863y;
        if (yVar4 != null) {
            yVar4.g();
            this.f23863y = null;
        }
        F f7 = this.f23858t;
        if (f7 != null) {
            f7.e();
            this.f23858t = null;
        }
        m mVar = this.f23859u;
        if (mVar != null) {
            mVar.d();
            this.f23859u = null;
        }
    }

    @NonNull
    private List<O0> Y(@NonNull String str, String str2, @NonNull b1<?> b1Var, @NonNull T0 t02, T0 t03) {
        q.a();
        h hVar = this.f23855q;
        if (t03 == null) {
            Z(str, str2, b1Var, t02, null);
            I f7 = f();
            Objects.requireNonNull(f7);
            if (k() != null) {
                k().getClass();
            }
            this.f23858t = new F(f7, l.a.a(t02.b()));
            HashMap v11 = hVar.v(this.f23862x, v(), x() != null);
            F.c f11 = this.f23858t.f(F.b.c(this.f23862x, new ArrayList(v11.values())));
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : v11.entrySet()) {
                hashMap.put((w) entry.getKey(), f11.get(entry.getValue()));
            }
            hVar.B(hashMap);
            Object[] objArr = {this.f23864z.k()};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            return Collections.unmodifiableList(arrayList);
        }
        Z(str, str2, b1Var, t02, t03);
        Matrix s11 = s();
        I q11 = q();
        Objects.requireNonNull(q11);
        boolean p11 = q11.p();
        Size e11 = t03.e();
        Rect x11 = x() != null ? x() : new Rect(0, 0, e11.getWidth(), e11.getHeight());
        Objects.requireNonNull(x11);
        I q12 = q();
        Objects.requireNonNull(q12);
        int o11 = o(q12);
        I q13 = q();
        Objects.requireNonNull(q13);
        y yVar = new y(3, 34, t03, s11, p11, x11, o11, -1, z(q13));
        this.f23861w = yVar;
        Objects.requireNonNull(q());
        if (k() != null) {
            k().getClass();
            k().getClass();
            k().getClass();
            throw null;
        }
        this.f23863y = yVar;
        O0.b a02 = a0(this.f23861w, b1Var, t03);
        this.f23852A = a02;
        O0.c cVar = this.f23853B;
        if (cVar != null) {
            cVar.b();
        }
        O0.c cVar2 = new O0.c(new b(this, str, str2, b1Var, t02, t03));
        this.f23853B = cVar2;
        a02.p(cVar2);
        this.f23859u = new m(f(), q(), k.a.a(t02.b(), this.f23856r, this.f23857s));
        HashMap w11 = hVar.w(this.f23862x, this.f23863y, v(), x() != null);
        m.c e12 = this.f23859u.e(m.b.d(this.f23862x, this.f23863y, new ArrayList(w11.values())));
        HashMap hashMap2 = new HashMap();
        for (Map.Entry entry2 : w11.entrySet()) {
            hashMap2.put((w) entry2.getKey(), e12.get(entry2.getValue()));
        }
        hVar.B(hashMap2);
        Object[] objArr2 = {this.f23864z.k(), this.f23852A.k()};
        ArrayList arrayList2 = new ArrayList(2);
        for (int i11 = 0; i11 < 2; i11++) {
            Object obj2 = objArr2[i11];
            Objects.requireNonNull(obj2);
            arrayList2.add(obj2);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void Z(@NonNull String str, String str2, @NonNull b1<?> b1Var, @NonNull T0 t02, T0 t03) {
        Matrix s11 = s();
        I f7 = f();
        Objects.requireNonNull(f7);
        boolean p11 = f7.p();
        Size e11 = t02.e();
        Rect x11 = x() != null ? x() : new Rect(0, 0, e11.getWidth(), e11.getHeight());
        Objects.requireNonNull(x11);
        I f11 = f();
        Objects.requireNonNull(f11);
        int o11 = o(f11);
        I f12 = f();
        Objects.requireNonNull(f12);
        y yVar = new y(3, 34, t02, s11, p11, x11, o11, -1, z(f12));
        this.f23860v = yVar;
        Objects.requireNonNull(f());
        if (k() != null) {
            k().getClass();
            k().getClass();
            k().getClass();
            throw null;
        }
        this.f23862x = yVar;
        O0.b a02 = a0(this.f23860v, b1Var, t02);
        this.f23864z = a02;
        O0.c cVar = this.f23853B;
        if (cVar != null) {
            cVar.b();
        }
        O0.c cVar2 = new O0.c(new b(this, str, str2, b1Var, t02, t03));
        this.f23853B = cVar2;
        a02.p(cVar2);
    }

    @NonNull
    private O0.b a0(@NonNull y yVar, @NonNull b1<?> b1Var, @NonNull T0 t02) {
        O0.b m11 = O0.b.m(b1Var, t02.e());
        h hVar = this.f23855q;
        Iterator it = hVar.f23873a.iterator();
        int i11 = -1;
        while (it.hasNext()) {
            i11 = O0.e(i11, ((w) it.next()).i().z().p());
        }
        if (i11 != -1) {
            m11.v(i11);
        }
        Size e11 = t02.e();
        Iterator it2 = hVar.f23873a.iterator();
        while (it2.hasNext()) {
            O0 k11 = O0.b.m(((w) it2.next()).i(), e11).k();
            m11.b(k11.j());
            m11.a(k11.n());
            Iterator<CameraCaptureSession.StateCallback> it3 = k11.l().iterator();
            while (it3.hasNext()) {
                m11.h(it3.next());
            }
            Iterator<CameraDevice.StateCallback> it4 = k11.c().iterator();
            while (it4.hasNext()) {
                m11.d(it4.next());
            }
            m11.e(k11.f());
        }
        m11.i(yVar.l(), t02.b(), -1);
        m11.g(hVar.x());
        if (t02.d() != null) {
            m11.e(t02.d());
        }
        return m11;
    }

    @NonNull
    public static ArrayList b0(@NonNull w wVar) {
        ArrayList arrayList = new ArrayList();
        if (!(wVar instanceof c)) {
            arrayList.add(wVar.i().N());
            return arrayList;
        }
        Iterator it = ((c) wVar).f23855q.f23873a.iterator();
        while (it.hasNext()) {
            arrayList.add(((w) it.next()).i().N());
        }
        return arrayList;
    }

    private static e d0(HashSet hashSet) {
        C5123v0 c5123v0 = (C5123v0) new d(C5123v0.R()).a();
        c5123v0.U(InterfaceC5100j0.f38330j, 34);
        ArrayList arrayList = new ArrayList();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar.i().d(b1.f38264D)) {
                arrayList.add(wVar.i().N());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        c5123v0.U(e.f23866H, arrayList);
        c5123v0.U(InterfaceC5102k0.f38345o, 2);
        return new e(A0.Q(c5123v0));
    }

    @Override // androidx.camera.core.w
    public final void G() {
        this.f23855q.r();
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.camera.core.impl.b1, androidx.camera.core.impl.b1<?>] */
    @Override // androidx.camera.core.w
    @NonNull
    protected final b1<?> I(@NonNull H h11, @NonNull b1.a<?, ?, ?> aVar) {
        this.f23855q.A(aVar.a());
        return aVar.b();
    }

    @Override // androidx.camera.core.w
    public final void J() {
        Iterator it = this.f23855q.f23873a.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            wVar.J();
            wVar.H();
        }
    }

    @Override // androidx.camera.core.w
    public final void K() {
        Iterator it = this.f23855q.f23873a.iterator();
        while (it.hasNext()) {
            ((w) it.next()).K();
        }
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 L(@NonNull T t2) {
        this.f23864z.e(t2);
        Object[] objArr = {this.f23864z.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        S(Collections.unmodifiableList(arrayList));
        T0.a g10 = d().g();
        g10.d(t2);
        return g10.a();
    }

    @Override // androidx.camera.core.w
    @NonNull
    protected final T0 M(@NonNull T0 t02, T0 t03) {
        S(Y(h(), q() == null ? null : q().e().b(), i(), t02, t03));
        B();
        return t02;
    }

    @Override // androidx.camera.core.w
    public final void N() {
        X();
        this.f23855q.C();
    }

    @NonNull
    public final Set<w> c0() {
        return this.f23855q.f23873a;
    }

    @Override // androidx.camera.core.w
    public final b1<?> j(boolean z11, @NonNull c1 c1Var) {
        e eVar = this.f23854p;
        T a11 = c1Var.a(eVar.N(), 1);
        if (z11) {
            a11 = T.O(a11, eVar.s());
        }
        if (a11 == null) {
            return null;
        }
        return ((d) w(a11)).b();
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final Set<Integer> u() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    @Override // androidx.camera.core.w
    @NonNull
    public final b1.a<?, ?, ?> w(@NonNull T t2) {
        return new d(C5123v0.S(t2));
    }
}
