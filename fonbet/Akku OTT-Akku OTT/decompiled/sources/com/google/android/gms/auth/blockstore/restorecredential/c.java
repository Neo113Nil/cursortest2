package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends com.google.android.gms.common.internal.safeparcel.a {
    public final Bundle a;
    public static final a Companion = new a();

    @JvmField
    public static final Parcelable.Creator<c> CREATOR = new d();

    public static final class a {
    }

    public c(@NonNull Bundle requestBundle) {
        Intrinsics.checkNotNullParameter(requestBundle, "requestBundle");
        this.a = requestBundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int q = com.google.android.gms.common.internal.safeparcel.c.q(dest, 20293);
        com.google.android.gms.common.internal.safeparcel.c.b(dest, 1, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.r(dest, q);
    }
}
