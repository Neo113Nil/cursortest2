package com.google.android.gms.ads.internal.client;

import B2.e;
import Y4.D;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzv> CREATOR = new e(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f10785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public zze f10786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bundle f10787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10789f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10790x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final String f10791y;

    public zzv(String str, long j, zze zzeVar, Bundle bundle, String str2, String str3, String str4, String str5) {
        this.f10784a = str;
        this.f10785b = j;
        this.f10786c = zzeVar;
        this.f10787d = bundle;
        this.f10788e = str2;
        this.f10789f = str3;
        this.f10790x = str4;
        this.f10791y = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f10784a, false);
        long j = this.f10785b;
        D.B0(parcel, 2, 8);
        parcel.writeLong(j);
        D.r0(parcel, 3, this.f10786c, i7, false);
        D.k0(parcel, 4, this.f10787d, false);
        D.s0(parcel, 5, this.f10788e, false);
        D.s0(parcel, 6, this.f10789f, false);
        D.s0(parcel, 7, this.f10790x, false);
        D.s0(parcel, 8, this.f10791y, false);
        D.z0(iX0, parcel);
    }
}
