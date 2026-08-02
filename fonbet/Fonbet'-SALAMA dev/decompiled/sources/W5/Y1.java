package W5;

import a.AbstractC0603a;
import java.util.Arrays;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class Y1 {

    /* renamed from: a, reason: collision with root package name */
    public final U5.O f7095a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7096b;

    public Y1(U5.O o7, Object obj) {
        this.f7095a = o7;
        this.f7096b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Y1.class != obj.getClass()) {
            return false;
        }
        Y1 y12 = (Y1) obj;
        return AbstractC1464a.t(this.f7095a, y12.f7095a) && AbstractC1464a.t(this.f7096b, y12.f7096b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7095a, this.f7096b});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f7095a, "provider");
        u02.a(this.f7096b, "config");
        return u02.toString();
    }
}
