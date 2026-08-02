package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class CreditCardExpirationDate extends a {

    @NonNull
    public static final Parcelable.Creator<CreditCardExpirationDate> CREATOR = new zzj();
    int zza;
    int zzb;

    public CreditCardExpirationDate() {
    }

    public int getMonth() {
        return this.zza;
    }

    public int getYear() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        int i3 = this.zzb;
        c.s(parcel, 2, 4);
        parcel.writeInt(i3);
        c.r(parcel, q);
    }

    public CreditCardExpirationDate(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
