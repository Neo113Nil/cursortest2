package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.M;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class zzexz implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;

    public zzexz(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzexw zzb() {
        zzbyk zzbykVarN;
        Context context = (Context) this.zza.zzb();
        zzfcj zzfcjVar = (zzfcj) this.zzb.zzb();
        zzfdb zzfdbVar = (zzfdb) this.zzc.zzb();
        zzbbp zzbbpVar = zzbby.zzgl;
        C0254t c0254t = C0254t.f2723d;
        if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue()) {
            zzbykVarN = ((M) o.f1952C.f1961g.zzi()).n();
        } else {
            M m7 = (M) o.f1952C.f1961g.zzi();
            synchronized (m7.f3551a) {
                zzbykVarN = m7.f3563n;
            }
        }
        boolean z4 = false;
        if (zzbykVarN != null && zzbykVarN.zzh()) {
            z4 = true;
        }
        if (((Integer) c0254t.f2726c.zzb(zzbby.zzgn)).intValue() > 0) {
            if (!((Boolean) c0254t.f2726c.zzb(zzbby.zzgk)).booleanValue() || z4) {
                zzfda zzfdaVarZza = zzfdbVar.zza(zzfcr.Rewarded, context, zzfcjVar, new zzexa(new zzewx()));
                zzexm zzexmVar = new zzexm(new zzexl());
                zzfcn zzfcnVar = zzfdaVarZza.zza;
                zzgbn zzgbnVar = zzbza.zza;
                return new zzexc(zzexmVar, new zzexi(zzfcnVar, zzgbnVar), zzfdaVarZza.zzb, zzfdaVarZza.zza.zza().zzf, zzgbnVar);
            }
        }
        return new zzexl();
    }
}
