package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Locale;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzbur {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbva zzc;
    private zzbva zzd;

    private static final Context zzd(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private static final boolean zze(Context context) {
        if (((Boolean) zzbln.zzc.zze()).booleanValue()) {
            return false;
        }
        return com.google.android.gms.ads.internal.util.zzs.zzk(zzd(context)).zza().toLowerCase(Locale.ROOT).equals("ru");
    }

    public final zzbva zza(Context context, VersionInfoParcel versionInfoParcel, zzfrj zzfrjVar) {
        zzbva zzbvaVar;
        String str;
        synchronized (this.zzb) {
            if (this.zzd == null) {
                Context zzd = zzd(context);
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzc);
                } else {
                    str = (String) zzblr.zza.zze();
                }
                this.zzd = new zzbva(zzd, versionInfoParcel, str, zzfrjVar);
            }
            zzbvaVar = this.zzd;
        }
        return zzbvaVar;
    }

    public final zzbva zzb(Context context, VersionInfoParcel versionInfoParcel, zzfrj zzfrjVar) {
        zzbva zzbvaVar;
        String str;
        synchronized (this.zza) {
            if (this.zzc == null) {
                if (zze(context)) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzc);
                } else if (((Boolean) zzbln.zzh.zze()).booleanValue()) {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zza);
                } else {
                    str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzb);
                }
                this.zzc = new zzbva(zzd(context), versionInfoParcel, str, zzfrjVar);
            }
            zzbvaVar = this.zzc;
        }
        return zzbvaVar;
    }

    public final void zzc() {
        synchronized (this.zza) {
            zzbva zzbvaVar = this.zzc;
            if (zzbvaVar != null) {
                zzbvaVar.zzc();
                this.zzc = null;
            }
        }
    }
}
