package com.google.android.gms.internal.p000authapi;

import X2.a;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.api.n;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;
import p155w1.V0;

/* JADX INFO: loaded from: classes.dex */
public final class zbo extends AbstractC0813i {
    private final a zba;

    public zbo(Context context, Looper looper, C0812h c0812h, a aVar, m mVar, n nVar) {
        super(context, looper, 68, c0812h, mVar, nVar);
        aVar = aVar == null ? a.f7465c : aVar;
        V0 v6 = new V0(24, false);
        v6.f17568b = Boolean.FALSE;
        a aVar2 = a.f7465c;
        aVar.getClass();
        v6.f17568b = Boolean.valueOf(aVar.f7466a);
        v6.f17569c = aVar.f7467b;
        v6.f17569c = zbbj.zba();
        this.zba = new a(v6);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return iInterfaceQueryLocalInterface instanceof zbt ? (zbt) iInterfaceQueryLocalInterface : new zbt(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Bundle getGetServiceRequestExtraArgs() {
        a aVar = this.zba;
        aVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", aVar.f7466a);
        bundle.putString("log_session_id", aVar.f7467b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }

    public final a zba() {
        return this.zba;
    }
}
