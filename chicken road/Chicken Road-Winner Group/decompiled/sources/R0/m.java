package R0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final a f1220a;

    /* renamed from: b, reason: collision with root package name */
    public final P0.d f1221b;

    public /* synthetic */ m(a aVar, P0.d dVar) {
        this.f1220a = aVar;
        this.f1221b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof m)) {
            m mVar = (m) obj;
            if (S0.r.e(this.f1220a, mVar.f1220a) && S0.r.e(this.f1221b, mVar.f1221b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1220a, this.f1221b});
    }

    public final String toString() {
        a1.e eVar = new a1.e(this);
        eVar.u(this.f1220a, "key");
        eVar.u(this.f1221b, "feature");
        return eVar.toString();
    }
}
