package androidx.camera.core.impl;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.params.InputConfiguration;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.C5101k;
import androidx.camera.core.impl.O0;
import androidx.camera.core.impl.Q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class O0 {

    /* renamed from: j, reason: collision with root package name */
    private static final List<Integer> f38151j = Arrays.asList(1, 5, 3);

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f38152a;

    /* renamed from: b, reason: collision with root package name */
    private final f f38153b;

    /* renamed from: c, reason: collision with root package name */
    private final List<CameraDevice.StateCallback> f38154c;

    /* renamed from: d, reason: collision with root package name */
    private final List<CameraCaptureSession.StateCallback> f38155d;

    /* renamed from: e, reason: collision with root package name */
    private final List<AbstractC5111p> f38156e;

    /* renamed from: f, reason: collision with root package name */
    private final d f38157f;

    /* renamed from: g, reason: collision with root package name */
    private final Q f38158g;

    /* renamed from: h, reason: collision with root package name */
    private final int f38159h;

    /* renamed from: i, reason: collision with root package name */
    private InputConfiguration f38160i;

    static class a {

        /* renamed from: f, reason: collision with root package name */
        c f38166f;

        /* renamed from: g, reason: collision with root package name */
        InputConfiguration f38167g;

        /* renamed from: i, reason: collision with root package name */
        f f38169i;

        /* renamed from: a, reason: collision with root package name */
        final LinkedHashSet f38161a = new LinkedHashSet();

        /* renamed from: b, reason: collision with root package name */
        final Q.a f38162b = new Q.a();

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f38163c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        final ArrayList f38164d = new ArrayList();

        /* renamed from: e, reason: collision with root package name */
        final ArrayList f38165e = new ArrayList();

        /* renamed from: h, reason: collision with root package name */
        int f38168h = 0;

        a() {
        }
    }

    public static class b extends a {
        @NonNull
        public static b m(@NonNull b1<?> b1Var, @NonNull Size size) {
            e M11 = b1Var.M();
            if (M11 != null) {
                b bVar = new b();
                M11.a(size, b1Var, bVar);
                return bVar;
            }
            throw new IllegalStateException("Implementation is missing option unpacker for " + b1Var.l(b1Var.toString()));
        }

        @NonNull
        public final void a(@NonNull List list) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AbstractC5111p abstractC5111p = (AbstractC5111p) it.next();
                this.f38162b.c(abstractC5111p);
                ArrayList arrayList = this.f38165e;
                if (!arrayList.contains(abstractC5111p)) {
                    arrayList.add(abstractC5111p);
                }
            }
        }

        @NonNull
        public final void b(@NonNull List list) {
            this.f38162b.a(list);
        }

        @NonNull
        public final void c(@NonNull AbstractC5111p abstractC5111p) {
            this.f38162b.c(abstractC5111p);
            ArrayList arrayList = this.f38165e;
            if (arrayList.contains(abstractC5111p)) {
                return;
            }
            arrayList.add(abstractC5111p);
        }

        @NonNull
        public final void d(@NonNull CameraDevice.StateCallback stateCallback) {
            ArrayList arrayList = this.f38163c;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        @NonNull
        public final void e(@NonNull T t2) {
            this.f38162b.e(t2);
        }

        @NonNull
        public final void f(@NonNull W w11, @NonNull C.A a11) {
            f.a a12 = f.a(w11);
            a12.b(a11);
            this.f38161a.add(a12.a());
        }

        @NonNull
        public final void g(@NonNull AbstractC5111p abstractC5111p) {
            this.f38162b.c(abstractC5111p);
        }

        @NonNull
        public final void h(@NonNull CameraCaptureSession.StateCallback stateCallback) {
            ArrayList arrayList = this.f38164d;
            if (arrayList.contains(stateCallback)) {
                return;
            }
            arrayList.add(stateCallback);
        }

        @NonNull
        public final void i(@NonNull W w11, @NonNull C.A a11, int i11) {
            f.a a12 = f.a(w11);
            a12.b(a11);
            a12.c(i11);
            this.f38161a.add(a12.a());
            this.f38162b.f(w11);
        }

        @NonNull
        public final void j(@NonNull Object obj, @NonNull String str) {
            this.f38162b.g(obj, str);
        }

        @NonNull
        public final O0 k() {
            return new O0(new ArrayList(this.f38161a), new ArrayList(this.f38163c), new ArrayList(this.f38164d), new ArrayList(this.f38165e), this.f38162b.h(), this.f38166f, this.f38167g, this.f38168h, this.f38169i);
        }

        @NonNull
        public final void l() {
            this.f38161a.clear();
            this.f38162b.i();
        }

        @NonNull
        public final List<AbstractC5111p> n() {
            return Collections.unmodifiableList(this.f38165e);
        }

        public final void o(@NonNull AbstractC5111p abstractC5111p) {
            this.f38162b.n(abstractC5111p);
            this.f38165e.remove(abstractC5111p);
        }

        @NonNull
        public final void p(@NonNull c cVar) {
            this.f38166f = cVar;
        }

        @NonNull
        public final void q(@NonNull Range range) {
            Q.a aVar = this.f38162b;
            aVar.getClass();
            aVar.d(Q.f38179k, range);
        }

        @NonNull
        public final void r(@NonNull T t2) {
            this.f38162b.q(t2);
        }

        @NonNull
        public final void s(InputConfiguration inputConfiguration) {
            this.f38167g = inputConfiguration;
        }

        @NonNull
        public final void t(@NonNull W w11) {
            this.f38169i = f.a(w11).a();
        }

        @NonNull
        public final void u(int i11) {
            if (i11 != 0) {
                Q.a aVar = this.f38162b;
                aVar.getClass();
                if (i11 != 0) {
                    aVar.d(b1.f38265E, Integer.valueOf(i11));
                }
            }
        }

        @NonNull
        public final void v(int i11) {
            this.f38162b.s(i11);
        }

        @NonNull
        public final void w(int i11) {
            if (i11 != 0) {
                Q.a aVar = this.f38162b;
                aVar.getClass();
                if (i11 != 0) {
                    aVar.d(b1.f38266F, Integer.valueOf(i11));
                }
            }
        }
    }

    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f38170a = new AtomicBoolean(false);

        /* renamed from: b, reason: collision with root package name */
        private final d f38171b;

        public c(@NonNull d dVar) {
            this.f38171b = dVar;
        }

        @Override // androidx.camera.core.impl.O0.d
        public final void a(@NonNull O0 o02, @NonNull g gVar) {
            if (this.f38170a.get()) {
                return;
            }
            this.f38171b.a(o02, gVar);
        }

        public final void b() {
            this.f38170a.set(true);
        }
    }

    public interface d {
        void a(@NonNull O0 o02, @NonNull g gVar);
    }

    public interface e {
        void a(@NonNull Size size, @NonNull b1<?> b1Var, @NonNull b bVar);
    }

    public static abstract class f {

        public static abstract class a {
            @NonNull
            public abstract f a();

            @NonNull
            public abstract a b(@NonNull C.A a11);

            @NonNull
            public abstract a c(int i11);
        }

        @NonNull
        public static a a(@NonNull W w11) {
            C5101k.a aVar = new C5101k.a();
            aVar.e(w11);
            List list = Collections.EMPTY_LIST;
            aVar.d();
            aVar.c(-1);
            aVar.f();
            aVar.b(C.A.f4076d);
            return aVar;
        }

        @NonNull
        public abstract C.A b();

        public abstract int c();

        public abstract String d();

        @NonNull
        public abstract List<W> e();

        @NonNull
        public abstract W f();

        public abstract int g();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class g {
        private static final /* synthetic */ g[] $VALUES;
        public static final g SESSION_ERROR_SURFACE_NEEDS_RESET;
        public static final g SESSION_ERROR_UNKNOWN;

        static {
            g gVar = new g("SESSION_ERROR_SURFACE_NEEDS_RESET", 0);
            SESSION_ERROR_SURFACE_NEEDS_RESET = gVar;
            g gVar2 = new g("SESSION_ERROR_UNKNOWN", 1);
            SESSION_ERROR_UNKNOWN = gVar2;
            $VALUES = new g[]{gVar, gVar2};
        }

        private g() {
            throw null;
        }

        public static g valueOf(String str) {
            return (g) Enum.valueOf(g.class, str);
        }

        public static g[] values() {
            return (g[]) $VALUES.clone();
        }
    }

    public static final class h extends a {

        /* renamed from: j, reason: collision with root package name */
        private final L.e f38172j = new L.e();

        /* renamed from: k, reason: collision with root package name */
        private boolean f38173k = true;

        /* renamed from: l, reason: collision with root package name */
        private boolean f38174l = false;

        /* renamed from: m, reason: collision with root package name */
        private ArrayList f38175m = new ArrayList();

        public static /* synthetic */ void a(h hVar, O0 o02, g gVar) {
            Iterator it = hVar.f38175m.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(o02, gVar);
            }
        }

        public final void b(@NonNull O0 o02) {
            Q k11 = o02.k();
            int i11 = k11.f38182c;
            Q.a aVar = this.f38162b;
            if (i11 != -1) {
                this.f38174l = true;
                aVar.s(O0.e(i11, aVar.m()));
            }
            Range<Integer> d11 = k11.d();
            Range<Integer> range = T0.f38211a;
            if (!d11.equals(range)) {
                if (aVar.k().equals(range)) {
                    aVar.d(Q.f38179k, d11);
                } else if (!aVar.k().equals(d11)) {
                    this.f38173k = false;
                    C.S.a("ValidatingBuilder", "Different ExpectedFrameRateRange values");
                }
            }
            int g10 = k11.g();
            if (g10 != 0) {
                aVar.getClass();
                if (g10 != 0) {
                    aVar.d(b1.f38265E, Integer.valueOf(g10));
                }
            }
            int k12 = k11.k();
            if (k12 != 0) {
                aVar.getClass();
                if (k12 != 0) {
                    aVar.d(b1.f38266F, Integer.valueOf(k12));
                }
            }
            aVar.b(o02.k().i());
            this.f38163c.addAll(o02.c());
            this.f38164d.addAll(o02.l());
            aVar.a(o02.j());
            this.f38165e.addAll(o02.n());
            if (o02.d() != null) {
                this.f38175m.add(o02.d());
            }
            if (o02.g() != null) {
                this.f38167g = o02.g();
            }
            LinkedHashSet<f> linkedHashSet = this.f38161a;
            linkedHashSet.addAll(o02.h());
            aVar.l().addAll(Collections.unmodifiableList(k11.f38180a));
            ArrayList arrayList = new ArrayList();
            for (f fVar : linkedHashSet) {
                arrayList.add(fVar.f());
                Iterator<W> it = fVar.e().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
            if (!arrayList.containsAll(aVar.l())) {
                C.S.a("ValidatingBuilder", "Invalid configuration due to capture request surfaces are not a subset of surfaces");
                this.f38173k = false;
            }
            if (o02.m() != this.f38168h && o02.m() != 0 && this.f38168h != 0) {
                C.S.a("ValidatingBuilder", "Invalid configuration due to that two non-default session types are set");
                this.f38173k = false;
            } else if (o02.m() != 0) {
                this.f38168h = o02.m();
            }
            if (o02.f38153b != null) {
                if (this.f38169i == o02.f38153b || this.f38169i == null) {
                    this.f38169i = o02.f38153b;
                } else {
                    C.S.a("ValidatingBuilder", "Invalid configuration due to that two different postview output configs are set");
                    this.f38173k = false;
                }
            }
            aVar.e(k11.f38181b);
        }

        @NonNull
        public final O0 c() {
            if (!this.f38173k) {
                throw new IllegalArgumentException("Unsupported session configuration combination");
            }
            ArrayList arrayList = new ArrayList(this.f38161a);
            this.f38172j.a(arrayList);
            return new O0(arrayList, new ArrayList(this.f38163c), new ArrayList(this.f38164d), new ArrayList(this.f38165e), this.f38162b.h(), !this.f38175m.isEmpty() ? new d() { // from class: androidx.camera.core.impl.P0
                @Override // androidx.camera.core.impl.O0.d
                public final void a(O0 o02, O0.g gVar) {
                    O0.h.a(O0.h.this, o02, gVar);
                }
            } : null, this.f38167g, this.f38168h, this.f38169i);
        }

        public final void d() {
            this.f38161a.clear();
            this.f38162b.i();
        }

        public final boolean e() {
            return this.f38174l && this.f38173k;
        }
    }

    O0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, Q q11, d dVar, InputConfiguration inputConfiguration, int i11, f fVar) {
        this.f38152a = arrayList;
        this.f38154c = Collections.unmodifiableList(arrayList2);
        this.f38155d = Collections.unmodifiableList(arrayList3);
        this.f38156e = Collections.unmodifiableList(arrayList4);
        this.f38157f = dVar;
        this.f38158g = q11;
        this.f38160i = inputConfiguration;
        this.f38159h = i11;
        this.f38153b = fVar;
    }

    @NonNull
    public static O0 b() {
        return new O0(new ArrayList(), new ArrayList(0), new ArrayList(0), new ArrayList(0), new Q.a().h(), null, null, 0, null);
    }

    public static int e(int i11, int i12) {
        Integer valueOf = Integer.valueOf(i11);
        List<Integer> list = f38151j;
        return list.indexOf(valueOf) >= list.indexOf(Integer.valueOf(i12)) ? i11 : i12;
    }

    @NonNull
    public final List<CameraDevice.StateCallback> c() {
        return this.f38154c;
    }

    public final d d() {
        return this.f38157f;
    }

    @NonNull
    public final T f() {
        return this.f38158g.f38181b;
    }

    public final InputConfiguration g() {
        return this.f38160i;
    }

    @NonNull
    public final List<f> h() {
        return this.f38152a;
    }

    public final f i() {
        return this.f38153b;
    }

    @NonNull
    public final List<AbstractC5111p> j() {
        return this.f38158g.f38184e;
    }

    @NonNull
    public final Q k() {
        return this.f38158g;
    }

    @NonNull
    public final List<CameraCaptureSession.StateCallback> l() {
        return this.f38155d;
    }

    public final int m() {
        return this.f38159h;
    }

    @NonNull
    public final List<AbstractC5111p> n() {
        return this.f38156e;
    }

    @NonNull
    public final List<W> o() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f38152a.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            arrayList.add(fVar.f());
            Iterator<W> it2 = fVar.e().iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final int p() {
        return this.f38158g.f38182c;
    }
}
