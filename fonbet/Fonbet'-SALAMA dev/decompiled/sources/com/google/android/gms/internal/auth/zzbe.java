package com.google.android.gms.internal.auth;

import X2.c;
import X2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC0830g;
import com.google.android.gms.common.api.internal.InterfaceC0839p;
import com.google.android.gms.common.g;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;

/* loaded from: classes.dex */
public final class zzbe extends AbstractC0857i {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C0856h c0856h, d dVar, InterfaceC0830g interfaceC0830g, InterfaceC0839p interfaceC0839p) {
        super(context, looper, 16, c0856h, interfaceC0830g, interfaceC0839p);
        this.zze = dVar == null ? new Bundle() : new Bundle(dVar.f7472a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
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
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        C0856h clientSettings = getClientSettings();
        clientSettings.getClass();
        if (TextUtils.isEmpty(null)) {
            return false;
        }
        if (clientSettings.f11307c.get(c.f7470a) == null) {
            return !clientSettings.f11305a.isEmpty();
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
