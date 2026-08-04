package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class zzafz extends zzagf {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagf[] zze;

    public zzafz(String str, boolean z4, boolean z7, String[] strArr, zzagf[] zzagfVarArr) {
        super("CTOC");
        this.zza = str;
        this.zzb = z4;
        this.zzc = z7;
        this.zzd = strArr;
        this.zze = zzagfVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafz.class == obj.getClass()) {
            zzafz zzafzVar = (zzafz) obj;
            if (this.zzb == zzafzVar.zzb && this.zzc == zzafzVar.zzc) {
                String str = this.zza;
                String str2 = zzafzVar.zza;
                int i7 = zzen.zza;
                if (Objects.equals(str, str2) && Arrays.equals(this.zzd, zzafzVar.zzd) && Arrays.equals(this.zze, zzafzVar.zze)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = (this.zzb ? 1 : 0) + 527;
        String str = this.zza;
        return str.hashCode() + (((i7 * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
