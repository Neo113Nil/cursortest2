package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.List;
import java.util.PriorityQueue;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhc {
    private final zzhb zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzha zzf;

    public zzhc(zzhb zzhbVar) {
        this.zza = zzhbVar;
    }

    private final void zzf(int i) {
        List list;
        while (true) {
            PriorityQueue priorityQueue = this.zzd;
            if (priorityQueue.size() <= i) {
                return;
            }
            zzha zzhaVar = (zzha) priorityQueue.poll();
            String str = zzfm.zza;
            int i2 = 0;
            while (true) {
                list = zzhaVar.zza;
                if (i2 >= list.size()) {
                    break;
                }
                this.zza.zza(zzhaVar.zzb, (zzeu) list.get(i2));
                this.zzb.push((zzeu) list.get(i2));
                i2++;
            }
            list.clear();
            zzha zzhaVar2 = this.zzf;
            if (zzhaVar2 != null && zzhaVar2.zzb == zzhaVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzhaVar);
        }
    }

    public final void zza(int i) {
        zzguk.zzi(i >= 0);
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
    public final void zzc(long j, zzeu zzeuVar) {
        if (j != -9223372036854775807L) {
            int i = this.zze;
            if (i != 0) {
                if (i != -1) {
                    PriorityQueue priorityQueue = this.zzd;
                    if (priorityQueue.size() >= this.zze) {
                        zzha zzhaVar = (zzha) priorityQueue.peek();
                        String str = zzfm.zza;
                    }
                }
                ArrayDeque arrayDeque = this.zzb;
                zzeu zzeuVar2 = arrayDeque.isEmpty() ? new zzeu() : (zzeu) arrayDeque.pop();
                zzeuVar2.zza(zzeuVar.zzd());
                System.arraycopy(zzeuVar.zzi(), zzeuVar.zzg(), zzeuVar2.zzi(), 0, zzeuVar2.zzd());
                zzha zzhaVar2 = this.zzf;
                if (zzhaVar2 != null && j == zzhaVar2.zzb) {
                    zzhaVar2.zza.add(zzeuVar2);
                    return;
                }
                ArrayDeque arrayDeque2 = this.zzc;
                zzha zzhaVar3 = arrayDeque2.isEmpty() ? new zzha() : (zzha) arrayDeque2.pop();
                List list = zzhaVar3.zza;
                zzguk.zzi(list.isEmpty());
                zzhaVar3.zzb = j;
                list.add(zzeuVar2);
                this.zzd.add(zzhaVar3);
                this.zzf = zzhaVar3;
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
        this.zza.zza(j, zzeuVar);
    }

    public final void zzd() {
        this.zzd.clear();
    }

    public final void zze() {
        zzf(0);
    }
}
