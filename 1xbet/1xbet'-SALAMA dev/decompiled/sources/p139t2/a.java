package p139t2;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f16287b;

    public a(long j, long j3) {
        this.f16286a = j;
        this.f16287b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16286a == aVar.f16286a && this.f16287b == aVar.f16287b;
    }

    public final int hashCode() {
        return (((int) this.f16286a) * 31) + ((int) this.f16287b);
    }
}
