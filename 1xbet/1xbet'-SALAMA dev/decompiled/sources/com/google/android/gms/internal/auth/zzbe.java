package com.google.android.gms.internal.auth;

import X2.c;
import X2.d;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;

/* JADX INFO: loaded from: classes.dex */
public final class zzbe extends AbstractC0813i {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, C0812h c0812h, d dVar, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        super(context, looper, 16, c0812h, interfaceC0786g, interfaceC0795p);
        this.zze = dVar == null ? new Bundle() : new Bundle(dVar.f7472a);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return iInterfaceQueryLocalInterface instanceof zzbh ? (zzbh) iInterfaceQueryLocalInterface : new zzbh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f, com.google.android.gms.common.api.g
    public final boolean requiresSignIn() {
        C0812h clientSettings = getClientSettings();
        clientSettings.getClass();
        if (TextUtils.isEmpty(null)) {
            return false;
        }
        if (clientSettings.f11307c.get(c.f7470a) == null) {
            return !clientSettings.f11305a.isEmpty();
        }
        throw new ClassCastException();
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
