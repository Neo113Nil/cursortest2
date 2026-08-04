package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkx> CREATOR = new zzbky();
    public final String zza;
    public final boolean zzb;
    public final int zzc;
    public final String zzd;

    public zzbkx(String str, boolean z4, int i7, String str2) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = i7;
        this.zzd = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, str, false);
        boolean z4 = this.zzb;
        D.B0(parcel, 2, 4);
        parcel.writeInt(z4 ? 1 : 0);
        int i8 = this.zzc;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 4, this.zzd, false);
        D.z0(iX0, parcel);
    }
}
