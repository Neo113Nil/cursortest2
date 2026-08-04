package com.google.firebase.auth.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import p042f4.C0895d;
import p042f4.r;
import p122r.b;

/* JADX INFO: loaded from: classes2.dex */
public final class zzv implements SafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new C0895d(7);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f11934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11935d;

    public zzv(boolean z4) {
        this.f11935d = z4;
        this.f11933b = null;
        this.f11932a = null;
        this.f11934c = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11932a, false);
        D.s0(parcel, 2, this.f11933b, false);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11935d ? 1 : 0);
        D.z0(iX0, parcel);
    }

    public zzv(String str, String str2, boolean z4) {
        com.google.android.gms.common.internal.D.e(str);
        com.google.android.gms.common.internal.D.e(str2);
        this.f11932a = str;
        this.f11933b = str2;
        this.f11934c = r.d(str2);
        this.f11935d = z4;
    }
}
