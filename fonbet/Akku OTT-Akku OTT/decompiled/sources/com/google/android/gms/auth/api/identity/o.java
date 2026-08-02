package com.google.android.gms.auth.api.identity;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.fido.fido2.api.common.C0915t;
import java.util.Arrays;

@Deprecated
/* loaded from: classes4.dex */
public final class o extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<o> CREATOR = new J();
    public final String a;

    @Nullable
    public final String b;

    @Nullable
    public final String c;

    @Nullable
    public final String d;

    @Nullable
    public final Uri e;

    @Nullable
    public final String f;

    @Nullable
    public final String i;

    @Nullable
    public final String j;

    @Nullable
    public final C0915t k;

    public o(String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Uri uri, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable C0915t c0915t) {
        C0875q.g(str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = uri;
        this.f = str5;
        this.i = str6;
        this.j = str7;
        this.k = c0915t;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return C0874p.a(this.a, oVar.a) && C0874p.a(this.b, oVar.b) && C0874p.a(this.c, oVar.c) && C0874p.a(this.d, oVar.d) && C0874p.a(this.e, oVar.e) && C0874p.a(this.f, oVar.f) && C0874p.a(this.i, oVar.i) && C0874p.a(this.j, oVar.j) && C0874p.a(this.k, oVar.k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.i, this.j, this.k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.e, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, this.j, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 9, this.k, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
