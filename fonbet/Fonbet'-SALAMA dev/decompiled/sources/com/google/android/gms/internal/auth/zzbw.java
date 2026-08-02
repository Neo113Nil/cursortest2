package com.google.android.gms.internal.auth;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbw> CREATOR = new zzbx();
    final int zza;
    String zzb;

    public zzbw() {
        this.zza = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        int i8 = this.zza;
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        D.s0(parcel, 2, this.zzb, false);
        D.z0(x02, parcel);
    }

    public final zzbw zza(String str) {
        this.zzb = str;
        return this;
    }

    public zzbw(int i7, String str) {
        this.zza = i7;
        this.zzb = str;
    }
}
