package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbyc implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyd zza;

    zzbyc(com.google.android.gms.internal.ads.zzbyd zzbydVar) {
        java.util.Objects.requireNonNull(zzbydVar);
        this.zza = zzbydVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.zzg("User canceled the download.");
    }
}
