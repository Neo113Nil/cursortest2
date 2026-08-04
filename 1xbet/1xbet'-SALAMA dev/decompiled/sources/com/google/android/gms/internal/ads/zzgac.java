package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes.dex */
abstract class zzgac extends zzgah {
    private static final zzgbl zzb = new zzgbl(zzgac.class);
    private zzfwc zzc;
    private final boolean zzd;
    private final boolean zzh;

    public zzgac(zzfwc zzfwcVar, boolean z4, boolean z7) {
        super(zzfwcVar.size());
        this.zzc = zzfwcVar;
        this.zzd = z4;
        this.zzh = z7;
    }

    private final void zzG(int i7, Future future) {
        try {
            zzv(i7, zzgcf.zza(future));
        } catch (ExecutionException e7) {
            zzI(e7.getCause());
        } catch (Throwable th) {
            zzI(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzH(zzfwc zzfwcVar) {
        int iZzA = zzA();
        int i7 = 0;
        zzfth.zzm(iZzA >= 0, "Less than 0 remaining futures");
        if (iZzA == 0) {
            if (zzfwcVar != null) {
                zzfyn it = zzfwcVar.iterator();
                while (it.hasNext()) {
                    Future future = (Future) it.next();
                    if (!future.isCancelled()) {
                        zzG(i7, future);
                    }
                    i7++;
                }
            }
            zzF();
            zzw();
            zzy(2);
        }
    }

    private final void zzI(Throwable th) {
        th.getClass();
        if (this.zzd && !zzd(th) && zzL(zzC(), th)) {
            zzJ(th);
        } else if (th instanceof Error) {
            zzJ(th);
        }
    }

    private static void zzJ(Throwable th) {
        zzb.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFuture", "log", true != (th instanceof Error) ? "Got more than one input Future failure. Logging failures after the first" : "Input Future failed with Error", th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(int i7, I3.b bVar) {
        try {
            if (bVar.isCancelled()) {
                this.zzc = null;
                cancel(false);
            } else {
                zzG(i7, bVar);
            }
        } finally {
            zzH(null);
        }
    }

    private static boolean zzL(Set set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final String zza() {
        zzfwc zzfwcVar = this.zzc;
        return zzfwcVar != null ? "futures=".concat(zzfwcVar.toString()) : super.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfzr
    public final void zzb() {
        zzfwc zzfwcVar = this.zzc;
        zzy(1);
        if ((zzfwcVar != null) && isCancelled()) {
            boolean zZzt = zzt();
            zzfyn it = zzfwcVar.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(zZzt);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgah
    public final void zzu(Set set) {
        set.getClass();
        if (isCancelled()) {
            return;
        }
        Throwable thZzl = zzl();
        Objects.requireNonNull(thZzl);
        zzL(set, thZzl);
    }

    public abstract void zzv(int i7, Object obj);

    public abstract void zzw();

    public final void zzx() {
        Objects.requireNonNull(this.zzc);
        if (this.zzc.isEmpty()) {
            zzw();
            return;
        }
        if (this.zzd) {
            zzfyn it = this.zzc.iterator();
            final int i7 = 0;
            while (it.hasNext()) {
                final I3.b bVar = (I3.b) it.next();
                int i8 = i7 + 1;
                if (bVar.isDone()) {
                    zzK(i7, bVar);
                } else {
                    bVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgaa
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zzK(i7, bVar);
                        }
                    }, zzgaq.INSTANCE);
                }
                i7 = i8;
            }
            return;
        }
        zzfwc zzfwcVar = this.zzc;
        final zzfwc zzfwcVar2 = true != this.zzh ? null : zzfwcVar;
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzgab
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzH(zzfwcVar2);
            }
        };
        zzfyn it2 = zzfwcVar.iterator();
        while (it2.hasNext()) {
            I3.b bVar2 = (I3.b) it2.next();
            if (bVar2.isDone()) {
                zzH(zzfwcVar2);
            } else {
                bVar2.addListener(runnable, zzgaq.INSTANCE);
            }
        }
    }

    public void zzy(int i7) {
        this.zzc = null;
    }
}
