package com.google.android.recaptcha.internal;

import C6.o;
import e1.k;
import p3.f;

/* loaded from: classes.dex */
public final class zzbp implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String v02 = o.v0(10, String.valueOf(this.zzb / this.zza));
        String v03 = o.v0(10, String.valueOf(this.zzc));
        String v04 = o.v0(10, String.valueOf(this.zzb));
        String v05 = o.v0(5, String.valueOf(this.zza));
        StringBuilder l7 = k.l("avgExecutionTime: ", v02, " us| maxExecutionTime: ", v03, " us| totalTime: ");
        l7.append(v04);
        l7.append(" us| #Usages: ");
        l7.append(v05);
        return l7.toString();
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
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
