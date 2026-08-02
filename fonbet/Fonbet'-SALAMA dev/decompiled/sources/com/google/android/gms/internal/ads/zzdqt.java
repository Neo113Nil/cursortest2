package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import m3.InterfaceC1436a;

/* loaded from: classes.dex */
public final class zzdqt implements zzfff {
    private final zzdqk zzb;
    private final InterfaceC1436a zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdqt(zzdqk zzdqkVar, Set set, InterfaceC1436a interfaceC1436a) {
        zzfey zzfeyVar;
        this.zzb = zzdqkVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdqs zzdqsVar = (zzdqs) it.next();
            Map map = this.zzd;
            zzfeyVar = zzdqsVar.zzc;
            map.put(zzfeyVar, zzdqsVar);
        }
        this.zzc = interfaceC1436a;
    }

    private final void zze(zzfey zzfeyVar, boolean z4) {
        zzfey zzfeyVar2;
        String str;
        zzdqs zzdqsVar = (zzdqs) this.zzd.get(zzfeyVar);
        if (zzdqsVar == null) {
            return;
        }
        String str2 = true != z4 ? "f." : "s.";
        Map map = this.zza;
        zzfeyVar2 = zzdqsVar.zzb;
        if (map.containsKey(zzfeyVar2)) {
            InterfaceC1436a interfaceC1436a = this.zzc;
            Map map2 = this.zza;
            ((m3.b) interfaceC1436a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map2.get(zzfeyVar2)).longValue();
            Map zzb = this.zzb.zzb();
            str = zzdqsVar.zza;
            zzb.put("label.".concat(str), str2 + elapsedRealtime);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzd(zzfey zzfeyVar, String str) {
        if (this.zza.containsKey(zzfeyVar)) {
            InterfaceC1436a interfaceC1436a = this.zzc;
            Map map = this.zza;
            ((m3.b) interfaceC1436a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfeyVar)).longValue();
            zzdqk zzdqkVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdqkVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
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
            InterfaceC1436a interfaceC1436a = this.zzc;
            Map map = this.zza;
            ((m3.b) interfaceC1436a).getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime() - ((Long) map.get(zzfeyVar)).longValue();
            zzdqk zzdqkVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdqkVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfeyVar)) {
            zze(zzfeyVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfff
    public final void zzdC(zzfey zzfeyVar, String str) {
        ((m3.b) this.zzc).getClass();
        this.zza.put(zzfeyVar, Long.valueOf(SystemClock.elapsedRealtime()));
    }
}
