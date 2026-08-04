package com.google.android.gms.signin.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements s {
    public static final Parcelable.Creator<zag> CREATOR = new l(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f11559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11560b;

    public zag(String str, ArrayList arrayList) {
        this.f11559a = arrayList;
        this.f11560b = str;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f11560b != null ? Status.f11077e : Status.f11081z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.u0(parcel, 1, this.f11559a);
        D.s0(parcel, 2, this.f11560b, false);
        D.z0(iX0, parcel);
    }
}
