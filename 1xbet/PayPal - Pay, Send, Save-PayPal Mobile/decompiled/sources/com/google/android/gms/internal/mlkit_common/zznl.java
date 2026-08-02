package com.google.android.gms.internal.mlkit_common;

/* loaded from: classes8.dex */
public final class zznl {
    private final com.google.android.gms.internal.mlkit_common.zznh zza;
    private final com.google.android.gms.internal.mlkit_common.zznj zzb;
    private final com.google.android.gms.internal.mlkit_common.zznj zzc;
    private final java.lang.Boolean zzd;

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.mlkit_common.zznl)) {
            return false;
        }
        com.google.android.gms.internal.mlkit_common.zznl zznlVar = (com.google.android.gms.internal.mlkit_common.zznl) obj;
        if (com.google.android.gms.common.internal.Objects.equal(this.zza, zznlVar.zza)) {
            com.google.android.gms.internal.mlkit_common.zznj zznjVar = zznlVar.zzb;
            if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                com.google.android.gms.internal.mlkit_common.zznj zznjVar2 = zznlVar.zzc;
                if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                    java.lang.Boolean bool = zznlVar.zzd;
                    if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zza, null, null, null);
    }

    public final com.google.android.gms.internal.mlkit_common.zznh zza() {
        return this.zza;
    }

    /* synthetic */ zznl(com.google.android.gms.internal.mlkit_common.zzni zzniVar, com.google.android.gms.internal.mlkit_common.zznk zznkVar) {
        com.google.android.gms.internal.mlkit_common.zznh zznhVar;
        zznhVar = zzniVar.zza;
        this.zza = zznhVar;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
    }
}
