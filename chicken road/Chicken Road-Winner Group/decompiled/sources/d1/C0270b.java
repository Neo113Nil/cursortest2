package d1;

import A0.h;
import A0.j;
import P0.d;
import R0.l;
import Y1.C0077a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import f1.AbstractC0298b;

/* renamed from: d1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270b extends com.google.android.gms.common.internal.a {
    public final String y;

    /* renamed from: z, reason: collision with root package name */
    public final j f4844z;

    public C0270b(Context context, Looper looper, l lVar, l lVar2, h hVar) {
        super(context, looper, 23, hVar, lVar, lVar2);
        C0077a c0077a = new C0077a(8, this);
        this.y = "locationServices";
        this.f4844z = new j(c0077a);
    }

    @Override // Q0.c
    public final int d() {
        return 11717000;
    }

    @Override // com.google.android.gms.common.internal.a, Q0.c
    public final void i() {
        synchronized (this.f4844z) {
            if (a()) {
                try {
                    this.f4844z.R();
                    this.f4844z.getClass();
                } catch (Exception e3) {
                    Log.e("LocationClientImpl", "Client disconnected before listeners could be cleaned up", e3);
                }
            }
            super.i();
        }
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof C0269a ? (C0269a) queryLocalInterface : new C0269a(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final d[] o() {
        return AbstractC0298b.f4881b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        Bundle bundle = new Bundle();
        bundle.putString("client_name", this.y);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean u() {
        return true;
    }
}
