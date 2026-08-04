package p044f6;

import java.io.Serializable;
import s6.a;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f13010a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f13011b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13012c;

    public g(a aVar) {
        h.e(aVar, "initializer");
        this.f13010a = aVar;
        this.f13011b = h.f13013a;
        this.f13012c = this;
    }

    @Override // p044f6.b
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f13011b;
        h hVar = h.f13013a;
        if (obj != hVar) {
            return obj;
        }
        synchronized (this.f13012c) {
            objInvoke = this.f13011b;
            if (objInvoke == hVar) {
                a aVar = this.f13010a;
                h.b(aVar);
                objInvoke = aVar.invoke();
                this.f13011b = objInvoke;
                this.f13010a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f13011b != h.f13013a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
