package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {
    public final boolean a;
    public static final C0117a Companion = new C0117a();

    @JvmField
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: com.google.android.gms.identitycredentials.a$a, reason: collision with other inner class name */
    public static final class C0117a {
    }

    public a(boolean z) {
        this.a = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        int q = com.google.android.gms.common.internal.safeparcel.c.q(dest, 20293);
        com.google.android.gms.common.internal.safeparcel.c.s(dest, 1, 4);
        dest.writeInt(this.a ? 1 : 0);
        com.google.android.gms.common.internal.safeparcel.c.r(dest, q);
    }
}
