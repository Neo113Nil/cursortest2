package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfmo implements com.google.android.gms.internal.ads.zzfmn {
    private final java.util.concurrent.ConcurrentHashMap zza;
    private final com.google.android.gms.internal.ads.zzfmu zzb;
    private final com.google.android.gms.internal.ads.zzfmq zzc = new com.google.android.gms.internal.ads.zzfmq();

    public zzfmo(com.google.android.gms.internal.ads.zzfmu zzfmuVar) {
        this.zza = new java.util.concurrent.ConcurrentHashMap(zzfmuVar.zzd);
        this.zzb = zzfmuVar;
    }

    private final void zzf() {
        android.os.Parcelable.Creator<com.google.android.gms.internal.ads.zzfmu> creator = com.google.android.gms.internal.ads.zzfmu.CREATOR;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhn)).booleanValue()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            com.google.android.gms.internal.ads.zzfmu zzfmuVar = this.zzb;
            sb.append(zzfmuVar.zzb);
            sb.append(" PoolCollection");
            sb.append(this.zzc.zzg());
            int i = 0;
            for (java.util.Map.Entry entry : this.zza.entrySet()) {
                i++;
                sb.append(i);
                sb.append(". ");
                sb.append(entry.getValue());
                sb.append("#");
                sb.append(((com.google.android.gms.internal.ads.zzfmx) entry.getKey()).hashCode());
                sb.append("    ");
                for (int i2 = 0; i2 < ((com.google.android.gms.internal.ads.zzfmm) entry.getValue()).zzc(); i2++) {
                    sb.append("[O]");
                }
                for (int zzc = ((com.google.android.gms.internal.ads.zzfmm) entry.getValue()).zzc(); zzc < zzfmuVar.zzd; zzc++) {
                    sb.append("[ ]");
                }
                sb.append("\n");
                sb.append(((com.google.android.gms.internal.ads.zzfmm) entry.getValue()).zzg());
                sb.append("\n");
            }
            while (i < zzfmuVar.zzc) {
                i++;
                sb.append(i);
                sb.append(".\n");
            }
            java.lang.String sb2 = sb.toString();
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final synchronized com.google.android.gms.internal.ads.zzfmw zza(com.google.android.gms.internal.ads.zzfmx zzfmxVar) {
        com.google.android.gms.internal.ads.zzfmw zzfmwVar;
        com.google.android.gms.internal.ads.zzfmm zzfmmVar = (com.google.android.gms.internal.ads.zzfmm) this.zza.get(zzfmxVar);
        if (zzfmmVar != null) {
            zzfmwVar = zzfmmVar.zzb();
            if (zzfmwVar == null) {
                this.zzc.zzb();
            }
            com.google.android.gms.internal.ads.zzfnk zzh = zzfmmVar.zzh();
            if (zzfmwVar != null) {
                com.google.android.gms.internal.ads.zzbhv.zzb.zzc zzs = com.google.android.gms.internal.ads.zzbhv.zzb.zzs();
                com.google.android.gms.internal.ads.zzbhv.zzb.zza.C0071zza zzs2 = com.google.android.gms.internal.ads.zzbhv.zzb.zza.zzs();
                zzs2.zzc(com.google.android.gms.internal.ads.zzbhv.zzb.zzd.IN_MEMORY);
                com.google.android.gms.internal.ads.zzbhv.zzb.zze.zza zzq = com.google.android.gms.internal.ads.zzbhv.zzb.zze.zzq();
                zzq.zzc(zzh.zza);
                zzq.zzg(zzh.zzb);
                zzs2.zzh(zzq);
                zzs.zzh(zzs2);
                zzfmwVar.zza.zza().zzd().zzj(zzs.zzbu());
            }
            zzf();
        } else {
            this.zzc.zza();
            zzf();
            zzfmwVar = null;
        }
        return zzfmwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final synchronized boolean zzb(com.google.android.gms.internal.ads.zzfmx zzfmxVar, com.google.android.gms.internal.ads.zzfmw zzfmwVar) {
        boolean zza;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zza;
        com.google.android.gms.internal.ads.zzfmm zzfmmVar = (com.google.android.gms.internal.ads.zzfmm) concurrentHashMap.get(zzfmxVar);
        zzfmwVar.zzd = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        if (zzfmmVar == null) {
            com.google.android.gms.internal.ads.zzfmu zzfmuVar = this.zzb;
            com.google.android.gms.internal.ads.zzfmm zzfmmVar2 = new com.google.android.gms.internal.ads.zzfmm(zzfmuVar.zzd, zzfmuVar.zze * 1000);
            if (concurrentHashMap.size() == zzfmuVar.zzc) {
                int i = zzfmuVar.zzg;
                int i2 = i - 1;
                com.google.android.gms.internal.ads.zzfmx zzfmxVar2 = null;
                if (i == 0) {
                    throw null;
                }
                long j = Long.MAX_VALUE;
                if (i2 == 0) {
                    for (java.util.Map.Entry entry : concurrentHashMap.entrySet()) {
                        if (((com.google.android.gms.internal.ads.zzfmm) entry.getValue()).zzd() < j) {
                            j = ((com.google.android.gms.internal.ads.zzfmm) entry.getValue()).zzd();
                            zzfmxVar2 = (com.google.android.gms.internal.ads.zzfmx) entry.getKey();
                        }
                    }
                    if (zzfmxVar2 != null) {
                        concurrentHashMap.remove(zzfmxVar2);
                    }
                } else if (i2 == 1) {
                    for (java.util.Map.Entry entry2 : concurrentHashMap.entrySet()) {
                        if (((com.google.android.gms.internal.ads.zzfmm) entry2.getValue()).zze() < j) {
                            j = ((com.google.android.gms.internal.ads.zzfmm) entry2.getValue()).zze();
                            zzfmxVar2 = (com.google.android.gms.internal.ads.zzfmx) entry2.getKey();
                        }
                    }
                    if (zzfmxVar2 != null) {
                        concurrentHashMap.remove(zzfmxVar2);
                    }
                } else if (i2 == 2) {
                    int i3 = Integer.MAX_VALUE;
                    for (java.util.Map.Entry entry3 : concurrentHashMap.entrySet()) {
                        if (((com.google.android.gms.internal.ads.zzfmm) entry3.getValue()).zzf() < i3) {
                            i3 = ((com.google.android.gms.internal.ads.zzfmm) entry3.getValue()).zzf();
                            zzfmxVar2 = (com.google.android.gms.internal.ads.zzfmx) entry3.getKey();
                        }
                    }
                    if (zzfmxVar2 != null) {
                        concurrentHashMap.remove(zzfmxVar2);
                    }
                }
                this.zzc.zzd();
            }
            concurrentHashMap.put(zzfmxVar, zzfmmVar2);
            this.zzc.zzc();
            zzfmmVar = zzfmmVar2;
        }
        zza = zzfmmVar.zza(zzfmwVar);
        com.google.android.gms.internal.ads.zzfmq zzfmqVar = this.zzc;
        zzfmqVar.zze();
        com.google.android.gms.internal.ads.zzfmp zzf = zzfmqVar.zzf();
        com.google.android.gms.internal.ads.zzfnk zzh = zzfmmVar.zzh();
        if (zzfmwVar != null) {
            com.google.android.gms.internal.ads.zzbhv.zzb.zzc zzs = com.google.android.gms.internal.ads.zzbhv.zzb.zzs();
            com.google.android.gms.internal.ads.zzbhv.zzb.zza.C0071zza zzs2 = com.google.android.gms.internal.ads.zzbhv.zzb.zza.zzs();
            zzs2.zzc(com.google.android.gms.internal.ads.zzbhv.zzb.zzd.IN_MEMORY);
            com.google.android.gms.internal.ads.zzbhv.zzb.zzg.zza zzs3 = com.google.android.gms.internal.ads.zzbhv.zzb.zzg.zzs();
            zzs3.zzc(zzf.zza);
            zzs3.zzg(zzf.zzb);
            zzs3.zzk(zzh.zzb);
            zzs2.zzn(zzs3);
            zzs.zzh(zzs2);
            zzfmwVar.zza.zza().zzd().zzk(zzs.zzbu());
        }
        zzf();
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final synchronized boolean zzc(com.google.android.gms.internal.ads.zzfmx zzfmxVar) {
        com.google.android.gms.internal.ads.zzfmm zzfmmVar = (com.google.android.gms.internal.ads.zzfmm) this.zza.get(zzfmxVar);
        if (zzfmmVar == null) {
            return true;
        }
        return zzfmmVar.zzc() < this.zzb.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    @java.lang.Deprecated
    public final com.google.android.gms.internal.ads.zzfmx zzd(com.google.android.gms.ads.internal.client.zzm zzmVar, java.lang.String str, com.google.android.gms.ads.internal.client.zzx zzxVar) {
        com.google.android.gms.internal.ads.zzfmu zzfmuVar = this.zzb;
        return new com.google.android.gms.internal.ads.zzfmy(zzmVar, str, new com.google.android.gms.internal.ads.zzcbg(zzfmuVar.zza).zza().zzj, zzfmuVar.zzf, zzxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzfmn
    public final com.google.android.gms.internal.ads.zzfmu zze() {
        return this.zzb;
    }
}
