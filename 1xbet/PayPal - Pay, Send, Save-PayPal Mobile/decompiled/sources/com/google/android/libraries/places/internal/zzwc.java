package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzwc extends com.google.android.libraries.places.internal.zzvq {
    public static final /* synthetic */ int zza = 0;
    private static final java.util.Set zzb;
    private static final com.google.android.libraries.places.internal.zzva zzc;
    private static final com.google.android.libraries.places.internal.zzwa zzd;
    private final java.lang.String zze;
    private final java.util.logging.Level zzf;
    private final java.util.Set zzg;
    private final com.google.android.libraries.places.internal.zzva zzh;
    private final int zzi;

    static {
        java.util.Set unmodifiableSet = java.util.Collections.unmodifiableSet(new java.util.HashSet(java.util.Arrays.asList(com.google.android.libraries.places.internal.zzth.zza, com.google.android.libraries.places.internal.zzug.zza, com.google.android.libraries.places.internal.zzuh.zza)));
        zzb = unmodifiableSet;
        zzc = com.google.android.libraries.places.internal.zzvd.zza(unmodifiableSet).zzc();
        zzd = new com.google.android.libraries.places.internal.zzwa(null);
    }

    /* synthetic */ zzwc(java.lang.String str, java.lang.String str2, boolean z, int i, java.util.logging.Level level, java.util.Set set, com.google.android.libraries.places.internal.zzva zzvaVar, byte[] bArr) {
        super(str2);
        this.zze = com.google.android.libraries.places.internal.zzvv.zza("", str2, true);
        this.zzi = 2;
        this.zzf = level;
        this.zzg = set;
        this.zzh = zzvaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzi(com.google.android.libraries.places.internal.zzun zzunVar, java.lang.String str, int i, java.util.logging.Level level, java.util.Set set, com.google.android.libraries.places.internal.zzva zzvaVar) {
        java.lang.Boolean bool = (java.lang.Boolean) zzunVar.zzl().zzd(com.google.android.libraries.places.internal.zzuh.zza);
        if (bool == null || !bool.booleanValue()) {
            com.google.android.libraries.places.internal.zzvk zzh = com.google.android.libraries.places.internal.zzvk.zzh(com.google.android.libraries.places.internal.zzvn.zzj(), zzunVar.zzl());
            boolean z = zzunVar.zze().intValue() < level.intValue();
            if (z || zzunVar.zzh() != null || zzh.zzb() > set.size() || !set.containsAll(zzh.zzc())) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                if (com.google.android.libraries.places.internal.zzuo.zza(2, zzunVar.zzg(), sb)) {
                    sb.append(" ");
                }
                if (!z || zzunVar.zzh() == null) {
                    com.google.android.libraries.places.internal.zzui.zza(zzunVar, sb);
                    com.google.android.libraries.places.internal.zzum zzumVar = new com.google.android.libraries.places.internal.zzum("[CONTEXT ", " ]", sb);
                    zzh.zza(zzvaVar, zzumVar);
                    zzumVar.zzb();
                } else {
                    sb.append("(REDACTED) ");
                    sb.append(zzunVar.zzh().zzb());
                }
            } else {
                com.google.android.libraries.places.internal.zzur.zza(zzunVar.zzj());
            }
            com.google.android.libraries.places.internal.zzvv.zzb(zzunVar.zze());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzup
    public final boolean zzb(java.util.logging.Level level) {
        java.lang.String str = this.zze;
        int zzb2 = com.google.android.libraries.places.internal.zzvv.zzb(level);
        return android.util.Log.isLoggable(str, zzb2) || android.util.Log.isLoggable("all", zzb2);
    }

    @Override // com.google.android.libraries.places.internal.zzup
    public final void zzc(com.google.android.libraries.places.internal.zzun zzunVar) {
        zzi(zzunVar, this.zze, 2, this.zzf, this.zzg, this.zzh);
    }

    public static com.google.android.libraries.places.internal.zzwa zze() {
        return zzd;
    }
}
