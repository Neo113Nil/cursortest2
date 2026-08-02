package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzau extends a {
    public static final Parcelable.Creator<zzau> CREATOR = new zzav();
    String zza;

    @Nullable
    Bundle zzb;

    private zzau() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.b(parcel, 3, this.zzb, false);
        c.r(parcel, q);
    }

    public zzau(String str, @Nullable Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }
}
