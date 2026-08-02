package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0862d extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0862d> CREATOR = new C0881x();
    public final int a;

    @Nullable
    public final String b;

    public C0862d(int i, @Nullable String str) {
        this.a = i;
        this.b = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0862d)) {
            return false;
        }
        C0862d c0862d = (C0862d) obj;
        return c0862d.a == this.a && C0874p.a(c0862d.b, this.b);
    }

    public final int hashCode() {
        return this.a;
    }

    @NonNull
    public final String toString() {
        return this.a + ":" + this.b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
