package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzeam implements zzfqj {
    private final zzeae zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzeam(zzeae zzeaeVar, Set set, Clock clock) {
        this.zzb = zzeaeVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzeal zzealVar = (zzeal) it.next();
            this.zzd.put(zzealVar.zzc(), zzealVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfqc zzfqcVar, boolean z) {
        zzeal zzealVar = (zzeal) this.zzd.get(zzfqcVar);
        if (zzealVar == null) {
            return;
        }
        String str = true != z ? "f." : "s.";
        Map map = this.zza;
        zzfqc zzb = zzealVar.zzb();
        if (map.containsKey(zzb)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzb)).longValue();
            zzeae zzeaeVar = this.zzb;
            String zza = zzealVar.zza();
            Map zzc = zzeaeVar.zzc();
            StringBuilder sb = new StringBuilder(String.valueOf(elapsedRealtime).length() + 2);
            sb.append(str);
            sb.append(elapsedRealtime);
            zzc.put("label.".concat(zza), sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdL(zzfqc zzfqcVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdM(zzfqc zzfqcVar, String str) {
        this.zza.put(zzfqcVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdN(zzfqc zzfqcVar, String str, Throwable th) {
        Map map = this.zza;
        if (map.containsKey(zzfqcVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfqcVar)).longValue();
            Map zzc = this.zzb.zzc();
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            String l = Long.toString(elapsedRealtime);
            String.valueOf(l);
            zzc.put("task.".concat(valueOf), "f.".concat(String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfqcVar)) {
            zze(zzfqcVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfqj
    public final void zzdO(zzfqc zzfqcVar, String str) {
        Map map = this.zza;
        if (map.containsKey(zzfqcVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) map.get(zzfqcVar)).longValue();
            Map zzc = this.zzb.zzc();
            String.valueOf(str);
            String valueOf = String.valueOf(str);
            String l = Long.toString(elapsedRealtime);
            String.valueOf(l);
            zzc.put("task.".concat(valueOf), "s.".concat(String.valueOf(l)));
        }
        if (this.zzd.containsKey(zzfqcVar)) {
            zze(zzfqcVar, true);
        }
    }
}
