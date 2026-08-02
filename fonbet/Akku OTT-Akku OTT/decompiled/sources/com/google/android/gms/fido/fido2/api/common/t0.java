package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class t0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<t0> CREATOR = new u0();

    @Nullable
    public final zzgx a;

    @Nullable
    public final zzgx b;

    public t0(@Nullable zzgx zzgxVar, @Nullable zzgx zzgxVar2) {
        this.a = zzgxVar;
        this.b = zzgxVar2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return C0874p.a(this.a, t0Var.a) && C0874p.a(this.b, t0Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        zzgx zzgxVar = this.a;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.b;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, zzgxVar2 != null ? zzgxVar2.zzm() : null, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
