package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.runtime.u;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class StreetViewSource extends a {

    @NonNull
    public static final Parcelable.Creator<StreetViewSource> CREATOR = new zzr();

    @NonNull
    public static final StreetViewSource DEFAULT = new StreetViewSource(0);

    @NonNull
    public static final StreetViewSource OUTDOOR = new StreetViewSource(1);
    private static final String zza = "StreetViewSource";
    private final int zzb;

    public StreetViewSource(int i) {
        this.zzb = i;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreetViewSource) && this.zzb == ((StreetViewSource) obj).zzb;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb)});
    }

    @NonNull
    public String toString() {
        int i = this.zzb;
        return "StreetViewSource:".concat(i != 0 ? i != 1 ? u.a(i, "UNKNOWN(", ")") : "OUTDOOR" : "DEFAULT");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zzb;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        c.r(parcel, q);
    }
}
