package com.google.android.gms.internal.ads;

import E2.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkj extends c {
    public zzbkj(Context context, Looper looper, InterfaceC0806b interfaceC0806b, InterfaceC0807c interfaceC0807c) {
        super(zzbuy.zza(context), looper, interfaceC0806b, interfaceC0807c, 166);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return iInterfaceQueryLocalInterface instanceof zzbkq ? (zzbkq) iInterfaceQueryLocalInterface : new zzbkq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbkq zzp() {
        return (zzbkq) getService();
    }
}
