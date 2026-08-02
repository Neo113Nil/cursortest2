package com.google.android.gms.internal.ads;

import android.media.MediaFormat;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

/* loaded from: classes.dex */
final class zzzw implements zzabo {
    private final zzaau zza;
    private final zzcz zzb;
    private final zzaaz zzc;
    private final Queue zzd;
    private final zzz zze;
    private long zzf;
    private zzaar zzg;

    public zzzw(zzaau zzaauVar, zzcz zzczVar) {
        this.zza = zzaauVar;
        zzaauVar.zzk(zzczVar);
        this.zzb = zzczVar;
        this.zzc = new zzaaz(new zzzu(this, null), zzaauVar);
        this.zzd = new ArrayDeque();
        this.zze = new zzx().zzaj();
        this.zzf = -9223372036854775807L;
        this.zzg = new zzaar() { // from class: com.google.android.gms.internal.ads.zzzt
            @Override // com.google.android.gms.internal.ads.zzaar
            public final void zza(long j, long j3, zzz zzzVar, MediaFormat mediaFormat) {
            }
        };
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzd() {
        this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zze(boolean z4) {
        if (z4) {
            this.zza.zzi();
        }
        this.zzc.zza();
        this.zzd.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzf(boolean z4) {
        this.zza.zzc(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzg(int i7, zzz zzzVar, List list) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzh() {
        this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzi(boolean z4) {
        this.zza.zze(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzj() {
        this.zza.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzk() {
        this.zza.zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzl(long j, long j3) {
        try {
            this.zzc.zzc(j, j3);
        } catch (zzia e7) {
            throw new zzabn(e7, this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzm(int i7) {
        this.zza.zzj(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzn(float f7) {
        this.zza.zzn(f7);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzo(long j, long j3) {
        if (j != this.zzf) {
            this.zzc.zzb(j);
            this.zzf = j;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzp(List list) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzq(zzaar zzaarVar) {
        this.zzg = zzaarVar;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzr() {
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final boolean zzs(long j, boolean z4, zzabm zzabmVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final boolean zzt(boolean z4) {
        return this.zza.zzo(false);
    }
}
