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
import n.C1442b;
import o.C1483a;
import o.C1484b;
import o.C1485c;
import o.C1486d;

/* renamed from: androidx.lifecycle.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0747v extends AbstractC0741o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9635a;

    /* renamed from: b, reason: collision with root package name */
    public C1483a f9636b;

    /* renamed from: c, reason: collision with root package name */
    public EnumC0740n f9637c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f9638d;

    /* renamed from: e, reason: collision with root package name */
    public int f9639e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9640f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9641g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f9642h;

    /* renamed from: i, reason: collision with root package name */
    public final G6.w f9643i;

    public C0747v(InterfaceC0745t interfaceC0745t) {
        new AtomicReference();
        this.f9635a = true;
        this.f9636b = new C1483a();
        EnumC0740n enumC0740n = EnumC0740n.f9627b;
        this.f9637c = enumC0740n;
        this.f9642h = new ArrayList();
        this.f9638d = new WeakReference(interfaceC0745t);
        this.f9643i = new G6.w(enumC0740n);
    }

    @Override // androidx.lifecycle.AbstractC0741o
    public final void a(InterfaceC0744s interfaceC0744s) {
        r c0732f;
        InterfaceC0745t interfaceC0745t;
        ArrayList arrayList = this.f9642h;
        Object obj = null;
        int i7 = 1;
        t6.h.e(interfaceC0744s, "observer");
        d("addObserver");
        EnumC0740n enumC0740n = this.f9637c;
        EnumC0740n enumC0740n2 = EnumC0740n.f9626a;
        if (enumC0740n != enumC0740n2) {
            enumC0740n2 = EnumC0740n.f9627b;
        }
        C0746u c0746u = new C0746u();
        HashMap hashMap = AbstractC0749x.f9645a;
        boolean z4 = interfaceC0744s instanceof r;
        boolean z7 = interfaceC0744s instanceof DefaultLifecycleObserver;
        if (z4 && z7) {
            c0732f = new C0732f((DefaultLifecycleObserver) interfaceC0744s, (r) interfaceC0744s);
        } else if (z7) {
            c0732f = new C0732f((DefaultLifecycleObserver) interfaceC0744s, (r) null);
        } else if (z4) {
            c0732f = (r) interfaceC0744s;
        } else {
            Class<?> cls = interfaceC0744s.getClass();
            if (AbstractC0749x.b(cls) == 2) {
                Object obj2 = AbstractC0749x.f9646b.get(cls);
                t6.h.b(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0749x.a((Constructor) list.get(0), interfaceC0744s);
                    throw null;
                }
                int size = list.size();
                InterfaceC0734h[] interfaceC0734hArr = new InterfaceC0734h[size];
                if (size > 0) {
                    AbstractC0749x.a((Constructor) list.get(0), interfaceC0744s);
                    throw null;
                }
                c0732f = new G0.b(interfaceC0734hArr, i7);
            } else {
                c0732f = new C0732f(interfaceC0744s);
            }
        }
        c0746u.f9634b = c0732f;
        c0746u.f9633a = enumC0740n2;
        C1483a c1483a = this.f9636b;
        C1485c l7 = c1483a.l(interfaceC0744s);
        if (l7 != null) {
            obj = l7.f15520b;
        } else {
            HashMap hashMap2 = c1483a.f15515e;
            C1485c c1485c = new C1485c(interfaceC0744s, c0746u);
            c1483a.f15529d++;
            C1485c c1485c2 = c1483a.f15527b;
            if (c1485c2 == null) {
                c1483a.f15526a = c1485c;
                c1483a.f15527b = c1485c;
            } else {
                c1485c2.f15521c = c1485c;
                c1485c.f15522d = c1485c2;
                c1483a.f15527b = c1485c;
            }
            hashMap2.put(interfaceC0744s, c1485c);
        }
        if (((C0746u) obj) == null && (interfaceC0745t = (InterfaceC0745t) this.f9638d.get()) != null) {
            boolean z8 = this.f9639e != 0 || this.f9640f;
            EnumC0740n c3 = c(interfaceC0744s);
            this.f9639e++;
            while (c0746u.f9633a.compareTo(c3) < 0 && this.f9636b.f15515e.containsKey(interfaceC0744s)) {
                arrayList.add(c0746u.f9633a);
                C0737k c0737k = EnumC0739m.Companion;
                EnumC0740n enumC0740n3 = c0746u.f9633a;
                c0737k.getClass();
                EnumC0739m b7 = C0737k.b(enumC0740n3);
                if (b7 == null) {
                    throw new IllegalStateException("no event up from " + c0746u.f9633a);
                }
                c0746u.a(interfaceC0745t, b7);
                arrayList.remove(arrayList.size() - 1);
                c3 = c(interfaceC0744s);
            }
            if (!z8) {
                h();
            }
            this.f9639e--;
        }
    }

    @Override // androidx.lifecycle.AbstractC0741o
    public final void b(InterfaceC0744s interfaceC0744s) {
        t6.h.e(interfaceC0744s, "observer");
        d("removeObserver");
        this.f9636b.m(interfaceC0744s);
    }

    public final EnumC0740n c(InterfaceC0744s interfaceC0744s) {
        C0746u c0746u;
        HashMap hashMap = this.f9636b.f15515e;
        C1485c c1485c = hashMap.containsKey(interfaceC0744s) ? ((C1485c) hashMap.get(interfaceC0744s)).f15522d : null;
        EnumC0740n enumC0740n = (c1485c == null || (c0746u = (C0746u) c1485c.f15520b) == null) ? null : c0746u.f9633a;
        ArrayList arrayList = this.f9642h;
        EnumC0740n enumC0740n2 = arrayList.isEmpty() ? null : (EnumC0740n) arrayList.get(arrayList.size() - 1);
        EnumC0740n enumC0740n3 = this.f9637c;
        t6.h.e(enumC0740n3, "state1");
        if (enumC0740n == null || enumC0740n.compareTo(enumC0740n3) >= 0) {
            enumC0740n = enumC0740n3;
        }
        return (enumC0740n2 == null || enumC0740n2.compareTo(enumC0740n) >= 0) ? enumC0740n : enumC0740n2;
    }

    public final void d(String str) {
        if (this.f9635a) {
            C1442b.Y().f15281c.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(AbstractC0486a1.h("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(EnumC0739m enumC0739m) {
        t6.h.e(enumC0739m, "event");
        d("handleLifecycleEvent");
        f(enumC0739m.a());
    }

    public final void f(EnumC0740n enumC0740n) {
        EnumC0740n enumC0740n2 = this.f9637c;
        if (enumC0740n2 == enumC0740n) {
            return;
        }
        EnumC0740n enumC0740n3 = EnumC0740n.f9627b;
        EnumC0740n enumC0740n4 = EnumC0740n.f9626a;
        if (enumC0740n2 == enumC0740n3 && enumC0740n == enumC0740n4) {
            throw new IllegalStateException(("no event down from " + this.f9637c + " in component " + this.f9638d.get()).toString());
        }
        this.f9637c = enumC0740n;
        if (this.f9640f || this.f9639e != 0) {
            this.f9641g = true;
            return;
        }
        this.f9640f = true;
        h();
        this.f9640f = false;
        if (this.f9637c == enumC0740n4) {
            this.f9636b = new C1483a();
        }
    }

    public final void g() {
        EnumC0740n enumC0740n = EnumC0740n.f9628c;
        d("setCurrentState");
        f(enumC0740n);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r7.f9641g = false;
        r0 = r7.f9637c;
        r1 = r7.f9643i;
        r1.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        if (r0 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
    
        r0 = H6.l.f3444a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        r1.E(null, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h() {
        InterfaceC0745t interfaceC0745t = (InterfaceC0745t) this.f9638d.get();
        if (interfaceC0745t == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C1483a c1483a = this.f9636b;
            if (c1483a.f15529d != 0) {
                C1485c c1485c = c1483a.f15526a;
                t6.h.b(c1485c);
                EnumC0740n enumC0740n = ((C0746u) c1485c.f15520b).f9633a;
                C1485c c1485c2 = this.f9636b.f15527b;
                t6.h.b(c1485c2);
                EnumC0740n enumC0740n2 = ((C0746u) c1485c2.f15520b).f9633a;
                if (enumC0740n == enumC0740n2 && this.f9637c == enumC0740n2) {
                    break;
                }
                this.f9641g = false;
                EnumC0740n enumC0740n3 = this.f9637c;
                C1485c c1485c3 = this.f9636b.f15526a;
                t6.h.b(c1485c3);
                if (enumC0740n3.compareTo(((C0746u) c1485c3.f15520b).f9633a) < 0) {
                    C1483a c1483a2 = this.f9636b;
                    C1484b c1484b = new C1484b(c1483a2.f15527b, c1483a2.f15526a, 1);
                    c1483a2.f15528c.put(c1484b, Boolean.FALSE);
                    while (c1484b.hasNext() && !this.f9641g) {
                        Map.Entry entry = (Map.Entry) c1484b.next();
                        t6.h.d(entry, "next()");
                        InterfaceC0744s interfaceC0744s = (InterfaceC0744s) entry.getKey();
                        C0746u c0746u = (C0746u) entry.getValue();
                        while (c0746u.f9633a.compareTo(this.f9637c) > 0 && !this.f9641g && this.f9636b.f15515e.containsKey(interfaceC0744s)) {
                            C0737k c0737k = EnumC0739m.Companion;
                            EnumC0740n enumC0740n4 = c0746u.f9633a;
                            c0737k.getClass();
                            EnumC0739m a2 = C0737k.a(enumC0740n4);
                            if (a2 == null) {
                                throw new IllegalStateException("no event down from " + c0746u.f9633a);
                            }
                            this.f9642h.add(a2.a());
                            c0746u.a(interfaceC0745t, a2);
                            this.f9642h.remove(r4.size() - 1);
                        }
                    }
                }
                C1485c c1485c4 = this.f9636b.f15527b;
                if (!this.f9641g && c1485c4 != null && this.f9637c.compareTo(((C0746u) c1485c4.f15520b).f9633a) > 0) {
                    C1483a c1483a3 = this.f9636b;
                    c1483a3.getClass();
                    C1486d c1486d = new C1486d(c1483a3);
                    c1483a3.f15528c.put(c1486d, Boolean.FALSE);
                    while (c1486d.hasNext() && !this.f9641g) {
                        Map.Entry entry2 = (Map.Entry) c1486d.next();
                        InterfaceC0744s interfaceC0744s2 = (InterfaceC0744s) entry2.getKey();
                        C0746u c0746u2 = (C0746u) entry2.getValue();
                        while (c0746u2.f9633a.compareTo(this.f9637c) < 0 && !this.f9641g && this.f9636b.f15515e.containsKey(interfaceC0744s2)) {
                            this.f9642h.add(c0746u2.f9633a);
                            C0737k c0737k2 = EnumC0739m.Companion;
                            EnumC0740n enumC0740n5 = c0746u2.f9633a;
                            c0737k2.getClass();
                            EnumC0739m b7 = C0737k.b(enumC0740n5);
                            if (b7 == null) {
                                throw new IllegalStateException("no event up from " + c0746u2.f9633a);
                            }
                            c0746u2.a(interfaceC0745t, b7);
                            this.f9642h.remove(r4.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
