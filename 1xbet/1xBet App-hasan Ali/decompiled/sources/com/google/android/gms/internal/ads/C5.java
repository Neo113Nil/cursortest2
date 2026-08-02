package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class C5 implements Parcelable {
    public static final Parcelable.Creator<C5> CREATOR = new C1812y0(20);

    /* renamed from: k, reason: collision with root package name */
    public final InterfaceC1592t5[] f7964k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7965l;

    public C5(long j5, InterfaceC1592t5... interfaceC1592t5Arr) {
        this.f7965l = j5;
        this.f7964k = interfaceC1592t5Arr;
    }

    public final C5 a(InterfaceC1592t5... interfaceC1592t5Arr) {
        int length = interfaceC1592t5Arr.length;
        if (length == 0) {
            return this;
        }
        int i = AbstractC1260lo.f14419a;
        InterfaceC1592t5[] interfaceC1592t5Arr2 = this.f7964k;
        int length2 = interfaceC1592t5Arr2.length;
        Object[] copyOf = Arrays.copyOf(interfaceC1592t5Arr2, length2 + length);
        System.arraycopy(interfaceC1592t5Arr, 0, copyOf, length2, length);
        return new C5(this.f7965l, (InterfaceC1592t5[]) copyOf);
    }

    public final C5 b(C5 c5) {
        return c5 == null ? this : a(c5.f7964k);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5.class == obj.getClass()) {
            C5 c5 = (C5) obj;
            if (Arrays.equals(this.f7964k, c5.f7964k) && this.f7965l == c5.f7965l) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f7964k) * 31;
        long j5 = this.f7965l;
        return hashCode + ((int) (j5 ^ (j5 >>> 32)));
    }

    public final String toString() {
        long j5 = this.f7965l;
        return L1.a.n("entries=", Arrays.toString(this.f7964k), j5 == -9223372036854775807L ? "" : AbstractC2107A.r(", presentationTimeUs=", j5));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        InterfaceC1592t5[] interfaceC1592t5Arr = this.f7964k;
        parcel.writeInt(interfaceC1592t5Arr.length);
        for (InterfaceC1592t5 interfaceC1592t5 : interfaceC1592t5Arr) {
            parcel.writeParcelable(interfaceC1592t5, 0);
        }
        parcel.writeLong(this.f7965l);
    }

    public C5(Parcel parcel) {
        this.f7964k = new InterfaceC1592t5[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC1592t5[] interfaceC1592t5Arr = this.f7964k;
            if (i >= interfaceC1592t5Arr.length) {
                this.f7965l = parcel.readLong();
                return;
            } else {
                interfaceC1592t5Arr[i] = (InterfaceC1592t5) parcel.readParcelable(InterfaceC1592t5.class.getClassLoader());
                i++;
            }
        }
    }

    public C5(List list) {
        this(-9223372036854775807L, (InterfaceC1592t5[]) list.toArray(new InterfaceC1592t5[0]));
    }
}
