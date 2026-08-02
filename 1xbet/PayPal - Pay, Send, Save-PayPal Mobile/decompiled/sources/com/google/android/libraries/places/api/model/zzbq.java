package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbq extends com.google.android.libraries.places.api.model.ReviewSummary {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.net.Uri zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final android.net.Uri zzf;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.ReviewSummary)) {
            return false;
        }
        com.google.android.libraries.places.api.model.ReviewSummary reviewSummary = (com.google.android.libraries.places.api.model.ReviewSummary) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (reviewSummary.getText() != null) {
                return false;
            }
        } else if (!str.equals(reviewSummary.getText())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (reviewSummary.getTextLanguageCode() != null) {
                return false;
            }
        } else if (!str2.equals(reviewSummary.getTextLanguageCode())) {
            return false;
        }
        android.net.Uri uri = this.zzc;
        if (uri == null) {
            if (reviewSummary.getFlagContentUri() != null) {
                return false;
            }
        } else if (!uri.equals(reviewSummary.getFlagContentUri())) {
            return false;
        }
        java.lang.String str3 = this.zzd;
        if (str3 == null) {
            if (reviewSummary.getDisclosureText() != null) {
                return false;
            }
        } else if (!str3.equals(reviewSummary.getDisclosureText())) {
            return false;
        }
        java.lang.String str4 = this.zze;
        if (str4 == null) {
            if (reviewSummary.getDisclosureTextLanguageCode() != null) {
                return false;
            }
        } else if (!str4.equals(reviewSummary.getDisclosureTextLanguageCode())) {
            return false;
        }
        android.net.Uri uri2 = this.zzf;
        if (uri2 == null) {
            if (reviewSummary.getReviewsUri() != null) {
                return false;
            }
        } else if (!uri2.equals(reviewSummary.getReviewsUri())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.zzf;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(uri);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        int length2 = java.lang.String.valueOf(str2).length();
        int length3 = java.lang.String.valueOf(valueOf).length();
        java.lang.String str3 = this.zzd;
        int length4 = java.lang.String.valueOf(str3).length();
        java.lang.String str4 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 38 + length2 + 17 + length3 + 17 + length4 + 29 + java.lang.String.valueOf(str4).length() + 13 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("ReviewSummary{text=");
        sb.append(str);
        sb.append(", textLanguageCode=");
        sb.append(str2);
        sb.append(", flagContentUri=");
        sb.append(valueOf);
        sb.append(", disclosureText=");
        sb.append(str3);
        sb.append(", disclosureTextLanguageCode=");
        sb.append(str4);
        sb.append(", reviewsUri=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        android.net.Uri uri = this.zzc;
        int hashCode3 = uri == null ? 0 : uri.hashCode();
        java.lang.String str3 = this.zzd;
        int hashCode4 = str3 == null ? 0 : str3.hashCode();
        java.lang.String str4 = this.zze;
        int hashCode5 = str4 == null ? 0 : str4.hashCode();
        android.net.Uri uri2 = this.zzf;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ (uri2 != null ? uri2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary
    public final java.lang.String getTextLanguageCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary
    public final java.lang.String getText() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary
    public final android.net.Uri getReviewsUri() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary, com.google.android.libraries.places.api.model.zzce
    public final android.net.Uri getFlagContentUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.ReviewSummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureText() {
        return this.zzd;
    }

    zzbq(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.lang.String str3, java.lang.String str4, android.net.Uri uri2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = uri2;
    }
}
