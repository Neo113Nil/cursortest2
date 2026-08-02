package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import k4.AbstractC2036a;
import n3.AbstractC2187a;

/* renamed from: com.google.android.gms.internal.ads.q6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459q6 extends AbstractC2187a {
    public static final Parcelable.Creator<C1459q6> CREATOR = new C1812y0(22);

    /* renamed from: k, reason: collision with root package name */
    public final String f15095k;

    /* renamed from: l, reason: collision with root package name */
    public final long f15096l;

    /* renamed from: m, reason: collision with root package name */
    public final String f15097m;

    /* renamed from: n, reason: collision with root package name */
    public final String f15098n;

    /* renamed from: o, reason: collision with root package name */
    public final String f15099o;

    /* renamed from: p, reason: collision with root package name */
    public final Bundle f15100p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f15101q;

    /* renamed from: r, reason: collision with root package name */
    public long f15102r;

    /* renamed from: s, reason: collision with root package name */
    public String f15103s;

    /* renamed from: t, reason: collision with root package name */
    public int f15104t;

    public C1459q6(String str, long j5, String str2, String str3, String str4, Bundle bundle, boolean z3, long j6, String str5, int i) {
        this.f15095k = str;
        this.f15096l = j5;
        this.f15097m = str2 == null ? "" : str2;
        this.f15098n = str3 == null ? "" : str3;
        this.f15099o = str4 == null ? "" : str4;
        this.f15100p = bundle == null ? new Bundle() : bundle;
        this.f15101q = z3;
        this.f15102r = j6;
        this.f15103s = str5;
        this.f15104t = i;
    }

    public static C1459q6 a(Uri uri) {
        try {
            if (!"gcache".equals(uri.getScheme())) {
                return null;
            }
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() != 2) {
                U2.j.i("Expected 2 path parts for namespace and id, found :" + pathSegments.size());
                return null;
            }
            String str = pathSegments.get(0);
            String str2 = pathSegments.get(1);
            String host = uri.getHost();
            String queryParameter = uri.getQueryParameter("url");
            boolean equals = "1".equals(uri.getQueryParameter("read_only"));
            String queryParameter2 = uri.getQueryParameter("expiration");
            long parseLong = queryParameter2 == null ? 0L : Long.parseLong(queryParameter2);
            Bundle bundle = new Bundle();
            for (String str3 : uri.getQueryParameterNames()) {
                if (str3.startsWith("tag.")) {
                    bundle.putString(str3.substring(4), uri.getQueryParameter(str3));
                }
            }
            return new C1459q6(queryParameter, parseLong, host, str, str2, bundle, equals, 0L, "", 0);
        } catch (NullPointerException e3) {
            e = e3;
            U2.j.j("Unable to parse Uri into cache offering.", e);
            return null;
        } catch (NumberFormatException e5) {
            e = e5;
            U2.j.j("Unable to parse Uri into cache offering.", e);
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int k02 = AbstractC2036a.k0(parcel, 20293);
        AbstractC2036a.f0(parcel, 2, this.f15095k);
        AbstractC2036a.n0(parcel, 3, 8);
        parcel.writeLong(this.f15096l);
        AbstractC2036a.f0(parcel, 4, this.f15097m);
        AbstractC2036a.f0(parcel, 5, this.f15098n);
        AbstractC2036a.f0(parcel, 6, this.f15099o);
        AbstractC2036a.b0(parcel, 7, this.f15100p);
        AbstractC2036a.n0(parcel, 8, 4);
        parcel.writeInt(this.f15101q ? 1 : 0);
        long j5 = this.f15102r;
        AbstractC2036a.n0(parcel, 9, 8);
        parcel.writeLong(j5);
        AbstractC2036a.f0(parcel, 10, this.f15103s);
        int i5 = this.f15104t;
        AbstractC2036a.n0(parcel, 11, 4);
        parcel.writeInt(i5);
        AbstractC2036a.m0(parcel, k02);
    }
}
