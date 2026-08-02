package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzbo extends com.google.android.libraries.places.api.model.Review {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;
    private final java.lang.Double zzf;
    private final com.google.android.libraries.places.api.model.AuthorAttribution zzg;
    private final java.lang.String zzh;
    private final java.lang.String zzi;
    private final android.net.Uri zzj;
    private final com.google.android.libraries.places.api.model.LocalDate zzk;

    zzbo(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Double d, com.google.android.libraries.places.api.model.AuthorAttribution authorAttribution, java.lang.String str6, java.lang.String str7, android.net.Uri uri, com.google.android.libraries.places.api.model.LocalDate localDate) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = d;
        if (authorAttribution == null) {
            throw new java.lang.NullPointerException("Null authorAttribution");
        }
        this.zzg = authorAttribution;
        if (str6 == null) {
            throw new java.lang.NullPointerException("Null attribution");
        }
        this.zzh = str6;
        this.zzi = str7;
        this.zzj = uri;
        this.zzk = localDate;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.Review)) {
            return false;
        }
        com.google.android.libraries.places.api.model.Review review = (com.google.android.libraries.places.api.model.Review) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (review.getRelativePublishTimeDescription() != null) {
                return false;
            }
        } else if (!str.equals(review.getRelativePublishTimeDescription())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (review.getText() != null) {
                return false;
            }
        } else if (!str2.equals(review.getText())) {
            return false;
        }
        java.lang.String str3 = this.zzc;
        if (str3 == null) {
            if (review.getTextLanguageCode() != null) {
                return false;
            }
        } else if (!str3.equals(review.getTextLanguageCode())) {
            return false;
        }
        java.lang.String str4 = this.zzd;
        if (str4 == null) {
            if (review.getOriginalText() != null) {
                return false;
            }
        } else if (!str4.equals(review.getOriginalText())) {
            return false;
        }
        java.lang.String str5 = this.zze;
        if (str5 == null) {
            if (review.getOriginalTextLanguageCode() != null) {
                return false;
            }
        } else if (!str5.equals(review.getOriginalTextLanguageCode())) {
            return false;
        }
        if (!this.zzf.equals(review.getRating()) || !this.zzg.equals(review.getAuthorAttribution()) || !this.zzh.equals(review.getAttribution())) {
            return false;
        }
        java.lang.String str6 = this.zzi;
        if (str6 == null) {
            if (review.getPublishTime() != null) {
                return false;
            }
        } else if (!str6.equals(review.getPublishTime())) {
            return false;
        }
        android.net.Uri uri = this.zzj;
        if (uri == null) {
            if (review.getFlagContentUri() != null) {
                return false;
            }
        } else if (!uri.equals(review.getFlagContentUri())) {
            return false;
        }
        com.google.android.libraries.places.api.model.LocalDate localDate = this.zzk;
        if (localDate == null) {
            if (review.getVisitDate() != null) {
                return false;
            }
        } else if (!localDate.equals(review.getVisitDate())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        com.google.android.libraries.places.api.model.LocalDate localDate = this.zzk;
        android.net.Uri uri = this.zzj;
        java.lang.String obj = this.zzg.toString();
        java.lang.String valueOf = java.lang.String.valueOf(uri);
        java.lang.String valueOf2 = java.lang.String.valueOf(localDate);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        int length2 = java.lang.String.valueOf(str2).length();
        java.lang.String str3 = this.zzc;
        int length3 = java.lang.String.valueOf(str3).length();
        java.lang.String str4 = this.zzd;
        int length4 = java.lang.String.valueOf(str4).length();
        java.lang.String str5 = this.zze;
        int length5 = java.lang.String.valueOf(str5).length();
        java.lang.Double d = this.zzf;
        int length6 = d.toString().length();
        int length7 = obj.length();
        java.lang.String str6 = this.zzi;
        int length8 = java.lang.String.valueOf(str6).length();
        int length9 = java.lang.String.valueOf(valueOf).length();
        int length10 = java.lang.String.valueOf(valueOf2).length();
        java.lang.String str7 = this.zzh;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 45 + length2 + 19 + length3 + 15 + length4 + 27 + length5 + 9 + length6 + 20 + length7 + 14 + str7.length() + 14 + length8 + 17 + length9 + 12 + length10 + 1);
        sb.append("Review{relativePublishTimeDescription=");
        sb.append(str);
        sb.append(", text=");
        sb.append(str2);
        sb.append(", textLanguageCode=");
        sb.append(str3);
        sb.append(", originalText=");
        sb.append(str4);
        sb.append(", originalTextLanguageCode=");
        sb.append(str5);
        sb.append(", rating=");
        sb.append(d);
        sb.append(", authorAttribution=");
        sb.append(obj);
        sb.append(", attribution=");
        sb.append(str7);
        sb.append(", publishTime=");
        sb.append(str6);
        sb.append(", flagContentUri=");
        sb.append(valueOf);
        sb.append(", visitDate=");
        sb.append(valueOf2);
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
        java.lang.String str4 = this.zzd;
        int hashCode4 = str4 == null ? 0 : str4.hashCode();
        java.lang.String str5 = this.zze;
        int hashCode5 = str5 == null ? 0 : str5.hashCode();
        int hashCode6 = this.zzf.hashCode();
        int hashCode7 = this.zzg.hashCode();
        int hashCode8 = this.zzh.hashCode();
        java.lang.String str6 = this.zzi;
        int hashCode9 = str6 == null ? 0 : str6.hashCode();
        android.net.Uri uri = this.zzj;
        int hashCode10 = uri == null ? 0 : uri.hashCode();
        com.google.android.libraries.places.api.model.LocalDate localDate = this.zzk;
        return ((((((((((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ hashCode7) * 1000003) ^ hashCode8) * 1000003) ^ hashCode9) * 1000003) ^ hashCode10) * 1000003) ^ (localDate != null ? localDate.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final com.google.android.libraries.places.api.model.LocalDate getVisitDate() {
        return this.zzk;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getTextLanguageCode() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getText() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getRelativePublishTimeDescription() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.Double getRating() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getPublishTime() {
        return this.zzi;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getOriginalTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getOriginalText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final android.net.Uri getFlagContentUri() {
        return this.zzj;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final com.google.android.libraries.places.api.model.AuthorAttribution getAuthorAttribution() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.Review
    public final java.lang.String getAttribution() {
        return this.zzh;
    }
}
