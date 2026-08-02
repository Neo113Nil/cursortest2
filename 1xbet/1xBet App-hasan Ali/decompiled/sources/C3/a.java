package C3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import k3.InterfaceC2035c;
import k3.g;
import m3.h;

/* loaded from: classes.dex */
public final class a extends h implements InterfaceC2035c {

    /* renamed from: A, reason: collision with root package name */
    public final C0.c f835A;

    /* renamed from: B, reason: collision with root package name */
    public final Bundle f836B;

    /* renamed from: C, reason: collision with root package name */
    public final Integer f837C;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f838z;

    public a(Context context, Looper looper, C0.c cVar, Bundle bundle, g gVar, k3.h hVar) {
        super(context, looper, 44, cVar, gVar, hVar);
        this.f838z = true;
        this.f835A = cVar;
        this.f836B = bundle;
        this.f837C = (Integer) cVar.f815g;
    }

    @Override // m3.AbstractC2095e, k3.InterfaceC2035c
    public final int g() {
        return 12451000;
    }

    @Override // m3.AbstractC2095e, k3.InterfaceC2035c
    public final boolean m() {
        return this.f838z;
    }

    @Override // m3.AbstractC2095e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof d ? (d) queryLocalInterface : new d(iBinder, "com.google.android.gms.signin.internal.ISignInService", 1);
    }

    @Override // m3.AbstractC2095e
    public final Bundle r() {
        C0.c cVar = this.f835A;
        boolean equals = this.f18025c.getPackageName().equals((String) cVar.f813d);
        Bundle bundle = this.f836B;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) cVar.f813d);
        }
        return bundle;
    }

    @Override // m3.AbstractC2095e
    public final String u() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // m3.AbstractC2095e
    public final String v() {
        return "com.google.android.gms.signin.service.START";
    }
}
