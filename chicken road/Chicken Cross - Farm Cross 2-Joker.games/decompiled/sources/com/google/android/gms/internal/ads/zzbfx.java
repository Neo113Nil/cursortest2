package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbfx {
    int zza;
    private final Object zzb = new Object();
    private final List zzc = new LinkedList();

    public final boolean zza(zzbfw zzbfwVar) {
        synchronized (this.zzb) {
            return this.zzc.contains(zzbfwVar);
        }
    }

    public final boolean zzb(zzbfw zzbfwVar) {
        synchronized (this.zzb) {
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                zzbfw zzbfwVar2 = (zzbfw) it.next();
                if (com.google.android.gms.ads.internal.zzt.zzh().zzp().zzc()) {
                    if (!com.google.android.gms.ads.internal.zzt.zzh().zzp().zze() && !zzbfwVar.equals(zzbfwVar2) && zzbfwVar2.zzc().equals(zzbfwVar.zzc())) {
                        it.remove();
                        return true;
                    }
                } else if (!zzbfwVar.equals(zzbfwVar2) && zzbfwVar2.zzb().equals(zzbfwVar.zzb())) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    public final void zzc(zzbfw zzbfwVar) {
        synchronized (this.zzb) {
            List list = this.zzc;
            if (list.size() >= 10) {
                int size = list.size();
                StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                sb.append("Queue is full, current size = ");
                sb.append(size);
                String sb2 = sb.toString();
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd(sb2);
                list.remove(0);
            }
            int i2 = this.zza;
            this.zza = i2 + 1;
            zzbfwVar.zzk(i2);
            zzbfwVar.zzh();
            list.add(zzbfwVar);
        }
    }
}
