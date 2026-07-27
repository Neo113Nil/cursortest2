package A0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f59a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f60b;

    /* renamed from: c, reason: collision with root package name */
    public final n f61c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62d;

    /* renamed from: e, reason: collision with root package name */
    public final long f63e;
    public final HashMap f;

    public i(String str, Integer num, n nVar, long j3, long j4, HashMap hashMap) {
        this.f59a = str;
        this.f60b = num;
        this.f61c = nVar;
        this.f62d = j3;
        this.f63e = j4;
        this.f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final h c() {
        h hVar = new h();
        String str = this.f59a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        hVar.f54b = str;
        hVar.f55c = this.f60b;
        n nVar = this.f61c;
        if (nVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        hVar.f56d = nVar;
        hVar.f57e = Long.valueOf(this.f62d);
        hVar.f = Long.valueOf(this.f63e);
        hVar.f58g = new HashMap(this.f);
        return hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (!this.f59a.equals(iVar.f59a)) {
            return false;
        }
        Integer num = iVar.f60b;
        Integer num2 = this.f60b;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        return this.f61c.equals(iVar.f61c) && this.f62d == iVar.f62d && this.f63e == iVar.f63e && this.f.equals(iVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.f59a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f60b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f61c.hashCode()) * 1000003;
        long j3 = this.f62d;
        int i3 = (hashCode2 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f63e;
        return ((i3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f59a + ", code=" + this.f60b + ", encodedPayload=" + this.f61c + ", eventMillis=" + this.f62d + ", uptimeMillis=" + this.f63e + ", autoMetadata=" + this.f + "}";
    }
}
