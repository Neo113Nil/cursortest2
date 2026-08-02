package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class n extends com.google.android.gms.common.internal.safeparcel.a {
    public final PendingIntent a;
    public static final a Companion = new a();

    @JvmField
    public static final Parcelable.Creator<n> CREATOR = new o();

    public static final class a {
    }

    public n(@NonNull PendingIntent pendingIntent) {
        Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int q = com.google.android.gms.common.internal.safeparcel.c.q(dest, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(dest, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(dest, q);
    }
}
