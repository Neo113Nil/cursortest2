package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzfni extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfni> CREATOR = new zzfnj();
    public final int zza;
    public final String zzb;
    public final String zzc;

    public zzfni(int i7, String str, String str2) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 2, this.zzb, false);
        D.s0(parcel, 3, this.zzc, false);
        D.z0(iX0, parcel);
    }

    public zzfni(String str, String str2) {
        this(1, str, str2);
    }
}
