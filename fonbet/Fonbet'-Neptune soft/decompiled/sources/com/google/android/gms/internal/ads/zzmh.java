package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzmh {
    public static final zzmh zza = new zzmh(new zzmg());
    public final zzfyv zzb;
    public final Double zzc;
    public final Double zzd;
    public final boolean zze;
    public final boolean zzf;
    public final boolean zzg;
    public final boolean zzh;

    private zzmh(zzmg zzmgVar) {
        zzfyv zzfyvVar;
        zzfyvVar = zzmgVar.zza;
        this.zzb = zzfyvVar;
        this.zzc = null;
        this.zzd = null;
        this.zze = true;
        this.zzf = false;
        this.zzg = true;
        this.zzh = true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzmh)) {
            return false;
        }
        zzmh zzmhVar = (zzmh) obj;
        if (!this.zzb.equals(zzmhVar.zzb)) {
            return false;
        }
        boolean z = zzmhVar.zzf;
        Double d = zzmhVar.zzc;
        Double d2 = zzmhVar.zzd;
        boolean z2 = zzmhVar.zze;
        boolean z3 = zzmhVar.zzg;
        boolean z4 = zzmhVar.zzh;
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, true, false, true, true);
    }
}
