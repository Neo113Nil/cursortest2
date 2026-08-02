package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

/* renamed from: com.google.android.gms.location.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0923b extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0923b> CREATOR = new P();
    public final int a;
    public final int b;

    public C0923b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0923b)) {
            return false;
        }
        C0923b c0923b = (C0923b) obj;
        return this.a == c0923b.a && this.b == c0923b.b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(this.a);
        sb.append(", mTransitionType=");
        sb.append(this.b);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        C0875q.g(parcel);
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
