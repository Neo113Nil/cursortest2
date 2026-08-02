package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;

/* renamed from: com.google.android.gms.location.j, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0931j extends com.google.android.gms.common.internal.safeparcel.a implements com.google.android.gms.common.api.l {

    @NonNull
    public static final Parcelable.Creator<C0931j> CREATOR = new G();
    public final Status a;

    @Nullable
    public final C0932k b;

    public C0931j(@NonNull Status status, @Nullable C0932k c0932k) {
        this.a = status;
        this.b = c0932k;
    }

    @Override // com.google.android.gms.common.api.l
    @NonNull
    public final Status getStatus() {
        return this.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
