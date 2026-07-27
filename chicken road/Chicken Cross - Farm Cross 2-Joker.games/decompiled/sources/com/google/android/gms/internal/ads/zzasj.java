package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzasj implements zzagh {
    private final zzeu zza = new zzeu(4);
    private final zzahm zzb = new zzahm(-1, -1, "image/webp");

    @Override // com.google.android.gms.internal.ads.zzagh
    public final boolean zza(zzagi zzagiVar) throws IOException {
        zzeu zzeuVar = this.zza;
        zzeuVar.zza(4);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        if (zzeuVar.zzz() != 1380533830) {
            return false;
        }
        zzagiVar.zzk(4);
        zzeuVar.zza(4);
        zzagiVar.zzi(zzeuVar.zzi(), 0, 4);
        return zzeuVar.zzz() == 1464156752;
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzc(zzagk zzagkVar) {
        this.zzb.zzc(zzagkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final int zzd(zzagi zzagiVar, zzahh zzahhVar) throws IOException {
        return this.zzb.zzd(zzagiVar, zzahhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zze(long j, long j2) {
        this.zzb.zze(j, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzagh
    public final void zzf() {
    }
}
