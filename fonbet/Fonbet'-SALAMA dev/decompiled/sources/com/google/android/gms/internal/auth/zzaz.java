package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new zzba();
    final int zza;
    public final String zzb;
    public final byte[] zzc;

    public zzaz(int i7, String str, byte[] bArr) {
        this.zza = 1;
        D.i(str);
        this.zzb = str;
        D.i(bArr);
        this.zzc = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        int i8 = this.zza;
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        Y4.D.s0(parcel, 2, this.zzb, false);
        Y4.D.l0(parcel, 3, this.zzc, false);
        Y4.D.z0(x02, parcel);
    }

    public zzaz(String str, byte[] bArr) {
        this(1, str, bArr);
    }
}
