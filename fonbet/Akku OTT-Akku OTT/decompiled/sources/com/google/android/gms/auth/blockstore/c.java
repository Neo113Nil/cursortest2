package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class c extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new h();

    @Deprecated
    public final Bundle a;
    public final List b;

    public static class a extends com.google.android.gms.common.internal.safeparcel.a {

        @NonNull
        public static final Parcelable.Creator<a> CREATOR = new e();
        public final byte[] a;
        public final String b;

        public a(byte[] bArr, String str) {
            this.a = bArr;
            this.b = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a))});
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
            com.google.android.gms.common.internal.safeparcel.c.c(parcel, 1, this.a, false);
            com.google.android.gms.common.internal.safeparcel.c.l(parcel, 2, this.b, false);
            com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
        }
    }

    public c(Bundle bundle, ArrayList arrayList) {
        this.a = bundle;
        this.b = arrayList;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            hashMap.put(aVar.b, aVar);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
