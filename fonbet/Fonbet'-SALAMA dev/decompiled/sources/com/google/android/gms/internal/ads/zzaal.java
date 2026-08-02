package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* loaded from: classes.dex */
final class zzaal implements zzabo {
    final /* synthetic */ zzaaq zza;
    private final int zzb;
    private zzfwh zzc;
    private zzz zzd;
    private long zze;
    private long zzf;

    public zzaal(zzaaq zzaaqVar, Context context, int i7) {
        this.zza = zzaaqVar;
        this.zzb = true != zzen.zzL(context) ? 5 : 1;
        this.zzc = zzfwh.zzn();
        this.zzf = -9223372036854775807L;
    }

    private final void zza(List list) {
        List list2;
        zzfwe zzfweVar = new zzfwe();
        zzfweVar.zzh(list);
        list2 = this.zza.zze;
        zzfweVar.zzh(list2);
        this.zzc = zzfweVar.zzi();
    }

    private static final void zzb(zzz zzzVar) {
        zzk zzt;
        zzx zzb = zzzVar.zzb();
        zzt = zzaaq.zzt(zzzVar.zzC);
        zzb.zzD(zzt);
        zzb.zzaj();
        zzcv.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzd() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zze(boolean z4) {
        this.zzf = -9223372036854775807L;
        zzaaq.zzi(this.zza, z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzf(boolean z4) {
        zzabo zzaboVar;
        zzaboVar = this.zza.zzg;
        zzaboVar.zzf(z4);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzg(int i7, zzz zzzVar, List list) {
        zzcv.zzf(false);
        zza(list);
        this.zzd = zzzVar;
        this.zza.zzo = -9223372036854775807L;
        zzb(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzh() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzi(boolean z4) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzj() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzk() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzl(long j, long j3) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzm(int i7) {
        zzabo zzaboVar;
        zzaboVar = this.zza.zzg;
        zzaboVar.zzm(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzn(float f7) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzo(long j, long j3) {
        zzej zzejVar;
        zzejVar = this.zza.zzb;
        long j7 = this.zzf;
        zzejVar.zzd(j7 == -9223372036854775807L ? 0L : j7 + 1, Long.valueOf(j));
        this.zze = j3;
        zzaaq.zzk(this.zza, j3);
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzp(List list) {
        if (this.zzc.equals(list)) {
            return;
        }
        zza(list);
        zzz zzzVar = this.zzd;
        if (zzzVar != null) {
            zzb(zzzVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzq(zzaar zzaarVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final void zzr() {
        this.zza.zzo = this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final boolean zzs(long j, boolean z4, zzabm zzabmVar) {
        zzcv.zzf(false);
        if (!zzaaq.zzs(this.zza)) {
            return false;
        }
        zzcv.zzb(null);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzabo
    public final boolean zzt(boolean z4) {
        throw null;
    }
}
