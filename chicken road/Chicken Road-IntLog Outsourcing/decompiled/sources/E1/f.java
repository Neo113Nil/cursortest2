package E1;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import b2.AbstractC0279e;
import l.q0;
import m1.InterfaceC1276c;
import m1.i;
import m1.j;
import o1.C1374l;

/* loaded from: classes.dex */
public final class f extends e5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f646a;

    public /* synthetic */ f(int i2) {
        this.f646a = i2;
    }

    @Override // e5.g
    public InterfaceC1276c f(Context context, Looper looper, q0 q0Var, Object obj, i iVar, j jVar) {
        switch (this.f646a) {
            case 0:
                return new B1.i(context, looper, iVar, jVar, q0Var);
            case 1:
                q0Var.getClass();
                Integer num = (Integer) q0Var.f10947g;
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
                return new G1.a(context, looper, q0Var, bundle, iVar, jVar);
            case 2:
                AbstractC0279e.o(obj);
                throw null;
            default:
                return super.f(context, looper, q0Var, obj, iVar, jVar);
        }
    }

    @Override // e5.g
    public InterfaceC1276c g(Context context, Looper looper, q0 q0Var, Object obj, i iVar, j jVar) {
        switch (this.f646a) {
            case 3:
                return new q1.c(context, looper, q0Var, (C1374l) obj, iVar, jVar);
            case 4:
                return new x1.b(context, looper, 300, q0Var, iVar, jVar);
            default:
                return super.g(context, looper, q0Var, obj, iVar, jVar);
        }
    }
}
