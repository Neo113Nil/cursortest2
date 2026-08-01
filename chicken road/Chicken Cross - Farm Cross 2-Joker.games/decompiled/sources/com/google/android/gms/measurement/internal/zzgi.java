package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.common.wrappers.PackageManagerWrapper;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrn;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import com.unity3d.services.core.fid.Constants;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@23.0.0 */
/* loaded from: classes8.dex */
public final class zzgi extends zzg {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private final long zzg;
    private final long zzh;
    private List zzi;
    private String zzj;
    private int zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    zzgi(zzic zzicVar, long j, long j2) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
        this.zzh = j2;
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(1:3)(6:59|60|(1:62)(2:77|(1:79))|63|64|(16:66|(1:68)(1:75)|69|70|5|(2:7|(2:9|(2:11|(2:13|(2:15|(2:17|(1:19)(1:52))(1:53))(1:54))(1:55))(1:56))(1:57))(1:58)|20|21|22|(1:24)(1:49)|25|(1:27)|29|(3:31|(1:33)(3:40|(3:43|(1:45)(1:46)|41)|47)|(2:35|36)(2:38|39))|48|(0)(0)))|4|5|(0)(0)|20|21|22|(0)(0)|25|(0)|29|(0)|48|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0199, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x019a, code lost:
    
