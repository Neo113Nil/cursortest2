package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzbnh {
    private final Object zza = new Object();
    private final Object zzb = new Object();
    private zzbnq zzc;
    private zzbnq zzd;

    private static final Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final zzbnq zza(Context context, VersionInfoParcel versionInfoParcel, zzfgb zzfgbVar) {
        zzbnq zzbnqVar;
        synchronized (this.zza) {
            try {
                if (this.zzc == null) {
                    this.zzc = new zzbnq(zzc(context), versionInfoParcel, (String) C0254t.f2723d.f2726c.zzb(zzbby.zza), zzfgbVar);
                }
                zzbnqVar = this.zzc;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbnqVar;
    }

    public final zzbnq zzb(Context context, VersionInfoParcel versionInfoParcel, zzfgb zzfgbVar) {
        zzbnq zzbnqVar;
        synchronized (this.zzb) {
            try {
                if (this.zzd == null) {
                    this.zzd = new zzbnq(zzc(context), versionInfoParcel, (String) zzbei.zza.zze(), zzfgbVar);
                }
                zzbnqVar = this.zzd;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbnqVar;
    }
}
