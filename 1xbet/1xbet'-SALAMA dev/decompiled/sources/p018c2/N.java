package p018c2;

/* JADX INFO: loaded from: classes.dex */
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10202b;

    public N(int i7, boolean z4) {
        this.f10201a = i7;
        this.f10202b = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || N.class != obj.getClass()) {
            return false;
        }
        N n2 = (N) obj;
        return this.f10201a == n2.f10201a && this.f10202b == n2.f10202b;
    }

    public final int hashCode() {
        return (this.f10201a * 31) + (this.f10202b ? 1 : 0);
    }
}
