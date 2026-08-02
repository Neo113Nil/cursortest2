package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzoq extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzoq> CREATOR = new zzor();
    public final List zza;

    public zzoq(List list) {
        this.zza = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int q = c.q(parcel, 20293);
        c.p(parcel, 1, list, false);
        c.r(parcel, q);
    }
}
