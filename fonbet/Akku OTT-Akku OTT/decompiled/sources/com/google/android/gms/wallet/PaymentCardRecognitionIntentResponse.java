package com.google.android.gms.wallet;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public class PaymentCardRecognitionIntentResponse extends a {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentResponse> CREATOR = new zzz();
    PendingIntent zza;

    public PaymentCardRecognitionIntentResponse() {
    }

    @NonNull
    public PendingIntent getPaymentCardRecognitionPendingIntent() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.k(parcel, 1, this.zza, i, false);
        c.r(parcel, q);
    }

    public PaymentCardRecognitionIntentResponse(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }
}
