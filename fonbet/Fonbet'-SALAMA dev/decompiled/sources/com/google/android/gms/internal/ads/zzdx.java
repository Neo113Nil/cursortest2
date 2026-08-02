package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzdx {
    final /* synthetic */ zzeb zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzdx(zzeb zzebVar, zzyx zzyxVar, Executor executor) {
        this.zza = zzebVar;
        this.zzb = new WeakReference(zzyxVar);
        this.zzc = executor;
    }

    public static /* synthetic */ void zza(zzdx zzdxVar) {
        zzyx zzyxVar = (zzyx) zzdxVar.zzb.get();
        if (zzyxVar != null) {
            zzyxVar.zza.zzl(zzdxVar.zza.zza());
        }
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdw
            @Override // java.lang.Runnable
            public final void run() {
                zzdx.zza(zzdx.this);
            }
        });
    }

    public final boolean zzc() {
        return this.zzb.get() == null;
    }
}
