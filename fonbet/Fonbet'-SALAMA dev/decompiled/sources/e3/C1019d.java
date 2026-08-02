package e3;

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
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;
import com.google.android.gms.internal.p000authapi.zbbj;
import d3.C0961b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* renamed from: e3.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1019d extends AbstractC0857i {

    /* renamed from: a, reason: collision with root package name */
    public final GoogleSignInOptions f12661a;

    public C1019d(Context context, Looper looper, C0856h c0856h, GoogleSignInOptions googleSignInOptions, m mVar, n nVar) {
        super(context, looper, 91, c0856h, mVar, nVar);
        C0961b c0961b;
        if (googleSignInOptions != null) {
            c0961b = new C0961b();
            c0961b.f12390a = new HashSet();
            c0961b.f12397h = new HashMap();
            c0961b.f12390a = new HashSet(googleSignInOptions.f11037b);
            c0961b.f12391b = googleSignInOptions.f11040e;
            c0961b.f12392c = googleSignInOptions.f11041f;
            c0961b.f12393d = googleSignInOptions.f11039d;
            c0961b.f12394e = googleSignInOptions.f11042x;
            c0961b.f12395f = googleSignInOptions.f11038c;
            c0961b.f12396g = googleSignInOptions.f11043y;
            c0961b.f12397h = GoogleSignInOptions.k(googleSignInOptions.f11044z);
            c0961b.f12398i = googleSignInOptions.f11035A;
        } else {
            c0961b = new C0961b();
            c0961b.f12390a = new HashSet();
            c0961b.f12397h = new HashMap();
        }
        c0961b.f12398i = zbbj.zba();
        Set<Scope> set = c0856h.f11306b;
        if (!set.isEmpty()) {
            for (Scope scope : set) {
                HashSet hashSet = c0961b.f12390a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        Scope scope2 = GoogleSignInOptions.f11033E;
        HashSet hashSet2 = c0961b.f12390a;
        if (hashSet2.contains(scope2)) {
            Scope scope3 = GoogleSignInOptions.f11032D;
            if (hashSet2.contains(scope3)) {
                hashSet2.remove(scope3);
            }
        }
        if (c0961b.f12393d && (c0961b.f12395f == null || !hashSet2.isEmpty())) {
            c0961b.f12390a.add(GoogleSignInOptions.f11031C);
        }
        this.f12661a = new GoogleSignInOptions(3, new ArrayList(hashSet2), c0961b.f12395f, c0961b.f12393d, c0961b.f12391b, c0961b.f12392c, c0961b.f12394e, c0961b.f12396g, c0961b.f12397h, c0961b.f12398i);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof C1025j ? (C1025j) queryLocalInterface : new C1025j(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return com.google.android.gms.common.g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Intent getSignInIntent() {
        Context context = getContext();
        AbstractC1022g.f12665a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.f12661a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean providesSignIn() {
        return true;
    }
}
