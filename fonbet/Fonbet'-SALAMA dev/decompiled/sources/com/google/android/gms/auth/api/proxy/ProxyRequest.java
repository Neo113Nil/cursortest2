package com.google.android.gms.auth.api.proxy;

import Y4.D;
import Z2.a;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.ads.zzbbd;

/* loaded from: classes.dex */
public class ProxyRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ProxyRequest> CREATOR = new a(20);

    /* renamed from: a, reason: collision with root package name */
    public final String f11005a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11006b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11007c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f11008d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11009e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f11010f;

    public ProxyRequest(int i7, String str, int i8, long j, byte[] bArr, Bundle bundle) {
        this.f11009e = i7;
        this.f11005a = str;
        this.f11006b = i8;
        this.f11007c = j;
        this.f11008d = bArr;
        this.f11010f = bundle;
    }

    public final String toString() {
        return "ProxyRequest[ url: " + this.f11005a + ", method: " + this.f11006b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11005a, false);
        D.B0(parcel, 2, 4);
        parcel.writeInt(this.f11006b);
        D.B0(parcel, 3, 8);
        parcel.writeLong(this.f11007c);
        D.l0(parcel, 4, this.f11008d, false);
        D.k0(parcel, 5, this.f11010f, false);
        D.B0(parcel, zzbbd.zzq.zzf, 4);
        parcel.writeInt(this.f11009e);
        D.z0(x02, parcel);
    }
}
