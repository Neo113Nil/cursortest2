package z0;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class l extends s {

    /* renamed from: a, reason: collision with root package name */
    public final long f10684a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10685b;

    /* renamed from: c, reason: collision with root package name */
    public final j f10686c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f10687d;

    /* renamed from: e, reason: collision with root package name */
    public final String f10688e;
    public final ArrayList f;

    public l(long j3, long j4, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f10698a;
        this.f10684a = j3;
        this.f10685b = j4;
        this.f10686c = jVar;
        this.f10687d = num;
        this.f10688e = str;
        this.f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        if (this.f10684a != lVar.f10684a) {
            return false;
        }
        if (this.f10685b != lVar.f10685b) {
            return false;
        }
        if (!this.f10686c.equals(lVar.f10686c)) {
            return false;
        }
        Integer num = lVar.f10687d;
        Integer num2 = this.f10687d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str = lVar.f10688e;
        String str2 = this.f10688e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (!this.f.equals(lVar.f)) {
            return false;
        }
        Object obj2 = w.f10698a;
        return obj2.equals(obj2);
    }

    public final int hashCode() {
        long j3 = this.f10684a;
        long j4 = this.f10685b;
        int hashCode = (((((((int) (j3 ^ (j3 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003) ^ this.f10686c.hashCode()) * 1000003;
        Integer num = this.f10687d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f10688e;
        return ((((hashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ w.f10698a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f10684a + ", requestUptimeMs=" + this.f10685b + ", clientInfo=" + this.f10686c + ", logSource=" + this.f10687d + ", logSourceName=" + this.f10688e + ", logEvents=" + this.f + ", qosTier=" + w.f10698a + "}";
    }
}
