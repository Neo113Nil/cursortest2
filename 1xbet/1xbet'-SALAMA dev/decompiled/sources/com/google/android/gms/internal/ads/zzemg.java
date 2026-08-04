package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzemg implements zzesg {
    private final Integer zza;

    private zzemg(Integer num) {
        this.zza = num;
    }

    public static zzemg zzc(VersionInfoParcel versionInfoParcel) {
        zzbbp zzbbpVar = zzbby.zzka;
        C0254t c0254t = C0254t.f2723d;
        zzbbw zzbbwVar = c0254t.f2726c;
        zzbbw zzbbwVar2 = c0254t.f2726c;
        if (!((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            return new zzemg(null);
        }
        P p5 = o.f1952C.f1957c;
        int extensionVersion = 0;
        try {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
                extensionVersion = SdkExtensions.getExtensionVersion(1000000);
            } else if (((Boolean) zzbbwVar2.zzb(zzbby.zzkd)).booleanValue() && versionInfoParcel.f10836c >= ((Integer) zzbbwVar2.zzb(zzbby.zzkc)).intValue() && i7 >= 31 && SdkExtensions.getExtensionVersion(31) >= 9) {
                extensionVersion = SdkExtensions.getExtensionVersion(31);
            }
        } catch (Exception e7) {
            o.f1952C.f1961g.zzw(e7, "AdUtil.getAdServicesExtensionVersion");
        }
        return new zzemg(Integer.valueOf(extensionVersion));
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzesg
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Integer num = this.zza;
        zzcts zzctsVar = (zzcts) obj;
        if (num != null) {
            zzctsVar.zza.putInt("aos", num.intValue());
        }
    }
}
