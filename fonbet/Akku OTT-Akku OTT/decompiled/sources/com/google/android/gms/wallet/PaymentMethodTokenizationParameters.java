package com.google.android.gms.wallet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class PaymentMethodTokenizationParameters extends a {

    @NonNull
    public static final Parcelable.Creator<PaymentMethodTokenizationParameters> CREATOR = new zzaf();
    int zza;
    final Bundle zzb;

    public final class Builder {
        public /* synthetic */ Builder(zzae zzaeVar) {
        }

        @NonNull
        public Builder addParameter(@NonNull String str, @NonNull String str2) {
            C0875q.e(str, "Tokenization parameter name must not be empty");
            C0875q.e(str2, "Tokenization parameter value must not be empty");
            PaymentMethodTokenizationParameters.this.zzb.putString(str, str2);
            return this;
        }

        @NonNull
        public PaymentMethodTokenizationParameters build() {
            return PaymentMethodTokenizationParameters.this;
        }

        @NonNull
        public Builder setPaymentMethodTokenizationType(int i) {
            PaymentMethodTokenizationParameters.this.zza = i;
            return this;
        }
    }

    private PaymentMethodTokenizationParameters() {
        this.zzb = new Bundle();
    }

    @NonNull
    public static Builder newBuilder() {
        return new PaymentMethodTokenizationParameters().new Builder(null);
    }

    @NonNull
    public Bundle getParameters() {
        return new Bundle(this.zzb);
    }

    public int getPaymentMethodTokenizationType() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        c.b(parcel, 3, this.zzb, false);
        c.r(parcel, q);
    }

    public PaymentMethodTokenizationParameters(int i, Bundle bundle) {
        new Bundle();
        this.zza = i;
        this.zzb = bundle;
    }
}
