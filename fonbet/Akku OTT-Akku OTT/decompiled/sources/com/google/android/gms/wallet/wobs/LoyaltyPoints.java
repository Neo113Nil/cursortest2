package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class LoyaltyPoints extends a {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPoints> CREATOR = new zzj();
    String zza;
    LoyaltyPointsBalance zzb;

    @Deprecated
    TimeInterval zzc;

    public final class Builder {
        public /* synthetic */ Builder(zzg zzgVar) {
        }

        @NonNull
        public LoyaltyPoints build() {
            return LoyaltyPoints.this;
        }

        @NonNull
        public Builder setBalance(@NonNull LoyaltyPointsBalance loyaltyPointsBalance) {
            LoyaltyPoints.this.zzb = loyaltyPointsBalance;
            return this;
        }

        @NonNull
        public Builder setLabel(@NonNull String str) {
            LoyaltyPoints.this.zza = str;
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setType(@NonNull String str) {
            return this;
        }

        @NonNull
        @Deprecated
        public Builder setValidTimeInterval(@NonNull TimeInterval timeInterval) {
            LoyaltyPoints.this.zzc = timeInterval;
            return this;
        }
    }

    public LoyaltyPoints() {
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyPoints().new Builder(null);
    }

    @NonNull
    public LoyaltyPointsBalance getBalance() {
        return this.zzb;
    }

    @NonNull
    public String getLabel() {
        return this.zza;
    }

    @NonNull
    @Deprecated
    public String getType() {
        return "";
    }

    @NonNull
    @Deprecated
    public TimeInterval getValidTimeInterval() {
        return this.zzc;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.k(parcel, 3, this.zzb, i, false);
        c.k(parcel, 5, this.zzc, i, false);
        c.r(parcel, q);
    }

    public LoyaltyPoints(String str, LoyaltyPointsBalance loyaltyPointsBalance, TimeInterval timeInterval) {
        this.zza = str;
        this.zzb = loyaltyPointsBalance;
        this.zzc = timeInterval;
    }
}
