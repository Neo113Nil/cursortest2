package com.google.android.gms.internal.ads;

import F2.C0254t;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzcpg implements zzaxx {
    private final zzceb zza;
    private final Executor zzb;
    private final AtomicReference zzc = new AtomicReference();

    public zzcpg(zzceb zzcebVar, Executor executor) {
        this.zza = zzcebVar;
        this.zzb = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzaxx
    public final synchronized void zzdn(zzaxw zzaxwVar) {
        if (this.zza != null) {
            if (((Boolean) C0254t.f2723d.f2726c.zzb(zzbby.zzmB)).booleanValue()) {
                if (zzaxwVar.zzj) {
                    AtomicReference atomicReference = this.zzc;
                    Boolean bool = Boolean.TRUE;
                    if (!bool.equals(atomicReference.getAndSet(bool))) {
                        Executor executor = this.zzb;
                        final zzceb zzcebVar = this.zza;
                        Objects.requireNonNull(zzcebVar);
                        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpe
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcebVar.onResume();
                            }
                        });
                        return;
                    }
                }
                if (!zzaxwVar.zzj) {
                    AtomicReference atomicReference2 = this.zzc;
                    Boolean bool2 = Boolean.FALSE;
                    if (!bool2.equals(atomicReference2.getAndSet(bool2))) {
                        Executor executor2 = this.zzb;
                        final zzceb zzcebVar2 = this.zza;
                        Objects.requireNonNull(zzcebVar2);
                        executor2.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcpf
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzcebVar2.onPause();
                            }
                        });
                    }
                }
            }
        }
    }
}
