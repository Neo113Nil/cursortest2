package com.google.android.gms.internal.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzk extends a {
    public static final Parcelable.Creator<zzk> CREATOR = new zzl();
    final PendingIntent zza;

    public zzk(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 1, this.zza, i, false);
        c.r(parcel, q);
    }
}
