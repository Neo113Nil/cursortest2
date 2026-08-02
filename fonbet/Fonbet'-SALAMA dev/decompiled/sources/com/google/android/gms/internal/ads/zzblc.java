package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class zzblc extends zzaxn implements zzble {
    public zzblc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzble
    public final void zzb(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzda(1, zza);
    }
}
