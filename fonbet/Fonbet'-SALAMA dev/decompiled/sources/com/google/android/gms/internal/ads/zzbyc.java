package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbyc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbyc> CREATOR = new zzbyd();
    public final String zza;
    public final String zzb;

    @Deprecated
    public final com.google.android.gms.ads.internal.client.zzr zzc;
    public final com.google.android.gms.ads.internal.client.zzm zzd;
    public final int zze;
    public final String zzf;

    public zzbyc(String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i7, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzrVar;
        this.zzd = zzmVar;
        this.zze = i7;
        this.zzf = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, str, false);
        D.s0(parcel, 2, this.zzb, false);
        D.r0(parcel, 3, this.zzc, i7, false);
        D.r0(parcel, 4, this.zzd, i7, false);
        int i8 = this.zze;
        D.B0(parcel, 5, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 6, this.zzf, false);
        D.z0(x02, parcel);
    }
}
