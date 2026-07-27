package c1;

/* renamed from: c1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0309b {

    /* renamed from: a, reason: collision with root package name */
    public final long f4899a;

    /* renamed from: b, reason: collision with root package name */
    public final V0.i f4900b;

    /* renamed from: c, reason: collision with root package name */
    public final V0.h f4901c;

    public C0309b(long j2, V0.i iVar, V0.h hVar) {
        this.f4899a = j2;
        this.f4900b = iVar;
        this.f4901c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0309b)) {
            return false;
        }
        C0309b c0309b = (C0309b) obj;
        return this.f4899a == c0309b.f4899a && this.f4900b.equals(c0309b.f4900b) && this.f4901c.equals(c0309b.f4901c);
    }

    public final int hashCode() {
        long j2 = this.f4899a;
        return ((((((int) ((j2 >>> 32) ^ j2)) ^ 1000003) * 1000003) ^ this.f4900b.hashCode()) * 1000003) ^ this.f4901c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f4899a + ", transportContext=" + this.f4900b + ", event=" + this.f4901c + "}";
    }
}
