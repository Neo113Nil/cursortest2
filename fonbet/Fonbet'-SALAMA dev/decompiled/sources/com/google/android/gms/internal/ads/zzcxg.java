package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class zzcxg implements Runnable {
    private final WeakReference zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzcxi zzcxiVar = (zzcxi) this.zza.get();
        if (zzcxiVar != null) {
            zzcxiVar.zzq(new zzdaf() { // from class: com.google.android.gms.internal.ads.zzcxe
                @Override // com.google.android.gms.internal.ads.zzdaf
                public final void zza(Object obj) {
                    ((zzcxc) obj).zzb();
                }
            });
        }
    }
}
