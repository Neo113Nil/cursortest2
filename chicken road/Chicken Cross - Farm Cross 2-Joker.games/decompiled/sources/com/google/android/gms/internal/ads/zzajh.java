package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzajh implements zzajg {
    private final long zza;
    private final long zzb;
    private final boolean zzc;
    private final zzx zzd;

    public zzajh(long j, long j2, boolean z, zzx zzxVar) {
        boolean z2 = true;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L && j > j2) {
            z2 = false;
        }
        zzguk.zza(z2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = z;
        this.zzd = zzxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajh zzajhVar = (zzajh) obj;
            if (this.zza == zzajhVar.zza && this.zzb == zzajhVar.zzb && this.zzc == zzajhVar.zzc && Objects.equals(this.zzd, zzajhVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Long.hashCode(this.zzb);
        zzx zzxVar = this.zzd;
        return (((hashCode * 31) + (this.zzc ? 1 : 0)) * 31) + (zzxVar != null ? zzxVar.hashCode() : 0);
    }

    public final String toString() {
        String sb;
        long j = this.zza;
        Object valueOf = j == -9223372036854775807L ? "UNSET" : Long.valueOf(j);
        long j2 = this.zzb;
        String obj = valueOf.toString();
        if (j2 == -9223372036854775807L) {
            sb = "";
        } else {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 12);
            sb2.append(", endTimeMs=");
            sb2.append(j2);
            sb = sb2.toString();
        }
        boolean z = this.zzc;
        zzx zzxVar = this.zzd;
        String concat = zzxVar == null ? "" : ", title=".concat(zzxVar.toString());
        String str = true == z ? ", hidden" : "";
        StringBuilder sb3 = new StringBuilder(obj.length() + 21 + sb.length() + str.length() + concat.length());
        sb3.append("Chapter: startTimeMs=");
        sb3.append(obj);
        sb3.append(sb);
        sb3.append(str);
        sb3.append(concat);
        return sb3.toString();
    }
}
