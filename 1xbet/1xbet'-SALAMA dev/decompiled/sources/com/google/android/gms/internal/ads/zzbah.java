package com.google.android.gms.internal.ads;

import E2.c;
import F2.C0254t;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.InterfaceC0806b;
import com.google.android.gms.common.internal.InterfaceC0807c;
import p167y2.B;

/* JADX INFO: loaded from: classes.dex */
public final class zzbah extends c {
    public zzbah(Context context, Looper looper, InterfaceC0806b interfaceC0806b, InterfaceC0807c interfaceC0807c) {
        super(zzbuy.zza(context), looper, interfaceC0806b, interfaceC0807c, 123);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return iInterfaceQueryLocalInterface instanceof zzbak ? (zzbak) iInterfaceQueryLocalInterface : new zzbak(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final Feature[] getApiFeatures() {
        return B.f18141c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0810f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue()) {
            Feature feature = B.f18140b;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            for (int i7 = 0; i7 < length; i7++) {
                if (D.m(availableFeatures[i7], feature)) {
                    if (i7 >= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final zzbak zzq() {
        return (zzbak) getService();
    }
}
