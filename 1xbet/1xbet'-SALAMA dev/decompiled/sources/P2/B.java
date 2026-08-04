package P2;

import F2.C0254t;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzbby;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f5405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f5406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final VersionInfoParcel f5407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final JSONObject f5408e = new JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f5409f = new AtomicBoolean(false);

    public B(Context context, List list, VersionInfoParcel versionInfoParcel) {
        this.f5404a = context;
        this.f5405b = context.getApplicationInfo();
        this.f5406c = list;
        this.f5407d = versionInfoParcel;
    }

    public final JSONObject a() {
        if (!this.f5409f.get()) {
            b();
        }
        return this.f5408e;
    }

    public final void b() {
        ApplicationInfo applicationInfo = this.f5405b;
        if (this.f5409f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfoT = null;
        if (applicationInfo != null) {
            try {
                packageInfoT = p097n3.c.a(this.f5404a).t(0, applicationInfo.packageName);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f5408e;
        if (packageInfoT != null) {
            try {
                jSONObject.put("vc", packageInfoT.versionCode);
                jSONObject.put("vnm", packageInfoT.versionName);
            } catch (JSONException e7) {
                E2.o.f1952C.f1961g.zzw(e7, "PawAppSignalGenerator.initialize");
                return;
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        List list = this.f5406c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) C0254t.f2723d.f2726c.zzb(zzbby.zzjN)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject.put("eid", arrayList);
        jSONObject.put("js", this.f5407d.f10834a);
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
