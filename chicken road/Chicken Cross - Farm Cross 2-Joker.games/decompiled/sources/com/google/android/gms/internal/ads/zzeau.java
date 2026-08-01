package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeau {
    private final String zze;
    private final zzeao zzf;
    private final List zzb = new ArrayList();
    private boolean zzc = false;
    private boolean zzd = false;
    private final com.google.android.gms.ads.internal.util.zzg zza = com.google.android.gms.ads.internal.zzt.zzh().zzp();

    public zzeau(String str, zzeao zzeaoVar) {
        this.zze = str;
        this.zzf = zzeaoVar;
    }

    private final Map zzg() {
        Map zza = this.zzf.zza();
        zza.put("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime(), 10));
        zza.put("tid", this.zza.zzx() ? "" : this.zze);
        return zza;
    }

    public final synchronized void zza(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcP)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_started");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzb(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcP)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzc(String str, String str2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcP)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "adapter_init_finished");
            zzg.put("ancn", str);
            zzg.put("rqe", str2);
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zzd(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcP)).booleanValue()) {
            Map zzg = zzg();
            zzg.put("action", "aaia");
            zzg.put("aair", "MalformedJson");
            this.zzb.add(zzg);
        }
    }

    public final synchronized void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcP)).booleanValue() && !this.zzc) {
            Map zzg = zzg();
            zzg.put("action", "init_started");
            this.zzb.add(zzg);
            this.zzc = true;
        }
    }

    public final synchronized void zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzcP)).booleanValue() && !this.zzd) {
            Map zzg = zzg();
            zzg.put("action", "init_finished");
            List list = this.zzb;
            list.add(zzg);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.zzf.zzb((Map) it.next());
            }
            this.zzd = true;
        }
    }
}
