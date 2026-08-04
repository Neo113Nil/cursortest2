package androidx.lifecycle;

import W5.AbstractC0486a1;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0726v extends AbstractC0720o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f9635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p101o.a f9636b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public EnumC0719n f9637c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WeakReference f9638d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9639e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9640f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9641g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f9642h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final G6.w f9643i;

    public C0726v(InterfaceC0724t interfaceC0724t) {
        new AtomicReference();
        this.f9635a = true;
        this.f9636b = new p101o.a();
        EnumC0719n enumC0719n = EnumC0719n.f9627b;
        this.f9637c = enumC0719n;
        this.f9642h = new ArrayList();
        this.f9638d = new WeakReference(interfaceC0724t);
        this.f9643i = new G6.w(enumC0719n);
    }

    @Override // androidx.lifecycle.AbstractC0720o
    public final void a(InterfaceC0723s interfaceC0723s) {
        r c0711f;
        InterfaceC0724t interfaceC0724t;
        ArrayList arrayList = this.f9642h;
        Object obj = null;
        int i7 = 1;
        t6.h.e(interfaceC0723s, "observer");
        d("addObserver");
        EnumC0719n enumC0719n = this.f9637c;
        EnumC0719n enumC0719n2 = EnumC0719n.f9626a;
        if (enumC0719n != enumC0719n2) {
            enumC0719n2 = EnumC0719n.f9627b;
        }
        C0725u c0725u = new C0725u();
        HashMap map = AbstractC0728x.f9645a;
        boolean z4 = interfaceC0723s instanceof r;
        boolean z7 = interfaceC0723s instanceof DefaultLifecycleObserver;
        if (z4 && z7) {
            c0711f = new C0711f((DefaultLifecycleObserver) interfaceC0723s, (r) interfaceC0723s);
        } else if (z7) {
            c0711f = new C0711f((DefaultLifecycleObserver) interfaceC0723s, (r) null);
        } else if (z4) {
            c0711f = (r) interfaceC0723s;
        } else {
            Class<?> cls = interfaceC0723s.getClass();
            if (AbstractC0728x.b(cls) == 2) {
                Object obj2 = AbstractC0728x.f9646b.get(cls);
                t6.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0728x.a((Constructor) list.get(0), interfaceC0723s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0713h[] interfaceC0713hArr = new InterfaceC0713h[size];
                if (size > 0) {
                    AbstractC0728x.a((Constructor) list.get(0), interfaceC0723s);
                    throw null;
                }
                c0711f = new G0.b(interfaceC0713hArr, i7);
            } else {
                c0711f = new C0711f(interfaceC0723s);
            }
        }
        c0725u.f9634b = c0711f;
        c0725u.f9633a = enumC0719n2;
        p101o.a aVar = this.f9636b;
        p101o.c cVarL = aVar.l(interfaceC0723s);
        if (cVarL != null) {
            obj = cVarL.f15526b;
        } else {
            HashMap map2 = aVar.f15521e;
            p101o.c cVar = new p101o.c(interfaceC0723s, c0725u);
            aVar.f15535d++;
            p101o.c cVar2 = aVar.f15533b;
            if (cVar2 == null) {
                aVar.f15532a = cVar;
                aVar.f15533b = cVar;
            } else {
                cVar2.f15527c = cVar;
                cVar.f15528d = cVar2;
                aVar.f15533b = cVar;
            }
            map2.put(interfaceC0723s, cVar);
        }
        if (((C0725u) obj) == null && (interfaceC0724t = (InterfaceC0724t) this.f9638d.get()) != null) {
            boolean z8 = this.f9639e != 0 || this.f9640f;
            EnumC0719n enumC0719nC = c(interfaceC0723s);
            this.f9639e++;
            while (c0725u.f9633a.compareTo(enumC0719nC) < 0 && this.f9636b.f15521e.containsKey(interfaceC0723s)) {
                arrayList.add(c0725u.f9633a);
                C0716k c0716k = EnumC0718m.Companion;
                EnumC0719n enumC0719n3 = c0725u.f9633a;
                c0716k.getClass();
                EnumC0718m enumC0718mB = C0716k.b(enumC0719n3);
                if (enumC0718mB == null) {
                    throw new IllegalStateException("no event up from " + c0725u.f9633a);
                }
                c0725u.a(interfaceC0724t, enumC0718mB);
                arrayList.remove(arrayList.size() - 1);
                enumC0719nC = c(interfaceC0723s);
            }
            if (!z8) {
                h();
            }
            this.f9639e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0720o
    public final void b(InterfaceC0723s interfaceC0723s) {
        t6.h.e(interfaceC0723s, "observer");
        d("removeObserver");
        this.f9636b.m(interfaceC0723s);
    }

    public final EnumC0719n c(InterfaceC0723s interfaceC0723s) {
        C0725u c0725u;
        HashMap map = this.f9636b.f15521e;
        p101o.c cVar = map.containsKey(interfaceC0723s) ? ((p101o.c) map.get(interfaceC0723s)).f15528d : null;
        EnumC0719n enumC0719n = (cVar == null || (c0725u = (C0725u) cVar.f15526b) == null) ? null : c0725u.f9633a;
        ArrayList arrayList = this.f9642h;
        EnumC0719n enumC0719n2 = arrayList.isEmpty() ? null : (EnumC0719n) arrayList.get(arrayList.size() - 1);
        EnumC0719n enumC0719n3 = this.f9637c;
        t6.h.e(enumC0719n3, "state1");
        if (enumC0719n == null || enumC0719n.compareTo(enumC0719n3) >= 0) {
            enumC0719n = enumC0719n3;
        }
        return (enumC0719n2 == null || enumC0719n2.compareTo(enumC0719n) >= 0) ? enumC0719n : enumC0719n2;
    }

    public final void d(String str) {
        if (this.f9635a) {
            p094n.b.Y().f15287c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0486a1.h("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0718m enumC0718m) {
        t6.h.e(enumC0718m, "event");
        d("handleLifecycleEvent");
        f(enumC0718m.a());
    }

    public final void f(EnumC0719n enumC0719n) {
        EnumC0719n enumC0719n2 = this.f9637c;
        if (enumC0719n2 == enumC0719n) {
            return;
        }
        EnumC0719n enumC0719n3 = EnumC0719n.f9627b;
        EnumC0719n enumC0719n4 = EnumC0719n.f9626a;
        if (enumC0719n2 == enumC0719n3 && enumC0719n == enumC0719n4) {
            throw new IllegalStateException(("no event down from " + this.f9637c + " in component " + this.f9638d.get()).toString());
        }
        this.f9637c = enumC0719n;
        if (this.f9640f || this.f9639e != 0) {
            this.f9641g = true;
            return;
        }
        this.f9640f = true;
        h();
        this.f9640f = false;
        if (this.f9637c == enumC0719n4) {
            this.f9636b = new p101o.a();
        }
    }

    public final void g() {
        EnumC0719n enumC0719n = EnumC0719n.f9628c;
        d("setCurrentState");
        f(enumC0719n);
    }

    public final void h() {
        InterfaceC0724t interfaceC0724t = (InterfaceC0724t) this.f9638d.get();
        if (interfaceC0724t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            p101o.a aVar = this.f9636b;
            if (aVar.f15535d != 0) {
                p101o.c cVar = aVar.f15532a;
                t6.h.b(cVar);
                EnumC0719n enumC0719n = ((C0725u) cVar.f15526b).f9633a;
                p101o.c cVar2 = this.f9636b.f15533b;
                t6.h.b(cVar2);
                EnumC0719n enumC0719n2 = ((C0725u) cVar2.f15526b).f9633a;
                if (enumC0719n == enumC0719n2 && this.f9637c == enumC0719n2) {
                    break;
                }
                this.f9641g = false;
                EnumC0719n enumC0719n3 = this.f9637c;
                p101o.c cVar3 = this.f9636b.f15532a;
                t6.h.b(cVar3);
                if (enumC0719n3.compareTo(((C0725u) cVar3.f15526b).f9633a) < 0) {
                    p101o.a aVar2 = this.f9636b;
                    p101o.b bVar = new p101o.b(aVar2.f15533b, aVar2.f15532a, 1);
                    aVar2.f15534c.put(bVar, Boolean.FALSE);
                    while (bVar.hasNext() && !this.f9641g) {
                        Map.Entry entry = (Map.Entry) bVar.next();
                        t6.h.d(entry, "next()");
                        InterfaceC0723s interfaceC0723s = (InterfaceC0723s) entry.getKey();
                        C0725u c0725u = (C0725u) entry.getValue();
                        while (c0725u.f9633a.compareTo(this.f9637c) > 0 && !this.f9641g && this.f9636b.f15521e.containsKey(interfaceC0723s)) {
                            C0716k c0716k = EnumC0718m.Companion;
                            EnumC0719n enumC0719n4 = c0725u.f9633a;
                            c0716k.getClass();
                            EnumC0718m enumC0718mA = C0716k.a(enumC0719n4);
                            if (enumC0718mA == null) {
                                throw new IllegalStateException("no event down from " + c0725u.f9633a);
                            }
                            this.f9642h.add(enumC0718mA.a());
                            c0725u.a(interfaceC0724t, enumC0718mA);
                            ArrayList arrayList = this.f9642h;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                p101o.c cVar4 = this.f9636b.f15533b;
                if (!this.f9641g && cVar4 != null && this.f9637c.compareTo(((C0725u) cVar4.f15526b).f9633a) > 0) {
                    p101o.a aVar3 = this.f9636b;
                    aVar3.getClass();
                    p101o.d dVar = new p101o.d(aVar3);
                    aVar3.f15534c.put(dVar, Boolean.FALSE);
                    while (dVar.hasNext() && !this.f9641g) {
                        Map.Entry entry2 = (Map.Entry) dVar.next();
                        InterfaceC0723s interfaceC0723s2 = (InterfaceC0723s) entry2.getKey();
                        C0725u c0725u2 = (C0725u) entry2.getValue();
                        while (c0725u2.f9633a.compareTo(this.f9637c) < 0 && !this.f9641g && this.f9636b.f15521e.containsKey(interfaceC0723s2)) {
                            this.f9642h.add(c0725u2.f9633a);
                            C0716k c0716k2 = EnumC0718m.Companion;
                            EnumC0719n enumC0719n5 = c0725u2.f9633a;
                            c0716k2.getClass();
                            EnumC0718m enumC0718mB = C0716k.b(enumC0719n5);
                            if (enumC0718mB == null) {
                                throw new IllegalStateException("no event up from " + c0725u2.f9633a);
                            }
                            c0725u2.a(interfaceC0724t, enumC0718mB);
                            ArrayList arrayList2 = this.f9642h;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
        this.f9641g = false;
        Object obj = this.f9637c;
        G6.w wVar = this.f9643i;
        wVar.getClass();
        if (obj == null) {
            obj = H6.l.f3444a;
        }
        wVar.E(null, obj);
    }
}
