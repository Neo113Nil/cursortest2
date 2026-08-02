package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class E0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<E0> CREATOR = new F0();
    public final long a;

    @NonNull
    public final zzgx b;

    @NonNull
    public final zzgx c;

    @NonNull
    public final zzgx d;

    public E0(long j, @NonNull byte[] bArr, @NonNull byte[] bArr2, @NonNull byte[] bArr3) {
        C0875q.g(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        C0875q.g(bArr2);
        zzgx zzl2 = zzgx.zzl(bArr2, 0, bArr2.length);
        C0875q.g(bArr3);
        zzgx zzl3 = zzgx.zzl(bArr3, 0, bArr3.length);
        this.a = j;
        C0875q.g(zzl);
        this.b = zzl;
        C0875q.g(zzl2);
        this.c = zzl2;
        C0875q.g(zzl3);
        this.d = zzl3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof E0)) {
            return false;
        }
        E0 e0 = (E0) obj;
        return this.a == e0.a && C0874p.a(this.b, e0.b) && C0874p.a(this.c, e0.c) && C0874p.a(this.d, e0.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 8);
        parcel.writeLong(this.a);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.b.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, this.c.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.d.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
