package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.facebook.internal.AnalyticsEvents;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.android.gms.internal.measurement.zzpq;
import com.google.android.gms.measurement.internal.zzjj;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
/* loaded from: classes2.dex */
public final class zzgg extends zzf {
    private String zza;
    private String zzb;
    private int zzc;
    private String zzd;
    private String zze;
    private long zzf;
    private long zzg;
    private List<String> zzh;
    private String zzi;
    private int zzj;
    private String zzk;
    private String zzl;
    private String zzm;
    private long zzn;
    private String zzo;

    @Override // com.google.android.gms.measurement.internal.zzf
    protected final boolean zzab() {
        return true;
    }

    final int zzac() {
        zzw();
        return this.zzj;
    }

    final int zzad() {
        zzw();
        return this.zzc;
    }

    @Override // com.google.android.gms.measurement.internal.zzjf, com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf, com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zza zzc() {
        return super.zzc();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzp zza(String str) {
        long min;
        long j;
        int i;
        int i2;
        long j2;
        zzv();
        String zzaf = zzaf();
        String zzah = zzah();
        zzw();
        String str2 = this.zzb;
        long zzad = zzad();
        zzw();
        Preconditions.checkNotNull(this.zzd);
        String str3 = this.zzd;
        zzw();
        zzv();
        if (this.zzf == 0) {
            this.zzf = this.zzu.zzv().zza(zza(), zza().getPackageName());
        }
        long j3 = this.zzf;
        boolean zzae = this.zzu.zzae();
        boolean z = !zzk().zzm;
        zzv();
        String str4 = null;
        String zzak = !this.zzu.zzae() ? null : zzak();
        zzic zzicVar = this.zzu;
        String str5 = zzak;
        long zza = zzicVar.zzn().zzc.zza();
        if (zza == 0) {
            min = zzicVar.zza;
        } else {
            min = Math.min(zzicVar.zza, zza);
        }
        int zzac = zzac();
        boolean zzw = zze().zzw();
        zzha zzk = zzk();
        zzk.zzv();
        boolean z2 = zzk.zzg().getBoolean("deferred_analytics_collection", false);
        String zzae2 = zzae();
        Boolean valueOf = Boolean.valueOf(zze().zzc("google_analytics_default_allow_ad_personalization_signals", true) != zzjm.GRANTED);
        long j4 = this.zzg;
        List<String> list = this.zzh;
        String zzf = zzk().zzp().zzf();
        if (this.zzi == null) {
            this.zzi = zzs().zzq();
        }
        String str6 = this.zzi;
        if (zzk().zzp().zza(zzjj.zza.ANALYTICS_STORAGE)) {
            zzv();
            if (this.zzn != 0) {
                long currentTimeMillis = zzb().currentTimeMillis() - this.zzn;
                if (this.zzm != null && currentTimeMillis > 86400000 && this.zzo == null) {
                    zzaj();
                }
            }
            if (this.zzm == null) {
                zzaj();
            }
            str4 = this.zzm;
        }
        boolean zzab = zze().zzab();
        long zzc = zzs().zzc(zzaf());
        int zza2 = zzk().zzp().zza();
        String zzf2 = zzk().zzo().zzf();
        if (com.google.android.gms.internal.measurement.zzoy.zza()) {
            j = zzc;
            if (zze().zza(zzbn.zzcq)) {
                zzs();
                i = zzpn.zzc();
                if (com.google.android.gms.internal.measurement.zzoy.zza()) {
                    i2 = i;
                } else {
                    i2 = i;
                    if (zze().zza(zzbn.zzcq)) {
                        j2 = zzs().zzm();
                        return new zzp(zzaf, zzah, str2, zzad, str3, 114010L, j3, str, zzae, z, str5, min, zzac, zzw, z2, zzae2, valueOf, j4, list, (String) null, zzf, str6, str4, zzab, j, zza2, zzf2, i2, j2, zze().zzr(), new zzd(zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, zze().zza(zzbn.zzcl) ? zzo().zzac().zza() : 0);
                    }
                }
                j2 = 0;
                return new zzp(zzaf, zzah, str2, zzad, str3, 114010L, j3, str, zzae, z, str5, min, zzac, zzw, z2, zzae2, valueOf, j4, list, (String) null, zzf, str6, str4, zzab, j, zza2, zzf2, i2, j2, zze().zzr(), new zzd(zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, zze().zza(zzbn.zzcl) ? zzo().zzac().zza() : 0);
            }
        } else {
            j = zzc;
        }
        i = 0;
        if (com.google.android.gms.internal.measurement.zzoy.zza()) {
        }
        j2 = 0;
        return new zzp(zzaf, zzah, str2, zzad, str3, 114010L, j3, str, zzae, z, str5, min, zzac, zzw, z2, zzae2, valueOf, j4, list, (String) null, zzf, str6, str4, zzab, j, zza2, zzf2, i2, j2, zze().zzr(), new zzd(zze().zzc("google_analytics_default_allow_ad_personalization_signals", true)).zzb(), this.zzu.zza, zze().zza(zzbn.zzcl) ? zzo().zzac().zza() : 0);
    }

    @Override // com.google.android.gms.measurement.internal.zzjf, com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final /* bridge */ /* synthetic */ zzaf zzd() {
        return super.zzd();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @Pure
    public final /* bridge */ /* synthetic */ zzai zze() {
        return super.zze();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @Pure
    public final /* bridge */ /* synthetic */ zzbf zzf() {
        return super.zzf();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzgg zzg() {
        return super.zzg();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzgj zzh() {
        return super.zzh();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @Pure
    public final /* bridge */ /* synthetic */ zzgl zzi() {
        return super.zzi();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf, com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final /* bridge */ /* synthetic */ zzgo zzj() {
        return super.zzj();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @Pure
    public final /* bridge */ /* synthetic */ zzha zzk() {
        return super.zzk();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf, com.google.android.gms.measurement.internal.zzjh
    @Pure
    public final /* bridge */ /* synthetic */ zzhv zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzju zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @Pure
    public final /* bridge */ /* synthetic */ zzlp zzn() {
        return super.zzn();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzls zzo() {
        return super.zzo();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzlz zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zzme zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    public final /* bridge */ /* synthetic */ zznx zzr() {
        return super.zzr();
    }

    @Override // com.google.android.gms.measurement.internal.zzjf
    @Pure
    public final /* bridge */ /* synthetic */ zzpn zzs() {
        return super.zzs();
    }

    final String zzae() {
        zzw();
        return this.zzl;
    }

    final String zzaf() {
        zzw();
        Preconditions.checkNotNull(this.zza);
        return this.zza;
    }

    final String zzag() {
        zzw();
        Preconditions.checkNotNull(this.zze);
        return this.zze;
    }

    private final String zzak() {
        if (zzpq.zza() && zze().zza(zzbn.zzcb)) {
            zzj().zzq().zza("Disabled IID for tests.");
            return null;
        }
        try {
            Class<?> loadClass = zza().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", Context.class).invoke(null, zza());
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    zzj().zzw().zza("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                zzj().zzx().zza("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
        }
    }

    final String zzah() {
        zzv();
        zzw();
        Preconditions.checkNotNull(this.zzk);
        return this.zzk;
    }

    final List<String> zzai() {
        return this.zzh;
    }

    zzgg(zzic zzicVar, long j) {
        super(zzicVar);
        this.zzn = 0L;
        this.zzo = null;
        this.zzg = j;
    }

    @Override // com.google.android.gms.measurement.internal.zzg, com.google.android.gms.measurement.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzt() {
        super.zzt();
    }

    @Override // com.google.android.gms.measurement.internal.zzg, com.google.android.gms.measurement.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzu() {
        super.zzu();
    }

    @Override // com.google.android.gms.measurement.internal.zzg, com.google.android.gms.measurement.internal.zzjf
    public final /* bridge */ /* synthetic */ void zzv() {
        super.zzv();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(1:3)(6:65|66|(1:68)(2:83|(1:85))|69|70|(21:72|(1:74)(1:81)|76|77|5|(1:64)(1:9)|10|11|(1:14)|15|(1:17)|18|19|(1:21)(1:52)|22|(1:24)|(3:26|(1:28)(1:31)|29)|32|(3:34|(1:36)(3:43|(3:46|(1:48)(1:49)|44)|50)|(2:38|39)(2:41|42))|51|(0)(0)))|4|5|(1:7)|64|10|11|(0)|15|(0)|18|19|(0)(0)|22|(0)|(0)|32|(0)|51|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01ca, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01cb, code lost:
    
        zzj().zzg().zza("Fetching Google App Id failed with exception. appId", com.google.android.gms.measurement.internal.zzgo.zza(r0), r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0194 A[Catch: IllegalStateException -> 0x01ca, TryCatch #3 {IllegalStateException -> 0x01ca, blocks: (B:19:0x016f, B:22:0x018c, B:24:0x0194, B:26:0x01ad, B:28:0x01c1, B:29:0x01c6, B:31:0x01c4), top: B:18:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01ad A[Catch: IllegalStateException -> 0x01ca, TryCatch #3 {IllegalStateException -> 0x01ca, blocks: (B:19:0x016f, B:22:0x018c, B:24:0x0194, B:26:0x01ad, B:28:0x01c1, B:29:0x01c6, B:31:0x01c4), top: B:18:0x016f }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a9  */
    @Override // com.google.android.gms.measurement.internal.zzf
    @EnsuresNonNull({"appId", "appStore", "appName", "gmpAppId", "gaAppId"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzz() {
        String str;
        String str2;
        PackageInfo packageInfo;
        Object[] objArr;
        int zzc;
        boolean z;
        List<String> zzg;
        String zza;
        String packageName = zza().getPackageName();
        PackageManager packageManager = zza().getPackageManager();
        String str3 = "";
        String str4 = "unknown";
        String str5 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzj().zzg().zza("PackageManager is null, app identity information might be inaccurate. appId", zzgo.zza(packageName));
        } else {
            try {
                str4 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzj().zzg().zza("Error retrieving app installer package name. appId", zzgo.zza(packageName));
            }
            if (str4 == null) {
                str4 = "manual_install";
            } else if ("com.android.vending".equals(str4)) {
                str4 = "";
            }
            try {
                packageInfo = packageManager.getPackageInfo(zza().getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused2) {
                str = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
            }
            if (packageInfo != null) {
                CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                str2 = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
                try {
                    str5 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                } catch (PackageManager.NameNotFoundException unused3) {
                    str = str5;
                    str5 = str2;
                    zzj().zzg().zza("Error retrieving package info. appId, appName", zzgo.zza(packageName), str5);
                    str2 = str5;
                    str5 = str;
                    this.zza = packageName;
                    this.zzd = str4;
                    this.zzb = str5;
                    this.zzc = i;
                    this.zze = str2;
                    this.zzf = 0L;
                    if (TextUtils.isEmpty(this.zzu.zzw())) {
                    }
                    zzc = this.zzu.zzc();
                    switch (zzc) {
                    }
                    if (zzc == 0) {
                    }
                    this.zzk = "";
                    this.zzl = "";
                    if (objArr != false) {
                    }
                    zza = new zzhw(zza(), this.zzu.zzz()).zza("google_app_id");
                    if (!TextUtils.isEmpty(zza)) {
                    }
                    this.zzk = str3;
                    if (!TextUtils.isEmpty(zza)) {
                    }
                    if (z) {
                    }
                    this.zzh = null;
                    zzg = zze().zzg("analytics.safelisted_events");
                    if (zzg != null) {
                    }
                    this.zzh = zzg;
                    if (packageManager == null) {
                    }
                }
                this.zza = packageName;
                this.zzd = str4;
                this.zzb = str5;
                this.zzc = i;
                this.zze = str2;
                this.zzf = 0L;
                objArr = TextUtils.isEmpty(this.zzu.zzw()) && "am".equals(this.zzu.zzx());
                zzc = this.zzu.zzc();
                switch (zzc) {
                    case 0:
                        zzj().zzq().zza("App measurement collection enabled");
                        break;
                    case 1:
                        zzj().zzp().zza("App measurement deactivated via the manifest");
                        break;
                    case 2:
                        zzj().zzq().zza("App measurement deactivated via the init parameters");
                        break;
                    case 3:
                        zzj().zzp().zza("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        break;
                    case 4:
                        zzj().zzp().zza("App measurement disabled via the manifest");
                        break;
                    case 5:
                        zzj().zzq().zza("App measurement disabled via the init parameters");
                        break;
                    case 6:
                        zzj().zzw().zza("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        break;
                    case 7:
                        zzj().zzp().zza("App measurement disabled via the global data collection setting");
                        break;
                    case 8:
                        zzj().zzp().zza("App measurement disabled due to denied storage consent");
                        break;
                    default:
                        zzj().zzp().zza("App measurement disabled");
                        zzj().zzo().zza("Invalid scion state in identity");
                        break;
                }
                z = zzc == 0;
                this.zzk = "";
                this.zzl = "";
                if (objArr != false) {
                    this.zzl = this.zzu.zzw();
                }
                zza = new zzhw(zza(), this.zzu.zzz()).zza("google_app_id");
                if (!TextUtils.isEmpty(zza)) {
                    str3 = zza;
                }
                this.zzk = str3;
                if (!TextUtils.isEmpty(zza)) {
                    this.zzl = new zzhw(zza(), this.zzu.zzz()).zza("admob_app_id");
                }
                if (z) {
                    zzj().zzq().zza("App measurement enabled for app package, google app id", this.zza, TextUtils.isEmpty(this.zzk) ? this.zzl : this.zzk);
                }
                this.zzh = null;
                zzg = zze().zzg("analytics.safelisted_events");
                if (zzg != null) {
                    if (zzg.isEmpty()) {
                        zzj().zzw().zza("Safelisted event list is empty. Ignoring");
                    } else {
                        Iterator<String> it = zzg.iterator();
                        while (it.hasNext()) {
                            if (!zzs().zzb("safelisted event", it.next())) {
                            }
                        }
                    }
                    if (packageManager == null) {
                        this.zzj = InstantApps.isInstantApp(zza()) ? 1 : 0;
                        return;
                    } else {
                        this.zzj = 0;
                        return;
                    }
                }
                this.zzh = zzg;
                if (packageManager == null) {
                }
            }
        }
        str2 = AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
        this.zza = packageName;
        this.zzd = str4;
        this.zzb = str5;
        this.zzc = i;
        this.zze = str2;
        this.zzf = 0L;
        if (TextUtils.isEmpty(this.zzu.zzw())) {
        }
        zzc = this.zzu.zzc();
        switch (zzc) {
        }
        if (zzc == 0) {
        }
        this.zzk = "";
        this.zzl = "";
        if (objArr != false) {
        }
        zza = new zzhw(zza(), this.zzu.zzz()).zza("google_app_id");
        if (!TextUtils.isEmpty(zza)) {
        }
        this.zzk = str3;
        if (!TextUtils.isEmpty(zza)) {
        }
        if (z) {
        }
        this.zzh = null;
        zzg = zze().zzg("analytics.safelisted_events");
        if (zzg != null) {
        }
        this.zzh = zzg;
        if (packageManager == null) {
        }
    }

    final void zzaj() {
        String format;
        zzv();
        if (!zzk().zzp().zza(zzjj.zza.ANALYTICS_STORAGE)) {
            zzj().zzc().zza("Analytics Storage consent is not granted");
            format = null;
        } else {
            byte[] bArr = new byte[16];
            zzs().zzw().nextBytes(bArr);
            format = String.format(Locale.US, "%032x", new BigInteger(1, bArr));
        }
        zzj().zzc().zza(String.format("Resetting session stitching token to %s", format == null ? "null" : "not null"));
        this.zzm = format;
        this.zzn = zzb().currentTimeMillis();
    }

    final boolean zzb(String str) {
        String str2 = this.zzo;
        boolean z = (str2 == null || str2.equals(str)) ? false : true;
        this.zzo = str;
        return z;
    }
}
