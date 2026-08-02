package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.identity.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0815i extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0815i> CREATOR = new z();
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;
    public final boolean e;
    public final int f;

    @Nullable
    public final List i;

    public C0815i(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, boolean z, int i, @Nullable List list) {
        C0875q.g(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
        this.f = i;
        this.i = list;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0815i)) {
            return false;
        }
        C0815i c0815i = (C0815i) obj;
        return C0874p.a(this.a, c0815i.a) && C0874p.a(this.d, c0815i.d) && C0874p.a(this.b, c0815i.b) && C0874p.a(Boolean.valueOf(this.e), Boolean.valueOf(c0815i.e)) && this.f == c0815i.f && C0874p.a(this.i, c0815i.i);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.d, Boolean.valueOf(this.e), Integer.valueOf(this.f), this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 6, 4);
        parcel.writeInt(this.f);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
