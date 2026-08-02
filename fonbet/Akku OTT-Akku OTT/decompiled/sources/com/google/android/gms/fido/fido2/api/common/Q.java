package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class Q extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<Q> CREATOR = new S();

    @NonNull
    public final String a;

    public Q(@NonNull String str) {
        C0875q.g(str);
        this.a = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Q) {
            return this.a.equals(((Q) obj).a);
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
