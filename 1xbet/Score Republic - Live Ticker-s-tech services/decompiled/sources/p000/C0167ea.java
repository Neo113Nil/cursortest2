package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: ea */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0167ea extends bk0 {

    /* JADX INFO: renamed from: a */
    public final long f2030a;

    /* JADX INFO: renamed from: b */
    public final Integer f2031b;

    /* JADX INFO: renamed from: c */
    public final long f2032c;

    /* JADX INFO: renamed from: d */
    public final byte[] f2033d;

    /* JADX INFO: renamed from: e */
    public final String f2034e;

    /* JADX INFO: renamed from: f */
    public final long f2035f;

    /* JADX INFO: renamed from: g */
    public final yr0 f2036g;

    public C0167ea(long j, Integer num, long j2, byte[] bArr, String str, long j3, yr0 yr0Var) {
        this.f2030a = j;
        this.f2031b = num;
        this.f2032c = j2;
        this.f2033d = bArr;
        this.f2034e = str;
        this.f2035f = j3;
        this.f2036g = yr0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bk0) {
            bk0 bk0Var = (bk0) obj;
            C0167ea c0167ea = (C0167ea) bk0Var;
            if (this.f2030a == c0167ea.f2030a) {
                Integer num = c0167ea.f2031b;
                Integer num2 = this.f2031b;
                if (num2 != null ? num2.equals(num) : num == null) {
                    if (this.f2032c == c0167ea.f2032c) {
                        if (Arrays.equals(this.f2033d, bk0Var instanceof C0167ea ? ((C0167ea) bk0Var).f2033d : c0167ea.f2033d)) {
                            String str = c0167ea.f2034e;
                            String str2 = this.f2034e;
                            if (str2 != null ? str2.equals(str) : str == null) {
                                if (this.f2035f == c0167ea.f2035f) {
                                    yr0 yr0Var = c0167ea.f2036g;
                                    yr0 yr0Var2 = this.f2036g;
                                    if (yr0Var2 != null ? yr0Var2.equals(yr0Var) : yr0Var == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f2030a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f2031b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j2 = this.f2032c;
        int iHashCode2 = (((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f2033d)) * 1000003;
        String str = this.f2034e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j3 = this.f2035f;
        int i2 = (iHashCode3 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        yr0 yr0Var = this.f2036g;
        return i2 ^ (yr0Var != null ? yr0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f2030a + ", eventCode=" + this.f2031b + ", eventUptimeMs=" + this.f2032c + ", sourceExtension=" + Arrays.toString(this.f2033d) + ", sourceExtensionJsonProto3=" + this.f2034e + ", timezoneOffsetSeconds=" + this.f2035f + ", networkConnectionInfo=" + this.f2036g + "}";
    }
}
