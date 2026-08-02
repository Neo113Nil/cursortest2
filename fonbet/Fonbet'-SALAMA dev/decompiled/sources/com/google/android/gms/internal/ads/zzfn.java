package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class zzfn {
    private final zzfm zza;
    private final ArrayDeque zzb = new ArrayDeque();
    private final ArrayDeque zzc = new ArrayDeque();
    private final PriorityQueue zzd = new PriorityQueue();
    private int zze = -1;
    private zzfl zzf;

    public zzfn(zzfm zzfmVar) {
        this.zza = zzfmVar;
    }

    private final void zzf(int i7) {
        while (this.zzd.size() > i7) {
            zzfl zzflVar = (zzfl) this.zzd.poll();
            int i8 = zzen.zza;
            for (int i9 = 0; i9 < zzflVar.zza.size(); i9++) {
                this.zza.zza(zzflVar.zzb, (zzed) zzflVar.zza.get(i9));
                this.zzb.push((zzed) zzflVar.zza.get(i9));
            }
            zzflVar.zza.clear();
            zzfl zzflVar2 = this.zzf;
            if (zzflVar2 != null && zzflVar2.zzb == zzflVar.zzb) {
                this.zzf = null;
            }
            this.zzc.push(zzflVar);
        }
    }

    public final int zza() {
        return this.zze;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r7 < r0.zzb) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzb(long j, zzed zzedVar) {
        int i7 = this.zze;
        if (i7 != 0) {
            if (i7 != -1 && this.zzd.size() >= this.zze) {
                zzfl zzflVar = (zzfl) this.zzd.peek();
                int i8 = zzen.zza;
            }
            zzed zzedVar2 = this.zzb.isEmpty() ? new zzed() : (zzed) this.zzb.pop();
            zzedVar2.zzI(zzedVar.zzb());
            System.arraycopy(zzedVar.zzN(), zzedVar.zzd(), zzedVar2.zzN(), 0, zzedVar2.zzb());
            zzfl zzflVar2 = this.zzf;
            if (zzflVar2 != null && j == zzflVar2.zzb) {
                zzflVar2.zza.add(zzedVar2);
                return;
            }
            zzfl zzflVar3 = this.zzc.isEmpty() ? new zzfl() : (zzfl) this.zzc.pop();
            zzcv.zzd(j != -9223372036854775807L);
            zzcv.zzf(zzflVar3.zza.isEmpty());
            zzflVar3.zzb = j;
            zzflVar3.zza.add(zzedVar2);
            this.zzd.add(zzflVar3);
            this.zzf = zzflVar3;
            int i9 = this.zze;
            if (i9 != -1) {
                zzf(i9);
                return;
            }
            return;
        }
        this.zza.zza(j, zzedVar);
    }

    public final void zzc() {
        this.zzd.clear();
    }

    public final void zzd() {
        zzf(0);
    }

    public final void zze(int i7) {
        zzcv.zzf(i7 >= 0);
        this.zze = i7;
        zzf(i7);
    }
}
