package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzfqf extends zzaxn implements zzfqh {
    public zzfqf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    public final void zze(Bundle bundle, zzfqj zzfqjVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        zzaxp.zzf(parcelZza, zzfqjVar);
        zzdb(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    public final void zzf(String str, Bundle bundle, zzfqj zzfqjVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaxp.zzd(parcelZza, bundle);
        zzaxp.zzf(parcelZza, zzfqjVar);
        zzdb(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    public final void zzg(Bundle bundle, zzfqj zzfqjVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, bundle);
        zzaxp.zzf(parcelZza, zzfqjVar);
        zzdb(3, parcelZza);
    }
}
