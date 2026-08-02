package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzai extends com.google.android.libraries.places.api.model.GenerativeSummary {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final android.net.Uri zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.GenerativeSummary)) {
            return false;
        }
        com.google.android.libraries.places.api.model.GenerativeSummary generativeSummary = (com.google.android.libraries.places.api.model.GenerativeSummary) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (generativeSummary.getOverview() != null) {
                return false;
            }
        } else if (!str.equals(generativeSummary.getOverview())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (generativeSummary.getOverviewLanguageCode() != null) {
                return false;
            }
        } else if (!str2.equals(generativeSummary.getOverviewLanguageCode())) {
            return false;
        }
        android.net.Uri uri = this.zzc;
        if (uri == null) {
            if (generativeSummary.getFlagContentUri() != null) {
                return false;
            }
        } else if (!uri.equals(generativeSummary.getFlagContentUri())) {
            return false;
        }
        java.lang.String str3 = this.zzd;
        if (str3 == null) {
            if (generativeSummary.getDisclosureText() != null) {
                return false;
            }
        } else if (!str3.equals(generativeSummary.getDisclosureText())) {
            return false;
        }
        java.lang.String str4 = this.zze;
        if (str4 == null) {
            if (generativeSummary.getDisclosureTextLanguageCode() != null) {
                return false;
            }
        } else if (!str4.equals(generativeSummary.getDisclosureTextLanguageCode())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        int length2 = java.lang.String.valueOf(str2).length();
        int length3 = java.lang.String.valueOf(valueOf).length();
        java.lang.String str3 = this.zzd;
        int length4 = java.lang.String.valueOf(str3).length();
        java.lang.String str4 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 50 + length2 + 17 + length3 + 17 + length4 + 29 + java.lang.String.valueOf(str4).length() + 1);
        sb.append("GenerativeSummary{overview=");
        sb.append(str);
        sb.append(", overviewLanguageCode=");
        sb.append(str2);
        sb.append(", flagContentUri=");
        sb.append(valueOf);
        sb.append(", disclosureText=");
        sb.append(str3);
        sb.append(", disclosureTextLanguageCode=");
        sb.append(str4);
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
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary
    public final java.lang.String getOverviewLanguageCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary
    public final java.lang.String getOverview() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary, com.google.android.libraries.places.api.model.zzce
    public final android.net.Uri getFlagContentUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.GenerativeSummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureText() {
        return this.zzd;
    }

    zzai(java.lang.String str, java.lang.String str2, android.net.Uri uri, java.lang.String str3, java.lang.String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = str3;
        this.zze = str4;
    }
}
