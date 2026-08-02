package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbtb extends zzaxn implements zzbtd {
    public zzbtb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zze(String str) {
        Parcel zza = zza();
        zza.writeString(str);
        zzda(2, zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtd
    public final void zzf(List list) {
        Parcel zza = zza();
        zza.writeTypedList(list);
        zzda(1, zza);
    }
}
