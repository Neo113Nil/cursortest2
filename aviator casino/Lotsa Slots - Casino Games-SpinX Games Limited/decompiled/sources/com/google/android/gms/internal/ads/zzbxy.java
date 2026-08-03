package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbxy implements android.view.View.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbya zza;

    zzbxy(com.google.android.gms.internal.ads.zzbya zzbyaVar) {
        java.util.Objects.requireNonNull(zzbyaVar);
        this.zza = zzbyaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        this.zza.zzb(true);
    }
}
