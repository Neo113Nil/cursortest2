package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzmv {
    private final zzqj zza;
    private final zzabu zzb;
    private final zzmu zzf;
    private final zznq zzi;
    private final zzea zzj;
    private boolean zzk;
    private zzzj zzl = new zzzj(0);
    private final IdentityHashMap zzd = new IdentityHashMap();
    private final Map zze = new HashMap();
    private final List zzc = new ArrayList();
    private final HashMap zzg = new HashMap();
    private final Set zzh = new HashSet();

    public zzmv(zzmu zzmuVar, zznq zznqVar, zzea zzeaVar, zzqj zzqjVar, zzabu zzabuVar) {
        this.zza = zzqjVar;
        this.zzb = zzabuVar;
        this.zzf = zzmuVar;
        this.zzi = zznqVar;
        this.zzj = zzeaVar;
    }

    private final void zzr() {
        Iterator it = this.zzh.iterator();
        while (it.hasNext()) {
            zzms zzmsVar = (zzms) it.next();
            if (zzmsVar.zzc.isEmpty()) {
                zzs(zzmsVar);
                it.remove();
            }
        }
    }

    private final void zzs(zzms zzmsVar) {
        zzmr zzmrVar = (zzmr) this.zzg.get(zzmsVar);
        if (zzmrVar != null) {
            zzmrVar.zza.zzs(zzmrVar.zzb);
        }
    }

    private final void zzt(int i, int i2) {
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            zzms zzmsVar = (zzms) this.zzc.remove(i2);
            this.zze.remove(zzmsVar.zzb);
            zzu(i2, -zzmsVar.zza.zzA().zza());
            zzmsVar.zze = true;
            if (this.zzk) {
                zzw(zzmsVar);
            }
        }
    }

    private final void zzu(int i, int i2) {
        while (true) {
            List list = this.zzc;
            if (i >= list.size()) {
                return;
            }
            ((zzms) list.get(i)).zzd += i2;
            i++;
        }
    }

    private final void zzv(zzms zzmsVar) {
        zzxj zzxjVar = zzmsVar.zza;
        zzxp zzxpVar = new zzxp() { // from class: com.google.android.gms.internal.ads.zzmt
            @Override // com.google.android.gms.internal.ads.zzxp
            public final /* synthetic */ void zza(zzxq zzxqVar, zzbf zzbfVar) {
                zzmv.this.zzi(zzxqVar, zzbfVar);
            }
        };
        zzmq zzmqVar = new zzmq(this, zzmsVar);
        this.zzg.put(zzmsVar, new zzmr(zzxjVar, zzxpVar, zzmqVar));
        zzxjVar.zzm(new Handler(zzfm.zzf(), null), zzmqVar);
        zzxjVar.zzo(new Handler(zzfm.zzf(), null), zzmqVar);
        zzxjVar.zzq(zzxpVar, this.zza, this.zzb);
    }

    private final void zzw(zzms zzmsVar) {
        if (zzmsVar.zze && zzmsVar.zzc.isEmpty()) {
            zzmr zzmrVar = (zzmr) this.zzg.remove(zzmsVar);
            zzmrVar.getClass();
            zzxq zzxqVar = zzmrVar.zza;
            zzxqVar.zzt(zzmrVar.zzb);
            zzmq zzmqVar = zzmrVar.zzc;
            zzxqVar.zzn(zzmqVar);
            zzxqVar.zzp(zzmqVar);
            this.zzh.remove(zzmsVar);
        }
    }

    public final zzbf zza(int i, int i2, List list) {
        zzguk.zza(i >= 0 && i <= i2 && i2 <= zzc());
        zzguk.zza(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((zzms) this.zzc.get(i3)).zza.zzB((zzak) list.get(i3 - i));
        }
        return zzh();
    }

    public final boolean zzb() {
        return this.zzk;
    }

    public final int zzc() {
        return this.zzc.size();
    }

    public final void zzd() {
        zzguk.zzi(!this.zzk);
        int i = 0;
        while (true) {
            List list = this.zzc;
            if (i >= list.size()) {
                this.zzk = true;
                return;
            }
            zzms zzmsVar = (zzms) list.get(i);
            zzv(zzmsVar);
            this.zzh.add(zzmsVar);
            i++;
        }
    }

    public final zzxm zze(zzxo zzxoVar, zzabp zzabpVar, long j) {
        int i = zznc.zzb;
        Pair pair = (Pair) zzxoVar.zza;
        Object obj = pair.first;
        zzxo zza = zzxoVar.zza(pair.second);
        zzms zzmsVar = (zzms) this.zze.get(obj);
        zzmsVar.getClass();
        this.zzh.add(zzmsVar);
        zzmr zzmrVar = (zzmr) this.zzg.get(zzmsVar);
        if (zzmrVar != null) {
            zzmrVar.zza.zzr(zzmrVar.zzb);
        }
        zzmsVar.zzc.add(zza);
        zzxg zzH = zzmsVar.zza.zzH(zza, zzabpVar, j);
        this.zzd.put(zzH, zzmsVar);
        zzr();
        return zzH;
    }

    public final void zzf(zzxm zzxmVar) {
        IdentityHashMap identityHashMap = this.zzd;
        zzms zzmsVar = (zzms) identityHashMap.remove(zzxmVar);
        zzmsVar.getClass();
        zzmsVar.zza.zzE(zzxmVar);
        zzmsVar.zzc.remove(((zzxg) zzxmVar).zza);
        if (!identityHashMap.isEmpty()) {
            zzr();
        }
        zzw(zzmsVar);
    }

    public final void zzg() {
        for (zzmr zzmrVar : this.zzg.values()) {
            try {
                zzmrVar.zza.zzt(zzmrVar.zzb);
            } catch (RuntimeException e) {
                zzeh.zzf("MediaSourceList", "Failed to release child source.", e);
            }
            zzxq zzxqVar = zzmrVar.zza;
            zzmq zzmqVar = zzmrVar.zzc;
            zzxqVar.zzn(zzmqVar);
            zzxqVar.zzp(zzmqVar);
        }
        this.zzg.clear();
        this.zzh.clear();
        this.zzk = false;
    }

    public final zzbf zzh() {
        List list = this.zzc;
        if (list.isEmpty()) {
            return zzbf.zza;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzms zzmsVar = (zzms) list.get(i2);
            zzmsVar.zzd = i;
            i += zzmsVar.zza.zzA().zza();
        }
        return new zznc(list, this.zzl);
    }

    final /* synthetic */ void zzi(zzxq zzxqVar, zzbf zzbfVar) {
        this.zzf.zzo();
    }

    final /* synthetic */ zznq zzj() {
        return this.zzi;
    }

    final /* synthetic */ zzea zzk() {
        return this.zzj;
    }

    public final zzbf zzl(List list, zzzj zzzjVar) {
        List list2 = this.zzc;
        zzt(0, list2.size());
        return zzm(list2.size(), list, zzzjVar);
    }

    public final zzbf zzm(int i, List list, zzzj zzzjVar) {
        if (!list.isEmpty()) {
            this.zzl = zzzjVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                zzms zzmsVar = (zzms) list.get(i2 - i);
                if (i2 > 0) {
                    zzms zzmsVar2 = (zzms) this.zzc.get(i2 - 1);
                    zzmsVar.zzc(zzmsVar2.zzd + zzmsVar2.zza.zzA().zza());
                } else {
                    zzmsVar.zzc(0);
                }
                zzu(i2, zzmsVar.zza.zzA().zza());
                this.zzc.add(i2, zzmsVar);
                this.zze.put(zzmsVar.zzb, zzmsVar);
                if (this.zzk) {
                    zzv(zzmsVar);
                    if (this.zzd.isEmpty()) {
                        this.zzh.add(zzmsVar);
                    } else {
                        zzs(zzmsVar);
                    }
                }
            }
        }
        return zzh();
    }

    public final zzbf zzn(int i, int i2, zzzj zzzjVar) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= zzc()) {
            z = true;
        }
        zzguk.zza(z);
        this.zzl = zzzjVar;
        zzt(i, i2);
        return zzh();
    }

    public final zzbf zzo(int i, int i2, int i3, zzzj zzzjVar) {
        zzguk.zza(zzc() >= 0);
        this.zzl = null;
        return zzh();
    }

    public final zzbf zzp(zzzj zzzjVar) {
        int zzc = zzc();
        if (zzzjVar.zza() != zzc) {
            zzzjVar = zzzjVar.zzg().zzf(0, zzc);
        }
        this.zzl = zzzjVar;
        return zzh();
    }

    public final zzzj zzq() {
        return this.zzl;
    }
}
