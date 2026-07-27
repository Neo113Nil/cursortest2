package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzajr extends zzajz implements zzajg {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzajz[] zzg;

    public zzajr(String str, int i, int i2, long j, long j2, zzajz[] zzajzVarArr) {
        super("CHAP");
        String str2;
        zzguk.zza(i <= i2);
        this.zza = str;
        this.zzb = i;
        this.zzc = i2;
        int length = zzajzVarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            zzajz zzajzVar = zzajzVarArr[i3];
            if (zzajzVar instanceof zzake) {
                zzake zzakeVar = (zzake) zzajzVar;
                if (zzakeVar.zzf.equals("TIT2") && !zzakeVar.zzb.isEmpty()) {
                    str2 = (String) zzakeVar.zzb.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new zzx(null, str2);
        }
        this.zzd = j;
        this.zze = j2;
        this.zzg = zzajzVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajr zzajrVar = (zzajr) obj;
            if (this.zzb == zzajrVar.zzb && this.zzc == zzajrVar.zzc && this.zzd == zzajrVar.zzd && this.zze == zzajrVar.zze && Objects.equals(this.zza, zzajrVar.zza) && Arrays.equals(this.zzg, zzajrVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        long j = this.zze;
        return (((((((i * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j)) * 31) + str.hashCode();
    }
}
