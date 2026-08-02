package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class c extends com.google.android.gms.common.internal.safeparcel.a {

    @NonNull
    public static final Parcelable.Creator<c> CREATOR = r.a;
    public static final c b = new c(null);

    @Nullable
    public final e a;

    public c(@Nullable e eVar) {
        this.a = eVar;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof c) {
            return Objects.equals(this.a, ((c) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    @NonNull
    public final String toString() {
        return android.support.v4.media.b.b("ApiMetadata(complianceOptions=", String.valueOf(this.a), ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeInt(-204102970);
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 1, this.a, i, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
