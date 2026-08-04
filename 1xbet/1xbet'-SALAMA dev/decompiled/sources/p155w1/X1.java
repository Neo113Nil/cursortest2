package p155w1;

import D1.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class X1 extends a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f17590A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final String f17591B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final String f17592C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Map f17593D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final Map f17594E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f17595F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final List f17596G;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f17598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f17599e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f17600f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f17601x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f17602y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f17603z;

    public X1(int i7, String str, long j, String str2, String str3, String str4, int i8, int i9, HashMap map, HashMap map2, List list, String str5, String str6) {
        super(2, (byte) 0);
        this.f17597c = i7;
        this.f17598d = str;
        this.f17599e = j;
        this.f17600f = str2 != null ? str2 : "";
        this.f17601x = str3 != null ? str3 : "";
        this.f17602y = str4 != null ? str4 : "";
        this.f17603z = i8;
        this.f17590A = i9;
        this.f17593D = map != null ? map : new HashMap();
        this.f17594E = map2 != null ? map2 : new HashMap();
        this.f17595F = 1;
        this.f17596G = list != null ? list : new ArrayList();
        this.f17591B = str5 != null ? AbstractC0997i0.n(str5) : "";
        this.f17592C = str6;
    }

    @Override // D1.a
    public final JSONObject a() throws JSONException {
        JSONObject jSONObjectA = super.a();
        jSONObjectA.put("fl.error.id", this.f17597c);
        jSONObjectA.put("fl.error.name", this.f17598d);
        jSONObjectA.put("fl.error.timestamp", this.f17599e);
        jSONObjectA.put("fl.error.message", this.f17600f);
        jSONObjectA.put("fl.error.class", this.f17601x);
        jSONObjectA.put("fl.error.type", this.f17603z);
        jSONObjectA.put("fl.crash.report", this.f17602y);
        jSONObjectA.put("fl.crash.platform", this.f17590A);
        jSONObjectA.put("fl.error.user.crash.parameter", AbstractC0998i1.d(this.f17594E));
        jSONObjectA.put("fl.error.sdk.crash.parameter", AbstractC0998i1.d(this.f17593D));
        jSONObjectA.put("fl.breadcrumb.version", this.f17595F);
        JSONArray jSONArray = new JSONArray();
        List<N2> list = this.f17596G;
        if (list != null) {
            for (N2 n2 : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fl.breadcrumb.message", n2.f17483a);
                jSONObject.put("fl.breadcrumb.timestamp", n2.f17484b);
                jSONArray.put(jSONObject);
            }
        }
        jSONObjectA.put("fl.breadcrumb", jSONArray);
        jSONObjectA.put("fl.nativecrash.minidump", this.f17591B);
        jSONObjectA.put("fl.nativecrash.logcat", this.f17592C);
        return jSONObjectA;
    }
}
