package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzap {
    private final com.google.android.gms.internal.ads.zzao[] zza;

    public zzap(long j, com.google.android.gms.internal.ads.zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    public zzap(java.util.List list) {
        this.zza = (com.google.android.gms.internal.ads.zzao[]) list.toArray(new com.google.android.gms.internal.ads.zzao[0]);
    }

    private static final com.google.android.gms.internal.ads.zzao zzh(com.google.android.gms.internal.ads.zzao zzaoVar, java.lang.Class cls, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        com.google.android.gms.internal.ads.zzao zzaoVar2 = (com.google.android.gms.internal.ads.zzao) cls.cast(zzaoVar);
        if (zzgtkVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && java.util.Arrays.equals(this.zza, ((com.google.android.gms.internal.ads.zzap) obj).zza);
    }

    public final int hashCode() {
        return (java.util.Arrays.hashCode(this.zza) * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(-9223372036854775807L);
    }

    public final java.lang.String toString() {
        java.lang.String arrays = java.util.Arrays.toString(this.zza);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(arrays).length() + 8);
        sb.append("entries=");
        sb.append(arrays);
        sb.append("");
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length;
    }

    public final com.google.android.gms.internal.ads.zzao zzb(int i) {
        return this.zza[i];
    }

    public final com.google.android.gms.internal.ads.zzao zzc(java.lang.Class cls, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        for (com.google.android.gms.internal.ads.zzao zzaoVar : this.zza) {
            com.google.android.gms.internal.ads.zzao zzh = zzh(zzaoVar, cls, zzgtkVar);
            if (zzh != null) {
                return zzh;
            }
        }
        return null;
    }

    public final com.google.android.gms.internal.ads.zzgwm zzd(java.lang.Class cls) {
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        for (com.google.android.gms.internal.ads.zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgwjVar.zzf((com.google.android.gms.internal.ads.zzao) cls.cast(zzaoVar));
            }
        }
        return zzgwjVar.zzi();
    }

    public final com.google.android.gms.internal.ads.zzgwm zze(java.lang.Class cls, com.google.android.gms.internal.ads.zzgtk zzgtkVar) {
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        for (com.google.android.gms.internal.ads.zzao zzaoVar : this.zza) {
            com.google.android.gms.internal.ads.zzao zzh = zzh(zzaoVar, cls, zzgtkVar);
            if (zzh != null) {
                zzgwjVar.zzf(zzh);
            }
        }
        return zzgwjVar.zzi();
    }

    public final com.google.android.gms.internal.ads.zzap zzf(com.google.android.gms.internal.ads.zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final com.google.android.gms.internal.ads.zzap zzg(com.google.android.gms.internal.ads.zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        com.google.android.gms.internal.ads.zzao[] zzaoVarArr2 = this.zza;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int length2 = zzaoVarArr2.length;
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(zzaoVarArr2, length2 + length);
        java.lang.System.arraycopy(zzaoVarArr, 0, copyOf, length2, length);
        return new com.google.android.gms.internal.ads.zzap(-9223372036854775807L, (com.google.android.gms.internal.ads.zzao[]) copyOf);
    }
}
