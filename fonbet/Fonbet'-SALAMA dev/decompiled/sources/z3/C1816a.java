package z3;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;

/* renamed from: z3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1816a extends AbstractC0857i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f18454a;

    /* renamed from: b, reason: collision with root package name */
    public final C0856h f18455b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f18456c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f18457d;

    public C1816a(Context context, Looper looper, C0856h c0856h, Bundle bundle, m mVar, n nVar) {
        super(context, looper, 44, c0856h, mVar, nVar);
        this.f18454a = true;
        this.f18455b = c0856h;
        this.f18456c = bundle;
        this.f18457d = c0856h.f11311g;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C1818c ? (C1818c) queryLocalInterface : new C1818c(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Bundle getGetServiceRequestExtraArgs() {
        C0856h c0856h = this.f18455b;
        boolean equals = getContext().getPackageName().equals(c0856h.f11308d);
        Bundle bundle = this.f18456c;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", c0856h.f11308d);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return com.google.android.gms.common.g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        return this.f18454a;
    }
}
