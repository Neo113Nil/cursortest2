package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.animation.core.MutatorMutex$$ExternalSyntheticBackportWithForwarding0;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.unity3d.services.core.fid.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes9.dex */
public final class zzcer {
    private zzeaj zze;
    private final AtomicReference zzb = new AtomicReference(null);
    private final Object zzc = new Object();
    private String zzd = null;
    final AtomicBoolean zza = new AtomicBoolean(false);
    private final AtomicInteger zzf = new AtomicInteger(-1);
    private final AtomicReference zzg = new AtomicReference(null);
    private final AtomicReference zzh = new AtomicReference(null);
    private final ConcurrentMap zzi = new ConcurrentHashMap(9);
    private final Object zzj = new Object();

    public static final Bundle zzr(Map map) {
        Bundle bundle = new Bundle();
        if (map != null) {
            for (String str : map.keySet()) {
                try {
                    if (Objects.equals(str, "value")) {
                        bundle.putDouble(str, Double.parseDouble((String) map.get(str)));
                    } else {
                        bundle.putString(str, (String) map.get(str));
                    }
                } catch (NullPointerException | NumberFormatException unused) {
                }
            }
        }
        return bundle;
    }

    static final boolean zzs(Context context) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbc)).booleanValue()) {
            return false;
        }
        if (DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbd)).intValue()) {
            return false;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbe)).booleanValue()) {
            try {
                context.getClassLoader().loadClass(Constants.FID_CLASS);
                return false;
            } catch (ClassNotFoundException unused) {
            }
        }
        return true;
    }

    private final void zzt(Context context, String str, String str2, Bundle bundle) {
        if (zzb(context)) {
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putLong("_aeid", Long.parseLong(str2));
            } catch (NullPointerException | NumberFormatException e) {
                String.valueOf(str2);
                String valueOf = String.valueOf(str2);
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Invalid event ID: ".concat(valueOf), e);
            }
            if ("_ac".equals(str)) {
                bundle2.putInt("_r", 1);
            }
            if (bundle != null) {
                bundle2.putAll(bundle);
            }
            if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
                ConcurrentMap concurrentMap = this.zzi;
                Method method = (Method) concurrentMap.get("logEventInternal");
                if (method == null) {
                    try {
                        method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod("logEventInternal", String.class, String.class, Bundle.class);
                        concurrentMap.put("logEventInternal", method);
                    } catch (Exception unused) {
                        zzx("logEventInternal", true);
                        method = null;
                    }
                }
                try {
                    method.invoke(this.zzg.get(), "am", str, bundle2);
                } catch (Exception unused2) {
                    zzx("logEventInternal", true);
                }
            }
        }
    }

    private final Method zzu(Context context, String str) {
        ConcurrentMap concurrentMap = this.zzi;
        Method method = (Method) concurrentMap.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            concurrentMap.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            zzx(str, false);
            return null;
        }
    }

    private final void zzv(Context context, String str, String str2) {
        if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", this.zzg, true)) {
            ConcurrentMap concurrentMap = this.zzi;
            Method method = (Method) concurrentMap.get(str2);
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str2, String.class);
                    concurrentMap.put(str2, method);
                } catch (Exception unused) {
                    zzx(str2, false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzg.get(), str);
                StringBuilder sb = new StringBuilder(str2.length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
            } catch (Exception unused2) {
                zzx(str2, false);
            }
        }
    }

    private final Object zzw(String str, Context context) {
        AtomicReference atomicReference = this.zzg;
        if (!zzy(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
            return null;
        }
        try {
            return zzu(context, str).invoke(atomicReference.get(), new Object[0]);
        } catch (Exception unused) {
            zzx(str, true);
            return null;
        }
    }

    private final void zzx(String str, boolean z) {
        AtomicBoolean atomicBoolean = this.zza;
        if (atomicBoolean.get()) {
            return;
        }
        StringBuilder sb = new StringBuilder(str.length() + 30);
        sb.append("Invoke Firebase method ");
        sb.append(str);
        sb.append(" error.");
        String sb2 = sb.toString();
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi(sb2);
        if (z) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires the latest Firebase SDK jar, but Firebase SDK is either missing or out of date");
            atomicBoolean.set(true);
        }
        if (this.zze != null) {
            if (this.zzh.get() == null && this.zzg.get() == null) {
                return;
            }
            zzeai zza = this.zze.zza();
            zza.zzc("action", "ga_log_event_error");
            zza.zzc("method_name", str);
            zza.zzd();
        }
    }

    private final boolean zzy(Context context, String str, AtomicReference atomicReference, boolean z) {
        if (atomicReference.get() == null) {
            try {
                MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, context.getClassLoader().loadClass(str).getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, context));
            } catch (Exception unused) {
                zzx(Constants.GET_INSTANCE, z);
                return false;
            }
        }
        return true;
    }

    public final void zza(zzeaj zzeajVar) {
        this.zze = zzeajVar;
    }

    public final boolean zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzaU)).booleanValue() && !this.zza.get()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbf)).booleanValue()) {
                return true;
            }
            AtomicInteger atomicInteger = this.zzf;
            if (atomicInteger.get() == -1) {
                com.google.android.gms.ads.internal.client.zzay.zza();
                if (!com.google.android.gms.ads.internal.util.client.zzf.zzz(context, GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE)) {
                    com.google.android.gms.ads.internal.client.zzay.zza();
                    if (com.google.android.gms.ads.internal.util.client.zzf.zzA(context)) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Google Play Service is out of date, the Google Mobile Ads SDK will not integrate with Firebase. Admob/Firebase integration requires updated Google Play Service.");
                        atomicInteger.set(0);
                    }
                }
                atomicInteger.set(1);
            }
            if (atomicInteger.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final void zzc(Context context, com.google.android.gms.ads.internal.client.zzfr zzfrVar) {
        zzces.zzb(context).zza().zzc(zzfrVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbh)).booleanValue() && zzb(context) && zzs(context)) {
            synchronized (this.zzj) {
            }
        }
    }

    public final void zzd(Context context, com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbh)).booleanValue() && zzb(context) && zzs(context)) {
            synchronized (this.zzj) {
            }
        }
    }

    public final void zze(Context context, String str) {
        if (zzb(context)) {
            zzv(context, str, "beginAdUnitExposure");
        }
    }

    public final void zzf(Context context, String str) {
        if (zzb(context)) {
            zzv(context, str, "endAdUnitExposure");
        }
    }

    public final String zzg(Context context) {
        if (zzb(context)) {
            AtomicReference atomicReference = this.zzg;
            if (zzy(context, "com.google.android.gms.measurement.AppMeasurement", atomicReference, true)) {
                try {
                    String str = (String) zzu(context, "getCurrentScreenName").invoke(atomicReference.get(), new Object[0]);
                    if (str == null) {
                        str = (String) zzu(context, "getCurrentScreenClass").invoke(atomicReference.get(), new Object[0]);
                    }
                    return str == null ? "" : str;
                } catch (Exception unused) {
                    zzx("getCurrentScreenName", false);
                }
            }
        }
        return "";
    }

    @Deprecated
    public final void zzh(Context context, String str) {
        if (zzb(context) && (context instanceof Activity) && zzy(context, Constants.FID_CLASS, this.zzh, false)) {
            ConcurrentMap concurrentMap = this.zzi;
            Method method = (Method) concurrentMap.get("setCurrentScreen");
            if (method == null) {
                try {
                    method = context.getClassLoader().loadClass(Constants.FID_CLASS).getDeclaredMethod("setCurrentScreen", Activity.class, String.class, String.class);
                    concurrentMap.put("setCurrentScreen", method);
                } catch (Exception unused) {
                    zzx("setCurrentScreen", false);
                    method = null;
                }
            }
            try {
                method.invoke(this.zzh.get(), (Activity) context, str, context.getPackageName());
            } catch (Exception unused2) {
                zzx("setCurrentScreen", false);
            }
        }
    }

    public final String zzi(Context context) {
        if (!zzb(context)) {
            return null;
        }
        synchronized (this.zzc) {
            String str = this.zzd;
            if (str != null) {
                return str;
            }
            String str2 = (String) zzw("getGmpAppId", context);
            this.zzd = str2;
            return str2;
        }
    }

    public final String zzj(final Context context) {
        ExecutorService threadPoolExecutor;
        if (!zzb(context)) {
            return null;
        }
        long longValue = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzba)).longValue();
        if (longValue < 0) {
            return (String) zzw(Constants.GET_APP_INSTANCE_ID, context);
        }
        AtomicReference atomicReference = this.zzb;
        if (atomicReference.get() == null) {
            if (ClientLibraryUtils.isPackageSide()) {
                threadPoolExecutor = zzgbo.zza().zzb(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzbb)).intValue(), new zzcep(this), 2);
            } else {
                zzbix zzbixVar = zzbjg.zzbb;
                threadPoolExecutor = new ThreadPoolExecutor(((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbixVar)).intValue(), 1L, TimeUnit.MINUTES, new LinkedBlockingQueue(), new zzcep(this));
            }
            MutatorMutex$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, threadPoolExecutor);
        }
        try {
            return (String) ((ExecutorService) atomicReference.get()).submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzceq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return zzcer.this.zzq(context);
                }
            }).get(longValue, TimeUnit.MILLISECONDS);
        } catch (TimeoutException unused) {
            return "TIME_OUT";
        } catch (Exception unused2) {
            return null;
        }
    }

    public final String zzk(Context context) {
        Object zzw;
        if (zzb(context) && (zzw = zzw("generateEventId", context)) != null) {
            return zzw.toString();
        }
        return null;
    }

    public final void zzl(Context context, String str, Map map) {
        zzt(context, "_ac", str, zzr(map));
    }

    public final void zzm(Context context, String str, Map map) {
        zzt(context, "_ai", str, zzr(map));
    }

    public final void zzn(Context context, String str) {
        zzt(context, "_aq", str, null);
    }

    public final void zzo(Context context, String str) {
        zzt(context, "_aa", str, null);
    }

    public final void zzp(Context context, String str, String str2, String str3, int i) {
        if (zzb(context)) {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str2);
            bundle.putString("reward_type", str3);
            bundle.putInt("reward_value", i);
            zzt(context, "_ar", str, bundle);
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 64 + String.valueOf(i).length());
            sb.append("Log a Firebase reward video event, reward type: ");
            sb.append(str3);
            sb.append(", reward value: ");
            sb.append(i);
            com.google.android.gms.ads.internal.util.zze.zza(sb.toString());
        }
    }

    final /* synthetic */ String zzq(Context context) {
        return (String) zzw(Constants.GET_APP_INSTANCE_ID, context);
    }
}
