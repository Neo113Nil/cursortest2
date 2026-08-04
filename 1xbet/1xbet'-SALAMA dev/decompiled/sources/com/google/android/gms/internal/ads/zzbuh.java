package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbuh extends zzaxn implements IInterface {
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        Parcel parcelZza = zza();
        zzaxp.zzd(parcelZza, zzbbVar);
        zzda(2, parcelZza);
    }

    public final void zzf(String str, zzbty zzbtyVar) {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzaxp.zzd(parcelZza, zzbtyVar);
        zzda(1, parcelZza);
    }
}
