package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.firebase.messaging.Constants;
import kotlinx.coroutines.DebugKt;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
final class zzlk implements Application.ActivityLifecycleCallbacks, zzll {
    private final /* synthetic */ zzju zza;

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d4 A[Catch: RuntimeException -> 0x015c, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x015c, blocks: (B:3:0x0005, B:9:0x008e, B:11:0x009a, B:14:0x00a7, B:16:0x00ad, B:17:0x00c0, B:18:0x00cc, B:23:0x00d4, B:27:0x00f8, B:28:0x0114, B:30:0x0105, B:31:0x011a, B:33:0x0120, B:35:0x0126, B:37:0x012c, B:39:0x0132, B:41:0x013a, B:43:0x0142, B:45:0x0148, B:48:0x014e, B:50:0x0020, B:52:0x0026, B:54:0x002e, B:56:0x0034, B:58:0x003a, B:60:0x0040, B:62:0x0048, B:64:0x0050, B:66:0x0058, B:68:0x0060, B:69:0x006c, B:71:0x0085), top: B:2:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static /* synthetic */ void zza(zzlk zzlkVar, boolean z, Uri uri, String str, String str2) {
        Bundle zza;
        Bundle zza2;
        zzlkVar.zza.zzv();
        try {
            zzpn zzs = zzlkVar.zza.zzs();
            if (!TextUtils.isEmpty(str2)) {
                if (str2.contains("gclid") || str2.contains("gbraid") || str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains("utm_medium") || str2.contains("utm_id") || str2.contains("dclid") || str2.contains("srsltid") || str2.contains("sfmc_id")) {
                    zza = zzs.zza(Uri.parse("https://google.com/search?" + str2));
                    if (zza != null) {
                        zza.putString("_cis", "referrer");
                    }
                    if (z && (zza2 = zzlkVar.zza.zzs().zza(uri)) != null) {
                        zza2.putString("_cis", "intent");
                        if (!zza2.containsKey("gclid") && zza != null && zza.containsKey("gclid")) {
                            zza2.putString("_cer", String.format("gclid=%s", zza.getString("gclid")));
                        }
                        zzlkVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zza2);
                        zzlkVar.zza.zza.zza(str, zza2);
                    }
                    if (TextUtils.isEmpty(str2)) {
                        zzlkVar.zza.zzj().zzc().zza("Activity created with referrer", str2);
                        if (zzlkVar.zza.zze().zza(zzbn.zzca)) {
                            if (zza != null) {
                                zzlkVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zza);
                                zzlkVar.zza.zza.zza(str, zza);
                            } else {
                                zzlkVar.zza.zzj().zzc().zza("Referrer does not contain valid parameters", str2);
                            }
                            zzlkVar.zza.zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", (Object) null, true);
                            return;
                        }
                        if (!str2.contains("gclid") || (!str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_term") && !str2.contains("utm_content"))) {
                            zzlkVar.zza.zzj().zzc().zza("Activity created with data 'referrer' without required params");
                            return;
                        } else {
                            if (TextUtils.isEmpty(str2)) {
                                return;
                            }
                            zzlkVar.zza.zza(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_ldl", (Object) str2, true);
                            return;
                        }
                    }
                    return;
                }
                zzs.zzj().zzc().zza("Activity created with data 'referrer' without required params");
            }
            zza = null;
            if (z) {
                zza2.putString("_cis", "intent");
                if (!zza2.containsKey("gclid")) {
                    zza2.putString("_cer", String.format("gclid=%s", zza.getString("gclid")));
                }
                zzlkVar.zza.zzc(str, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, zza2);
                zzlkVar.zza.zza.zza(str, zza2);
            }
            if (TextUtils.isEmpty(str2)) {
            }
        } catch (RuntimeException e) {
            zzlkVar.zza.zzj().zzg().zza("Throwable caught in handleReferrerForOnActivityCreated", e);
        }
    }

    zzlk(zzju zzjuVar) {
        this.zza = zzjuVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        zza(com.google.android.gms.internal.measurement.zzeb.zza(activity), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzll
    public final void zza(com.google.android.gms.internal.measurement.zzeb zzebVar, Bundle bundle) {
        zzlk zzlkVar;
        String str;
        try {
            this.zza.zzj().zzq().zza("onActivityCreated");
            Intent intent = zzebVar.zzc;
            if (intent == null) {
                this.zza.zzp().zza(zzebVar, bundle);
                return;
            }
            Uri data = intent.getData();
            if (data == null || !data.isHierarchical()) {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                    }
                }
                data = null;
            }
            Uri uri = data;
            if (uri != null && uri.isHierarchical()) {
                this.zza.zzs();
                if (zzpn.zza(intent)) {
                    str = "gs";
                } else {
                    str = DebugKt.DEBUG_PROPERTY_VALUE_AUTO;
                }
                String str2 = str;
                String queryParameter = uri.getQueryParameter("referrer");
                zzlkVar = this;
                try {
                    try {
                        this.zza.zzl().zzb(new zzln(zzlkVar, bundle == null, uri, str2, queryParameter));
                        zzlkVar.zza.zzp().zza(zzebVar, bundle);
                        return;
                    } catch (RuntimeException e) {
                        e = e;
                        zzlkVar.zza.zzj().zzg().zza("Throwable caught in onActivityCreated", e);
                        zzlkVar.zza.zzp().zza(zzebVar, bundle);
                        return;
                    }
                } catch (Throwable th) {
                    th = th;
                    zzlkVar.zza.zzp().zza(zzebVar, bundle);
                    throw th;
                }
            }
            this.zza.zzp().zza(zzebVar, bundle);
        } catch (RuntimeException e2) {
            e = e2;
            zzlkVar = this;
        } catch (Throwable th2) {
            th = th2;
            zzlkVar = this;
            zzlkVar.zza.zzp().zza(zzebVar, bundle);
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        zza(com.google.android.gms.internal.measurement.zzeb.zza(activity));
    }

    @Override // com.google.android.gms.measurement.internal.zzll
    public final void zza(com.google.android.gms.internal.measurement.zzeb zzebVar) {
        this.zza.zzp().zza(zzebVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        zzb(com.google.android.gms.internal.measurement.zzeb.zza(activity));
    }

    @Override // com.google.android.gms.measurement.internal.zzll
    public final void zzb(com.google.android.gms.internal.measurement.zzeb zzebVar) {
        this.zza.zzp().zzb(zzebVar);
        zznx zzr = this.zza.zzr();
        zzr.zzl().zzb(new zznz(zzr, zzr.zzb().elapsedRealtime()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        zzc(com.google.android.gms.internal.measurement.zzeb.zza(activity));
    }

    @Override // com.google.android.gms.measurement.internal.zzll
    public final void zzc(com.google.android.gms.internal.measurement.zzeb zzebVar) {
        zznx zzr = this.zza.zzr();
        zzr.zzl().zzb(new zznw(zzr, zzr.zzb().elapsedRealtime()));
        this.zza.zzp().zzc(zzebVar);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzb(com.google.android.gms.internal.measurement.zzeb.zza(activity), bundle);
    }

    @Override // com.google.android.gms.measurement.internal.zzll
    public final void zzb(com.google.android.gms.internal.measurement.zzeb zzebVar, Bundle bundle) {
        this.zza.zzp().zzb(zzebVar, bundle);
    }
}
