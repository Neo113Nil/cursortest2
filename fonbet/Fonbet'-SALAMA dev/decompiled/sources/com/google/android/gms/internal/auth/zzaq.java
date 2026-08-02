package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    public zzaq(int i7, String str) {
        this.zza = 1;
        D.i(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        int i8 = this.zza;
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        Y4.D.s0(parcel, 2, this.zzb, false);
        Y4.D.z0(x02, parcel);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
