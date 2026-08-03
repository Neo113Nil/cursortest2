package B0;

/* loaded from: classes.dex */
public final class b extends Q1.l {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5i;

    @Override // Q1.l
    public n0.InterfaceC0939c a(android.content.Context context, android.os.Looper looper, P1.h hVar, java.lang.Object obj, n0.g gVar, n0.h hVar2) {
        switch (this.f5i) {
            case 0:
                hVar.getClass();
                java.lang.Integer num = (java.lang.Integer) hVar.f1488f;
                android.os.Bundle bundle = new android.os.Bundle();
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
                return new C0.a(context, looper, hVar, bundle, gVar, hVar2);
            case 1:
                B1.a.m(obj);
                throw null;
            default:
                return super.a(context, looper, hVar, obj, gVar, hVar2);
        }
    }

    @Override // Q1.l
    public n0.InterfaceC0939c b(android.content.Context context, android.os.Looper looper, P1.h hVar, java.lang.Object obj, o0.m mVar, o0.m mVar2) {
        switch (this.f5i) {
            case 2:
                return new r0.C0987c(context, looper, hVar, (p0.C0958j) obj, mVar, mVar2);
            case 3:
                return new x0.C1012b(context, looper, 300, hVar, mVar, mVar2);
            default:
                return super.b(context, looper, hVar, obj, mVar, mVar2);
        }
    }
}
