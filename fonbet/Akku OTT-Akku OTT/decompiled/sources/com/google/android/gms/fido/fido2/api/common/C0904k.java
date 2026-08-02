package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.fido.fido2.api.common.D;
import com.google.android.gms.fido.fido2.api.common.EnumC0886b;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0904k extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0904k> CREATOR = new A0();

    @Nullable
    public final EnumC0886b a;

    @Nullable
    public final Boolean b;

    @Nullable
    public final G c;

    @Nullable
    public final D d;

    public C0904k(@Nullable String str, @Nullable Boolean bool, @Nullable String str2, @Nullable String str3) {
        EnumC0886b h;
        D d = null;
        if (str == null) {
            h = null;
        } else {
            try {
                h = EnumC0886b.h(str);
            } catch (D.a | EnumC0886b.a | n0 e) {
                throw new IllegalArgumentException(e);
            }
        }
        this.a = h;
        this.b = bool;
        this.c = str2 == null ? null : G.h(str2);
        if (str3 != null) {
            d = D.h(str3);
        }
        this.d = d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0904k)) {
            return false;
        }
        C0904k c0904k = (C0904k) obj;
        return C0874p.a(this.a, c0904k.a) && C0874p.a(this.b, c0904k.b) && C0874p.a(this.c, c0904k.c) && C0874p.a(l(), c0904k.l());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, l()});
    }

    @Nullable
    public final D l() {
        D d = this.d;
        if (d != null) {
            return d;
        }
        Boolean bool = this.b;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return D.RESIDENT_KEY_REQUIRED;
    }

    @NonNull
    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        StringBuilder a = androidx.appcompat.view.a.a("AuthenticatorSelectionCriteria{\n attachment=", valueOf, ", \n requireResidentKey=");
        a.append(this.b);
        a.append(", \n requireUserVerification=");
        a.append(valueOf2);
        a.append(", \n residentKeyRequirement=");
        return androidx.concurrent.futures.a.a(a, valueOf3, "\n }");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        EnumC0886b enumC0886b = this.a;
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, enumC0886b == null ? null : enumC0886b.a, false);
        com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, this.b);
        G g = this.c;
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, g == null ? null : g.a, false);
        D l = l();
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 5, l != null ? l.a : null, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
