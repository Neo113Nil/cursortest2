package b2;

import O.j;

/* renamed from: b2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0276b {

    /* renamed from: a, reason: collision with root package name */
    public final String f4805a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4807c;

    public C0276b(String str, long j2, int i2) {
        this.f4805a = str;
        this.f4806b = j2;
        this.f4807c = i2;
    }

    public static B3.d a() {
        B3.d dVar = new B3.d(7, (byte) 0);
        dVar.f278d = 0L;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0276b)) {
            return false;
        }
        C0276b c0276b = (C0276b) obj;
        String str = this.f4805a;
        if (str != null ? str.equals(c0276b.f4805a) : c0276b.f4805a == null) {
            if (this.f4806b == c0276b.f4806b) {
                int i2 = c0276b.f4807c;
                int i3 = this.f4807c;
                if (i3 == 0) {
                    if (i2 == 0) {
                        return true;
                    }
                } else if (j.a(i3, i2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f4805a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j2 = this.f4806b;
        int i2 = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        int i3 = this.f4807c;
        return (i3 != 0 ? j.b(i3) : 0) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f4805a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f4806b);
        sb.append(", responseCode=");
        int i2 = this.f4807c;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "AUTH_ERROR" : "BAD_CONFIG" : "OK");
        sb.append("}");
        return sb.toString();
    }
}
