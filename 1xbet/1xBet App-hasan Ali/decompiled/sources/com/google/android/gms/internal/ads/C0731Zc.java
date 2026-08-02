package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.Zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0731Zc extends AbstractC2187a {
    public static final Parcelable.Creator<C0731Zc> CREATOR = new C0730Zb(8);

    /* renamed from: k, reason: collision with root package name */
    public final String f12486k;

    /* renamed from: l, reason: collision with root package name */
    public final String f12487l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f12488m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f12489n;

    /* renamed from: o, reason: collision with root package name */
    public final List f12490o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f12491p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f12492q;

    /* renamed from: r, reason: collision with root package name */
    public final List f12493r;

    public C0731Zc(String str, String str2, boolean z3, boolean z5, List list, boolean z6, boolean z7, List list2) {
        this.f12486k = str;
        this.f12487l = str2;
        this.f12488m = z3;
        this.f12489n = z5;
        this.f12490o = list;
        this.f12491p = z6;
        this.f12492q = z7;
        this.f12493r = list2 == null ? new ArrayList() : list2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 2, this.f12486k);
        AbstractC2036a.f0(parcel, 3, this.f12487l);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f12488m ? 1 : 0);
        AbstractC2036a.n0(parcel, 5, 4);
        parcel.writeInt(this.f12489n ? 1 : 0);
        AbstractC2036a.h0(parcel, 6, this.f12490o);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f12491p ? 1 : 0);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f12492q ? 1 : 0);
        AbstractC2036a.h0(parcel, 9, this.f12493r);
        AbstractC2036a.m0(parcel, k02);
    }
}
