package p044f6;

import java.io.Serializable;
import t6.h;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements b, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f13015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f13016b;

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, s6.a, t6.i] */
    @Override // p044f6.b
    public final Object getValue() {
        if (this.f13016b == h.f13013a) {
            ?? r7 = this.f13015a;
            h.b(r7);
            this.f13016b = r7.invoke();
            this.f13015a = null;
        }
        return this.f13016b;
    }

    public final String toString() {
        return this.f13016b != h.f13013a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
