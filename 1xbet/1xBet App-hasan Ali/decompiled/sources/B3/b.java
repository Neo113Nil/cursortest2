package B3;

import G4.l;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import k3.InterfaceC2035c;
import k3.g;
import k3.h;
import l3.m;
import m3.n;
import n.AbstractC2107A;
import o3.C2222c;
import v3.C2536b;

/* loaded from: classes.dex */
public final class b extends l {
    public final /* synthetic */ int f;

    @Override // G4.l
    public InterfaceC2035c l(Context context, Looper looper, C0.c cVar, Object obj, g gVar, h hVar) {
        switch (this.f) {
            case 0:
                cVar.getClass();
                Integer num = (Integer) cVar.f815g;
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
                return new C3.a(context, looper, cVar, bundle, gVar, hVar);
            case 1:
                throw AbstractC2107A.p(obj);
            default:
                return super.l(context, looper, cVar, obj, gVar, hVar);
        }
    }

    @Override // G4.l
    public InterfaceC2035c m(Context context, Looper looper, C0.c cVar, Object obj, m mVar, m mVar2) {
        switch (this.f) {
            case 2:
                return new C2222c(context, looper, cVar, (n) obj, mVar, mVar2);
            case 3:
                return new C2536b(context, looper, 300, cVar, mVar, mVar2);
            default:
                return super.m(context, looper, cVar, obj, mVar, mVar2);
        }
    }
}
