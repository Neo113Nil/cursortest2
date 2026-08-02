package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

@Deprecated
/* loaded from: classes4.dex */
public final class p extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<p> CREATOR = new L();
    public final String a;
    public final String b;

    public p(@NonNull String str, @NonNull String str2) {
        C0875q.h(str, "Account identifier cannot be null");
        String trim = str.trim();
        C0875q.e(trim, "Account identifier cannot be empty");
        this.a = trim;
        C0875q.d(str2);
        this.b = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return C0874p.a(this.a, pVar.a) && C0874p.a(this.b, pVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
