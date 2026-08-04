package T4;

import Y3.i;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Integer f6349m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6350n;

    public b(C1017n0 c1017n0, i iVar, Integer num, String str) {
        super(c1017n0, iVar);
        this.f6349m = num;
        this.f6350n = str;
    }

    @Override // T4.c
    public final String d() {
        return "GET";
    }

    @Override // T4.c
    public final Map h() {
        HashMap map = new HashMap();
        String path = ((Uri) this.f6354b.f17813d).getPath();
        if (path == null) {
            path = "";
        } else if (path.startsWith("/")) {
            path = path.substring(1);
        }
        if (!path.isEmpty()) {
            map.put("prefix", path.concat("/"));
        }
        map.put("delimiter", "/");
        Integer num = this.f6349m;
        if (num != null) {
            map.put("maxResults", Integer.toString(num.intValue()));
        }
        String str = this.f6350n;
        if (!TextUtils.isEmpty(str)) {
            map.put("pageToken", str);
        }
        return map;
    }

    @Override // T4.c
    public final Uri k() {
        C1017n0 c1017n0 = this.f6354b;
        return Uri.parse(((Uri) c1017n0.f17811b) + "/b/" + ((Uri) c1017n0.f17813d).getAuthority() + "/o");
    }
}
