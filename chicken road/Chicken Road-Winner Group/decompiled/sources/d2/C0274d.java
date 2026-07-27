package d2;

import java.io.Serializable;
import kotlin.jvm.internal.j;

/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0274d implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4845a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f4846b;

    public C0274d(Object obj, Object obj2) {
        this.f4845a = obj;
        this.f4846b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0274d)) {
            return false;
        }
        C0274d c0274d = (C0274d) obj;
        return j.a(this.f4845a, c0274d.f4845a) && j.a(this.f4846b, c0274d.f4846b);
    }

    public final int hashCode() {
        Object obj = this.f4845a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4846b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4845a + ", " + this.f4846b + ')';
    }
}
