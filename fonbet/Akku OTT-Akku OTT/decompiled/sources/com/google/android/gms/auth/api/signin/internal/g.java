package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.internal.p000authapi.zbaw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class g extends AbstractC0866h {
    public final GoogleSignInOptions a;

    public g(Context context, Looper looper, C0863e c0863e, @Nullable GoogleSignInOptions googleSignInOptions, h.a aVar, h.b bVar) {
        super(context, looper, 91, c0863e, aVar, bVar);
        GoogleSignInOptions.a aVar2;
        if (googleSignInOptions != null) {
            aVar2 = new GoogleSignInOptions.a();
            aVar2.a = new HashSet();
            aVar2.h = new HashMap();
            aVar2.a = new HashSet(googleSignInOptions.b);
            aVar2.b = googleSignInOptions.e;
            aVar2.c = googleSignInOptions.f;
            aVar2.d = googleSignInOptions.d;
            aVar2.e = googleSignInOptions.i;
            aVar2.f = googleSignInOptions.c;
            aVar2.g = googleSignInOptions.j;
            aVar2.h = GoogleSignInOptions.m(googleSignInOptions.k);
            aVar2.i = googleSignInOptions.l;
        } else {
            aVar2 = new GoogleSignInOptions.a();
            aVar2.a = new HashSet();
            aVar2.h = new HashMap();
        }
        aVar2.i = zbaw.zba();
        if (!c0863e.c.isEmpty()) {
            for (Scope scope : c0863e.c) {
                HashSet hashSet = aVar2.a;
                hashSet.add(scope);
                hashSet.addAll(Arrays.asList(new Scope[0]));
            }
        }
        HashSet hashSet2 = aVar2.a;
        if (hashSet2.contains(GoogleSignInOptions.q)) {
            Scope scope2 = GoogleSignInOptions.p;
            if (hashSet2.contains(scope2)) {
                hashSet2.remove(scope2);
            }
        }
        if (aVar2.d && (aVar2.f == null || !hashSet2.isEmpty())) {
            aVar2.a.add(GoogleSignInOptions.o);
        }
        this.a = new GoogleSignInOptions(3, new ArrayList(hashSet2), aVar2.f, aVar2.d, aVar2.b, aVar2.c, aVar2.e, aVar2.g, aVar2.h, aVar2.i);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.signin.internal.ISignInService");
        return queryLocalInterface instanceof r ? (r) queryLocalInterface : new r(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final Intent getSignInIntent() {
        Context context = getContext();
        m.a.a("getSignInIntent()", new Object[0]);
        SignInConfiguration signInConfiguration = new SignInConfiguration(context.getPackageName(), this.a);
        Intent intent = new Intent("com.google.android.gms.auth.GOOGLE_SIGN_IN");
        intent.setPackage(context.getPackageName());
        intent.setClass(context, SignInHubActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("config", signInConfiguration);
        intent.putExtra("config", bundle);
        return intent;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean providesSignIn() {
        return true;
    }
}
