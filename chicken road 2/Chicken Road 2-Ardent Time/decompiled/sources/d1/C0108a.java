package d1;

/* renamed from: d1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0108a implements W0.b, X0.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.pm.PackageManager f2739a;

    /* renamed from: b, reason: collision with root package name */
    public X0.b f2740b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.HashMap f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f2742d = new java.util.HashMap();

    public C0108a(x0.e eVar) {
        this.f2739a = (android.content.pm.PackageManager) eVar.f8409b;
        eVar.f8410c = this;
    }

    public final void a(java.lang.String str, java.lang.String str2, boolean z2, Z0.j jVar) {
        if (this.f2740b == null) {
            jVar.a("error", "Plugin not bound to an Activity", null);
            return;
        }
        java.util.HashMap hashMap = this.f2741c;
        if (hashMap == null) {
            jVar.a("error", "Can not process text actions before calling queryTextActions", null);
            return;
        }
        android.content.pm.ResolveInfo resolveInfo = (android.content.pm.ResolveInfo) hashMap.get(str);
        if (resolveInfo == null) {
            jVar.a("error", "Text processing activity not found", null);
            return;
        }
        int hashCode = jVar.hashCode();
        this.f2742d.put(java.lang.Integer.valueOf(hashCode), jVar);
        android.content.Intent intent = new android.content.Intent();
        android.content.pm.ActivityInfo activityInfo = resolveInfo.activityInfo;
        intent.setClassName(activityInfo.packageName, activityInfo.name);
        intent.setAction("android.intent.action.PROCESS_TEXT");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.PROCESS_TEXT", str2);
        intent.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", z2);
        ((P0.AbstractActivityC0047e) ((P1.h) this.f2740b).f1483a).startActivityForResult(intent, hashCode);
    }

    public final java.util.HashMap b() {
        java.util.List<android.content.pm.ResolveInfo> queryIntentActivities;
        android.content.pm.PackageManager.ResolveInfoFlags of;
        java.util.HashMap hashMap = this.f2741c;
        android.content.pm.PackageManager packageManager = this.f2739a;
        if (hashMap == null) {
            this.f2741c = new java.util.HashMap();
            android.content.Intent type = new android.content.Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
            if (android.os.Build.VERSION.SDK_INT >= 33) {
                of = android.content.pm.PackageManager.ResolveInfoFlags.of(0L);
                queryIntentActivities = packageManager.queryIntentActivities(type, of);
            } else {
                queryIntentActivities = packageManager.queryIntentActivities(type, 0);
            }
            for (android.content.pm.ResolveInfo resolveInfo : queryIntentActivities) {
                java.lang.String str = resolveInfo.activityInfo.name;
                resolveInfo.loadLabel(packageManager).toString();
                this.f2741c.put(str, resolveInfo);
            }
        }
        java.util.HashMap hashMap2 = new java.util.HashMap();
        for (java.lang.String str2 : this.f2741c.keySet()) {
            hashMap2.put(str2, ((android.content.pm.ResolveInfo) this.f2741c.get(str2)).loadLabel(packageManager).toString());
        }
        return hashMap2;
    }

    @Override // X0.a
    public final void onAttachedToActivity(X0.b bVar) {
        this.f2740b = bVar;
        ((java.util.HashSet) ((P1.h) bVar).f1485c).add(this);
    }

    @Override // X0.a
    public final void onDetachedFromActivity() {
        ((java.util.HashSet) ((P1.h) this.f2740b).f1485c).remove(this);
        this.f2740b = null;
    }

    @Override // X0.a
    public final void onDetachedFromActivityForConfigChanges() {
        ((java.util.HashSet) ((P1.h) this.f2740b).f1485c).remove(this);
        this.f2740b = null;
    }

    @Override // X0.a
    public final void onReattachedToActivityForConfigChanges(X0.b bVar) {
        this.f2740b = bVar;
        ((java.util.HashSet) ((P1.h) bVar).f1485c).add(this);
    }

    @Override // W0.b
    public final void onAttachedToEngine(W0.a aVar) {
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a aVar) {
    }
}
