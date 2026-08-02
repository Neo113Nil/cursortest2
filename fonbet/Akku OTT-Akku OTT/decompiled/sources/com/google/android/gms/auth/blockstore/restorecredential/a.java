package com.google.android.gms.auth.blockstore.restorecredential;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {
    public final Bundle a;
    public static final C0108a Companion = new C0108a();

    @JvmField
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: com.google.android.gms.auth.blockstore.restorecredential.a$a, reason: collision with other inner class name */
    public static final class C0108a {
    }

    public a(@NonNull Bundle requestBundle) {
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
