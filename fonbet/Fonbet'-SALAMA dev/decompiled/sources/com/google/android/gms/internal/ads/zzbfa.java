package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class zzbfa extends zzaxn implements zzbfc {
    public zzbfa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final String zzg() {
        Parcel zzcZ = zzcZ(2, zza());
        String readString = zzcZ.readString();
        zzcZ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final List zzh() {
        Parcel zzcZ = zzcZ(3, zza());
        ArrayList zzb = zzaxp.zzb(zzcZ);
        zzcZ.recycle();
        return zzb;
    }
}
