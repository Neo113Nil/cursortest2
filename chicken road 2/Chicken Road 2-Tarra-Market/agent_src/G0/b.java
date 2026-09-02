package G0;

import C0.p;
import Q.C0005c;
import Y.e;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import s0.d;
import z0.C0865a;
import z0.InterfaceC0866b;

/* loaded from: classes.dex */
public class b implements InterfaceC0866b, A0.a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f174a;

    /* renamed from: b, reason: collision with root package name */
    public A0.b f175b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f176c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f177d = new HashMap();

    public b(e eVar) {
        this.f174a = (PackageManager) eVar.f523b;
        eVar.f524c = this;
    }

    public final void a(String str, String str2, boolean z2, p pVar) {
        if (this.f175b == null) {
            pVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f176c;
        if (hashMap == null) {
            pVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            pVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = pVar.hashCode();
        this.f177d.put(Integer.valueOf(hashCode), pVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((d) ((C0005c) this.f175b).f400a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f176c;
        PackageManager packageManager = this.f174a;
        if (hashMap == null) {
            this.f176c = new HashMap();
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
                this.f176c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f176c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f176c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // A0.a
    public final void onAttachedToActivity(A0.b bVar) {
        this.f175b = bVar;
        ((HashSet) ((C0005c) bVar).f402c).add(this);
    }

    @Override // A0.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((C0005c) this.f175b).f402c).remove(this);
        this.f175b = null;
    }

    @Override // A0.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((C0005c) this.f175b).f402c).remove(this);
        this.f175b = null;
    }

    @Override // A0.a
    public final void onReattachedToActivityForConfigChanges(A0.b bVar) {
        this.f175b = bVar;
        ((HashSet) ((C0005c) bVar).f402c).add(this);
    }

    @Override // z0.InterfaceC0866b
    public final void onAttachedToEngine(C0865a c0865a) {
    }

    @Override // z0.InterfaceC0866b
    public final void onDetachedFromEngine(C0865a c0865a) {
    }
}
