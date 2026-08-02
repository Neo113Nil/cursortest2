package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.y, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0920y extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0920y> CREATOR = new C0889c0();

    @NonNull
    public final String a;

    @NonNull
    public final String b;

    @Nullable
    public final String c;

    public C0920y(@NonNull String str, @NonNull String str2, @Nullable String str3) {
        C0875q.g(str);
        this.a = str;
        C0875q.g(str2);
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0920y)) {
            return false;
        }
        C0920y c0920y = (C0920y) obj;
        return C0874p.a(this.a, c0920y.a) && C0874p.a(this.b, c0920y.b) && C0874p.a(this.c, c0920y.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    @NonNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("PublicKeyCredentialRpEntity{\n id='");
        sb.append(this.a);
        sb.append("', \n name='");
        sb.append(this.b);
        sb.append("', \n icon='");
        return androidx.concurrent.futures.a.a(sb, this.c, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
