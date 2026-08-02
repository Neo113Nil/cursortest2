package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class A0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<A0> CREATOR = new C1812y0(1);

    /* renamed from: k, reason: collision with root package name */
    public final int f7492k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7493l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7494m;

    /* renamed from: n, reason: collision with root package name */
    public final int f7495n;

    /* renamed from: o, reason: collision with root package name */
    public final int f7496o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7497p;

    /* renamed from: q, reason: collision with root package name */
    public final int f7498q;

    /* renamed from: r, reason: collision with root package name */
    public final byte[] f7499r;

    public A0(int i, String str, String str2, int i5, int i6, int i7, int i8, byte[] bArr) {
        this.f7492k = i;
        this.f7493l = str;
        this.f7494m = str2;
        this.f7495n = i5;
        this.f7496o = i6;
        this.f7497p = i7;
        this.f7498q = i8;
        this.f7499r = bArr;
    }

    public static A0 a(C1617tm c1617tm) {
        int q5 = c1617tm.q();
        String e3 = AbstractC1593t6.e(c1617tm.b(c1617tm.q(), StandardCharsets.US_ASCII));
        String b3 = c1617tm.b(c1617tm.q(), StandardCharsets.UTF_8);
        int q6 = c1617tm.q();
        int q7 = c1617tm.q();
        int q8 = c1617tm.q();
        int q9 = c1617tm.q();
        int q10 = c1617tm.q();
        byte[] bArr = new byte[q10];
        c1617tm.f(bArr, 0, q10);
        return new A0(q5, e3, b3, q6, q7, q8, q9, bArr);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final void d(C1412p4 c1412p4) {
        c1412p4.a(this.f7492k, this.f7499r);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && A0.class == obj.getClass()) {
            A0 a02 = (A0) obj;
            if (this.f7492k == a02.f7492k && this.f7493l.equals(a02.f7493l) && this.f7494m.equals(a02.f7494m) && this.f7495n == a02.f7495n && this.f7496o == a02.f7496o && this.f7497p == a02.f7497p && this.f7498q == a02.f7498q && Arrays.equals(this.f7499r, a02.f7499r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f7499r) + ((((((((((this.f7494m.hashCode() + ((this.f7493l.hashCode() + ((this.f7492k + 527) * 31)) * 31)) * 31) + this.f7495n) * 31) + this.f7496o) * 31) + this.f7497p) * 31) + this.f7498q) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.f7493l + ", description=" + this.f7494m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7492k);
        parcel.writeString(this.f7493l);
        parcel.writeString(this.f7494m);
        parcel.writeInt(this.f7495n);
        parcel.writeInt(this.f7496o);
        parcel.writeInt(this.f7497p);
        parcel.writeInt(this.f7498q);
        parcel.writeByteArray(this.f7499r);
    }

    public A0(Parcel parcel) {
        this.f7492k = parcel.readInt();
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f7493l = readString;
        this.f7494m = parcel.readString();
        this.f7495n = parcel.readInt();
        this.f7496o = parcel.readInt();
        this.f7497p = parcel.readInt();
        this.f7498q = parcel.readInt();
        this.f7499r = parcel.createByteArray();
    }
}
