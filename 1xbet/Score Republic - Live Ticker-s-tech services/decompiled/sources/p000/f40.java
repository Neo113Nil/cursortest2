package p000;

import android.util.Base64;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f40 {

    /* JADX INFO: renamed from: a */
    public final String f2302a;

    /* JADX INFO: renamed from: b */
    public final String f2303b;

    /* JADX INFO: renamed from: c */
    public final String f2304c;

    /* JADX INFO: renamed from: d */
    public final List f2305d;

    /* JADX INFO: renamed from: e */
    public final String f2306e;

    /* JADX INFO: renamed from: f */
    public final String f2307f;

    /* JADX INFO: renamed from: g */
    public final String f2308g;

    public f40(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f2302a = str;
        str2.getClass();
        this.f2303b = str2;
        this.f2304c = str3;
        list.getClass();
        this.f2305d = list;
        this.f2306e = str4;
        this.f2307f = str5;
        this.f2308g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2302a + ", mProviderPackage: " + this.f2303b + ", mQuery: " + this.f2304c + ", mSystemFont: " + this.f2306e + ", mVariationSettings: " + this.f2307f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f2305d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i2 = 0; i2 < list2.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
