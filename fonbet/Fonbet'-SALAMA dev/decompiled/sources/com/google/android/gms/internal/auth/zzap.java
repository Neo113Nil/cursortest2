package com.google.android.gms.internal.auth;

import Y2.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;

/* loaded from: classes.dex */
public final class zzap extends AbstractC0857i {
    private final Bundle zze;

    public zzap(Context context, Looper looper, C0856h c0856h, a aVar, m mVar, n nVar) {
        super(context, looper, 128, c0856h, mVar, nVar);
        this.zze = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService");
        return queryLocalInterface instanceof zzau ? (zzau) queryLocalInterface : new zzau(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return g.GOOGLE_PLAY_SERVICES_VERSION_CODE;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.accounttransfer.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
