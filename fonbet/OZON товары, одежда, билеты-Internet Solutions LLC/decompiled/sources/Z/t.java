package Z;

import Z.o;

/* loaded from: classes8.dex */
final class t extends o.c {

    /* renamed from: a, reason: collision with root package name */
    private final int f35285a;

    /* renamed from: b, reason: collision with root package name */
    private final long f35286b;

    t(int i11, long j11) {
        this.f35285a = i11;
        this.f35286b = j11;
    }

    @Override // Z.o.c
    public final int a() {
        return this.f35285a;
    }

    @Override // Z.o.c
    public final long b() {
        return this.f35286b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o.c)) {
            return false;
        }
        o.c cVar = (o.c) obj;
        return this.f35285a == cVar.a() && this.f35286b == cVar.b();
    }

    public final int hashCode() {
        int i11 = (this.f35285a ^ 1000003) * 1000003;
        long j11 = this.f35286b;
        return i11 ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PacketInfo{sizeInBytes=");
        sb2.append(this.f35285a);
        sb2.append(", timestampNs=");
        return P4.f.a(this.f35286b, "}", sb2);
    }
}
