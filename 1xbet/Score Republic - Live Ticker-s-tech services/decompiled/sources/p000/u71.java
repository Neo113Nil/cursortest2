package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class u71 extends e90 {

    /* JADX INFO: renamed from: A */
    public final boolean f7701A;

    /* JADX INFO: renamed from: B */
    public final C0902y5 f7702B;

    /* JADX INFO: renamed from: C */
    public final Bundle f7703C;

    /* JADX INFO: renamed from: D */
    public final Integer f7704D;

    public u71(Context context, Looper looper, C0902y5 c0902y5, Bundle bundle, j90 j90Var, k90 k90Var) {
        super(context, looper, 44, c0902y5, j90Var, k90Var);
        this.f7701A = true;
        this.f7702B = c0902y5;
        this.f7703C = bundle;
        this.f7704D = (Integer) c0902y5.f9159f;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: b */
    public final IInterface mo717b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof ql1 ? (ql1) iInterfaceQueryLocalInterface : new ql1(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: h */
    public final Bundle mo1464h() {
        C0902y5 c0902y5 = this.f7702B;
        boolean zEquals = this.f6048c.getPackageName().equals((String) c0902y5.f9156c);
        Bundle bundle = this.f7703C;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) c0902y5.f9156c);
        }
        return bundle;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: i */
    public final int mo719i() {
        return 12451000;
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: m */
    public final String mo720m() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: n */
    public final String mo721n() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // p000.AbstractC0575pb
    /* JADX INFO: renamed from: r */
    public final boolean mo3893r() {
        return this.f7701A;
    }
}
