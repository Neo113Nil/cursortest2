package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzez;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class zzeh extends zzhi {
    private Boolean zzagi;

    @NonNull
    private zzej zzagj;
    private Boolean zzxy;

    zzeh(zzgn zzgnVar) {
        super(zzgnVar);
        this.zzagj = zzei.zzagk;
    }

    static String zzhn() {
        return zzez.zzaie.get();
    }

    public static long zzhq() {
        return zzez.zzajh.get().longValue();
    }

    public static long zzhr() {
        return zzez.zzaih.get().longValue();
    }

    public static boolean zzht() {
        return zzez.zzaid.get().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    @WorkerThread
    public final long zza(String str, @NonNull zzez.zza<Long> zzaVar) {
        if (str != null) {
            String zze = this.zzagj.zze(str, zzaVar.getKey());
            if (!TextUtils.isEmpty(zze)) {
                try {
                    return zzaVar.get(Long.valueOf(Long.parseLong(zze))).longValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return zzaVar.get().longValue();
    }

    final void zza(@NonNull zzej zzejVar) {
        this.zzagj = zzejVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    @WorkerThread
    public final int zzas(@Size(min = 1) String str) {
        return zzb(str, zzez.zzais);
    }

    @VisibleForTesting
    @Nullable
    final Boolean zzat(@Size(min = 1) String str) {
        Preconditions.checkNotEmpty(str);
        try {
            if (getContext().getPackageManager() == null) {
                zzgi().zziv().log("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo applicationInfo = Wrappers.packageManager(getContext()).getApplicationInfo(getContext().getPackageName(), 128);
            if (applicationInfo == null) {
                zzgi().zziv().log("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            if (applicationInfo.metaData == null) {
                zzgi().zziv().log("Failed to load metadata: Metadata bundle is null");
                return null;
            }
            if (applicationInfo.metaData.containsKey(str)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
            }
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zzgi().zziv().zzg("Failed to load metadata: Package name not found", e);
            return null;
        }
    }

    public final boolean zzau(String str) {
        return "1".equals(this.zzagj.zze(str, "gaia_collection_enabled"));
    }

    public final boolean zzav(String str) {
        return "1".equals(this.zzagj.zze(str, "measurement.event_sampling_enabled"));
    }

    @WorkerThread
    final boolean zzaw(String str) {
        return zzd(str, zzez.zzajq);
    }

    @WorkerThread
    final boolean zzax(String str) {
        return zzd(str, zzez.zzajs);
    }

    @WorkerThread
    final boolean zzay(String str) {
        return zzd(str, zzez.zzajt);
    }

    @WorkerThread
    final boolean zzaz(String str) {
        return zzd(str, zzez.zzajl);
    }

    @WorkerThread
    public final int zzb(String str, @NonNull zzez.zza<Integer> zzaVar) {
        if (str != null) {
            String zze = this.zzagj.zze(str, zzaVar.getKey());
            if (!TextUtils.isEmpty(zze)) {
                try {
                    return zzaVar.get(Integer.valueOf(Integer.parseInt(zze))).intValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return zzaVar.get().intValue();
    }

    @WorkerThread
    final String zzba(String str) {
        zzez.zza<String> zzaVar = zzez.zzajm;
        return str == null ? zzaVar.get() : zzaVar.get(this.zzagj.zze(str, zzaVar.getKey()));
    }

    final boolean zzbb(String str) {
        return zzd(str, zzez.zzaju);
    }

    @WorkerThread
    final boolean zzbc(String str) {
        return zzd(str, zzez.zzajv);
    }

    @WorkerThread
    final boolean zzbd(String str) {
        return zzd(str, zzez.zzajy);
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    @WorkerThread
    public final double zzc(String str, @NonNull zzez.zza<Double> zzaVar) {
        if (str != null) {
            String zze = this.zzagj.zze(str, zzaVar.getKey());
            if (!TextUtils.isEmpty(zze)) {
                try {
                    return zzaVar.get(Double.valueOf(Double.parseDouble(zze))).doubleValue();
                } catch (NumberFormatException unused) {
                }
            }
        }
        return zzaVar.get().doubleValue();
    }

    @WorkerThread
    public final boolean zzd(String str, @NonNull zzez.zza<Boolean> zzaVar) {
        Boolean bool;
        if (str != null) {
            String zze = this.zzagj.zze(str, zzaVar.getKey());
            if (!TextUtils.isEmpty(zze)) {
                bool = zzaVar.get(Boolean.valueOf(Boolean.parseBoolean(zze)));
                return bool.booleanValue();
            }
        }
        bool = zzaVar.get();
        return bool.booleanValue();
    }

    public final boolean zzds() {
        if (this.zzxy == null) {
            synchronized (this) {
                if (this.zzxy == null) {
                    ApplicationInfo applicationInfo = getContext().getApplicationInfo();
                    String myProcessName = ProcessUtils.getMyProcessName();
                    if (applicationInfo != null) {
                        String str = applicationInfo.processName;
                        this.zzxy = Boolean.valueOf(str != null && str.equals(myProcessName));
                    }
                    if (this.zzxy == null) {
                        this.zzxy = Boolean.TRUE;
                        zzgi().zziv().log("My process not in the list of running processes");
                    }
                }
            }
        }
        return this.zzxy.booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzer zzge() {
        return super.zzge();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzfg zzgf() {
        return super.zzgf();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzkd zzgg() {
        return super.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzgi zzgh() {
        return super.zzgh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzfi zzgi() {
        return super.zzgi();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzft zzgj() {
        return super.zzgj();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ zzeh zzgk() {
        return super.zzgk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ zzee zzgl() {
        return super.zzgl();
    }

    public final long zzgw() {
        zzgl();
        return 12780L;
    }

    public final boolean zzho() {
        zzgl();
        Boolean zzat = zzat("firebase_analytics_collection_deactivated");
        return zzat != null && zzat.booleanValue();
    }

    public final Boolean zzhp() {
        zzgl();
        return zzat("firebase_analytics_collection_enabled");
    }

    public final String zzhs() {
        zzfk zziv;
        String str;
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, "debug.firebase.analytics.app", "");
        } catch (ClassNotFoundException e) {
            e = e;
            zziv = zzgi().zziv();
            str = "Could not find SystemProperties class";
            zziv.zzg(str, e);
            return "";
        } catch (IllegalAccessException e2) {
            e = e2;
            zziv = zzgi().zziv();
            str = "Could not access SystemProperties.get()";
            zziv.zzg(str, e);
            return "";
        } catch (NoSuchMethodException e3) {
            e = e3;
            zziv = zzgi().zziv();
            str = "Could not find SystemProperties.get() method";
            zziv.zzg(str, e);
            return "";
        } catch (InvocationTargetException e4) {
            e = e4;
            zziv = zzgi().zziv();
            str = "SystemProperties.get() threw an exception";
            zziv.zzg(str, e);
            return "";
        }
    }

    @WorkerThread
    final boolean zzhu() {
        if (this.zzagi == null) {
            this.zzagi = zzat("app_measurement_lite");
            if (this.zzagi == null) {
                this.zzagi = false;
            }
        }
        return this.zzagi.booleanValue();
    }
}
