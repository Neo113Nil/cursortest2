package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyd extends com.google.android.gms.internal.ads.zzbyg {
    private final java.util.Map zza;
    private final android.content.Context zzb;

    public zzbyd(com.google.android.gms.internal.ads.zzcku zzckuVar, java.util.Map map) {
        super(zzckuVar, "storePicture");
        this.zza = map;
        this.zzb = zzckuVar.zzj();
    }

    public final void zza() {
        android.content.Context context = this.zzb;
        if (context == null) {
            zzg("Activity context is not available");
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        if (!new com.google.android.gms.internal.ads.zzbhx(context).zza()) {
            zzg("Feature is not supported by the device.");
            return;
        }
        java.lang.String str = (java.lang.String) this.zza.get("iurl");
        if (android.text.TextUtils.isEmpty(str)) {
            zzg("Image url cannot be empty.");
            return;
        }
        if (!android.webkit.URLUtil.isValidUrl(str)) {
            java.lang.String.valueOf(str);
            zzg("Invalid image url: ".concat(java.lang.String.valueOf(str)));
            return;
        }
        java.lang.String lastPathSegment = android.net.Uri.parse(str).getLastPathSegment();
        com.google.android.gms.ads.internal.zzt.zzc();
        if (android.text.TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
            java.lang.String.valueOf(lastPathSegment);
            zzg("Image type not recognized: ".concat(java.lang.String.valueOf(lastPathSegment)));
            return;
        }
        android.content.res.Resources zzf = com.google.android.gms.ads.internal.zzt.zzh().zzf();
        com.google.android.gms.ads.internal.zzt.zzc();
        android.app.AlertDialog.Builder zzN = com.google.android.gms.ads.internal.util.zzs.zzN(context);
        zzN.setTitle(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s1) : "Save image");
        zzN.setMessage(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s2) : "Allow Ad to store image in Picture gallery?");
        zzN.setPositiveButton(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s3) : com.google.common.net.HttpHeaders.ACCEPT, new com.google.android.gms.internal.ads.zzbyb(this, str, lastPathSegment));
        zzN.setNegativeButton(zzf != null ? zzf.getString(com.google.android.gms.ads.impl.R.string.s4) : "Decline", new com.google.android.gms.internal.ads.zzbyc(this));
        zzN.create().show();
    }

    final /* synthetic */ android.content.Context zzb() {
        return this.zzb;
    }
}
