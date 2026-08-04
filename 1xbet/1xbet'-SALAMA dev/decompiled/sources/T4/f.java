package T4;

import Y3.i;
import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f6365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f6366n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1017n0 c1017n0, i iVar, Uri uri, int i7) {
        super(c1017n0, iVar);
        this.f6365m = i7;
        switch (i7) {
            case 1:
                super(c1017n0, iVar);
                this.f6366n = uri;
                q("X-Goog-Upload-Protocol", "resumable");
                q("X-Goog-Upload-Command", "query");
                break;
            default:
                this.f6366n = uri;
                q("X-Goog-Upload-Protocol", "resumable");
                q("X-Goog-Upload-Command", "cancel");
                break;
        }
    }

    @Override // T4.c
    public final String d() {
        switch (this.f6365m) {
        }
        return "POST";
    }

    @Override // T4.c
    public JSONObject e() {
        switch (this.f6365m) {
            case 2:
                return (JSONObject) this.f6366n;
            default:
                return super.e();
        }
    }

    @Override // T4.c
    public Map h() {
        switch (this.f6365m) {
            case 2:
                HashMap map = new HashMap();
                String path = ((Uri) this.f6354b.f17813d).getPath();
                if (path == null) {
                    path = "";
                } else if (path.startsWith("/")) {
                    path = path.substring(1);
                }
                map.put("name", path);
                map.put("uploadType", "resumable");
                return map;
            default:
                return super.h();
        }
    }

    @Override // T4.c
    public final Uri k() {
        switch (this.f6365m) {
            case 0:
                return (Uri) this.f6366n;
            case 1:
                return (Uri) this.f6366n;
            default:
                C1017n0 c1017n0 = this.f6354b;
                String authority = ((Uri) c1017n0.f17813d).getAuthority();
                Uri.Builder builderBuildUpon = ((Uri) c1017n0.f17811b).buildUpon();
                builderBuildUpon.appendPath("b");
                builderBuildUpon.appendPath(authority);
                builderBuildUpon.appendPath("o");
                return builderBuildUpon.build();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C1017n0 c1017n0, i iVar, JSONObject jSONObject, String str) {
        super(c1017n0, iVar);
        this.f6365m = 2;
        this.f6366n = jSONObject;
        if (TextUtils.isEmpty(str)) {
            this.f6353a = new IllegalArgumentException("mContentType is null or empty");
        }
        q("X-Goog-Upload-Protocol", "resumable");
        q("X-Goog-Upload-Command", "start");
        q("X-Goog-Upload-Header-Content-Type", str);
    }
}
