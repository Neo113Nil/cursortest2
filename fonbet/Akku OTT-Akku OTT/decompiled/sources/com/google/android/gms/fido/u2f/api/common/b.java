package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.u2f.api.common.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new h();
    public final int a;
    public final byte[] b;
    public final c c;

    @Nullable
    public final List d;

    public b(int i, byte[] bArr, String str, @Nullable ArrayList arrayList) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = c.h(str);
            this.d = arrayList;
        } catch (c.a e) {
            throw new IllegalArgumentException(e);
        }
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        byte[] bArr = bVar.b;
        List list = bVar.d;
        if (!Arrays.equals(this.b, bArr) || !this.c.equals(bVar.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && list == null) {
            return true;
        }
        return list2 != null && list != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    @NonNull
    public final String toString() {
        List list = this.d;
        String obj = list == null ? "null" : list.toString();
        String encode = Base64Utils.encode(this.b);
        StringBuilder sb = new StringBuilder("{keyHandle: ");
        sb.append(encode);
        sb.append(", version: ");
        sb.append(this.c);
        sb.append(", transports: ");
        return androidx.concurrent.futures.a.a(sb, obj, "}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 3, this.c.a, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
