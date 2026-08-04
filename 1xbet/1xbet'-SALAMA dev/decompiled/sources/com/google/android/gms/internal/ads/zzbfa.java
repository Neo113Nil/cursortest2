package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzbfa extends zzaxn implements zzbfc {
    public zzbfa(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final String zzg() {
        Parcel parcelZzcZ = zzcZ(2, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbfc
    public final List zzh() {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList arrayListZzb = zzaxp.zzb(parcelZzcZ);
        parcelZzcZ.recycle();
        return arrayListZzb;
    }
}
