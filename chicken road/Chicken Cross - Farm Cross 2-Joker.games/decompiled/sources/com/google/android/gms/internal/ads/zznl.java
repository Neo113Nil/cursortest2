package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zznl {
    public static final zznl zza = new zznl(new zznk());
    public final zzgxw zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = true;
    public final boolean zzi = true;
    public final boolean zzg = true;
    public final boolean zzh = true;

    private zznl(zznk zznkVar) {
        this.zzb = zznkVar.zza();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznl)) {
            return false;
        }
        zznl zznlVar = (zznl) obj;
        if (!this.zzb.equals(zznlVar.zzb)) {
            return false;
        }
        boolean z = zznlVar.zzf;
        boolean z2 = zznlVar.zzi;
        Double d = zznlVar.zzc;
        if (!Objects.equals(null, null)) {
            return false;
        }
        Double d2 = zznlVar.zzd;
        if (!Objects.equals(null, null)) {
            return false;
        }
        boolean z3 = zznlVar.zze;
        boolean z4 = zznlVar.zzg;
        boolean z5 = zznlVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, true, true, true, true);
    }
}
