package S;

import G.d;
import O.l;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class a implements M.a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f374a;

    /* renamed from: b, reason: collision with root package name */
    public d f375b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f376c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f377d = new HashMap();

    public a(C.a aVar) {
        this.f374a = (PackageManager) aVar.f4c;
        aVar.f5d = this;
    }

    public final void c(String str, String str2, boolean z2, l lVar) {
        if (this.f375b == null) {
            lVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f376c;
        if (hashMap == null) {
            lVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            lVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = lVar.hashCode();
        this.f377d.put(Integer.valueOf(hashCode), lVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        this.f375b.f173a.startActivityForResult(intent, hashCode);
    }

    public final HashMap d() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f376c;
        PackageManager packageManager = this.f374a;
        if (hashMap == null) {
            this.f376c = new HashMap();
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (Build.VERSION.SDK_INT >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f376c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f376c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f376c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // M.a
    public final void a(C.a aVar) {
    }

    @Override // M.a
    public final void b(C.a aVar) {
    }
}
