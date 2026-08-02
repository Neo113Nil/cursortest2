package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzfqf extends zzaxn implements zzfqh {
    public zzfqf(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    public final void zze(Bundle bundle, zzfqj zzfqjVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        zzaxp.zzf(zza, zzfqjVar);
        zzdb(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    public final void zzf(String str, Bundle bundle, zzfqj zzfqjVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxp.zzd(zza, bundle);
        zzaxp.zzf(zza, zzfqjVar);
        zzdb(1, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfqh
    public final void zzg(Bundle bundle, zzfqj zzfqjVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, bundle);
        zzaxp.zzf(zza, zzfqjVar);
        zzdb(3, zza);
    }
}
