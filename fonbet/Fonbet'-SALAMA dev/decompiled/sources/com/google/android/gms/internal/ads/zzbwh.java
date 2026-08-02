package com.google.android.gms.internal.ads;

import S2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbwh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwh> CREATOR = new zzbwi();
    public final String zza;
    public final String zzb;

    public zzbwh(e eVar) {
        this(eVar.f6316a, eVar.f6317b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        String str = this.zza;
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, str, false);
        D.s0(parcel, 2, this.zzb, false);
        D.z0(x02, parcel);
    }

    public zzbwh(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
