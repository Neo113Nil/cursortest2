package T4;

import Y3.i;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import w1.C1726n0;

/* loaded from: classes2.dex */
public final class b extends c {

    /* renamed from: m, reason: collision with root package name */
    public final Integer f6349m;

    /* renamed from: n, reason: collision with root package name */
    public final String f6350n;

    public b(C1726n0 c1726n0, i iVar, Integer num, String str) {
        super(c1726n0, iVar);
        this.f6349m = num;
        this.f6350n = str;
    }

    @Override // T4.c
    public final String d() {
        return "GET";
    }

    @Override // T4.c
    public final Map h() {
        HashMap hashMap = new HashMap();
        String path = ((Uri) this.f6354b.f17807d).getPath();
        if (path == null) {
            path = "";
        } else if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (!path.isEmpty()) {
            hashMap.put("prefix", path.concat("/"));
        }
        hashMap.put("delimiter", "/");
        Integer num = this.f6349m;
        if (num != null) {
            hashMap.put("maxResults", Integer.toString(num.intValue()));
        }
        String str = this.f6350n;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("pageToken", str);
        }
        return hashMap;
    }

    @Override // T4.c
    public final Uri k() {
        C1726n0 c1726n0 = this.f6354b;
        return Uri.parse(((Uri) c1726n0.f17805b) + "/b/" + ((Uri) c1726n0.f17807d).getAuthority() + "/o");
    }
}
