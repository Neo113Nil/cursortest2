package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.identity.l, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0818l extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0818l> CREATOR = new H();
    public final p a;

    @Nullable
    public final String b;
    public final int c;

    public C0818l(p pVar, @Nullable String str, int i) {
        C0875q.g(pVar);
        this.a = pVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0818l)) {
            return false;
        }
        C0818l c0818l = (C0818l) obj;
        return C0874p.a(this.a, c0818l.a) && C0874p.a(this.b, c0818l.b) && this.c == c0818l.c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
