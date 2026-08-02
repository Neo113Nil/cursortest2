package com.google.android.gms.internal.ads;

import E2.c;
import F2.C0254t;
import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.InterfaceC0850b;
import com.google.android.gms.common.internal.InterfaceC0851c;
import y2.B;

/* loaded from: classes.dex */
public final class zzbah extends c {
    public zzbah(Context context, Looper looper, InterfaceC0850b interfaceC0850b, InterfaceC0851c interfaceC0851c) {
        super(zzbuy.zza(context), looper, interfaceC0850b, interfaceC0851c, 123);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.cache.ICacheService");
        return queryLocalInterface instanceof zzbak ? (zzbak) queryLocalInterface : new zzbak(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final Feature[] getApiFeatures() {
        return B.f18135c;
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getServiceDescriptor() {
        return "com.google.android.gms.ads.internal.cache.ICacheService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC0854f
    public final String getStartServiceAction() {
        return "com.google.android.gms.ads.service.CACHE";
    }

    public final boolean zzp() {
        Feature[] availableFeatures = getAvailableFeatures();
        if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzcb)).booleanValue()) {
            Feature feature = B.f18134b;
            int length = availableFeatures != null ? availableFeatures.length : 0;
            int i7 = 0;
            while (true) {
                if (i7 >= length) {
                    break;
                }
                if (!D.m(availableFeatures[i7], feature)) {
                    i7++;
                } else if (i7 >= 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final zzbak zzq() {
        return (zzbak) getService();
    }
}
