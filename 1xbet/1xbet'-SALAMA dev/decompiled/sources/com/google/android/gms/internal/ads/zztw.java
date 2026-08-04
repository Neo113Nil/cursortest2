package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zztw implements zzvb, zzrm {
    final /* synthetic */ zzty zza;
    private final Object zzb;
    private zzva zzc;
    private zzrl zzd;

    public zztw(zzty zztyVar, Object obj) {
        this.zza = zztyVar;
        this.zzc = zztyVar.zze(null);
        this.zzd = zztyVar.zzc(null);
        this.zzb = obj;
    }

    private final zzum zzf(zzum zzumVar, zzuq zzuqVar) {
        zzty zztyVar = this.zza;
        Object obj = this.zzb;
        long j = zzumVar.zzc;
        zztyVar.zzx(obj, j, zzuqVar);
        zzty zztyVar2 = this.zza;
        Object obj2 = this.zzb;
        long j3 = zzumVar.zzd;
        zztyVar2.zzx(obj2, j3, zzuqVar);
        return (j == zzumVar.zzc && j3 == zzumVar.zzd) ? zzumVar : new zzum(1, zzumVar.zza, zzumVar.zzb, 0, null, j, j3);
    }

    private final boolean zzg(int i7, zzuq zzuqVar) {
        zzuq zzuqVarZzy;
        if (zzuqVar != null) {
            zzuqVarZzy = this.zza.zzy(this.zzb, zzuqVar);
            if (zzuqVarZzy == null) {
                return false;
            }
        } else {
            zzuqVarZzy = null;
        }
        this.zza.zzw(this.zzb, 0);
        zzva zzvaVar = this.zzc;
        int i8 = zzvaVar.zza;
        zzuq zzuqVar2 = zzvaVar.zzb;
        int i9 = zzen.zza;
        if (!Objects.equals(zzuqVar2, zzuqVarZzy)) {
            this.zzc = this.zza.zzf(0, zzuqVarZzy);
        }
        zzrl zzrlVar = this.zzd;
        int i10 = zzrlVar.zza;
        if (Objects.equals(zzrlVar.zzb, zzuqVarZzy)) {
            return true;
        }
        this.zzd = this.zza.zzd(0, zzuqVarZzy);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzag(int i7, zzuq zzuqVar, zzum zzumVar) {
        if (zzg(0, zzuqVar)) {
            this.zzc.zzd(zzf(zzumVar, zzuqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzah(int i7, zzuq zzuqVar, zzuh zzuhVar, zzum zzumVar) {
        if (zzg(0, zzuqVar)) {
            this.zzc.zze(zzuhVar, zzf(zzumVar, zzuqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzai(int i7, zzuq zzuqVar, zzuh zzuhVar, zzum zzumVar) {
        if (zzg(0, zzuqVar)) {
            this.zzc.zzf(zzuhVar, zzf(zzumVar, zzuqVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzaj(int i7, zzuq zzuqVar, zzuh zzuhVar, zzum zzumVar, IOException iOException, boolean z4) {
        if (zzg(0, zzuqVar)) {
            this.zzc.zzg(zzuhVar, zzf(zzumVar, zzuqVar), iOException, z4);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzvb
    public final void zzak(int i7, zzuq zzuqVar, zzuh zzuhVar, zzum zzumVar, int i8) {
        if (zzg(0, zzuqVar)) {
            this.zzc.zzh(zzuhVar, zzf(zzumVar, zzuqVar), i8);
        }
    }
}
