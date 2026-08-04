package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfnr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnr> CREATOR = new zzfns();
    public final int zza;
    public final int zzb;
    public final String zzc;
    public final String zzd;
    public final int zze;

    public zzfnr(int i7, int i8, int i9, String str, String str2) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = str;
        this.zzd = str2;
        this.zze = i9;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        int i9 = this.zzb;
        D.B0(parcel, 2, 4);
        parcel.writeInt(i9);
        D.s0(parcel, 3, this.zzc, false);
        D.s0(parcel, 4, this.zzd, false);
        int i10 = this.zze;
        D.B0(parcel, 5, 4);
        parcel.writeInt(i10);
        D.z0(iX0, parcel);
    }

    public zzfnr(int i7, int i8, String str, String str2) {
        this(1, 1, i8 - 1, str, str2);
    }
}
