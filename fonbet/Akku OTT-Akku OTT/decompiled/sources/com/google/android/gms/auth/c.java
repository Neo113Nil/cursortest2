package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class c extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = new f();
    public final int a;
    public final List b;

    public c(int i, ArrayList arrayList) {
        this.a = i;
        C0875q.g(arrayList);
        this.b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 2, this.b, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
