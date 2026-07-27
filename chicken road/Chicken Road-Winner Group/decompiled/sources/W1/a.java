package W1;

import A0.h;
import I1.AbstractActivityC0027d;
import P1.b;
import S1.i;
import a1.e;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes.dex */
public class a implements b, Q1.a {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f1621a;

    /* renamed from: b, reason: collision with root package name */
    public Q1.b f1622b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1623c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1624d = new HashMap();

    public a(e eVar) {
        this.f1621a = (PackageManager) eVar.f1788b;
        eVar.f1789c = this;
    }

    public final void a(String str, String str2, boolean z3, i iVar) {
        if (this.f1622b == null) {
            iVar.b("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap hashMap = this.f1623c;
        if (hashMap == null) {
            iVar.b("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            iVar.b("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = iVar.hashCode();
        this.f1624d.put(Integer.valueOf(hashCode), iVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z3);
        ((AbstractActivityC0027d) ((h) this.f1622b).f54b).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f1623c;
        PackageManager packageManager = this.f1621a;
        if (hashMap == null) {
            this.f1623c = new HashMap();
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
                this.f1623c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f1623c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f1623c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // Q1.a
    public final void onAttachedToActivity(Q1.b bVar) {
        this.f1622b = bVar;
        ((HashSet) ((h) bVar).f56d).add(this);
    }

    @Override // Q1.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((h) this.f1622b).f56d).remove(this);
        this.f1622b = null;
    }

    @Override // Q1.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((h) this.f1622b).f56d).remove(this);
        this.f1622b = null;
    }

    @Override // Q1.a
    public final void onReattachedToActivityForConfigChanges(Q1.b bVar) {
        this.f1622b = bVar;
        ((HashSet) ((h) bVar).f56d).add(this);
    }

    @Override // P1.b
    public final void onAttachedToEngine(P1.a aVar) {
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a aVar) {
    }
}
