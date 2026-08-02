package com.google.android.gms.identity.intents.model;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;

/* loaded from: classes4.dex */
public final class UserAddress extends a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<UserAddress> CREATOR = new zzb();
    String zza;
    String zzb;
    String zzc;
    String zzd;
    String zze;
    String zzf;
    String zzg;
    String zzh;
    String zzi;
    String zzj;
    String zzk;
    String zzl;
    boolean zzm;
    String zzn;
    String zzo;

    public UserAddress() {
    }

    @Nullable
    public static UserAddress fromIntent(@NonNull Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    @NonNull
    public String getAddress1() {
        return this.zzb;
    }

    @NonNull
    public String getAddress2() {
        return this.zzc;
    }

    @NonNull
    public String getAddress3() {
        return this.zzd;
    }

    @NonNull
    public String getAddress4() {
        return this.zze;
    }

    @NonNull
    public String getAddress5() {
        return this.zzf;
    }

    @NonNull
    public String getAdministrativeArea() {
        return this.zzg;
    }

    @NonNull
    public String getCompanyName() {
        return this.zzn;
    }

    @NonNull
    public String getCountryCode() {
        return this.zzi;
    }

    @NonNull
    public String getEmailAddress() {
        return this.zzo;
    }

    @NonNull
    public String getLocality() {
        return this.zzh;
    }

    @NonNull
    public String getName() {
        return this.zza;
    }

    @NonNull
    public String getPhoneNumber() {
        return this.zzl;
    }

    @NonNull
    public String getPostalCode() {
        return this.zzj;
    }

    @NonNull
    public String getSortingCode() {
        return this.zzk;
    }

    public boolean isPostBox() {
        return this.zzm;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 2, this.zza, false);
        c.l(parcel, 3, this.zzb, false);
        c.l(parcel, 4, this.zzc, false);
        c.l(parcel, 5, this.zzd, false);
        c.l(parcel, 6, this.zze, false);
        c.l(parcel, 7, this.zzf, false);
        c.l(parcel, 8, this.zzg, false);
        c.l(parcel, 9, this.zzh, false);
        c.l(parcel, 10, this.zzi, false);
        c.l(parcel, 11, this.zzj, false);
        c.l(parcel, 12, this.zzk, false);
        c.l(parcel, 13, this.zzl, false);
        boolean z = this.zzm;
        c.s(parcel, 14, 4);
        parcel.writeInt(z ? 1 : 0);
        c.l(parcel, 15, this.zzn, false);
        c.l(parcel, 16, this.zzo, false);
        c.r(parcel, q);
    }

    public UserAddress(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, boolean z, String str13, String str14) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = z;
        this.zzn = str13;
        this.zzo = str14;
    }
}