        r11.zzu.zzaV().zzb().zzc("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r1), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0187 A[Catch: IllegalStateException -> 0x0199, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0199, blocks: (B:22:0x016d, B:25:0x0183, B:27:0x0187), top: B:21:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c7  */
    @Override // com.google.android.gms.measurement.internal.zzg
    @EnsuresNonNull({RemoteConfigConstants.RequestFieldKey.APP_ID, "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzf() {
        String str;
        String str2;
        PackageInfo packageInfo;
        int zzC;
        List zzs;
        String zza;
        zzic zzicVar = this.zzu;
        zzicVar.zzaV().zzk().zzc("sdkVersion bundled with app, dynamiteVersion", Long.valueOf(this.zzh), Long.valueOf(this.zzg));
        String packageName = zzicVar.zzaY().getPackageName();
        PackageManager packageManager = zzicVar.zzaY().getPackageManager();
        String str3 = "";
        int i = Integer.MIN_VALUE;
        String str4 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        String str5 = "unknown";
        if (packageManager == null) {
            zzicVar.zzaV().zzb().zzb("PackageManager is null, app identity information might be inaccurate. appId", zzgu.zzl(packageName));
        } else {
            try {
                str5 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                this.zzu.zzaV().zzb().zzb("Error retrieving app installer package name. appId", zzgu.zzl(packageName));
            }
            if (str5 == null) {
                str5 = "manual_install";
            } else if ("com.android.vending".equals(str5)) {
                str5 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(this.zzu.zzaY().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                try {
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str4;
                    str4 = str2;
                    this.zzu.zzaV().zzb().zzc("Error retrieving package info. appId, appName", zzgu.zzl(packageName), str4);
                    str2 = str4;
                    str4 = str;
                    this.zza = packageName;
                    this.zzd = str5;
                    this.zzb = str4;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    zzic zzicVar2 = this.zzu;
                    zzC = zzicVar2.zzC();
                    if (zzC == 0) {
                    }
                    this.zzl = "";
                    zzic zzicVar3 = this.zzu;
                    zzicVar3.zzaU();
                    zza = zzlt.zza(zzicVar3.zzaY(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzicVar2.zzq());
                    if (!TextUtils.isEmpty(zza)) {
                    }
                    this.zzl = str3;
                    if (zzC == 0) {
                    }
                    this.zzi = null;
                    zzic zzicVar4 = this.zzu;
                    zzicVar4.zzaU();
                    zzs = zzicVar4.zzc().zzs("analytics.safelisted_events");
                    if (zzs != null) {
                    }
                    this.zzi = zzs;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str5;
                this.zzb = str4;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                zzic zzicVar22 = this.zzu;
                zzC = zzicVar22.zzC();
                if (zzC == 0) {
                    this.zzu.zzaV().zzk().zza("App measurement collection enabled");
                } else if (zzC == 1) {
                    this.zzu.zzaV().zzi().zza("App measurement deactivated via the manifest");
                } else if (zzC == 3) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (zzC == 4) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the manifest");
                } else if (zzC == 6) {
                    this.zzu.zzaV().zzh().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (zzC == 7) {
                    this.zzu.zzaV().zzi().zza("App measurement disabled via the global data collection setting");
                } else if (zzC != 8) {
                    zzic zzicVar5 = this.zzu;
                    zzicVar5.zzaV().zzi().zza("App measurement disabled");
                    zzicVar5.zzaV().zzc().zza("Invalid scion state in identity");
                } else {
                    this.zzu.zzaV().zzi().zza("App measurement disabled due to denied storage consent");
                }
                this.zzl = "";
                zzic zzicVar32 = this.zzu;
                zzicVar32.zzaU();
                zza = zzlt.zza(zzicVar32.zzaY(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzicVar22.zzq());
                if (!TextUtils.isEmpty(zza)) {
                    str3 = zza;
                }
                this.zzl = str3;
                if (zzC == 0) {
                    zzicVar32.zzaV().zzk().zzc("App measurement enabled for app package, google app id", this.zza, this.zzl);
                }
                this.zzi = null;
                zzic zzicVar42 = this.zzu;
                zzicVar42.zzaU();
                zzs = zzicVar42.zzc().zzs("analytics.safelisted_events");
                if (zzs != null) {
                    if (zzs.isEmpty()) {
                        zzicVar42.zzaV().zzh().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator it = zzs.iterator();
                        while (it.hasNext()) {
                            if (!zzicVar42.zzk().zzk("safelisted event", (String) it.next())) {
                                break;
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzk = InstantApps.isInstantApp(zzicVar42.zzaY()) ? 1 : 0;
                        return;
                    } else {
                        this.zzk = 0;
                        return;
                    }
                }
                this.zzi = zzs;
                if (packageManager == null) {
                }
            }
        }
        str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = str5;
        this.zzb = str4;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        zzic zzicVar222 = this.zzu;
        zzC = zzicVar222.zzC();
        if (zzC == 0) {
        }
        this.zzl = "";
        zzic zzicVar322 = this.zzu;
        zzicVar322.zzaU();
        zza = zzlt.zza(zzicVar322.zzaY(), AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, zzicVar222.zzq());
        if (!TextUtils.isEmpty(zza)) {
        }
        this.zzl = str3;
        if (zzC == 0) {
        }
        this.zzi = null;
        zzic zzicVar422 = this.zzu;
        zzicVar422.zzaU();
        zzs = zzicVar422.zzc().zzs("analytics.safelisted_events");
        if (zzs != null) {
        }
        this.zzi = zzs;
        if (packageManager == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x025e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzr zzh(String str) {
        Class<?> loadClass;
        Object invoke;
        String str2;
        zzic zzicVar;
        String str3;
        boolean z;
        long j;
        int i;
        List list;
        String str4;
        zzic zzicVar2;
        int i2;
        int i3;
        long j2;
        ApplicationInfo applicationInfo;
        long j3;
        zzg();
        String zzj = zzj();
        String zzk = zzk();
        zzb();
        String str5 = this.zzb;
        zzb();
        long j4 = this.zzc;
        zzb();
        Preconditions.checkNotNull(this.zzd);
        String str6 = this.zzd;
        zzic zzicVar3 = this.zzu;
        zzicVar3.zzc().zzi();
        zzb();
        zzg();
        long j5 = this.zzf;
        if (j5 == 0) {
            zzpp zzk2 = this.zzu.zzk();
            Context zzaY = zzicVar3.zzaY();
            String packageName = zzicVar3.zzaY().getPackageName();
            zzk2.zzg();
            Preconditions.checkNotNull(zzaY);
            Preconditions.checkNotEmpty(packageName);
            PackageManager packageManager = zzaY.getPackageManager();
            MessageDigest zzO = zzpp.zzO();
            if (zzO == null) {
                zzk2.zzu.zzaV().zzb().zza("Could not get MD5 instance");
                j5 = -1;
            } else {
                if (packageManager != null) {
                    try {
                        if (zzk2.zzad(zzaY, packageName)) {
                            j3 = 0;
                        } else {
                            PackageManagerWrapper packageManager2 = Wrappers.packageManager(zzaY);
                            zzic zzicVar4 = zzk2.zzu;
                            PackageInfo packageInfo = packageManager2.getPackageInfo(zzicVar4.zzaY().getPackageName(), 64);
                            if (packageInfo.signatures == null || packageInfo.signatures.length <= 0) {
                                zzicVar4.zzaV().zze().zza("Could not get signatures");
                                j3 = -1;
                            } else {
                                j3 = zzpp.zzP(zzO.digest(packageInfo.signatures[0].toByteArray()));
                            }
                        }
                        j5 = j3;
                    } catch (PackageManager.NameNotFoundException e) {
                        zzk2.zzu.zzaV().zzb().zzb("Package name not found", e);
                    }
                }
                j5 = 0;
            }
            this.zzf = j5;
        }
        long j6 = j5;
        zzic zzicVar5 = this.zzu;
        zzic zzicVar6 = this.zzu;
        boolean zzB = zzicVar5.zzB();
        boolean z2 = !zzicVar6.zzd().zzm;
        zzg();
        if (zzicVar5.zzB()) {
            zzrn.zza();
            if (zzicVar6.zzc().zzp(null, zzfy.zzaH)) {
                this.zzu.zzaV().zzk().zza("Disabled IID for tests.");
            } else {
                try {
                    loadClass = zzicVar6.zzaY().getClassLoader().loadClass(Constants.FID_CLASS);
                } catch (ClassNotFoundException unused) {
                }
                if (loadClass != null) {
                    try {
                        invoke = loadClass.getDeclaredMethod(Constants.GET_INSTANCE, Context.class).invoke(null, this.zzu.zzaY());
                    } catch (Exception unused2) {
                        this.zzu.zzaV().zzf().zza("Failed to obtain Firebase Analytics instance");
                    }
                    if (invoke != null) {
                        try {
                            str2 = (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                        } catch (Exception unused3) {
                            this.zzu.zzaV().zzh().zza("Failed to retrieve Firebase Instance Id");
                        }
                        zzic zzicVar7 = this.zzu;
                        long zza = zzicVar7.zzd().zzc.zza();
                        long min = zza != 0 ? zzicVar7.zza : Math.min(zzicVar7.zza, zza);
                        zzb();
                        int i4 = this.zzk;
                        zzicVar = this.zzu;
                        boolean zzu = zzicVar.zzc().zzu();
                        zzhh zzd = zzicVar.zzd();
                        zzd.zzg();
                        boolean z3 = zzd.zzd().getBoolean("deferred_analytics_collection", false);
                        if (zzicVar.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == zzji.GRANTED) {
                            str3 = "google_analytics_default_allow_ad_personalization_signals";
                            z = true;
                        } else {
                            str3 = "google_analytics_default_allow_ad_personalization_signals";
                            z = false;
                        }
                        long j7 = this.zzg;
                        Boolean valueOf = Boolean.valueOf(z);
                        List list2 = this.zzi;
                        String zzl = zzicVar.zzd().zzl().zzl();
                        if (this.zzj == null) {
                            this.zzj = zzicVar.zzk().zzaw();
                        }
                        String str7 = this.zzj;
                        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
                            i = i4;
                            list = list2;
                            j = 0;
                            str4 = null;
                        } else {
                            zzg();
                            j = 0;
                            if (this.zzn == 0) {
                                i = i4;
                                list = list2;
                            } else {
                                i = i4;
                                list = list2;
                                long currentTimeMillis = zzicVar.zzaZ().currentTimeMillis() - this.zzn;
                                if (this.zzm != null && currentTimeMillis > 86400000 && this.zzo == null) {
                                    zzi();
                                }
                            }
                            if (this.zzm == null) {
                                zzi();
                            }
                            str4 = this.zzm;
                        }
                        boolean zzx = zzicVar.zzc().zzx();
                        zzpp zzk3 = zzicVar.zzk();
                        String zzj2 = zzj();
                        zzicVar2 = zzk3.zzu;
                        if (zzicVar2.zzaY().getPackageManager() != null) {
                            j2 = j;
                            i2 = 0;
                        } else {
                            try {
                                i2 = 0;
                                try {
                                    applicationInfo = Wrappers.packageManager(zzicVar2.zzaY()).getApplicationInfo(zzj2, 0);
                                } catch (PackageManager.NameNotFoundException unused4) {
                                    zzic zzicVar8 = zzk3.zzu;
                                    zzicVar8.zzaU();
                                    zzicVar8.zzaV().zzi().zzb("PackageManager failed to find running app: app_id", zzj2);
                                    i3 = i2;
                                    j2 = i3;
                                    zzic zzicVar9 = this.zzu;
                                    int zzb = zzicVar9.zzd().zzl().zzb();
                                    String zze = zzicVar9.zzd().zzj().zze();
                                    zzqp.zza();
                                    zzal zzc = zzicVar9.zzc();
                                    zzfx zzfxVar = zzfy.zzaQ;
                                    if (zzc.zzp(null, zzfxVar)) {
                                    }
                                    zzqp.zza();
                                    return new zzr(zzj, zzk, str5, j4, str6, 133005L, j6, str, zzB, z2, str2, min, i, zzu, z3, valueOf, j7, list, zzl, str7, str4, zzx, j2, zzb, zze, r46, zzicVar9.zzc().zzp(null, zzfxVar) ? zzicVar9.zzk().zzV() : j, zzicVar9.zzc().zzz(), new zze(zzicVar9.zzc().zzw(str3, true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                                }
                            } catch (PackageManager.NameNotFoundException unused5) {
                                i2 = 0;
                            }
                            if (applicationInfo != null) {
                                i3 = applicationInfo.targetSdkVersion;
                                j2 = i3;
                            }
                            i3 = i2;
                            j2 = i3;
                        }
                        zzic zzicVar92 = this.zzu;
                        int zzb2 = zzicVar92.zzd().zzl().zzb();
                        String zze2 = zzicVar92.zzd().zzj().zze();
                        zzqp.zza();
                        zzal zzc2 = zzicVar92.zzc();
                        zzfx zzfxVar2 = zzfy.zzaQ;
                        int zzU = zzc2.zzp(null, zzfxVar2) ? zzicVar92.zzk().zzU() : i2;
                        zzqp.zza();
                        return new zzr(zzj, zzk, str5, j4, str6, 133005L, j6, str, zzB, z2, str2, min, i, zzu, z3, valueOf, j7, list, zzl, str7, str4, zzx, j2, zzb2, zze2, zzU, zzicVar92.zzc().zzp(null, zzfxVar2) ? zzicVar92.zzk().zzV() : j, zzicVar92.zzc().zzz(), new zze(zzicVar92.zzc().zzw(str3, true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
                    }
                }
            }
        }
        str2 = null;
        zzic zzicVar72 = this.zzu;
        long zza2 = zzicVar72.zzd().zzc.zza();
        if (zza2 != 0) {
        }
        zzb();
        int i42 = this.zzk;
        zzicVar = this.zzu;
        boolean zzu2 = zzicVar.zzc().zzu();
        zzhh zzd2 = zzicVar.zzd();
        zzd2.zzg();
        boolean z32 = zzd2.zzd().getBoolean("deferred_analytics_collection", false);
        if (zzicVar.zzc().zzw("google_analytics_default_allow_ad_personalization_signals", true) == zzji.GRANTED) {
        }
        long j72 = this.zzg;
        Boolean valueOf2 = Boolean.valueOf(z);
        List list22 = this.zzi;
        String zzl2 = zzicVar.zzd().zzl().zzl();
        if (this.zzj == null) {
        }
        String str72 = this.zzj;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
        }
        boolean zzx2 = zzicVar.zzc().zzx();
        zzpp zzk32 = zzicVar.zzk();
        String zzj22 = zzj();
        zzicVar2 = zzk32.zzu;
        if (zzicVar2.zzaY().getPackageManager() != null) {
        }
        zzic zzicVar922 = this.zzu;
        int zzb22 = zzicVar922.zzd().zzl().zzb();
        String zze22 = zzicVar922.zzd().zzj().zze();
        zzqp.zza();
        zzal zzc22 = zzicVar922.zzc();
        zzfx zzfxVar22 = zzfy.zzaQ;
        if (zzc22.zzp(null, zzfxVar22)) {
        }
        zzqp.zza();
        return new zzr(zzj, zzk, str5, j4, str6, 133005L, j6, str, zzB, z2, str2, min, i, zzu2, z32, valueOf2, j72, list, zzl2, str72, str4, zzx2, j2, zzb22, zze22, zzU, zzicVar922.zzc().zzp(null, zzfxVar22) ? zzicVar922.zzk().zzV() : j, zzicVar922.zzc().zzz(), new zze(zzicVar922.zzc().zzw(str3, true)).zzb(), this.zzu.zza, this.zzu.zzx().zzj().zza());
    }

    final void zzi() {
        String format;
        zzg();
        zzic zzicVar = this.zzu;
        if (zzicVar.zzd().zzl().zzo(zzjk.ANALYTICS_STORAGE)) {
            byte[] bArr = new byte[16];
            zzicVar.zzk().zzf().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        } else {
            zzicVar.zzaV().zzj().zza("Analytics Storage consent is not granted");
            format = null;
        }
        zzicVar.zzaV().zzj().zza(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = zzicVar.zzaZ().currentTimeMillis();
    }

    final String zzj() {
        zzb();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzk() {
        zzg();
        zzb();
        Preconditions.checkNotNull(this.zzl);
        return this.zzl;
    }

    final String zzl() {
        zzb();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    final int zzm() {
        zzb();
        return this.zzc;
    }

    final long zzn() {
        return this.zzh;
    }

    final int zzo() {
        zzb();
        return this.zzk;
    }

    final List zzp() {
        return this.zzi;
    }

    final boolean zzq(String str) {
        String str2 = this.zzo;
        boolean z = false;
        if (str2 != null && !str2.equals(str)) {
            z = true;
        }
        this.zzo = str;
        return z;
    }
}
