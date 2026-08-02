package com.google.android.gms.internal.p000authapi;

import a3.C0619c;
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
public final class zbw extends AbstractC0857i {
    private final Bundle zba;

    public zbw(Context context, Looper looper, C0619c c0619c, C0856h c0856h, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        super(context, looper, 219, c0856h, interfaceC0830g, interfaceC0839p);
        c0619c.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("session_id", c0619c.f7972a);
        this.zba = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return queryLocalInterface instanceof zbaa ? (zbaa) queryLocalInterface : new zbaa(iBinder);
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
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
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
