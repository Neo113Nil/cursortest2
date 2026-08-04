package com.google.android.gms.internal.ads;

import Y4.D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzblh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzblh> CREATOR = new zzbli();
    public final String zza;
    public final Bundle zzb;

    public zzblh(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, str, false);
        D.k0(parcel, 2, this.zzb, false);
        D.z0(iX0, parcel);
    }
}
