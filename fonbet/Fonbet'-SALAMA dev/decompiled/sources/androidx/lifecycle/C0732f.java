package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0732f implements r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9622a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9623b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9624c;

    public C0732f(DefaultLifecycleObserver defaultLifecycleObserver, r rVar) {
        t6.h.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9623b = defaultLifecycleObserver;
        this.f9624c = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0745t interfaceC0745t, EnumC0739m enumC0739m) {
        switch (this.f9622a) {
            case 0:
                int i7 = AbstractC0731e.f9621a[enumC0739m.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f9623b;
                switch (i7) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC0745t);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC0745t);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC0745t);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC0745t);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC0745t);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC0745t);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f9624c;
                if (rVar != null) {
                    rVar.a(interfaceC0745t, enumC0739m);
                    return;
                }
                return;
            case 1:
                if (enumC0739m == EnumC0739m.ON_START) {
                    ((AbstractC0741o) this.f9623b).b(this);
                    ((G0.f) this.f9624c).d();
                    return;
                }
                return;
            default:
                HashMap hashMap = ((C0728b) this.f9624c).f9614a;
                List list = (List) hashMap.get(enumC0739m);
                InterfaceC0744s interfaceC0744s = (InterfaceC0744s) this.f9623b;
                C0728b.a(list, interfaceC0745t, enumC0739m, interfaceC0744s);
                C0728b.a((List) hashMap.get(EnumC0739m.ON_ANY), interfaceC0745t, enumC0739m, interfaceC0744s);
                return;
        }
    }

    public C0732f(InterfaceC0744s interfaceC0744s) {
        this.f9623b = interfaceC0744s;
        C0730d c0730d = C0730d.f9618c;
        Class<?> cls = interfaceC0744s.getClass();
        C0728b c0728b = (C0728b) c0730d.f9619a.get(cls);
        this.f9624c = c0728b == null ? c0730d.a(cls, null) : c0728b;
    }

    public C0732f(G0.f fVar, AbstractC0741o abstractC0741o) {
        this.f9623b = abstractC0741o;
        this.f9624c = fVar;
    }
}
