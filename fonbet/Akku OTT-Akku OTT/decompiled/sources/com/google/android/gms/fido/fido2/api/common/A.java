package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class A extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<A> CREATOR = new C0893e0();

    @NonNull
    public final zzgx a;

    @NonNull
    public final String b;

    @Nullable
    public final String c;

    @NonNull
    public final String d;

    public A(@NonNull String str, @Nullable String str2, @NonNull String str3, @NonNull byte[] bArr) {
        C0875q.g(bArr);
        zzgx zzl = zzgx.zzl(bArr, 0, bArr.length);
        C0875q.g(zzl);
        this.a = zzl;
        C0875q.g(str);
        this.b = str;
        this.c = str2;
        C0875q.g(str3);
        this.d = str3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof A)) {
            return false;
        }
        A a = (A) obj;
        return C0874p.a(this.a, a.a) && C0874p.a(this.b, a.b) && C0874p.a(this.c, a.c) && C0874p.a(this.d, a.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @NonNull
    public final String toString() {
        StringBuilder a = androidx.appcompat.view.a.a("PublicKeyCredentialUserEntity{\n id=", Base64Utils.encodeUrlSafeNoPadding(this.a.zzm()), ", \n name='");
        a.append(this.b);
        a.append("', \n icon='");
        a.append(this.c);
        a.append("', \n displayName='");
        return androidx.concurrent.futures.a.a(a, this.d, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.a.zzm(), false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
