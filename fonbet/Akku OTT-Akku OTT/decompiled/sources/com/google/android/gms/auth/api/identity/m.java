package com.google.android.gms.auth.api.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0874p;
import com.google.android.gms.common.internal.C0875q;
import java.util.Arrays;

@Deprecated
/* loaded from: classes4.dex */
public final class m extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<m> CREATOR = new I();
    public final PendingIntent a;

    public m(@NonNull PendingIntent pendingIntent) {
        C0875q.g(pendingIntent);
        this.a = pendingIntent;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof m) {
            return C0874p.a(this.a, ((m) obj).a);
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
