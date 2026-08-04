package D5;

import A5.p;
import A5.r;
import A5.u;
import Q3.o;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.google.android.gms.common.internal.w;
import java.util.HashMap;
import java.util.HashSet;
import p159w5.c;
import p164x5.b;

/* JADX INFO: loaded from: classes2.dex */
public class a implements c, p164x5.a, u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f1769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f1770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public HashMap f1771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f1772d = new HashMap();

    public a(w wVar) {
        this.f1769a = (PackageManager) wVar.f11335b;
        wVar.f11336c = this;
    }

    public final void a(String str, String str2, boolean z4, p pVar) {
        if (this.f1770b == null) {
            pVar.error("error", "Plugin not bound to an Activity", null);
            return;
        }
        HashMap map = this.f1771c;
        if (map == null) {
            pVar.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) map.get(str);
        if (resolveInfo == null) {
            pVar.error("error", "Text processing activity not found", null);
            return;
        }
        int iHashCode = pVar.hashCode();
        this.f1772d.put(Integer.valueOf(iHashCode), pVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        ((p121q5.c) ((o) this.f1770b).f5822a).startActivityForResult(intent, iHashCode);
    }

    public final HashMap b() {
        HashMap map = this.f1771c;
        PackageManager packageManager = this.f1769a;
        if (map == null) {
            this.f1771c = new HashMap();
            int i7 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            for (ResolveInfo resolveInfo : i7 >= 33 ? packageManager.queryIntentActivities(type, PackageManager.ResolveInfoFlags.of(0L)) : packageManager.queryIntentActivities(type, 0)) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f1771c.put(str, resolveInfo);
            }
        }
        HashMap map2 = new HashMap();
        for (String str2 : this.f1771c.keySet()) {
            map2.put(str2, ((ResolveInfo) this.f1771c.get(str2)).loadLabel(packageManager).toString());
        }
        return map2;
    }

    @Override // A5.u
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        HashMap map = this.f1772d;
        if (!map.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        ((r) map.remove(Integer.valueOf(i7))).success(i8 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // p164x5.a
    public final void onAttachedToActivity(b bVar) {
        this.f1770b = bVar;
        ((HashSet) ((o) bVar).f5824c).add(this);
    }

    @Override // p164x5.a
    public final void onDetachedFromActivity() {
        ((HashSet) ((o) this.f1770b).f5824c).remove(this);
        this.f1770b = null;
    }

    @Override // p164x5.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((o) this.f1770b).f5824c).remove(this);
        this.f1770b = null;
    }

    @Override // p164x5.a
    public final void onReattachedToActivityForConfigChanges(b bVar) {
        this.f1770b = bVar;
        ((HashSet) ((o) bVar).f5824c).add(this);
    }

    @Override // p159w5.c
    public final void onAttachedToEngine(p159w5.b bVar) {
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(p159w5.b bVar) {
    }
}
