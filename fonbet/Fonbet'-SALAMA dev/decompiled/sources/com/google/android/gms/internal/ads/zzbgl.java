package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbgl extends zzaxn implements zzbgn {
    public zzbgl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbgn
    public final void zze(zzbgd zzbgdVar, String str) {
        Parcel zza = zza();
        zzaxp.zzf(zza, zzbgdVar);
        zza.writeString(str);
        zzda(1, zza);
    }
}
