package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzav implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ android.content.Context zza;

    zzav(com.google.android.gms.ads.internal.util.zzaw zzawVar, android.content.Context context) {
        this.zza = context;
        java.util.Objects.requireNonNull(zzawVar);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        com.google.android.gms.ads.internal.zzt.zzc();
        com.google.android.gms.ads.internal.util.zzs.zzZ(this.zza, android.net.Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
