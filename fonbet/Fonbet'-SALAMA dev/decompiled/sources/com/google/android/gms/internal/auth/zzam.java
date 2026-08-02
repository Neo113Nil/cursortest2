package com.google.android.gms.internal.auth;

import V2.b;
import W2.d;
import W2.e;
import W2.f;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;

/* loaded from: classes.dex */
public final class zzam extends AbstractC0857i {
    public zzam(Context context, Looper looper, C0856h c0856h, m mVar, n nVar) {
        super(context, looper, 120, c0856h, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i7 = e.f6693a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Feature[] getApiFeatures() {
        return new Feature[]{b.f6641d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
