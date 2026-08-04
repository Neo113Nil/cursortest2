package com.google.firebase.auth.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p042f4.C0895d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzbl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbl> CREATOR = new C0895d(6);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f11930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f11931b;

    public zzbl(ArrayList arrayList, ArrayList arrayList2) {
        this.f11930a = arrayList == null ? new ArrayList() : arrayList;
        this.f11931b = arrayList2 == null ? new ArrayList() : arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.w0(parcel, 1, this.f11930a, false);
        D.w0(parcel, 2, this.f11931b, false);
        D.z0(iX0, parcel);
    }
}
