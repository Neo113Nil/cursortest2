package B0;

import M.j;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f130a;

    /* renamed from: b, reason: collision with root package name */
    public final long f131b;

    public a(int i3, long j3) {
        if (i3 == 0) {
            throw new NullPointerException("Null status");
        }
        this.f130a = i3;
        this.f131b = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return j.a(this.f130a, aVar.f130a) && this.f131b == aVar.f131b;
    }

    public final int hashCode() {
        int b3 = (j.b(this.f130a) ^ 1000003) * 1000003;
        long j3 = this.f131b;
        return b3 ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i3 = this.f130a;
        sb.append(i3 != 1 ? i3 != 2 ? i3 != 3 ? i3 != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        sb.append(this.f131b);
        sb.append("}");
        return sb.toString();
    }
}
