package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class N extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<N> CREATOR = new O();
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public N(int i, int i2, int i3, int i4) {
        C0875q.i(i >= 0 && i <= 23, "Start hour must be in range [0, 23].");
        C0875q.i(i2 >= 0 && i2 <= 59, "Start minute must be in range [0, 59].");
        C0875q.i(i3 >= 0 && i3 <= 23, "End hour must be in range [0, 23].");
        C0875q.i(i4 >= 0 && i4 <= 59, "End minute must be in range [0, 59].");
        C0875q.i(((i + i2) + i3) + i4 > 0, "Parameters can't be all 0.");
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N)) {
            return false;
        }
        N n = (N) obj;
        return this.a == n.a && this.b == n.b && this.c == n.c && this.d == n.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(117);
        sb.append("UserPreferredSleepWindow [startHour=");
        sb.append(this.a);
        sb.append(", startMinute=");
        sb.append(this.b);
        sb.append(", endHour=");
        sb.append(this.c);
        sb.append(", endMinute=");
        sb.append(this.d);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        C0875q.g(parcel);
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
