package com.google.android.gms.internal.ads;

import E2.o;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class zzeqa implements zzesh {
    private final zzgbn zza;
    private final zzdtp zzb;

    public zzeqa(zzgbn zzgbnVar, zzdtp zzdtpVar) {
        this.zza = zzgbnVar;
        this.zzb = zzdtpVar;
    }

    public static zzeqb zzc(zzeqa zzeqaVar) {
        zzdtp zzdtpVar = zzeqaVar.zzb;
        String strZzc = zzdtpVar.zzc();
        boolean zZzr = zzdtpVar.zzr();
        boolean zG = o.f1952C.f1967n.g();
        zzdtp zzdtpVar2 = zzeqaVar.zzb;
        return new zzeqb(strZzc, zZzr, zG, zzdtpVar2.zzp(), zzdtpVar2.zzs());
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final int zza() {
        return 23;
    }

    @Override // com.google.android.gms.internal.ads.zzesh
    public final I3.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzepz
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeqa.zzc(this.zza);
            }
        });
    }
}
