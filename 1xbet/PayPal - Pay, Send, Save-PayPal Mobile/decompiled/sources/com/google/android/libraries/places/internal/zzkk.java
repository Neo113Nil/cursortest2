package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzkk {
    private java.lang.String description;
    private java.lang.Integer distanceMeters;
    private com.google.android.libraries.places.internal.zzkk.zzb[] matchedSubstrings;
    private java.lang.String placeId;
    private com.google.android.libraries.places.internal.zzkk.zza structuredFormatting;
    private java.lang.String[] types;

    final com.google.common.collect.ImmutableList zze() {
        java.lang.String[] strArr = this.types;
        return strArr != null ? com.google.common.collect.ImmutableList.copyOf(strArr) : com.google.common.collect.ImmutableList.of();
    }

    final com.google.common.collect.ImmutableList zzf() {
        com.google.android.libraries.places.internal.zzkk.zzb[] zzbVarArr = this.matchedSubstrings;
        return zzbVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzbVarArr) : com.google.common.collect.ImmutableList.of();
    }

    final com.google.android.libraries.places.internal.zzkk.zza zzd() {
        return this.structuredFormatting;
    }

    class zza {
        private java.lang.String mainText;
        private com.google.android.libraries.places.internal.zzkk.zzb[] mainTextMatchedSubstrings;
        private java.lang.String secondaryText;
        private com.google.android.libraries.places.internal.zzkk.zzb[] secondaryTextMatchedSubstrings;

        final com.google.common.collect.ImmutableList zzc() {
            com.google.android.libraries.places.internal.zzkk.zzb[] zzbVarArr = this.mainTextMatchedSubstrings;
            return zzbVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzbVarArr) : com.google.common.collect.ImmutableList.of();
        }

        final com.google.common.collect.ImmutableList zzd() {
            com.google.android.libraries.places.internal.zzkk.zzb[] zzbVarArr = this.secondaryTextMatchedSubstrings;
            return zzbVarArr != null ? com.google.common.collect.ImmutableList.copyOf(zzbVarArr) : com.google.common.collect.ImmutableList.of();
        }

        final java.lang.String zzb() {
            return this.secondaryText;
        }

        final java.lang.String zza() {
            return this.mainText;
        }

        zza() {
        }
    }

    final java.lang.String zzc() {
        return this.placeId;
    }

    final java.lang.Integer zzb() {
        return this.distanceMeters;
    }

    class zzb {
        java.lang.Integer length;
        java.lang.Integer offset;

        zzb() {
        }
    }

    final java.lang.String zza() {
        return this.description;
    }

    zzkk() {
    }
}
