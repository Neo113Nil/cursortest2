package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzdvj implements zzheg {
    private final zzhep zza;
    private final zzhep zzb;
    private final zzhep zzc;
    private final zzhep zzd;

    public zzdvj(zzhep zzhepVar, zzhep zzhepVar2, zzhep zzhepVar3, zzhep zzhepVar4, zzhep zzhepVar5) {
        this.zza = zzhepVar;
        this.zzb = zzhepVar2;
        this.zzc = zzhepVar3;
        this.zzd = zzhepVar4;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x004f  */
    /* JADX WARN: Code duplicated, block: B:8:0x006e  */
    /* JADX WARN: Code duplicated, block: B:9:0x0078  */
    @Override // com.google.android.gms.internal.ads.zzhev, com.google.android.gms.internal.ads.zzheu
    public final Object zzb() {
        I3.b bVarZzb;
        final zzauo zzauoVar = (zzauo) this.zza.zzb();
        final Context contextZza = ((zzcgi) this.zzb).zza();
        zzfba zzfbaVarZza = ((zzcuh) this.zzc).zza();
        long jLongValue = ((Long) this.zzd.zzb()).longValue();
        zzgbn zzgbnVarZzc = zzfdy.zzc();
        zzbbp zzbbpVar = zzbby.zzcS;
        C0254t c0254t = C0254t.f2723d;
        int iIntValue = ((Integer) c0254t.f2726c.zzb(zzbbpVar)).intValue();
        if (iIntValue != -1) {
            if (Integer.toString(iIntValue).equals(Q0.a.i0(Q0.a.k0(zzfbaVarZza.zzd)))) {
                o.f1952C.j.getClass();
                if (System.currentTimeMillis() - jLongValue < ((Integer) c0254t.f2726c.zzb(zzbby.zzcU)).intValue()) {
                    bVarZzb = zzgbnVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvc
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzauoVar.zzc().zzg(contextZza);
                        }
                    });
                } else {
                    bVarZzb = zzgbnVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvd
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return zzauoVar.zzc().zzf(contextZza);
                        }
                    });
                }
            } else {
                bVarZzb = zzgbnVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzauoVar.zzc().zzf(contextZza);
                    }
                });
            }
        } else {
            o.f1952C.j.getClass();
            if (System.currentTimeMillis() - jLongValue < ((Integer) c0254t.f2726c.zzb(zzbby.zzcU)).intValue()) {
                bVarZzb = zzgbnVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvc
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzauoVar.zzc().zzg(contextZza);
                    }
                });
            } else {
                bVarZzb = zzgbnVarZzc.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzdvd
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return zzauoVar.zzc().zzf(contextZza);
                    }
                });
            }
        }
        zzheo.zzb(bVarZzb);
        return bVarZzb;
    }
}
