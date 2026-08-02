package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

/* renamed from: com.google.android.gms.cloudmessaging.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0819a extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0819a> CREATOR = new C0822d();

    @NonNull
    public final Intent a;

    public C0819a(@NonNull Intent intent) {
        this.a = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
