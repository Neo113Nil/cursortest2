package p000;

/* JADX INFO: renamed from: ba */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0055ba {

    /* JADX INFO: renamed from: a */
    public final String f795a;

    /* JADX INFO: renamed from: b */
    public final String f796b;

    /* JADX INFO: renamed from: c */
    public final String f797c;

    /* JADX INFO: renamed from: d */
    public final C0611qa f798d;

    /* JADX INFO: renamed from: e */
    public final int f799e;

    public C0055ba(String str, String str2, String str3, C0611qa c0611qa, int i) {
        this.f795a = str;
        this.f796b = str2;
        this.f797c = str3;
        this.f798d = c0611qa;
        this.f799e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0055ba)) {
            return false;
        }
        C0055ba c0055ba = (C0055ba) obj;
        String str = c0055ba.f795a;
        String str2 = this.f795a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        String str3 = c0055ba.f796b;
        String str4 = this.f796b;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = c0055ba.f797c;
        String str6 = this.f797c;
        if (str6 == null) {
            if (str5 != null) {
                return false;
            }
        } else if (!str6.equals(str5)) {
            return false;
        }
        C0611qa c0611qa = c0055ba.f798d;
        C0611qa c0611qa2 = this.f798d;
        if (c0611qa2 == null) {
            if (c0611qa != null) {
                return false;
            }
        } else if (!c0611qa2.equals(c0611qa)) {
            return false;
        }
        int i = c0055ba.f799e;
        int i2 = this.f799e;
        if (i2 == 0) {
            return i == 0;
        }
        return AbstractC0024an.m278a(i2, i);
    }

    public final int hashCode() {
        String str = this.f795a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f796b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f797c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        C0611qa c0611qa = this.f798d;
        int iHashCode4 = (iHashCode3 ^ (c0611qa == null ? 0 : c0611qa.hashCode())) * 1000003;
        int i = this.f799e;
        return iHashCode4 ^ (i != 0 ? AbstractC0024an.m292o(i) : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("InstallationResponse{uri=");
        sb.append(this.f795a);
        sb.append(", fid=");
        sb.append(this.f796b);
        sb.append(", refreshToken=");
        sb.append(this.f797c);
        sb.append(", authToken=");
        sb.append(this.f798d);
        sb.append(", responseCode=");
        int i = this.f799e;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
