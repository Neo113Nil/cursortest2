package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzbam extends zzbzf {
    final /* synthetic */ zzbas zza;

    public zzbam(zzbas zzbasVar) {
        this.zza = zzbasVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzf, java.util.concurrent.Future
    public final boolean cancel(boolean z4) {
        zzbas.zze(this.zza);
        return super.cancel(z4);
    }
}
