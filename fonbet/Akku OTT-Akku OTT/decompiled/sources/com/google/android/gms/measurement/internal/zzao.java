package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzao extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<zzao> CREATOR = new zzap();
    public final Bundle zza;

    public zzao(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.zza;
        int q = c.q(parcel, 20293);
        c.b(parcel, 1, bundle, false);
        c.r(parcel, q);
    }
}
