package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class AuthenticationExtensions extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzd();
    private final com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
    private final com.google.android.gms.fido.fido2.api.common.zzs zzb;
    private final com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzc;
    private final com.google.android.gms.fido.fido2.api.common.zzz zzd;
    private final com.google.android.gms.fido.fido2.api.common.zzab zze;
    private final com.google.android.gms.fido.fido2.api.common.zzad zzf;
    private final com.google.android.gms.fido.fido2.api.common.zzu zzg;
    private final com.google.android.gms.fido.fido2.api.common.zzag zzh;
    private final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
    private final com.google.android.gms.fido.fido2.api.common.zzai zzj;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension zza;
        private com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension zzb;
        private com.google.android.gms.fido.fido2.api.common.zzs zzc;
        private com.google.android.gms.fido.fido2.api.common.zzz zzd;
        private com.google.android.gms.fido.fido2.api.common.zzab zze;
        private com.google.android.gms.fido.fido2.api.common.zzad zzf;
        private com.google.android.gms.fido.fido2.api.common.zzu zzg;
        private com.google.android.gms.fido.fido2.api.common.zzag zzh;
        private com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzi;
        private com.google.android.gms.fido.fido2.api.common.zzai zzj;

        public Builder() {
        }

        public Builder(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions) {
            if (authenticationExtensions != null) {
                this.zza = authenticationExtensions.getFidoAppIdExtension();
                this.zzb = authenticationExtensions.getUserVerificationMethodExtension();
                this.zzc = authenticationExtensions.zza();
                this.zzd = authenticationExtensions.zzc();
                this.zze = authenticationExtensions.zzd();
                this.zzf = authenticationExtensions.zze();
                this.zzg = authenticationExtensions.zzb();
                this.zzh = authenticationExtensions.zzg();
                this.zzi = authenticationExtensions.zzf();
                this.zzj = authenticationExtensions.zzh();
            }
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions build() {
            return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions(this.zza, this.zzc, this.zzb, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setFido2Extension(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension fidoAppIdExtension) {
            this.zza = fidoAppIdExtension;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setGoogleThirdPartyPaymentExtension(com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension) {
            this.zzi = googleThirdPartyPaymentExtension;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions.Builder setUserVerificationMethodExtension(com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension userVerificationMethodExtension) {
            this.zzb = userVerificationMethodExtension;
            return this;
        }
    }

    AuthenticationExtensions(com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension fidoAppIdExtension, com.google.android.gms.fido.fido2.api.common.zzs zzsVar, com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension userVerificationMethodExtension, com.google.android.gms.fido.fido2.api.common.zzz zzzVar, com.google.android.gms.fido.fido2.api.common.zzab zzabVar, com.google.android.gms.fido.fido2.api.common.zzad zzadVar, com.google.android.gms.fido.fido2.api.common.zzu zzuVar, com.google.android.gms.fido.fido2.api.common.zzag zzagVar, com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension googleThirdPartyPaymentExtension, com.google.android.gms.fido.fido2.api.common.zzai zzaiVar) {
        this.zza = fidoAppIdExtension;
        this.zzc = userVerificationMethodExtension;
        this.zzb = zzsVar;
        this.zzd = zzzVar;
        this.zze = zzabVar;
        this.zzf = zzadVar;
        this.zzg = zzuVar;
        this.zzh = zzagVar;
        this.zzi = googleThirdPartyPaymentExtension;
        this.zzj = zzaiVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions authenticationExtensions = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticationExtensions.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticationExtensions.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticationExtensions.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, authenticationExtensions.zzd) && com.google.android.gms.common.internal.Objects.equal(this.zze, authenticationExtensions.zze) && com.google.android.gms.common.internal.Objects.equal(this.zzf, authenticationExtensions.zzf) && com.google.android.gms.common.internal.Objects.equal(this.zzg, authenticationExtensions.zzg) && com.google.android.gms.common.internal.Objects.equal(this.zzh, authenticationExtensions.zzh) && com.google.android.gms.common.internal.Objects.equal(this.zzi, authenticationExtensions.zzi) && com.google.android.gms.common.internal.Objects.equal(this.zzj, authenticationExtensions.zzj);
    }

    public com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension getFidoAppIdExtension() {
        return this.zza;
    }

    public com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension getUserVerificationMethodExtension() {
        return this.zzc;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, getFidoAppIdExtension(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, getUserVerificationMethodExtension(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, this.zze, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zzf, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, this.zzh, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 11, this.zzj, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fido.fido2.api.common.zzs zza() {
        return this.zzb;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzu zzb() {
        return this.zzg;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzz zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzab zzd() {
        return this.zze;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzad zze() {
        return this.zzf;
    }

    public final com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension zzf() {
        return this.zzi;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzag zzg() {
        return this.zzh;
    }

    public final com.google.android.gms.fido.fido2.api.common.zzai zzh() {
        return this.zzj;
    }
}
