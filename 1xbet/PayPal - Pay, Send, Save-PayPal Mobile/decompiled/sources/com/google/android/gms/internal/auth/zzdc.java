package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public abstract class zzdc {
    public static final /* synthetic */ int zzd = 0;

    @javax.annotation.Nullable
    private static volatile com.google.android.gms.internal.auth.zzda zze = null;
    private static volatile boolean zzf = false;
    final com.google.android.gms.internal.auth.zzcz zzb;
    final java.lang.String zzc;
    private final java.lang.Object zzj;
    private volatile int zzk = -1;
    private volatile java.lang.Object zzl;
    private static final java.lang.Object zza = new java.lang.Object();
    private static final java.util.concurrent.atomic.AtomicReference zzg = new java.util.concurrent.atomic.AtomicReference();
    private static final com.google.android.gms.internal.auth.zzde zzh = new com.google.android.gms.internal.auth.zzde(new java.lang.Object() { // from class: com.google.android.gms.internal.auth.zzcu
    });
    private static final java.util.concurrent.atomic.AtomicInteger zzi = new java.util.concurrent.atomic.AtomicInteger();

    /* synthetic */ zzdc(com.google.android.gms.internal.auth.zzcz zzczVar, java.lang.String str, java.lang.Object obj, boolean z, com.google.android.gms.internal.auth.zzdb zzdbVar) {
        if (zzczVar.zza == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zzb = zzczVar;
        this.zzc = str;
        this.zzj = obj;
    }

    public static void zzc() {
        zzi.incrementAndGet();
    }

    public static void zzd(final android.content.Context context) {
        if (zze != null || context == null) {
            return;
        }
        java.lang.Object obj = zza;
        synchronized (obj) {
            if (zze == null) {
                synchronized (obj) {
                    com.google.android.gms.internal.auth.zzda zzdaVar = zze;
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzdaVar == null || zzdaVar.zza() != context) {
                        com.google.android.gms.internal.auth.zzcg.zzd();
                        com.google.android.gms.internal.auth.zzdd.zzc();
                        com.google.android.gms.internal.auth.zzco.zze();
                        zze = new com.google.android.gms.internal.auth.zzcd(context, com.google.android.gms.internal.auth.zzdo.zza(new com.google.android.gms.internal.auth.zzdj() { // from class: com.google.android.gms.internal.auth.zzct
                            @Override // com.google.android.gms.internal.auth.zzdj
                            public final java.lang.Object zza() {
                                android.content.Context context2 = context;
                                int i = com.google.android.gms.internal.auth.zzdc.zzd;
                                return com.google.android.gms.internal.auth.zzcp.zza(context2);
                            }
                        }));
                        zzi.incrementAndGet();
                    }
                }
            }
        }
    }

    abstract java.lang.Object zza(java.lang.Object obj);

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:13:0x003e, B:15:0x0044, B:17:0x004e, B:19:0x006f, B:21:0x0077, B:23:0x007f, B:25:0x0085, B:28:0x0097, B:30:0x009d, B:31:0x0095, B:33:0x00a3, B:35:0x00a7, B:38:0x00af, B:39:0x00b2, B:40:0x00b6, B:43:0x0063, B:44:0x00bb, B:45:0x00c2, B:48:0x00c3), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bb A[Catch: all -> 0x00c5, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:13:0x003e, B:15:0x0044, B:17:0x004e, B:19:0x006f, B:21:0x0077, B:23:0x007f, B:25:0x0085, B:28:0x0097, B:30:0x009d, B:31:0x0095, B:33:0x00a3, B:35:0x00a7, B:38:0x00af, B:39:0x00b2, B:40:0x00b6, B:43:0x0063, B:44:0x00bb, B:45:0x00c2, B:48:0x00c3), top: B:4:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object zzb() {
        java.lang.String str;
        java.lang.Object zzb;
        int i = zzi.get();
        if (this.zzk < i) {
            synchronized (this) {
                if (this.zzk < i) {
                    com.google.android.gms.internal.auth.zzda zzdaVar = zze;
                    com.google.android.gms.internal.auth.zzdh zzc = com.google.android.gms.internal.auth.zzdh.zzc();
                    java.lang.Object obj = null;
                    if (zzdaVar != null) {
                        zzc = (com.google.android.gms.internal.auth.zzdh) zzdaVar.zzb().zza();
                        if (zzc.zzb()) {
                            com.google.android.gms.internal.auth.zzci zzciVar = (com.google.android.gms.internal.auth.zzci) zzc.zza();
                            com.google.android.gms.internal.auth.zzcz zzczVar = this.zzb;
                            str = zzciVar.zza(zzczVar.zza, null, zzczVar.zzc, this.zzc);
                            if (zzdaVar != null) {
                                throw new java.lang.IllegalStateException("Must call PhenotypeFlag.init() first");
                            }
                            android.net.Uri uri = this.zzb.zza;
                            com.google.android.gms.internal.auth.zzcl zza2 = uri != null ? com.google.android.gms.internal.auth.zzcq.zza(zzdaVar.zza(), uri) ? com.google.android.gms.internal.auth.zzcg.zza(zzdaVar.zza().getContentResolver(), this.zzb.zza, new java.lang.Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.android.gms.internal.auth.zzdc.zzc();
                                }
                            }) : null : com.google.android.gms.internal.auth.zzdd.zza(zzdaVar.zza(), null, new java.lang.Runnable() { // from class: com.google.android.gms.internal.auth.zzcs
                                @Override // java.lang.Runnable
                                public final void run() {
                                    com.google.android.gms.internal.auth.zzdc.zzc();
                                }
                            });
                            java.lang.Object zza3 = (zza2 == null || (zzb = zza2.zzb(this.zzc)) == null) ? null : zza(zzb);
                            if (zza3 == null) {
                                if (!this.zzb.zzd) {
                                    java.lang.String zzb2 = com.google.android.gms.internal.auth.zzco.zza(zzdaVar.zza()).zzb(this.zzb.zzd ? null : this.zzc);
                                    if (zzb2 != null) {
                                        obj = zza(zzb2);
                                    }
                                }
                                zza3 = obj == null ? this.zzj : obj;
                            }
                            if (zzc.zzb()) {
                                zza3 = str == null ? this.zzj : zza(str);
                            }
                            this.zzl = zza3;
                            this.zzk = i;
                        }
                    }
                    str = null;
                    if (zzdaVar != null) {
                    }
                }
            }
        }
        return this.zzl;
    }
}
