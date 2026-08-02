package com.google.android.gms.internal.fido;

/* loaded from: classes8.dex */
public final class zzer implements com.google.android.gms.internal.fido.zzek {
    private final java.lang.String zza;
    private final com.google.android.gms.internal.fido.zzdn zzb;
    private final java.util.logging.Level zzc;
    private final java.util.Set zzd;
    private final com.google.android.gms.internal.fido.zzea zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzer() {
        this("", true, r3, r4, false, r6, r7);
        java.util.Set set;
        com.google.android.gms.internal.fido.zzea zzeaVar;
        com.google.android.gms.internal.fido.zzdo zzdoVar = com.google.android.gms.internal.fido.zzdo.NO_OP;
        java.util.logging.Level level = java.util.logging.Level.ALL;
        set = com.google.android.gms.internal.fido.zzeu.zza;
        zzeaVar = com.google.android.gms.internal.fido.zzeu.zzb;
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final com.google.android.gms.internal.fido.zzdp zza(java.lang.String str) {
        return new com.google.android.gms.internal.fido.zzeu(this.zza, str, true, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzer(com.google.android.gms.internal.fido.zzeq zzeqVar) {
        this("", true, r3, r4, false, r6, r7);
        java.util.Set set;
        com.google.android.gms.internal.fido.zzea zzeaVar;
        com.google.android.gms.internal.fido.zzdo zzdoVar = com.google.android.gms.internal.fido.zzdo.NO_OP;
        java.util.logging.Level level = java.util.logging.Level.ALL;
        set = com.google.android.gms.internal.fido.zzeu.zza;
        zzeaVar = com.google.android.gms.internal.fido.zzeu.zzb;
    }

    public final com.google.android.gms.internal.fido.zzer zzb(boolean z) {
        java.util.Set set = this.zzd;
        com.google.android.gms.internal.fido.zzea zzeaVar = this.zze;
        return new com.google.android.gms.internal.fido.zzer(this.zza, true, this.zzb, java.util.logging.Level.OFF, false, set, zzeaVar);
    }

    private zzer(java.lang.String str, boolean z, com.google.android.gms.internal.fido.zzdn zzdnVar, java.util.logging.Level level, boolean z2, java.util.Set set, com.google.android.gms.internal.fido.zzea zzeaVar) {
        this.zza = "";
        this.zzb = zzdnVar;
        this.zzc = level;
        this.zzd = set;
        this.zze = zzeaVar;
    }
}
