package com.google.android.gms.auth.api.proxy;

import Y4.D;
import Z2.a;
import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;

/* JADX INFO: loaded from: classes.dex */
public class ProxyResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyResponse> CREATOR = new a(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PendingIntent f11012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f11014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Bundle f11016f;

    public ProxyResponse(int i7, int i8, PendingIntent pendingIntent, int i9, Bundle bundle, byte[] bArr) {
        this.f11015e = i7;
        this.f11011a = i8;
        this.f11013c = i9;
        this.f11016f = bundle;
        this.f11014d = bArr;
        this.f11012b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.B0(parcel, 1, 4);
        parcel.writeInt(this.f11011a);
        D.r0(parcel, 2, this.f11012b, i7, false);
        D.B0(parcel, 3, 4);
        parcel.writeInt(this.f11013c);
        D.k0(parcel, 4, this.f11016f, false);
        D.l0(parcel, 5, this.f11014d, false);
        D.B0(parcel, zzbbd.zzq.zzf, 4);
        parcel.writeInt(this.f11015e);
        D.z0(iX0, parcel);
    }
}
