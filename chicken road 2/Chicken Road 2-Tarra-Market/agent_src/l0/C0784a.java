package l0;

import C0.b;
import C0.t;
import D0.f;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.j;
import z0.C0865a;
import z0.InterfaceC0866b;

/* renamed from: l0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0784a implements InterfaceC0866b {

    /* renamed from: a, reason: collision with root package name */
    public t f6082a;

    @Override // z0.InterfaceC0866b
    public final void onAttachedToEngine(C0865a binding) {
        j.e(binding, "binding");
        f fVar = binding.f6801b;
        j.d(fVar, "getBinaryMessenger(...)");
        Context context = binding.f6800a;
        j.d(context, "getApplicationContext(...)");
        this.f6082a = new t(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        j.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        j.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        j.b(contentResolver);
        b bVar = new b(packageManager, (ActivityManager) systemService, contentResolver, 4);
        t tVar = this.f6082a;
        if (tVar != null) {
            tVar.j(bVar);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }

    @Override // z0.InterfaceC0866b
    public final void onDetachedFromEngine(C0865a binding) {
        j.e(binding, "binding");
        t tVar = this.f6082a;
        if (tVar != null) {
            tVar.j(null);
        } else {
            j.g("methodChannel");
            throw null;
        }
    }
}
