package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.internal.safeparcel.e;

/* loaded from: classes4.dex */
public final class PaymentCardRecognitionResult extends a {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionResult> CREATOR = new zzw();
    String zza;

    @Nullable
    CreditCardExpirationDate zzb;

    public PaymentCardRecognitionResult() {
    }

    @Nullable
    public static PaymentCardRecognitionResult getFromIntent(@NonNull Intent intent) {
        Parcelable.Creator<PaymentCardRecognitionResult> creator = CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentCardRecognitionResult");
        return (PaymentCardRecognitionResult) (byteArrayExtra == null ? null : e.a(byteArrayExtra, creator));
    }

    @Nullable
    public CreditCardExpirationDate getCreditCardExpirationDate() {
        return this.zzb;
    }

    @NonNull
    public String getPan() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        c.k(parcel, 2, this.zzb, i, false);
        c.r(parcel, q);
    }

    public PaymentCardRecognitionResult(String str, @Nullable CreditCardExpirationDate creditCardExpirationDate) {
        this.zza = str;
        this.zzb = creditCardExpirationDate;
    }
}
