package C1;

import P1.b;
import T1.f;
import T1.o;
import a1.e;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.j;

/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    public o f195a;

    @Override // P1.b
    public final void onAttachedToEngine(P1.a binding) {
        j.e(binding, "binding");
        f fVar = binding.f1153b;
        j.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f1152a;
        j.d(context, "getApplicationContext(...)");
        this.f195a = new o(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        j.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        e eVar = new e(packageManager, 4, (ActivityManager) systemService);
        o oVar = this.f195a;
        if (oVar != null) {
            oVar.b(eVar);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }

    @Override // P1.b
    public final void onDetachedFromEngine(P1.a binding) {
        j.e(binding, "binding");
        o oVar = this.f195a;
        if (oVar != null) {
            oVar.b(null);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }
}
