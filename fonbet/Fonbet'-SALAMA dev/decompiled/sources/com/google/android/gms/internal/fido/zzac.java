package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;

/* loaded from: classes.dex */
public final class zzac extends AbstractC0857i {
    public zzac(Context context, Looper looper, C0856h c0856h, m mVar, n nVar) {
        super(context, looper, 119, c0856h, mVar, nVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
