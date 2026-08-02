package com.google.android.gms.ads.internal.client;

import B2.e;
import P6.b;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new e(12);

    /* renamed from: A, reason: collision with root package name */
    public final zzfu f10739A;

    /* renamed from: B, reason: collision with root package name */
    public final Location f10740B;

    /* renamed from: C, reason: collision with root package name */
    public final String f10741C;

    /* renamed from: D, reason: collision with root package name */
    public final Bundle f10742D;

    /* renamed from: E, reason: collision with root package name */
    public final Bundle f10743E;

    /* renamed from: F, reason: collision with root package name */
    public final List f10744F;

    /* renamed from: G, reason: collision with root package name */
    public final String f10745G;

    /* renamed from: H, reason: collision with root package name */
    public final String f10746H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f10747I;

    /* renamed from: J, reason: collision with root package name */
    public final zzc f10748J;

    /* renamed from: K, reason: collision with root package name */
    public final int f10749K;

    /* renamed from: L, reason: collision with root package name */
    public final String f10750L;

    /* renamed from: M, reason: collision with root package name */
    public final List f10751M;

    /* renamed from: N, reason: collision with root package name */
    public final int f10752N;

    /* renamed from: O, reason: collision with root package name */
    public final String f10753O;

    /* renamed from: P, reason: collision with root package name */
    public final int f10754P;

    /* renamed from: Q, reason: collision with root package name */
    public final long f10755Q;

    /* renamed from: a, reason: collision with root package name */
    public final int f10756a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10757b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f10758c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10759d;

    /* renamed from: e, reason: collision with root package name */
    public final List f10760e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f10761f;

    /* renamed from: x, reason: collision with root package name */
    public final int f10762x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f10763y;

    /* renamed from: z, reason: collision with root package name */
    public final String f10764z;

    public zzm(int i7, long j, Bundle bundle, int i8, List list, boolean z4, int i9, boolean z7, String str, zzfu zzfuVar, Location location, String str2, Bundle bundle2, Bundle bundle3, List list2, String str3, String str4, boolean z8, zzc zzcVar, int i10, String str5, List list3, int i11, String str6, int i12, long j3) {
        this.f10756a = i7;
        this.f10757b = j;
        this.f10758c = bundle == null ? new Bundle() : bundle;
        this.f10759d = i8;
        this.f10760e = list;
        this.f10761f = z4;
        this.f10762x = i9;
        this.f10763y = z7;
        this.f10764z = str;
        this.f10739A = zzfuVar;
        this.f10740B = location;
        this.f10741C = str2;
        this.f10742D = bundle2 == null ? new Bundle() : bundle2;
        this.f10743E = bundle3;
        this.f10744F = list2;
        this.f10745G = str3;
        this.f10746H = str4;
        this.f10747I = z8;
        this.f10748J = zzcVar;
        this.f10749K = i10;
        this.f10750L = str5;
        this.f10751M = list3 == null ? new ArrayList() : list3;
        this.f10752N = i11;
        this.f10753O = str6;
        this.f10754P = i12;
        this.f10755Q = j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzm) {
            return j(obj) && this.f10755Q == ((zzm) obj).f10755Q;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f10756a), Long.valueOf(this.f10757b), this.f10758c, Integer.valueOf(this.f10759d), this.f10760e, Boolean.valueOf(this.f10761f), Integer.valueOf(this.f10762x), Boolean.valueOf(this.f10763y), this.f10764z, this.f10739A, this.f10740B, this.f10741C, this.f10742D, this.f10743E, this.f10744F, this.f10745G, this.f10746H, Boolean.valueOf(this.f10747I), Integer.valueOf(this.f10749K), this.f10750L, this.f10751M, Integer.valueOf(this.f10752N), this.f10753O, Integer.valueOf(this.f10754P), Long.valueOf(this.f10755Q)});
    }

    public final boolean j(Object obj) {
        if (!(obj instanceof zzm)) {
            return false;
        }
        zzm zzmVar = (zzm) obj;
        return this.f10756a == zzmVar.f10756a && this.f10757b == zzmVar.f10757b && b.X(this.f10758c, zzmVar.f10758c) && this.f10759d == zzmVar.f10759d && D.m(this.f10760e, zzmVar.f10760e) && this.f10761f == zzmVar.f10761f && this.f10762x == zzmVar.f10762x && this.f10763y == zzmVar.f10763y && D.m(this.f10764z, zzmVar.f10764z) && D.m(this.f10739A, zzmVar.f10739A) && D.m(this.f10740B, zzmVar.f10740B) && D.m(this.f10741C, zzmVar.f10741C) && b.X(this.f10742D, zzmVar.f10742D) && b.X(this.f10743E, zzmVar.f10743E) && D.m(this.f10744F, zzmVar.f10744F) && D.m(this.f10745G, zzmVar.f10745G) && D.m(this.f10746H, zzmVar.f10746H) && this.f10747I == zzmVar.f10747I && this.f10749K == zzmVar.f10749K && D.m(this.f10750L, zzmVar.f10750L) && D.m(this.f10751M, zzmVar.f10751M) && this.f10752N == zzmVar.f10752N && D.m(this.f10753O, zzmVar.f10753O) && this.f10754P == zzmVar.f10754P;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.B0(parcel, 1, 4);
        parcel.writeInt(this.f10756a);
        Y4.D.B0(parcel, 2, 8);
        parcel.writeLong(this.f10757b);
        Y4.D.k0(parcel, 3, this.f10758c, false);
        Y4.D.B0(parcel, 4, 4);
        parcel.writeInt(this.f10759d);
        Y4.D.u0(parcel, 5, this.f10760e);
        Y4.D.B0(parcel, 6, 4);
        parcel.writeInt(this.f10761f ? 1 : 0);
        Y4.D.B0(parcel, 7, 4);
        parcel.writeInt(this.f10762x);
        Y4.D.B0(parcel, 8, 4);
        parcel.writeInt(this.f10763y ? 1 : 0);
        Y4.D.s0(parcel, 9, this.f10764z, false);
        Y4.D.r0(parcel, 10, this.f10739A, i7, false);
        Y4.D.r0(parcel, 11, this.f10740B, i7, false);
        Y4.D.s0(parcel, 12, this.f10741C, false);
        Y4.D.k0(parcel, 13, this.f10742D, false);
        Y4.D.k0(parcel, 14, this.f10743E, false);
        Y4.D.u0(parcel, 15, this.f10744F);
        Y4.D.s0(parcel, 16, this.f10745G, false);
        Y4.D.s0(parcel, 17, this.f10746H, false);
        Y4.D.B0(parcel, 18, 4);
        parcel.writeInt(this.f10747I ? 1 : 0);
        Y4.D.r0(parcel, 19, this.f10748J, i7, false);
        Y4.D.B0(parcel, 20, 4);
        parcel.writeInt(this.f10749K);
        Y4.D.s0(parcel, 21, this.f10750L, false);
        Y4.D.u0(parcel, 22, this.f10751M);
        Y4.D.B0(parcel, 23, 4);
        parcel.writeInt(this.f10752N);
        Y4.D.s0(parcel, 24, this.f10753O, false);
        Y4.D.B0(parcel, 25, 4);
        parcel.writeInt(this.f10754P);
        Y4.D.B0(parcel, 26, 8);
        parcel.writeLong(this.f10755Q);
        Y4.D.z0(x02, parcel);
    }
}
