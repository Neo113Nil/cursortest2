package com.google.android.gms.ads.internal.overlay;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzn {
    public static final void zza(android.content.Context context, com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel adOverlayInfoParcel, boolean z, com.google.android.gms.internal.ads.zzdzl zzdzlVar) {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel.zzb;
            if (zzaVar != null) {
                zzaVar.onAdClicked();
            }
            com.google.android.gms.internal.ads.zzdky zzdkyVar = adOverlayInfoParcel.zzu;
            if (zzdkyVar != null) {
                zzdkyVar.zzdu();
            }
            android.app.Activity zzj = adOverlayInfoParcel.zzd.zzj();
            com.google.android.gms.ads.internal.overlay.zzc zzcVar = adOverlayInfoParcel.zza;
            android.content.Context context2 = (zzcVar == null || !zzcVar.zzj || zzj == null) ? context : zzj;
            com.google.android.gms.ads.internal.zzt.zza();
            com.google.android.gms.ads.internal.overlay.zza.zzb(context2, zzcVar, adOverlayInfoParcel.zzi, zzcVar != null ? zzcVar.zzi : null, zzdzlVar, adOverlayInfoParcel.zzq);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.setClassName(context, com.google.android.gms.ads.AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.isClientJar);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        android.os.Bundle bundle = new android.os.Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzoD)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzac(context, intent, zzdzlVar, adOverlayInfoParcel.zzq);
        } else {
            com.google.android.gms.ads.internal.zzt.zzc();
            com.google.android.gms.ads.internal.util.zzs.zzY(context, intent);
        }
    }
}
