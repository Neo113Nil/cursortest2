package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzafy extends zzagf {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagf[] zzg;

    public zzafy(String str, int i7, int i8, long j, long j3, zzagf[] zzagfVarArr) {
        super("CHAP");
        this.zza = str;
        this.zzb = i7;
        this.zzc = i8;
        this.zzd = j;
        this.zze = j3;
        this.zzg = zzagfVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafy.class == obj.getClass()) {
            zzafy zzafyVar = (zzafy) obj;
            if (this.zzb == zzafyVar.zzb && this.zzc == zzafyVar.zzc && this.zzd == zzafyVar.zzd && this.zze == zzafyVar.zze) {
                String str = this.zza;
                String str2 = zzafyVar.zza;
                int i7 = zzen.zza;
                if (Objects.equals(str, str2) && Arrays.equals(this.zzg, zzafyVar.zzg)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zzb + 527;
        String str = this.zza;
        long j = this.zze;
        return str.hashCode() + (((((((i7 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31);
    }
}
