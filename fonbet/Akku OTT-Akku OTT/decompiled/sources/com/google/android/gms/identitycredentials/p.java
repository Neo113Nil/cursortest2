package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class p extends com.google.android.gms.common.internal.safeparcel.a {
    public static final a Companion = new a();

    @JvmField
    public static final Parcelable.Creator<p> CREATOR = new q();

    public static final class a {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        com.google.android.gms.common.internal.safeparcel.c.r(dest, com.google.android.gms.common.internal.safeparcel.c.q(dest, 20293));
    }
}
