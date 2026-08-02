package com.google.android.gms.tapandpay.issuer;

/* loaded from: classes8.dex */
public final class UserAddress extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.tapandpay.issuer.UserAddress> CREATOR = new com.google.android.gms.tapandpay.issuer.zzaa();
    java.lang.String zza;
    java.lang.String zzb;
    java.lang.String zzc;
    java.lang.String zzd;
    java.lang.String zze;
    java.lang.String zzf;
    java.lang.String zzg;
    java.lang.String zzh;
    java.lang.String zzi;
    java.lang.String zzj;
    java.lang.String zzk;
    java.lang.String zzl;
    boolean zzm;
    java.lang.String zzn;
    java.lang.String zzo;

    UserAddress() {
    }

    public static com.google.android.gms.tapandpay.issuer.UserAddress fromIntent(android.content.Intent intent) {
        if (intent == null || !intent.hasExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS")) {
            return null;
        }
        return (com.google.android.gms.tapandpay.issuer.UserAddress) intent.getParcelableExtra("com.google.android.gms.identity.intents.EXTRA_ADDRESS");
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.tapandpay.issuer.UserAddress)) {
            return false;
        }
        com.google.android.gms.tapandpay.issuer.UserAddress userAddress = (com.google.android.gms.tapandpay.issuer.UserAddress) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, userAddress.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, userAddress.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, userAddress.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, userAddress.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, userAddress.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, userAddress.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, userAddress.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, userAddress.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, userAddress.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, userAddress.zzj) && com.google.android.gms.common.internal.Objects.equal(this.zzk, userAddress.zzk) && com.google.android.gms.common.internal.Objects.equal(this.zzl, userAddress.zzl) && this.zzm == userAddress.zzm && com.google.android.gms.common.internal.Objects.equal(this.zzn, userAddress.zzn) && com.google.android.gms.common.internal.Objects.equal(this.zzo, userAddress.zzo);
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        java.lang.String str2 = this.zzb;
        java.lang.String str3 = this.zzc;
        java.lang.String str4 = this.zzd;
        java.lang.String str5 = this.zze;
        java.lang.String str6 = this.zzf;
        java.lang.String str7 = this.zzg;
        java.lang.String str8 = this.zzh;
        java.lang.String str9 = this.zzi;
        java.lang.String str10 = this.zzj;
        java.lang.String str11 = this.zzk;
        java.lang.String str12 = this.zzl;
        boolean z = this.zzm;
        return com.google.android.gms.common.internal.Objects.hashCode(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, java.lang.Boolean.valueOf(z), this.zzn, this.zzo);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.zza).add("address1", this.zzb).add("address2", this.zzc).add("address3", this.zzd).add("address4", this.zze).add("address5", this.zzf).add("administrativeArea", this.zzg).add(com.google.android.libraries.places.api.model.PlaceTypes.LOCALITY, this.zzh).add("countryCode", this.zzi).add(androidx.autofill.HintConstants.AUTOFILL_HINT_POSTAL_CODE, this.zzj).add("sortingCode", this.zzk).add("phoneNumber", this.zzl).add("isPostBox", java.lang.Boolean.valueOf(this.zzm)).add("companyName", this.zzn).add(androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, this.zzo).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, this.zze, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 9, this.zzh, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 10, this.zzi, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 11, this.zzj, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(parcel, 14, this.zzm);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 15, this.zzn, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 16, this.zzo, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    UserAddress(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, java.lang.String str11, java.lang.String str12, boolean z, java.lang.String str13, java.lang.String str14) {
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

    public final boolean isPostBox() {
        return this.zzm;
    }

    public final java.lang.String getSortingCode() {
        return this.zzk;
    }

    public final java.lang.String getPostalCode() {
        return this.zzj;
    }

    public final java.lang.String getPhoneNumber() {
        return this.zzl;
    }

    public final java.lang.String getName() {
        return this.zza;
    }

    public final java.lang.String getLocality() {
        return this.zzh;
    }

    public final java.lang.String getEmailAddress() {
        return this.zzo;
    }

    public static class Builder {
        private java.lang.String zza;
        private java.lang.String zzb;
        private java.lang.String zzc;
        private java.lang.String zzd;
        private java.lang.String zze;
        private java.lang.String zzf;
        private java.lang.String zzg;
        private java.lang.String zzh;

        public com.google.android.gms.tapandpay.issuer.UserAddress build() {
            return new com.google.android.gms.tapandpay.issuer.UserAddress(this.zza, this.zzb, this.zzc, null, null, null, this.zzd, this.zze, this.zzf, this.zzg, null, this.zzh, false, null, null);
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setPostalCode(java.lang.String str) {
            this.zzg = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setPhoneNumber(java.lang.String str) {
            this.zzh = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setName(java.lang.String str) {
            this.zza = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setLocality(java.lang.String str) {
            this.zze = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setCountryCode(java.lang.String str) {
            this.zzf = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setAdministrativeArea(java.lang.String str) {
            this.zzd = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setAddress2(java.lang.String str) {
            this.zzc = str;
            return this;
        }

        public com.google.android.gms.tapandpay.issuer.UserAddress.Builder setAddress1(java.lang.String str) {
            this.zzb = str;
            return this;
        }
    }

    public final java.lang.String getCountryCode() {
        return this.zzi;
    }

    public final java.lang.String getCompanyName() {
        return this.zzn;
    }

    public final java.lang.String getAdministrativeArea() {
        return this.zzg;
    }

    public final java.lang.String getAddress5() {
        return this.zzf;
    }

    public final java.lang.String getAddress4() {
        return this.zze;
    }

    public final java.lang.String getAddress3() {
        return this.zzd;
    }

    public final java.lang.String getAddress2() {
        return this.zzc;
    }

    public final java.lang.String getAddress1() {
        return this.zzb;
    }

    public static com.google.android.gms.tapandpay.issuer.UserAddress.Builder newBuilder() {
        return new com.google.android.gms.tapandpay.issuer.UserAddress.Builder();
    }
}
