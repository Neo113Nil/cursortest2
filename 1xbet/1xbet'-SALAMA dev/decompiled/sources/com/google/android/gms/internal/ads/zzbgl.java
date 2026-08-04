package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbgl extends zzaxn implements zzbgn {
    public zzbgl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zze(zzbgd zzbgdVar, String str) {
        Parcel parcelZza = zza();
        zzaxp.zzf(parcelZza, zzbgdVar);
        parcelZza.writeString(str);
        zzda(1, parcelZza);
    }
}
