package p155w1;

import I4.j;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.flurry.android.marketing.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;
import p036e6.c;

/* JADX INFO: renamed from: w1.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0982e1 extends AbstractRunnableC0978d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0986f1 f17699b;

    public /* synthetic */ C0982e1(C0986f1 c0986f1, int i7) {
        this.f17698a = i7;
        this.f17699b = c0986f1;
    }

    @Override // p155w1.AbstractRunnableC0978d1
    public final void a() {
        String str;
        switch (this.f17698a) {
            case 0:
                boolean zJ = H2.a().f17409g.j();
                C0986f1 c0986f1 = this.f17699b;
                if (!zJ) {
                    H2.a().f17409g.i(c0986f1.f17716A);
                } else {
                    c0986f1.d(new C0982e1(c0986f1, 1));
                }
                break;
            default:
                C0986f1 c0986f2 = this.f17699b;
                j jVar = c0986f2.f17717z;
                HashMap map = new HashMap();
                map.put("device_verifier", (String) jVar.f3679c);
                HashMap map2 = new HashMap();
                G g3 = H2.a().f17409g.f17303A;
                String str2 = (String) g3.f17387a.get(H.AndroidAdvertisingId);
                if (str2 != null) {
                    map2.put("gpaid", str2);
                }
                String str3 = (String) g3.f17387a.get(H.DeviceId);
                if (str3 != null) {
                    map2.put("andid", str3);
                }
                map.putAll(map2);
                HashMap map3 = new HashMap();
                byte[] bytes = ((String) H2.a().f17409g.f17303A.f17387a.get(H.AndroidInstallationId)).getBytes();
                if (bytes != null) {
                    map3.put("flurry_guid", AbstractC0997i0.d(bytes));
                }
                map3.put("flurry_project_api_key", H2.a().f17410h.f17889A);
                map.putAll(map3);
                HashMap map4 = new HashMap();
                map4.put("src", "flurryandroidsdk");
                map4.put("srcv", BuildConfig.VERSION_NAME);
                Context context = (Context) jVar.f3680d;
                map4.put("appsrc", context.getPackageName());
                PackageInfo packageInfoJ = AbstractC0998i1.j(context);
                if (packageInfoJ == null || (str = packageInfoJ.versionName) == null) {
                    str = "Unknown";
                }
                map4.put("appsrcv", str);
                map.putAll(map4);
                N0 n2 = new N0();
                n2.f17475e = "https://api.login.yahoo.com/oauth2/device_session";
                n2.f17476f = 3;
                HashMap map5 = n2.f17472b.f1652a;
                List arrayList = (List) map5.get("Content-Type");
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map5.put("Content-Type", arrayList);
                }
                arrayList.add("application/json");
                n2.f17467H = new JSONObject(map).toString();
                n2.f17470K = new c(28);
                n2.f17469J = new c(28);
                n2.f17466G = new R4.c(this, 26);
                F0.d().l(c0986f2, n2);
                break;
        }
    }
}
