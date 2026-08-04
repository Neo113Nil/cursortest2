package androidx.lifecycle;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0711f implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9622a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f9624c;

    public C0711f(DefaultLifecycleObserver defaultLifecycleObserver, r rVar) {
        t6.h.e(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f9623b = defaultLifecycleObserver;
        this.f9624c = rVar;
    }

    @Override // androidx.lifecycle.r
    public final void a(InterfaceC0724t interfaceC0724t, EnumC0718m enumC0718m) {
        switch (this.f9622a) {
            case 0:
                int i7 = AbstractC0710e.f9621a[enumC0718m.ordinal()];
                DefaultLifecycleObserver defaultLifecycleObserver = (DefaultLifecycleObserver) this.f9623b;
                switch (i7) {
                    case 1:
                        defaultLifecycleObserver.onCreate(interfaceC0724t);
                        break;
                    case 2:
                        defaultLifecycleObserver.onStart(interfaceC0724t);
                        break;
                    case 3:
                        defaultLifecycleObserver.onResume(interfaceC0724t);
                        break;
                    case 4:
                        defaultLifecycleObserver.onPause(interfaceC0724t);
                        break;
                    case 5:
                        defaultLifecycleObserver.onStop(interfaceC0724t);
                        break;
                    case 6:
                        defaultLifecycleObserver.onDestroy(interfaceC0724t);
                        break;
                    case 7:
                        throw new IllegalArgumentException("ON_ANY must not been send by anybody");
                }
                r rVar = (r) this.f9624c;
                if (rVar != null) {
                    rVar.a(interfaceC0724t, enumC0718m);
                    return;
                }
                return;
            case 1:
                if (enumC0718m == EnumC0718m.ON_START) {
                    ((AbstractC0720o) this.f9623b).b(this);
                    ((G0.f) this.f9624c).d();
                    return;
                }
                return;
            default:
                HashMap map = ((C0707b) this.f9624c).f9614a;
                List list = (List) map.get(enumC0718m);
                InterfaceC0723s interfaceC0723s = (InterfaceC0723s) this.f9623b;
                C0707b.a(list, interfaceC0724t, enumC0718m, interfaceC0723s);
                C0707b.a((List) map.get(EnumC0718m.ON_ANY), interfaceC0724t, enumC0718m, interfaceC0723s);
                return;
        }
    }

    public C0711f(InterfaceC0723s interfaceC0723s) {
        this.f9623b = interfaceC0723s;
        C0709d c0709d = C0709d.f9618c;
        Class<?> cls = interfaceC0723s.getClass();
        C0707b c0707b = (C0707b) c0709d.f9619a.get(cls);
        this.f9624c = c0707b == null ? c0709d.a(cls, null) : c0707b;
    }

    public C0711f(G0.f fVar, AbstractC0720o abstractC0720o) {
        this.f9623b = abstractC0720o;
        this.f9624c = fVar;
    }
}
