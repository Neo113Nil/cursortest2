package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import o.C2191a;
import p.C2235a;
import p.C2236b;
import p.C2237c;
import p.C2238d;

/* renamed from: androidx.lifecycle.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0493w extends L {

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7067e;
    public C2235a f = new C2235a();

    /* renamed from: g, reason: collision with root package name */
    public EnumC0487p f7068g;

    /* renamed from: h, reason: collision with root package name */
    public final WeakReference f7069h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f7070j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f7071k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f7072l;

    /* renamed from: m, reason: collision with root package name */
    public final s4.M f7073m;

    public C0493w(InterfaceC0491u interfaceC0491u, boolean z3) {
        this.f7067e = z3;
        EnumC0487p enumC0487p = EnumC0487p.f7059l;
        this.f7068g = enumC0487p;
        this.f7072l = new ArrayList();
        this.f7069h = new WeakReference(interfaceC0491u);
        this.f7073m = s4.C.b(enumC0487p);
    }

    @Override // androidx.lifecycle.L
    public final void a(InterfaceC0490t interfaceC0490t) {
        InterfaceC0489s c0479h;
        Object obj;
        InterfaceC0491u interfaceC0491u;
        ArrayList arrayList = this.f7072l;
        kotlin.jvm.internal.l.f("observer", interfaceC0490t);
        o("addObserver");
        EnumC0487p enumC0487p = this.f7068g;
        EnumC0487p enumC0487p2 = EnumC0487p.f7058k;
        if (enumC0487p != enumC0487p2) {
            enumC0487p2 = EnumC0487p.f7059l;
        }
        C0492v c0492v = new C0492v();
        HashMap hashMap = AbstractC0495y.f7075a;
        boolean z3 = interfaceC0490t instanceof InterfaceC0489s;
        boolean z5 = interfaceC0490t instanceof InterfaceC0477f;
        if (z3 && z5) {
            c0479h = new C0479h((InterfaceC0477f) interfaceC0490t, (InterfaceC0489s) interfaceC0490t);
        } else if (z5) {
            c0479h = new C0479h((InterfaceC0477f) interfaceC0490t, (InterfaceC0489s) null);
        } else if (z3) {
            c0479h = (InterfaceC0489s) interfaceC0490t;
        } else {
            Class<?> cls = interfaceC0490t.getClass();
            if (AbstractC0495y.b(cls) == 2) {
                Object obj2 = AbstractC0495y.f7076b.get(cls);
                kotlin.jvm.internal.l.c(obj2);
                List list = (List) obj2;
                if (list.size() == 1) {
                    AbstractC0495y.a((Constructor) list.get(0), interfaceC0490t);
                    throw null;
                }
                int size = list.size();
                InterfaceC0481j[] interfaceC0481jArr = new InterfaceC0481j[size];
                if (size > 0) {
                    AbstractC0495y.a((Constructor) list.get(0), interfaceC0490t);
                    throw null;
                }
                c0479h = new C0476e(r1, interfaceC0481jArr);
            } else {
                c0479h = new C0479h(interfaceC0490t);
            }
        }
        c0492v.f7066b = c0479h;
        c0492v.f7065a = enumC0487p2;
        C2235a c2235a = this.f;
        C2237c c5 = c2235a.c(interfaceC0490t);
        if (c5 != null) {
            obj = c5.f18678l;
        } else {
            HashMap hashMap2 = c2235a.f18673o;
            C2237c c2237c = new C2237c(interfaceC0490t, c0492v);
            c2235a.f18687n++;
            C2237c c2237c2 = c2235a.f18685l;
            if (c2237c2 == null) {
                c2235a.f18684k = c2237c;
                c2235a.f18685l = c2237c;
            } else {
                c2237c2.f18679m = c2237c;
                c2237c.f18680n = c2237c2;
                c2235a.f18685l = c2237c;
            }
            hashMap2.put(interfaceC0490t, c2237c);
            obj = null;
        }
        if (((C0492v) obj) == null && (interfaceC0491u = (InterfaceC0491u) this.f7069h.get()) != null) {
            r1 = (this.i != 0 || this.f7070j) ? 1 : 0;
            EnumC0487p n5 = n(interfaceC0490t);
            this.i++;
            while (c0492v.f7065a.compareTo(n5) < 0 && this.f.f18673o.containsKey(interfaceC0490t)) {
                arrayList.add(c0492v.f7065a);
                C0484m c0484m = EnumC0486o.Companion;
                EnumC0487p enumC0487p3 = c0492v.f7065a;
                c0484m.getClass();
                kotlin.jvm.internal.l.f("state", enumC0487p3);
                int ordinal = enumC0487p3.ordinal();
                EnumC0486o enumC0486o = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : EnumC0486o.ON_RESUME : EnumC0486o.ON_START : EnumC0486o.ON_CREATE;
                if (enumC0486o == null) {
                    throw new IllegalStateException("no event up from " + c0492v.f7065a);
                }
                c0492v.a(interfaceC0491u, enumC0486o);
                arrayList.remove(arrayList.size() - 1);
                n5 = n(interfaceC0490t);
            }
            if (r1 == 0) {
                s();
            }
            this.i--;
        }
    }

    @Override // androidx.lifecycle.L
    public final EnumC0487p h() {
        return this.f7068g;
    }

    @Override // androidx.lifecycle.L
    public final void k(InterfaceC0490t interfaceC0490t) {
        kotlin.jvm.internal.l.f("observer", interfaceC0490t);
        o("removeObserver");
        this.f.d(interfaceC0490t);
    }

    public final EnumC0487p n(InterfaceC0490t interfaceC0490t) {
        HashMap hashMap = this.f.f18673o;
        C2237c c2237c = hashMap.containsKey(interfaceC0490t) ? ((C2237c) hashMap.get(interfaceC0490t)).f18680n : null;
        EnumC0487p enumC0487p = c2237c != null ? ((C0492v) c2237c.f18678l).f7065a : null;
        ArrayList arrayList = this.f7072l;
        EnumC0487p enumC0487p2 = arrayList.isEmpty() ? null : (EnumC0487p) arrayList.get(arrayList.size() - 1);
        EnumC0487p enumC0487p3 = this.f7068g;
        kotlin.jvm.internal.l.f("state1", enumC0487p3);
        if (enumC0487p == null || enumC0487p.compareTo(enumC0487p3) >= 0) {
            enumC0487p = enumC0487p3;
        }
        return (enumC0487p2 == null || enumC0487p2.compareTo(enumC0487p) >= 0) ? enumC0487p : enumC0487p2;
    }

    public final void o(String str) {
        if (this.f7067e) {
            C2191a.Q().f18496n.getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(L1.a.n("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void p(EnumC0486o enumC0486o) {
        kotlin.jvm.internal.l.f("event", enumC0486o);
        o("handleLifecycleEvent");
        q(enumC0486o.a());
    }

    public final void q(EnumC0487p enumC0487p) {
        if (this.f7068g == enumC0487p) {
            return;
        }
        InterfaceC0491u interfaceC0491u = (InterfaceC0491u) this.f7069h.get();
        EnumC0487p enumC0487p2 = this.f7068g;
        kotlin.jvm.internal.l.f("current", enumC0487p2);
        kotlin.jvm.internal.l.f("next", enumC0487p);
        EnumC0487p enumC0487p3 = EnumC0487p.f7059l;
        EnumC0487p enumC0487p4 = EnumC0487p.f7058k;
        if (enumC0487p2 == enumC0487p3 && enumC0487p == enumC0487p4) {
            throw new IllegalStateException(("State must be at least '" + EnumC0487p.f7060m + "' to be moved to '" + enumC0487p + "' in component " + interfaceC0491u).toString());
        }
        if (enumC0487p2 == enumC0487p4 && enumC0487p2 != enumC0487p) {
            throw new IllegalStateException(("State is '" + enumC0487p4 + "' and cannot be moved to `" + enumC0487p + "` in component " + interfaceC0491u).toString());
        }
        this.f7068g = enumC0487p;
        if (this.f7070j || this.i != 0) {
            this.f7071k = true;
            return;
        }
        this.f7070j = true;
        s();
        this.f7070j = false;
        if (this.f7068g == enumC0487p4) {
            this.f = new C2235a();
        }
    }

    public final void r(EnumC0487p enumC0487p) {
        kotlin.jvm.internal.l.f("state", enumC0487p);
        o("setCurrentState");
        q(enumC0487p);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        r12.f7071k = false;
        r12.f7073m.i(r12.f7068g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0039, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void s() {
        InterfaceC0491u interfaceC0491u = (InterfaceC0491u) this.f7069h.get();
        if (interfaceC0491u == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C2235a c2235a = this.f;
            if (c2235a.f18687n != 0) {
                C2237c c2237c = c2235a.f18684k;
                kotlin.jvm.internal.l.c(c2237c);
                EnumC0487p enumC0487p = ((C0492v) c2237c.f18678l).f7065a;
                C2237c c2237c2 = this.f.f18685l;
                kotlin.jvm.internal.l.c(c2237c2);
                EnumC0487p enumC0487p2 = ((C0492v) c2237c2.f18678l).f7065a;
                if (enumC0487p == enumC0487p2 && this.f7068g == enumC0487p2) {
                    break;
                }
                this.f7071k = false;
                EnumC0487p enumC0487p3 = this.f7068g;
                C2237c c2237c3 = this.f.f18684k;
                kotlin.jvm.internal.l.c(c2237c3);
                if (enumC0487p3.compareTo(((C0492v) c2237c3.f18678l).f7065a) < 0) {
                    C2235a c2235a2 = this.f;
                    C2236b c2236b = new C2236b(c2235a2.f18685l, c2235a2.f18684k, 1);
                    c2235a2.f18686m.put(c2236b, Boolean.FALSE);
                    while (c2236b.hasNext() && !this.f7071k) {
                        Map.Entry entry = (Map.Entry) c2236b.next();
                        kotlin.jvm.internal.l.c(entry);
                        InterfaceC0490t interfaceC0490t = (InterfaceC0490t) entry.getKey();
                        C0492v c0492v = (C0492v) entry.getValue();
                        while (c0492v.f7065a.compareTo(this.f7068g) > 0 && !this.f7071k && this.f.f18673o.containsKey(interfaceC0490t)) {
                            C0484m c0484m = EnumC0486o.Companion;
                            EnumC0487p enumC0487p4 = c0492v.f7065a;
                            c0484m.getClass();
                            kotlin.jvm.internal.l.f("state", enumC0487p4);
                            int ordinal = enumC0487p4.ordinal();
                            EnumC0486o enumC0486o = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : EnumC0486o.ON_PAUSE : EnumC0486o.ON_STOP : EnumC0486o.ON_DESTROY;
                            if (enumC0486o == null) {
                                throw new IllegalStateException("no event down from " + c0492v.f7065a);
                            }
                            this.f7072l.add(enumC0486o.a());
                            c0492v.a(interfaceC0491u, enumC0486o);
                            ArrayList arrayList = this.f7072l;
                            arrayList.remove(arrayList.size() - 1);
                        }
                    }
                }
                C2237c c2237c4 = this.f.f18685l;
                if (!this.f7071k && c2237c4 != null && this.f7068g.compareTo(((C0492v) c2237c4.f18678l).f7065a) > 0) {
                    C2235a c2235a3 = this.f;
                    c2235a3.getClass();
                    C2238d c2238d = new C2238d(c2235a3);
                    c2235a3.f18686m.put(c2238d, Boolean.FALSE);
                    while (c2238d.hasNext() && !this.f7071k) {
                        Map.Entry entry2 = (Map.Entry) c2238d.next();
                        InterfaceC0490t interfaceC0490t2 = (InterfaceC0490t) entry2.getKey();
                        C0492v c0492v2 = (C0492v) entry2.getValue();
                        while (c0492v2.f7065a.compareTo(this.f7068g) < 0 && !this.f7071k && this.f.f18673o.containsKey(interfaceC0490t2)) {
                            this.f7072l.add(c0492v2.f7065a);
                            C0484m c0484m2 = EnumC0486o.Companion;
                            EnumC0487p enumC0487p5 = c0492v2.f7065a;
                            c0484m2.getClass();
                            kotlin.jvm.internal.l.f("state", enumC0487p5);
                            int ordinal2 = enumC0487p5.ordinal();
                            EnumC0486o enumC0486o2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : EnumC0486o.ON_RESUME : EnumC0486o.ON_START : EnumC0486o.ON_CREATE;
                            if (enumC0486o2 == null) {
                                throw new IllegalStateException("no event up from " + c0492v2.f7065a);
                            }
                            c0492v2.a(interfaceC0491u, enumC0486o2);
                            ArrayList arrayList2 = this.f7072l;
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
