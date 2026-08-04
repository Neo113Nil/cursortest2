package F1;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f2569c = new t(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2571b;

    public t(long j, long j3) {
        this.f2570a = j;
        this.f2571b = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2570a == tVar.f2570a && this.f2571b == tVar.f2571b;
    }

    public final int hashCode() {
        return (((int) this.f2570a) * 31) + ((int) this.f2571b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.f2570a);
        sb.append(", position=");
        return AbstractC0486a1.i(sb, this.f2571b, "]");
    }
}
