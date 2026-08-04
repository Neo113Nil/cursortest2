package p120q4;

import p098n4.C0934g;
import p098n4.C0941n;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0941n f15865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0934g f15866b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f15865a.equals(fVar.f15865a)) {
            return this.f15866b.equals(fVar.f15866b);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15866b.hashCode() + (this.f15865a.hashCode() * 31);
    }
}
