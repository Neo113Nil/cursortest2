package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzo extends android.webkit.WebViewClient {
    final /* synthetic */ com.google.android.gms.ads.internal.zzs zza;

    zzo(com.google.android.gms.ads.internal.zzs zzsVar) {
        java.util.Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(android.webkit.WebView webView, android.webkit.WebResourceRequest webResourceRequest, android.webkit.WebResourceError webResourceError) {
        com.google.android.gms.ads.internal.zzs zzsVar = this.zza;
        if (zzsVar.zzX() != null) {
            try {
                zzsVar.zzX().zzd(com.google.android.gms.internal.ads.zzfma.zzd(1, null, null));
            } catch (android.os.RemoteException e) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            }
        }
        com.google.android.gms.ads.internal.zzs zzsVar2 = this.zza;
        if (zzsVar2.zzX() != null) {
            try {
                zzsVar2.zzX().zzc(0);
            } catch (android.os.RemoteException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(android.webkit.WebView webView, java.lang.String str) {
        com.google.android.gms.ads.internal.zzs zzsVar = this.zza;
        if (str.startsWith(zzsVar.zzO())) {
            return false;
        }
        if (str.startsWith("gmsg://noAdLoaded")) {
            if (zzsVar.zzX() != null) {
                try {
                    zzsVar.zzX().zzd(com.google.android.gms.internal.ads.zzfma.zzd(3, null, null));
                } catch (android.os.RemoteException e) {
                    int i = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
            com.google.android.gms.ads.internal.zzs zzsVar2 = this.zza;
            if (zzsVar2.zzX() != null) {
                try {
                    zzsVar2.zzX().zzc(3);
                } catch (android.os.RemoteException e2) {
                    int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e2);
                }
            }
            this.zza.zzM(0);
            return true;
        }
        if (str.startsWith("gmsg://scriptLoadFailed")) {
            com.google.android.gms.ads.internal.zzs zzsVar3 = this.zza;
            if (zzsVar3.zzX() != null) {
                try {
                    zzsVar3.zzX().zzd(com.google.android.gms.internal.ads.zzfma.zzd(1, null, null));
                } catch (android.os.RemoteException e3) {
                    int i3 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e3);
                }
            }
            com.google.android.gms.ads.internal.zzs zzsVar4 = this.zza;
            if (zzsVar4.zzX() != null) {
                try {
                    zzsVar4.zzX().zzc(0);
                } catch (android.os.RemoteException e4) {
                    int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e4);
                }
            }
            this.zza.zzM(0);
            return true;
        }
        if (str.startsWith("gmsg://adResized")) {
            com.google.android.gms.ads.internal.zzs zzsVar5 = this.zza;
            if (zzsVar5.zzX() != null) {
                try {
                    zzsVar5.zzX().zzf();
                } catch (android.os.RemoteException e5) {
                    int i5 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e5);
                }
            }
            com.google.android.gms.ads.internal.zzs zzsVar6 = this.zza;
            zzsVar6.zzM(zzsVar6.zzL(str));
            return true;
        }
        if (str.startsWith("gmsg://")) {
            return true;
        }
        com.google.android.gms.ads.internal.zzs zzsVar7 = this.zza;
        if (zzsVar7.zzX() != null) {
            try {
                zzsVar7.zzX().zzh();
                zzsVar7.zzX().zze();
            } catch (android.os.RemoteException e6) {
                int i6 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e6);
            }
        }
        this.zza.zzV(str);
        return true;
    }
}
