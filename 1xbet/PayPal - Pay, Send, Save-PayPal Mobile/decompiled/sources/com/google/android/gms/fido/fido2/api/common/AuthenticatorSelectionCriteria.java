package com.google.android.gms.fido.fido2.api.common;

/* loaded from: classes8.dex */
public class AuthenticatorSelectionCriteria extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzm();
    private final com.google.android.gms.fido.fido2.api.common.Attachment zza;
    private final java.lang.Boolean zzb;
    private final com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement zzc;
    private final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzd;

    AuthenticatorSelectionCriteria(java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.fido.fido2.api.common.Attachment fromString;
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = com.google.android.gms.fido.fido2.api.common.Attachment.fromString(str);
            } catch (com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException | com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | com.google.android.gms.fido.fido2.api.common.zzbc e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        this.zzc = str2 == null ? null : com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement.fromString(str2);
        if (str3 != null) {
            residentKeyRequirement = com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.fromString(str3);
        }
        this.zzd = residentKeyRequirement;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria)) {
            return false;
        }
        com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria authenticatorSelectionCriteria = (com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticatorSelectionCriteria.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticatorSelectionCriteria.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticatorSelectionCriteria.zzc) && com.google.android.gms.common.internal.Objects.equal(getResidentKeyRequirement(), authenticatorSelectionCriteria.getResidentKeyRequirement());
    }

    public com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement getResidentKeyRequirement() {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement != null) {
            return residentKeyRequirement;
        }
        java.lang.Boolean bool = this.zzb;
        if (bool == null || !bool.booleanValue()) {
            return null;
        }
        return com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.RESIDENT_KEY_REQUIRED;
    }

    public java.lang.String getResidentKeyRequirementAsString() {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = getResidentKeyRequirement();
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, getResidentKeyRequirement());
    }

    public final java.lang.String toString() {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = this.zzd;
        com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(userVerificationRequirement);
        java.lang.String valueOf3 = java.lang.String.valueOf(residentKeyRequirement);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AuthenticatorSelectionCriteria{\n attachment=");
        sb.append(valueOf);
        sb.append(", \n requireResidentKey=");
        sb.append(this.zzb);
        sb.append(", \n requireUserVerification=");
        sb.append(valueOf2);
        sb.append(", \n residentKeyRequirement=");
        sb.append(valueOf3);
        sb.append("\n }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        com.google.android.gms.fido.fido2.api.common.UserVerificationRequirement userVerificationRequirement = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, userVerificationRequirement == null ? null : userVerificationRequirement.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* loaded from: classes.dex */
    public static class Builder {
        private com.google.android.gms.fido.fido2.api.common.Attachment zza;
        private java.lang.Boolean zzb;
        private com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzc;

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria build() {
            com.google.android.gms.fido.fido2.api.common.Attachment attachment = this.zza;
            java.lang.String obj = attachment == null ? null : attachment.toString();
            java.lang.Boolean bool = this.zzb;
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = this.zzc;
            return new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria(obj, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setResidentKeyRequirement(com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement) {
            this.zzc = residentKeyRequirement;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setRequireResidentKey(java.lang.Boolean bool) {
            this.zzb = bool;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setAttachment(com.google.android.gms.fido.fido2.api.common.Attachment attachment) {
            this.zza = attachment;
            return this;
        }
    }

    public java.lang.Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public java.lang.String getAttachmentAsString() {
        com.google.android.gms.fido.fido2.api.common.Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public com.google.android.gms.fido.fido2.api.common.Attachment getAttachment() {
        return this.zza;
    }
}
