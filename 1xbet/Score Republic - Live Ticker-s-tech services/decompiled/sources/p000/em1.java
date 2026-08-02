package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class em1 extends e90 {

    /* JADX INFO: renamed from: A */
    public final vc1 f2145A;

    public em1(Context context, Looper looper, C0902y5 c0902y5, vc1 vc1Var, el1 el1Var, el1 el1Var2) {
        super(context, looper, 270, c0902y5, el1Var, el1Var2);
        this.f2145A = vc1Var;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: b */
    public final IInterface mo717b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof yl1 ? (yl1) iInterfaceQueryLocalInterface : new yl1(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: f */
    public final C0451lz[] mo718f() {
        return t22.f7264i;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: h */
    public final Bundle mo1464h() {
        vc1 vc1Var = this.f2145A;
        vc1Var.getClass();
        Bundle bundle = new Bundle();
        String str = vc1Var.f8176b;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: i */
    public final int mo719i() {
        return 203400000;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: m */
    public final String mo720m() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: n */
    public final String mo721n() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: o */
    public final boolean mo722o() {
        return true;
    }
}
