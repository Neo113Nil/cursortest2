package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class zzva {
    public final int zza;
    public final zzuq zzb;
    private final CopyOnWriteArrayList zzc;

    private zzva(CopyOnWriteArrayList copyOnWriteArrayList, int i7, zzuq zzuqVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzuqVar;
    }

    public final zzva zza(int i7, zzuq zzuqVar) {
        return new zzva(this.zzc, 0, zzuqVar);
    }

    public final void zzb(Handler handler, zzvb zzvbVar) {
        this.zzc.add(new zzuz(handler, zzvbVar));
    }

    public final void zzc(final zzdd zzddVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            final zzvb zzvbVar = zzuzVar.zzb;
            Handler handler = zzuzVar.zza;
            Runnable runnable = new Runnable() { // from class: com.google.android.gms.internal.ads.zzuy
                @Override // java.lang.Runnable
                public final void run() {
                    zzdd.this.zza(zzvbVar);
                }
            };
            int i7 = zzen.zza;
            if (handler.getLooper().getThread().isAlive()) {
                if (handler.getLooper() == Looper.myLooper()) {
                    runnable.run();
                } else {
                    handler.post(runnable);
                }
            }
        }
    }

    public final void zzd(final zzum zzumVar) {
        zzc(new zzdd() { // from class: com.google.android.gms.internal.ads.zzut
            @Override // com.google.android.gms.internal.ads.zzdd
            public final void zza(Object obj) {
                ((zzvb) obj).zzag(0, zzva.this.zzb, zzumVar);
            }
        });
    }

    public final void zze(final zzuh zzuhVar, final zzum zzumVar) {
        zzc(new zzdd() { // from class: com.google.android.gms.internal.ads.zzux
            @Override // com.google.android.gms.internal.ads.zzdd
            public final void zza(Object obj) {
                ((zzvb) obj).zzah(0, zzva.this.zzb, zzuhVar, zzumVar);
            }
        });
    }

    public final void zzf(final zzuh zzuhVar, final zzum zzumVar) {
        zzc(new zzdd() { // from class: com.google.android.gms.internal.ads.zzuv
            @Override // com.google.android.gms.internal.ads.zzdd
            public final void zza(Object obj) {
                ((zzvb) obj).zzai(0, zzva.this.zzb, zzuhVar, zzumVar);
            }
        });
    }

    public final void zzg(final zzuh zzuhVar, final zzum zzumVar, final IOException iOException, final boolean z4) {
        zzc(new zzdd() { // from class: com.google.android.gms.internal.ads.zzuw
            @Override // com.google.android.gms.internal.ads.zzdd
            public final void zza(Object obj) {
                ((zzvb) obj).zzaj(0, zzva.this.zzb, zzuhVar, zzumVar, iOException, z4);
            }
        });
    }

    public final void zzh(final zzuh zzuhVar, final zzum zzumVar, final int i7) {
        zzc(new zzdd() { // from class: com.google.android.gms.internal.ads.zzuu
            @Override // com.google.android.gms.internal.ads.zzdd
            public final void zza(Object obj) {
                ((zzvb) obj).zzak(0, zzva.this.zzb, zzuhVar, zzumVar, i7);
            }
        });
    }

    public final void zzi(zzvb zzvbVar) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzuz zzuzVar = (zzuz) it.next();
            if (zzuzVar.zzb == zzvbVar) {
                this.zzc.remove(zzuzVar);
            }
        }
    }

    public zzva() {
        this(new CopyOnWriteArrayList(), 0, null);
    }
}
