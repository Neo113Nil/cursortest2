package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class LoyaltyPointsBalance extends a {

    @NonNull
    public static final Parcelable.Creator<LoyaltyPointsBalance> CREATOR = new zzi();
    int zza;
    String zzb;
    double zzc;
    String zzd;
    long zze;
    int zzf;

    public final class Builder {
        public /* synthetic */ Builder(zzh zzhVar) {
        }

        @NonNull
        public LoyaltyPointsBalance build() {
            return LoyaltyPointsBalance.this;
        }

        @NonNull
        public Builder setDouble(double d) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzc = d;
            loyaltyPointsBalance.zzf = 2;
            return this;
        }

        @NonNull
        public Builder setInt(int i) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zza = i;
            loyaltyPointsBalance.zzf = 0;
            return this;
        }

        @NonNull
        public Builder setMoney(@NonNull String str, long j) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzd = str;
            loyaltyPointsBalance.zze = j;
            loyaltyPointsBalance.zzf = 3;
            return this;
        }

        @NonNull
        public Builder setString(@NonNull String str) {
            LoyaltyPointsBalance loyaltyPointsBalance = LoyaltyPointsBalance.this;
            loyaltyPointsBalance.zzb = str;
            loyaltyPointsBalance.zzf = 1;
            return this;
        }
    }

    public interface Type {
        public static final int DOUBLE = 2;
        public static final int INT = 0;
        public static final int MONEY = 3;
        public static final int STRING = 1;
        public static final int UNDEFINED = -1;
    }

    public LoyaltyPointsBalance() {
        this.zzf = -1;
        this.zza = -1;
        this.zzc = -1.0d;
    }

    @NonNull
    public static Builder newBuilder() {
        return new LoyaltyPointsBalance().new Builder(null);
    }

    @NonNull
    public String getCurrencyCode() {
        return this.zzd;
    }

    public long getCurrencyMicros() {
        return this.zze;
    }

    public double getDouble() {
        return this.zzc;
    }

    public int getInt() {
        return this.zza;
    }

    @NonNull
    public String getString() {
        return this.zzb;
    }

    public int getType() {
        return this.zzf;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        int i2 = this.zza;
        c.s(parcel, 2, 4);
        parcel.writeInt(i2);
        c.l(parcel, 3, this.zzb, false);
        double d = this.zzc;
        c.s(parcel, 4, 8);
        parcel.writeDouble(d);
        c.l(parcel, 5, this.zzd, false);
        long j = this.zze;
        c.s(parcel, 6, 8);
        parcel.writeLong(j);
        int i3 = this.zzf;
        c.s(parcel, 7, 4);
        parcel.writeInt(i3);
        c.r(parcel, q);
    }

    public LoyaltyPointsBalance(int i, String str, double d, String str2, long j, int i2) {
        this.zza = i;
        this.zzb = str;
        this.zzc = d;
        this.zzd = str2;
        this.zze = j;
        this.zzf = i2;
    }
}
