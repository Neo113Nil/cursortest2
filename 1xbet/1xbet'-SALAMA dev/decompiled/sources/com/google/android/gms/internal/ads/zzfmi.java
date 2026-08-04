package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;

/* JADX INFO: loaded from: classes.dex */
final class zzfmi extends zzfme {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    public /* synthetic */ zzfmi(String str, boolean z4, boolean z7, boolean z8, long j, boolean z9, long j3, zzfmh zzfmhVar) {
        this.zza = str;
        this.zzb = z4;
        this.zzc = z7;
        this.zzd = j;
        this.zze = j3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfme) {
            zzfme zzfmeVar = (zzfme) obj;
            if (this.zza.equals(zzfmeVar.zzd()) && this.zzb == zzfmeVar.zzh() && this.zzc == zzfmeVar.zzg()) {
                zzfmeVar.zzf();
                if (this.zzd == zzfmeVar.zzb()) {
                    zzfmeVar.zze();
                    if (this.zze == zzfmeVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdShield2Options{clientVersion=");
        sb.append(this.zza);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(this.zzb);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(this.zzc);
        sb.append(", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=");
        sb.append(this.zzd);
        sb.append(", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=");
        return AbstractC0486a1.i(sb, this.zze, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfme
    public final boolean zzh() {
        return this.zzb;
    }
}
