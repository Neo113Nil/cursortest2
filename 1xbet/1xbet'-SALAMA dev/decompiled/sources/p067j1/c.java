package p067j1;

import android.os.Build;
import p023d1.n;
import p060i1.a;
import p088m1.i;

/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f14556e = n.g("NetworkMeteredCtrlr");

    @Override // p067j1.b
    public final boolean a(i iVar) {
        return iVar.j.f12349a == 5;
    }

    @Override // p067j1.b
    public final boolean b(Object obj) {
        a aVar = (a) obj;
        boolean z4 = true;
        if (Build.VERSION.SDK_INT < 26) {
            n.d().b(f14556e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !aVar.f13835a;
        }
        if (aVar.f13835a && aVar.f13837c) {
            z4 = false;
        }
        return z4;
    }
}
