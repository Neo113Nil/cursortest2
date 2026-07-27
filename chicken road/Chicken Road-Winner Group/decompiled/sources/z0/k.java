package z0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f10678a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f10679b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10680c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f10681d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10682e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final n f10683g;

    public k(long j3, Integer num, long j4, byte[] bArr, String str, long j5, n nVar) {
        this.f10678a = j3;
        this.f10679b = num;
        this.f10680c = j4;
        this.f10681d = bArr;
        this.f10682e = str;
        this.f = j5;
        this.f10683g = nVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f10678a != kVar.f10678a) {
            return false;
        }
        Integer num = this.f10679b;
        if (num == null) {
            if (kVar.f10679b != null) {
                return false;
            }
        } else if (!num.equals(kVar.f10679b)) {
            return false;
        }
        if (this.f10680c != kVar.f10680c) {
            return false;
        }
        if (!Arrays.equals(this.f10681d, rVar instanceof k ? ((k) rVar).f10681d : kVar.f10681d)) {
            return false;
        }
        String str = kVar.f10682e;
        String str2 = this.f10682e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f != kVar.f) {
            return false;
        }
        n nVar = kVar.f10683g;
        n nVar2 = this.f10683g;
        return nVar2 == null ? nVar == null : nVar2.equals(nVar);
    }

    public final int hashCode() {
        long j3 = this.f10678a;
        int i3 = (((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f10679b;
        int hashCode = (i3 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j4 = this.f10680c;
        int hashCode2 = (((hashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f10681d)) * 1000003;
        String str = this.f10682e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j5 = this.f;
        int i4 = (hashCode3 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        n nVar = this.f10683g;
        return i4 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f10678a + ", eventCode=" + this.f10679b + ", eventUptimeMs=" + this.f10680c + ", sourceExtension=" + Arrays.toString(this.f10681d) + ", sourceExtensionJsonProto3=" + this.f10682e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.f10683g + "}";
    }
}
