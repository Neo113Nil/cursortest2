package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbgo extends zzaxn implements zzbgq {
    public zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zze(zzbgd zzbgdVar) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbgdVar);
        zzda(1, parcelZza);
    }
}
