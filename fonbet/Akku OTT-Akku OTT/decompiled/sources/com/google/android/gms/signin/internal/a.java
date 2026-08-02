package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.C0852b;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.internal.b0;
import com.google.android.gms.common.api.internal.c0;
import com.google.android.gms.common.internal.AbstractC0861c;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.K;
import com.google.android.gms.internal.base.zac;

/* loaded from: classes4.dex */
public final class a extends AbstractC0866h<f> implements com.google.android.gms.signin.f {
    public static final /* synthetic */ int e = 0;
    public final boolean a;
    public final C0863e b;
    public final Bundle c;

    @Nullable
    public final Integer d;

    public a(@NonNull Context context, @NonNull Looper looper, @NonNull C0863e c0863e, @NonNull Bundle bundle, @NonNull h.a aVar, @NonNull h.b bVar) {
        super(context, looper, 44, c0863e, aVar, bVar);
        this.a = true;
        this.b = c0863e;
        this.c = bundle;
        this.d = c0863e.h;
    }

    @Override // com.google.android.gms.signin.f
    public final void a() {
        connect(new AbstractC0861c.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.f
    public final void b(c0 c0Var) {
        try {
            try {
                Account account = this.b.a;
                if (account == null) {
                    account = new Account(AbstractC0861c.DEFAULT_ACCOUNT, "com.google");
                }
                GoogleSignInAccount b = AbstractC0861c.DEFAULT_ACCOUNT.equals(account.name) ? com.google.android.gms.auth.api.signin.internal.b.a(getContext()).b() : null;
                Integer num = this.d;
                C0875q.g(num);
                K k = new K(2, account, num.intValue(), b);
                f fVar = (f) getService();
                i iVar = new i(1, k);
                Parcel zaa = fVar.zaa();
                zac.zac(zaa, iVar);
                zac.zad(zaa, c0Var);
                fVar.zac(12, zaa);
            } catch (RemoteException unused) {
                c0Var.b.post(new b0(c0Var, new k(1, new C0852b(8, null), null)));
            }
        } catch (RemoteException unused2) {
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final IInterface createServiceInterface(@NonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new f(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final Bundle getGetServiceRequestExtraArgs() {
        C0863e c0863e = this.b;
        boolean equals = getContext().getPackageName().equals(c0863e.e);
        Bundle bundle = this.c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0863e.e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        return this.a;
    }
}
