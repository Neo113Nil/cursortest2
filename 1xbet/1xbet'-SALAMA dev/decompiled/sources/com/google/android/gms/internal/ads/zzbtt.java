package com.google.android.gms.internal.ads;

import E2.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbtt extends c {
    public zzbtt(Context context, Looper looper, InterfaceC0806b interfaceC0806b, InterfaceC0807c interfaceC0807c) {
        super(zzbuy.zza(context), looper, interfaceC0806b, interfaceC0807c, 8);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return iInterfaceQueryLocalInterface instanceof zzbuc ? (zzbuc) iInterfaceQueryLocalInterface : new zzbua(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final int getMinApkVersion() {
        return 242115000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbuc zzp() {
        return (zzbuc) getService();
    }
}
