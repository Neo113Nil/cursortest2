package com.google.android.gms.internal.ads;

import E2.o;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final class zzeqa implements zzesh {
    private final zzgbn zza;
    private final zzdtp zzb;

    public zzeqa(zzgbn zzgbnVar, zzdtp zzdtpVar) {
        this.zza = zzgbnVar;
        this.zzb = zzdtpVar;
    }

    public static zzeqb zzc(zzeqa zzeqaVar) {
        zzdtp zzdtpVar = zzeqaVar.zzb;
        String zzc = zzdtpVar.zzc();
        boolean zzr = zzdtpVar.zzr();
        boolean g3 = o.f1952C.f1967n.g();
        zzdtp zzdtpVar2 = zzeqaVar.zzb;
        return new zzeqb(zzc, zzr, g3, zzdtpVar2.zzp(), zzdtpVar2.zzs());
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
                return zzeqa.zzc(zzeqa.this);
            }
        });
    }
}
