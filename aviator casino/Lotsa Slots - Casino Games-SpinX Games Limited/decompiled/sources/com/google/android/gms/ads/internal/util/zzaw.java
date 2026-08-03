package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzaw implements java.lang.Runnable {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ boolean zzd;

    zzaw(com.google.android.gms.ads.internal.util.zzax zzaxVar, android.content.Context context, java.lang.String str, boolean z, boolean z2) {
        this.zza = context;
        this.zzb = str;
        this.zzc = z;
        this.zzd = z2;
        java.util.Objects.requireNonNull(zzaxVar);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.ads.internal.zzt.zzc();
        android.content.Context context = this.zza;
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        zzN.setMessage(this.zzb);
        if (this.zzc) {
            zzN.setTitle(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.c);
        } else {
            zzN.setTitle("Info");
        }
        if (this.zzd) {
            zzN.setNeutralButton("Dismiss", (android.content.DialogInterface.OnClickListener) null);
        } else {
            zzN.setPositiveButton("Learn More", new com.google.android.gms.ads.internal.util.zzav(this, context));
            zzN.setNegativeButton("Dismiss", (android.content.DialogInterface.OnClickListener) null);
        }
        zzN.create().show();
    }
}
