package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class G0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<G0> CREATOR = new H0();

    @NonNull
    public final List a;

    public G0(@NonNull ArrayList arrayList) {
        C0875q.g(arrayList);
        this.a = arrayList;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g0 = (G0) obj;
        List list = g0.a;
        List list2 = this.a;
        return list2.containsAll(list) && g0.a.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
