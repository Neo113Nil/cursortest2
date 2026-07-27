package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzepm {
    private final zzhdr zzc;
    private zzeqc zzf;
    private final String zzh;
    private final int zzi;
    private final zzeqb zzj;
    private zzfld zzk;
    private final Map zza = new HashMap();
    private final List zzb = new ArrayList();
    private final List zzd = new ArrayList();
    private final Set zze = new HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    zzepm(zzflo zzfloVar, zzeqb zzeqbVar, zzhdr zzhdrVar) {
        this.zzi = zzfloVar.zzb.zzb.zzr;
        this.zzj = zzeqbVar;
        this.zzc = zzhdrVar;
        this.zzh = zzeqi.zzb(zzfloVar);
        List list = zzfloVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((zzfld) list.get(i), Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        List list = this.zzb;
        if (!list.isEmpty() && ((zzfld) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            List list2 = this.zzd;
            if (list2.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z) {
        for (zzfld zzfldVar : this.zzb) {
            Integer num = (Integer) this.zza.get(zzfldVar);
            Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
            if (z || !this.zze.contains(zzfldVar.zzat)) {
                if (valueOf.intValue() < this.zzg) {
                    return true;
                }
                if (valueOf.intValue() > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) this.zza.get((zzfld) it.next());
            if (Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE).intValue() < this.zzg) {
                return true;
            }
        }
        return false;
    }

    private final synchronized boolean zzh() {
        if (!zzf(true)) {
            if (!zzg()) {
                return false;
            }
        }
        return true;
    }

    private final synchronized void zzi() {
        this.zzj.zzd(this.zzk);
        zzeqc zzeqcVar = this.zzf;
        if (zzeqcVar != null) {
            this.zzc.zza(zzeqcVar);
        } else {
            this.zzc.zzb(new zzeqf(3, this.zzh));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0025, code lost:
    
        if (r2.zzav == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0027, code lost:
    
        r6.zzl = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (android.text.TextUtils.isEmpty(r3) != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        r6.zzd.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003f, code lost:
    
        return (com.google.android.gms.internal.ads.zzfld) r1.remove(r0);
     */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized zzfld zza() {
        if (zze()) {
            int i = 0;
            while (true) {
                List list = this.zzb;
                if (i >= list.size()) {
                    break;
                }
                zzfld zzfldVar = (zzfld) list.get(i);
                String str = zzfldVar.zzat;
                Set set = this.zze;
                if (!set.contains(str)) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    final synchronized void zzb(zzeqc zzeqcVar, zzfld zzfldVar) {
        this.zzl = false;
        this.zzd.remove(zzfldVar);
        if (zzd()) {
            zzeqcVar.zzm();
            return;
        }
        Integer num = (Integer) this.zza.get(zzfldVar);
        Integer valueOf = Integer.valueOf(num != null ? num.intValue() : Integer.MAX_VALUE);
        if (valueOf.intValue() > this.zzg) {
            this.zzj.zzf(zzfldVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        this.zzg = valueOf.intValue();
        this.zzf = zzeqcVar;
        this.zzk = zzfldVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(Throwable th, zzfld zzfldVar) {
        this.zzl = false;
        this.zzd.remove(zzfldVar);
        this.zze.remove(zzfldVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
