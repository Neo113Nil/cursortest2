package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.fido.fido2.api.common.EnumC0913q;
import com.google.android.gms.internal.fido.zzbi;
import com.google.android.gms.internal.fido.zzbj;
import java.util.Arrays;

/* renamed from: com.google.android.gms.fido.fido2.api.common.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0900i extends AbstractC0902j {

    @NonNull
    public static final Parcelable.Creator<C0900i> CREATOR = new z0();

    @NonNull
    public final EnumC0913q a;

    @Nullable
    public final String b;
    public final int c;

    public C0900i(int i, @Nullable String str, int i2) {
        try {
            this.a = EnumC0913q.h(i);
            this.b = str;
            this.c = i2;
        } catch (EnumC0913q.a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C0900i)) {
            return false;
        }
        C0900i c0900i = (C0900i) obj;
        return C0874p.a(this.a, c0900i.a) && C0874p.a(this.b, c0900i.b) && C0874p.a(Integer.valueOf(this.c), Integer.valueOf(c0900i.c));
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c)});
    }

    @NonNull
    public final String toString() {
        zzbi zza = zzbj.zza(this);
        zza.zza("errorCode", this.a.a);
        String str = this.b;
        if (str != null) {
            zza.zzb("errorMessage", str);
        }
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        int i2 = this.a.a;
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
