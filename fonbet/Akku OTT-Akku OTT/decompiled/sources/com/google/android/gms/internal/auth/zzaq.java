package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class zzaq extends a {
    public static final Parcelable.Creator<zzaq> CREATOR = new zzar();
    final int zza;
    public final String zzb;

    public zzaq(int i, String str) {
        this.zza = 1;
        C0875q.g(str);
        this.zzb = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        c.l(parcel, 2, this.zzb, false);
        c.r(parcel, q);
    }

    public zzaq(String str) {
        this(1, str);
    }
}
