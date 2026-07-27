package U0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class k extends r {

    /* renamed from: a, reason: collision with root package name */
    public final long f3128a;

    /* renamed from: b, reason: collision with root package name */
    public final Integer f3129b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3130c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3131d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3132e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3133f;

    /* renamed from: g, reason: collision with root package name */
    public final n f3134g;

    public k(long j2, Integer num, long j6, byte[] bArr, String str, long j7, n nVar) {
        this.f3128a = j2;
        this.f3129b = num;
        this.f3130c = j6;
        this.f3131d = bArr;
        this.f3132e = str;
        this.f3133f = j7;
        this.f3134g = nVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        k kVar = (k) rVar;
        if (this.f3128a == kVar.f3128a && ((num = this.f3129b) != null ? num.equals(kVar.f3129b) : kVar.f3129b == null)) {
            if (this.f3130c == kVar.f3130c) {
                if (Arrays.equals(this.f3131d, rVar instanceof k ? ((k) rVar).f3131d : kVar.f3131d)) {
                    String str = kVar.f3132e;
                    String str2 = this.f3132e;
                    if (str2 != null ? str2.equals(str) : str == null) {
                        if (this.f3133f == kVar.f3133f) {
                            n nVar = kVar.f3134g;
                            n nVar2 = this.f3134g;
                            if (nVar2 == null) {
                                if (nVar == null) {
                                    return true;
                                }
                            } else if (nVar2.equals(nVar)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f3128a;
        int i2 = (((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f3129b;
        int hashCode = (i2 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j6 = this.f3130c;
        int hashCode2 = (((hashCode ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f3131d)) * 1000003;
        String str = this.f3132e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j7 = this.f3133f;
        int i3 = (hashCode3 ^ ((int) (j7 ^ (j7 >>> 32)))) * 1000003;
        n nVar = this.f3134g;
        return i3 ^ (nVar != null ? nVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f3128a + ", eventCode=" + this.f3129b + ", eventUptimeMs=" + this.f3130c + ", sourceExtension=" + Arrays.toString(this.f3131d) + ", sourceExtensionJsonProto3=" + this.f3132e + ", timezoneOffsetSeconds=" + this.f3133f + ", networkConnectionInfo=" + this.f3134g + "}";
    }
}
