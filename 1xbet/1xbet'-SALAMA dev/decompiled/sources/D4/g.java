package D4;

import H4.n;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H4.h f1760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f1761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f1762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1763d;

    public g(H4.h hVar, n nVar, boolean z4, ArrayList arrayList) {
        this.f1760a = hVar;
        this.f1761b = nVar;
        this.f1762c = z4;
        this.f1763d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f1762c == gVar.f1762c && this.f1760a.equals(gVar.f1760a) && this.f1761b.equals(gVar.f1761b)) {
            return this.f1763d.equals(gVar.f1763d);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1763d.hashCode() + ((((this.f1761b.f3333a.hashCode() + (this.f1760a.f3318a.hashCode() * 31)) * 31) + (this.f1762c ? 1 : 0)) * 31);
    }
}
