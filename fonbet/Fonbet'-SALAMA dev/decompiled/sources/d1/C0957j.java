package d1;

/* renamed from: d1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0957j extends m {

    /* renamed from: a, reason: collision with root package name */
    public final C0954g f12362a = C0954g.f12356c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0957j.class != obj.getClass()) {
            return false;
        }
        return this.f12362a.equals(((C0957j) obj).f12362a);
    }

    public final int hashCode() {
        return this.f12362a.hashCode() + (C0957j.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f12362a + '}';
    }
}
