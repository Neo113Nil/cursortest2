package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzt extends com.google.android.libraries.places.api.model.ConsumerAlertDetails {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final android.net.Uri zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.ConsumerAlertDetails)) {
            return false;
        }
        com.google.android.libraries.places.api.model.ConsumerAlertDetails consumerAlertDetails = (com.google.android.libraries.places.api.model.ConsumerAlertDetails) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (consumerAlertDetails.getTitle() != null) {
                return false;
            }
        } else if (!str.equals(consumerAlertDetails.getTitle())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (consumerAlertDetails.getDescription() != null) {
                return false;
            }
        } else if (!str2.equals(consumerAlertDetails.getDescription())) {
            return false;
        }
        java.lang.String str3 = this.zzc;
        if (str3 == null) {
            if (consumerAlertDetails.getAboutLinkTitle() != null) {
                return false;
            }
        } else if (!str3.equals(consumerAlertDetails.getAboutLinkTitle())) {
            return false;
        }
        android.net.Uri uri = this.zzd;
        if (uri == null) {
            if (consumerAlertDetails.getAboutLinkUri() != null) {
                return false;
            }
        } else if (!uri.equals(consumerAlertDetails.getAboutLinkUri())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzd);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zzc;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 41 + length2 + 17 + java.lang.String.valueOf(str3).length() + 15 + java.lang.String.valueOf(valueOf).length() + 1);
        sb.append("ConsumerAlertDetails{title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", aboutLinkTitle=");
        sb.append(str3);
        sb.append(", aboutLinkUri=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.lang.String str3 = this.zzc;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        android.net.Uri uri = this.zzd;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (uri != null ? uri.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public java.lang.String getTitle() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public java.lang.String getDescription() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public android.net.Uri getAboutLinkUri() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ConsumerAlertDetails
    public java.lang.String getAboutLinkTitle() {
        return this.zzc;
    }

    zzt(java.lang.String str, java.lang.String str2, java.lang.String str3, android.net.Uri uri) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = uri;
    }
}
