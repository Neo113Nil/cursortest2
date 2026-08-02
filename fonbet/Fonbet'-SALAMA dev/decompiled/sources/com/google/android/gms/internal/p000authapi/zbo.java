package com.google.android.gms.internal.p000authapi;

import X2.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0857i;
import com.google.android.gms.common.internal.C0856h;
import w1.V0;

/* loaded from: classes.dex */
public final class zbo extends AbstractC0857i {
    private final a zba;

    public zbo(Context context, Looper looper, C0856h c0856h, a aVar, m mVar, n nVar) {
        super(context, looper, 68, c0856h, mVar, nVar);
        aVar = aVar == null ? a.f7465c : aVar;
        V0 v02 = new V0(24, false);
        v02.f17562b = Boolean.FALSE;
        a aVar2 = a.f7465c;
        aVar.getClass();
        v02.f17562b = Boolean.valueOf(aVar.f7466a);
        v02.f17563c = aVar.f7467b;
        v02.f17563c = zbbj.zba();
        this.zba = new a(v02);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbt ? (zbt) queryLocalInterface : new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Bundle getGetServiceRequestExtraArgs() {
        a aVar = this.zba;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.f7466a);
        bundle.putString("log_session_id", aVar.f7467b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final a zba() {
        return this.zba;
    }
}
