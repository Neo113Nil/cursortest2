package L5;

/* JADX INFO: renamed from: L5.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C0343w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p167y2.j f4508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4510c;

    public C0343w(p167y2.j jVar) {
        this.f4508a = jVar;
        this.f4509b = jVar.f18170a;
        this.f4510c = jVar.f18171b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0343w)) {
            return false;
        }
        C0343w c0343w = (C0343w) obj;
        return this.f4509b == c0343w.f4509b && this.f4510c == c0343w.f4510c;
    }

    public final int hashCode() {
        return (this.f4509b * 31) + this.f4510c;
    }
}
