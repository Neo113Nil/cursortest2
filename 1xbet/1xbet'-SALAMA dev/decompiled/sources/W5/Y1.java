package W5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U5.O f7095a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
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
        Y1 y4 = (Y1) obj;
        return p097n3.a.t(this.f7095a, y4.f7095a) && p097n3.a.t(this.f7096b, y4.f7096b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7095a, this.f7096b});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7095a, "provider");
        jVarU0.a(this.f7096b, "config");
        return jVarU0.toString();
    }
}
