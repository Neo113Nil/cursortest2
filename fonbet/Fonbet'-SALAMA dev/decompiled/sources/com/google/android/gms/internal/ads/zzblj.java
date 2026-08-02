package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
public final class zzblj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblj> CREATOR = new zzblk();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final int zzd;

    public zzblj(int i7, int i8, String str, int i9) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = str;
        this.zzd = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zzb;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 2, this.zzc, false);
        int i9 = this.zzd;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i9);
        int i10 = this.zza;
        D.B0(parcel, zzbbd.zzq.zzf, 4);
        parcel.writeInt(i10);
        D.z0(x02, parcel);
    }
}
