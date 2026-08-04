package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes.dex */
public final class zzawj implements Callable {
    private final zzavr zza;
    private final zzarr zzb;

    public zzawj(zzavr zzavrVar, zzarr zzarrVar) {
        this.zza = zzavrVar;
        this.zzb = zzarrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws ExecutionException, InterruptedException {
        if (this.zza.zzk() != null) {
            this.zza.zzk().get();
        }
        zzasm zzasmVarZzc = this.zza.zzc();
        if (zzasmVarZzc == null) {
            return null;
        }
        try {
            synchronized (this.zzb) {
                try {
                    this.zzb.zzaY(zzasmVarZzc.zzaV(), zzgwq.zza());
                } catch (Throwable th) {
                    throw th;
                }
            }
            return null;
        } catch (zzgxv | NullPointerException unused) {
            return null;
        }
    }
}
