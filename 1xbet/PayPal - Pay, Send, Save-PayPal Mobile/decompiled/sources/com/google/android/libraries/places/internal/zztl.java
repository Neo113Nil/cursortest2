package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zztl extends com.google.android.libraries.places.internal.zztm {
    private final int zzd;
    private int zzf = 0;
    private final java.lang.String zzb = "com/google/android/libraries/mapsplatform/common/api/configs/AuxLibConfigs";
    private final java.lang.String zzc = "addInternalUsageAttributionId";
    private final java.lang.String zze = "AuxLibConfigs.java";

    public final boolean equals(java.lang.Object obj) {
        int i;
        if (obj instanceof com.google.android.libraries.places.internal.zztl) {
            com.google.android.libraries.places.internal.zztl zztlVar = (com.google.android.libraries.places.internal.zztl) obj;
            if (this.zzc.equals(zztlVar.zzc) && this.zzd == zztlVar.zzd) {
                java.lang.String str = this.zzb;
                java.lang.String str2 = zztlVar.zzb;
                if (str != str2) {
                    if (str.length() == str2.length()) {
                        for (0; i < str.length(); i + 1) {
                            char charAt = str.charAt(i);
                            char charAt2 = str2.charAt(i);
                            i = (charAt == charAt2 || ((charAt & 65534) == 46 && (charAt ^ charAt2) == 1)) ? i + 1 : 0;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzf;
        if (i != 0) {
            return i;
        }
        int hashCode = ((this.zzc.hashCode() + 4867) * 31) + this.zzd;
        this.zzf = hashCode;
        return hashCode;
    }

    @Override // com.google.android.libraries.places.internal.zztm
    public final java.lang.String zza() {
        return this.zzb.replace(kotlinx.io.files.FileSystemKt.UnixPathSeparator, com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR);
    }

    @Override // com.google.android.libraries.places.internal.zztm
    public final java.lang.String zzd() {
        java.lang.String str = this.zze;
        return str.substring(str.lastIndexOf(java.io.File.separatorChar) + 1);
    }

    @Override // com.google.android.libraries.places.internal.zztm
    public final java.lang.String zze() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zztm
    public final int zzc() {
        return (char) this.zzd;
    }

    @Override // com.google.android.libraries.places.internal.zztm
    public final java.lang.String zzb() {
        return this.zzc;
    }
}
