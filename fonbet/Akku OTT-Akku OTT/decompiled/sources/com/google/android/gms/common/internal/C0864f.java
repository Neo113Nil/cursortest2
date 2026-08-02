package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: com.google.android.gms.common.internal.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0864f extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0864f> CREATOR = new h0();
    public final C0876s a;
    public final boolean b;
    public final boolean c;

    @Nullable
    public final int[] d;
    public final int e;

    @Nullable
    public final int[] f;

    public C0864f(@NonNull C0876s c0876s, boolean z, boolean z2, @Nullable int[] iArr, int i, @Nullable int[] iArr2) {
        this.a = c0876s;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 4);
        parcel.writeInt(this.c ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.g(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 5, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.common.internal.safeparcel.c.g(parcel, 6, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
