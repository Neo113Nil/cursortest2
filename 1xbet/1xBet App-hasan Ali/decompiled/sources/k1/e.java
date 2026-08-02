package k1;

import android.util.Base64;
import java.util.List;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f17558a;

    /* renamed from: b, reason: collision with root package name */
    public final String f17559b;

    /* renamed from: c, reason: collision with root package name */
    public final String f17560c;

    /* renamed from: d, reason: collision with root package name */
    public final List f17561d;

    /* renamed from: e, reason: collision with root package name */
    public final String f17562e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f17563g;

    public e(String str, String str2, String str3, List list, String str4, String str5) {
        str.getClass();
        this.f17558a = str;
        str2.getClass();
        this.f17559b = str2;
        this.f17560c = str3;
        list.getClass();
        this.f17561d = list;
        this.f17562e = str4;
        this.f = str5;
        this.f17563g = str + "-" + str2 + "-" + str3 + "-" + str4 + "-" + str5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f17558a + ", mProviderPackage: " + this.f17559b + ", mQuery: " + this.f17560c + ", mSystemFont: " + this.f17562e + ", mVariationSettings: " + this.f + ", mCertificates:");
        int i = 0;
        while (true) {
            List list = this.f17561d;
            if (i >= list.size()) {
                sb.append("}mCertificatesArray: 0");
                return sb.toString();
            }
            sb.append(" [");
            List list2 = (List) list.get(i);
            for (int i5 = 0; i5 < list2.size(); i5++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString((byte[]) list2.get(i5), 0));
                sb.append("\"");
            }
            sb.append(" ]");
            i++;
        }
    }
}
