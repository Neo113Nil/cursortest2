package B4;

import com.google.protobuf.AbstractC0867k;

/* JADX INFO: renamed from: B4.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0063g implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0867k f1159a;

    public C0063g(AbstractC0867k abstractC0867k) {
        this.f1159a = abstractC0867k;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return L4.r.c(this.f1159a, ((C0063g) obj).f1159a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0063g) {
            if (this.f1159a.equals(((C0063g) obj).f1159a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f1159a.hashCode();
    }

    public final String toString() {
        return "Blob { bytes=" + L4.r.i(this.f1159a) + " }";
    }
}
