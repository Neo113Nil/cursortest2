package S;

import P.o;
import Q.C0005c;
import Q.k;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.a {

    /* renamed from: y, reason: collision with root package name */
    public final k f492y;

    public d(Context context, Looper looper, C0005c c0005c, k kVar, o oVar, o oVar2) {
        super(context, looper, 270, c0005c, oVar, oVar2);
        this.f492y = kVar;
    }

    @Override // O.c
    public final int m() {
        return 203400000;
    }

    @Override // com.google.android.gms.common.internal.a
    public final IInterface n(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    @Override // com.google.android.gms.common.internal.a
    public final N.d[] o() {
        return Z.c.f534b;
    }

    @Override // com.google.android.gms.common.internal.a
    public final Bundle p() {
        this.f492y.getClass();
        return new Bundle();
    }

    @Override // com.google.android.gms.common.internal.a
    public final String r() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.a
    public final String s() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.a
    public final boolean t() {
        return true;
    }
}
