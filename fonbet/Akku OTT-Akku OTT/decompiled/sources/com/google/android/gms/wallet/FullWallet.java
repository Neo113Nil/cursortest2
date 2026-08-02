package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.identity.intents.model.UserAddress;

/* loaded from: classes4.dex */
public final class FullWallet extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<FullWallet> CREATOR = new zzl();
    String zza;
    String zzb;
    zzaj zzc;
    String zzd;
    zza zze;
    zza zzf;
    String[] zzg;
    UserAddress zzh;
    UserAddress zzi;
    InstrumentInfo[] zzj;
    PaymentMethodToken zzk;

    private FullWallet() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.k(parcel, 4, this.zzc, i, false);
        c.l(parcel, 5, this.zzd, false);
        c.k(parcel, 6, this.zze, i, false);
        c.k(parcel, 7, this.zzf, i, false);
        c.m(parcel, 8, this.zzg, false);
        c.k(parcel, 9, this.zzh, i, false);
        c.k(parcel, 10, this.zzi, i, false);
        c.o(parcel, 11, this.zzj, i);
        c.k(parcel, 12, this.zzk, i, false);
        c.r(parcel, q);
    }

    public FullWallet(String str, String str2, zzaj zzajVar, String str3, zza zzaVar, zza zzaVar2, String[] strArr, UserAddress userAddress, UserAddress userAddress2, InstrumentInfo[] instrumentInfoArr, PaymentMethodToken paymentMethodToken) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzajVar;
        this.zzd = str3;
        this.zze = zzaVar;
        this.zzf = zzaVar2;
        this.zzg = strArr;
        this.zzh = userAddress;
        this.zzi = userAddress2;
        this.zzj = instrumentInfoArr;
        this.zzk = paymentMethodToken;
    }
}
