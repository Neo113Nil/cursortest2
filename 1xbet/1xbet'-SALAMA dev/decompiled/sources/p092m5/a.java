package p092m5;

import A5.f;
import A5.s;
import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import p155w1.C1017n0;
import p159w5.b;
import p159w5.c;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public s f15282a;

    @Override // p159w5.c
    public final void onAttachedToEngine(b bVar) {
        h.e(bVar, "binding");
        f fVar = bVar.f18083c;
        h.d(fVar, "getBinaryMessenger(...)");
        Context context = bVar.f18081a;
        h.d(context, "getApplicationContext(...)");
        this.f15282a = new s(fVar, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = context.getPackageManager();
        h.d(packageManager, "getPackageManager(...)");
        Object systemService = context.getSystemService("activity");
        h.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ContentResolver contentResolver = context.getContentResolver();
        h.b(contentResolver);
        C1017n0 c1017n0 = new C1017n0(packageManager, (ActivityManager) systemService, contentResolver, 21);
        s sVar = this.f15282a;
        if (sVar != null) {
            sVar.b(c1017n0);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }

    @Override // p159w5.c
    public final void onDetachedFromEngine(b bVar) {
        h.e(bVar, "binding");
        s sVar = this.f15282a;
        if (sVar != null) {
            sVar.b(null);
        } else {
            h.h("methodChannel");
            throw null;
        }
    }
}
