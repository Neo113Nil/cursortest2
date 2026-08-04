package com.google.android.gms.internal.ads;

import F2.C0252s;
import F2.C0254t;
import J2.o;

/* JADX INFO: loaded from: classes.dex */
final class zzfbk implements zzgay {
    final /* synthetic */ zzceb zza;
    final /* synthetic */ zzcln zzb;
    final /* synthetic */ zzfia zzc;
    final /* synthetic */ zzeaf zzd;

    public zzfbk(zzceb zzcebVar, zzcln zzclnVar, zzfia zzfiaVar, zzeaf zzeafVar) {
        this.zza = zzcebVar;
        this.zzb = zzclnVar;
        this.zzc = zzfiaVar;
        this.zzd = zzeafVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        String str = (String) obj;
        zzfaf zzfafVarZzD = this.zza.zzD();
        if (zzfafVarZzD != null && !zzfafVarZzD.zzai) {
            o oVar = zzfafVarZzD.zzax;
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzka)).booleanValue() && this.zzb != null && zzcln.zzj(str)) {
                this.zzb.zzi(str, this.zzc, C0252s.f2717f.f2722e, oVar);
                return;
            } else {
                this.zzc.zzd(str, oVar, null);
                return;
            }
        }
        zzfai zzfaiVarZzR = this.zza.zzR();
        if (zzfaiVarZzR == null) {
            E2.o.f1952C.f1961g.zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        E2.o oVar2 = E2.o.f1952C;
        oVar2.j.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zZzA = oVar2.f1961g.zzA(this.zza.getContext());
        boolean z4 = false;
        boolean z7 = ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzgi)).booleanValue() && zzfafVarZzD != null && zzfafVarZzD.zzS;
        if (zzfafVarZzD != null && zzfafVarZzD.zzad != null) {
            z4 = true;
        }
        this.zzd.zzd(new zzeah(jCurrentTimeMillis, zzfaiVarZzR.zzb, str, (zZzA || z7 || z4) ? 2 : 1));
    }
}
