package W3;

import i4.InterfaceC2015a;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l implements e, Serializable {

    /* renamed from: m, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f6039m = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "l");

    /* renamed from: k, reason: collision with root package name */
    public volatile InterfaceC2015a f6040k;

    /* renamed from: l, reason: collision with root package name */
    public volatile Object f6041l;

    @Override // W3.e
    public final Object getValue() {
        Object obj = this.f6041l;
        n nVar = n.f6045a;
        if (obj != nVar) {
            return obj;
        }
        InterfaceC2015a interfaceC2015a = this.f6040k;
        if (interfaceC2015a != null) {
            Object invoke = interfaceC2015a.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6039m;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, invoke)) {
                if (atomicReferenceFieldUpdater.get(this) != nVar) {
                }
            }
            this.f6040k = null;
            return invoke;
        }
        return this.f6041l;
    }

    public final String toString() {
        return this.f6041l != n.f6045a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
