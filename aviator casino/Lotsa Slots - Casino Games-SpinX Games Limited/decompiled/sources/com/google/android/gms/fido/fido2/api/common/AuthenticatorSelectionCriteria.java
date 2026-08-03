package com.google.android.gms.fido.fido2.api.common;

/* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
/* loaded from: classes3.dex */
public class AuthenticatorSelectionCriteria extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria> CREATOR = new com.google.android.gms.fido.fido2.api.common.zzm();
    private final com.google.android.gms.fido.fido2.api.common.Attachment zza;
    private final java.lang.Boolean zzb;
    private final com.google.android.gms.fido.fido2.api.common.zzay zzc;
    private final com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzd;

    /* compiled from: com.google.android.gms:play-services-fido@@20.0.1 */
    public static class Builder {
        private com.google.android.gms.fido.fido2.api.common.Attachment zza;
        private java.lang.Boolean zzb;
        private com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement zzc;

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria build() {
            com.google.android.gms.fido.fido2.api.common.Attachment attachment = this.zza;
            java.lang.String attachment2 = attachment == null ? null : attachment.toString();
            java.lang.Boolean bool = this.zzb;
            com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = this.zzc;
            return new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria(attachment2, bool, null, residentKeyRequirement == null ? null : residentKeyRequirement.toString());
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setAttachment(com.google.android.gms.fido.fido2.api.common.Attachment attachment) {
            this.zza = attachment;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setRequireResidentKey(java.lang.Boolean bool) {
            this.zzb = bool;
            return this;
        }

        public com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria.Builder setResidentKeyRequirement(com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement) {
            this.zzc = residentKeyRequirement;
            return this;
        }
    }

    AuthenticatorSelectionCriteria(java.lang.String str, java.lang.Boolean bool, java.lang.String str2, java.lang.String str3) {
        com.google.android.gms.fido.fido2.api.common.Attachment fromString;
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = null;
        if (str == null) {
            fromString = null;
        } else {
            try {
                fromString = com.google.android.gms.fido.fido2.api.common.Attachment.fromString(str);
            } catch (com.google.android.gms.fido.fido2.api.common.Attachment.UnsupportedAttachmentException | com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement.UnsupportedResidentKeyRequirementException | com.google.android.gms.fido.fido2.api.common.zzax e) {
                throw new java.lang.IllegalArgumentException(e);
            }
        }
        this.zza = fromString;
        this.zzb = bool;
        this.zzc = str2 == null ? null : com.google.android.gms.fido.fido2.api.common.zzay.zza(str2);
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
        return com.google.android.gms.common.internal.Objects.equal(this.zza, authenticatorSelectionCriteria.zza) && com.google.android.gms.common.internal.Objects.equal(this.zzb, authenticatorSelectionCriteria.zzb) && com.google.android.gms.common.internal.Objects.equal(this.zzc, authenticatorSelectionCriteria.zzc) && com.google.android.gms.common.internal.Objects.equal(this.zzd, authenticatorSelectionCriteria.zzd);
    }

    public com.google.android.gms.fido.fido2.api.common.Attachment getAttachment() {
        return this.zza;
    }

    public java.lang.String getAttachmentAsString() {
        com.google.android.gms.fido.fido2.api.common.Attachment attachment = this.zza;
        if (attachment == null) {
            return null;
        }
        return attachment.toString();
    }

    public java.lang.Boolean getRequireResidentKey() {
        return this.zzb;
    }

    public com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement getResidentKeyRequirement() {
        return this.zzd;
    }

    public java.lang.String getResidentKeyRequirementAsString() {
        com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement residentKeyRequirement = this.zzd;
        if (residentKeyRequirement == null) {
            return null;
        }
        return residentKeyRequirement.toString();
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getAttachmentAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBooleanObject(parcel, 3, getRequireResidentKey(), false);
        com.google.android.gms.fido.fido2.api.common.zzay zzayVar = this.zzc;
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, zzayVar == null ? null : zzayVar.toString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 5, getResidentKeyRequirementAsString(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
