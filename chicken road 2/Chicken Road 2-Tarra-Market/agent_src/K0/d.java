package K0;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f199a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f200b;

    public d(Object obj, Object obj2) {
        this.f199a = obj;
        this.f200b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return j.a(this.f199a, dVar.f199a) && j.a(this.f200b, dVar.f200b);
    }

    public final int hashCode() {
        Object obj = this.f199a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f200b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f199a + ", " + this.f200b + ')';
    }
}
