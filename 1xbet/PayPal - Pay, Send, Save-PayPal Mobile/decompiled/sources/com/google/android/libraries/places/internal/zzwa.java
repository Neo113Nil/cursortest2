package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzwa implements com.google.android.libraries.places.internal.zzvs {
    private final java.lang.String zza;
    private final java.util.logging.Level zzb;
    private final java.util.Set zzc;
    private final com.google.android.libraries.places.internal.zzva zzd;
    private final int zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzwa() {
        this("", true, 2, java.util.logging.Level.ALL, false, r6, r7);
        java.util.Set set;
        com.google.android.libraries.places.internal.zzva zzvaVar;
        set = com.google.android.libraries.places.internal.zzwc.zzb;
        zzvaVar = com.google.android.libraries.places.internal.zzwc.zzc;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    /* synthetic */ zzwa(byte[] bArr) {
        this("", true, 2, java.util.logging.Level.ALL, false, r6, r7);
        java.util.Set set;
        com.google.android.libraries.places.internal.zzva zzvaVar;
        set = com.google.android.libraries.places.internal.zzwc.zzb;
        zzvaVar = com.google.android.libraries.places.internal.zzwc.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzvs
    public final com.google.android.libraries.places.internal.zzup zza(java.lang.String str) {
        return new com.google.android.libraries.places.internal.zzwc(this.zza, str, true, 2, this.zzb, this.zzc, this.zzd, null);
    }

    public final com.google.android.libraries.places.internal.zzwa zzb(boolean z) {
        java.util.Set set = this.zzc;
        com.google.android.libraries.places.internal.zzva zzvaVar = this.zzd;
        return new com.google.android.libraries.places.internal.zzwa(this.zza, true, 2, java.util.logging.Level.OFF, false, set, zzvaVar);
    }

    private zzwa(java.lang.String str, boolean z, int i, java.util.logging.Level level, boolean z2, java.util.Set set, com.google.android.libraries.places.internal.zzva zzvaVar) {
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        this.zzc = set;
        this.zzd = zzvaVar;
    }
}
