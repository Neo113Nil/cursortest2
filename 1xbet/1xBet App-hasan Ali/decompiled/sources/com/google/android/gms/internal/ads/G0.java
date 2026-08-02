package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class G0 extends K0 {
    public static final Parcelable.Creator<G0> CREATOR = new C1812y0(7);

    /* renamed from: l, reason: collision with root package name */
    public final String f9147l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f9148m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f9149n;

    /* renamed from: o, reason: collision with root package name */
    public final String[] f9150o;

    /* renamed from: p, reason: collision with root package name */
    public final K0[] f9151p;

    public G0(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f9147l = readString;
        this.f9148m = parcel.readByte() != 0;
        this.f9149n = parcel.readByte() != 0;
        this.f9150o = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.f9151p = new K0[readInt];
        for (int i5 = 0; i5 < readInt; i5++) {
            this.f9151p[i5] = (K0) parcel.readParcelable(K0.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && G0.class == obj.getClass()) {
            G0 g02 = (G0) obj;
            if (this.f9148m == g02.f9148m && this.f9149n == g02.f9149n && Objects.equals(this.f9147l, g02.f9147l) && Arrays.equals(this.f9150o, g02.f9150o) && Arrays.equals(this.f9151p, g02.f9151p)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f9147l;
        return (((((this.f9148m ? 1 : 0) + 527) * 31) + (this.f9149n ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9147l);
        parcel.writeByte(this.f9148m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9149n ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f9150o);
        K0[] k0Arr = this.f9151p;
        parcel.writeInt(k0Arr.length);
        for (K0 k02 : k0Arr) {
            parcel.writeParcelable(k02, 0);
        }
    }

    public G0(String str, boolean z3, boolean z5, String[] strArr, K0[] k0Arr) {
        super("CTOC");
        this.f9147l = str;
        this.f9148m = z3;
        this.f9149n = z5;
        this.f9150o = strArr;
        this.f9151p = k0Arr;
    }
}
