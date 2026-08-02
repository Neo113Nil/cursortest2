package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class D0 extends K0 {
    public static final Parcelable.Creator<D0> CREATOR = new C1812y0(4);

    /* renamed from: l, reason: collision with root package name */
    public final String f8136l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8137m;

    /* renamed from: n, reason: collision with root package name */
    public final int f8138n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f8139o;

    public D0(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f8136l = readString;
        this.f8137m = parcel.readString();
        this.f8138n = parcel.readInt();
        this.f8139o = parcel.createByteArray();
    }

    @Override // com.google.android.gms.internal.ads.K0, com.google.android.gms.internal.ads.InterfaceC1592t5
    public final void d(C1412p4 c1412p4) {
        c1412p4.a(this.f8138n, this.f8139o);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && D0.class == obj.getClass()) {
            D0 d02 = (D0) obj;
            if (this.f8138n == d02.f8138n && Objects.equals(this.f8136l, d02.f8136l) && Objects.equals(this.f8137m, d02.f8137m) && Arrays.equals(this.f8139o, d02.f8139o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f8136l;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.f8137m;
        return Arrays.hashCode(this.f8139o) + ((((((this.f8138n + 527) * 31) + hashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.K0
    public final String toString() {
        return this.f10099k + ": mimeType=" + this.f8136l + ", description=" + this.f8137m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8136l);
        parcel.writeString(this.f8137m);
        parcel.writeInt(this.f8138n);
        parcel.writeByteArray(this.f8139o);
    }

    public D0(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f8136l = str;
        this.f8137m = str2;
        this.f8138n = i;
        this.f8139o = bArr;
    }
}
