package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new Z2.a(29);

    /* renamed from: a, reason: collision with root package name */
    public final int f11349a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11350b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11351c;

    /* renamed from: d, reason: collision with root package name */
    public final Scope[] f11352d;

    public zax(int i7, int i8, int i9, Scope[] scopeArr) {
        this.f11349a = i7;
        this.f11350b = i8;
        this.f11351c = i9;
        this.f11352d = scopeArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11349a);
        Y4.D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11350b);
        Y4.D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11351c);
        Y4.D.v0(parcel, 4, this.f11352d, i7);
        Y4.D.z0(x02, parcel);
    }
}
