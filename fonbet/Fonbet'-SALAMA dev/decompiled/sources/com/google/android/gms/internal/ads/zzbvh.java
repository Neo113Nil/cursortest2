package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbvh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvh> CREATOR = new zzbvi();
    public final com.google.android.gms.ads.internal.client.zzm zza;
    public final String zzb;

    public zzbvh(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) {
        this.zza = zzmVar;
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        com.google.android.gms.ads.internal.client.zzm zzmVar = this.zza;
        int x02 = D.x0(20293, parcel);
        D.r0(parcel, 2, zzmVar, i7, false);
        D.s0(parcel, 3, this.zzb, false);
        D.z0(x02, parcel);
    }
}
