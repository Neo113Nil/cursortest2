package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
/* loaded from: classes4.dex */
public final class zzbfh {
    int zza;
    private final java.lang.Object zzb = new java.lang.Object();
    private final java.util.List zzc = new java.util.LinkedList();

    public final boolean zza(com.google.android.gms.internal.ads.zzbfg zzbfgVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbfgVar);
        }
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzbfg zzbfgVar) {
        synchronized (this.zzb) {
            java.util.Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.ads.zzbfg zzbfgVar2 = (com.google.android.gms.internal.ads.zzbfg) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzh().zzo().zzc()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzo().zze() && !zzbfgVar.equals(zzbfgVar2) && zzbfgVar2.zzc().equals(zzbfgVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbfgVar.equals(zzbfgVar2) && zzbfgVar2.zzb().equals(zzbfgVar.zzb())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbfg zzbfgVar) {
        synchronized (this.zzb) {
            java.util.List list = this.zzc;
            if (list.size() >= 10) {
                int size = list.size();
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(size).length() + 30);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                java.lang.String sb2 = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
                list.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzbfgVar.zzk(i2);
            zzbfgVar.zzh();
            list.add(zzbfgVar);
        }
    }
}
