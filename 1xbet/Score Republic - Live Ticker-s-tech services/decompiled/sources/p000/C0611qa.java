package p000;

/* JADX INFO: renamed from: qa */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0611qa {

    /* JADX INFO: renamed from: a */
    public final String f6432a;

    /* JADX INFO: renamed from: b */
    public final long f6433b;

    /* JADX INFO: renamed from: c */
    public final int f6434c;

    public C0611qa(int i, long j, String str) {
        this.f6432a = str;
        this.f6433b = j;
        this.f6434c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0611qa)) {
            return false;
        }
        C0611qa c0611qa = (C0611qa) obj;
        String str = c0611qa.f6432a;
        String str2 = this.f6432a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f6433b != c0611qa.f6433b) {
            return false;
        }
        int i = c0611qa.f6434c;
        int i2 = this.f6434c;
        if (i2 == 0) {
            return i == 0;
        }
        return AbstractC0024an.m278a(i2, i);
    }

    public final int hashCode() {
        String str = this.f6432a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j = this.f6433b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003;
        int i2 = this.f6434c;
        return i ^ (i2 != 0 ? AbstractC0024an.m292o(i2) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TokenResult{token=");
        sb.append(this.f6432a);
        sb.append(", tokenExpirationTimestamp=");
        sb.append(this.f6433b);
        sb.append(", responseCode=");
        int i = this.f6434c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
