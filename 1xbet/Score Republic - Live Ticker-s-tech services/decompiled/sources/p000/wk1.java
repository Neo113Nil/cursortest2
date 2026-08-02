package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class wk1 extends wo1 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f8568d;

    @Override // p000.wo1
    /* JADX INFO: renamed from: b */
    public e90 mo5349b(Context context, Looper looper, C0902y5 c0902y5, Object obj, j90 j90Var, k90 k90Var) {
        switch (this.f8568d) {
            case 0:
                c0902y5.getClass();
                Integer num = (Integer) c0902y5.f9159f;
                Bundle bundle = new Bundle();
                bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", null);
                if (num != null) {
                    bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", num.intValue());
                }
                bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
                bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
                bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
                bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
                bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
                bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
                bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
                return new u71(context, looper, c0902y5, bundle, j90Var, k90Var);
            case 1:
                obj.getClass();
                throw new ClassCastException();
            case 2:
            case 3:
            default:
                return super.mo5349b(context, looper, c0902y5, obj, j90Var, k90Var);
            case 4:
                return new h22(context, looper, 51, c0902y5, j90Var, k90Var);
        }
    }

    @Override // p000.wo1
    /* JADX INFO: renamed from: c */
    public e90 mo5350c(Context context, Looper looper, C0902y5 c0902y5, Object obj, el1 el1Var, el1 el1Var2) {
        switch (this.f8568d) {
            case 2:
                return new bl1(context, looper, 449, c0902y5, el1Var, el1Var2);
            case 3:
                return new em1(context, looper, c0902y5, (vc1) obj, el1Var, el1Var2);
            default:
                return super.mo5350c(context, looper, c0902y5, obj, el1Var, el1Var2);
        }
    }
}
