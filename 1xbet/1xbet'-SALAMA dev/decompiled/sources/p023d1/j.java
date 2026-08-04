package p023d1;

/* JADX INFO: loaded from: classes.dex */
public final class j extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12368a = g.f12362c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        return this.f12368a.equals(((j) obj).f12368a);
    }

    public final int hashCode() {
        return this.f12368a.hashCode() + (j.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f12368a + '}';
    }
}
