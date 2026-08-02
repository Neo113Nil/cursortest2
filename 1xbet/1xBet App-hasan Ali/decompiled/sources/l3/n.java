package l3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final C2055b f17819a;

    /* renamed from: b, reason: collision with root package name */
    public final j3.d f17820b;

    public /* synthetic */ n(C2055b c2055b, j3.d dVar) {
        this.f17819a = c2055b;
        this.f17820b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof n)) {
            n nVar = (n) obj;
            if (m3.v.g(this.f17819a, nVar.f17819a) && m3.v.g(this.f17820b, nVar.f17820b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17819a, this.f17820b});
    }

    public final String toString() {
        v3.g gVar = new v3.g(this);
        gVar.s("key", this.f17819a);
        gVar.s("feature", this.f17820b);
        return gVar.toString();
    }
}
