package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzmd {
    private long zza;
    private float zzb;
    private long zzc;

    public zzmd() {
        this.zza = -9223372036854775807L;
        this.zzb = -3.4028235E38f;
        this.zzc = -9223372036854775807L;
    }

    /* synthetic */ zzmd(zzme zzmeVar, byte[] bArr) {
        this.zza = zzmeVar.zza;
        this.zzb = zzmeVar.zzb;
        this.zzc = zzmeVar.zzc;
    }

    public final zzmd zza(long j) {
        this.zza = j;
        return this;
    }

    public final zzmd zzb(float f) {
        boolean z = true;
        if (f <= 0.0f && f != -3.4028235E38f) {
            z = false;
        }
        zzguk.zza(z);
        this.zzb = f;
        return this;
    }

    public final zzmd zzc(long j) {
        boolean z = true;
        if (j < 0) {
            if (j == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                z = false;
            }
        }
        zzguk.zza(z);
        this.zzc = j;
        return this;
    }

    public final zzme zzd() {
        return new zzme(this, null);
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
