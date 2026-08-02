package W2;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.C0856h;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.internal.auth.zzam;
import com.google.android.gms.internal.auth.zzbe;
import com.google.android.gms.internal.p000authapi.zbo;
import com.google.android.gms.internal.p001authapiphone.zzw;
import e3.C1019d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import z3.C1816a;

/* loaded from: classes.dex */
public final class g extends com.google.android.gms.common.api.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6694a;

    @Override // com.google.android.gms.common.api.a
    public /* synthetic */ com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C0856h c0856h, Object obj, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        switch (this.f6694a) {
            case 3:
                return new zzbe(context, looper, c0856h, (X2.d) obj, interfaceC0830g, interfaceC0839p);
            case 4:
                return new zzw(context, looper, c0856h, interfaceC0830g, interfaceC0839p);
            case 5:
                return new h3.c(context, looper, c0856h, (q) obj, interfaceC0830g, interfaceC0839p);
            default:
                return super.buildClient(context, looper, c0856h, obj, interfaceC0830g, interfaceC0839p);
        }
    }

    @Override // com.google.android.gms.common.api.f
    public List getImpliedScopes(Object obj) {
        switch (this.f6694a) {
            case 2:
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                return googleSignInOptions == null ? Collections.emptyList() : new ArrayList(googleSignInOptions.f11037b);
            default:
                return super.getImpliedScopes(obj);
        }
    }

    @Override // com.google.android.gms.common.api.a
    public com.google.android.gms.common.api.g buildClient(Context context, Looper looper, C0856h c0856h, Object obj, m mVar, n nVar) {
        switch (this.f6694a) {
            case 0:
                return new zzam(context, looper, c0856h, mVar, nVar);
            case 1:
                return new zbo(context, looper, c0856h, (X2.a) obj, mVar, nVar);
            case 2:
                return new C1019d(context, looper, c0856h, (GoogleSignInOptions) obj, mVar, nVar);
            case 3:
            case 4:
            case 5:
            default:
                return super.buildClient(context, looper, c0856h, obj, mVar, nVar);
            case 6:
                c0856h.getClass();
                Integer num = c0856h.f11311g;
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
                return new C1816a(context, looper, c0856h, bundle, mVar, nVar);
            case 7:
                obj.getClass();
                throw new ClassCastException();
        }
    }
}
