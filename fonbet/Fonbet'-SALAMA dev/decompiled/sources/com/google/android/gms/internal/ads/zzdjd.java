package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
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
                zzceb.this.zzd("onSdkImpression", new r.b());
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvk
    public final void zzr() {
        if (this.zzb.zzd()) {
            zzdhc zzdhcVar = this.zza;
            zzebm zzu = zzdhcVar.zzu();
            if (zzu == null && zzdhcVar.zzw() != null && ((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzfr)).booleanValue()) {
                zzdhc zzdhcVar2 = this.zza;
                I3.b zzw = zzdhcVar2.zzw();
                zzbzf zzp = zzdhcVar2.zzp();
                if (zzw == null || zzp == null) {
                    return;
                }
                zzgbc.zzr(zzgbc.zzl(zzw, zzp), new zzdjc(this), this.zzd);
                return;
            }
            if (zzu != null) {
                zzdhc zzdhcVar3 = this.zza;
                zzceb zzr = zzdhcVar3.zzr();
                zzceb zzs = zzdhcVar3.zzs();
                if (zzr == null) {
                    zzr = zzs != null ? zzs : null;
                }
                if (zzr != null) {
                    zzb(zzr);
                }
            }
        }
    }
}
