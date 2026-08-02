package com.google.android.gms.internal.ads;

import E2.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
public final class zzbtt extends c {
    public zzbtt(Context context, Looper looper, InterfaceC0850b interfaceC0850b, InterfaceC0851c interfaceC0851c) {
        super(zzbuy.zza(context), looper, interfaceC0850b, interfaceC0851c, 8);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdRequestService");
        return queryLocalInterface instanceof zzbuc ? (zzbuc) queryLocalInterface : new zzbua(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final int getMinApkVersion() {
        return 242115000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.request.IAdRequestService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.START";
    }

    public final zzbuc zzp() {
        return (zzbuc) getService();
    }
}
