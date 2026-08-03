package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class AuthenticationExtensionsClientOutputs extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzc();
    private final com.google.android.gms.fido.fido2.api.common.UvmEntries zza;
    private final com.google.android.gms.fido.fido2.api.common.zzf zzb;
    private final com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs zzc;
    private final com.google.android.gms.fido.fido2.api.common.zzh zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static final class Builder {
        private com.google.android.gms.fido.fido2.api.common.UvmEntries zza;
        private com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs zzb;

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs build() {
            return new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs(this.zza, null, this.zzb, null);
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.Builder setCredProps(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs) {
            this.zzb = authenticationExtensionsCredPropsOutputs;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs.Builder setUserVerificationMethodEntries(com.google.android.gms.fido.fido2.api.common.UvmEntries uvmEntries) {
            this.zza = uvmEntries;
            return this;
        }
    }

    AuthenticationExtensionsClientOutputs(com.google.android.gms.fido.fido2.api.common.UvmEntries uvmEntries, com.google.android.gms.fido.fido2.api.common.zzf zzfVar, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, com.google.android.gms.fido.fido2.api.common.zzh zzhVar) {
        this.zza = uvmEntries;
        this.zzb = zzfVar;
        this.zzc = authenticationExtensionsCredPropsOutputs;
        this.zzd = zzhVar;
    }

    public static com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs deserializeFromBytes(byte[] bArr) {
        return (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticationExtensionsClientOutputs.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticationExtensionsClientOutputs.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticationExtensionsClientOutputs.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, authenticationExtensionsClientOutputs.zzd);
    }

    public com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsCredPropsOutputs getCredProps() {
        return this.zzc;
    }

    public com.google.android.gms.fido.fido2.api.common.UvmEntries getUvmEntries() {
        return this.zza;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public byte[] serializeToBytes() {
        return com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer.serializeToBytes(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 1, getUvmEntries(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 2, this.zzb, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 3, getCredProps(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
