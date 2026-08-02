package com.google.android.play.core.splitinstall;

/* loaded from: classes9.dex */
public final class zzc {
    private com.google.android.play.core.splitinstall.zzac zza;

    private zzc() {
    }

    public final com.google.android.play.core.splitinstall.zzp zzb() {
        com.google.android.play.core.splitinstall.zzac zzacVar = this.zza;
        if (zzacVar != null) {
            return new com.google.android.play.core.splitinstall.zze(zzacVar, null);
        }
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(com.google.android.play.core.splitinstall.zzac.class.getCanonicalName()).concat(" must be set"));
    }

    public final com.google.android.play.core.splitinstall.zzc zza(com.google.android.play.core.splitinstall.zzac zzacVar) {
        this.zza = zzacVar;
        return this;
    }

    /* synthetic */ zzc(com.google.android.play.core.splitinstall.zzb zzbVar) {
    }
}
