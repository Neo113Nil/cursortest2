package com.google.android.gms.location;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.location.zzbs;
import java.util.List;

/* loaded from: classes4.dex */
public final class K extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<K> CREATOR = new L();
    public final zzbs a;

    @Nullable
    public final PendingIntent b;
    public final String c;

    public K(@Nullable List<String> list, @Nullable PendingIntent pendingIntent, String str) {
        this.a = list == null ? zzbs.zzi() : zzbs.zzj(list);
        this.b = pendingIntent;
        this.c = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.n(parcel, 1, this.a);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
