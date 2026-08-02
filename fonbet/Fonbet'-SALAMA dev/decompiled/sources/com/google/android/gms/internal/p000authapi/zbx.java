package com.google.android.gms.internal.p000authapi;

import a3.C0620d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;

/* loaded from: classes.dex */
public final class zbx extends AbstractC0857i {
    private final Bundle zba;

    public zbx(Context context, Looper looper, C0620d c0620d, C0856h c0856h, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        super(context, looper, 223, c0856h, interfaceC0830g, interfaceC0839p);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof zbad ? (zbad) queryLocalInterface : new zbad(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Feature[] getApiFeatures() {
        return zbbi.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
