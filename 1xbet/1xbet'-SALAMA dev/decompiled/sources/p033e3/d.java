package p033e3;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;
import com.google.android.gms.internal.p000authapi.zbbj;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import p025d3.b;

/* JADX INFO: loaded from: classes.dex */
public final class d extends AbstractC0813i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f12667a;

    public d(Context context, Looper looper, C0812h c0812h, GoogleSignInOptions googleSignInOptions, m mVar, n nVar) {
        b bVar;
        super(context, looper, 91, c0812h, mVar, nVar);
        if (googleSignInOptions != null) {
            bVar = new b();
            bVar.f12396a = new HashSet();
            bVar.f12403h = new HashMap();
            bVar.f12396a = new HashSet(googleSignInOptions.f11037b);
            bVar.f12397b = googleSignInOptions.f11040e;
            bVar.f12398c = googleSignInOptions.f11041f;
            bVar.f12399d = googleSignInOptions.f11039d;
            bVar.f12400e = googleSignInOptions.f11042x;
            bVar.f12401f = googleSignInOptions.f11038c;
            bVar.f12402g = googleSignInOptions.f11043y;
            bVar.f12403h = GoogleSignInOptions.k(googleSignInOptions.f11044z);
            bVar.f12404i = googleSignInOptions.f11035A;
        } else {
            bVar = new b();
            bVar.f12396a = new HashSet();
            bVar.f12403h = new HashMap();
        }
        bVar.f12404i = zbbj.zba();
        Set<Scope> set = c0812h.f11306b;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = bVar.f12396a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f11033E;
        HashSet hashSet2 = bVar.f12396a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f11032D;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (bVar.f12399d && (bVar.f12401f == null || !hashSet2.isEmpty())) {
            bVar.f12396a.add(GoogleSignInOptions.f11031C);
        }
        this.f12667a = new GoogleSignInOptions(3, new ArrayList(hashSet2), bVar.f12401f, bVar.f12399d, bVar.f12397b, bVar.f12398c, bVar.f12400e, bVar.f12402g, bVar.f12403h, bVar.f12404i);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new j(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Intent getSignInIntent() {
        Context context = getContext();
        g.f12671a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f12667a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final boolean providesSignIn() {
        return true;
    }
}
