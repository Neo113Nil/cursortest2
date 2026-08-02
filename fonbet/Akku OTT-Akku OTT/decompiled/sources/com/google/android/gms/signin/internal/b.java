package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;

/* loaded from: classes4.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a implements com.google.android.gms.common.api.l {
    public static final Parcelable.Creator<b> CREATOR = new c();
    public final int a;
    public final int b;

    @Nullable
    public final Intent c;

    public b() {
        this(2, 0, null);
    }

    @Override // com.google.android.gms.common.api.l
    public final Status getStatus() {
        return this.b == 0 ? Status.e : Status.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 3, this.c, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }

    public b(int i, int i2, @Nullable Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }
}
