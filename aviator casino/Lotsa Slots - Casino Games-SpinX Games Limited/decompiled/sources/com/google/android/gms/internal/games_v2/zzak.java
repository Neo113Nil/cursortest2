package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public abstract class zzak {
    private final java.util.concurrent.atomic.AtomicReference zza = new java.util.concurrent.atomic.AtomicReference();

    protected abstract com.google.android.gms.internal.games_v2.zzaj zza();

    public final void zzb() {
        com.google.android.gms.internal.games_v2.zzaj zzajVar = (com.google.android.gms.internal.games_v2.zzaj) this.zza.get();
        if (zzajVar != null) {
            zzajVar.zzd();
        }
    }

    public final void zzc(java.lang.String str, int i) {
        com.google.android.gms.internal.games_v2.zzaj zzajVar = (com.google.android.gms.internal.games_v2.zzaj) this.zza.get();
        if (zzajVar == null) {
            com.google.android.gms.internal.games_v2.zzaj zza = zza();
            java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
            while (true) {
                if (androidx.compose.animation.core.ComplexDouble$$ExternalSyntheticBackport0.m(atomicReference, null, zza)) {
                    zzajVar = zza;
                    break;
                } else if (atomicReference.get() != null) {
                    zzajVar = (com.google.android.gms.internal.games_v2.zzaj) this.zza.get();
                    break;
                }
            }
        }
        zzajVar.zzc(str, i);
    }
}
