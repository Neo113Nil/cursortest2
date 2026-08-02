package w1;

import android.content.Context;
import android.content.pm.PackageInfo;
import com.flurry.android.marketing.BuildConfig;
import e6.C1054c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: w1.e1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691e1 extends AbstractRunnableC1687d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17692a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1695f1 f17693b;

    public /* synthetic */ C1691e1(C1695f1 c1695f1, int i7) {
        this.f17692a = i7;
        this.f17693b = c1695f1;
    }

    @Override // w1.AbstractRunnableC1687d1
    public final void a() {
        String str;
        switch (this.f17692a) {
            case 0:
                boolean j = H2.a().f17403g.j();
                C1695f1 c1695f1 = this.f17693b;
                if (!j) {
                    H2.a().f17403g.i(c1695f1.f17710A);
                    break;
                } else {
                    c1695f1.d(new C1691e1(c1695f1, 1));
                    break;
                }
            default:
                C1695f1 c1695f12 = this.f17693b;
                I4.j jVar = c1695f12.f17711z;
                HashMap hashMap = new HashMap();
                hashMap.put("device_verifier", (String) jVar.f3679c);
                HashMap hashMap2 = new HashMap();
                G g3 = H2.a().f17403g.f17297A;
                String str2 = (String) g3.f17381a.get(H.AndroidAdvertisingId);
                if (str2 != null) {
                    hashMap2.put("gpaid", str2);
                }
                String str3 = (String) g3.f17381a.get(H.DeviceId);
                if (str3 != null) {
                    hashMap2.put("andid", str3);
                }
                hashMap.putAll(hashMap2);
                HashMap hashMap3 = new HashMap();
                byte[] bytes = ((String) H2.a().f17403g.f17297A.f17381a.get(H.AndroidInstallationId)).getBytes();
                if (bytes != null) {
                    hashMap3.put("flurry_guid", AbstractC1706i0.d(bytes));
                }
                hashMap3.put("flurry_project_api_key", H2.a().f17404h.f17883A);
                hashMap.putAll(hashMap3);
                HashMap hashMap4 = new HashMap();
                hashMap4.put("src", "flurryandroidsdk");
                hashMap4.put("srcv", BuildConfig.VERSION_NAME);
                Context context = (Context) jVar.f3680d;
                hashMap4.put("appsrc", context.getPackageName());
                PackageInfo j3 = AbstractC1707i1.j(context);
                if (j3 == null || (str = j3.versionName) == null) {
                    str = "Unknown";
                }
                hashMap4.put("appsrcv", str);
                hashMap.putAll(hashMap4);
                N0 n02 = new N0();
                n02.f17469e = "https://api.login.yahoo.com/oauth2/device_session";
                n02.f17470f = 3;
                HashMap hashMap5 = n02.f17466b.f1652a;
                List list = (List) hashMap5.get("Content-Type");
                if (list == null) {
                    list = new ArrayList();
                    hashMap5.put("Content-Type", list);
                }
                list.add("application/json");
                n02.f17461H = new JSONObject(hashMap).toString();
                n02.f17464K = new C1054c(28);
                n02.f17463J = new C1054c(28);
                n02.f17460G = new R4.c(this, 26);
                F0.d().l(c1695f12, n02);
                break;
        }
    }
}
