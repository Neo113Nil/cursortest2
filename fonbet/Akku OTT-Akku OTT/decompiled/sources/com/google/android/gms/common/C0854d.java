package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.common.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0854d extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0854d> CREATOR = new o();
    public final String a;

    @Deprecated
    public final int b;
    public final long c;

    public C0854d(@NonNull String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0854d) {
            C0854d c0854d = (C0854d) obj;
            String str = this.a;
            if (((str != null && str.equals(c0854d.a)) || (str == null && c0854d.a == null)) && l() == c0854d.l()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(l())});
    }

    public final long l() {
        long j = this.c;
        return j == -1 ? this.b : j;
    }

    @NonNull
    public final String toString() {
        C0874p.a aVar = new C0874p.a(this);
        aVar.a(this.a, "name");
        aVar.a(Long.valueOf(l()), "version");
        return aVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        long l = l();
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 8);
        parcel.writeLong(l);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public C0854d(@NonNull String str, long j) {
        this.a = str;
        this.c = j;
        this.b = -1;
    }
}
