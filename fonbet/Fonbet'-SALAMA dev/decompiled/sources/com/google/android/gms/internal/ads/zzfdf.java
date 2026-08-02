package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
final class zzfdf implements zzgay {
    final /* synthetic */ zzfdi zza;
    final /* synthetic */ zzfdj zzb;

    public zzfdf(zzfdj zzfdjVar, zzfdi zzfdiVar) {
        this.zza = zzfdiVar;
        this.zzb = zzfdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        ArrayDeque arrayDeque;
        int i7;
        synchronized (this.zzb) {
            try {
                this.zzb.zze = null;
                arrayDeque = this.zzb.zzd;
                arrayDeque.addFirst(this.zza);
                zzfdj zzfdjVar = this.zzb;
                i7 = zzfdjVar.zzf;
                if (i7 == 1) {
                    zzfdjVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
