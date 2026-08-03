package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewf implements com.google.android.gms.internal.ads.zzfci {

    @javax.annotation.Nullable
    private final java.lang.Integer zza;

    private zzewf(@javax.annotation.Nullable java.lang.Integer num) {
        this.zza = num;
    }

    static /* synthetic */ com.google.android.gms.internal.ads.zzewf zzb(com.google.android.gms.ads.internal.util.client.VersionInfoParcel versionInfoParcel) {
        if (!((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlw)).booleanValue()) {
            return new com.google.android.gms.internal.ads.zzewf(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int i = 0;
        try {
            if (android.os.Build.VERSION.SDK_INT < 30 || android.os.ext.SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlz)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((java.lang.Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzly)).intValue() && android.os.Build.VERSION.SDK_INT >= 31 && android.os.ext.SdkExtensions.getExtensionVersion(31) >= 9) {
                        i = android.os.ext.SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                i = android.os.ext.SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (java.lang.Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new com.google.android.gms.internal.ads.zzewf(java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.lang.Integer num = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
