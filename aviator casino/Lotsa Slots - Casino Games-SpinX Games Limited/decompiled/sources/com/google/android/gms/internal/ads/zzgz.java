package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgz {
    private final com.google.android.gms.internal.ads.zzgy zza;
    private final java.util.ArrayDeque zzb = new java.util.ArrayDeque();
    private final java.util.ArrayDeque zzc = new java.util.ArrayDeque();
    private final java.util.PriorityQueue zzd = new java.util.PriorityQueue();
    private int zze = -1;
    private com.google.android.gms.internal.ads.zzgx zzf;

    public zzgz(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        this.zza = zzgyVar;
    }

    private final void zzf(int i) {
        java.util.List list;
        while (true) {
            java.util.PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i) {
                return;
            }
            com.google.android.gms.internal.ads.zzgx zzgxVar = (com.google.android.gms.internal.ads.zzgx) priorityQueue.poll();
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            int i2 = 0;
            while (true) {
                list = zzgxVar.zza;
                if (i2 >= list.size()) {
                    break;
                }
                this.zza.zza(zzgxVar.zzb, (com.google.android.gms.internal.ads.zzet) list.get(i2));
                this.zzb.push((com.google.android.gms.internal.ads.zzet) list.get(i2));
                i2++;
            }
            list.clear();
            com.google.android.gms.internal.ads.zzgx zzgxVar2 = this.zzf;
            if (zzgxVar2 != null && zzgxVar2.zzb == zzgxVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzgxVar);
        }
    }

    public final void zza(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzi(i >= 0);
        this.zze = i;
        zzf(i);
    }

    public final int zzb() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzc(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
        if (j != -9223372036854775807L) {
            int i = this.zze;
            if (i != 0) {
                if (i != -1) {
                    java.util.PriorityQueue priorityQueue = this.zzd;
                    if (priorityQueue.size() >= this.zze) {
                        com.google.android.gms.internal.ads.zzgx zzgxVar = (com.google.android.gms.internal.ads.zzgx) priorityQueue.peek();
                        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
                    }
                }
                java.util.ArrayDeque arrayDeque = this.zzb;
                com.google.android.gms.internal.ads.zzet zzetVar2 = arrayDeque.isEmpty() ? new com.google.android.gms.internal.ads.zzet() : (com.google.android.gms.internal.ads.zzet) arrayDeque.pop();
                zzetVar2.zza(zzetVar.zzd());
                java.lang.System.arraycopy(zzetVar.zzi(), zzetVar.zzg(), zzetVar2.zzi(), 0, zzetVar2.zzd());
                com.google.android.gms.internal.ads.zzgx zzgxVar2 = this.zzf;
                if (zzgxVar2 != null && j == zzgxVar2.zzb) {
                    zzgxVar2.zza.add(zzetVar2);
                    return;
                }
                java.util.ArrayDeque arrayDeque2 = this.zzc;
                com.google.android.gms.internal.ads.zzgx zzgxVar3 = arrayDeque2.isEmpty() ? new com.google.android.gms.internal.ads.zzgx() : (com.google.android.gms.internal.ads.zzgx) arrayDeque2.pop();
                java.util.List list = zzgxVar3.zza;
                com.google.android.gms.internal.ads.zzgtj.zzi(list.isEmpty());
                zzgxVar3.zzb = j;
                list.add(zzetVar2);
                this.zzd.add(zzgxVar3);
                this.zzf = zzgxVar3;
                int i2 = this.zze;
                if (i2 != -1) {
                    zzf(i2);
                    return;
                }
                return;
            }
        } else {
            j = -9223372036854775807L;
        }
        this.zza.zza(j, zzetVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
