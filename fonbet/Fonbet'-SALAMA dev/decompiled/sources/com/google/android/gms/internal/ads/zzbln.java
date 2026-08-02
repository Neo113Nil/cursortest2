package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* loaded from: classes.dex */
public final class zzbln extends zzaxn implements zzblp {
    public zzbln(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zze(int i7) {
        Parcel zza = zza();
        zza.writeInt(i7);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzblp
    public final void zzf() {
        zzda(1, zza());
    }
}
