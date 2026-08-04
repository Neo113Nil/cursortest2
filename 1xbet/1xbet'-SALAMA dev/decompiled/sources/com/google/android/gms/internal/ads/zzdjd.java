package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzdjd implements zzcvk {
    private final zzdhc zza;
    private final zzdhh zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdjd(zzdhc zzdhcVar, zzdhh zzdhhVar, Executor executor, Executor executor2) {
        this.zza = zzdhcVar;
        this.zzb = zzdhhVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzb(final zzceb zzcebVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjb
            @Override // java.lang.Runnable
            public final void run() {
                zzcebVar.zzd("onSdkImpression", new p122r.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdhc zzdhcVar = this.zza;
            zzebm zzebmVarZzu = zzdhcVar.zzu();
            if (zzebmVarZzu == null && zzdhcVar.zzw() != null && ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue()) {
                zzdhc zzdhcVar2 = this.zza;
                I3.b bVarZzw = zzdhcVar2.zzw();
                zzbzf zzbzfVarZzp = zzdhcVar2.zzp();
                if (bVarZzw == null || zzbzfVarZzp == null) {
                    return;
                }
                zzgbc.zzr(zzgbc.zzl(bVarZzw, zzbzfVarZzp), new zzdjc(this), this.zzd);
                return;
            }
            if (zzebmVarZzu != null) {
                zzdhc zzdhcVar3 = this.zza;
                zzceb zzcebVarZzr = zzdhcVar3.zzr();
                zzceb zzcebVarZzs = zzdhcVar3.zzs();
                if (zzcebVarZzr == null) {
                    zzcebVarZzr = zzcebVarZzs != null ? zzcebVarZzs : null;
                }
                if (zzcebVarZzr != null) {
                    zzb(zzcebVarZzr);
                }
            }
        }
    }
}
