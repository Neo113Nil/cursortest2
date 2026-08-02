package W3;

import i4.InterfaceC2015a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class m implements e, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2015a f6042k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Object f6043l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f6044m;

    public m(InterfaceC2015a interfaceC2015a) {
        kotlin.jvm.internal.l.f("initializer", interfaceC2015a);
        this.f6042k = interfaceC2015a;
        this.f6043l = n.f6045a;
        this.f6044m = this;
    }

    @Override // W3.e
    public final Object getValue() {
        Object obj;
        Object obj2 = this.f6043l;
        n nVar = n.f6045a;
        if (obj2 != nVar) {
            return obj2;
        }
        synchronized (this.f6044m) {
            obj = this.f6043l;
            if (obj == nVar) {
                InterfaceC2015a interfaceC2015a = this.f6042k;
                kotlin.jvm.internal.l.c(interfaceC2015a);
                obj = interfaceC2015a.invoke();
                this.f6043l = obj;
                this.f6042k = null;
            }
        }
        return obj;
    }

    public final String toString() {
        return this.f6043l != n.f6045a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
