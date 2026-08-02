package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

@Deprecated
/* loaded from: classes4.dex */
public final class zzaj extends a {
    public static final Parcelable.Creator<zzaj> CREATOR = new zzak();
    final String zza;
    final String zzb;
    final int zzc;
    final int zzd;

    public zzaj(String str, String str2, int i, int i2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, str, false);
        c.l(parcel, 3, this.zzb, false);
        int i2 = this.zzc;
        c.s(parcel, 4, 4);
        parcel.writeInt(i2);
        int i3 = this.zzd;
        c.s(parcel, 5, 4);
        parcel.writeInt(i3);
        c.r(parcel, q);
    }
}
