package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public class PaymentCardRecognitionIntentRequest extends a {

    @NonNull
    public static final Parcelable.Creator<PaymentCardRecognitionIntentRequest> CREATOR = new zzy();
    int zza;

    public final class Builder {
        public /* synthetic */ Builder(zzx zzxVar) {
        }

        @NonNull
        public PaymentCardRecognitionIntentRequest build() {
            C0875q.b(PaymentCardRecognitionIntentRequest.this.zza != 0, "The paymentCardRecognitionType is required when creating a PaymentCardRecognitionIntentRequest.");
            return PaymentCardRecognitionIntentRequest.this;
        }
    }

    public PaymentCardRecognitionIntentRequest() {
    }

    @NonNull
    public static Builder builder() {
        return new PaymentCardRecognitionIntentRequest().new Builder(null);
    }

    @NonNull
    public static PaymentCardRecognitionIntentRequest getDefaultInstance() {
        Builder builder = new PaymentCardRecognitionIntentRequest().new Builder(null);
        PaymentCardRecognitionIntentRequest.this.zza = 1;
        return builder.build();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        c.r(parcel, q);
    }

    public PaymentCardRecognitionIntentRequest(int i) {
        this.zza = i;
    }
}
