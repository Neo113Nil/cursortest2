package f6;

import java.io.Serializable;

/* renamed from: f6.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1111d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f13000a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f13001b;

    public C1111d(Object obj, Object obj2) {
        this.f13000a = obj;
        this.f13001b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1111d)) {
            return false;
        }
        C1111d c1111d = (C1111d) obj;
        return t6.h.a(this.f13000a, c1111d.f13000a) && t6.h.a(this.f13001b, c1111d.f13001b);
    }

    public final int hashCode() {
        Object obj = this.f13000a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f13001b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f13000a + ", " + this.f13001b + ')';
    }
}
