package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzkx implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ Uri zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzky zze;

    public zzkx(zzky zzkyVar, boolean z, Uri uri, String str, String str2) {
        this.zza = z;
        this.zzb = uri;
        this.zzc = str;
        this.zzd = str2;
        Objects.requireNonNull(zzkyVar);
        this.zze = zzkyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e0 A[Catch: RuntimeException -> 0x0079, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0079, blocks: (B:3:0x000f, B:9:0x0097, B:11:0x00a1, B:14:0x00ae, B:16:0x00b4, B:17:0x00ce, B:18:0x00d9, B:23:0x00e0, B:27:0x0101, B:29:0x0119, B:31:0x010b, B:32:0x011d, B:34:0x0123, B:36:0x0129, B:38:0x012f, B:40:0x0135, B:42:0x013d, B:44:0x0145, B:46:0x014b, B:49:0x014f, B:53:0x002b, B:55:0x0031, B:57:0x0039, B:59:0x003f, B:61:0x0045, B:63:0x004b, B:65:0x0053, B:67:0x005b, B:69:0x0063, B:71:0x006b, B:72:0x007c, B:74:0x008a), top: B:2:0x000f }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bundle zzi;
        zzic zzicVar;
        Bundle zzi2;
        zzky zzkyVar = this.zze;
        zzlj zzljVar = zzkyVar.zza;
        zzljVar.zzg();
        String str = this.zzd;
        Uri uri = this.zzb;
        try {
            zzic zzicVar2 = zzljVar.zzu;
            zzpp zzk = zzicVar2.zzk();
            if (!TextUtils.isEmpty(str)) {
                if (str.contains("gclid") || str.contains("gbraid") || str.contains("utm_campaign") || str.contains("utm_source") || str.contains("utm_medium") || str.contains("utm_id") || str.contains("dclid") || str.contains("srsltid") || str.contains("sfmc_id")) {
                    zzi = zzk.zzi(Uri.parse("https://google.com/search?".concat(str)));
                    if (zzi != null) {
                        zzi.putString("_cis", "referrer");
                    }
                    String str2 = this.zzc;
                    if (this.zza || (zzi2 = zzicVar2.zzk().zzi(uri)) == null) {
                        zzicVar = zzicVar2;
                    } else {
                        zzi2.putString("_cis", "intent");
                        if (zzi2.containsKey("gclid") || zzi == null || !zzi.containsKey("gclid")) {
                            zzicVar = zzicVar2;
                        } else {
                            zzicVar = zzicVar2;
                            zzi2.putString("_cer", "gclid=" + zzi.getString("gclid"));
                        }
                        zzljVar.zzF(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi2);
                        zzljVar.zzb.zzb(str2, zzi2);
                    }
                    if (TextUtils.isEmpty(str)) {
                        zzicVar.zzaV().zzj().zzb("Activity created with referrer", str);
                        if (zzicVar.zzc().zzp(null, zzfy.zzaG)) {
                            if (zzi != null) {
                                zzljVar.zzF(str2, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zzi);
                                zzljVar.zzb.zzb(str2, zzi);
                            } else {
                                zzicVar.zzaV().zzj().zzb("Referrer does not contain valid parameters", str);
                            }
                            zzljVar.zzK("auto", "_ldl", null, true);
                            return;
                        }
                        if (!str.contains("gclid") || (!str.contains("utm_campaign") && !str.contains("utm_source") && !str.contains("utm_medium") && !str.contains("utm_term") && !str.contains("utm_content"))) {
                            zzicVar.zzaV().zzj().zza("Activity created with data 'referrer' without required params");
                            return;
                        } else {
                            if (TextUtils.isEmpty(str)) {
                                return;
                            }
                            zzljVar.zzK("auto", "_ldl", str, true);
                            return;
                        }
                    }
                    return;
                }
                zzk.zzu.zzaV().zzj().zza("Activity created with data 'referrer' without required params");
            }
            zzi = null;
            String str22 = this.zzc;
            if (this.zza) {
            }
            zzicVar = zzicVar2;
            if (TextUtils.isEmpty(str)) {
            }
        } catch (RuntimeException e) {
            zzkyVar.zza.zzu.zzaV().zzb().zzb("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }
}
