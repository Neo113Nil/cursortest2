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
import java.util.List;
import q5.AbstractActivityC1559c;
import w5.C1782b;
import w5.InterfaceC1783c;
import x5.InterfaceC1789a;
import x5.InterfaceC1790b;

/* loaded from: classes2.dex */
public class a implements InterfaceC1783c, InterfaceC1789a, u {

    /* renamed from: a, reason: collision with root package name */
    public final PackageManager f1769a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC1790b f1770b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f1771c;

    /* renamed from: d, reason: collision with root package name */
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
        HashMap hashMap = this.f1771c;
        if (hashMap == null) {
            pVar.error("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        ResolveInfo resolveInfo = (ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            pVar.error("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = pVar.hashCode();
        this.f1772d.put(Integer.valueOf(hashCode), pVar);
        Intent intent = new Intent();
        ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z4);
        ((AbstractActivityC1559c) ((o) this.f1770b).f5822a).startActivityForResult(intent, hashCode);
    }

    public final HashMap b() {
        List<ResolveInfo> queryIntentActivities;
        PackageManager.ResolveInfoFlags of;
        HashMap hashMap = this.f1771c;
        PackageManager packageManager = this.f1769a;
        if (hashMap == null) {
            this.f1771c = new HashMap();
            int i7 = Build.VERSION.SDK_INT;
            Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (i7 >= 33) {
                of = PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f1771c.put(str, resolveInfo);
            }
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : this.f1771c.keySet()) {
            hashMap2.put(str2, ((ResolveInfo) this.f1771c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // A5.u
    public final boolean onActivityResult(int i7, int i8, Intent intent) {
        HashMap hashMap = this.f1772d;
        if (!hashMap.containsKey(Integer.valueOf(i7))) {
            return false;
        }
        ((r) hashMap.remove(Integer.valueOf(i7))).success(i8 == -1 ? intent.getStringExtra("android.intent.extra.PROCESS_TEXT") : null);
        return true;
    }

    @Override // x5.InterfaceC1789a
    public final void onAttachedToActivity(InterfaceC1790b interfaceC1790b) {
        this.f1770b = interfaceC1790b;
        ((HashSet) ((o) interfaceC1790b).f5824c).add(this);
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivity() {
        ((HashSet) ((o) this.f1770b).f5824c).remove(this);
        this.f1770b = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onDetachedFromActivityForConfigChanges() {
        ((HashSet) ((o) this.f1770b).f5824c).remove(this);
        this.f1770b = null;
    }

    @Override // x5.InterfaceC1789a
    public final void onReattachedToActivityForConfigChanges(InterfaceC1790b interfaceC1790b) {
        this.f1770b = interfaceC1790b;
        ((HashSet) ((o) interfaceC1790b).f5824c).add(this);
    }

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
    }
}
