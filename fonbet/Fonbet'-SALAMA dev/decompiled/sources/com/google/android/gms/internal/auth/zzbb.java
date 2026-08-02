package com.google.android.gms.internal.auth;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();
    final int zza;
    public final String zzb;
    public final PendingIntent zzc;

    public zzbb(int i7, String str, PendingIntent pendingIntent) {
        this.zza = 1;
        D.i(str);
        this.zzb = str;
        D.i(pendingIntent);
        this.zzc = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        int i8 = this.zza;
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(i8);
        Y4.D.s0(parcel, 2, this.zzb, false);
        Y4.D.r0(parcel, 3, this.zzc, i7, false);
        Y4.D.z0(x02, parcel);
    }

    public zzbb(String str, PendingIntent pendingIntent) {
        this(1, str, pendingIntent);
    }
}
