package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.u2f.api.common.c;
import java.util.Arrays;

@Deprecated
/* loaded from: classes4.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<d> CREATOR = new j();
    public final int a;
    public final c b;
    public final byte[] c;
    public final String d;

    public d(String str, String str2, int i, byte[] bArr) {
        this.a = i;
        try {
            this.b = c.h(str);
            this.c = bArr;
            this.d = str2;
        } catch (c.a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        byte[] bArr = dVar.c;
        String str = dVar.d;
        if (!Arrays.equals(this.c, bArr) || this.b != dVar.b) {
            return false;
        }
        String str2 = this.d;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() + ((Arrays.hashCode(this.c) + 31) * 31);
        String str = this.d;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b.a, false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 3, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
