package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzat extends com.google.android.libraries.places.api.model.NeighborhoodSummary {
    private final com.google.android.libraries.places.api.model.ContentBlock zza;
    private final com.google.android.libraries.places.api.model.ContentBlock zzb;
    private final android.net.Uri zzc;
    private final java.lang.String zzd;
    private final java.lang.String zze;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.NeighborhoodSummary)) {
            return false;
        }
        com.google.android.libraries.places.api.model.NeighborhoodSummary neighborhoodSummary = (com.google.android.libraries.places.api.model.NeighborhoodSummary) obj;
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zza;
        if (contentBlock == null) {
            if (neighborhoodSummary.getOverview() != null) {
                return false;
            }
        } else if (!contentBlock.equals(neighborhoodSummary.getOverview())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ContentBlock contentBlock2 = this.zzb;
        if (contentBlock2 == null) {
            if (neighborhoodSummary.getDescription() != null) {
                return false;
            }
        } else if (!contentBlock2.equals(neighborhoodSummary.getDescription())) {
            return false;
        }
        android.net.Uri uri = this.zzc;
        if (uri == null) {
            if (neighborhoodSummary.getFlagContentUri() != null) {
                return false;
            }
        } else if (!uri.equals(neighborhoodSummary.getFlagContentUri())) {
            return false;
        }
        java.lang.String str = this.zzd;
        if (str == null) {
            if (neighborhoodSummary.getDisclosureText() != null) {
                return false;
            }
        } else if (!str.equals(neighborhoodSummary.getDisclosureText())) {
            return false;
        }
        java.lang.String str2 = this.zze;
        if (str2 == null) {
            if (neighborhoodSummary.getDisclosureTextLanguageCode() != null) {
                return false;
            }
        } else if (!str2.equals(neighborhoodSummary.getDisclosureTextLanguageCode())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        android.net.Uri uri = this.zzc;
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zzb;
        java.lang.String valueOf = java.lang.String.valueOf(this.zza);
        java.lang.String valueOf2 = java.lang.String.valueOf(contentBlock);
        java.lang.String valueOf3 = java.lang.String.valueOf(uri);
        int length = java.lang.String.valueOf(valueOf).length();
        int length2 = java.lang.String.valueOf(valueOf2).length();
        int length3 = java.lang.String.valueOf(valueOf3).length();
        java.lang.String str = this.zzd;
        int length4 = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zze;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 43 + length2 + 17 + length3 + 17 + length4 + 29 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("NeighborhoodSummary{overview=");
        sb.append(valueOf);
        sb.append(", description=");
        sb.append(valueOf2);
        sb.append(", flagContentUri=");
        sb.append(valueOf3);
        sb.append(", disclosureText=");
        sb.append(str);
        sb.append(", disclosureTextLanguageCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zza;
        int hashCode = contentBlock == null ? 0 : contentBlock.hashCode();
        com.google.android.libraries.places.api.model.ContentBlock contentBlock2 = this.zzb;
        int hashCode2 = contentBlock2 == null ? 0 : contentBlock2.hashCode();
        android.net.Uri uri = this.zzc;
        int hashCode3 = uri == null ? 0 : uri.hashCode();
        java.lang.String str = this.zzd;
        int hashCode4 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zze;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary
    public final com.google.android.libraries.places.api.model.ContentBlock getOverview() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary, com.google.android.libraries.places.api.model.zzce
    public final android.net.Uri getFlagContentUri() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureTextLanguageCode() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureText() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.NeighborhoodSummary
    public final com.google.android.libraries.places.api.model.ContentBlock getDescription() {
        return this.zzb;
    }

    zzat(com.google.android.libraries.places.api.model.ContentBlock contentBlock, com.google.android.libraries.places.api.model.ContentBlock contentBlock2, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        this.zza = contentBlock;
        this.zzb = contentBlock2;
        this.zzc = uri;
        this.zzd = str;
        this.zze = str2;
    }
}
