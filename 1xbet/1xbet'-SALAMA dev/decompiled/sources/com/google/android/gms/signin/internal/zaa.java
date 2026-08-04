package com.google.android.gms.signin.internal;

import Y4.D;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p140t3.l;

/* JADX INFO: loaded from: classes.dex */
public final class zaa extends AbstractSafeParcelable implements s {
    public static final Parcelable.Creator<zaa> CREATOR = new l(20);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Intent f11558c;

    public zaa(int i7, int i8, Intent intent) {
        this.f11556a = i7;
        this.f11557b = i8;
        this.f11558c = intent;
    }

    @Override // com.google.android.gms.common.api.s
    public final Status getStatus() {
        return this.f11557b == 0 ? Status.f11077e : Status.f11081z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11556a);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11557b);
        D.r0(parcel, 3, this.f11558c, i7, false);
        D.z0(iX0, parcel);
    }
}
