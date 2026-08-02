package com.google.android.gms.internal.ads;

import E2.c;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;

/* loaded from: classes.dex */
public final class zzbkj extends c {
    public zzbkj(Context context, Looper looper, InterfaceC0850b interfaceC0850b, InterfaceC0851c interfaceC0851c) {
        super(zzbuy.zza(context), looper, interfaceC0850b, interfaceC0851c, 166);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
        return queryLocalInterface instanceof zzbkq ? (zzbkq) queryLocalInterface : new zzbkq(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.HTTP";
    }

    public final zzbkq zzp() {
        return (zzbkq) getService();
    }
}
