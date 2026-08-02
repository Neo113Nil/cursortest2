package com.google.android.gms.common.server.converter;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new E(28);

    /* renamed from: a, reason: collision with root package name */
    public final int f11373a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11374b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11375c;

    public zac(int i7, String str, int i8) {
        this.f11373a = i7;
        this.f11374b = str;
        this.f11375c = i8;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11373a);
        D.s0(parcel, 2, this.f11374b, false);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11375c);
        D.z0(x02, parcel);
    }

    public zac(String str, int i7) {
        this.f11373a = 1;
        this.f11374b = str;
        this.f11375c = i7;
    }
}
