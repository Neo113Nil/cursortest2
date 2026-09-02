package S;

import O.g;
import O.h;
import P.o;
import Q.C0005c;
import Q.k;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import d0.C0052a;

/* loaded from: classes.dex */
public final class b extends V.a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f490c;

    @Override // V.a
    public O.c d(Context context, Looper looper, C0005c c0005c, Object obj, g gVar, h hVar) {
        switch (this.f490c) {
            case 2:
                c0005c.getClass();
                Integer num = (Integer) c0005c.f405f;
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
                return new C0052a(context, looper, c0005c, bundle, gVar, hVar);
            case 3:
                C0.g.j(obj);
                throw null;
            default:
                return super.d(context, looper, c0005c, obj, gVar, hVar);
        }
    }

    @Override // V.a
    public O.c e(Context context, Looper looper, C0005c c0005c, Object obj, o oVar, o oVar2) {
        switch (this.f490c) {
            case 0:
                return new d(context, looper, c0005c, (k) obj, oVar, oVar2);
            case 1:
                return new Y.b(context, looper, 300, c0005c, oVar, oVar2);
            default:
                return super.e(context, looper, c0005c, obj, oVar, oVar2);
        }
    }
}
