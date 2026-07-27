package n1;

import java.util.Arrays;

/* renamed from: n1.E, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1301E {

    /* renamed from: a, reason: collision with root package name */
    public final C1314a f11306a;

    /* renamed from: b, reason: collision with root package name */
    public final l1.d f11307b;

    public /* synthetic */ C1301E(C1314a c1314a, l1.d dVar) {
        this.f11306a = c1314a;
        this.f11307b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof C1301E)) {
            C1301E c1301e = (C1301E) obj;
            if (o1.u.j(this.f11306a, c1301e.f11306a) && o1.u.j(this.f11307b, c1301e.f11307b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f11306a, this.f11307b});
    }

    public final String toString() {
        B0.l lVar = new B0.l(this);
        lVar.c(this.f11306a, "key");
        lVar.c(this.f11307b, "feature");
        return lVar.toString();
    }
}
