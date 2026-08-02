package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzac extends com.google.android.libraries.places.api.model.EvChargeAmenitySummary {
    private final com.google.android.libraries.places.api.model.ContentBlock zza;
    private final com.google.android.libraries.places.api.model.ContentBlock zzb;
    private final com.google.android.libraries.places.api.model.ContentBlock zzc;
    private final com.google.android.libraries.places.api.model.ContentBlock zzd;
    private final android.net.Uri zze;
    private final java.lang.String zzf;
    private final java.lang.String zzg;

    zzac(com.google.android.libraries.places.api.model.ContentBlock contentBlock, com.google.android.libraries.places.api.model.ContentBlock contentBlock2, com.google.android.libraries.places.api.model.ContentBlock contentBlock3, com.google.android.libraries.places.api.model.ContentBlock contentBlock4, android.net.Uri uri, java.lang.String str, java.lang.String str2) {
        if (contentBlock == null) {
            throw new java.lang.NullPointerException("Null overview");
        }
        this.zza = contentBlock;
        this.zzb = contentBlock2;
        this.zzc = contentBlock3;
        this.zzd = contentBlock4;
        this.zze = uri;
        this.zzf = str;
        this.zzg = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.EvChargeAmenitySummary)) {
            return false;
        }
        com.google.android.libraries.places.api.model.EvChargeAmenitySummary evChargeAmenitySummary = (com.google.android.libraries.places.api.model.EvChargeAmenitySummary) obj;
        if (!this.zza.equals(evChargeAmenitySummary.getOverview())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zzb;
        if (contentBlock == null) {
            if (evChargeAmenitySummary.getCoffee() != null) {
                return false;
            }
        } else if (!contentBlock.equals(evChargeAmenitySummary.getCoffee())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ContentBlock contentBlock2 = this.zzc;
        if (contentBlock2 == null) {
            if (evChargeAmenitySummary.getRestaurant() != null) {
                return false;
            }
        } else if (!contentBlock2.equals(evChargeAmenitySummary.getRestaurant())) {
            return false;
        }
        com.google.android.libraries.places.api.model.ContentBlock contentBlock3 = this.zzd;
        if (contentBlock3 == null) {
            if (evChargeAmenitySummary.getStore() != null) {
                return false;
            }
        } else if (!contentBlock3.equals(evChargeAmenitySummary.getStore())) {
            return false;
        }
        android.net.Uri uri = this.zze;
        if (uri == null) {
            if (evChargeAmenitySummary.getFlagContentUri() != null) {
                return false;
            }
        } else if (!uri.equals(evChargeAmenitySummary.getFlagContentUri())) {
            return false;
        }
        java.lang.String str = this.zzf;
        if (str == null) {
            if (evChargeAmenitySummary.getDisclosureText() != null) {
                return false;
            }
        } else if (!str.equals(evChargeAmenitySummary.getDisclosureText())) {
            return false;
        }
        java.lang.String str2 = this.zzg;
        if (str2 == null) {
            if (evChargeAmenitySummary.getDisclosureTextLanguageCode() != null) {
                return false;
            }
        } else if (!str2.equals(evChargeAmenitySummary.getDisclosureTextLanguageCode())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode();
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zzb;
        int hashCode2 = contentBlock == null ? 0 : contentBlock.hashCode();
        com.google.android.libraries.places.api.model.ContentBlock contentBlock2 = this.zzc;
        int hashCode3 = contentBlock2 == null ? 0 : contentBlock2.hashCode();
        com.google.android.libraries.places.api.model.ContentBlock contentBlock3 = this.zzd;
        int hashCode4 = contentBlock3 == null ? 0 : contentBlock3.hashCode();
        android.net.Uri uri = this.zze;
        int hashCode5 = uri == null ? 0 : uri.hashCode();
        java.lang.String str = this.zzf;
        int hashCode6 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzg;
        return ((((((((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ hashCode4) * 1000003) ^ hashCode5) * 1000003) ^ hashCode6) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.String obj = this.zza.toString();
        int length = obj.length();
        android.net.Uri uri = this.zze;
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = this.zzd;
        com.google.android.libraries.places.api.model.ContentBlock contentBlock2 = this.zzc;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzb);
        java.lang.String valueOf2 = java.lang.String.valueOf(contentBlock2);
        java.lang.String valueOf3 = java.lang.String.valueOf(contentBlock);
        java.lang.String valueOf4 = java.lang.String.valueOf(uri);
        int length2 = java.lang.String.valueOf(valueOf).length();
        int length3 = java.lang.String.valueOf(valueOf2).length();
        int length4 = java.lang.String.valueOf(valueOf3).length();
        int length5 = java.lang.String.valueOf(valueOf4).length();
        java.lang.String str = this.zzf;
        int length6 = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 41 + length2 + 13 + length3 + 8 + length4 + 17 + length5 + 17 + length6 + 29 + java.lang.String.valueOf(str2).length() + 1);
        sb.append("EvChargeAmenitySummary{overview=");
        sb.append(obj);
        sb.append(", coffee=");
        sb.append(valueOf);
        sb.append(", restaurant=");
        sb.append(valueOf2);
        sb.append(", store=");
        sb.append(valueOf3);
        sb.append(", flagContentUri=");
        sb.append(valueOf4);
        sb.append(", disclosureText=");
        sb.append(str);
        sb.append(", disclosureTextLanguageCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary
    public final com.google.android.libraries.places.api.model.ContentBlock getStore() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary
    public final com.google.android.libraries.places.api.model.ContentBlock getRestaurant() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary
    public final com.google.android.libraries.places.api.model.ContentBlock getOverview() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary, com.google.android.libraries.places.api.model.zzce
    public final android.net.Uri getFlagContentUri() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureTextLanguageCode() {
        return this.zzg;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary, com.google.android.libraries.places.api.model.zzce
    public final java.lang.String getDisclosureText() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.api.model.EvChargeAmenitySummary
    public final com.google.android.libraries.places.api.model.ContentBlock getCoffee() {
        return this.zzb;
    }
}
