package com.google.android.gms.internal.ads;

import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzexd implements zzfdg {

    @Nullable
    private final Integer zza;

    private zzexd(@Nullable Integer num) {
        this.zza = num;
    }

    static /* synthetic */ zzexd zzb(VersionInfoParcel versionInfoParcel) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlH)).booleanValue()) {
            return new zzexd(null);
        }
        com.google.android.gms.ads.internal.zzt.zzc();
        int i = 0;
        try {
            if (Build.VERSION.SDK_INT < 30 || SdkExtensions.getExtensionVersion(30) <= 3) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlK)).booleanValue()) {
                    if (versionInfoParcel.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzlJ)).intValue() && Build.VERSION.SDK_INT >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                        i = SdkExtensions.getExtensionVersion(31);
                    }
                }
            } else {
                i = SdkExtensions.getExtensionVersion(1000000);
            }
        } catch (Exception e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzexd(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.internal.ads.zzfdg
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Integer num = this.zza;
        Bundle bundle = (Bundle) obj;
        if (num != null) {
            bundle.putInt("aos", num.intValue());
        }
    }
}
