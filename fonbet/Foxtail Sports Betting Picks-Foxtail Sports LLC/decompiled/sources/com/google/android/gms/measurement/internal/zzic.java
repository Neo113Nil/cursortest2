package com.google.android.gms.measurement.internal;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.core.content.ContextCompat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzgf;
import com.google.android.gms.measurement.internal.zzjj;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.DebugKt;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public class zzic implements zzjh {
    private static volatile zzic zzb;
    final long zza;
    private Boolean zzab;
    private long zzac;
    private volatile Boolean zzad;
    private Boolean zzae;
    private Boolean zzaf;
    private volatile boolean zzag;
    private int zzah;
    private int zzai;
    private final Context zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final boolean zzg;
    private final zzaf zzh;
    private final zzai zzi;
    private final zzha zzj;
    private final zzgo zzk;
    private final zzhv zzl;
    private final zznx zzm;
    private final zzpn zzn;
    private final zzgl zzo;
    private final Clock zzp;
    private final zzlz zzq;
    private final zzju zzr;
    private final zza zzs;
    private final zzlp zzt;
    private final String zzu;
    private zzgj zzv;
    private zzme zzw;
    private zzbf zzx;
    private zzgg zzy;
    private zzls zzz;
    private boolean zzaa = false;
    private AtomicInteger zzaj = new AtomicInteger(0);

    public final int zzc() {
        zzl().zzv();
        if (this.zzi.zzy()) {
            return 1;
        }
        Boolean bool = this.zzaf;
        if (bool != null && bool.booleanValue()) {
            return 2;
        }
        if (!zzaf()) {
            return 8;
        }
        Boolean zzw = zzn().zzw();
        if (zzw != null) {
            return zzw.booleanValue() ? 0 : 3;
        }
        Boolean zze = this.zzi.zze("firebase_analytics_collection_enabled");
        if (zze != null) {
            return zze.booleanValue() ? 0 : 4;
        }
        Boolean bool2 = this.zzae;
        return bool2 != null ? bool2.booleanValue() ? 0 : 5 : (this.zzad == null || this.zzad.booleanValue()) ? 0 : 7;
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final Context zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final Clock zzb() {
        return this.zzp;
    }

    @Pure
    public final zza zze() {
        zza((zzg) this.zzs);
        return this.zzs;
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final zzaf zzd() {
        return this.zzh;
    }

    @Pure
    public final zzai zzf() {
        return this.zzi;
    }

    @Pure
    public final zzbf zzg() {
        zza((zzji) this.zzx);
        return this.zzx;
    }

    @Pure
    public final zzgg zzh() {
        zza((zzf) this.zzy);
        return this.zzy;
    }

    @Pure
    public final zzgj zzi() {
        zza((zzf) this.zzv);
        return this.zzv;
    }

    @Pure
    public final zzgl zzk() {
        return this.zzo;
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final zzgo zzj() {
        zza((zzji) this.zzk);
        return this.zzk;
    }

    public final zzgo zzm() {
        zzgo zzgoVar = this.zzk;
        if (zzgoVar == null || !zzgoVar.zzag()) {
            return null;
        }
        return this.zzk;
    }

    @Pure
    public final zzha zzn() {
        zza((zzjf) this.zzj);
        return this.zzj;
    }

    @Override // com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final zzhv zzl() {
        zza((zzji) this.zzl);
        return this.zzl;
    }

    @SideEffectFree
    final zzhv zzo() {
        return this.zzl;
    }

    public static zzic zza(Context context, com.google.android.gms.internal.measurement.zzdz zzdzVar, Long l) {
        if (zzdzVar != null && (zzdzVar.zze == null || zzdzVar.zzf == null)) {
            zzdzVar = new com.google.android.gms.internal.measurement.zzdz(zzdzVar.zza, zzdzVar.zzb, zzdzVar.zzc, zzdzVar.zzd, null, null, zzdzVar.zzg, null);
        }
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzic.class) {
                if (zzb == null) {
                    zzb = new zzic(new zzjs(context, zzdzVar, l));
                }
            }
        } else if (zzdzVar != null && zzdzVar.zzg != null && zzdzVar.zzg.containsKey("dataCollectionDefaultEnabled")) {
            Preconditions.checkNotNull(zzb);
            zzb.zza(zzdzVar.zzg.getBoolean("dataCollectionDefaultEnabled"));
        }
        Preconditions.checkNotNull(zzb);
        return zzb;
    }

    @Pure
    public final zzju zzp() {
        zza((zzf) this.zzr);
        return this.zzr;
    }

    @Pure
    public final zzlp zzq() {
        zza((zzji) this.zzt);
        return this.zzt;
    }

    @Pure
    public final zzls zzr() {
        zza((zzg) this.zzz);
        return this.zzz;
    }

    @Pure
    public final zzlz zzs() {
        zza((zzf) this.zzq);
        return this.zzq;
    }

    @Pure
    public final zzme zzt() {
        zza((zzf) this.zzw);
        return this.zzw;
    }

    @Pure
    public final zznx zzu() {
        zza((zzf) this.zzm);
        return this.zzm;
    }

    @Pure
    public final zzpn zzv() {
        zza((zzjf) this.zzn);
        return this.zzn;
    }

    @Pure
    public final String zzw() {
        return this.zzd;
    }

    @Pure
    public final String zzx() {
        return this.zze;
    }

    @Pure
    public final String zzy() {
        return this.zzf;
    }

    @Pure
    public final String zzz() {
        return this.zzu;
    }

    public static /* synthetic */ void zza(zzic zzicVar, String str, int i, Throwable th, byte[] bArr, Map map) {
        List<ResolveInfo> queryIntentActivities;
        if ((i != 200 && i != 204 && i != 304) || th != null) {
            zzicVar.zzj().zzr().zza("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
            return;
        }
        zzicVar.zzn().zzo.zza(true);
        if (bArr == null || bArr.length == 0) {
            zzicVar.zzj().zzc().zza("Deferred Deep Link response empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(new String(bArr));
            String optString = jSONObject.optString("deeplink", "");
            if (TextUtils.isEmpty(optString)) {
                zzicVar.zzj().zzc().zza("Deferred Deep Link is empty.");
                return;
            }
            String optString2 = jSONObject.optString("gclid", "");
            String optString3 = jSONObject.optString("gbraid", "");
            String optString4 = jSONObject.optString("gad_source", "");
            double optDouble = jSONObject.optDouble("timestamp", 0.0d);
            Bundle bundle = new Bundle();
            zzpn zzv = zzicVar.zzv();
            if (TextUtils.isEmpty(optString) || (queryIntentActivities = zzv.zza().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                zzicVar.zzj().zzr().zza("Deferred Deep Link validation failed. gclid, gbraid, deep link", optString2, optString3, optString);
                return;
            }
            if (!TextUtils.isEmpty(optString3)) {
                bundle.putString("gbraid", optString3);
            }
            if (!TextUtils.isEmpty(optString4)) {
                bundle.putString("gad_source", optString4);
            }
            bundle.putString("gclid", optString2);
            bundle.putString("_cis", "ddp");
            zzicVar.zzr.zzc(DebugKt.DEBUG_PROPERTY_VALUE_AUTO, Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN, bundle);
            zzpn zzv2 = zzicVar.zzv();
            if (TextUtils.isEmpty(optString) || !zzv2.zza(optString, optDouble)) {
                return;
            }
            zzv2.zza().sendBroadcast(new Intent("android.google.analytics.action.DEEPLINK_ACTION"));
        } catch (JSONException e) {
            zzicVar.zzj().zzg().zza("Failed to parse the Deferred Deep Link response. exception", e);
        }
    }

    static /* synthetic */ void zza(zzic zzicVar, zzjs zzjsVar) {
        zzicVar.zzl().zzv();
        zzbf zzbfVar = new zzbf(zzicVar);
        zzbfVar.zzae();
        zzicVar.zzx = zzbfVar;
        zzgg zzggVar = new zzgg(zzicVar, zzjsVar.zzf);
        zzggVar.zzx();
        zzicVar.zzy = zzggVar;
        zzgj zzgjVar = new zzgj(zzicVar);
        zzgjVar.zzx();
        zzicVar.zzv = zzgjVar;
        zzme zzmeVar = new zzme(zzicVar);
        zzmeVar.zzx();
        zzicVar.zzw = zzmeVar;
        zzicVar.zzn.zzaf();
        zzicVar.zzj.zzaf();
        zzicVar.zzy.zzy();
        zzls zzlsVar = new zzls(zzicVar);
        zzlsVar.zzx();
        zzicVar.zzz = zzlsVar;
        zzlsVar.zzy();
        zzicVar.zzj().zzp().zza("App measurement initialized, version", 114010L);
        zzicVar.zzj().zzp().zza("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String zzaf = zzggVar.zzaf();
        if (TextUtils.isEmpty(zzicVar.zzd)) {
            if (zzicVar.zzv().zzd(zzaf, zzicVar.zzi.zzr())) {
                zzicVar.zzj().zzp().zza("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                zzicVar.zzj().zzp().zza("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app " + zzaf);
            }
        }
        zzicVar.zzj().zzc().zza("Debug-level message logging enabled");
        if (zzicVar.zzah != zzicVar.zzaj.get()) {
            zzicVar.zzj().zzg().zza("Not all components initialized", Integer.valueOf(zzicVar.zzah), Integer.valueOf(zzicVar.zzaj.get()));
        }
        zzicVar.zzaa = true;
    }

    private zzic(zzjs zzjsVar) {
        long currentTimeMillis;
        boolean z = false;
        Preconditions.checkNotNull(zzjsVar);
        zzaf zzafVar = new zzaf(zzjsVar.zza);
        this.zzh = zzafVar;
        zzfu.zza = zzafVar;
        Context context = zzjsVar.zza;
        this.zzc = context;
        this.zzd = zzjsVar.zzb;
        this.zze = zzjsVar.zzc;
        this.zzf = zzjsVar.zzd;
        this.zzg = zzjsVar.zzh;
        this.zzad = zzjsVar.zze;
        this.zzu = zzjsVar.zzj;
        this.zzag = true;
        com.google.android.gms.internal.measurement.zzdz zzdzVar = zzjsVar.zzg;
        if (zzdzVar != null && zzdzVar.zzg != null) {
            Object obj = zzdzVar.zzg.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.zzae = (Boolean) obj;
            }
            Object obj2 = zzdzVar.zzg.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.zzaf = (Boolean) obj2;
            }
        }
        com.google.android.gms.internal.measurement.zzhx.zzb(context);
        Clock defaultClock = DefaultClock.getInstance();
        this.zzp = defaultClock;
        if (zzjsVar.zzi != null) {
            currentTimeMillis = zzjsVar.zzi.longValue();
        } else {
            currentTimeMillis = defaultClock.currentTimeMillis();
        }
        this.zza = currentTimeMillis;
        this.zzi = new zzai(this);
        zzha zzhaVar = new zzha(this);
        zzhaVar.zzae();
        this.zzj = zzhaVar;
        zzgo zzgoVar = new zzgo(this);
        zzgoVar.zzae();
        this.zzk = zzgoVar;
        zzpn zzpnVar = new zzpn(this);
        zzpnVar.zzae();
        this.zzn = zzpnVar;
        this.zzo = new zzgl(new zzjv(zzjsVar, this));
        this.zzs = new zza(this);
        zzlz zzlzVar = new zzlz(this);
        zzlzVar.zzx();
        this.zzq = zzlzVar;
        zzju zzjuVar = new zzju(this);
        zzjuVar.zzx();
        this.zzr = zzjuVar;
        zznx zznxVar = new zznx(this);
        zznxVar.zzx();
        this.zzm = zznxVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzae();
        this.zzt = zzlpVar;
        zzhv zzhvVar = new zzhv(this);
        zzhvVar.zzae();
        this.zzl = zzhvVar;
        if (zzjsVar.zzg != null && zzjsVar.zzg.zzb != 0) {
            z = true;
        }
        boolean z2 = !z;
        if (context.getApplicationContext() instanceof Application) {
            zzp().zzb(z2);
        } else {
            zzj().zzr().zza("Application context is not an Application");
        }
        zzhvVar.zzb(new zzid(this, zzjsVar));
    }

    private static void zza(zzg zzgVar) {
        if (zzgVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zzjf zzjfVar) {
        if (zzjfVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    private static void zza(zzf zzfVar) {
        if (zzfVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzfVar.zzaa()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzfVar.getClass()));
    }

    private static void zza(zzji zzjiVar) {
        if (zzjiVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (zzjiVar.zzag()) {
            return;
        }
        throw new IllegalStateException("Component not initialized: " + String.valueOf(zzjiVar.getClass()));
    }

    final void zzaa() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    final void zzab() {
        this.zzaj.incrementAndGet();
    }

    final void zzac() {
        this.zzah++;
    }

    final void zza(boolean z) {
        this.zzad = Boolean.valueOf(z);
    }

    public final void zzb(boolean z) {
        zzl().zzv();
        this.zzag = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x011c, code lost:
    
        if (r4.zzi() != false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zza(com.google.android.gms.internal.measurement.zzdz zzdzVar) {
        zzjj zza;
        Boolean zza2;
        zzl().zzv();
        boolean z = this.zzi.zza(zzbn.zzcl) && zzr().zzac() == zzgf.zzo.zza.CLIENT_UPLOAD_ELIGIBLE;
        if ((com.google.android.gms.internal.measurement.zzoy.zza() && this.zzi.zza(zzbn.zzcq) && zzv().zzx()) || z) {
            zzpn zzv = zzv();
            zzv.zzv();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            if (zzv.zze().zza(zzbn.zzcl)) {
                intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            }
            ContextCompat.registerReceiver(zzv.zza(), new zzq(zzv.zzu), intentFilter, 2);
            zzv.zzj().zzc().zza("Registered app receiver");
        }
        if (z) {
            zzr().zza(zzbn.zzx.zza(null).longValue());
        }
        zzjj zzp = zzn().zzp();
        int zza3 = zzp.zza();
        zzjm zzc = this.zzi.zzc("google_analytics_default_allow_ad_storage", false);
        zzjm zzc2 = this.zzi.zzc("google_analytics_default_allow_analytics_storage", false);
        if ((zzc != zzjm.UNINITIALIZED || zzc2 != zzjm.UNINITIALIZED) && zzn().zza(-10)) {
            zza = zzjj.zza(zzc, zzc2, -10);
        } else {
            if (!TextUtils.isEmpty(zzh().zzah()) && (zza3 == 0 || zza3 == 30 || zza3 == 10 || zza3 == 30 || zza3 == 30 || zza3 == 40)) {
                zzp().zza(new zzjj(null, null, -10), false);
            } else if (TextUtils.isEmpty(zzh().zzah()) && zzdzVar != null && zzdzVar.zzg != null && zzn().zza(30)) {
                zza = zzjj.zza(zzdzVar.zzg, 30);
            }
            zza = null;
        }
        if (zza != null) {
            zzp().zza(zza, true);
            zzp = zza;
        }
        zzp().zza(zzp);
        int zza4 = zzn().zzo().zza();
        zzjm zzc3 = this.zzi.zzc("google_analytics_default_allow_ad_personalization_signals", true);
        if (zzc3 != zzjm.UNINITIALIZED) {
            zzj().zzq().zza("Default ad personalization consent from Manifest", zzc3);
        }
        zzjm zzc4 = this.zzi.zzc("google_analytics_default_allow_ad_user_data", true);
        if (zzc4 != zzjm.UNINITIALIZED && zzjj.zza(-10, zza4)) {
            zzp().zza(zzbd.zza(zzc4, -10), true);
        } else if (!TextUtils.isEmpty(zzh().zzah()) && (zza4 == 0 || zza4 == 30)) {
            zzp().zza(new zzbd(null, -10), true);
        } else {
            if (TextUtils.isEmpty(zzh().zzah()) && zzdzVar != null && zzdzVar.zzg != null && zzjj.zza(30, zza4)) {
                zzbd zza5 = zzbd.zza(zzdzVar.zzg, 30);
                if (zza5.zzg()) {
                    zzp().zza(zza5, true);
                }
            }
            if (TextUtils.isEmpty(zzh().zzah()) && zzdzVar != null && zzdzVar.zzg != null && zzn().zzh.zza() == null && (zza2 = zzbd.zza(zzdzVar.zzg)) != null) {
                zzp().zza(zzdzVar.zze, FirebaseAnalytics.UserProperty.ALLOW_AD_PERSONALIZATION_SIGNALS, (Object) zza2.toString(), false);
            }
        }
        Boolean zze = this.zzi.zze("google_analytics_tcf_data_enabled");
        if (zze == null ? true : zze.booleanValue()) {
            zzj().zzc().zza("TCF client enabled.");
            zzp().zzaw();
            zzp().zzau();
        }
        if (zzn().zzc.zza() == 0) {
            zzj().zzq().zza("Persisting first open", Long.valueOf(this.zza));
            zzn().zzc.zza(this.zza);
        }
        zzp().zza.zzb();
        if (!zzah()) {
            if (zzae()) {
                if (!zzv().zze("android.permission.INTERNET")) {
                    zzj().zzg().zza("App is missing INTERNET permission");
                }
                if (!zzv().zze("android.permission.ACCESS_NETWORK_STATE")) {
                    zzj().zzg().zza("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!Wrappers.packageManager(this.zzc).isCallerInstantApp() && !this.zzi.zzz()) {
                    if (!zzpn.zza(this.zzc)) {
                        zzj().zzg().zza("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!zzpn.zza(this.zzc, false)) {
                        zzj().zzg().zza("AppMeasurementService not registered/enabled");
                    }
                }
                zzj().zzg().zza("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(zzh().zzah()) || !TextUtils.isEmpty(zzh().zzae())) {
                zzv();
                if (zzpn.zza(zzh().zzah(), zzn().zzz(), zzh().zzae(), zzn().zzy())) {
                    zzj().zzp().zza("Rechecking which service to use due to a GMP App Id change");
                    zzn().zzaa();
                    zzi().zzac();
                    this.zzw.zzah();
                    this.zzw.zzag();
                    zzn().zzc.zza(this.zza);
                    zzn().zze.zza(null);
                }
                zzn().zzc(zzh().zzah());
                zzn().zzb(zzh().zzae());
            }
            if (!zzn().zzp().zza(zzjj.zza.ANALYTICS_STORAGE)) {
                zzn().zze.zza(null);
            }
            zzp().zzb(zzn().zze.zza());
            if (!zzv().zzy() && !TextUtils.isEmpty(zzn().zzq.zza())) {
                zzj().zzr().zza("Remote config removed with active feature rollouts");
                zzn().zzq.zza(null);
            }
            if (!TextUtils.isEmpty(zzh().zzah()) || !TextUtils.isEmpty(zzh().zzae())) {
                boolean zzae = zzae();
                if (!zzn().zzac() && !this.zzi.zzy()) {
                    zzn().zzb(!zzae);
                }
                if (zzae) {
                    zzp().zzap();
                }
                zzu().zza.zza();
                zzt().zza(new AtomicReference<>());
                zzt().zza(zzn().zzt.zza());
            }
        }
        if (com.google.android.gms.internal.measurement.zzoy.zza() && this.zzi.zza(zzbn.zzcq) && zzv().zzx()) {
            if (zzbn.zzbr.zza(null).intValue() > 0) {
                long max = Math.max(500L, ((zzbn.zzbr.zza(null).intValue() * 1000) + new Random().nextInt(5000)) - this.zzp.elapsedRealtime());
                if (max > 500) {
                    zzj().zzq().zza("Waiting to fetch trigger URIs until some time after boot. Delay in millis", Long.valueOf(max));
                }
                zzp().zzc(max);
            } else {
                final zzju zzp2 = zzp();
                Objects.requireNonNull(zzp2);
                new Thread(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzib
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzju.this.zzas();
                    }
                }).start();
            }
        }
        zzn().zzj.zza(true);
    }

    public final boolean zzad() {
        return this.zzad != null && this.zzad.booleanValue();
    }

    public final boolean zzae() {
        return zzc() == 0;
    }

    public final boolean zzaf() {
        zzl().zzv();
        return this.zzag;
    }

    @Pure
    public final boolean zzag() {
        return TextUtils.isEmpty(this.zzd);
    }

    protected final boolean zzah() {
        if (!this.zzaa) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        zzl().zzv();
        Boolean bool = this.zzab;
        if (bool == null || this.zzac == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.zzp.elapsedRealtime() - this.zzac) > 1000)) {
            this.zzac = this.zzp.elapsedRealtime();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(zzv().zze("android.permission.INTERNET") && zzv().zze("android.permission.ACCESS_NETWORK_STATE") && (Wrappers.packageManager(this.zzc).isCallerInstantApp() || this.zzi.zzz() || (zzpn.zza(this.zzc) && zzpn.zza(this.zzc, false))));
            this.zzab = valueOf;
            if (valueOf.booleanValue()) {
                if (!zzv().zza(zzh().zzah(), zzh().zzae()) && TextUtils.isEmpty(zzh().zzae())) {
                    z = false;
                }
                this.zzab = Boolean.valueOf(z);
            }
        }
        return this.zzab.booleanValue();
    }

    @Pure
    public final boolean zzai() {
        return this.zzg;
    }

    public final boolean zzaj() {
        zzl().zzv();
        zza((zzji) zzq());
        String zzaf = zzh().zzaf();
        if (!this.zzi.zzw()) {
            zzj().zzq().zza("ADID collection is disabled from Manifest. Skipping");
            return false;
        }
        Pair<String, Boolean> zza = zzn().zza(zzaf);
        if (((Boolean) zza.second).booleanValue() || TextUtils.isEmpty((CharSequence) zza.first)) {
            zzj().zzq().zza("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return false;
        }
        if (!zzq().zzc()) {
            zzj().zzr().zza("Network is not available for Deferred Deep Link request. Skipping");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        zzme zzt = zzt();
        zzt.zzv();
        zzt.zzw();
        if (!zzt.zzap() || zzt.zzs().zzg() >= 234200) {
            zzap zzac = zzp().zzac();
            Bundle bundle = zzac != null ? zzac.zza : null;
            if (bundle == null) {
                int i = this.zzai;
                this.zzai = i + 1;
                boolean z = i < 10;
                zzj().zzc().zza("Failed to retrieve DMA consent from the service, " + (z ? "Retrying." : "Skipping.") + " retryCount", Integer.valueOf(this.zzai));
                return z;
            }
            sb.append("&gcs=").append(zzjj.zza(bundle, 100).zze());
            zzbd zza2 = zzbd.zza(bundle, 100);
            sb.append("&dma=").append(zza2.zzd() == Boolean.FALSE ? 0 : 1);
            if (!TextUtils.isEmpty(zza2.zze())) {
                sb.append("&dma_cps=").append(zza2.zze());
            }
            sb.append("&npa=").append(zzbd.zza(bundle) == Boolean.TRUE ? 0 : 1);
            zzj().zzq().zza("Consent query parameters to Bow", sb);
        }
        zzpn zzv = zzv();
        zzh();
        URL zza3 = zzv.zza(114010L, zzaf, (String) zza.first, zzn().zzp.zza() - 1, sb.toString());
        if (zza3 != null) {
            zzlp zzq = zzq();
            zzlo zzloVar = new zzlo() { // from class: com.google.android.gms.measurement.internal.zzie
                @Override // com.google.android.gms.measurement.internal.zzlo
                public final void zza(String str, int i2, Throwable th, byte[] bArr, Map map) {
                    zzic.zza(zzic.this, str, i2, th, bArr, map);
                }
            };
            zzq.zzad();
            Preconditions.checkNotNull(zza3);
            Preconditions.checkNotNull(zzloVar);
            zzq.zzl().zza(new zzlr(zzq, zzaf, zza3, null, null, zzloVar));
        }
        return false;
    }
}
