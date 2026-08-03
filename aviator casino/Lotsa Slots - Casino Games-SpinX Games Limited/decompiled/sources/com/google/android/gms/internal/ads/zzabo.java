package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzabo {
    private final java.util.concurrent.CopyOnWriteArrayList zza = new java.util.concurrent.CopyOnWriteArrayList();

    public final void zza(android.os.Handler handler, com.google.android.gms.internal.ads.zzabp zzabpVar) {
        zzb(zzabpVar);
        this.zza.add(new com.google.android.gms.internal.ads.zzabn(handler, zzabpVar));
    }

    public final void zzb(com.google.android.gms.internal.ads.zzabp zzabpVar) {
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.zza;
        java.util.Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zzabn zzabnVar = (com.google.android.gms.internal.ads.zzabn) it.next();
            if (zzabnVar.zzc() == zzabpVar) {
                zzabnVar.zza();
                copyOnWriteArrayList.remove(zzabnVar);
            }
        }
    }

    public final void zzc(final int i, final long j, final long j2) {
        java.util.Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            final com.google.android.gms.internal.ads.zzabn zzabnVar = (com.google.android.gms.internal.ads.zzabn) it.next();
            if (!zzabnVar.zzd()) {
                zzabnVar.zzb().post(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzabm
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        com.google.android.gms.internal.ads.zzabn.this.zzc().zzX(i, j, j2);
                    }
                });
            }
        }
    }
}
