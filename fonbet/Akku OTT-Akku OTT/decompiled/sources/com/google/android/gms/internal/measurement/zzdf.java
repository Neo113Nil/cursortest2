package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzdf extends a {
    public static final Parcelable.Creator<zzdf> CREATOR = new zzdg();
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final Intent zzc;

    public zzdf(int i, @Nullable String str, @Nullable Intent intent) {
        this.zza = i;
        this.zzb = str;
        this.zzc = intent;
    }

    public static zzdf zza(Activity activity) {
        return new zzdf(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzdf)) {
            return false;
        }
        zzdf zzdfVar = (zzdf) obj;
        return this.zza == zzdfVar.zza && Objects.equals(this.zzb, zzdfVar.zzb) && Objects.equals(this.zzc, zzdfVar.zzc);
    }

    public final int hashCode() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int i2 = this.zza;
        int q = c.q(parcel, 20293);
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        c.l(parcel, 2, this.zzb, false);
        c.k(parcel, 3, this.zzc, i, false);
        c.r(parcel, q);
    }
}
