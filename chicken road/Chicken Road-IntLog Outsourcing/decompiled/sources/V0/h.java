package V0;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3203b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3204c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3205d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3206e;

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f3207f;

    public h(String str, Integer num, k kVar, long j2, long j6, HashMap hashMap) {
        this.f3202a = str;
        this.f3203b = num;
        this.f3204c = kVar;
        this.f3205d = j2;
        this.f3206e = j6;
        this.f3207f = hashMap;
    }

    public final String a(String str) {
        String str2 = (String) this.f3207f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f3207f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final M0.e c() {
        M0.e eVar = new M0.e(2);
        String str = this.f3202a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        eVar.f1783c = str;
        eVar.f1784d = this.f3203b;
        k kVar = this.f3204c;
        if (kVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        eVar.f1785e = kVar;
        eVar.f1786f = Long.valueOf(this.f3205d);
        eVar.f1787g = Long.valueOf(this.f3206e);
        eVar.f1788h = new HashMap(this.f3207f);
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f3202a.equals(hVar.f3202a)) {
            Integer num = hVar.f3203b;
            Integer num2 = this.f3203b;
            if (num2 != null ? num2.equals(num) : num == null) {
                if (this.f3204c.equals(hVar.f3204c) && this.f3205d == hVar.f3205d && this.f3206e == hVar.f3206e && this.f3207f.equals(hVar.f3207f)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f3202a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f3203b;
        int hashCode2 = (((hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f3204c.hashCode()) * 1000003;
        long j2 = this.f3205d;
        int i2 = (hashCode2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j6 = this.f3206e;
        return ((i2 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ this.f3207f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f3202a + ", code=" + this.f3203b + ", encodedPayload=" + this.f3204c + ", eventMillis=" + this.f3205d + ", uptimeMillis=" + this.f3206e + ", autoMetadata=" + this.f3207f + "}";
    }
}
