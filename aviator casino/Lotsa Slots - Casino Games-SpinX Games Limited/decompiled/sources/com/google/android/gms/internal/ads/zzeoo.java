package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeoo {
    private final com.google.android.gms.internal.ads.zzhcp zzc;
    private com.google.android.gms.internal.ads.zzepe zzf;
    private final java.lang.String zzh;
    private final int zzi;
    private final com.google.android.gms.internal.ads.zzepd zzj;
    private com.google.android.gms.internal.ads.zzfkf zzk;
    private final java.util.Map zza = new java.util.HashMap();
    private final java.util.List zzb = new java.util.ArrayList();
    private final java.util.List zzd = new java.util.ArrayList();
    private final java.util.Set zze = new java.util.HashSet();
    private int zzg = Integer.MAX_VALUE;
    private boolean zzl = false;

    zzeoo(com.google.android.gms.internal.ads.zzfkq zzfkqVar, com.google.android.gms.internal.ads.zzepd zzepdVar, com.google.android.gms.internal.ads.zzhcp zzhcpVar) {
        this.zzi = zzfkqVar.zzb.zzb.zzr;
        this.zzj = zzepdVar;
        this.zzc = zzhcpVar;
        this.zzh = com.google.android.gms.internal.ads.zzepk.zzb(zzfkqVar);
        java.util.List list = zzfkqVar.zzb.zza;
        for (int i = 0; i < list.size(); i++) {
            this.zza.put((com.google.android.gms.internal.ads.zzfkf) list.get(i), java.lang.Integer.valueOf(i));
        }
        this.zzb.addAll(list);
    }

    private final synchronized boolean zze() {
        if (this.zzl) {
            return false;
        }
        java.util.List list = this.zzb;
        if (!list.isEmpty() && ((com.google.android.gms.internal.ads.zzfkf) list.get(0)).zzav && !this.zzd.isEmpty()) {
            return false;
        }
        if (!zzd()) {
            java.util.List list2 = this.zzd;
            if (list2.size() < this.zzi) {
                if (zzf(false)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzf(boolean z) {
        for (com.google.android.gms.internal.ads.zzfkf zzfkfVar : this.zzb) {
            java.lang.Integer num = (java.lang.Integer) this.zza.get(zzfkfVar);
            int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            if (z || !this.zze.contains(zzfkfVar.zzat)) {
                valueOf.getClass();
                if (intValue < this.zzg) {
                    return true;
                }
                valueOf.getClass();
                if (intValue > this.zzg) {
                    break;
                }
            }
        }
        return false;
    }

    private final synchronized boolean zzg() {
        java.util.Iterator it = this.zzd.iterator();
        while (it.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) this.zza.get((com.google.android.gms.internal.ads.zzfkf) it.next());
            int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
            java.lang.Integer.valueOf(intValue).getClass();
            if (intValue < this.zzg) {
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
        com.google.android.gms.internal.ads.zzepe zzepeVar = this.zzf;
        if (zzepeVar != null) {
            this.zzc.zza(zzepeVar);
        } else {
            this.zzc.zzb(new com.google.android.gms.internal.ads.zzeph(3, this.zzh));
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
    
        return (com.google.android.gms.internal.ads.zzfkf) r1.remove(r0);
     */
    @javax.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final synchronized com.google.android.gms.internal.ads.zzfkf zza() {
        if (zze()) {
            int i = 0;
            while (true) {
                java.util.List list = this.zzb;
                if (i >= list.size()) {
                    break;
                }
                com.google.android.gms.internal.ads.zzfkf zzfkfVar = (com.google.android.gms.internal.ads.zzfkf) list.get(i);
                java.lang.String str = zzfkfVar.zzat;
                java.util.Set set = this.zze;
                if (!set.contains(str)) {
                    break;
                }
                i++;
            }
        }
        return null;
    }

    final synchronized void zzb(com.google.android.gms.internal.ads.zzepe zzepeVar, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zzl = false;
        this.zzd.remove(zzfkfVar);
        if (zzd()) {
            zzepeVar.zzm();
            return;
        }
        java.lang.Integer num = (java.lang.Integer) this.zza.get(zzfkfVar);
        int intValue = num != null ? num.intValue() : Integer.MAX_VALUE;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        valueOf.getClass();
        if (intValue > this.zzg) {
            this.zzj.zzf(zzfkfVar);
            return;
        }
        if (this.zzf != null) {
            this.zzj.zzf(this.zzk);
        }
        valueOf.getClass();
        this.zzg = intValue;
        this.zzf = zzepeVar;
        this.zzk = zzfkfVar;
        if (zzh()) {
            return;
        }
        zzi();
    }

    final synchronized void zzc(java.lang.Throwable th, com.google.android.gms.internal.ads.zzfkf zzfkfVar) {
        this.zzl = false;
        this.zzd.remove(zzfkfVar);
        this.zze.remove(zzfkfVar.zzat);
        if (zzd() || zzh()) {
            return;
        }
        zzi();
    }

    final synchronized boolean zzd() {
        return this.zzc.isDone();
    }
}
