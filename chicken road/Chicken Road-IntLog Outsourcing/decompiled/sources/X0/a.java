package X0;

import e4.InterfaceC0412a;

/* loaded from: classes.dex */
public final class a implements InterfaceC0412a {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f3505c = new Object();

    /* renamed from: a, reason: collision with root package name */
    public volatile b f3506a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f3507b;

    public static InterfaceC0412a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        a aVar = new a();
        aVar.f3507b = f3505c;
        aVar.f3506a = bVar;
        return aVar;
    }

    @Override // e4.InterfaceC0412a
    public final Object get() {
        Object obj = this.f3507b;
        Object obj2 = f3505c;
        if (obj == obj2) {
            synchronized (this) {
                try {
                    obj = this.f3507b;
                    if (obj == obj2) {
                        obj = this.f3506a.get();
                        Object obj3 = this.f3507b;
                        if (obj3 != obj2 && obj3 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj3 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f3507b = obj;
                        this.f3506a = null;
                    }
                } finally {
                }
            }
        }
        return obj;
    }
}
