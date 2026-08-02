package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.nr, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353nr extends AbstractC2187a {
    public static final Parcelable.Creator<C1353nr> CREATOR = new C0730Zb(13);

    /* renamed from: k, reason: collision with root package name */
    public final Context f14716k;

    /* renamed from: l, reason: collision with root package name */
    public final int f14717l;

    /* renamed from: m, reason: collision with root package name */
    public final EnumC1308mr f14718m;

    /* renamed from: n, reason: collision with root package name */
    public final int f14719n;

    /* renamed from: o, reason: collision with root package name */
    public final int f14720o;

    /* renamed from: p, reason: collision with root package name */
    public final int f14721p;

    /* renamed from: q, reason: collision with root package name */
    public final String f14722q;

    /* renamed from: r, reason: collision with root package name */
    public final int f14723r;

    /* renamed from: s, reason: collision with root package name */
    public final int f14724s;

    /* renamed from: t, reason: collision with root package name */
    public final int f14725t;

    public C1353nr(int i, int i5, int i6, int i7, String str, int i8, int i9) {
        EnumC1308mr[] values = EnumC1308mr.values();
        this.f14716k = null;
        this.f14717l = i;
        this.f14718m = values[i];
        this.f14719n = i5;
        this.f14720o = i6;
        this.f14721p = i7;
        this.f14722q = str;
        this.f14723r = i8;
        this.f14725t = new int[]{1, 2, 3}[i8];
        this.f14724s = i9;
        int i10 = new int[]{1}[i9];
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.n0(parcel, 1, 4);
        parcel.writeInt(this.f14717l);
        AbstractC2036a.n0(parcel, 2, 4);
        parcel.writeInt(this.f14719n);
        AbstractC2036a.n0(parcel, 3, 4);
        parcel.writeInt(this.f14720o);
        AbstractC2036a.n0(parcel, 4, 4);
        parcel.writeInt(this.f14721p);
        AbstractC2036a.f0(parcel, 5, this.f14722q);
        AbstractC2036a.n0(parcel, 6, 4);
        parcel.writeInt(this.f14723r);
        AbstractC2036a.n0(parcel, 7, 4);
        parcel.writeInt(this.f14724s);
        AbstractC2036a.m0(parcel, k02);
    }

    public C1353nr(Context context, EnumC1308mr enumC1308mr, int i, int i5, int i6, String str, String str2, String str3) {
        int i7;
        EnumC1308mr.values();
        this.f14716k = context;
        this.f14717l = enumC1308mr.ordinal();
        this.f14718m = enumC1308mr;
        this.f14719n = i;
        this.f14720o = i5;
        this.f14721p = i6;
        this.f14722q = str;
        if ("oldest".equals(str2)) {
            i7 = 1;
        } else {
            i7 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.f14725t = i7;
        this.f14723r = i7 - 1;
        "onAdClosed".equals(str3);
        this.f14724s = 0;
    }
}
