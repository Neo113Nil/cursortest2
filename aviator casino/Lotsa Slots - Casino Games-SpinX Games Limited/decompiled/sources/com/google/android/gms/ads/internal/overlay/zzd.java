package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzd implements android.view.View.OnClickListener {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzm zza;

    zzd(com.google.android.gms.ads.internal.overlay.zzm zzmVar) {
        java.util.Objects.requireNonNull(zzmVar);
        this.zza = zzmVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zza;
        zzmVar.zzn = 2;
        zzmVar.zzb.finish();
    }
}
