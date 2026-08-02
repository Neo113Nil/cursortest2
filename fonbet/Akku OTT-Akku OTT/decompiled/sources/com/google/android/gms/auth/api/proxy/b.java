package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<b> CREATOR = new d();
    public final int a;

    @NonNull
    public final PendingIntent b;
    public final int c;

    @NonNull
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public b(int i, int i2, PendingIntent pendingIntent, int i3, Bundle bundle, byte[] bArr) {
        this.e = i;
        this.a = i2;
        this.c = i3;
        this.f = bundle;
        this.d = bArr;
        this.b = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 2, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 4, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 5, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1000, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
