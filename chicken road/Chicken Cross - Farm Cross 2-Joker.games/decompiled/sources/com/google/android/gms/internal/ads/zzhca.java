package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
abstract class zzhca extends zzhce {
    private static final zzhdg zza = new zzhdg(zzhca.class);
    private zzgxi zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzhca(zzgxi zzgxiVar, boolean z, boolean z2) {
        super(zzgxiVar.size());
        zzgxiVar.getClass();
        this.zzb = zzgxiVar;
        this.zzc = z;
        this.zzd = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzD, reason: merged with bridge method [inline-methods] */
    public final void zzy(int i, ListenableFuture listenableFuture) {
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

    private static void zzF(Throwable th) {
        zza.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    private final void zzG(int i, ListenableFuture listenableFuture) {
        try {
            zzw(i, zzhdz.zza(listenableFuture));
        } catch (ExecutionException e) {
            zzE(e.getCause());
        } catch (Throwable th) {
            zzE(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzH, reason: merged with bridge method [inline-methods] */
    public final void zzz(zzgxi zzgxiVar) {
        int zzC = zzC();
        int i = 0;
        zzguk.zzj(zzC >= 0, "Less than 0 remaining futures");
        if (zzC == 0) {
            if (zzgxiVar != null) {
                zzhaa it = zzgxiVar.iterator();
                while (it.hasNext()) {
                    ListenableFuture listenableFuture = (ListenableFuture) it.next();
                    if (!listenableFuture.isCancelled()) {
                        zzG(i, listenableFuture);
                    }
                    i++;
                }
            }
            this.seenExceptionsField = null;
            zzx();
            zzA(2);
        }
    }

    private static boolean zzI(Set set, Throwable th) {
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

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final void zzc() {
        zzgxi zzgxiVar = this.zzb;
        zzA(1);
        if ((zzgxiVar != null) && isCancelled()) {
            boolean zzj = zzj();
            zzhaa it = zzgxiVar.iterator();
            while (it.hasNext()) {
                ((ListenableFuture) it.next()).cancel(zzj);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    protected final String zzd() {
        zzgxi zzgxiVar = this.zzb;
        return zzgxiVar != null ? "futures=".concat(zzgxiVar.toString()) : super.zzd();
    }

    final void zze() {
        Objects.requireNonNull(this.zzb);
        if (this.zzb.isEmpty()) {
            zzx();
            return;
        }
        if (this.zzc) {
            zzhaa it = this.zzb.iterator();
            final int i = 0;
            while (it.hasNext()) {
                final ListenableFuture listenableFuture = (ListenableFuture) it.next();
                int i2 = i + 1;
                if (listenableFuture.isDone()) {
                    zzy(i, listenableFuture);
                } else {
                    listenableFuture.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhbz
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzhca.this.zzy(i, listenableFuture);
                        }
                    }, zzhcn.INSTANCE);
                }
                i = i2;
            }
            return;
        }
        zzgxi zzgxiVar = this.zzb;
        final zzgxi zzgxiVar2 = true != this.zzd ? null : zzgxiVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzhby
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzhca.this.zzz(zzgxiVar2);
            }
        };
        zzhaa it2 = zzgxiVar.iterator();
        while (it2.hasNext()) {
            ListenableFuture listenableFuture2 = (ListenableFuture) it2.next();
            if (listenableFuture2.isDone()) {
                zzz(zzgxiVar2);
            } else {
                listenableFuture2.addListener(runnable, zzhcn.INSTANCE);
            }
        }
    }

    abstract void zzw(int i, Object obj);

    abstract void zzx();

    @Override // com.google.android.gms.internal.ads.zzhce
    final void zzf(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        zzI(set, (Throwable) Objects.requireNonNull(zzl()));
    }

    private final void zzE(Throwable th) {
        th.getClass();
        if (this.zzc && !zzb(th) && zzI(zzB(), th)) {
            zzF(th);
        } else if (th instanceof Error) {
            zzF(th);
        }
    }
}
