package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0873o extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0873o> CREATOR = new H();
    public final int a;
    public final int b;
    public final int c;
    public final long d;
    public final long e;

    @Nullable
    public final String f;

    @Nullable
    public final String i;
    public final int j;
    public final int k;

    public C0873o(int i, int i2, int i3, long j, long j2, @Nullable String str, @Nullable String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.i = str2;
        this.j = i4;
        this.k = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 8);
        parcel.writeLong(this.d);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 8);
        parcel.writeLong(this.e);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 7, this.i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 8, 4);
        parcel.writeInt(this.j);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 9, 4);
        parcel.writeInt(this.k);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
