package o3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import j3.d;
import l3.m;
import m3.h;
import m3.n;
import w3.AbstractC2553b;

/* renamed from: o3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2222c extends h {

    /* renamed from: z, reason: collision with root package name */
    public final n f18652z;

    public C2222c(Context context, Looper looper, C0.c cVar, n nVar, m mVar, m mVar2) {
        super(context, looper, 270, cVar, mVar, mVar2);
        this.f18652z = nVar;
    }

    @Override // m3.AbstractC2095e, k3.InterfaceC2035c
    public final int g() {
        return 203400000;
    }

    @Override // m3.AbstractC2095e
    public final IInterface o(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof C2220a ? (C2220a) queryLocalInterface : new C2220a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 1);
    }

    @Override // m3.AbstractC2095e
    public final d[] q() {
        return AbstractC2553b.f20531b;
    }

    @Override // m3.AbstractC2095e
    public final Bundle r() {
        this.f18652z.getClass();
        return new Bundle();
    }

    @Override // m3.AbstractC2095e
    public final String u() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // m3.AbstractC2095e
    public final String v() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // m3.AbstractC2095e
    public final boolean w() {
        return true;
    }
}
