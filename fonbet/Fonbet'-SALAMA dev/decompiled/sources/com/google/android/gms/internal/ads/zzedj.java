package com.google.android.gms.internal.ads;

import I2.J;
import J2.j;
import java.util.concurrent.Executor;
import o3.InterfaceC1506a;

/* loaded from: classes.dex */
public final class zzedj extends zzbvk implements zzcwa {
    private zzbvl zza;
    private zzcvz zzb;
    private zzdda zzc;

    @Override // com.google.android.gms.internal.ads.zzcwa
    public final synchronized void zza(zzcvz zzcvzVar) {
        this.zzb = zzcvzVar;
    }

    public final synchronized void zzc(zzbvl zzbvlVar) {
        this.zza = zzbvlVar;
    }

    public final synchronized void zzd(zzdda zzddaVar) {
        this.zzc = zzddaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zze(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zzb.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzf(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            zzbvlVar.zzf(interfaceC1506a);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzg(InterfaceC1506a interfaceC1506a, int i7) {
        zzcvz zzcvzVar = this.zzb;
        if (zzcvzVar != null) {
            zzcvzVar.zza(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzh(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zzc.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzi(InterfaceC1506a interfaceC1506a) {
        zzcvz zzcvzVar = this.zzb;
        if (zzcvzVar != null) {
            zzcvzVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzj(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zza.zzdp();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzk(InterfaceC1506a interfaceC1506a, int i7) {
        zzdda zzddaVar = this.zzc;
        if (zzddaVar != null) {
            zzebu zzebuVar = ((zzegn) zzddaVar).zzc;
            int i8 = J.f3546b;
            j.g("Fail to initialize adapter ".concat(String.valueOf(zzebuVar.zza)));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzl(InterfaceC1506a interfaceC1506a) {
        Executor executor;
        zzdda zzddaVar = this.zzc;
        if (zzddaVar != null) {
            executor = ((zzegn) zzddaVar).zzd.zzb;
            final zzebu zzebuVar = ((zzegn) zzddaVar).zzc;
            final zzfaf zzfafVar = ((zzegn) zzddaVar).zzb;
            final zzfar zzfarVar = ((zzegn) zzddaVar).zza;
            final zzegn zzegnVar = (zzegn) zzddaVar;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegm
                @Override // java.lang.Runnable
                public final void run() {
                    zzegp zzegpVar = zzegn.this.zzd;
                    zzegp.zze(zzfarVar, zzfafVar, zzebuVar);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzm(InterfaceC1506a interfaceC1506a, zzbvm zzbvmVar) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zzd.zza(zzbvmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzn(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zzd.zza(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzo(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zzc.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final synchronized void zzp(InterfaceC1506a interfaceC1506a) {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar != null) {
            ((zzego) zzbvlVar).zzd.zzc();
        }
    }
}
