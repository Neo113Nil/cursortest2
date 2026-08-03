package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqx {
    private final android.content.Context zza;
    private final com.google.android.gms.ads.h5.OnH5AdsEventListener zzb;
    private com.google.android.gms.internal.ads.zzbqt zzc;

    public zzbqx(android.content.Context context, com.google.android.gms.ads.h5.OnH5AdsEventListener onH5AdsEventListener) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(context);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(onH5AdsEventListener);
        this.zza = context;
        this.zzb = onH5AdsEventListener;
        com.google.android.gms.internal.ads.zzbiq.zza(context);
    }

    public static final boolean zzc(java.lang.String str) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlq)).booleanValue()) {
            return false;
        }
        com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        if (str.length() > ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzls)).intValue()) {
            com.google.android.gms.ads.internal.util.client.zzo.zzd("H5 GMSG exceeds max length");
            return false;
        }
        android.net.Uri parse = android.net.Uri.parse(str);
        return "gmsg".equals(parse.getScheme()) && "mobileads.google.com".equals(parse.getHost()) && "/h5ads".equals(parse.getPath());
    }

    private final void zzd() {
        if (this.zzc != null) {
            return;
        }
        this.zzc = com.google.android.gms.ads.internal.client.zzay.zzb().zzk(this.zza, new com.google.android.gms.internal.ads.zzbuy(), this.zzb);
    }

    public final boolean zza(java.lang.String str) {
        if (!zzc(str)) {
            return false;
        }
        zzd();
        com.google.android.gms.internal.ads.zzbqt zzbqtVar = this.zzc;
        if (zzbqtVar == null) {
            return false;
        }
        try {
            zzbqtVar.zze(str);
            return true;
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return true;
        }
    }

    public final void zzb() {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlq)).booleanValue()) {
            zzd();
            com.google.android.gms.internal.ads.zzbqt zzbqtVar = this.zzc;
            if (zzbqtVar != null) {
                try {
                    zzbqtVar.zzf();
                } catch (android.os.RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
