package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbyb implements android.content.DialogInterface.OnClickListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbyd zzc;

    zzbyb(com.google.android.gms.internal.ads.zzbyd zzbydVar, java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
        java.util.Objects.requireNonNull(zzbydVar);
        this.zzc = zzbydVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        android.app.DownloadManager downloadManager = (android.app.DownloadManager) this.zzc.zzb().getSystemService(com.vungle.ads.internal.presenter.NativeAdPresenter.DOWNLOAD);
        try {
            java.lang.String str = this.zza;
            java.lang.String str2 = this.zzb;
            android.app.DownloadManager.Request request = new android.app.DownloadManager.Request(android.net.Uri.parse(str));
            request.setDestinationInExternalPublicDir(android.os.Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzt.zzc();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (java.lang.IllegalStateException unused) {
            this.zzc.zzg("Could not store picture.");
        }
    }
}
