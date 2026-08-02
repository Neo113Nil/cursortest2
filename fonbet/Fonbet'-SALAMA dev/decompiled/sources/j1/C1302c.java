package j1;

import android.os.Build;
import d1.n;
import i1.C1242a;
import m1.i;

/* renamed from: j1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1302c extends AbstractC1301b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f14550e = n.g("NetworkMeteredCtrlr");

    @Override // j1.AbstractC1301b
    public final boolean a(i iVar) {
        return iVar.j.f12343a == 5;
    }

    @Override // j1.AbstractC1301b
    public final boolean b(Object obj) {
        C1242a c1242a = (C1242a) obj;
        boolean z4 = true;
        if (Build.VERSION.SDK_INT < 26) {
            n.d().b(f14550e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
            return !c1242a.f13829a;
        }
        if (c1242a.f13829a && c1242a.f13831c) {
            z4 = false;
        }
        return z4;
    }
}
