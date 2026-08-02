package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzoo extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzoo> CREATOR = new zzop();
    public final List zza;

    public zzoo(List list) {
        this.zza = list;
    }

    public static zzoo zza(zzls... zzlsVarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        return new zzoo(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.zza;
        int q = c.q(parcel, 20293);
        c.h(parcel, 1, list);
        c.r(parcel, q);
    }
}
