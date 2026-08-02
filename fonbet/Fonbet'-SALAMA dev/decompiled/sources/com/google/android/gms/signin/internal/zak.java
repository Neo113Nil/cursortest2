package com.google.android.gms.signin.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;
import t3.l;

/* loaded from: classes.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new l(23);

    /* renamed from: a, reason: collision with root package name */
    public final int f11563a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectionResult f11564b;

    /* renamed from: c, reason: collision with root package name */
    public final zav f11565c;

    public zak(int i7, ConnectionResult connectionResult, zav zavVar) {
        this.f11563a = i7;
        this.f11564b = connectionResult;
        this.f11565c = zavVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11563a);
        D.r0(parcel, 2, this.f11564b, i7, false);
        D.r0(parcel, 3, this.f11565c, i7, false);
        D.z0(x02, parcel);
    }
}
