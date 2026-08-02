package v3;

import android.os.IBinder;
import android.os.IInterface;
import m3.h;

/* renamed from: v3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2536b extends h {
    @Override // m3.AbstractC2095e, k3.InterfaceC2035c
    public final int g() {
        return 212800000;
    }

    @Override // m3.AbstractC2095e
    public final /* synthetic */ IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof C2537c ? (C2537c) queryLocalInterface : new C2537c(iBinder);
    }

    @Override // m3.AbstractC2095e
    public final j3.d[] q() {
        return g3.d.f17162b;
    }

    @Override // m3.AbstractC2095e
    public final String u() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    @Override // m3.AbstractC2095e
    public final String v() {
        return "com.google.android.gms.appset.service.START";
    }

    @Override // m3.AbstractC2095e
    public final boolean w() {
        return true;
    }
}
