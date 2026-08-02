package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzfnf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnf> CREATOR = new zzfng();
    public final int zza;
    public final byte[] zzb;

    public zzfnf(int i7, byte[] bArr) {
        this.zza = i7;
        this.zzb = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        D.l0(parcel, 2, this.zzb, false);
        D.z0(x02, parcel);
    }

    public zzfnf(byte[] bArr) {
        this(1, bArr);
    }
}
