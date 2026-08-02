package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: fa */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0204fa extends fk0 {

    /* JADX INFO: renamed from: a */
    public final long f2356a;

    /* JADX INFO: renamed from: b */
    public final long f2357b;

    /* JADX INFO: renamed from: c */
    public final C0758u9 f2358c;

    /* JADX INFO: renamed from: d */
    public final Integer f2359d;

    /* JADX INFO: renamed from: e */
    public final String f2360e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f2361f;

    public C0204fa(long j, long j2, C0758u9 c0758u9, Integer num, String str, ArrayList arrayList) {
        az0 az0Var = az0.f658j;
        this.f2356a = j;
        this.f2357b = j2;
        this.f2358c = c0758u9;
        this.f2359d = num;
        this.f2360e = str;
        this.f2361f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fk0)) {
            return false;
        }
        C0204fa c0204fa = (C0204fa) ((fk0) obj);
        if (this.f2356a != c0204fa.f2356a || this.f2357b != c0204fa.f2357b || !this.f2358c.equals(c0204fa.f2358c)) {
            return false;
        }
        Integer num = c0204fa.f2359d;
        Integer num2 = this.f2359d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = c0204fa.f2360e;
        String str2 = this.f2360e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f2361f.equals(c0204fa.f2361f)) {
            return false;
        }
        Object obj2 = az0.f658j;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j = this.f2356a;
        long j2 = this.f2357b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f2358c.hashCode()) * 1000003;
        Integer num = this.f2359d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f2360e;
        return ((this.f2361f.hashCode() ^ ((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003)) * 1000003) ^ az0.f658j.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f2356a + ", requestUptimeMs=" + this.f2357b + ", clientInfo=" + this.f2358c + ", logSource=" + this.f2359d + ", logSourceName=" + this.f2360e + ", logEvents=" + this.f2361f + ", qosTier=" + az0.f658j + "}";
    }
}
