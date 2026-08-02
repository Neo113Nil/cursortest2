package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzfnt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnt> CREATOR = new zzfnu();
    public final int zza;
    public final byte[] zzb;
    public final int zzc;

    public zzfnt(int i7, byte[] bArr, int i8) {
        this.zza = i7;
        this.zzb = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.zzc = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int i8 = this.zza;
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        D.l0(parcel, 2, this.zzb, false);
        int i9 = this.zzc;
        D.B0(parcel, 3, 4);
        parcel.writeInt(i9);
        D.z0(x02, parcel);
    }

    public zzfnt(byte[] bArr, int i7) {
        this(1, null, 1);
    }
}
