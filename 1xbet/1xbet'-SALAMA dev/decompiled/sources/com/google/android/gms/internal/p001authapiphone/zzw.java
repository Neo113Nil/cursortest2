package com.google.android.gms.internal.p001authapiphone;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC0786g;
import com.google.android.gms.common.api.internal.InterfaceC0795p;
import com.google.android.gms.common.internal.AbstractC0813i;
import com.google.android.gms.common.internal.C0812h;

/* JADX INFO: loaded from: classes.dex */
public final class zzw extends AbstractC0813i {
    public zzw(Context context, Looper looper, C0812h c0812h, InterfaceC0786g interfaceC0786g, InterfaceC0795p interfaceC0795p) {
        super(context, looper, 126, c0812h, interfaceC0786g, interfaceC0795p);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
        return iInterfaceQueryLocalInterface instanceof zzh ? (zzh) iInterfaceQueryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Feature[] getApiFeatures() {
        return zzac.zze;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final boolean usesClientTelemetry() {
        return true;
    }
}
