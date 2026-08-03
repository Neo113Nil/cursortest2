package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzxu {
    public final int zza;
    public final com.google.android.gms.internal.ads.zzxk zzb;
    private final java.util.concurrent.CopyOnWriteArrayList zzc;

    public zzxu() {
        this(new java.util.concurrent.CopyOnWriteArrayList(), 0, null);
    }

    private zzxu(java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        this.zzc = copyOnWriteArrayList;
        this.zza = 0;
        this.zzb = zzxkVar;
    }

    public final com.google.android.gms.internal.ads.zzxu zza(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        return new com.google.android.gms.internal.ads.zzxu(this.zzc, 0, zzxkVar);
    }

    public final void zzb(android.os.Handler handler, com.google.android.gms.internal.ads.zzxv zzxvVar) {
        this.zzc.add(new com.google.android.gms.internal.ads.zzxn(handler, zzxvVar));
    }

    public final void zzc(com.google.android.gms.internal.ads.zzxv zzxvVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.zzc;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzxn zzxnVar = (com.google.android.gms.internal.ads.zzxn) it.next();
            if (zzxnVar.zzb == zzxvVar) {
                copyOnWriteArrayList.remove(zzxnVar);
            }
        }
    }

    public final void zzd(final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar, final int i) {
        zzi(new com.google.android.gms.internal.ads.zzdt() { // from class: com.google.android.gms.internal.ads.zzxt
            @Override // com.google.android.gms.internal.ads.zzdt
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzxv) obj).zzai(0, com.google.android.gms.internal.ads.zzxu.this.zzb, zzxbVar, zzxgVar, i);
            }
        });
    }

    public final void zze(final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        zzi(new com.google.android.gms.internal.ads.zzdt() { // from class: com.google.android.gms.internal.ads.zzxo
            @Override // com.google.android.gms.internal.ads.zzdt
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzxv) obj).zzaj(0, com.google.android.gms.internal.ads.zzxu.this.zzb, zzxbVar, zzxgVar);
            }
        });
    }

    public final void zzf(final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        zzi(new com.google.android.gms.internal.ads.zzdt() { // from class: com.google.android.gms.internal.ads.zzxp
            @Override // com.google.android.gms.internal.ads.zzdt
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzxv) obj).zzak(0, com.google.android.gms.internal.ads.zzxu.this.zzb, zzxbVar, zzxgVar);
            }
        });
    }

    public final void zzg(final com.google.android.gms.internal.ads.zzxb zzxbVar, final com.google.android.gms.internal.ads.zzxg zzxgVar, final java.io.IOException iOException, final boolean z) {
        zzi(new com.google.android.gms.internal.ads.zzdt() { // from class: com.google.android.gms.internal.ads.zzxq
            @Override // com.google.android.gms.internal.ads.zzdt
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzxv) obj).zzal(0, com.google.android.gms.internal.ads.zzxu.this.zzb, zzxbVar, zzxgVar, iOException, z);
            }
        });
    }

    public final void zzh(final com.google.android.gms.internal.ads.zzxg zzxgVar) {
        zzi(new com.google.android.gms.internal.ads.zzdt() { // from class: com.google.android.gms.internal.ads.zzxr
            @Override // com.google.android.gms.internal.ads.zzdt
            public final /* synthetic */ void zza(java.lang.Object obj) {
                ((com.google.android.gms.internal.ads.zzxv) obj).zzam(0, com.google.android.gms.internal.ads.zzxu.this.zzb, zzxgVar);
            }
        });
    }

    public final void zzi(final com.google.android.gms.internal.ads.zzdt zzdtVar) {
        java.util.Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzxn zzxnVar = (com.google.android.gms.internal.ads.zzxn) it.next();
            final com.google.android.gms.internal.ads.zzxv zzxvVar = zzxnVar.zzb;
            com.google.android.gms.internal.ads.zzfl.zze(zzxnVar.zza, new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzxs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.internal.ads.zzdt.this.zza(zzxvVar);
                }
            });
        }
    }
}
