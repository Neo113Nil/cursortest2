package f6;

import java.io.Serializable;

/* renamed from: f6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1117j implements InterfaceC1109b, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public t6.i f13009a;

    /* renamed from: b, reason: collision with root package name */
    public Object f13010b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s6.a, t6.i] */
    @Override // f6.InterfaceC1109b
    public final Object getValue() {
        if (this.f13010b == C1115h.f13007a) {
            ?? r02 = this.f13009a;
            t6.h.b(r02);
            this.f13010b = r02.invoke();
            this.f13009a = null;
        }
        return this.f13010b;
    }

    public final String toString() {
        return this.f13010b != C1115h.f13007a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
