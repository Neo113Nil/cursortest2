package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.gms.common.internal.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0876s extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0876s> CREATOR = new Y();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public C0876s(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1, 4);
        parcel.writeInt(this.a);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 4, 4);
        parcel.writeInt(this.d);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
