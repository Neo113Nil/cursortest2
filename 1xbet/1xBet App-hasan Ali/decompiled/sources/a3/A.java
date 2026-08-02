package a3;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import com.google.android.gms.internal.ads.F7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import r3.C2350b;

/* loaded from: classes.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6465a;

    /* renamed from: b, reason: collision with root package name */
    public final ApplicationInfo f6466b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6467c;

    /* renamed from: d, reason: collision with root package name */
    public final U2.a f6468d;

    /* renamed from: e, reason: collision with root package name */
    public final JSONObject f6469e = new JSONObject();
    public final AtomicBoolean f = new AtomicBoolean(false);

    public A(Context context, ArrayList arrayList, U2.a aVar) {
        this.f6465a = context;
        this.f6466b = context.getApplicationInfo();
        this.f6467c = arrayList;
        this.f6468d = aVar;
    }

    public final JSONObject a() {
        if (!this.f.get()) {
            b();
        }
        return this.f6469e;
    }

    public final void b() {
        if (this.f.getAndSet(true)) {
            return;
        }
        ApplicationInfo applicationInfo = this.f6466b;
        PackageInfo packageInfo = null;
        if (applicationInfo != null) {
            try {
                packageInfo = C2350b.a(this.f6465a).c(applicationInfo.packageName, 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        JSONObject jSONObject = this.f6469e;
        if (packageInfo != null) {
            try {
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e3) {
                P2.o.f4767B.f4774g.i("PawAppSignalGenerator.initialize", e3);
                return;
            }
        }
        if (applicationInfo != null) {
            jSONObject.put("pn", applicationInfo.packageName);
        }
        ArrayList arrayList = this.f6467c;
        ArrayList arrayList2 = new ArrayList();
        for (String str : ((String) Q2.r.f5053d.f5056c.a(F7.s9)).split(",", -1)) {
            if (arrayList.contains(str)) {
                arrayList2.add(str);
            }
        }
        jSONObject.put("eid", arrayList2);
        jSONObject.put("js", this.f6468d.f5852k);
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj != null) {
                jSONObject.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
    }
}
