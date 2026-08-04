package p088m1;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f15215b;

    public d(String str, int i7) {
        this.f15214a = str;
        this.f15215b = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f15215b != dVar.f15215b) {
            return false;
        }
        return this.f15214a.equals(dVar.f15214a);
    }

    public final int hashCode() {
        return (this.f15214a.hashCode() * 31) + this.f15215b;
    }
}
