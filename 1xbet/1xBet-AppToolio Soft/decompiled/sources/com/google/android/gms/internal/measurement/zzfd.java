package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.annotation.WorkerThread;
import android.support.v4.os.EnvironmentCompat;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.GoogleServices;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.firebase.iid.FirebaseInstanceId;
import java.math.BigInteger;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzfd extends zzdz {
    private String zzafa;
    private String zzafh;
    private long zzafl;
    private int zzagb;
    private int zzakd;
    private long zzake;
    private String zztf;
    private String zztg;
    private String zzth;

    zzfd(zzgn zzgnVar) {
        super(zzgnVar);
    }

    @WorkerThread
    private final String zzgr() {
        zzab();
        zzfv();
        if (zzgk().zzbb(this.zzth) && !this.zzacv.isEnabled()) {
            return null;
        }
        try {
            return FirebaseInstanceId.getInstance().getId();
        } catch (IllegalStateException unused) {
            zzgi().zziy().log("Failed to retrieve Firebase Instance Id");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Context getContext() {
        return super.getContext();
    }

    final String getGmpAppId() {
        zzch();
        return this.zzafa;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzab() {
        super.zzab();
    }

    final String zzah() {
        zzch();
        return this.zzth;
    }

    @WorkerThread
    final zzeb zzbl(String str) {
        zzab();
        zzfv();
        String zzah = zzah();
        String gmpAppId = getGmpAppId();
        zzch();
        String str2 = this.zztg;
        long zzis = zzis();
        zzch();
        String str3 = this.zzafh;
        long zzgw = zzgk().zzgw();
        zzch();
        zzab();
        if (this.zzake == 0) {
            this.zzake = this.zzacv.zzgg().zzd(getContext(), getContext().getPackageName());
        }
        long j = this.zzake;
        boolean isEnabled = this.zzacv.isEnabled();
        boolean z = !zzgj().zzamm;
        String zzgr = zzgr();
        zzch();
        long j2 = this.zzafl;
        long zzke = this.zzacv.zzke();
        int zzit = zzit();
        zzeh zzgk = zzgk();
        zzgk.zzfv();
        Boolean zzat = zzgk.zzat("google_analytics_adid_collection_enabled");
        boolean booleanValue = Boolean.valueOf(zzat == null || zzat.booleanValue()).booleanValue();
        zzeh zzgk2 = zzgk();
        zzgk2.zzfv();
        Boolean zzat2 = zzgk2.zzat("google_analytics_ssaid_collection_enabled");
        return new zzeb(zzah, gmpAppId, str2, zzis, str3, zzgw, j, str, isEnabled, z, zzgr, j2, zzke, zzit, booleanValue, Boolean.valueOf(zzat2 == null || zzat2.booleanValue()).booleanValue(), zzgj().zzjo());
    }

    @Override // com.google.android.gms.internal.measurement.zzhi, com.google.android.gms.internal.measurement.zzhk
    public final /* bridge */ /* synthetic */ Clock zzbt() {
        return super.zzbt();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfu() {
        super.zzfu();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfv() {
        super.zzfv();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy, com.google.android.gms.internal.measurement.zzhi
    public final /* bridge */ /* synthetic */ void zzfw() {
        super.zzfw();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzdu zzfx() {
        return super.zzfx();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzhm zzfy() {
        return super.zzfy();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzfd zzfz() {
        return super.zzfz();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzik zzga() {
        return super.zzga();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzih zzgb() {
        return super.zzgb();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzfe zzgc() {
        return super.zzgc();
    }

    @Override // com.google.android.gms.internal.measurement.zzdy
    public final /* bridge */ /* synthetic */ zzjj zzgd() {
        return super.zzgd();
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

    @Override // com.google.android.gms.internal.measurement.zzdz
    protected final boolean zzgn() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.measurement.zzdz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void zzgo() {
        String str;
        zzfk zzja;
        String str2;
        String str3 = EnvironmentCompat.MEDIA_UNKNOWN;
        String str4 = "Unknown";
        str = "Unknown";
        String packageName = getContext().getPackageName();
        PackageManager packageManager = getContext().getPackageManager();
        int i = Integer.MIN_VALUE;
        if (packageManager == null) {
            zzgi().zziv().zzg("PackageManager is null, app identity information might be inaccurate. appId", zzfi.zzbp(packageName));
        } else {
            try {
                str3 = packageManager.getInstallerPackageName(packageName);
            } catch (IllegalArgumentException unused) {
                zzgi().zziv().zzg("Error retrieving app installer package name. appId", zzfi.zzbp(packageName));
            }
            if (str3 == null) {
                str3 = "manual_install";
            } else if ("com.android.vending".equals(str3)) {
                str3 = "";
            }
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(getContext().getPackageName(), 0);
                if (packageInfo != null) {
                    CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                    str = TextUtils.isEmpty(applicationLabel) ? "Unknown" : applicationLabel.toString();
                    str4 = packageInfo.versionName;
                    i = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                zzgi().zziv().zze("Error retrieving package info. appId, appName", zzfi.zzbp(packageName), str);
            }
        }
        this.zzth = packageName;
        this.zzafh = str3;
        this.zztg = str4;
        this.zzakd = i;
        this.zztf = str;
        this.zzake = 0L;
        zzgl();
        Status initialize = GoogleServices.initialize(getContext());
        boolean z = true;
        boolean z2 = initialize != null && initialize.isSuccess();
        if (!z2) {
            if (initialize == null) {
                zzgi().zziv().log("GoogleService failed to initialize (no status)");
            } else {
                zzgi().zziv().zze("GoogleService failed to initialize, status", Integer.valueOf(initialize.getStatusCode()), initialize.getStatusMessage());
            }
        }
        if (z2) {
            Boolean zzhp = zzgk().zzhp();
            if (zzgk().zzho()) {
                zzja = zzgi().zzja();
                str2 = "Collection disabled with firebase_analytics_collection_deactivated=1";
            } else if (zzhp != null && !zzhp.booleanValue()) {
                zzja = zzgi().zzja();
                str2 = "Collection disabled with firebase_analytics_collection_enabled=0";
            } else {
                if (zzhp != null || !GoogleServices.isMeasurementExplicitlyDisabled()) {
                    zzgi().zzjc().log("Collection enabled");
                    this.zzafa = "";
                    this.zzafl = 0L;
                    zzgl();
                    if (this.zzacv.zzkd() == null) {
                        this.zzafa = this.zzacv.zzkd();
                    } else {
                        try {
                            String googleAppId = GoogleServices.getGoogleAppId();
                            if (TextUtils.isEmpty(googleAppId)) {
                                googleAppId = "";
                            }
                            this.zzafa = googleAppId;
                            if (z) {
                                zzgi().zzjc().zze("App package, google app id", this.zzth, this.zzafa);
                            }
                        } catch (IllegalStateException e) {
                            zzgi().zziv().zze("getGoogleAppId or isMeasurementEnabled failed with exception. appId", zzfi.zzbp(packageName), e);
                        }
                    }
                    if (Build.VERSION.SDK_INT < 16) {
                        this.zzagb = InstantApps.isInstantApp(getContext()) ? 1 : 0;
                        return;
                    } else {
                        this.zzagb = 0;
                        return;
                    }
                }
                zzja = zzgi().zzja();
                str2 = "Collection disabled with google_app_measurement_enable=0";
            }
            zzja.log(str2);
        }
        z = false;
        this.zzafa = "";
        this.zzafl = 0L;
        zzgl();
        if (this.zzacv.zzkd() == null) {
        }
        if (Build.VERSION.SDK_INT < 16) {
        }
    }

    @WorkerThread
    final String zzir() {
        byte[] bArr = new byte[16];
        zzgg().zzlo().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final int zzis() {
        zzch();
        return this.zzakd;
    }

    final int zzit() {
        zzch();
        return this.zzagb;
    }
}
