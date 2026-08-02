package com.google.android.gms.auth.api.signin.internal;

import Y4.D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* loaded from: classes.dex */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new E(7);

    /* renamed from: a, reason: collision with root package name */
    public final int f11048a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11049b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f11050c;

    public GoogleSignInOptionsExtensionParcelable(int i7, int i8, Bundle bundle) {
        this.f11048a = i7;
        this.f11049b = i8;
        this.f11050c = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11048a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11049b);
        D.k0(parcel, 3, this.f11050c, false);
        D.z0(x02, parcel);
    }
}
