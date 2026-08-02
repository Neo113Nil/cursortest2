package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;

@Deprecated
/* renamed from: com.google.android.gms.auth.api.identity.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0811e extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<C0811e> CREATOR = new u();
    public final PendingIntent a;

    public C0811e(@NonNull PendingIntent pendingIntent) {
        C0875q.g(pendingIntent);
        this.a = pendingIntent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
