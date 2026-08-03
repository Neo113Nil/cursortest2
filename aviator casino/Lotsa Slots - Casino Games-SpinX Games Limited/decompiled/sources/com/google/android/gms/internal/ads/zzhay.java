package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzhay extends com.google.android.gms.internal.ads.zzhbc {
    private static final com.google.android.gms.internal.ads.zzhce zza = new com.google.android.gms.internal.ads.zzhce(com.google.android.gms.internal.ads.zzhay.class);
    private com.google.android.gms.internal.ads.zzgwi zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhay(com.google.android.gms.internal.ads.zzgwi zzgwiVar, boolean z, boolean z2) {
        super(zzgwiVar.size());
        zzgwiVar.getClass();
        this.zzb = zzgwiVar;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i, com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        try {
            if (listenableFuture.isCancelled()) {
                this.zzb = null;
                cancel(false);
            } else {
                zzG(i, listenableFuture);
            }
        } finally {
            zzz(null);
        }
    }

    private static void zzF(java.lang.Throwable th) {
        zza.zza().logp(java.util.logging.Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof java.lang.Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i, java.util.concurrent.Future future) {
        try {
            zzw(i, com.google.android.gms.internal.ads.zzhcx.zza(future));
        } catch (java.util.concurrent.ExecutionException e) {
            zzE(e.getCause());
        } catch (java.lang.Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(com.google.android.gms.internal.ads.zzgwi zzgwiVar) {
        int zzC = zzC();
        int i = 0;
        com.google.android.gms.internal.ads.zzgtj.zzj(zzC >= 0, "Less than 0 remaining futures");
        if (zzC == 0) {
            if (zzgwiVar != null) {
                com.google.android.gms.internal.ads.zzgza it = zzgwiVar.iterator();
                while (it.hasNext()) {
                    java.util.concurrent.Future future = (java.util.concurrent.Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i, future);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(java.util.Set set, java.lang.Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    void zzA(int i) {
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final void zzc() {
        com.google.android.gms.internal.ads.zzgwi zzgwiVar = this.zzb;
        zzA(1);
        if ((zzgwiVar != null) && isCancelled()) {
            boolean zzj = zzj();
            com.google.android.gms.internal.ads.zzgza it = zzgwiVar.iterator();
            while (it.hasNext()) {
                ((java.util.concurrent.Future) it.next()).cancel(zzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhap
    protected final java.lang.String zzd() {
        com.google.android.gms.internal.ads.zzgwi zzgwiVar = this.zzb;
        return zzgwiVar != null ? "futures=".concat(zzgwiVar.toString()) : super.zzd();
    }

    final void zze() {
        java.util.Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            com.google.android.gms.internal.ads.zzgza it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final com.google.common.util.concurrent.ListenableFuture listenableFuture = (com.google.common.util.concurrent.ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    zzy(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzhax
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            com.google.android.gms.internal.ads.zzhay.this.zzy(i, listenableFuture);
                        }
                    }, com.google.android.gms.internal.ads.zzhbl.INSTANCE);
                }
                i = i2;
            }
            return;
        }
        com.google.android.gms.internal.ads.zzgwi zzgwiVar = this.zzb;
        final com.google.android.gms.internal.ads.zzgwi zzgwiVar2 = true != this.zzd ? null : zzgwiVar;
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzhaw
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzhay.this.zzz(zzgwiVar2);
            }
        };
        com.google.android.gms.internal.ads.zzgza it2 = zzgwiVar.iterator();
        while (it2.hasNext()) {
            com.google.common.util.concurrent.ListenableFuture listenableFuture2 = (com.google.common.util.concurrent.ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgwiVar2);
            } else {
                listenableFuture2.addListener(runnable, com.google.android.gms.internal.ads.zzhbl.INSTANCE);
            }
        }
    }

    abstract void zzw(int i, java.lang.Object obj);

    abstract void zzx();

    @Override // com.google.android.gms.internal.ads.zzhbc
    final void zzf(java.util.Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzI(set, (java.lang.Throwable) java.util.Objects.requireNonNull(zzl()));
    }

    private final void zzE(java.lang.Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof java.lang.Error) {
            zzF(th);
        }
    }
}
