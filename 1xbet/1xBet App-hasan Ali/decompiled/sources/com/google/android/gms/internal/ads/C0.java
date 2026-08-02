package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* loaded from: classes.dex */
public final class C0 implements InterfaceC1592t5 {
    public static final Parcelable.Creator<C0> CREATOR = new C1812y0(3);

    /* renamed from: k, reason: collision with root package name */
    public final int f7924k;

    /* renamed from: l, reason: collision with root package name */
    public final String f7925l;

    /* renamed from: m, reason: collision with root package name */
    public final String f7926m;

    /* renamed from: n, reason: collision with root package name */
    public final String f7927n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f7928o;

    /* renamed from: p, reason: collision with root package name */
    public final int f7929p;

    public C0(int i, int i5, String str, String str2, String str3, boolean z3) {
        boolean z5 = true;
        if (i5 != -1 && i5 <= 0) {
            z5 = false;
        }
        AbstractC1668us.S(z5);
        this.f7924k = i;
        this.f7925l = str;
        this.f7926m = str2;
        this.f7927n = str3;
        this.f7928o = z3;
        this.f7929p = i5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1592t5
    public final void d(C1412p4 c1412p4) {
        String str = this.f7926m;
        if (str != null) {
            c1412p4.f14958v = str;
        }
        String str2 = this.f7925l;
        if (str2 != null) {
            c1412p4.f14957u = str2;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0.class == obj.getClass()) {
            C0 c02 = (C0) obj;
            if (this.f7924k == c02.f7924k && Objects.equals(this.f7925l, c02.f7925l) && Objects.equals(this.f7926m, c02.f7926m) && Objects.equals(this.f7927n, c02.f7927n) && this.f7928o == c02.f7928o && this.f7929p == c02.f7929p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f7925l;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f7926m;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = ((this.f7924k + 527) * 31) + hashCode;
        String str3 = this.f7927n;
        return (((((((i * 31) + hashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f7928o ? 1 : 0)) * 31) + this.f7929p;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.f7926m + "\", genre=\"" + this.f7925l + "\", bitrate=" + this.f7924k + ", metadataInterval=" + this.f7929p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7924k);
        parcel.writeString(this.f7925l);
        parcel.writeString(this.f7926m);
        parcel.writeString(this.f7927n);
        int i5 = AbstractC1260lo.f14419a;
        parcel.writeInt(this.f7928o ? 1 : 0);
        parcel.writeInt(this.f7929p);
    }

    public C0(Parcel parcel) {
        this.f7924k = parcel.readInt();
        this.f7925l = parcel.readString();
        this.f7926m = parcel.readString();
        this.f7927n = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f7928o = parcel.readInt() != 0;
        this.f7929p = parcel.readInt();
    }
}
