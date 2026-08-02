package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.f;
import com.google.android.gms.auth.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.internal.AbstractC0866h;
import com.google.android.gms.common.internal.C0863e;

/* loaded from: classes4.dex */
public final class zbd extends AbstractC0866h {
    private final g zba;

    public zbd(Context context, Looper looper, C0863e c0863e, g gVar, h.a aVar, h.b bVar) {
        super(context, looper, 68, c0863e, aVar, bVar);
        gVar = gVar == null ? g.c : gVar;
        f fVar = new f();
        fVar.a = Boolean.FALSE;
        fVar.a = Boolean.valueOf(gVar.a);
        fVar.b = gVar.b;
        fVar.b = zbaw.zba();
        this.zba = new g(fVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbe ? (zbe) queryLocalInterface : new zbe(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final Bundle getGetServiceRequestExtraArgs() {
        g gVar = this.zba;
        gVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", gVar.a);
        bundle.putString("log_session_id", gVar.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0861c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
