package D4;

import H4.k;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f1741a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f1741a.equals(((b) obj).f1741a);
    }

    public final int hashCode() {
        return this.f1741a.hashCode();
    }
}
