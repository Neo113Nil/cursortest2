package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbkz extends zzaxn implements zzblb {
    public zzbkz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(3, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblb
    public final void zzf() {
        zzda(2, zza());
    }
}
