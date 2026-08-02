package w1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class X1 extends D1.a {

    /* renamed from: A, reason: collision with root package name */
    public final int f17584A;

    /* renamed from: B, reason: collision with root package name */
    public final String f17585B;

    /* renamed from: C, reason: collision with root package name */
    public final String f17586C;

    /* renamed from: D, reason: collision with root package name */
    public final Map f17587D;

    /* renamed from: E, reason: collision with root package name */
    public final Map f17588E;

    /* renamed from: F, reason: collision with root package name */
    public final int f17589F;

    /* renamed from: G, reason: collision with root package name */
    public final List f17590G;

    /* renamed from: c, reason: collision with root package name */
    public final int f17591c;

    /* renamed from: d, reason: collision with root package name */
    public final String f17592d;

    /* renamed from: e, reason: collision with root package name */
    public final long f17593e;

    /* renamed from: f, reason: collision with root package name */
    public final String f17594f;

    /* renamed from: x, reason: collision with root package name */
    public final String f17595x;

    /* renamed from: y, reason: collision with root package name */
    public final String f17596y;

    /* renamed from: z, reason: collision with root package name */
    public final int f17597z;

    public X1(int i7, String str, long j, String str2, String str3, String str4, int i8, int i9, HashMap hashMap, HashMap hashMap2, List list, String str5, String str6) {
        super(2, (byte) 0);
        this.f17591c = i7;
        this.f17592d = str;
        this.f17593e = j;
        this.f17594f = str2 != null ? str2 : "";
        this.f17595x = str3 != null ? str3 : "";
        this.f17596y = str4 != null ? str4 : "";
        this.f17597z = i8;
        this.f17584A = i9;
        this.f17587D = hashMap != null ? hashMap : new HashMap();
        this.f17588E = hashMap2 != null ? hashMap2 : new HashMap();
        this.f17589F = 1;
        this.f17590G = list != null ? list : new ArrayList();
        this.f17585B = str5 != null ? AbstractC1706i0.n(str5) : "";
        this.f17586C = str6;
    }

    @Override // D1.a
    public final JSONObject a() {
        JSONObject a2 = super.a();
        a2.put("fl.error.id", this.f17591c);
        a2.put("fl.error.name", this.f17592d);
        a2.put("fl.error.timestamp", this.f17593e);
        a2.put("fl.error.message", this.f17594f);
        a2.put("fl.error.class", this.f17595x);
        a2.put("fl.error.type", this.f17597z);
        a2.put("fl.crash.report", this.f17596y);
        a2.put("fl.crash.platform", this.f17584A);
        a2.put("fl.error.user.crash.parameter", AbstractC1707i1.d(this.f17588E));
        a2.put("fl.error.sdk.crash.parameter", AbstractC1707i1.d(this.f17587D));
        a2.put("fl.breadcrumb.version", this.f17589F);
        JSONArray jSONArray = new JSONArray();
        List<N2> list = this.f17590G;
        if (list != null) {
            for (N2 n2 : list) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("fl.breadcrumb.message", n2.f17477a);
                jSONObject.put("fl.breadcrumb.timestamp", n2.f17478b);
                jSONArray.put(jSONObject);
            }
        }
        a2.put("fl.breadcrumb", jSONArray);
        a2.put("fl.nativecrash.minidump", this.f17585B);
        a2.put("fl.nativecrash.logcat", this.f17586C);
        return a2;
    }
}
