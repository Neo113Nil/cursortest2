package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.compose.runtime.C0211b;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.fido.zzgx;
import com.google.android.gms.internal.fido.zzhp;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class T extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<T> CREATOR = new U();

    @Nullable
    public final zzgx a;

    @Nullable
    public final zzgx b;

    @Nullable
    public final zzgx c;
    public final int d;

    static {
        zzhp.zzg(1L);
        zzhp.zzg(2L);
        zzhp.zzg(3L);
        zzhp.zzg(4L);
    }

    public T(@Nullable zzgx zzgxVar, @Nullable zzgx zzgxVar2, @Nullable zzgx zzgxVar3, int i) {
        this.a = zzgxVar;
        this.b = zzgxVar2;
        this.c = zzgxVar3;
        this.d = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof T)) {
            return false;
        }
        T t = (T) obj;
        return C0874p.a(this.a, t.a) && C0874p.a(this.b, t.b) && C0874p.a(this.c, t.c) && this.d == t.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Integer.valueOf(this.d)});
    }

    public final String toString() {
        zzgx zzgxVar = this.a;
        String encodeUrlSafeNoPadding = Base64Utils.encodeUrlSafeNoPadding(zzgxVar == null ? null : zzgxVar.zzm());
        zzgx zzgxVar2 = this.b;
        String encodeUrlSafeNoPadding2 = Base64Utils.encodeUrlSafeNoPadding(zzgxVar2 == null ? null : zzgxVar2.zzm());
        zzgx zzgxVar3 = this.c;
        String encodeUrlSafeNoPadding3 = Base64Utils.encodeUrlSafeNoPadding(zzgxVar3 != null ? zzgxVar3.zzm() : null);
        StringBuilder a = androidx.datastore.preferences.protobuf.c.a("HmacSecretExtension{coseKeyAgreement=", encodeUrlSafeNoPadding, ", saltEnc=", encodeUrlSafeNoPadding2, ", saltAuth=");
        a.append(encodeUrlSafeNoPadding3);
        a.append(", getPinUvAuthProtocol=");
        return C0211b.a(a, this.d, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        zzgx zzgxVar = this.a;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 1, zzgxVar == null ? null : zzgxVar.zzm(), false);
        zzgx zzgxVar2 = this.b;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, zzgxVar2 == null ? null : zzgxVar2.zzm(), false);
        zzgx zzgxVar3 = this.c;
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, zzgxVar3 != null ? zzgxVar3.zzm() : null, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
