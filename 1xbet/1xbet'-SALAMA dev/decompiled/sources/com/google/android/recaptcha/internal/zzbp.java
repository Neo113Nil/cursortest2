package com.google.android.recaptcha.internal;

import C6.o;
import p031e1.k;
import p113p3.f;

/* JADX INFO: loaded from: classes.dex */
public final class zzbp implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String strV0 = o.v0(10, String.valueOf(this.zzb / ((long) this.zza)));
        String strV1 = o.v0(10, String.valueOf(this.zzc));
        String strV2 = o.v0(10, String.valueOf(this.zzb));
        String strV3 = o.v0(5, String.valueOf(this.zza));
        StringBuilder sbL = k.l("avgExecutionTime: ", strV0, " us| maxExecutionTime: ", strV1, " us| totalTime: ");
        sbL.append(strV2);
        sbL.append(" us| #Usages: ");
        sbL.append(strV3);
        return sbL.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzbp zzbpVar) {
        return f.t(Long.valueOf(this.zzb), Long.valueOf(zzbpVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i7) {
        this.zza = i7;
    }
}
