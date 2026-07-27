package U0;

import A0.h;
import Q0.g;
import R0.l;
import S0.j;
import a1.C0090b;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import d1.C0270b;
import h1.C0325a;

/* loaded from: classes.dex */
public final class b extends F2.b {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f1595h;

    public /* synthetic */ b(int i3) {
        this.f1595h = i3;
    }

    @Override // F2.b
    public Q0.c f(Context context, Looper looper, h hVar, Object obj, g gVar, Q0.h hVar2) {
        switch (this.f1595h) {
            case 2:
                return new C0270b(context, looper, (l) gVar, (l) hVar2, hVar);
            case 3:
                hVar.getClass();
                Integer num = (Integer) hVar.f55c;
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
                return new C0325a(context, looper, hVar, bundle, gVar, hVar2);
            case 4:
                obj.getClass();
                throw new ClassCastException();
            default:
                return super.f(context, looper, hVar, obj, gVar, hVar2);
        }
    }

    @Override // F2.b
    public Q0.c g(Context context, Looper looper, h hVar, Object obj, l lVar, l lVar2) {
        switch (this.f1595h) {
            case 0:
                return new d(context, looper, hVar, (j) obj, lVar, lVar2);
            case 1:
                return new C0090b(context, looper, 300, hVar, lVar, lVar2);
            default:
                return super.g(context, looper, hVar, obj, lVar, lVar2);
        }
    }
}
