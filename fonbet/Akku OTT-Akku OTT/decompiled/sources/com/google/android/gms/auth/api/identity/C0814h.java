package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.identity.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0814h extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0814h> CREATOR = new y();
    public final int a;

    public C0814h(int i) {
        this.a = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0814h) {
            return C0874p.a(Integer.valueOf(this.a), Integer.valueOf(((C0814h) obj).a));
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
