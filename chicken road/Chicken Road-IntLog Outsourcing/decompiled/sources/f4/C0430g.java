package f4;

import java.io.Serializable;

/* renamed from: f4.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0430g implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f5668a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f5669b;

    public C0430g(Object obj, Object obj2) {
        this.f5668a = obj;
        this.f5669b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0430g)) {
            return false;
        }
        C0430g c0430g = (C0430g) obj;
        return kotlin.jvm.internal.i.a(this.f5668a, c0430g.f5668a) && kotlin.jvm.internal.i.a(this.f5669b, c0430g.f5669b);
    }

    public final int hashCode() {
        Object obj = this.f5668a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f5669b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f5668a + ", " + this.f5669b + ')';
    }
}
