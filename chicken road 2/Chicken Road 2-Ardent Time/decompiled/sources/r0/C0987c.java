package r0;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0987c extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final p0.C0958j f8349y;

    public C0987c(android.content.Context context, android.os.Looper looper, P1.h hVar, p0.C0958j c0958j, o0.m mVar, o0.m mVar2) {
        super(context, looper, 270, hVar, mVar, mVar2);
        this.f8349y = c0958j;
    }

    @Override // n0.InterfaceC0939c
    public final int m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.IInterface n(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof r0.C0985a ? (r0.C0985a) queryLocalInterface : new r0.C0985a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final m0.d[] o() {
        return y0.c.f8484b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final android.os.Bundle p() {
        this.f8349y.getClass();
        return new android.os.Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final java.lang.String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
