package com.google.android.gms.internal.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import android.widget.RemoteViews;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzm extends a {
    public static final Parcelable.Creator<zzm> CREATOR = new zzn();
    String[] zza;
    int[] zzb;
    RemoteViews zzc;
    byte[] zzd;

    private zzm() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.m(parcel, 1, this.zza, false);
        c.g(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc, i, false);
        c.c(parcel, 4, this.zzd, false);
        c.r(parcel, q);
    }

    public zzm(String[] strArr, int[] iArr, RemoteViews remoteViews, byte[] bArr) {
        this.zza = strArr;
        this.zzb = iArr;
        this.zzc = remoteViews;
        this.zzd = bArr;
    }
}
