package E5;

import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class a<K, A> {

    /* renamed from: c, reason: collision with root package name */
    private final c<K> f7477c;

    /* renamed from: e, reason: collision with root package name */
    protected P5.c<A> f7479e;

    /* renamed from: a, reason: collision with root package name */
    final ArrayList f7475a = new ArrayList(1);

    /* renamed from: b, reason: collision with root package name */
    private boolean f7476b = false;

    /* renamed from: d, reason: collision with root package name */
    protected float f7478d = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private A f7480f = null;

    /* renamed from: g, reason: collision with root package name */
    private float f7481g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f7482h = -1.0f;

    /* renamed from: E5.a$a, reason: collision with other inner class name */
    public interface InterfaceC0168a {
        void f();
    }

    /* loaded from: classes8.dex */
    private static final class b<T> implements c<T> {
        b() {
        }

        @Override // E5.a.c
        public final P5.a<T> a() {
            throw new IllegalStateException("not implemented");
        }

        @Override // E5.a.c
        public final float b() {
            return 0.0f;
        }

        @Override // E5.a.c
        public final boolean c(float f7) {
            throw new IllegalStateException("not implemented");
        }

        @Override // E5.a.c
        public final boolean d(float f7) {
            return false;
        }

        @Override // E5.a.c
        public final float e() {
            return 1.0f;
        }

        @Override // E5.a.c
        public final boolean isEmpty() {
            return true;
        }
    }

    private interface c<T> {
        P5.a<T> a();

        float b();

        boolean c(float f7);

        boolean d(float f7);

        float e();

        boolean isEmpty();
    }

    private static final class d<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        private final List<? extends P5.a<T>> f7483a;

        /* renamed from: c, reason: collision with root package name */
        private P5.a<T> f7485c = null;

        /* renamed from: d, reason: collision with root package name */
        private float f7486d = -1.0f;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        private P5.a<T> f7484b = f(0.0f);

        d(List<? extends P5.a<T>> list) {
            this.f7483a = list;
        }

        private P5.a<T> f(float f7) {
            List<? extends P5.a<T>> list = this.f7483a;
            P5.a<T> aVar = list.get(list.size() - 1);
            if (f7 >= aVar.e()) {
                return aVar;
            }
            for (int size = list.size() - 2; size >= 1; size--) {
                P5.a<T> aVar2 = list.get(size);
                if (this.f7484b != aVar2 && f7 >= aVar2.e() && f7 < aVar2.b()) {
                    return aVar2;
                }
            }
            return list.get(0);
        }

        @Override // E5.a.c
        @NonNull
        public final P5.a<T> a() {
            return this.f7484b;
        }

        @Override // E5.a.c
        public final float b() {
            return this.f7483a.get(0).e();
        }

        @Override // E5.a.c
        public final boolean c(float f7) {
            P5.a<T> aVar = this.f7485c;
            P5.a<T> aVar2 = this.f7484b;
            if (aVar == aVar2 && this.f7486d == f7) {
                return true;
            }
            this.f7485c = aVar2;
            this.f7486d = f7;
            return false;
        }

        @Override // E5.a.c
        public final boolean d(float f7) {
            P5.a<T> aVar = this.f7484b;
            if (f7 >= aVar.e() && f7 < aVar.b()) {
                return !this.f7484b.h();
            }
            this.f7484b = f(f7);
            return true;
        }

        @Override // E5.a.c
        public final float e() {
            return this.f7483a.get(r0.size() - 1).b();
        }

        @Override // E5.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    private static final class e<T> implements c<T> {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        private final P5.a<T> f7487a;

        /* renamed from: b, reason: collision with root package name */
        private float f7488b = -1.0f;

        e(List<? extends P5.a<T>> list) {
            this.f7487a = list.get(0);
        }

        @Override // E5.a.c
        public final P5.a<T> a() {
            return this.f7487a;
        }

        @Override // E5.a.c
        public final float b() {
            return this.f7487a.e();
        }

        @Override // E5.a.c
        public final boolean c(float f7) {
            if (this.f7488b == f7) {
                return true;
            }
            this.f7488b = f7;
            return false;
        }

        @Override // E5.a.c
        public final boolean d(float f7) {
            return !this.f7487a.h();
        }

        @Override // E5.a.c
        public final float e() {
            return this.f7487a.b();
        }

        @Override // E5.a.c
        public final boolean isEmpty() {
            return false;
        }
    }

    a(List<? extends P5.a<K>> list) {
        c eVar;
        if (list.isEmpty()) {
            eVar = new b();
        } else {
            eVar = list.size() == 1 ? new e(list) : new d(list);
        }
        this.f7477c = eVar;
    }

    public final void a(InterfaceC0168a interfaceC0168a) {
        this.f7475a.add(interfaceC0168a);
    }

    protected final P5.a<K> b() {
        int i11 = B5.c.f2729d;
        return this.f7477c.a();
    }

    float c() {
        if (this.f7482h == -1.0f) {
            this.f7482h = this.f7477c.e();
        }
        return this.f7482h;
    }

    protected final float d() {
        P5.a<K> b11 = b();
        if (b11 == null || b11.h()) {
            return 0.0f;
        }
        return b11.f21851d.getInterpolation(e());
    }

    final float e() {
        if (this.f7476b) {
            return 0.0f;
        }
        P5.a<K> b11 = b();
        if (b11.h()) {
            return 0.0f;
        }
        return (this.f7478d - b11.e()) / (b11.b() - b11.e());
    }

    public final float f() {
        return this.f7478d;
    }

    public A g() {
        Interpolator interpolator;
        float e11 = e();
        if (this.f7479e == null && this.f7477c.c(e11)) {
            return this.f7480f;
        }
        P5.a<K> b11 = b();
        Interpolator interpolator2 = b11.f21852e;
        A h11 = (interpolator2 == null || (interpolator = b11.f21853f) == null) ? h(b11, d()) : i(b11, e11, interpolator2.getInterpolation(e11), interpolator.getInterpolation(e11));
        this.f7480f = h11;
        return h11;
    }

    abstract A h(P5.a<K> aVar, float f7);

    protected A i(P5.a<K> aVar, float f7, float f11, float f12) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    public void j() {
        int i11 = B5.c.f2729d;
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f7475a;
            if (i12 >= arrayList.size()) {
                int i13 = B5.c.f2729d;
                return;
            } else {
                ((InterfaceC0168a) arrayList.get(i12)).f();
                i12++;
            }
        }
    }

    public final void k() {
        this.f7476b = true;
    }

    public void l(float f7) {
        int i11 = B5.c.f2729d;
        c<K> cVar = this.f7477c;
        if (cVar.isEmpty()) {
            return;
        }
        if (this.f7481g == -1.0f) {
            this.f7481g = cVar.b();
        }
        float f11 = this.f7481g;
        if (f7 < f11) {
            if (f11 == -1.0f) {
                this.f7481g = cVar.b();
            }
            f7 = this.f7481g;
        } else if (f7 > c()) {
            f7 = c();
        }
        if (f7 == this.f7478d) {
            return;
        }
        this.f7478d = f7;
        if (cVar.d(f7)) {
            j();
        }
    }

    public final void m(P5.c<A> cVar) {
        P5.c<A> cVar2 = this.f7479e;
        if (cVar2 != null) {
            cVar2.getClass();
        }
        this.f7479e = cVar;
    }
}
