package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzbty extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbty> CREATOR = new zzbtz();
    public final String zza;

    public zzbty(String str) {
        this.zza = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, str, false);
        D.z0(iX0, parcel);
    }
}
