package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbgo extends zzaxn implements zzbgq {
    public zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zze(zzbgd zzbgdVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbgdVar);
        zzda(1, zza);
    }
}
