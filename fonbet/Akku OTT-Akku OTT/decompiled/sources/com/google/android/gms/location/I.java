package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class I extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<I> CREATOR = new J();
    public final int a;
    public final int b;
    public final long c;
    public final long d;

    public I(int i, int i2, long j, long j2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof I) {
            I i = (I) obj;
            if (this.a == i.a && this.b == i.b && this.c == i.c && this.d == i.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.b), Integer.valueOf(this.a), Long.valueOf(this.d), Long.valueOf(this.c)});
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.a + " Cell status: " + this.b + " elapsed time NS: " + this.d + " system time ms: " + this.c;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
