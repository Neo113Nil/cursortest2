package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<a> CREATOR = new c();

    @NonNull
    public final String a;
    public final int b;
    public final long c;

    @NonNull
    public final byte[] d;
    public final int e;
    public final Bundle f;

    public a(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.e = i;
        this.a = str;
        this.b = i2;
        this.c = j;
        this.d = bArr;
        this.f = bundle;
    }

    @NonNull
    public final String toString() {
        return "ProxyRequest[ url: " + this.a + ", method: " + this.b + " ]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 2, 4);
        parcel.writeInt(this.b);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 3, 8);
        parcel.writeLong(this.c);
        com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, this.d, false);
        com.google.android.gms.common.internal.safeparcel.c.b(parcel, 5, this.f, false);
        com.google.android.gms.common.internal.safeparcel.c.s(parcel, 1000, 4);
        parcel.writeInt(this.e);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
