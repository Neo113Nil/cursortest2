package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzlz {
    private long zza;
    private float zzb;
    private long zzc;

    public zzlz() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzlz(com.google.android.gms.internal.ads.zzma zzmaVar, byte[] bArr) {
        this.zza = zzmaVar.zza;
        this.zzb = zzmaVar.zzb;
        this.zzc = zzmaVar.zzc;
    }

    public final com.google.android.gms.internal.ads.zzlz zza(long j) {
        this.zza = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzlz zzb(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzb = f;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzlz zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzc = j;
        return this;
    }

    public final com.google.android.gms.internal.ads.zzma zzd() {
        return new com.google.android.gms.internal.ads.zzma(this, null);
    }

    final /* synthetic */ long zze() {
        return this.zza;
    }

    final /* synthetic */ float zzf() {
        return this.zzb;
    }

    final /* synthetic */ long zzg() {
        return this.zzc;
    }
}
