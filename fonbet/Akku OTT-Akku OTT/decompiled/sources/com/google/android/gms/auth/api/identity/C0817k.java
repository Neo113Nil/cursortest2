package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import java.util.Arrays;

/* renamed from: com.google.android.gms.auth.api.identity.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0817k extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0817k> CREATOR = new G();

    @Nullable
    public final PendingIntent a;

    public C0817k(@Nullable PendingIntent pendingIntent) {
        this.a = pendingIntent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof C0817k) {
            return C0874p.a(this.a, ((C0817k) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
