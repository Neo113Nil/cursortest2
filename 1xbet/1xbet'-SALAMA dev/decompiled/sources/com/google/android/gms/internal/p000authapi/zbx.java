package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;
import p006a3.d;

/* JADX INFO: loaded from: classes.dex */
public final class zbx extends AbstractC0813i {
    private final Bundle zba;

    public zbx(Context context, Looper looper, d dVar, C0812h c0812h, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        super(context, looper, 223, c0812h, interfaceC0786g, interfaceC0795p);
        this.zba = new Bundle();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return iInterfaceQueryLocalInterface instanceof zbad ? (zbad) iInterfaceQueryLocalInterface : new zbad(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Feature[] getApiFeatures() {
        return zbbi.zbi;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
