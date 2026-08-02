package W3;

import i4.InterfaceC2015a;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class p implements e, Serializable {

    /* renamed from: k, reason: collision with root package name */
    public InterfaceC2015a f6047k;

    /* renamed from: l, reason: collision with root package name */
    public Object f6048l;

    @Override // W3.e
    public final Object getValue() {
        if (this.f6048l == n.f6045a) {
            InterfaceC2015a interfaceC2015a = this.f6047k;
            kotlin.jvm.internal.l.c(interfaceC2015a);
            this.f6048l = interfaceC2015a.invoke();
            this.f6047k = null;
        }
        return this.f6048l;
    }

    public final String toString() {
        return this.f6048l != n.f6045a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
