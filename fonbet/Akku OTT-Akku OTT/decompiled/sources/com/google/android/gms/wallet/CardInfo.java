package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class CardInfo extends a {

    @NonNull
    public static final Parcelable.Creator<CardInfo> CREATOR = new zze();
    String zza;
    String zzb;
    String zzc;
    int zzd;
    UserAddress zze;

    private CardInfo() {
    }

    @Nullable
    public UserAddress getBillingAddress() {
        return this.zze;
    }

    public int getCardClass() {
        int i = this.zzd;
        if (i == 1 || i == 2 || i == 3) {
            return i;
        }
        return 0;
    }

    @NonNull
    public String getCardDescription() {
        return this.zza;
    }

    @NonNull
    public String getCardDetails() {
        return this.zzc;
    }

    @NonNull
    public String getCardNetwork() {
        return this.zzb;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        c.l(parcel, 2, this.zzb, false);
        c.l(parcel, 3, this.zzc, false);
        int i2 = this.zzd;
        c.s(parcel, 4, 4);
        parcel.writeInt(i2);
        c.k(parcel, 5, this.zze, i, false);
        c.r(parcel, q);
    }

    public CardInfo(String str, String str2, String str3, int i, UserAddress userAddress) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = i;
        this.zze = userAddress;
    }
}
