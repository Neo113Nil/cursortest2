package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.g0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0897g0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<C0897g0> CREATOR = new C0899h0();

    @Nullable
    public final String a;

    public C0897g0(@Nullable String str) {
        this.a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0897g0) {
            return C0874p.a(this.a, ((C0897g0) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
