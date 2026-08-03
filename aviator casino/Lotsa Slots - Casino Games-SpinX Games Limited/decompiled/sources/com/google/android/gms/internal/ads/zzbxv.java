package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbxv implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbxx zza;

    zzbxv(com.google.android.gms.internal.ads.zzbxx zzbxxVar) {
        java.util.Objects.requireNonNull(zzbxxVar);
        this.zza = zzbxxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        com.google.android.gms.internal.ads.zzbxx zzbxxVar = this.zza;
        android.content.Intent zzb = zzbxxVar.zzb();
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzY(zzbxxVar.zzc(), zzb);
    }
}
