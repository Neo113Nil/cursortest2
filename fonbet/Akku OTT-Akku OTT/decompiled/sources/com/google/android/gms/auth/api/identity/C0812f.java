package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.identity.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0812f extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0812f> CREATOR = new v();
    public final String a;
    public final boolean b;

    public C0812f(@NonNull String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0812f) {
            C0812f c0812f = (C0812f) obj;
            if (this.a.equals(c0812f.a) && this.b == c0812f.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
