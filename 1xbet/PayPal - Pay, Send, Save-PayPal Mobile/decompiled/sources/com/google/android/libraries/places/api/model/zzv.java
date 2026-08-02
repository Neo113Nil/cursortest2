package com.google.android.libraries.places.api.model;

/* loaded from: classes8.dex */
abstract class zzv extends com.google.android.libraries.places.api.model.ContentBlock {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.util.List zzc;
    private final java.util.List zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.libraries.places.api.model.ContentBlock)) {
            return false;
        }
        com.google.android.libraries.places.api.model.ContentBlock contentBlock = (com.google.android.libraries.places.api.model.ContentBlock) obj;
        java.lang.String str = this.zza;
        if (str == null) {
            if (contentBlock.getContent() != null) {
                return false;
            }
        } else if (!str.equals(contentBlock.getContent())) {
            return false;
        }
        java.lang.String str2 = this.zzb;
        if (str2 == null) {
            if (contentBlock.getContentLanguageCode() != null) {
                return false;
            }
        } else if (!str2.equals(contentBlock.getContentLanguageCode())) {
            return false;
        }
        java.util.List list = this.zzc;
        if (list == null) {
            if (contentBlock.getReferencedPlaceResourceNames() != null) {
                return false;
            }
        } else if (!list.equals(contentBlock.getReferencedPlaceResourceNames())) {
            return false;
        }
        java.util.List list2 = this.zzd;
        if (list2 == null) {
            if (contentBlock.getReferencedPlaceIds() != null) {
                return false;
            }
        } else if (!list2.equals(contentBlock.getReferencedPlaceIds())) {
            return false;
        }
        return true;
    }

    public final java.lang.String toString() {
        java.util.List list = this.zzd;
        java.lang.String valueOf = java.lang.String.valueOf(this.zzc);
        java.lang.String valueOf2 = java.lang.String.valueOf(list);
        java.lang.String str = this.zza;
        int length = java.lang.String.valueOf(str).length();
        java.lang.String str2 = this.zzb;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 43 + java.lang.String.valueOf(str2).length() + 31 + java.lang.String.valueOf(valueOf).length() + 21 + java.lang.String.valueOf(valueOf2).length() + 1);
        sb.append("ContentBlock{content=");
        sb.append(str);
        sb.append(", contentLanguageCode=");
        sb.append(str2);
        sb.append(", referencedPlaceResourceNames=");
        sb.append(valueOf);
        sb.append(", referencedPlaceIds=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        java.util.List list = this.zzc;
        int hashCode3 = list == null ? 0 : list.hashCode();
        java.util.List list2 = this.zzd;
        return ((((((hashCode ^ 1000003) * 1000003) ^ hashCode2) * 1000003) ^ hashCode3) * 1000003) ^ (list2 != null ? list2.hashCode() : 0);
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final java.util.List<java.lang.String> getReferencedPlaceResourceNames() {
        return this.zzc;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final java.util.List<java.lang.String> getReferencedPlaceIds() {
        return this.zzd;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final java.lang.String getContentLanguageCode() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.api.model.ContentBlock
    public final java.lang.String getContent() {
        return this.zza;
    }

    zzv(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = list;
        this.zzd = list2;
    }
}
