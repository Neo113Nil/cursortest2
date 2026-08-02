package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.location.i, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0930i extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0930i> CREATOR = new F();
    public final List<LocationRequest> a;
    public final boolean b;
    public final boolean c;

    @Nullable
    public final D d;

    public C0930i(ArrayList arrayList, boolean z, boolean z2, @Nullable D d) {
        this.a = arrayList;
        this.b = z;
        this.c = z2;
        this.d = d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.p(parcel, 1, Collections.unmodifiableList(this.a), false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 5, this.d, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
