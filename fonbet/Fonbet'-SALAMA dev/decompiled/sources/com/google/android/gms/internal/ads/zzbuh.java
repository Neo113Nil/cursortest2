package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbuh extends zzaxn implements IInterface {
    public zzbuh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
    }

    public final void zze(com.google.android.gms.ads.internal.util.zzbb zzbbVar) {
        Parcel zza = zza();
        zzaxp.zzd(zza, zzbbVar);
        zzda(2, zza);
    }

    public final void zzf(String str, zzbty zzbtyVar) {
        Parcel zza = zza();
        zza.writeString(str);
        zzaxp.zzd(zza, zzbtyVar);
        zzda(1, zza);
    }
}
