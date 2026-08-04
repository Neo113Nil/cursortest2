package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbkk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkk> CREATOR = new zzbkl();
    public final String zza;
    public final String[] zzb;
    public final String[] zzc;

    public zzbkk(String str, String[] strArr, String[] strArr2) {
        this.zza = str;
        this.zzb = strArr;
        this.zzc = strArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, str, false);
        D.t0(parcel, 2, this.zzb, false);
        D.t0(parcel, 3, this.zzc, false);
        D.z0(iX0, parcel);
    }
}
