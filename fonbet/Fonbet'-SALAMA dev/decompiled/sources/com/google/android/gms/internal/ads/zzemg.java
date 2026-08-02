package com.google.android.gms.internal.ads;

import E2.o;
import F2.C0254t;
import I2.P;
import android.os.Build;
import android.os.ext.SdkExtensions;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* loaded from: classes.dex */
public final class zzemg implements zzesg {
    private final Integer zza;

    private zzemg(Integer num) {
        this.zza = num;
    }

    public static zzemg zzc(VersionInfoParcel versionInfoParcel) {
        int i7;
        int extensionVersion;
        int extensionVersion2;
        zzbbp zzbbpVar = zzbby.zzka;
        C0254t c0254t = C0254t.f2723d;
        zzbbw zzbbwVar = c0254t.f2726c;
        zzbbw zzbbwVar2 = c0254t.f2726c;
        if (!((Boolean) zzbbwVar.zzb(zzbbpVar)).booleanValue()) {
            return new zzemg(null);
        }
        P p5 = o.f1952C.f1957c;
        int i8 = 0;
        try {
            i7 = Build.VERSION.SDK_INT;
        } catch (Exception e7) {
            o.f1952C.f1961g.zzw(e7, "AdUtil.getAdServicesExtensionVersion");
        }
        if (i7 >= 30) {
            extensionVersion2 = SdkExtensions.getExtensionVersion(30);
            if (extensionVersion2 > 3) {
                i8 = SdkExtensions.getExtensionVersion(1000000);
                return new zzemg(Integer.valueOf(i8));
            }
        }
        if (((Boolean) zzbbwVar2.zzb(zzbby.zzkd)).booleanValue() && versionInfoParcel.f10836c >= ((Integer) zzbbwVar2.zzb(zzbby.zzkc)).intValue() && i7 >= 31) {
            extensionVersion = SdkExtensions.getExtensionVersion(31);
            if (extensionVersion >= 9) {
                i8 = SdkExtensions.getExtensionVersion(31);
            }
        }
        return new zzemg(Integer.valueOf(i8));
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
