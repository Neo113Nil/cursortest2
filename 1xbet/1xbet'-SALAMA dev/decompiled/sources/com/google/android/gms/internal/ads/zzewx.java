package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzewx implements zzexw {
    private zzctw zza;
    private final Executor zzb = zzgbu.zzc();

    public final zzctw zza() {
        return this.zza;
    }

    public final I3.b zzb(zzexx zzexxVar, zzexv zzexvVar, zzctw zzctwVar) {
        zzctv zzctvVarZza = zzexvVar.zza(zzexxVar.zzb);
        zzctvVarZza.zzb(new zzeya(true));
        zzctw zzctwVar2 = (zzctw) zzctvVarZza.zzh();
        this.zza = zzctwVar2;
        final zzcra zzcraVarZzb = zzctwVar2.zzb();
        final zzfcw zzfcwVar = new zzfcw();
        return (zzgat) zzgbc.zzm((zzgat) zzgbc.zzn(zzgat.zzu(zzcraVarZzb.zzi()), new zzgaj(this) { // from class: com.google.android.gms.internal.ads.zzewv
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                zzfar zzfarVar = (zzfar) obj;
                zzfcwVar.zzb = zzfarVar;
                Iterator it = zzfarVar.zzb.zza.iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    Iterator it2 = ((zzfaf) it.next()).zza.iterator();
                    while (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            return zzgbc.zzh(null);
                        }
                        z4 = true;
                    }
                }
                if (z4) {
                    return zzcraVarZzb.zzh(zzgbc.zzh(zzfarVar));
                }
                return zzgbc.zzh(null);
            }
        }, this.zzb), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzeww
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                zzfcw zzfcwVar2 = zzfcwVar;
                zzfcwVar2.zzc = (zzcpw) obj;
                return zzfcwVar2;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* bridge */ /* synthetic */ I3.b zzc(zzexx zzexxVar, zzexv zzexvVar, Object obj) {
        return zzb(zzexxVar, zzexvVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
