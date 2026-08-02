package com.google.firebase.auth.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import f4.C1092d;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzbl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new C1092d(6);

    /* renamed from: a, reason: collision with root package name */
    public final List f11930a;

    /* renamed from: b, reason: collision with root package name */
    public final List f11931b;

    public zzbl(ArrayList arrayList, ArrayList arrayList2) {
        this.f11930a = arrayList == null ? new ArrayList() : arrayList;
        this.f11931b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.w0(parcel, 1, this.f11930a, false);
        D.w0(parcel, 2, this.f11931b, false);
        D.z0(x02, parcel);
    }
}
