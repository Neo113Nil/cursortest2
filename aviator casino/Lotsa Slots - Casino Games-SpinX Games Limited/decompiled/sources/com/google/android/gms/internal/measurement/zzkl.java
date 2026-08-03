package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public abstract class zzkl {
    public static final /* synthetic */ int zzc = 0;
    private static final java.lang.Object zzd = new java.lang.Object();

    @javax.annotation.Nullable
    private static volatile com.google.android.gms.internal.measurement.zzkg zze = null;
    private static volatile boolean zzf = false;
    private static final java.util.concurrent.atomic.AtomicInteger zzh;
    final com.google.android.gms.internal.measurement.zzkf zza;
    final java.lang.String zzb;
    private java.lang.Object zzg;
    private volatile int zzi = -1;
    private volatile java.lang.Object zzj;
    private volatile boolean zzk;

    static {
        new java.util.concurrent.atomic.AtomicReference();
        com.google.common.base.Preconditions.checkNotNull(com.google.android.gms.internal.measurement.zzkj.zza, "BuildInfo must be non-null");
        zzh = new java.util.concurrent.atomic.AtomicInteger();
    }

    /* synthetic */ zzkl(com.google.android.gms.internal.measurement.zzkf zzkfVar, java.lang.String str, java.lang.Object obj, boolean z, byte[] bArr) {
        if (zzkfVar.zza == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.zza = zzkfVar;
        this.zzb = str;
        this.zzg = obj;
        this.zzk = false;
    }

    public static void zzb(final android.content.Context context) {
        if (zze != null || context == null) {
            return;
        }
        java.lang.Object obj = zzd;
        synchronized (obj) {
            if (zze == null) {
                synchronized (obj) {
                    com.google.android.gms.internal.measurement.zzkg zzkgVar = zze;
                    android.content.Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    if (zzkgVar == null || zzkgVar.zza() != context) {
                        if (zzkgVar != null) {
                            com.google.android.gms.internal.measurement.zzjq.zzd();
                            com.google.android.gms.internal.measurement.zzkn.zzb();
                            com.google.android.gms.internal.measurement.zzjx.zzc();
                        }
                        zze = new com.google.android.gms.internal.measurement.zzjn(context, com.google.common.base.Suppliers.memoize(new com.google.common.base.Supplier() { // from class: com.google.android.gms.internal.measurement.zzkk
                            @Override // com.google.common.base.Supplier
                            public final /* synthetic */ java.lang.Object get() {
                                int i = com.google.android.gms.internal.measurement.zzkl.zzc;
                                return com.google.android.gms.internal.measurement.zzjy.zza(context);
                            }
                        }));
                        zzh.incrementAndGet();
                    }
                }
            }
        }
    }

    public static void zzc() {
        zzh.incrementAndGet();
    }

    @javax.annotation.Nullable
    abstract java.lang.Object zza(java.lang.Object obj);

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x004d, B:18:0x0058, B:20:0x0062, B:22:0x0085, B:24:0x008d, B:27:0x00b4, B:30:0x00bc, B:31:0x00bf, B:32:0x00c3, B:33:0x0096, B:35:0x009a, B:37:0x00aa, B:39:0x00b0, B:43:0x0073, B:46:0x00c7), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0096 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x004d, B:18:0x0058, B:20:0x0062, B:22:0x0085, B:24:0x008d, B:27:0x00b4, B:30:0x00bc, B:31:0x00bf, B:32:0x00c3, B:33:0x0096, B:35:0x009a, B:37:0x00aa, B:39:0x00b0, B:43:0x0073, B:46:0x00c7), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0073 A[Catch: all -> 0x00c9, TryCatch #0 {, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x001e, B:13:0x0034, B:16:0x004d, B:18:0x0058, B:20:0x0062, B:22:0x0085, B:24:0x008d, B:27:0x00b4, B:30:0x00bc, B:31:0x00bf, B:32:0x00c3, B:33:0x0096, B:35:0x009a, B:37:0x00aa, B:39:0x00b0, B:43:0x0073, B:46:0x00c7), top: B:4:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object zzd() {
        java.lang.String str;
        java.lang.Object zza;
        java.lang.String zze2;
        java.lang.Object zze3;
        int i = zzh.get();
        if (this.zzi < i) {
            synchronized (this) {
                if (this.zzi < i) {
                    com.google.android.gms.internal.measurement.zzkg zzkgVar = zze;
                    com.google.common.base.Optional absent = com.google.common.base.Optional.absent();
                    java.lang.Object obj = null;
                    if (zzkgVar != null && zzkgVar.zzb() != null) {
                        absent = (com.google.common.base.Optional) ((com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(zzkgVar.zzb())).get();
                        if (absent.isPresent()) {
                            com.google.android.gms.internal.measurement.zzjs zzjsVar = (com.google.android.gms.internal.measurement.zzjs) absent.get();
                            com.google.android.gms.internal.measurement.zzkf zzkfVar = this.zza;
                            str = zzjsVar.zza(zzkfVar.zza, null, zzkfVar.zzc, this.zzb);
                            com.google.common.base.Preconditions.checkState(zzkgVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                            com.google.android.gms.internal.measurement.zzkf zzkfVar2 = this.zza;
                            android.net.Uri uri = zzkfVar2.zza;
                            com.google.android.gms.internal.measurement.zzju zza2 = uri == null ? com.google.android.gms.internal.measurement.zzjz.zza(zzkgVar.zza(), uri) ? com.google.android.gms.internal.measurement.zzjq.zza(zzkgVar.zza().getContentResolver(), uri, com.google.android.gms.internal.measurement.zzki.zza) : null : com.google.android.gms.internal.measurement.zzkn.zza(zzkgVar.zza(), (java.lang.String) com.google.common.base.Preconditions.checkNotNull(null), com.google.android.gms.internal.measurement.zzkh.zza);
                            zza = (zza2 != null || (zze3 = zza2.zze(this.zzb)) == null) ? null : zza(zze3);
                            if (zza == null) {
                                if (!zzkfVar2.zzd && (zze2 = com.google.android.gms.internal.measurement.zzjx.zza(zzkgVar.zza()).zze(this.zzb)) != null) {
                                    obj = zza(zze2);
                                }
                                zza = obj == null ? this.zzg : obj;
                            }
                            if (absent.isPresent()) {
                                zza = str == null ? this.zzg : zza(str);
                            }
                            this.zzj = zza;
                            this.zzi = i;
                        }
                    }
                    str = null;
                    com.google.common.base.Preconditions.checkState(zzkgVar == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                    com.google.android.gms.internal.measurement.zzkf zzkfVar22 = this.zza;
                    android.net.Uri uri2 = zzkfVar22.zza;
                    if (uri2 == null) {
                    }
                    if (zza2 != null) {
                    }
                    if (zza == null) {
                    }
                    if (absent.isPresent()) {
                    }
                    this.zzj = zza;
                    this.zzi = i;
                }
            }
        }
        return this.zzj;
    }
}
