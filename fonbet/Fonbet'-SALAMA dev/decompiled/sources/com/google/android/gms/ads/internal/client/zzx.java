package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

@Deprecated
/* loaded from: classes.dex */
public final class zzx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzx> CREATOR = new e(16);

    /* renamed from: a, reason: collision with root package name */
    public final int f10792a;

    public zzx(int i7) {
        this.f10792a = i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f10792a);
        D.z0(x02, parcel);
    }
}
