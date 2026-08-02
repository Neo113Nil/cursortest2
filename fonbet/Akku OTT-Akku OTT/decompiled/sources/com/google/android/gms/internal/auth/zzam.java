package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.account.d;
import com.google.android.gms.auth.account.e;
import com.google.android.gms.auth.account.f;
import com.google.android.gms.auth.g;
import com.google.android.gms.common.C0854d;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;

/* loaded from: classes4.dex */
public final class zzam extends AbstractC0866h {
    public zzam(Context context, Looper looper, C0863e c0863e, h.a aVar, h.b bVar) {
        super(context, looper, 120, c0863e, aVar, bVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = e.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final C0854d[] getApiFeatures() {
        return new C0854d[]{g.d};
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
