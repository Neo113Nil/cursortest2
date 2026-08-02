package P0;

import a.AbstractC0444a;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class t implements g {

    /* renamed from: a, reason: collision with root package name */
    public final int f4673a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4674b;

    public t(int i, int i5) {
        this.f4673a = i;
        this.f4674b = i5;
    }

    @Override // P0.g
    public final void a(h hVar) {
        if (hVar.f4653n != -1) {
            hVar.f4653n = -1;
            hVar.f4654o = -1;
        }
        M0.e eVar = (M0.e) hVar.f4655p;
        int t5 = AbstractC0444a.t(this.f4673a, 0, eVar.c());
        int t6 = AbstractC0444a.t(this.f4674b, 0, eVar.c());
        if (t5 != t6) {
            if (t5 < t6) {
                hVar.g(t5, t6);
            } else {
                hVar.g(t6, t5);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f4673a == tVar.f4673a && this.f4674b == tVar.f4674b;
    }

    public final int hashCode() {
        return (this.f4673a * 31) + this.f4674b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.f4673a);
        sb.append(", end=");
        return AbstractC2107A.t(sb, this.f4674b, ')');
    }
}
