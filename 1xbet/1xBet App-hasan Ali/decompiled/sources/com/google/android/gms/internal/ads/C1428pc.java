package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.pc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1428pc extends AbstractC2187a {
    public static final Parcelable.Creator<C1428pc> CREATOR = new C0730Zb(4);

    /* renamed from: k, reason: collision with root package name */
    public final Bundle f14995k;

    /* renamed from: l, reason: collision with root package name */
    public final U2.a f14996l;

    /* renamed from: m, reason: collision with root package name */
    public final ApplicationInfo f14997m;

    /* renamed from: n, reason: collision with root package name */
    public final String f14998n;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f14999o;

    /* renamed from: p, reason: collision with root package name */
    public final PackageInfo f15000p;

    /* renamed from: q, reason: collision with root package name */
    public final String f15001q;

    /* renamed from: r, reason: collision with root package name */
    public final String f15002r;

    /* renamed from: s, reason: collision with root package name */
    public C1353nr f15003s;

    /* renamed from: t, reason: collision with root package name */
    public String f15004t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f15005u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f15006v;

    /* renamed from: w, reason: collision with root package name */
    public final Bundle f15007w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f15008x;

    public C1428pc(Bundle bundle, U2.a aVar, ApplicationInfo applicationInfo, String str, ArrayList arrayList, PackageInfo packageInfo, String str2, String str3, C1353nr c1353nr, String str4, boolean z3, boolean z5, Bundle bundle2, Bundle bundle3) {
        this.f14995k = bundle;
        this.f14996l = aVar;
        this.f14998n = str;
        this.f14997m = applicationInfo;
        this.f14999o = arrayList;
        this.f15000p = packageInfo;
        this.f15001q = str2;
        this.f15002r = str3;
        this.f15003s = c1353nr;
        this.f15004t = str4;
        this.f15005u = z3;
        this.f15006v = z5;
        this.f15007w = bundle2;
        this.f15008x = bundle3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.b0(parcel, 1, this.f14995k);
        AbstractC2036a.e0(parcel, 2, this.f14996l, i);
        AbstractC2036a.e0(parcel, 3, this.f14997m, i);
        AbstractC2036a.f0(parcel, 4, this.f14998n);
        AbstractC2036a.h0(parcel, 5, this.f14999o);
        AbstractC2036a.e0(parcel, 6, this.f15000p, i);
        AbstractC2036a.f0(parcel, 7, this.f15001q);
        AbstractC2036a.f0(parcel, 9, this.f15002r);
        AbstractC2036a.e0(parcel, 10, this.f15003s, i);
        AbstractC2036a.f0(parcel, 11, this.f15004t);
        AbstractC2036a.n0(parcel, 12, 4);
        parcel.writeInt(this.f15005u ? 1 : 0);
        AbstractC2036a.n0(parcel, 13, 4);
        parcel.writeInt(this.f15006v ? 1 : 0);
        AbstractC2036a.b0(parcel, 14, this.f15007w);
        AbstractC2036a.b0(parcel, 15, this.f15008x);
        AbstractC2036a.m0(parcel, k02);
    }
}
