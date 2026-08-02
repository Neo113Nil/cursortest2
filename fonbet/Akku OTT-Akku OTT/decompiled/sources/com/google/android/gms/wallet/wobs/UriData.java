package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class UriData extends a {

    @NonNull
    public static final Parcelable.Creator<UriData> CREATOR = new zzm();
    String zza;
    String zzb;

    public UriData() {
    }

    @NonNull
    public String getDescription() {
        return this.zzb;
    }

    @NonNull
    public String getUri() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.r(parcel, q);
    }

    public UriData(@NonNull String str, @NonNull String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
