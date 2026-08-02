package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import k3.C1338c;

/* loaded from: classes.dex */
public final class zzai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzai> CREATOR = new C1338c(10);

    /* renamed from: a, reason: collision with root package name */
    public final byte[][] f11508a;

    public zzai(byte[][] bArr) {
        D.b(bArr != null);
        D.b(1 == ((bArr.length & 1) ^ 1));
        int i7 = 0;
        while (i7 < bArr.length) {
            D.b(i7 == 0 || bArr[i7] != null);
            int i8 = i7 + 1;
            D.b(bArr[i8] != null);
            int length = bArr[i8].length;
            D.b(length == 32 || length == 64);
            i7 += 2;
        }
        this.f11508a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzai) {
            return Arrays.deepEquals(this.f11508a, ((zzai) obj).f11508a);
        }
        return false;
    }

    public final int hashCode() {
        int i7 = 0;
        for (byte[] bArr : this.f11508a) {
            i7 ^= Arrays.hashCode(new Object[]{bArr});
        }
        return i7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        byte[][] bArr = this.f11508a;
        if (bArr != null) {
            int x03 = Y4.D.x0(1, parcel);
            parcel.writeInt(bArr.length);
            for (byte[] bArr2 : bArr) {
                parcel.writeByteArray(bArr2);
            }
            Y4.D.z0(x03, parcel);
        }
        Y4.D.z0(x02, parcel);
    }
}
