package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbcz implements Callable {
    private final zzbcg zza;
    private final zzaya zzb;

    public zzbcz(zzbcg zzbcgVar, zzaya zzayaVar) {
        this.zza = zzbcgVar;
        this.zzb = zzayaVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzbcg zzbcgVar = this.zza;
        if (zzbcgVar.zzm() != null) {
            zzbcgVar.zzm().get();
        }
        zzaza zzl = zzbcgVar.zzl();
        if (zzl == null) {
            return null;
        }
        try {
            zzaya zzayaVar = this.zzb;
            synchronized (zzayaVar) {
                zzayaVar.zzaY(zzl.zzaN(), zziew.zzb());
            }
            return null;
        } catch (zzige | NullPointerException unused) {
            return null;
        }
    }
}
