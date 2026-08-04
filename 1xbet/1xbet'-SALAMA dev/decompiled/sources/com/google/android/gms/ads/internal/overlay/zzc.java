package com.google.android.gms.ads.internal.overlay;

import B2.e;
import H2.a;
import Y4.D;
import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p105o3.b;

/* JADX INFO: loaded from: classes.dex */
public final class zzc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzc> CREATOR = new e(18);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f10824A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f10829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f10830f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final String f10831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Intent f10832y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final a f10833z;

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, Intent intent, IBinder iBinder, boolean z4) {
        this.f10825a = str;
        this.f10826b = str2;
        this.f10827c = str3;
        this.f10828d = str4;
        this.f10829e = str5;
        this.f10830f = str6;
        this.f10831x = str7;
        this.f10832y = intent;
        this.f10833z = (a) b.t0(b.Z(iBinder));
        this.f10824A = z4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 2, this.f10825a, false);
        D.s0(parcel, 3, this.f10826b, false);
        D.s0(parcel, 4, this.f10827c, false);
        D.s0(parcel, 5, this.f10828d, false);
        D.s0(parcel, 6, this.f10829e, false);
        D.s0(parcel, 7, this.f10830f, false);
        D.s0(parcel, 8, this.f10831x, false);
        D.r0(parcel, 9, this.f10832y, i7, false);
        D.n0(parcel, 10, new b(this.f10833z).asBinder());
        D.B0(parcel, 11, 4);
        parcel.writeInt(this.f10824A ? 1 : 0);
        D.z0(iX0, parcel);
    }

    public zzc(Intent intent, a aVar) {
        this(null, null, null, null, null, null, null, intent, new b(aVar).asBinder(), false);
    }

    public zzc(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7, null, new b(aVar).asBinder(), false);
    }
}
