package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new zzaw();
    final int zza;
    public final String zzb;
    public final int zzc;

    public zzav(int i7, String str, int i8) {
        this.zza = 1;
        D.i(str);
        this.zzb = str;
        this.zzc = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        int i8 = this.zza;
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        Y4.D.s0(parcel, 2, this.zzb, false);
        int i9 = this.zzc;
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(i9);
        Y4.D.z0(x02, parcel);
    }

    public zzav(String str, int i7) {
        this(1, str, i7);
    }
}
