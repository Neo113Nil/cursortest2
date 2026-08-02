package l2;

import android.os.Build;
import f2.m;
import k2.C2030a;
import o2.i;

/* loaded from: classes.dex */
public final class c extends b {

    /* renamed from: e, reason: collision with root package name */
    public static final String f17769e = m.f("NetworkMeteredCtrlr");

    @Override // l2.b
    public final boolean a(i iVar) {
        return iVar.f18640j.f16982a == 5;
    }

    @Override // l2.b
    public final boolean b(Object obj) {
        C2030a c2030a = (C2030a) obj;
        if (Build.VERSION.SDK_INT >= 26) {
            return (c2030a.f17578a && c2030a.f17580c) ? false : true;
        }
        m.d().a(f17769e, "Metered network constraint is not supported before API 26, only checking for connected state.", new Throwable[0]);
        return !c2030a.f17578a;
    }
}
