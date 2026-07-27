package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaim implements zzafs {
    private final zzagu zza;
    private final int zzb;
    private final zzago zzc = new zzago();

    /* synthetic */ zzaim(zzagu zzaguVar, int i, byte[] bArr) {
        this.zza = zzaguVar;
        this.zzb = i;
    }

    private final long zzc(zzagi zzagiVar) throws IOException {
        while (zzagiVar.zzm() < zzagiVar.zzo() - 6) {
            zzagu zzaguVar = this.zza;
            int i = this.zzb;
            zzago zzagoVar = this.zzc;
            long zzm = zzagiVar.zzm();
            zzeu zzeuVar = new zzeu(17);
            zzagiVar.zzi(zzeuVar.zzi(), 0, 2);
            if (zzeuVar.zzo() != i) {
                zzagiVar.zzl();
                zzagiVar.zzk((int) (zzm - zzagiVar.zzn()));
            } else {
                zzeuVar.zzf(zzagl.zzb(zzagiVar, zzeuVar.zzi(), 2, 15) + 2);
                zzagiVar.zzl();
                zzagiVar.zzk((int) (zzm - zzagiVar.zzn()));
                if (zzagp.zza(zzeuVar, zzaguVar, i, zzagoVar)) {
                    break;
                }
            }
            zzagiVar.zzk(1);
        }
        if (zzagiVar.zzm() < zzagiVar.zzo() - 6) {
            return this.zzc.zza;
        }
        zzagiVar.zzk((int) (zzagiVar.zzo() - zzagiVar.zzm()));
        return this.zza.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzafs
    public final zzafr zza(zzagi zzagiVar, long j) throws IOException {
        long zzn = zzagiVar.zzn();
        long zzc = zzc(zzagiVar);
        long zzm = zzagiVar.zzm();
        zzagiVar.zzk(Math.max(6, this.zza.zzc));
        long zzc2 = zzc(zzagiVar);
        return (zzc > j || zzc2 <= j) ? zzc2 <= j ? zzafr.zzb(zzc2, zzagiVar.zzm()) : zzafr.zza(zzc, zzn) : zzafr.zzc(zzm);
    }
}
