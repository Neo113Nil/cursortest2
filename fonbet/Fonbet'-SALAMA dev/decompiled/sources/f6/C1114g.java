package f6;

import java.io.Serializable;

/* renamed from: f6.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1114g implements InterfaceC1109b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public s6.a f13004a;

    /* renamed from: b, reason: collision with root package name */
    public volatile Object f13005b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f13006c;

    public C1114g(s6.a aVar) {
        t6.h.e(aVar, "initializer");
        this.f13004a = aVar;
        this.f13005b = C1115h.f13007a;
        this.f13006c = this;
    }

    @Override // f6.InterfaceC1109b
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f13005b;
        C1115h c1115h = C1115h.f13007a;
        if (obj2 != c1115h) {
            return obj2;
        }
        synchronized (this.f13006c) {
            obj = this.f13005b;
            if (obj == c1115h) {
                s6.a aVar = this.f13004a;
                t6.h.b(aVar);
                obj = aVar.invoke();
                this.f13005b = obj;
                this.f13004a = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f13005b != C1115h.f13007a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
