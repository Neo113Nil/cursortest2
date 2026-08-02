package com.google.android.gms.wallet;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.common.internal.safeparcel.e;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class PaymentData extends a implements AutoResolvableResult {

    @NonNull
    public static final Parcelable.Creator<PaymentData> CREATOR = new zzaa();
    String zza;
    CardInfo zzb;
    UserAddress zzc;
    PaymentMethodToken zzd;
    String zze;
    Bundle zzf;
    String zzg;

    @Nullable
    Bundle zzh;

    private PaymentData() {
    }

    @NonNull
    public static PaymentData fromJson(@NonNull String str) {
        PaymentData paymentData = new PaymentData();
        C0875q.h(str, "paymentDataJson cannot be null!");
        paymentData.zzg = str;
        return paymentData;
    }

    @Nullable
    public static PaymentData getFromIntent(@NonNull Intent intent) {
        Parcelable.Creator<PaymentData> creator = CREATOR;
        byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
        return (PaymentData) (byteArrayExtra == null ? null : e.a(byteArrayExtra, creator));
    }

    @NonNull
    @Deprecated
    public CardInfo getCardInfo() {
        return this.zzb;
    }

    @Nullable
    @Deprecated
    public String getEmail() {
        return this.zza;
    }

    @Nullable
    @Deprecated
    public Bundle getExtraData() {
        return this.zzf;
    }

    @NonNull
    @Deprecated
    public String getGoogleTransactionId() {
        return this.zze;
    }

    @Nullable
    public Bundle getLastSavedState() {
        return this.zzh;
    }

    @Nullable
    @Deprecated
    public PaymentMethodToken getPaymentMethodToken() {
        return this.zzd;
    }

    @Nullable
    @Deprecated
    public UserAddress getShippingAddress() {
        return this.zzc;
    }

    @Override // com.google.android.gms.wallet.AutoResolvableResult
    public void putIntoIntent(@NonNull Intent intent) {
        Parcel obtain = Parcel.obtain();
        writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        intent.putExtra("com.google.android.gms.wallet.PaymentData", marshall);
    }

    @NonNull
    public String toJson() {
        return this.zzg;
    }

    @NonNull
    public PaymentData withLastSavedState(@Nullable Bundle bundle) {
        this.zzh = bundle;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        c.k(parcel, 2, this.zzb, i, false);
        c.k(parcel, 3, this.zzc, i, false);
        c.k(parcel, 4, this.zzd, i, false);
        c.l(parcel, 5, this.zze, false);
        c.b(parcel, 6, this.zzf, false);
        c.l(parcel, 7, this.zzg, false);
        c.b(parcel, 8, this.zzh, false);
        c.r(parcel, q);
    }

    public PaymentData(String str, CardInfo cardInfo, UserAddress userAddress, PaymentMethodToken paymentMethodToken, String str2, Bundle bundle, String str3, @Nullable Bundle bundle2) {
        this.zza = str;
        this.zzb = cardInfo;
        this.zzc = userAddress;
        this.zzd = paymentMethodToken;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = str3;
        this.zzh = bundle2;
    }
}
