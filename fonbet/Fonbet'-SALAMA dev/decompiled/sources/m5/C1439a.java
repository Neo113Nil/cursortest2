package m5;

import A5.f;
import A5.s;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import t6.h;
import w1.C1726n0;
import w5.C1782b;
import w5.InterfaceC1783c;

/* renamed from: m5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1439a implements InterfaceC1783c {

    /* renamed from: a, reason: collision with root package name */
    public s f15276a;

    @Override // w5.InterfaceC1783c
    public final void onAttachedToEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        f fVar = c1782b.f18077c;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = c1782b.f18075a;
        h.d(context, "getApplicationContext(...)");
        this.f15276a = new s(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        h.b(contentResolver);
        C1726n0 c1726n0 = new C1726n0(packageManager, (ActivityManager) systemService, contentResolver, 21);
        s sVar = this.f15276a;
        if (sVar != null) {
            sVar.b(c1726n0);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }

    @Override // w5.InterfaceC1783c
    public final void onDetachedFromEngine(C1782b c1782b) {
        h.e(c1782b, "binding");
        s sVar = this.f15276a;
        if (sVar != null) {
            sVar.b(null);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }
}
