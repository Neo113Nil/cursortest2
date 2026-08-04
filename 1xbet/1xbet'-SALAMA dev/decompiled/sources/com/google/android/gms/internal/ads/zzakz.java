package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class zzakz implements zzajs {
    private final zzed zza = new zzed();
    private final zzed zzb = new zzed();
    private final zzaky zzc;
    private Inflater zzd;

    public zzakz(List list) {
        zzaky zzakyVar = new zzaky();
        this.zzc = zzakyVar;
        zzakyVar.zzb(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzajs
    public final void zza(byte[] bArr, int i7, int i8, zzajr zzajrVar, zzdd zzddVar) {
        this.zza.zzJ(bArr, i8 + i7);
        this.zza.zzL(i7);
        if (this.zzd == null) {
            this.zzd = new Inflater();
        }
        if (zzen.zzO(this.zza, this.zzb, this.zzd)) {
            zzed zzedVar = this.zza;
            zzed zzedVar2 = this.zzb;
            zzedVar.zzJ(zzedVar2.zzN(), zzedVar2.zze());
        }
        this.zzc.zzd();
        zzed zzedVar3 = this.zza;
        int iZzb = zzedVar3.zzb();
        zzcn zzcnVarZza = null;
        if (iZzb >= 2 && zzedVar3.zzq() == iZzb) {
            this.zzc.zzc(this.zza);
            zzcnVarZza = this.zzc.zza(this.zza);
        }
        zzddVar.zza(new zzajk(zzcnVarZza != null ? zzfwh.zzo(zzcnVarZza) : zzfwh.zzn(), -9223372036854775807L, 5000000L));
    }
}
