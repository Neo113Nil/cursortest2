package androidx.lifecycle;

import Ae.C2399j;
import Ae.M0;
import Ae.O0;
import androidx.lifecycle.AbstractC5434v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import n.C8358c;
import o.C8619a;
import o.C8620b;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public class L extends AbstractC5434v {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f43209b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private C8619a<I, a> f43210c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private AbstractC5434v.b f43211d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final WeakReference<J> f43212e;

    /* renamed from: f, reason: collision with root package name */
    private int f43213f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43214g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43215h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private ArrayList<AbstractC5434v.b> f43216i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Ae.x0<AbstractC5434v.b> f43217j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private AbstractC5434v.b f43218a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private G f43219b;

        public a(I i11, @NotNull AbstractC5434v.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.f(i11);
            this.f43219b = O.d(i11);
            this.f43218a = initialState;
        }

        public final void a(J j11, @NotNull AbstractC5434v.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC5434v.b a11 = event.a();
            AbstractC5434v.b state1 = this.f43218a;
            Intrinsics.checkNotNullParameter(state1, "state1");
            if (a11 != null && a11.compareTo(state1) < 0) {
                state1 = a11;
            }
            this.f43218a = state1;
            this.f43219b.onStateChanged(j11, event);
            this.f43218a = a11;
        }

        @NotNull
        public final AbstractC5434v.b b() {
            return this.f43218a;
        }
    }

    public L(@NotNull J provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f43209b = true;
        this.f43210c = new C8619a<>();
        AbstractC5434v.b bVar = AbstractC5434v.b.INITIALIZED;
        this.f43211d = bVar;
        this.f43216i = new ArrayList<>();
        this.f43212e = new WeakReference<>(provider);
        this.f43217j = O0.a(bVar);
    }

    private final AbstractC5434v.b f(I i11) {
        a aVar;
        Map.Entry i12 = this.f43210c.i(i11);
        AbstractC5434v.b state1 = (i12 == null || (aVar = (a) i12.getValue()) == null) ? null : aVar.b();
        ArrayList<AbstractC5434v.b> arrayList = this.f43216i;
        AbstractC5434v.b bVar = arrayList.isEmpty() ? null : (AbstractC5434v.b) C.o0.b(1, arrayList);
        AbstractC5434v.b state12 = this.f43211d;
        Intrinsics.checkNotNullParameter(state12, "state1");
        if (state1 == null || state1.compareTo(state12) >= 0) {
            state1 = state12;
        }
        Intrinsics.checkNotNullParameter(state1, "state1");
        return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
    }

    private final void g(String str) {
        if (this.f43209b && !C8358c.e().g()) {
            throw new IllegalStateException(B0.A0.b("Method ", str, " must be called on the main thread").toString());
        }
    }

    private final void i(AbstractC5434v.b bVar) {
        AbstractC5434v.b bVar2 = this.f43211d;
        if (bVar2 == bVar) {
            return;
        }
        if (bVar2 == AbstractC5434v.b.INITIALIZED && bVar == AbstractC5434v.b.DESTROYED) {
            throw new IllegalStateException(("State must be at least CREATED to move to " + bVar + ", but was " + this.f43211d + " in component " + this.f43212e.get()).toString());
        }
        this.f43211d = bVar;
        if (this.f43214g || this.f43213f != 0) {
            this.f43215h = true;
            return;
        }
        this.f43214g = true;
        k();
        this.f43214g = false;
        if (this.f43211d == AbstractC5434v.b.DESTROYED) {
            this.f43210c = new C8619a<>();
        }
    }

    private final void k() {
        J j11 = this.f43212e.get();
        if (j11 == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (this.f43210c.size() != 0) {
            Map.Entry<I, a> a11 = this.f43210c.a();
            Intrinsics.f(a11);
            AbstractC5434v.b b11 = a11.getValue().b();
            Map.Entry<I, a> e11 = this.f43210c.e();
            Intrinsics.f(e11);
            AbstractC5434v.b b12 = e11.getValue().b();
            if (b11 == b12 && this.f43211d == b12) {
                break;
            }
            this.f43215h = false;
            AbstractC5434v.b bVar = this.f43211d;
            Map.Entry<I, a> a12 = this.f43210c.a();
            Intrinsics.f(a12);
            if (bVar.compareTo(a12.getValue().b()) < 0) {
                Iterator<Map.Entry<I, a>> descendingIterator = this.f43210c.descendingIterator();
                Intrinsics.checkNotNullExpressionValue(descendingIterator, "observerMap.descendingIterator()");
                while (descendingIterator.hasNext() && !this.f43215h) {
                    Map.Entry<I, a> next = descendingIterator.next();
                    Intrinsics.checkNotNullExpressionValue(next, "next()");
                    I key = next.getKey();
                    a value = next.getValue();
                    while (value.b().compareTo(this.f43211d) > 0 && !this.f43215h && this.f43210c.k(key)) {
                        AbstractC5434v.a.C0798a c0798a = AbstractC5434v.a.Companion;
                        AbstractC5434v.b b13 = value.b();
                        c0798a.getClass();
                        AbstractC5434v.a a13 = AbstractC5434v.a.C0798a.a(b13);
                        if (a13 == null) {
                            throw new IllegalStateException("no event down from " + value.b());
                        }
                        this.f43216i.add(a13.a());
                        value.a(j11, a13);
                        Ej.b.b(1, this.f43216i);
                    }
                }
            }
            Map.Entry<I, a> e12 = this.f43210c.e();
            if (!this.f43215h && e12 != null && this.f43211d.compareTo(e12.getValue().b()) > 0) {
                C8620b<I, a>.d c11 = this.f43210c.c();
                Intrinsics.checkNotNullExpressionValue(c11, "observerMap.iteratorWithAdditions()");
                while (c11.hasNext() && !this.f43215h) {
                    Map.Entry entry = (Map.Entry) c11.next();
                    I i11 = (I) entry.getKey();
                    a aVar = (a) entry.getValue();
                    while (aVar.b().compareTo(this.f43211d) < 0 && !this.f43215h && this.f43210c.k(i11)) {
                        this.f43216i.add(aVar.b());
                        AbstractC5434v.a.C0798a c0798a2 = AbstractC5434v.a.Companion;
                        AbstractC5434v.b b14 = aVar.b();
                        c0798a2.getClass();
                        AbstractC5434v.a b15 = AbstractC5434v.a.C0798a.b(b14);
                        if (b15 == null) {
                            throw new IllegalStateException("no event up from " + aVar.b());
                        }
                        aVar.a(j11, b15);
                        Ej.b.b(1, this.f43216i);
                    }
                }
            }
        }
        this.f43215h = false;
        this.f43217j.setValue(this.f43211d);
    }

    @Override // androidx.lifecycle.AbstractC5434v
    public void a(@NotNull I observer) {
        J j11;
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("addObserver");
        AbstractC5434v.b bVar = this.f43211d;
        AbstractC5434v.b bVar2 = AbstractC5434v.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC5434v.b.INITIALIZED;
        }
        a aVar = new a(observer, bVar2);
        if (this.f43210c.g(observer, aVar) == null && (j11 = this.f43212e.get()) != null) {
            boolean z11 = this.f43213f != 0 || this.f43214g;
            AbstractC5434v.b f7 = f(observer);
            this.f43213f++;
            while (aVar.b().compareTo(f7) < 0 && this.f43210c.k(observer)) {
                this.f43216i.add(aVar.b());
                AbstractC5434v.a.C0798a c0798a = AbstractC5434v.a.Companion;
                AbstractC5434v.b b11 = aVar.b();
                c0798a.getClass();
                AbstractC5434v.a b12 = AbstractC5434v.a.C0798a.b(b11);
                if (b12 == null) {
                    throw new IllegalStateException("no event up from " + aVar.b());
                }
                aVar.a(j11, b12);
                Ej.b.b(1, this.f43216i);
                f7 = f(observer);
            }
            if (!z11) {
                k();
            }
            this.f43213f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC5434v
    @NotNull
    public final AbstractC5434v.b b() {
        return this.f43211d;
    }

    @Override // androidx.lifecycle.AbstractC5434v
    @NotNull
    public final M0<AbstractC5434v.b> c() {
        return C2399j.b(this.f43217j);
    }

    @Override // androidx.lifecycle.AbstractC5434v
    public void e(@NotNull I observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("removeObserver");
        this.f43210c.h(observer);
    }

    public final void h(@NotNull AbstractC5434v.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g("handleLifecycleEvent");
        i(event.a());
    }

    public final void j(@NotNull AbstractC5434v.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("setCurrentState");
        i(state);
    }
}
