package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzara implements com.google.android.gms.internal.ads.zzaqt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzard zza;
    private final com.google.android.gms.internal.ads.zzes zzb;

    public zzara(com.google.android.gms.internal.ads.zzard zzardVar) {
        java.util.Objects.requireNonNull(zzardVar);
        this.zza = zzardVar;
        this.zzb = new com.google.android.gms.internal.ads.zzes(new byte[4], 4);
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zza(com.google.android.gms.internal.ads.zzfi zzfiVar, com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaqt
    public final void zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        if (zzetVar.zzs() == 0 && (zzetVar.zzs() & 128) != 0) {
            zzetVar.zzk(6);
            int zzd = zzetVar.zzd() / 4;
            for (int i = 0; i < zzd; i++) {
                com.google.android.gms.internal.ads.zzes zzesVar = this.zzb;
                zzetVar.zzl(zzesVar, 4);
                int zzj = zzesVar.zzj(16);
                zzesVar.zzh(3);
                if (zzj == 0) {
                    zzesVar.zzh(13);
                } else {
                    int zzj2 = zzesVar.zzj(13);
                    com.google.android.gms.internal.ads.zzard zzardVar = this.zza;
                    if (zzardVar.zzj().get(zzj2) == null) {
                        zzardVar.zzj().put(zzj2, new com.google.android.gms.internal.ads.zzaqu(new com.google.android.gms.internal.ads.zzarb(zzardVar, zzj2)));
                        zzardVar.zzo(zzardVar.zzn() + 1);
                    }
                }
            }
            this.zza.zzj().remove(0);
        }
    }
}
