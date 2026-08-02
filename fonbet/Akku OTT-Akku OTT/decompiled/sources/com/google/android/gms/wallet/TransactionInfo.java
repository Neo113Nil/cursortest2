package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class TransactionInfo extends a {

    @NonNull
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new zzao();
    int zza;
    String zzb;
    String zzc;

    public final class Builder {
        public /* synthetic */ Builder(zzan zzanVar) {
        }

        @NonNull
        public TransactionInfo build() {
            C0875q.e(TransactionInfo.this.zzc, "currencyCode must be set!");
            TransactionInfo transactionInfo = TransactionInfo.this;
            int i = transactionInfo.zza;
            if (i != 1) {
                if (i == 2) {
                    C0875q.e(transactionInfo.zzb, "An estimated total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_ESTIMATED!");
                } else if (i != 3) {
                    throw new IllegalArgumentException("totalPriceStatus must be set to one of WalletConstants.TotalPriceStatus!");
                }
            }
            TransactionInfo transactionInfo2 = TransactionInfo.this;
            if (transactionInfo2.zza == 3) {
                C0875q.e(transactionInfo2.zzb, "An final total price must be set if totalPriceStatus is set to WalletConstants.TOTAL_PRICE_STATUS_FINAL!");
            }
            return TransactionInfo.this;
        }

        @NonNull
        public Builder setCurrencyCode(@NonNull String str) {
            TransactionInfo.this.zzc = str;
            return this;
        }

        @NonNull
        public Builder setTotalPrice(@NonNull String str) {
            TransactionInfo.this.zzb = str;
            return this;
        }

        @NonNull
        public Builder setTotalPriceStatus(int i) {
            TransactionInfo.this.zza = i;
            return this;
        }
    }

    private TransactionInfo() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new TransactionInfo().new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.zzc;
    }

    @Nullable
    public String getTotalPrice() {
        return this.zzb;
    }

    public int getTotalPriceStatus() {
        return this.zza;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 1, 4);
        parcel.writeInt(i2);
        c.l(parcel, 2, this.zzb, false);
        c.l(parcel, 3, this.zzc, false);
        c.r(parcel, q);
    }

    public TransactionInfo(int i, @NonNull String str, @NonNull String str2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
    }
}
