package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzg extends a {
    public static final Parcelable.Creator<zzg> CREATOR = new zzh();
    final byte[] zza;

    public zzg() {
        this.zza = new byte[0];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.zza;
        int q = c.q(parcel, 20293);
        c.c(parcel, 2, bArr, false);
        c.r(parcel, q);
    }

    public zzg(byte[] bArr) {
        this.zza = bArr;
    }
}
