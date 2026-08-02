package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzr extends com.google.android.libraries.places.api.model.ConsumerAlert {
    private final java.lang.String zza;
    private final com.google.android.libraries.places.api.model.ConsumerAlertDetails zzb;
    private final java.lang.String zzc;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.ConsumerAlert)) {
            return false;
        }
        com.google.android.libraries.places.api.model.ConsumerAlert consumerAlert = (com.google.android.libraries.places.api.model.ConsumerAlert) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (consumerAlert.getOverview() != null) {
                return false;
            }
        } else if (!str.equals(consumerAlert.getOverview())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails = this.zzb;
        if (consumerAlertDetails == null) {
            if (consumerAlert.getDetails() != null) {
                return false;
            }
        } else if (!consumerAlertDetails.equals(consumerAlert.getDetails())) {
            return false;
        }
        java.lang.String str2 = this.zzc;
        if (str2 == null) {
            if (consumerAlert.getLanguageCode() != null) {
                return false;
            }
        } else if (!str2.equals(consumerAlert.getLanguageCode())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        int length2 = java.lang.String.valueOf(valueOf).length();
        java.lang.String str2 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 33 + length2 + 15 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("ConsumerAlert{overview=");
        sb.append(str);
        sb.append(", details=");
        sb.append(valueOf);
        sb.append(", languageCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails = this.zzb;
        int hashCode2 = consumerAlertDetails == null ? 0 : consumerAlertDetails.hashCode();
        java.lang.String str2 = this.zzc;
        return ((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert
    public java.lang.String getOverview() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert
    public java.lang.String getLanguageCode() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlert
    public com.google.android.libraries.places.api.model.ConsumerAlertDetails getDetails() {
        return this.zzb;
    }

    zzr(java.lang.String str, com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails, java.lang.String str2) {
        this.zza = str;
        this.zzb = consumerAlertDetails;
        this.zzc = str2;
    }
}
