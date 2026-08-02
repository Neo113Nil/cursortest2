package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zzfu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfu> CREATOR = new e(10);

    /* renamed from: a, reason: collision with root package name */
    public final String f10735a;

    public zzfu(String str) {
        this.f10735a = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 15, this.f10735a, false);
        D.z0(x02, parcel);
    }
}
