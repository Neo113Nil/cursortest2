package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class PaymentMethodToken extends a {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodToken> CREATOR = new zzad();
    int zza;
    String zzb;

    private PaymentMethodToken() {
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @NonNull
    public String getToken() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        c.l(parcel, 3, this.zzb, false);
        c.r(parcel, q);
    }

    public PaymentMethodToken(int i, String str) {
        this.zza = i;
        this.zzb = str;
    }
}
