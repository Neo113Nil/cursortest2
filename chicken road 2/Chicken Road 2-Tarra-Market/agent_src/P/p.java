package P;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final C0000a f341a;

    /* renamed from: b, reason: collision with root package name */
    public final N.d f342b;

    public /* synthetic */ p(C0000a c0000a, N.d dVar) {
        this.f341a = c0000a;
        this.f342b = dVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof p)) {
            p pVar = (p) obj;
            if (Q.s.e(this.f341a, pVar.f341a) && Q.s.e(this.f342b, pVar.f342b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f341a, this.f342b});
    }

    public final String toString() {
        Y.e eVar = new Y.e(this);
        eVar.m(this.f341a, "key");
        eVar.m(this.f342b, "feature");
        return eVar.toString();
    }
}
