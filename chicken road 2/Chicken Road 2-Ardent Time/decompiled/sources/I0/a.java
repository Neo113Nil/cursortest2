package I0;

/* loaded from: classes.dex */
public final class a implements W0.b {

    /* renamed from: a, reason: collision with root package name */
    public I0.b f654a;

    @Override // W0.b
    public final void onAttachedToEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        a1.f fVar = binding.f1828b;
        kotlin.jvm.internal.i.d(fVar, "getBinaryMessenger(...)");
        android.content.Context context = binding.f1827a;
        kotlin.jvm.internal.i.d(context, "getApplicationContext(...)");
        this.f654a = new I0.b(fVar, "dev.fluttercommunity.plus/device_info");
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        kotlin.jvm.internal.i.d(packageManager, "getPackageManager(...)");
        java.lang.Object systemService = context.getSystemService("activity");
        kotlin.jvm.internal.i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        android.content.ContentResolver contentResolver = context.getContentResolver();
        kotlin.jvm.internal.i.b(contentResolver);
        I0.b bVar = new I0.b(packageManager, (android.app.ActivityManager) systemService, contentResolver, 0);
        I0.b bVar2 = this.f654a;
        if (bVar2 != null) {
            bVar2.M(bVar);
        } else {
            kotlin.jvm.internal.i.i("methodChannel");
            throw null;
        }
    }

    @Override // W0.b
    public final void onDetachedFromEngine(W0.a binding) {
        kotlin.jvm.internal.i.e(binding, "binding");
        I0.b bVar = this.f654a;
        if (bVar != null) {
            bVar.M(null);
        } else {
            kotlin.jvm.internal.i.i("methodChannel");
            throw null;
        }
    }
}
