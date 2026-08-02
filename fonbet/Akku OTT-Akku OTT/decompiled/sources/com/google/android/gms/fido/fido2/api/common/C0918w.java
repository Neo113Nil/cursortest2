package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.fido.fido2.api.common.C0911o;
import com.google.android.gms.fido.fido2.api.common.EnumC0921z;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0918w extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0918w> CREATOR = new C0885a0();

    @NonNull
    public final EnumC0921z a;

    @NonNull
    public final C0911o b;

    public C0918w(@NonNull String str, int i) {
        C0875q.g(str);
        try {
            this.a = EnumC0921z.h(str);
            try {
                this.b = C0911o.h(i);
            } catch (C0911o.a e) {
                throw new IllegalArgumentException(e);
            }
        } catch (EnumC0921z.a e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0918w)) {
            return false;
        }
        C0918w c0918w = (C0918w) obj;
        return this.a.equals(c0918w.a) && this.b.equals(c0918w.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    @NonNull
    public final String toString() {
        return androidx.core.database.a.d("PublicKeyCredentialParameters{\n type=", String.valueOf(this.a), ", \n algorithm=", String.valueOf(this.b), "\n }");
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.gms.fido.fido2.api.common.a, java.lang.Enum] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        this.a.getClass();
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, "public-key", false);
        com.google.android.gms.common.internal.safeparcel.c.i(parcel, 3, Integer.valueOf(this.b.a.a()));
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
