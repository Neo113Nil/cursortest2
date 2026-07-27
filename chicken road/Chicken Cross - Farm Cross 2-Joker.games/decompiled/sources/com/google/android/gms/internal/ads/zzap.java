package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzap {
    private final zzao[] zza;

    public zzap(long j, zzao... zzaoVarArr) {
        this.zza = zzaoVarArr;
    }

    public zzap(List list) {
        this.zza = (zzao[]) list.toArray(new zzao[0]);
    }

    private static final zzao zzh(zzao zzaoVar, Class cls, zzgul zzgulVar) {
        if (!cls.isAssignableFrom(zzaoVar.getClass())) {
            return null;
        }
        zzao zzaoVar2 = (zzao) cls.cast(zzaoVar);
        if (zzgulVar.zza(zzaoVar2)) {
            return zzaoVar2;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Arrays.equals(this.zza, ((zzap) obj).zza);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.zza) * 31) + Long.hashCode(-9223372036854775807L);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 8);
        sb.append("entries=");
        sb.append(arrays);
        sb.append("");
        return sb.toString();
    }

    public final int zza() {
        return this.zza.length;
    }

    public final zzao zzb(int i) {
        return this.zza[i];
    }

    public final zzao zzc(Class cls, zzgul zzgulVar) {
        for (zzao zzaoVar : this.zza) {
            zzao zzh = zzh(zzaoVar, cls, zzgulVar);
            if (zzh != null) {
                return zzh;
            }
        }
        return null;
    }

    public final zzgxm zzd(Class cls) {
        int i = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        for (zzao zzaoVar : this.zza) {
            if (cls.isAssignableFrom(zzaoVar.getClass())) {
                zzgxjVar.zzf((zzao) cls.cast(zzaoVar));
            }
        }
        return zzgxjVar.zzi();
    }

    public final zzgxm zze(Class cls, zzgul zzgulVar) {
        int i = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        for (zzao zzaoVar : this.zza) {
            zzao zzh = zzh(zzaoVar, cls, zzgulVar);
            if (zzh != null) {
                zzgxjVar.zzf(zzh);
            }
        }
        return zzgxjVar.zzi();
    }

    public final zzap zzf(zzap zzapVar) {
        return zzapVar == null ? this : zzg(zzapVar.zza);
    }

    public final zzap zzg(zzao... zzaoVarArr) {
        int length = zzaoVarArr.length;
        if (length == 0) {
            return this;
        }
        zzao[] zzaoVarArr2 = this.zza;
        String str = zzfm.zza;
        int length2 = zzaoVarArr2.length;
        Object[] copyOf = Arrays.copyOf(zzaoVarArr2, length2 + length);
        System.arraycopy(zzaoVarArr, 0, copyOf, length2, length);
        return new zzap(-9223372036854775807L, (zzao[]) copyOf);
    }
}
