package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbxw implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbxx zza;

    zzbxw(com.google.android.gms.internal.ads.zzbxx zzbxxVar) {
        java.util.Objects.requireNonNull(zzbxxVar);
        this.zza = zzbxxVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        this.zza.zzg("Operation denied by user.");
    }
}
