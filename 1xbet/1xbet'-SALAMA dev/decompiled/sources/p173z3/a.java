package p173z3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC0813i implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0812h f18461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Bundle f18462c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f18463d;

    public a(Context context, Looper looper, C0812h c0812h, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, c0812h, mVar, nVar);
        this.f18460a = true;
        this.f18461b = c0812h;
        this.f18462c = bundle;
        this.f18463d = c0812h.f11311g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return iInterfaceQueryLocalInterface instanceof c ? (c) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Bundle getGetServiceRequestExtraArgs() {
        C0812h c0812h = this.f18461b;
        boolean zEquals = getContext().getPackageName().equals(c0812h.f11308d);
        Bundle bundle = this.f18462c;
        if (!zEquals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0812h.f11308d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f18460a;
    }
}
