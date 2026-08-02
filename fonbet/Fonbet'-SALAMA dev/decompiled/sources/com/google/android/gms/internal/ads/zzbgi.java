package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbgi extends zzaxn implements zzbgk {
    public zzbgi(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgk
    public final void zze(zzbga zzbgaVar) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbgaVar);
        zzda(1, zza);
    }
}
