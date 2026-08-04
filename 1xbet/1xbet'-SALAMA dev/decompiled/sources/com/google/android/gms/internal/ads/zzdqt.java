package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class zzdqt implements zzfff {
    private final zzdqk zzb;
    private final p090m3.a zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdqt(zzdqk zzdqkVar, Set set, p090m3.a aVar) {
        this.zzb = zzdqkVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdqs zzdqsVar = (zzdqs) it.next();
            this.zzd.put(zzdqsVar.zzc, zzdqsVar);
        }
        this.zzc = aVar;
    }

    private final void zze(zzfey zzfeyVar, boolean z4) {
        zzdqs zzdqsVar = (zzdqs) this.zzd.get(zzfeyVar);
        if (zzdqsVar == null) {
            return;
        }
        String str = true != z4 ? "f." : "s.";
        Map map = this.zza;
        zzfey zzfeyVar2 = zzdqsVar.zzb;
        if (map.containsKey(zzfeyVar2)) {
            p090m3.a aVar = this.zzc;
            Map map2 = this.zza;
            ((p090m3.b) aVar).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map2.get(zzfeyVar2)).longValue();
            this.zzb.zzb().put("label.".concat(zzdqsVar.zza), str + jElapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzd(zzfey zzfeyVar, String str) {
        if (this.zza.containsKey(zzfeyVar)) {
            p090m3.a aVar = this.zzc;
            Map map = this.zza;
            ((p090m3.b) aVar).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfeyVar)).longValue();
            zzdqk zzdqkVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdqkVar.zzb().put("task.".concat(strValueOf), "s.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfeyVar)) {
            zze(zzfeyVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdA(zzfey zzfeyVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdB(zzfey zzfeyVar, String str, Throwable th) {
        if (this.zza.containsKey(zzfeyVar)) {
            p090m3.a aVar = this.zzc;
            Map map = this.zza;
            ((p090m3.b) aVar).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfeyVar)).longValue();
            zzdqk zzdqkVar = this.zzb;
            String strValueOf = String.valueOf(str);
            zzdqkVar.zzb().put("task.".concat(strValueOf), "f.".concat(String.valueOf(Long.toString(jElapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfeyVar)) {
            zze(zzfeyVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdC(zzfey zzfeyVar, String str) {
        ((p090m3.b) this.zzc).getClass();
        this.zza.put(zzfeyVar, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
