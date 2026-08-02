package A3;

import W5.AbstractC0486a1;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f658a;

    /* renamed from: b, reason: collision with root package name */
    public final long f659b;

    public m(int i7, long j) {
        this.f658a = i7;
        this.f659b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f658a == mVar.f658a && this.f659b == mVar.f659b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f659b;
        return ((int) (j ^ (j >>> 32))) ^ ((this.f658a ^ 1000003) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventRecord{eventType=");
        sb.append(this.f658a);
        sb.append(", eventTimestamp=");
        return AbstractC0486a1.i(sb, this.f659b, "}");
    }
}
