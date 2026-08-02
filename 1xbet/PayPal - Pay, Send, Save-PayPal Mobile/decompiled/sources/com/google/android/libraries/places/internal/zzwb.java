package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
final class zzwb extends com.google.android.libraries.places.internal.zzvq {
    private final java.lang.String zza;
    private final java.util.logging.Level zzb;
    private final java.util.Set zzc;
    private final com.google.android.libraries.places.internal.zzva zzd;
    private final int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzwb(java.lang.String str, java.lang.String str2, boolean z, int i, boolean z2, boolean z3) {
        super(str2);
        java.util.Set set;
        com.google.android.libraries.places.internal.zzva zzvaVar;
        java.util.logging.Level level = java.util.logging.Level.ALL;
        this.zza = "";
        this.zze = 2;
        this.zzb = level;
        set = com.google.android.libraries.places.internal.zzwc.zzb;
        this.zzc = set;
        zzvaVar = com.google.android.libraries.places.internal.zzwc.zzc;
        this.zzd = zzvaVar;
    }

    @Override // com.google.android.libraries.places.internal.zzup
    public final boolean zzb(java.util.logging.Level level) {
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzup
    public final void zzc(com.google.android.libraries.places.internal.zzun zzunVar) {
        java.lang.String str = (java.lang.String) zzunVar.zzl().zzd(com.google.android.libraries.places.internal.zzug.zza);
        if (str == null) {
            str = zza();
        }
        if (str == null) {
            str = zzunVar.zzg().zza();
            int indexOf = str.indexOf(36, str.lastIndexOf(46));
            if (indexOf >= 0) {
                str = str.substring(0, indexOf);
            }
        }
        java.lang.String str2 = this.zza;
        com.google.android.libraries.places.internal.zzwc.zzi(zzunVar, com.google.android.libraries.places.internal.zzvv.zza(str2, str, true), 2, this.zzb, this.zzc, this.zzd);
    }
}
