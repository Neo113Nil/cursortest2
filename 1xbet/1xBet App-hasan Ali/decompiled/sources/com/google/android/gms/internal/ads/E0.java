package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class E0 extends K0 {
    public static final Parcelable.Creator<E0> CREATOR = new C1812y0(5);

    /* renamed from: l, reason: collision with root package name */
    public final byte[] f8445l;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public E0(Parcel parcel) {
        super(r0);
        String readString = parcel.readString();
        int i = AbstractC1260lo.f14419a;
        this.f8445l = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E0.class == obj.getClass()) {
            E0 e02 = (E0) obj;
            if (this.f10099k.equals(e02.f10099k) && Arrays.equals(this.f8445l, e02.f8445l)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8445l) + ((this.f10099k.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10099k);
        parcel.writeByteArray(this.f8445l);
    }

    public E0(String str, byte[] bArr) {
        super(str);
        this.f8445l = bArr;
    }
}
