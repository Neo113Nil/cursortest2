package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeao {
    private final java.util.Map zza = new java.util.concurrent.ConcurrentHashMap();

    zzeao() {
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0099 A[Catch: all -> 0x015e, TryCatch #0 {, blocks: (B:3:0x0001, B:11:0x0019, B:13:0x0032, B:15:0x0038, B:17:0x0041, B:19:0x0045, B:26:0x0063, B:28:0x0099, B:30:0x00a3, B:31:0x00ab, B:32:0x00b2, B:34:0x00b8, B:36:0x00bc, B:38:0x00d1, B:39:0x00da, B:41:0x00e0, B:44:0x00ee, B:47:0x00f4, B:48:0x0106, B:50:0x010c, B:53:0x011e, B:56:0x0126, B:68:0x0137, B:71:0x013f, B:74:0x0145, B:77:0x014e, B:86:0x0157, B:89:0x0074, B:90:0x0085), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zza(long j, int i, long j2) {
        int i2;
        java.util.ArrayDeque arrayDeque;
        java.lang.Long l;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziK)).booleanValue()) {
            if (i == 2) {
                com.google.android.gms.internal.ads.zzeam zzeamVar = new com.google.android.gms.internal.ads.zzeam();
                zzeamVar.zza(j);
                zzeamVar.zzb(1);
                com.google.android.gms.internal.ads.zzear zzc = zzeamVar.zzc();
                java.util.Map map = this.zza;
                java.util.ArrayDeque arrayDeque2 = (java.util.ArrayDeque) map.get(zzc);
                if (arrayDeque2 != null && !arrayDeque2.isEmpty()) {
                    arrayDeque2.removeFirst();
                    if (arrayDeque2.isEmpty()) {
                        map.remove(zzc);
                    }
                }
                i = 2;
            }
            com.google.android.gms.internal.ads.zzeam zzeamVar2 = new com.google.android.gms.internal.ads.zzeam();
            zzeamVar2.zza(j);
            zzeamVar2.zzb(i);
            com.google.android.gms.internal.ads.zzear zzc2 = zzeamVar2.zzc();
            int zzb = zzc2.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    i2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziR)).intValue();
                } else if (zzb == 2) {
                    i2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziS)).intValue();
                } else if (zzb == 3) {
                    i2 = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziT)).intValue();
                }
                if (i2 > 0) {
                    java.util.Map map2 = this.zza;
                    java.util.ArrayDeque arrayDeque3 = (java.util.ArrayDeque) map2.get(zzc2);
                    if (arrayDeque3 == null) {
                        arrayDeque3 = new java.util.ArrayDeque();
                        map2.put(zzc2, arrayDeque3);
                    }
                    arrayDeque3.addLast(java.lang.Long.valueOf(j2));
                    while (arrayDeque3.size() > i2) {
                        arrayDeque3.removeFirst();
                    }
                    zzc();
                    int intValue = ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziU)).intValue();
                    if (intValue <= 0) {
                        map2.clear();
                        return;
                    }
                    while (true) {
                        java.util.Iterator it = map2.values().iterator();
                        int i3 = 0;
                        while (it.hasNext()) {
                            i3 += ((java.util.ArrayDeque) it.next()).size();
                        }
                        if (i3 <= intValue) {
                            break;
                        }
                        if (!map2.isEmpty()) {
                            java.lang.Long l2 = Long.MAX_VALUE;
                            java.util.Map.Entry entry = null;
                            for (java.util.Map.Entry entry2 : map2.entrySet()) {
                                java.util.ArrayDeque arrayDeque4 = (java.util.ArrayDeque) entry2.getValue();
                                if (!arrayDeque4.isEmpty() && (l = (java.lang.Long) arrayDeque4.peekFirst()) != null && l.longValue() < l2.longValue()) {
                                    entry = entry2;
                                    l2 = l;
                                }
                            }
                            if (entry != null && (arrayDeque = (java.util.ArrayDeque) entry.getValue()) != null && !arrayDeque.isEmpty()) {
                                arrayDeque.removeFirst();
                                if (arrayDeque.isEmpty()) {
                                    map2.remove(entry.getKey());
                                }
                            }
                        }
                    }
                }
            }
            i2 = 0;
            if (i2 > 0) {
            }
        }
    }

    public final synchronized java.util.Map zzb() {
        java.util.HashMap hashMap;
        hashMap = new java.util.HashMap();
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziK)).booleanValue()) {
            zzc();
            for (java.util.Map.Entry entry : this.zza.entrySet()) {
                hashMap.put((com.google.android.gms.internal.ads.zzear) entry.getKey(), new java.util.ArrayDeque((java.util.Collection) entry.getValue()));
            }
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzc() {
        long j;
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
        java.util.Iterator it = this.zza.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            com.google.android.gms.internal.ads.zzear zzearVar = (com.google.android.gms.internal.ads.zzear) entry.getKey();
            java.util.ArrayDeque arrayDeque = (java.util.ArrayDeque) entry.getValue();
            int zzb = zzearVar.zzb();
            if (zzb != 0) {
                if (zzb == 1) {
                    j = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziO)).longValue();
                } else if (zzb == 2) {
                    j = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziP)).longValue();
                } else if (zzb == 3) {
                    j = ((java.lang.Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zziQ)).longValue();
                }
                if (j == 0) {
                    it.remove();
                    j = 0;
                }
                if (j <= 0) {
                    java.util.Iterator it2 = arrayDeque.iterator();
                    while (it2.hasNext() && currentTimeMillis - ((java.lang.Long) it2.next()).longValue() > j) {
                        it2.remove();
                    }
                    if (arrayDeque.isEmpty()) {
                        it.remove();
                    }
                }
            }
            j = 0;
            if (j == 0) {
            }
            if (j <= 0) {
            }
        }
    }
}
