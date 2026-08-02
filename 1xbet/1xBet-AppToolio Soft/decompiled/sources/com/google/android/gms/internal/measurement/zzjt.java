package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.NonNull;
import android.support.annotation.Size;
import android.support.annotation.WorkerThread;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.data.DataBufferSafeParcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class zzjt implements zzhk {
    private static volatile zzjt zzarr;
    private final zzgn zzacv;
    private zzgh zzars;
    private zzfm zzart;
    private zzek zzaru;
    private zzfr zzarv;
    private zzjp zzarw;
    private zzed zzarx;
    private final zzjz zzary;
    private boolean zzarz;

    @VisibleForTesting
    private long zzasa;
    private List<Runnable> zzasb;
    private int zzasc;
    private int zzasd;
    private boolean zzase;
    private boolean zzasf;
    private boolean zzasg;
    private FileLock zzash;
    private FileChannel zzasi;
    private List<Long> zzasj;
    private List<Long> zzask;
    private long zzasl;
    private boolean zzvn;

    class zza implements zzem {
        zzku zzasp;
        List<Long> zzasq;
        List<zzkr> zzasr;
        private long zzass;

        private zza() {
        }

        /* synthetic */ zza(zzjt zzjtVar, zzju zzjuVar) {
            this();
        }

        private static long zza(zzkr zzkrVar) {
            return ((zzkrVar.zzavb.longValue() / 1000) / 60) / 60;
        }

        @Override // com.google.android.gms.internal.measurement.zzem
        public final boolean zza(long j, zzkr zzkrVar) {
            Preconditions.checkNotNull(zzkrVar);
            if (this.zzasr == null) {
                this.zzasr = new ArrayList();
            }
            if (this.zzasq == null) {
                this.zzasq = new ArrayList();
            }
            if (this.zzasr.size() > 0 && zza(this.zzasr.get(0)) != zza(zzkrVar)) {
                return false;
            }
            long zzwb = this.zzass + zzkrVar.zzwb();
            if (zzwb >= Math.max(0, zzez.zzaim.get().intValue())) {
                return false;
            }
            this.zzass = zzwb;
            this.zzasr.add(zzkrVar);
            this.zzasq.add(Long.valueOf(j));
            return this.zzasr.size() < Math.max(1, zzez.zzain.get().intValue());
        }

        @Override // com.google.android.gms.internal.measurement.zzem
        public final void zzb(zzku zzkuVar) {
            Preconditions.checkNotNull(zzkuVar);
            this.zzasp = zzkuVar;
        }
    }

    private zzjt(zzjy zzjyVar) {
        this(zzjyVar, null);
    }

    private zzjt(zzjy zzjyVar, zzgn zzgnVar) {
        this.zzvn = false;
        Preconditions.checkNotNull(zzjyVar);
        this.zzacv = zzgn.zza(zzjyVar.zzqx, null, null);
        this.zzasl = -1L;
        zzjz zzjzVar = new zzjz(this);
        zzjzVar.zzm();
        this.zzary = zzjzVar;
        zzfm zzfmVar = new zzfm(this);
        zzfmVar.zzm();
        this.zzart = zzfmVar;
        zzgh zzghVar = new zzgh(this);
        zzghVar.zzm();
        this.zzars = zzghVar;
        this.zzacv.zzgh().zzc(new zzju(this, zzjyVar));
    }

    @WorkerThread
    @VisibleForTesting
    private final int zza(FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzacv.zzgi().zziv().log("Bad channel to read from");
            return 0;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        try {
            fileChannel.position(0L);
            int read = fileChannel.read(allocate);
            if (read == 4) {
                allocate.flip();
                return allocate.getInt();
            }
            if (read != -1) {
                this.zzacv.zzgi().zziy().zzg("Unexpected data length. Bytes read", Integer.valueOf(read));
            }
            return 0;
        } catch (IOException e) {
            this.zzacv.zzgi().zziv().zzg("Failed to read from channel", e);
            return 0;
        }
    }

    private final zzeb zza(Context context, String str, String str2, boolean z, boolean z2, boolean z3, long j) {
        String str3;
        String str4;
        int i;
        String str5 = "Unknown";
        str3 = "Unknown";
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            this.zzacv.zzgi().zziv().log("PackageManager is null, can not log app install information");
            return null;
        }
        try {
            str5 = packageManager.getInstallerPackageName(str);
        } catch (IllegalArgumentException unused) {
            this.zzacv.zzgi().zziv().zzg("Error retrieving installer package name. appId", zzfi.zzbp(str));
        }
        if (str5 == null) {
            str5 = "manual_install";
        } else if ("com.android.vending".equals(str5)) {
            str5 = "";
        }
        String str6 = str5;
        try {
            PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo(str, 0);
            if (packageInfo != null) {
                CharSequence applicationLabel = Wrappers.packageManager(context).getApplicationLabel(str);
                str3 = TextUtils.isEmpty(applicationLabel) ? "Unknown" : applicationLabel.toString();
                str4 = packageInfo.versionName;
                i = packageInfo.versionCode;
            } else {
                str4 = "Unknown";
                i = Integer.MIN_VALUE;
            }
            this.zzacv.zzgl();
            return new zzeb(str, str2, str4, i, str6, this.zzacv.zzgk().zzgw(), this.zzacv.zzgg().zzd(context, str), (String) null, z, false, "", 0L, this.zzacv.zzgk().zzbd(str) ? j : 0L, 0, z2, z3, false);
        } catch (PackageManager.NameNotFoundException unused2) {
            this.zzacv.zzgi().zziv().zze("Error retrieving newly installed package info. appId, appName", zzfi.zzbp(str), str3);
            return null;
        }
    }

    private static void zza(zzjs zzjsVar) {
        if (zzjsVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzjsVar.isInitialized()) {
            return;
        }
        String valueOf = String.valueOf(zzjsVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    public final void zza(zzjy zzjyVar) {
        this.zzacv.zzgh().zzab();
        zzek zzekVar = new zzek(this);
        zzekVar.zzm();
        this.zzaru = zzekVar;
        this.zzacv.zzgk().zza(this.zzars);
        zzed zzedVar = new zzed(this);
        zzedVar.zzm();
        this.zzarx = zzedVar;
        zzjp zzjpVar = new zzjp(this);
        zzjpVar.zzm();
        this.zzarw = zzjpVar;
        this.zzarv = new zzfr(this);
        if (this.zzasc != this.zzasd) {
            this.zzacv.zzgi().zziv().zze("Not all upload components initialized", Integer.valueOf(this.zzasc), Integer.valueOf(this.zzasd));
        }
        this.zzvn = true;
    }

    @WorkerThread
    @VisibleForTesting
    private final boolean zza(int i, FileChannel fileChannel) {
        zzab();
        if (fileChannel == null || !fileChannel.isOpen()) {
            this.zzacv.zzgi().zziv().log("Bad channel to read from");
            return false;
        }
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(i);
        allocate.flip();
        try {
            fileChannel.truncate(0L);
            fileChannel.write(allocate);
            fileChannel.force(true);
            if (fileChannel.size() != 4) {
                this.zzacv.zzgi().zziv().zzg("Error writing to channel. Bytes written", Long.valueOf(fileChannel.size()));
            }
            return true;
        } catch (IOException e) {
            this.zzacv.zzgi().zziv().zzg("Failed to write to channel", e);
            return false;
        }
    }

    private final boolean zza(String str, zzex zzexVar) {
        long longValue;
        zzkc zzkcVar;
        String string = zzexVar.zzahg.getString(FirebaseAnalytics.Param.CURRENCY);
        if (FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(zzexVar.name)) {
            double doubleValue = zzexVar.zzahg.zzbk(FirebaseAnalytics.Param.VALUE).doubleValue() * 1000000.0d;
            if (doubleValue == 0.0d) {
                double longValue2 = zzexVar.zzahg.getLong(FirebaseAnalytics.Param.VALUE).longValue();
                Double.isNaN(longValue2);
                doubleValue = longValue2 * 1000000.0d;
            }
            if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                this.zzacv.zzgi().zziy().zze("Data lost. Currency value is too big. appId", zzfi.zzbp(str), Double.valueOf(doubleValue));
                return false;
            }
            longValue = Math.round(doubleValue);
        } else {
            longValue = zzexVar.zzahg.getLong(FirebaseAnalytics.Param.VALUE).longValue();
        }
        if (!TextUtils.isEmpty(string)) {
            String upperCase = string.toUpperCase(Locale.US);
            if (upperCase.matches("[A-Z]{3}")) {
                String valueOf = String.valueOf("_ltv_");
                String valueOf2 = String.valueOf(upperCase);
                String concat = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                zzkc zzh = zzjh().zzh(str, concat);
                if (zzh == null || !(zzh.value instanceof Long)) {
                    zzek zzjh = zzjh();
                    int zzb = this.zzacv.zzgk().zzb(str, zzez.zzaji) - 1;
                    Preconditions.checkNotEmpty(str);
                    zzjh.zzab();
                    zzjh.zzch();
                    try {
                        zzjh.getWritableDatabase().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '_ltv_%' order by set_timestamp desc limit ?,10);", new String[]{str, str, String.valueOf(zzb)});
                    } catch (SQLiteException e) {
                        zzjh.zzgi().zziv().zze("Error pruning currencies. appId", zzfi.zzbp(str), e);
                    }
                    zzkcVar = new zzkc(str, zzexVar.origin, concat, this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(longValue));
                } else {
                    zzkcVar = new zzkc(str, zzexVar.origin, concat, this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(((Long) zzh.value).longValue() + longValue));
                }
                if (!zzjh().zza(zzkcVar)) {
                    this.zzacv.zzgi().zziv().zzd("Too many unique user properties are set. Ignoring user property. appId", zzfi.zzbp(str), this.zzacv.zzgf().zzbo(zzkcVar.name), zzkcVar.value);
                    this.zzacv.zzgg().zza(str, 9, (String) null, (String) null, 0);
                }
            }
        }
        return true;
    }

    private final zzkp[] zza(String str, zzkx[] zzkxVarArr, zzkr[] zzkrVarArr) {
        Preconditions.checkNotEmpty(str);
        return zzjg().zza(str, zzkrVarArr, zzkxVarArr);
    }

    @WorkerThread
    private final void zzab() {
        this.zzacv.zzgh().zzab();
    }

    @WorkerThread
    private final void zzb(zzea zzeaVar) {
        ArrayMap arrayMap;
        zzab();
        if (TextUtils.isEmpty(zzeaVar.getGmpAppId())) {
            zzb(zzeaVar.zzah(), 204, null, null, null);
            return;
        }
        zzeh zzgk = this.zzacv.zzgk();
        String gmpAppId = zzeaVar.getGmpAppId();
        String appInstanceId = zzeaVar.getAppInstanceId();
        Uri.Builder builder = new Uri.Builder();
        Uri.Builder encodedAuthority = builder.scheme(zzez.zzaii.get()).encodedAuthority(zzez.zzaij.get());
        String valueOf = String.valueOf(gmpAppId);
        encodedAuthority.path(valueOf.length() != 0 ? "config/app/".concat(valueOf) : new String("config/app/")).appendQueryParameter("app_instance_id", appInstanceId).appendQueryParameter("platform", "android").appendQueryParameter("gmp_version", String.valueOf(zzgk.zzgw()));
        String uri = builder.build().toString();
        try {
            URL url = new URL(uri);
            this.zzacv.zzgi().zzjc().zzg("Fetching remote configuration", zzeaVar.zzah());
            zzkn zzbx = zzky().zzbx(zzeaVar.zzah());
            String zzby = zzky().zzby(zzeaVar.zzah());
            if (zzbx == null || TextUtils.isEmpty(zzby)) {
                arrayMap = null;
            } else {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put("If-Modified-Since", zzby);
                arrayMap = arrayMap2;
            }
            this.zzase = true;
            zzfm zzkz = zzkz();
            String zzah = zzeaVar.zzah();
            zzjw zzjwVar = new zzjw(this);
            zzkz.zzab();
            zzkz.zzch();
            Preconditions.checkNotNull(url);
            Preconditions.checkNotNull(zzjwVar);
            zzkz.zzgh().zzd(new zzfq(zzkz, zzah, url, null, arrayMap, zzjwVar));
        } catch (MalformedURLException unused) {
            this.zzacv.zzgi().zziv().zze("Failed to parse config URL. Not fetching. appId", zzfi.zzbp(zzeaVar.zzah()), uri);
        }
    }

    @WorkerThread
    private final Boolean zzc(zzea zzeaVar) {
        try {
            if (zzeaVar.zzgu() != -2147483648L) {
                if (zzeaVar.zzgu() == Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(zzeaVar.zzah(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(zzeaVar.zzah(), 0).versionName;
                if (zzeaVar.zzag() != null && zzeaVar.zzag().equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0588, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzc(zzex zzexVar, zzeb zzebVar) {
        zzet zzah;
        zzea zzbf;
        Preconditions.checkNotNull(zzebVar);
        Preconditions.checkNotEmpty(zzebVar.packageName);
        long nanoTime = System.nanoTime();
        zzab();
        zzlc();
        String str = zzebVar.packageName;
        if (zzjf().zzd(zzexVar, zzebVar)) {
            if (!zzebVar.zzafk) {
                zzg(zzebVar);
                return;
            }
            if (zzky().zzn(str, zzexVar.name)) {
                this.zzacv.zzgi().zziy().zze("Dropping blacklisted event. appId", zzfi.zzbp(str), this.zzacv.zzgf().zzbm(zzexVar.name));
                boolean z = zzky().zzcb(str) || zzky().zzcc(str);
                if (!z && !"_err".equals(zzexVar.name)) {
                    this.zzacv.zzgg().zza(str, 11, "_ev", zzexVar.name, 0);
                }
                if (!z || (zzbf = zzjh().zzbf(str)) == null) {
                    return;
                }
                if (Math.abs(this.zzacv.zzbt().currentTimeMillis() - Math.max(zzbf.zzha(), zzbf.zzgz())) > zzez.zzajd.get().longValue()) {
                    this.zzacv.zzgi().zzjb().log("Fetching config for blacklisted app");
                    zzb(zzbf);
                    return;
                }
                return;
            }
            if (this.zzacv.zzgi().isLoggable(2)) {
                this.zzacv.zzgi().zzjc().zzg("Logging event", this.zzacv.zzgf().zzb(zzexVar));
            }
            zzjh().beginTransaction();
            try {
                zzg(zzebVar);
                if (("_iap".equals(zzexVar.name) || FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(zzexVar.name)) && !zza(str, zzexVar)) {
                    zzjh().setTransactionSuccessful();
                    return;
                }
                boolean zzcg = zzkd.zzcg(zzexVar.name);
                boolean equals = "_err".equals(zzexVar.name);
                zzel zza2 = zzjh().zza(zzld(), str, true, zzcg, false, equals, false);
                long intValue = zza2.zzagu - zzez.zzaio.get().intValue();
                if (intValue > 0) {
                    if (intValue % 1000 == 1) {
                        this.zzacv.zzgi().zziv().zze("Data loss. Too many events logged. appId, count", zzfi.zzbp(str), Long.valueOf(zza2.zzagu));
                    }
                    zzjh().setTransactionSuccessful();
                    return;
                }
                if (zzcg) {
                    long intValue2 = zza2.zzagt - zzez.zzaiq.get().intValue();
                    if (intValue2 > 0) {
                        if (intValue2 % 1000 == 1) {
                            this.zzacv.zzgi().zziv().zze("Data loss. Too many public events logged. appId, count", zzfi.zzbp(str), Long.valueOf(zza2.zzagt));
                        }
                        this.zzacv.zzgg().zza(str, 16, "_ev", zzexVar.name, 0);
                        zzjh().setTransactionSuccessful();
                        return;
                    }
                }
                if (equals) {
                    long max = zza2.zzagw - Math.max(0, Math.min(1000000, this.zzacv.zzgk().zzb(zzebVar.packageName, zzez.zzaip)));
                    if (max > 0) {
                        if (max == 1) {
                            this.zzacv.zzgi().zziv().zze("Too many error events logged. appId, count", zzfi.zzbp(str), Long.valueOf(zza2.zzagw));
                        }
                        zzjh().setTransactionSuccessful();
                        return;
                    }
                }
                Bundle zzin = zzexVar.zzahg.zzin();
                this.zzacv.zzgg().zza(zzin, "_o", zzexVar.origin);
                if (this.zzacv.zzgg().zzcn(str)) {
                    this.zzacv.zzgg().zza(zzin, "_dbg", (Object) 1L);
                    this.zzacv.zzgg().zza(zzin, "_r", (Object) 1L);
                }
                long zzbg = zzjh().zzbg(str);
                if (zzbg > 0) {
                    this.zzacv.zzgi().zziy().zze("Data lost. Too many events stored on disk, deleted. appId", zzfi.zzbp(str), Long.valueOf(zzbg));
                }
                zzes zzesVar = r11;
                boolean z2 = false;
                zzes zzesVar2 = new zzes(this.zzacv, zzexVar.origin, str, zzexVar.name, zzexVar.zzahr, 0L, zzin);
                zzet zzf = zzjh().zzf(str, zzesVar.name);
                if (zzf != null) {
                    zzes zza3 = zzesVar.zza(this.zzacv, zzf.zzahj);
                    zzah = zzf.zzah(zza3.timestamp);
                    zzesVar = zza3;
                } else {
                    if (zzjh().zzbj(str) >= 500 && zzcg) {
                        this.zzacv.zzgi().zziv().zzd("Too many event names used, ignoring event. appId, name, supported count", zzfi.zzbp(str), this.zzacv.zzgf().zzbm(zzesVar.name), 500);
                        this.zzacv.zzgg().zza(str, 8, (String) null, (String) null, 0);
                        return;
                    }
                    zzah = new zzet(str, zzesVar.name, 0L, 0L, zzesVar.timestamp, 0L, null, null, null);
                }
                zzjh().zza(zzah);
                zzab();
                zzlc();
                Preconditions.checkNotNull(zzesVar);
                Preconditions.checkNotNull(zzebVar);
                Preconditions.checkNotEmpty(zzesVar.zzth);
                Preconditions.checkArgument(zzesVar.zzth.equals(zzebVar.packageName));
                zzku zzkuVar = new zzku();
                zzkuVar.zzavh = 1;
                zzkuVar.zzavp = "android";
                zzkuVar.zzth = zzebVar.packageName;
                zzkuVar.zzafh = zzebVar.zzafh;
                zzkuVar.zztg = zzebVar.zztg;
                zzkuVar.zzawb = zzebVar.zzafg == -2147483648L ? null : Integer.valueOf((int) zzebVar.zzafg);
                zzkuVar.zzavt = Long.valueOf(zzebVar.zzafi);
                zzkuVar.zzafa = zzebVar.zzafa;
                zzkuVar.zzavx = zzebVar.zzafj == 0 ? null : Long.valueOf(zzebVar.zzafj);
                Pair<String, Boolean> zzbr = this.zzacv.zzgj().zzbr(zzebVar.packageName);
                if (zzbr == null || TextUtils.isEmpty((CharSequence) zzbr.first)) {
                    if (!this.zzacv.zzge().zzf(this.zzacv.getContext()) && zzebVar.zzafn) {
                        String string = Settings.Secure.getString(this.zzacv.getContext().getContentResolver(), "android_id");
                        if (string == null) {
                            this.zzacv.zzgi().zziy().zzg("null secure ID. appId", zzfi.zzbp(zzkuVar.zzth));
                            string = "null";
                        } else if (string.isEmpty()) {
                            this.zzacv.zzgi().zziy().zzg("empty secure ID. appId", zzfi.zzbp(zzkuVar.zzth));
                        }
                        zzkuVar.zzawe = string;
                    }
                } else if (zzebVar.zzafm) {
                    zzkuVar.zzavv = (String) zzbr.first;
                    zzkuVar.zzavw = (Boolean) zzbr.second;
                }
                this.zzacv.zzge().zzch();
                zzkuVar.zzavr = Build.MODEL;
                this.zzacv.zzge().zzch();
                zzkuVar.zzavq = Build.VERSION.RELEASE;
                zzkuVar.zzavs = Integer.valueOf((int) this.zzacv.zzge().zzik());
                zzkuVar.zzahd = this.zzacv.zzge().zzil();
                zzkuVar.zzavu = null;
                zzkuVar.zzavk = null;
                zzkuVar.zzavl = null;
                zzkuVar.zzavm = null;
                zzkuVar.zzawg = Long.valueOf(zzebVar.zzafl);
                if (this.zzacv.isEnabled() && zzeh.zzht()) {
                    zzkuVar.zzawh = null;
                }
                zzea zzbf2 = zzjh().zzbf(zzebVar.packageName);
                if (zzbf2 == null) {
                    zzbf2 = new zzea(this.zzacv, zzebVar.packageName);
                    zzbf2.zzam(this.zzacv.zzfz().zzir());
                    zzbf2.zzap(zzebVar.zzafc);
                    zzbf2.zzan(zzebVar.zzafa);
                    zzbf2.zzao(this.zzacv.zzgj().zzbs(zzebVar.packageName));
                    zzbf2.zzw(0L);
                    zzbf2.zzr(0L);
                    zzbf2.zzs(0L);
                    zzbf2.setAppVersion(zzebVar.zztg);
                    zzbf2.zzt(zzebVar.zzafg);
                    zzbf2.zzaq(zzebVar.zzafh);
                    zzbf2.zzu(zzebVar.zzafi);
                    zzbf2.zzv(zzebVar.zzafj);
                    zzbf2.setMeasurementEnabled(zzebVar.zzafk);
                    zzbf2.zzaf(zzebVar.zzafl);
                    zzjh().zza(zzbf2);
                }
                zzkuVar.zzaez = zzbf2.getAppInstanceId();
                zzkuVar.zzafc = zzbf2.zzgr();
                List<zzkc> zzbe = zzjh().zzbe(zzebVar.packageName);
                zzkuVar.zzavj = new zzkx[zzbe.size()];
                for (int i = 0; i < zzbe.size(); i++) {
                    zzkx zzkxVar = new zzkx();
                    zzkuVar.zzavj[i] = zzkxVar;
                    zzkxVar.name = zzbe.get(i).name;
                    zzkxVar.zzaws = Long.valueOf(zzbe.get(i).zzast);
                    zzjf().zza(zzkxVar, zzbe.get(i).value);
                }
                try {
                    long zza4 = zzjh().zza(zzkuVar);
                    zzek zzjh = zzjh();
                    if (zzesVar.zzahg != null) {
                        Iterator<String> it = zzesVar.zzahg.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if ("_r".equals(it.next())) {
                                    break;
                                }
                            } else {
                                boolean zzo = zzky().zzo(zzesVar.zzth, zzesVar.name);
                                zzel zza5 = zzjh().zza(zzld(), zzesVar.zzth, false, false, false, false, false);
                                if (zzo && zza5.zzagx < this.zzacv.zzgk().zzas(zzesVar.zzth)) {
                                }
                            }
                        }
                    }
                    if (zzjh.zza(zzesVar, zza4, z2)) {
                        this.zzasa = 0L;
                    }
                } catch (IOException e) {
                    this.zzacv.zzgi().zziv().zze("Data loss. Failed to insert raw event metadata. appId", zzfi.zzbp(zzkuVar.zzth), e);
                }
                zzjh().setTransactionSuccessful();
                if (this.zzacv.zzgi().isLoggable(2)) {
                    this.zzacv.zzgi().zzjc().zzg("Event recorded", this.zzacv.zzgf().zza(zzesVar));
                }
                zzjh().endTransaction();
                zzlg();
                this.zzacv.zzgi().zzjc().zzg("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
            } finally {
                zzjh().endTransaction();
            }
        }
    }

    @WorkerThread
    private final zzeb zzce(String str) {
        String str2;
        zzfk zzfkVar;
        Object obj;
        String str3 = str;
        zzea zzbf = zzjh().zzbf(str3);
        if (zzbf == null || TextUtils.isEmpty(zzbf.zzag())) {
            str2 = "No app data available; dropping";
            obj = str3;
            zzfkVar = this.zzacv.zzgi().zzjb();
        } else {
            Boolean zzc = zzc(zzbf);
            if (zzc == null || zzc.booleanValue()) {
                return new zzeb(str, zzbf.getGmpAppId(), zzbf.zzag(), zzbf.zzgu(), zzbf.zzgv(), zzbf.zzgw(), zzbf.zzgx(), (String) null, zzbf.isMeasurementEnabled(), false, zzbf.zzgr(), zzbf.zzhk(), 0L, 0, zzbf.zzhl(), zzbf.zzhm(), false);
            }
            zzfk zziv = this.zzacv.zzgi().zziv();
            str2 = "App version does not match; dropping. appId";
            obj = zzfi.zzbp(str);
            zzfkVar = zziv;
        }
        zzfkVar.zzg(str2, obj);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0086, code lost:
    
        if (r3 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x01cc, code lost:
    
        if (r5 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:426:0x021b, code lost:
    
        if (r5 != null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0277, code lost:
    
        if (r6 != null) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:439:0x023d, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:455:0x023b, code lost:
    
        if (r6 == 0) goto L466;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x068d A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x06a7 A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06c7 A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x06a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x027e A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x028c A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:307:0x07f0 A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x0802 A[Catch: all -> 0x0b84, TRY_LEAVE, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0820 A[Catch: all -> 0x099b, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x099b, blocks: (B:266:0x06fb, B:268:0x0716, B:287:0x0960, B:292:0x0799, B:312:0x0820, B:317:0x0872, B:320:0x0882, B:333:0x08ab, B:342:0x08ed, B:344:0x0902, B:346:0x0931, B:347:0x093f, B:349:0x0950, B:351:0x0956, B:368:0x096c, B:370:0x0971, B:371:0x0979, B:372:0x0981, B:374:0x0987, B:190:0x09ba, B:192:0x09ce, B:193:0x09d2, B:195:0x09e2), top: B:265:0x06fb }] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x07ff  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0b67  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x0124 A[Catch: all -> 0x013c, SQLiteException -> 0x0141, TRY_ENTER, TRY_LEAVE, TryCatch #20 {SQLiteException -> 0x0141, all -> 0x013c, blocks: (B:392:0x0124, B:401:0x015d, B:405:0x0179), top: B:390:0x0122 }] */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0146 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0b7e A[Catch: all -> 0x0b82, TRY_ENTER, TryCatch #2 {all -> 0x0b82, blocks: (B:209:0x09f9, B:210:0x0a6f, B:212:0x0a74, B:214:0x0a87, B:217:0x0a8c, B:218:0x0a8e, B:219:0x0ab9, B:220:0x0a91, B:222:0x0a9b, B:223:0x0aa2, B:224:0x0ac2, B:225:0x0ad9, B:228:0x0ae1, B:230:0x0ae6, B:233:0x0af6, B:235:0x0b10, B:236:0x0b29, B:238:0x0b31, B:239:0x0b53, B:245:0x0b42, B:246:0x0a11, B:248:0x0a18, B:250:0x0a22, B:251:0x0a28, B:256:0x0a3a, B:257:0x0a40, B:377:0x0b68, B:446:0x0b7e, B:447:0x0b81), top: B:6:0x0023, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:448:? A[Catch: all -> 0x0b82, SYNTHETIC, TRY_LEAVE, TryCatch #2 {all -> 0x0b82, blocks: (B:209:0x09f9, B:210:0x0a6f, B:212:0x0a74, B:214:0x0a87, B:217:0x0a8c, B:218:0x0a8e, B:219:0x0ab9, B:220:0x0a91, B:222:0x0a9b, B:223:0x0aa2, B:224:0x0ac2, B:225:0x0ad9, B:228:0x0ae1, B:230:0x0ae6, B:233:0x0af6, B:235:0x0b10, B:236:0x0b29, B:238:0x0b31, B:239:0x0b53, B:245:0x0b42, B:246:0x0a11, B:248:0x0a18, B:250:0x0a22, B:251:0x0a28, B:256:0x0a3a, B:257:0x0a40, B:377:0x0b68, B:446:0x0b7e, B:447:0x0b81), top: B:6:0x0023, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0597 A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x05b8 A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x05d0 A[Catch: all -> 0x0b84, TryCatch #5 {all -> 0x0b84, blocks: (B:3:0x0009, B:20:0x0088, B:21:0x027a, B:23:0x027e, B:28:0x028c, B:29:0x02a9, B:31:0x02b1, B:33:0x02c9, B:35:0x02fa, B:40:0x030e, B:42:0x0318, B:45:0x05f4, B:47:0x0334, B:49:0x0344, B:57:0x0383, B:64:0x0597, B:66:0x05a1, B:68:0x05a5, B:71:0x05ab, B:73:0x05b8, B:74:0x05cc, B:75:0x05d0, B:76:0x05d6, B:77:0x05eb, B:80:0x0360, B:83:0x036b, B:86:0x0376, B:89:0x0391, B:91:0x0395, B:92:0x039a, B:94:0x03a4, B:96:0x03b4, B:98:0x03d3, B:99:0x03bf, B:101:0x03c9, B:107:0x03de, B:109:0x0420, B:110:0x0460, B:113:0x0493, B:115:0x0498, B:119:0x04a6, B:121:0x04af, B:122:0x04b5, B:124:0x04b8, B:125:0x04c6, B:127:0x04d4, B:130:0x04de, B:132:0x0511, B:134:0x0530, B:138:0x054f, B:139:0x0544, B:148:0x055e, B:150:0x0571, B:151:0x057e, B:117:0x04c9, B:157:0x05fa, B:159:0x0604, B:161:0x0610, B:163:0x061e, B:166:0x0623, B:167:0x0668, B:168:0x0688, B:170:0x068d, B:174:0x069b, B:176:0x06a7, B:179:0x06c7, B:172:0x06a1, B:182:0x064b, B:183:0x06df, B:270:0x0722, B:272:0x0735, B:273:0x0744, B:275:0x0748, B:277:0x0754, B:278:0x0763, B:280:0x0767, B:282:0x076f, B:283:0x0787, B:295:0x07aa, B:297:0x07b0, B:301:0x07be, B:303:0x07c2, B:307:0x07f0, B:309:0x0802, B:314:0x082a, B:316:0x083a, B:324:0x088b, B:326:0x0893, B:328:0x0897, B:330:0x089b, B:332:0x089f, B:335:0x08b1, B:337:0x08d0, B:338:0x08d9, B:356:0x07ca, B:358:0x07ce, B:360:0x07d6, B:362:0x07da, B:299:0x07e4, B:394:0x0137, B:415:0x01ce, B:439:0x023d), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0388  */
    /* JADX WARN: Type inference failed for: r0v13, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v16, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v18, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v20, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v23, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v25, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v26, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v8, types: [android.database.sqlite.SQLiteException] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r6v149 */
    /* JADX WARN: Type inference failed for: r6v152 */
    /* JADX WARN: Type inference failed for: r6v154 */
    /* JADX WARN: Type inference failed for: r6v156 */
    /* JADX WARN: Type inference failed for: r6v157 */
    /* JADX WARN: Type inference failed for: r6v162 */
    /* JADX WARN: Type inference failed for: r6v166, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v167, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v168 */
    /* JADX WARN: Type inference failed for: r6v170, types: [com.google.android.gms.internal.measurement.zzfk] */
    /* JADX WARN: Type inference failed for: r6v173 */
    /* JADX WARN: Type inference failed for: r6v174 */
    /* JADX WARN: Type inference failed for: r6v176 */
    /* JADX WARN: Type inference failed for: r6v177 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzd(String str, long j) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        String str2;
        ?? r6;
        zzek zzekVar;
        boolean z;
        zzkr[] zzkrVarArr;
        int i;
        boolean z2;
        int zzp;
        SecureRandom secureRandom;
        int i2;
        zzjt zzjtVar;
        long j2;
        zzkc zzkcVar;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        zzfk zziy;
        String str3;
        Object zzbp;
        Long l;
        char c;
        boolean z6;
        boolean z7;
        SQLiteDatabase writableDatabase;
        Cursor rawQuery;
        Cursor cursor3;
        String str4;
        Cursor query;
        zzaca zza2;
        zzku zzkuVar;
        String str5;
        String[] strArr;
        Cursor query2;
        String[] strArr2;
        zzjt zzjtVar2 = this;
        zzjh().beginTransaction();
        try {
            String str6 = null;
            zza zzaVar = new zza(zzjtVar2, false ? 1 : 0);
            zzek zzjh = zzjh();
            long j3 = zzjtVar2.zzasl;
            Preconditions.checkNotNull(zzaVar);
            zzjh.zzab();
            zzjh.zzch();
            try {
                try {
                    try {
                        writableDatabase = zzjh.getWritableDatabase();
                        try {
                            try {
                            } catch (Throwable th2) {
                                th = th2;
                                cursor = null;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            r6 = str6;
                            str2 = null;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        zzjh().endTransaction();
                        throw th;
                    }
                } catch (SQLiteException e2) {
                    str6 = e2;
                    cursor2 = null;
                    str2 = null;
                    zzekVar = zzjh;
                    zzfk zziv = zzekVar.zzgi().zziv();
                    zziv.zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str2), str6);
                    zzjh = zziv;
                    r6 = cursor2;
                } catch (Throwable th4) {
                    th = th4;
                    cursor = null;
                }
                if (TextUtils.isEmpty(null)) {
                    if (j3 != -1) {
                        try {
                            strArr2 = new String[]{String.valueOf(j3), String.valueOf(j)};
                        } catch (SQLiteException e3) {
                            e = e3;
                            r6 = 0;
                            str2 = null;
                            str6 = e;
                            zzekVar = zzjh;
                            cursor2 = r6;
                            zzfk zziv2 = zzekVar.zzgi().zziv();
                            zziv2.zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str2), str6);
                            zzjh = zziv2;
                            r6 = cursor2;
                        }
                    } else {
                        strArr2 = new String[]{String.valueOf(j)};
                    }
                    String str7 = j3 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(String.valueOf(str7).length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str7);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    rawQuery = writableDatabase.rawQuery(sb.toString(), strArr2);
                    if (rawQuery.moveToFirst()) {
                        str2 = rawQuery.getString(0);
                        try {
                            String string = rawQuery.getString(1);
                            rawQuery.close();
                            cursor3 = rawQuery;
                            str6 = str2;
                            str4 = string;
                            try {
                                query = writableDatabase.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str6, str4}, null, null, "rowid", "2");
                                try {
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    r6 = query;
                                    str2 = str6;
                                } catch (Throwable th5) {
                                    th = th5;
                                    cursor2 = query;
                                }
                                try {
                                } catch (SQLiteException e5) {
                                    e = e5;
                                    str2 = str6;
                                    r6 = query;
                                } catch (Throwable th6) {
                                    th = th6;
                                    cursor = query;
                                    Throwable th7 = th;
                                    if (cursor != null) {
                                    }
                                }
                            } catch (SQLiteException e6) {
                                e = e6;
                                str2 = str6;
                                r6 = cursor3;
                            } catch (Throwable th8) {
                                th = th8;
                                cursor = cursor3;
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            r6 = rawQuery;
                            str6 = e;
                            zzekVar = zzjh;
                            cursor2 = r6;
                            zzfk zziv22 = zzekVar.zzgi().zziv();
                            zziv22.zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str2), str6);
                            zzjh = zziv22;
                            r6 = cursor2;
                        }
                        if (query.moveToFirst()) {
                            zzjh.zzgi().zziv().zzg("Raw event metadata record is missing. appId", zzfi.zzbp(str6));
                            if (query != null) {
                                query.close();
                            }
                            if (zzaVar.zzasr != null && !zzaVar.zzasr.isEmpty()) {
                                z = false;
                                if (!z) {
                                    zzjh().setTransactionSuccessful();
                                    zzjh().endTransaction();
                                    return false;
                                }
                                zzku zzkuVar2 = zzaVar.zzasp;
                                zzkuVar2.zzavi = new zzkr[zzaVar.zzasr.size()];
                                boolean zzaw = zzjtVar2.zzacv.zzgk().zzaw(zzkuVar2.zzth);
                                int i5 = 0;
                                int i6 = 0;
                                boolean z8 = false;
                                long j4 = 0;
                                while (i5 < zzaVar.zzasr.size()) {
                                    zzkr zzkrVar = zzaVar.zzasr.get(i5);
                                    if (zzky().zzn(zzaVar.zzasp.zzth, zzkrVar.name)) {
                                        zzjtVar2.zzacv.zzgi().zziy().zze("Dropping blacklisted raw event. appId", zzfi.zzbp(zzaVar.zzasp.zzth), zzjtVar2.zzacv.zzgf().zzbm(zzkrVar.name));
                                        if (!zzky().zzcb(zzaVar.zzasp.zzth) && !zzky().zzcc(zzaVar.zzasp.zzth)) {
                                            z7 = false;
                                            if (!z7 && !"_err".equals(zzkrVar.name)) {
                                                zzjtVar2.zzacv.zzgg().zza(zzaVar.zzasp.zzth, 11, "_ev", zzkrVar.name, 0);
                                            }
                                            i4 = i5;
                                        }
                                        z7 = true;
                                        if (!z7) {
                                            zzjtVar2.zzacv.zzgg().zza(zzaVar.zzasp.zzth, 11, "_ev", zzkrVar.name, 0);
                                        }
                                        i4 = i5;
                                    } else {
                                        boolean zzo = zzky().zzo(zzaVar.zzasp.zzth, zzkrVar.name);
                                        if (!zzo) {
                                            zzjf();
                                            String str8 = zzkrVar.name;
                                            Preconditions.checkNotEmpty(str8);
                                            int hashCode = str8.hashCode();
                                            if (hashCode == 94660) {
                                                if (str8.equals("_in")) {
                                                    c = 0;
                                                    switch (c) {
                                                    }
                                                    if (z6) {
                                                    }
                                                }
                                                c = 65535;
                                                switch (c) {
                                                }
                                                if (z6) {
                                                }
                                            } else if (hashCode != 95025) {
                                                if (hashCode == 95027 && str8.equals("_ui")) {
                                                    c = 1;
                                                    switch (c) {
                                                        case 0:
                                                        case 1:
                                                        case 2:
                                                            z6 = true;
                                                            break;
                                                        default:
                                                            z6 = false;
                                                            break;
                                                    }
                                                    if (z6) {
                                                        i4 = i5;
                                                        z4 = z8;
                                                        if (zzaw && "_e".equals(zzkrVar.name)) {
                                                            if (zzkrVar.zzava != null && zzkrVar.zzava.length != 0) {
                                                                zzjf();
                                                                l = (Long) zzjz.zzb(zzkrVar, "_et");
                                                                if (l != null) {
                                                                    zziy = zzjtVar2.zzacv.zzgi().zziy();
                                                                    str3 = "Engagement event does not include duration. appId";
                                                                    zzbp = zzfi.zzbp(zzaVar.zzasp.zzth);
                                                                    zziy.zzg(str3, zzbp);
                                                                } else {
                                                                    j4 += l.longValue();
                                                                }
                                                            }
                                                            zziy = zzjtVar2.zzacv.zzgi().zziy();
                                                            str3 = "Engagement event does not contain any parameters. appId";
                                                            zzbp = zzfi.zzbp(zzaVar.zzasp.zzth);
                                                            zziy.zzg(str3, zzbp);
                                                        }
                                                        zzkuVar2.zzavi[i6] = zzkrVar;
                                                        i6++;
                                                        z8 = z4;
                                                    }
                                                }
                                                c = 65535;
                                                switch (c) {
                                                }
                                                if (z6) {
                                                }
                                            } else {
                                                if (str8.equals("_ug")) {
                                                    c = 2;
                                                    switch (c) {
                                                    }
                                                    if (z6) {
                                                    }
                                                }
                                                c = 65535;
                                                switch (c) {
                                                }
                                                if (z6) {
                                                }
                                            }
                                        }
                                        if (zzkrVar.zzava == null) {
                                            zzkrVar.zzava = new zzks[0];
                                        }
                                        zzks[] zzksVarArr = zzkrVar.zzava;
                                        int length = zzksVarArr.length;
                                        int i7 = 0;
                                        boolean z9 = false;
                                        boolean z10 = false;
                                        while (i7 < length) {
                                            zzks zzksVar = zzksVarArr[i7];
                                            zzks[] zzksVarArr2 = zzksVarArr;
                                            int i8 = length;
                                            if ("_c".equals(zzksVar.name)) {
                                                zzksVar.zzave = 1L;
                                                z9 = true;
                                            } else if ("_r".equals(zzksVar.name)) {
                                                zzksVar.zzave = 1L;
                                                z10 = true;
                                            }
                                            i7++;
                                            zzksVarArr = zzksVarArr2;
                                            length = i8;
                                        }
                                        if (!z9 && zzo) {
                                            zzjtVar2.zzacv.zzgi().zzjc().zzg("Marking event as conversion", zzjtVar2.zzacv.zzgf().zzbm(zzkrVar.name));
                                            zzks[] zzksVarArr3 = (zzks[]) Arrays.copyOf(zzkrVar.zzava, zzkrVar.zzava.length + 1);
                                            zzks zzksVar2 = new zzks();
                                            zzksVar2.name = "_c";
                                            zzksVar2.zzave = 1L;
                                            zzksVarArr3[zzksVarArr3.length - 1] = zzksVar2;
                                            zzkrVar.zzava = zzksVarArr3;
                                        }
                                        if (!z10) {
                                            zzjtVar2.zzacv.zzgi().zzjc().zzg("Marking event as real-time", zzjtVar2.zzacv.zzgf().zzbm(zzkrVar.name));
                                            zzks[] zzksVarArr4 = (zzks[]) Arrays.copyOf(zzkrVar.zzava, zzkrVar.zzava.length + 1);
                                            zzks zzksVar3 = new zzks();
                                            zzksVar3.name = "_r";
                                            zzksVar3.zzave = 1L;
                                            zzksVarArr4[zzksVarArr4.length - 1] = zzksVar3;
                                            zzkrVar.zzava = zzksVarArr4;
                                        }
                                        i4 = i5;
                                        if (zzjh().zza(zzld(), zzaVar.zzasp.zzth, false, false, false, false, true).zzagx > zzjtVar2.zzacv.zzgk().zzas(zzaVar.zzasp.zzth)) {
                                            int i9 = 0;
                                            while (true) {
                                                if (i9 >= zzkrVar.zzava.length) {
                                                    z5 = z8;
                                                } else if ("_r".equals(zzkrVar.zzava[i9].name)) {
                                                    zzks[] zzksVarArr5 = new zzks[zzkrVar.zzava.length - 1];
                                                    if (i9 > 0) {
                                                        System.arraycopy(zzkrVar.zzava, 0, zzksVarArr5, 0, i9);
                                                    }
                                                    if (i9 < zzksVarArr5.length) {
                                                        z5 = z8;
                                                        System.arraycopy(zzkrVar.zzava, i9 + 1, zzksVarArr5, i9, zzksVarArr5.length - i9);
                                                    } else {
                                                        z5 = z8;
                                                    }
                                                    zzkrVar.zzava = zzksVarArr5;
                                                } else {
                                                    i9++;
                                                }
                                            }
                                            z8 = z5;
                                        } else {
                                            z8 = true;
                                        }
                                        if (zzkd.zzcg(zzkrVar.name) && zzo && zzjh().zza(zzld(), zzaVar.zzasp.zzth, false, false, true, false, false).zzagv > zzjtVar2.zzacv.zzgk().zzb(zzaVar.zzasp.zzth, zzez.zzair)) {
                                            zzjtVar2.zzacv.zzgi().zziy().zzg("Too many conversions. Not logging as conversion. appId", zzfi.zzbp(zzaVar.zzasp.zzth));
                                            zzks[] zzksVarArr6 = zzkrVar.zzava;
                                            int length2 = zzksVarArr6.length;
                                            int i10 = 0;
                                            boolean z11 = false;
                                            zzks zzksVar4 = null;
                                            while (i10 < length2) {
                                                int i11 = length2;
                                                zzks zzksVar5 = zzksVarArr6[i10];
                                                zzks[] zzksVarArr7 = zzksVarArr6;
                                                boolean z12 = z8;
                                                if ("_c".equals(zzksVar5.name)) {
                                                    zzksVar4 = zzksVar5;
                                                } else if ("_err".equals(zzksVar5.name)) {
                                                    z11 = true;
                                                }
                                                i10++;
                                                length2 = i11;
                                                zzksVarArr6 = zzksVarArr7;
                                                z8 = z12;
                                            }
                                            z4 = z8;
                                            if (z11 && zzksVar4 != null) {
                                                zzkrVar.zzava = (zzks[]) ArrayUtils.removeAll(zzkrVar.zzava, zzksVar4);
                                            } else if (zzksVar4 != null) {
                                                zzksVar4.name = "_err";
                                                zzksVar4.zzave = 10L;
                                            } else {
                                                zzjtVar2.zzacv.zzgi().zziv().zzg("Did not find conversion parameter. appId", zzfi.zzbp(zzaVar.zzasp.zzth));
                                            }
                                            if (zzaw) {
                                                if (zzkrVar.zzava != null) {
                                                    zzjf();
                                                    l = (Long) zzjz.zzb(zzkrVar, "_et");
                                                    if (l != null) {
                                                    }
                                                }
                                                zziy = zzjtVar2.zzacv.zzgi().zziy();
                                                str3 = "Engagement event does not contain any parameters. appId";
                                                zzbp = zzfi.zzbp(zzaVar.zzasp.zzth);
                                                zziy.zzg(str3, zzbp);
                                            }
                                            zzkuVar2.zzavi[i6] = zzkrVar;
                                            i6++;
                                            z8 = z4;
                                        }
                                        z4 = z8;
                                        if (zzaw) {
                                        }
                                        zzkuVar2.zzavi[i6] = zzkrVar;
                                        i6++;
                                        z8 = z4;
                                    }
                                    i5 = i4 + 1;
                                }
                                boolean z13 = z8;
                                if (i6 < zzaVar.zzasr.size()) {
                                    zzkuVar2.zzavi = (zzkr[]) Arrays.copyOf(zzkuVar2.zzavi, i6);
                                }
                                if (zzaw) {
                                    zzkc zzh = zzjh().zzh(zzkuVar2.zzth, "_lte");
                                    if (zzh != null && zzh.value != null) {
                                        zzkcVar = new zzkc(zzkuVar2.zzth, "auto", "_lte", zzjtVar2.zzacv.zzbt().currentTimeMillis(), Long.valueOf(((Long) zzh.value).longValue() + j4));
                                        zzkx zzkxVar = new zzkx();
                                        zzkxVar.name = "_lte";
                                        zzkxVar.zzaws = Long.valueOf(zzjtVar2.zzacv.zzbt().currentTimeMillis());
                                        zzkxVar.zzave = (Long) zzkcVar.value;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < zzkuVar2.zzavj.length) {
                                                z3 = false;
                                            } else if ("_lte".equals(zzkuVar2.zzavj[i3].name)) {
                                                zzkuVar2.zzavj[i3] = zzkxVar;
                                                z3 = true;
                                            } else {
                                                i3++;
                                            }
                                        }
                                        if (!z3) {
                                            zzkuVar2.zzavj = (zzkx[]) Arrays.copyOf(zzkuVar2.zzavj, zzkuVar2.zzavj.length + 1);
                                            zzkuVar2.zzavj[zzaVar.zzasp.zzavj.length - 1] = zzkxVar;
                                        }
                                        if (j4 > 0) {
                                            zzjh().zza(zzkcVar);
                                            zzjtVar2.zzacv.zzgi().zzjb().zzg("Updated lifetime engagement user property with value. Value", zzkcVar.value);
                                        }
                                    }
                                    zzkcVar = new zzkc(zzkuVar2.zzth, "auto", "_lte", zzjtVar2.zzacv.zzbt().currentTimeMillis(), Long.valueOf(j4));
                                    zzkx zzkxVar2 = new zzkx();
                                    zzkxVar2.name = "_lte";
                                    zzkxVar2.zzaws = Long.valueOf(zzjtVar2.zzacv.zzbt().currentTimeMillis());
                                    zzkxVar2.zzave = (Long) zzkcVar.value;
                                    i3 = 0;
                                    while (true) {
                                        if (i3 < zzkuVar2.zzavj.length) {
                                        }
                                        i3++;
                                    }
                                    if (!z3) {
                                    }
                                    if (j4 > 0) {
                                    }
                                }
                                zzkuVar2.zzawa = zzjtVar2.zza(zzkuVar2.zzth, zzkuVar2.zzavj, zzkuVar2.zzavi);
                                if (zzjtVar2.zzacv.zzgk().zzav(zzaVar.zzasp.zzth)) {
                                    try {
                                        HashMap hashMap = new HashMap();
                                        zzkr[] zzkrVarArr2 = new zzkr[zzkuVar2.zzavi.length];
                                        SecureRandom zzlo = zzjtVar2.zzacv.zzgg().zzlo();
                                        zzkr[] zzkrVarArr3 = zzkuVar2.zzavi;
                                        int length3 = zzkrVarArr3.length;
                                        int i12 = 0;
                                        int i13 = 0;
                                        while (i12 < length3) {
                                            zzkr zzkrVar2 = zzkrVarArr3[i12];
                                            if (zzkrVar2.name.equals("_ep")) {
                                                zzjf();
                                                String str9 = (String) zzjz.zzb(zzkrVar2, "_en");
                                                zzet zzetVar = (zzet) hashMap.get(str9);
                                                if (zzetVar == null) {
                                                    zzetVar = zzjh().zzf(zzaVar.zzasp.zzth, str9);
                                                    hashMap.put(str9, zzetVar);
                                                }
                                                if (zzetVar.zzahl == null) {
                                                    if (zzetVar.zzahm.longValue() > 1) {
                                                        zzjf();
                                                        zzkrVar2.zzava = zzjz.zza(zzkrVar2.zzava, "_sr", zzetVar.zzahm);
                                                    }
                                                    if (zzetVar.zzahn == null || !zzetVar.zzahn.booleanValue()) {
                                                        zzkrVarArr = zzkrVarArr3;
                                                    } else {
                                                        zzjf();
                                                        zzkrVarArr = zzkrVarArr3;
                                                        zzkrVar2.zzava = zzjz.zza(zzkrVar2.zzava, "_efs", (Object) 1L);
                                                    }
                                                    int i14 = i13 + 1;
                                                    zzkrVarArr2[i13] = zzkrVar2;
                                                    secureRandom = zzlo;
                                                    i13 = i14;
                                                } else {
                                                    zzkrVarArr = zzkrVarArr3;
                                                    secureRandom = zzlo;
                                                }
                                                i = length3;
                                            } else {
                                                zzkrVarArr = zzkrVarArr3;
                                                Long l2 = 1L;
                                                if (!TextUtils.isEmpty("_dbg") && l2 != null) {
                                                    zzks[] zzksVarArr8 = zzkrVar2.zzava;
                                                    int length4 = zzksVarArr8.length;
                                                    int i15 = 0;
                                                    while (i15 < length4) {
                                                        i = length3;
                                                        zzks zzksVar6 = zzksVarArr8[i15];
                                                        zzks[] zzksVarArr9 = zzksVarArr8;
                                                        if ("_dbg".equals(zzksVar6.name)) {
                                                            if (((l2 instanceof Long) && l2.equals(zzksVar6.zzave)) || (((l2 instanceof String) && l2.equals(zzksVar6.zzale)) || ((l2 instanceof Double) && l2.equals(zzksVar6.zzasw)))) {
                                                                z2 = true;
                                                                zzp = !z2 ? zzky().zzp(zzaVar.zzasp.zzth, zzkrVar2.name) : 1;
                                                                if (zzp <= 0) {
                                                                    zzjtVar2.zzacv.zzgi().zziy().zze("Sample rate must be positive. event, rate", zzkrVar2.name, Integer.valueOf(zzp));
                                                                    i2 = i13 + 1;
                                                                    zzkrVarArr2[i13] = zzkrVar2;
                                                                } else {
                                                                    zzet zzetVar2 = (zzet) hashMap.get(zzkrVar2.name);
                                                                    if (zzetVar2 == null && (zzetVar2 = zzjh().zzf(zzaVar.zzasp.zzth, zzkrVar2.name)) == null) {
                                                                        zzjtVar2.zzacv.zzgi().zziy().zze("Event being bundled has no eventAggregate. appId, eventName", zzaVar.zzasp.zzth, zzkrVar2.name);
                                                                        zzetVar2 = new zzet(zzaVar.zzasp.zzth, zzkrVar2.name, 1L, 1L, zzkrVar2.zzavb.longValue(), 0L, null, null, null);
                                                                    }
                                                                    zzjf();
                                                                    Long l3 = (Long) zzjz.zzb(zzkrVar2, "_eid");
                                                                    Boolean valueOf = Boolean.valueOf(l3 != null);
                                                                    if (zzp == 1) {
                                                                        i2 = i13 + 1;
                                                                        zzkrVarArr2[i13] = zzkrVar2;
                                                                        if (valueOf.booleanValue() && (zzetVar2.zzahl != null || zzetVar2.zzahm != null || zzetVar2.zzahn != null)) {
                                                                            hashMap.put(zzkrVar2.name, zzetVar2.zza(null, null, null));
                                                                        }
                                                                    } else if (zzlo.nextInt(zzp) == 0) {
                                                                        zzjf();
                                                                        SecureRandom secureRandom2 = zzlo;
                                                                        long j5 = zzp;
                                                                        secureRandom = secureRandom2;
                                                                        zzkrVar2.zzava = zzjz.zza(zzkrVar2.zzava, "_sr", Long.valueOf(j5));
                                                                        int i16 = i13 + 1;
                                                                        zzkrVarArr2[i13] = zzkrVar2;
                                                                        if (valueOf.booleanValue()) {
                                                                            zzetVar2 = zzetVar2.zza(null, Long.valueOf(j5), null);
                                                                        }
                                                                        hashMap.put(zzkrVar2.name, zzetVar2.zzai(zzkrVar2.zzavb.longValue()));
                                                                        i13 = i16;
                                                                    } else {
                                                                        secureRandom = zzlo;
                                                                        if (Math.abs(zzkrVar2.zzavb.longValue() - zzetVar2.zzahk) >= 86400000) {
                                                                            zzjf();
                                                                            zzkrVar2.zzava = zzjz.zza(zzkrVar2.zzava, "_efs", (Object) 1L);
                                                                            zzjf();
                                                                            long j6 = zzp;
                                                                            zzkrVar2.zzava = zzjz.zza(zzkrVar2.zzava, "_sr", Long.valueOf(j6));
                                                                            int i17 = i13 + 1;
                                                                            zzkrVarArr2[i13] = zzkrVar2;
                                                                            if (valueOf.booleanValue()) {
                                                                                zzetVar2 = zzetVar2.zza(null, Long.valueOf(j6), true);
                                                                            }
                                                                            hashMap.put(zzkrVar2.name, zzetVar2.zzai(zzkrVar2.zzavb.longValue()));
                                                                            i13 = i17;
                                                                        } else if (valueOf.booleanValue()) {
                                                                            hashMap.put(zzkrVar2.name, zzetVar2.zza(l3, null, null));
                                                                        }
                                                                    }
                                                                }
                                                                secureRandom = zzlo;
                                                                i13 = i2;
                                                            }
                                                            z2 = false;
                                                            if (!z2) {
                                                            }
                                                            if (zzp <= 0) {
                                                            }
                                                            secureRandom = zzlo;
                                                            i13 = i2;
                                                        } else {
                                                            i15++;
                                                            length3 = i;
                                                            zzksVarArr8 = zzksVarArr9;
                                                        }
                                                    }
                                                }
                                                i = length3;
                                                z2 = false;
                                                if (!z2) {
                                                }
                                                if (zzp <= 0) {
                                                }
                                                secureRandom = zzlo;
                                                i13 = i2;
                                            }
                                            i12++;
                                            zzkrVarArr3 = zzkrVarArr;
                                            length3 = i;
                                            zzlo = secureRandom;
                                            zzjtVar2 = this;
                                        }
                                        if (i13 < zzkuVar2.zzavi.length) {
                                            zzkuVar2.zzavi = (zzkr[]) Arrays.copyOf(zzkrVarArr2, i13);
                                        }
                                        Iterator it = hashMap.entrySet().iterator();
                                        while (it.hasNext()) {
                                            zzjh().zza((zzet) ((Map.Entry) it.next()).getValue());
                                        }
                                    } catch (Throwable th9) {
                                        th = th9;
                                        zzjh().endTransaction();
                                        throw th;
                                    }
                                }
                                try {
                                    zzkuVar2.zzavl = Long.MAX_VALUE;
                                    zzkuVar2.zzavm = Long.MIN_VALUE;
                                    for (int i18 = 0; i18 < zzkuVar2.zzavi.length; i18++) {
                                        zzkr zzkrVar3 = zzkuVar2.zzavi[i18];
                                        if (zzkrVar3.zzavb.longValue() < zzkuVar2.zzavl.longValue()) {
                                            zzkuVar2.zzavl = zzkrVar3.zzavb;
                                        }
                                        if (zzkrVar3.zzavb.longValue() > zzkuVar2.zzavm.longValue()) {
                                            zzkuVar2.zzavm = zzkrVar3.zzavb;
                                        }
                                    }
                                    String str10 = zzaVar.zzasp.zzth;
                                    zzea zzbf = zzjh().zzbf(str10);
                                    if (zzbf == null) {
                                        zzjtVar = this;
                                        zzjtVar.zzacv.zzgi().zziv().zzg("Bundling raw events w/o app info. appId", zzfi.zzbp(zzaVar.zzasp.zzth));
                                    } else {
                                        zzjtVar = this;
                                        if (zzkuVar2.zzavi.length > 0) {
                                            long zzgt = zzbf.zzgt();
                                            zzkuVar2.zzavo = zzgt != 0 ? Long.valueOf(zzgt) : null;
                                            long zzgs = zzbf.zzgs();
                                            if (zzgs != 0) {
                                                zzgt = zzgs;
                                            }
                                            zzkuVar2.zzavn = zzgt != 0 ? Long.valueOf(zzgt) : null;
                                            zzbf.zzhb();
                                            zzkuVar2.zzavy = Integer.valueOf((int) zzbf.zzgy());
                                            zzbf.zzr(zzkuVar2.zzavl.longValue());
                                            zzbf.zzs(zzkuVar2.zzavm.longValue());
                                            zzkuVar2.zzafy = zzbf.zzhj();
                                            zzjh().zza(zzbf);
                                        }
                                    }
                                    if (zzkuVar2.zzavi.length > 0) {
                                        zzjtVar.zzacv.zzgl();
                                        zzkn zzbx = zzky().zzbx(zzaVar.zzasp.zzth);
                                        if (zzbx != null && zzbx.zzaum != null) {
                                            j2 = zzbx.zzaum;
                                            zzkuVar2.zzawf = j2;
                                            zzjh().zza(zzkuVar2, z13);
                                        }
                                        if (TextUtils.isEmpty(zzaVar.zzasp.zzafa)) {
                                            j2 = -1L;
                                            zzkuVar2.zzawf = j2;
                                            zzjh().zza(zzkuVar2, z13);
                                        } else {
                                            zzjtVar.zzacv.zzgi().zziy().zzg("Did not find measurement config or missing version info. appId", zzfi.zzbp(zzaVar.zzasp.zzth));
                                            zzjh().zza(zzkuVar2, z13);
                                        }
                                    }
                                    zzek zzjh2 = zzjh();
                                    List<Long> list = zzaVar.zzasq;
                                    Preconditions.checkNotNull(list);
                                    zzjh2.zzab();
                                    zzjh2.zzch();
                                    StringBuilder sb2 = new StringBuilder("rowid in (");
                                    for (int i19 = 0; i19 < list.size(); i19++) {
                                        if (i19 != 0) {
                                            sb2.append(",");
                                        }
                                        sb2.append(list.get(i19).longValue());
                                    }
                                    sb2.append(")");
                                    int delete = zzjh2.getWritableDatabase().delete("raw_events", sb2.toString(), null);
                                    if (delete != list.size()) {
                                        zzjh2.zzgi().zziv().zze("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list.size()));
                                    }
                                    zzek zzjh3 = zzjh();
                                    try {
                                        zzjh3.getWritableDatabase().execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", new String[]{str10, str10});
                                    } catch (SQLiteException e8) {
                                        zzjh3.zzgi().zziv().zze("Failed to remove unused event metadata. appId", zzfi.zzbp(str10), e8);
                                    }
                                    zzjh().setTransactionSuccessful();
                                    zzjh().endTransaction();
                                    return true;
                                } catch (Throwable th10) {
                                    th = th10;
                                    th = th;
                                    zzjh().endTransaction();
                                    throw th;
                                }
                            }
                            z = true;
                            if (!z) {
                            }
                        } else {
                            try {
                                byte[] blob = query.getBlob(0);
                                zza2 = zzaca.zza(blob, 0, blob.length);
                                zzkuVar = new zzku();
                            } catch (SQLiteException e9) {
                                e = e9;
                                str2 = str6;
                            }
                            try {
                                zzkuVar.zzb(zza2);
                                if (query.moveToNext()) {
                                    zzjh.zzgi().zziy().zzg("Get multiple raw event metadata records, expected one. appId", zzfi.zzbp(str6));
                                }
                                query.close();
                                zzaVar.zzb(zzkuVar);
                                if (j3 != -1) {
                                    String[] strArr3 = {str6, str4, String.valueOf(j3)};
                                    str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                    strArr = strArr3;
                                } else {
                                    str5 = "app_id = ? and metadata_fingerprint = ?";
                                    strArr = new String[]{str6, str4};
                                }
                                query2 = writableDatabase.query("raw_events", new String[]{"rowid", "name", AppMeasurement.Param.TIMESTAMP, DataBufferSafeParcelable.DATA_FIELD}, str5, strArr, null, null, "rowid", null);
                                try {
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    str2 = str6;
                                    r6 = query2;
                                    str6 = e;
                                    zzekVar = zzjh;
                                    cursor2 = r6;
                                    zzfk zziv222 = zzekVar.zzgi().zziv();
                                    zziv222.zze("Data loss. Error selecting raw event. appId", zzfi.zzbp(str2), str6);
                                    zzjh = zziv222;
                                    r6 = cursor2;
                                } catch (Throwable th11) {
                                    th = th11;
                                    cursor2 = query2;
                                    cursor = cursor2;
                                    Throwable th72 = th;
                                    if (cursor != null) {
                                        throw th72;
                                    }
                                    cursor.close();
                                    throw th72;
                                }
                            } catch (IOException e11) {
                                r6 = query;
                                zzjh.zzgi().zziv().zze("Data loss. Failed to merge raw event metadata. appId", zzfi.zzbp(str6), e11);
                                zzjh = zzjh;
                                r6 = r6;
                            }
                            if (query2.moveToFirst()) {
                                while (true) {
                                    long j7 = query2.getLong(0);
                                    byte[] blob2 = query2.getBlob(3);
                                    zzaca zza3 = zzaca.zza(blob2, 0, blob2.length);
                                    zzkr zzkrVar4 = new zzkr();
                                    try {
                                        zzkrVar4.zzb(zza3);
                                        zzkrVar4.name = query2.getString(1);
                                        zzkrVar4.zzavb = Long.valueOf(query2.getLong(2));
                                        r6 = zzaVar.zza(j7, zzkrVar4);
                                        if (r6 == 0) {
                                            if (query2 != null) {
                                            }
                                        }
                                    } catch (IOException e12) {
                                        zzjh.zzgi().zziv().zze("Data loss. Failed to merge raw event. appId", zzfi.zzbp(str6), e12);
                                    }
                                    r6 = query2.moveToNext();
                                    if (r6 == 0) {
                                    }
                                }
                                if (zzaVar.zzasr != null) {
                                    z = false;
                                    if (!z) {
                                    }
                                }
                                z = true;
                                if (!z) {
                                }
                            } else {
                                r6 = zzjh.zzgi().zziy();
                                r6.zzg("Raw event data disappeared while in transaction. appId", zzfi.zzbp(str6));
                            }
                            query2.close();
                            if (zzaVar.zzasr != null) {
                            }
                            z = true;
                            if (!z) {
                            }
                        }
                    }
                } else {
                    String[] strArr4 = j3 != -1 ? new String[]{null, String.valueOf(j3)} : new String[]{null};
                    String str11 = j3 != -1 ? " and rowid <= ?" : "";
                    StringBuilder sb3 = new StringBuilder(String.valueOf(str11).length() + 84);
                    sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                    sb3.append(str11);
                    sb3.append(" order by rowid limit 1;");
                    rawQuery = writableDatabase.rawQuery(sb3.toString(), strArr4);
                    if (rawQuery.moveToFirst()) {
                        String string2 = rawQuery.getString(0);
                        rawQuery.close();
                        cursor3 = rawQuery;
                        str4 = string2;
                        str6 = null;
                        query = writableDatabase.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str6, str4}, null, null, "rowid", "2");
                        if (query.moveToFirst()) {
                        }
                    } else {
                        if (rawQuery != null) {
                            rawQuery.close();
                        }
                        if (zzaVar.zzasr != null) {
                        }
                        z = true;
                        if (!z) {
                        }
                    }
                }
            } catch (Throwable th12) {
                th = th12;
            }
        } catch (Throwable th13) {
            th = th13;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0150  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzea zzg(zzeb zzebVar) {
        boolean z;
        zzab();
        zzlc();
        Preconditions.checkNotNull(zzebVar);
        Preconditions.checkNotEmpty(zzebVar.packageName);
        zzea zzbf = zzjh().zzbf(zzebVar.packageName);
        String zzbs = this.zzacv.zzgj().zzbs(zzebVar.packageName);
        if (zzbf == null) {
            zzbf = new zzea(this.zzacv, zzebVar.packageName);
            zzbf.zzam(this.zzacv.zzfz().zzir());
            zzbf.zzao(zzbs);
        } else {
            if (zzbs.equals(zzbf.zzgq())) {
                z = false;
                if (!TextUtils.isEmpty(zzebVar.zzafa) && !zzebVar.zzafa.equals(zzbf.getGmpAppId())) {
                    zzbf.zzan(zzebVar.zzafa);
                    z = true;
                }
                if (!TextUtils.isEmpty(zzebVar.zzafc) && !zzebVar.zzafc.equals(zzbf.zzgr())) {
                    zzbf.zzap(zzebVar.zzafc);
                    z = true;
                }
                if (zzebVar.zzafi != 0 && zzebVar.zzafi != zzbf.zzgw()) {
                    zzbf.zzu(zzebVar.zzafi);
                    z = true;
                }
                if (!TextUtils.isEmpty(zzebVar.zztg) && !zzebVar.zztg.equals(zzbf.zzag())) {
                    zzbf.setAppVersion(zzebVar.zztg);
                    z = true;
                }
                if (zzebVar.zzafg != zzbf.zzgu()) {
                    zzbf.zzt(zzebVar.zzafg);
                    z = true;
                }
                if (zzebVar.zzafh != null && !zzebVar.zzafh.equals(zzbf.zzgv())) {
                    zzbf.zzaq(zzebVar.zzafh);
                    z = true;
                }
                if (zzebVar.zzafj != zzbf.zzgx()) {
                    zzbf.zzv(zzebVar.zzafj);
                    z = true;
                }
                if (zzebVar.zzafk != zzbf.isMeasurementEnabled()) {
                    zzbf.setMeasurementEnabled(zzebVar.zzafk);
                    z = true;
                }
                if (!TextUtils.isEmpty(zzebVar.zzafy) && !zzebVar.zzafy.equals(zzbf.zzhi())) {
                    zzbf.zzar(zzebVar.zzafy);
                    z = true;
                }
                if (zzebVar.zzafl != zzbf.zzhk()) {
                    zzbf.zzaf(zzebVar.zzafl);
                    z = true;
                }
                if (zzebVar.zzafm != zzbf.zzhl()) {
                    zzbf.zzd(zzebVar.zzafm);
                    z = true;
                }
                if (zzebVar.zzafn != zzbf.zzhm()) {
                    zzbf.zze(zzebVar.zzafn);
                    z = true;
                }
                if (z) {
                    zzjh().zza(zzbf);
                }
                return zzbf;
            }
            zzbf.zzao(zzbs);
            zzbf.zzam(this.zzacv.zzfz().zzir());
        }
        z = true;
        if (!TextUtils.isEmpty(zzebVar.zzafa)) {
            zzbf.zzan(zzebVar.zzafa);
            z = true;
        }
        if (!TextUtils.isEmpty(zzebVar.zzafc)) {
            zzbf.zzap(zzebVar.zzafc);
            z = true;
        }
        if (zzebVar.zzafi != 0) {
            zzbf.zzu(zzebVar.zzafi);
            z = true;
        }
        if (!TextUtils.isEmpty(zzebVar.zztg)) {
            zzbf.setAppVersion(zzebVar.zztg);
            z = true;
        }
        if (zzebVar.zzafg != zzbf.zzgu()) {
        }
        if (zzebVar.zzafh != null) {
            zzbf.zzaq(zzebVar.zzafh);
            z = true;
        }
        if (zzebVar.zzafj != zzbf.zzgx()) {
        }
        if (zzebVar.zzafk != zzbf.isMeasurementEnabled()) {
        }
        if (!TextUtils.isEmpty(zzebVar.zzafy)) {
            zzbf.zzar(zzebVar.zzafy);
            z = true;
        }
        if (zzebVar.zzafl != zzbf.zzhk()) {
        }
        if (zzebVar.zzafm != zzbf.zzhl()) {
        }
        if (zzebVar.zzafn != zzbf.zzhm()) {
        }
        if (z) {
        }
        return zzbf;
    }

    public static zzjt zzg(Context context) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzarr == null) {
            synchronized (zzjt.class) {
                if (zzarr == null) {
                    zzarr = new zzjt(new zzjy(context));
                }
            }
        }
        return zzarr;
    }

    private final zzgh zzky() {
        zza(this.zzars);
        return this.zzars;
    }

    private final zzfr zzla() {
        zzfr zzfrVar = this.zzarv;
        if (zzfrVar != null) {
            return zzfrVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    private final zzjp zzlb() {
        zza(this.zzarw);
        return this.zzarw;
    }

    private final long zzld() {
        long currentTimeMillis = this.zzacv.zzbt().currentTimeMillis();
        zzft zzgj = this.zzacv.zzgj();
        zzgj.zzch();
        zzgj.zzab();
        long j = zzgj.zzalx.get();
        if (j == 0) {
            j = 1 + zzgj.zzgg().zzlo().nextInt(86400000);
            zzgj.zzalx.set(j);
        }
        return ((((currentTimeMillis + j) / 1000) / 60) / 60) / 24;
    }

    private final boolean zzlf() {
        zzab();
        zzlc();
        return zzjh().zzia() || !TextUtils.isEmpty(zzjh().zzhv());
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0194  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzlg() {
        zzez.zza<Long> zzaVar;
        long j;
        zzab();
        zzlc();
        if (!zzlk()) {
            return;
        }
        if (this.zzasa > 0) {
            long abs = 3600000 - Math.abs(this.zzacv.zzbt().elapsedRealtime() - this.zzasa);
            if (abs > 0) {
                this.zzacv.zzgi().zzjc().zzg("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzla().unregister();
                zzlb().cancel();
                return;
            }
            this.zzasa = 0L;
        }
        if (!this.zzacv.zzkg() || !zzlf()) {
            this.zzacv.zzgi().zzjc().log("Nothing to upload or uploading impossible");
            zzla().unregister();
            zzlb().cancel();
            return;
        }
        long currentTimeMillis = this.zzacv.zzbt().currentTimeMillis();
        long max = Math.max(0L, zzez.zzaje.get().longValue());
        boolean z = zzjh().zzib() || zzjh().zzhw();
        if (z) {
            String zzhs = this.zzacv.zzgk().zzhs();
            zzaVar = (TextUtils.isEmpty(zzhs) || ".none.".equals(zzhs)) ? zzez.zzaiy : zzez.zzaiz;
        } else {
            zzaVar = zzez.zzaix;
        }
        long max2 = Math.max(0L, zzaVar.get().longValue());
        long j2 = this.zzacv.zzgj().zzalt.get();
        long j3 = this.zzacv.zzgj().zzalu.get();
        long max3 = Math.max(zzjh().zzhy(), zzjh().zzhz());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(j2 - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(j3 - currentTimeMillis);
            long max4 = Math.max(abs3, abs4);
            long j4 = abs2 + max;
            if (z && max4 > 0) {
                j4 = Math.min(abs2, max4) + max2;
            }
            j = !zzjf().zza(max4, max2) ? max4 + max2 : j4;
            if (abs4 != 0 && abs4 >= abs2) {
                for (int i = 0; i < Math.min(20, Math.max(0, zzez.zzajg.get().intValue())); i++) {
                    j += Math.max(0L, zzez.zzajf.get().longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    }
                }
            }
            if (j != 0) {
                this.zzacv.zzgi().zzjc().log("Next upload time is 0");
                zzla().unregister();
                zzlb().cancel();
                return;
            }
            if (!zzkz().zzex()) {
                this.zzacv.zzgi().zzjc().log("No network");
                zzla().zzeu();
                zzlb().cancel();
                return;
            }
            long j5 = this.zzacv.zzgj().zzalv.get();
            long max5 = Math.max(0L, zzez.zzaiv.get().longValue());
            if (!zzjf().zza(j5, max5)) {
                j = Math.max(j, j5 + max5);
            }
            zzla().unregister();
            long currentTimeMillis2 = j - this.zzacv.zzbt().currentTimeMillis();
            if (currentTimeMillis2 <= 0) {
                currentTimeMillis2 = Math.max(0L, zzez.zzaja.get().longValue());
                this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
            }
            this.zzacv.zzgi().zzjc().zzg("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
            zzlb().zzh(currentTimeMillis2);
            return;
        }
        j = 0;
        if (j != 0) {
        }
    }

    @WorkerThread
    private final void zzlh() {
        zzab();
        if (this.zzase || this.zzasf || this.zzasg) {
            this.zzacv.zzgi().zzjc().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzase), Boolean.valueOf(this.zzasf), Boolean.valueOf(this.zzasg));
            return;
        }
        this.zzacv.zzgi().zzjc().log("Stopping uploading service(s)");
        List<Runnable> list = this.zzasb;
        if (list == null) {
            return;
        }
        Iterator<Runnable> it = list.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
        this.zzasb.clear();
    }

    @WorkerThread
    @VisibleForTesting
    private final boolean zzli() {
        zzfk zziv;
        String str;
        zzab();
        try {
            this.zzasi = new RandomAccessFile(new File(this.zzacv.getContext().getFilesDir(), "google_app_measurement.db"), "rw").getChannel();
            this.zzash = this.zzasi.tryLock();
            if (this.zzash != null) {
                this.zzacv.zzgi().zzjc().log("Storage concurrent access okay");
                return true;
            }
            this.zzacv.zzgi().zziv().log("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            e = e;
            zziv = this.zzacv.zzgi().zziv();
            str = "Failed to acquire storage lock";
            zziv.zzg(str, e);
            return false;
        } catch (IOException e2) {
            e = e2;
            zziv = this.zzacv.zzgi().zziv();
            str = "Failed to access storage lock file";
            zziv.zzg(str, e);
            return false;
        }
    }

    @WorkerThread
    private final boolean zzlk() {
        zzab();
        zzlc();
        return this.zzarz;
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final Context getContext() {
        return this.zzacv.getContext();
    }

    @WorkerThread
    protected final void start() {
        this.zzacv.zzgh().zzab();
        zzjh().zzhx();
        if (this.zzacv.zzgj().zzalt.get() == 0) {
            this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
        }
        zzlg();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0158, code lost:
    
        r9.zzacv.zzgj().zzalv.set(r9.zzacv.zzbt().currentTimeMillis());
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zza(int i, Throwable th, byte[] bArr, String str) {
        zzek zzjh;
        long longValue;
        zzab();
        zzlc();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzasf = false;
                zzlh();
            }
        }
        List<Long> list = this.zzasj;
        this.zzasj = null;
        boolean z = true;
        if ((i == 200 || i == 204) && th == null) {
            try {
                this.zzacv.zzgj().zzalt.set(this.zzacv.zzbt().currentTimeMillis());
                this.zzacv.zzgj().zzalu.set(0L);
                zzlg();
                this.zzacv.zzgi().zzjc().zze("Successful upload. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                zzjh().beginTransaction();
                try {
                    for (Long l : list) {
                        try {
                            zzjh = zzjh();
                            longValue = l.longValue();
                            zzjh.zzab();
                            zzjh.zzch();
                            try {
                            } catch (SQLiteException e) {
                                zzjh.zzgi().zziv().zzg("Failed to delete a bundle in a queue table", e);
                                throw e;
                            }
                        } catch (SQLiteException e2) {
                            if (this.zzask == null || !this.zzask.contains(l)) {
                                throw e2;
                            }
                        }
                        if (zzjh.getWritableDatabase().delete("queue", "rowid=?", new String[]{String.valueOf(longValue)}) != 1) {
                            throw new SQLiteException("Deleted fewer rows from queue than expected");
                        }
                    }
                    zzjh().setTransactionSuccessful();
                    zzjh().endTransaction();
                    this.zzask = null;
                    if (zzkz().zzex() && zzlf()) {
                        zzle();
                    } else {
                        this.zzasl = -1L;
                        zzlg();
                    }
                    this.zzasa = 0L;
                } catch (Throwable th2) {
                    zzjh().endTransaction();
                    throw th2;
                }
            } catch (SQLiteException e3) {
                this.zzacv.zzgi().zziv().zzg("Database error while trying to delete uploaded bundles", e3);
                this.zzasa = this.zzacv.zzbt().elapsedRealtime();
                this.zzacv.zzgi().zzjc().zzg("Disable upload, time", Long.valueOf(this.zzasa));
            }
        } else {
            this.zzacv.zzgi().zzjc().zze("Network upload failed. Will retry later. code, error", Integer.valueOf(i), th);
            this.zzacv.zzgj().zzalu.set(this.zzacv.zzbt().currentTimeMillis());
            if (i != 503 && i != 429) {
                z = false;
            }
            if (this.zzacv.zzgk().zzay(str)) {
                zzjh().zzc(list);
            }
            zzlg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    public final byte[] zza(@NonNull zzex zzexVar, @Size(min = 1) String str) {
        zzkc zzkcVar;
        Bundle bundle;
        zzku zzkuVar;
        zzea zzeaVar;
        zzkt zzktVar;
        byte[] bArr;
        long j;
        zzfk zziy;
        String str2;
        Object zzbp;
        zzlc();
        zzab();
        this.zzacv.zzfu();
        Preconditions.checkNotNull(zzexVar);
        Preconditions.checkNotEmpty(str);
        zzkt zzktVar2 = new zzkt();
        zzjh().beginTransaction();
        try {
            zzea zzbf = zzjh().zzbf(str);
            if (zzbf == null) {
                this.zzacv.zzgi().zzjb().zzg("Log and bundle not available. package_name", str);
            } else {
                if (zzbf.isMeasurementEnabled()) {
                    if (("_iap".equals(zzexVar.name) || FirebaseAnalytics.Event.ECOMMERCE_PURCHASE.equals(zzexVar.name)) && !zza(str, zzexVar)) {
                        this.zzacv.zzgi().zziy().zzg("Failed to handle purchase event at single event bundle creation. appId", zzfi.zzbp(str));
                    }
                    boolean zzaw = this.zzacv.zzgk().zzaw(str);
                    Long l = 0L;
                    if (zzaw && "_e".equals(zzexVar.name)) {
                        if (zzexVar.zzahg != null && zzexVar.zzahg.size() != 0) {
                            if (zzexVar.zzahg.getLong("_et") == null) {
                                zziy = this.zzacv.zzgi().zziy();
                                str2 = "The engagement event does not include duration. appId";
                                zzbp = zzfi.zzbp(str);
                                zziy.zzg(str2, zzbp);
                            } else {
                                l = zzexVar.zzahg.getLong("_et");
                            }
                        }
                        zziy = this.zzacv.zzgi().zziy();
                        str2 = "The engagement event does not contain any parameters. appId";
                        zzbp = zzfi.zzbp(str);
                        zziy.zzg(str2, zzbp);
                    }
                    zzku zzkuVar2 = new zzku();
                    zzktVar2.zzavf = new zzku[]{zzkuVar2};
                    zzkuVar2.zzavh = 1;
                    zzkuVar2.zzavp = "android";
                    zzkuVar2.zzth = zzbf.zzah();
                    zzkuVar2.zzafh = zzbf.zzgv();
                    zzkuVar2.zztg = zzbf.zzag();
                    long zzgu = zzbf.zzgu();
                    zzkuVar2.zzawb = zzgu == -2147483648L ? null : Integer.valueOf((int) zzgu);
                    zzkuVar2.zzavt = Long.valueOf(zzbf.zzgw());
                    zzkuVar2.zzafa = zzbf.getGmpAppId();
                    zzkuVar2.zzavx = Long.valueOf(zzbf.zzgx());
                    if (this.zzacv.isEnabled() && zzeh.zzht() && this.zzacv.zzgk().zzau(zzkuVar2.zzth)) {
                        zzkuVar2.zzawh = null;
                    }
                    Pair<String, Boolean> zzbr = this.zzacv.zzgj().zzbr(zzbf.zzah());
                    if (zzbf.zzhl() && zzbr != null && !TextUtils.isEmpty((CharSequence) zzbr.first)) {
                        zzkuVar2.zzavv = (String) zzbr.first;
                        zzkuVar2.zzavw = (Boolean) zzbr.second;
                    }
                    this.zzacv.zzge().zzch();
                    zzkuVar2.zzavr = Build.MODEL;
                    this.zzacv.zzge().zzch();
                    zzkuVar2.zzavq = Build.VERSION.RELEASE;
                    zzkuVar2.zzavs = Integer.valueOf((int) this.zzacv.zzge().zzik());
                    zzkuVar2.zzahd = this.zzacv.zzge().zzil();
                    zzkuVar2.zzaez = zzbf.getAppInstanceId();
                    zzkuVar2.zzafc = zzbf.zzgr();
                    List<zzkc> zzbe = zzjh().zzbe(zzbf.zzah());
                    zzkuVar2.zzavj = new zzkx[zzbe.size()];
                    if (zzaw) {
                        zzkcVar = zzjh().zzh(zzkuVar2.zzth, "_lte");
                        if (zzkcVar != null && zzkcVar.value != null) {
                            if (l.longValue() > 0) {
                                zzkcVar = new zzkc(zzkuVar2.zzth, "auto", "_lte", this.zzacv.zzbt().currentTimeMillis(), Long.valueOf(((Long) zzkcVar.value).longValue() + l.longValue()));
                            }
                        }
                        zzkcVar = new zzkc(zzkuVar2.zzth, "auto", "_lte", this.zzacv.zzbt().currentTimeMillis(), l);
                    } else {
                        zzkcVar = null;
                    }
                    zzkx zzkxVar = null;
                    for (int i = 0; i < zzbe.size(); i++) {
                        zzkx zzkxVar2 = new zzkx();
                        zzkuVar2.zzavj[i] = zzkxVar2;
                        zzkxVar2.name = zzbe.get(i).name;
                        zzkxVar2.zzaws = Long.valueOf(zzbe.get(i).zzast);
                        zzjf().zza(zzkxVar2, zzbe.get(i).value);
                        if (zzaw && "_lte".equals(zzkxVar2.name)) {
                            zzkxVar2.zzave = (Long) zzkcVar.value;
                            zzkxVar2.zzaws = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                            zzkxVar = zzkxVar2;
                        }
                    }
                    if (zzaw && zzkxVar == null) {
                        zzkx zzkxVar3 = new zzkx();
                        zzkxVar3.name = "_lte";
                        zzkxVar3.zzaws = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                        zzkxVar3.zzave = (Long) zzkcVar.value;
                        zzkuVar2.zzavj = (zzkx[]) Arrays.copyOf(zzkuVar2.zzavj, zzkuVar2.zzavj.length + 1);
                        zzkuVar2.zzavj[zzkuVar2.zzavj.length - 1] = zzkxVar3;
                    }
                    if (l.longValue() > 0) {
                        zzjh().zza(zzkcVar);
                    }
                    Bundle zzin = zzexVar.zzahg.zzin();
                    if ("_iap".equals(zzexVar.name)) {
                        zzin.putLong("_c", 1L);
                        this.zzacv.zzgi().zzjb().log("Marking in-app purchase as real-time");
                        zzin.putLong("_r", 1L);
                    }
                    zzin.putString("_o", zzexVar.origin);
                    if (this.zzacv.zzgg().zzcn(zzkuVar2.zzth)) {
                        this.zzacv.zzgg().zza(zzin, "_dbg", (Object) 1L);
                        this.zzacv.zzgg().zza(zzin, "_r", (Object) 1L);
                    }
                    zzet zzf = zzjh().zzf(str, zzexVar.name);
                    if (zzf == null) {
                        bundle = zzin;
                        bArr = null;
                        zzkuVar = zzkuVar2;
                        zzeaVar = zzbf;
                        zzktVar = zzktVar2;
                        zzjh().zza(new zzet(str, zzexVar.name, 1L, 0L, zzexVar.zzahr, 0L, null, null, null));
                        j = 0;
                    } else {
                        bundle = zzin;
                        zzkuVar = zzkuVar2;
                        zzeaVar = zzbf;
                        zzktVar = zzktVar2;
                        bArr = null;
                        long j2 = zzf.zzahj;
                        zzjh().zza(zzf.zzah(zzexVar.zzahr).zzim());
                        j = j2;
                    }
                    zzes zzesVar = new zzes(this.zzacv, zzexVar.origin, str, zzexVar.name, zzexVar.zzahr, j, bundle);
                    zzkr zzkrVar = new zzkr();
                    zzku zzkuVar3 = zzkuVar;
                    zzkuVar3.zzavi = new zzkr[]{zzkrVar};
                    zzkrVar.zzavb = Long.valueOf(zzesVar.timestamp);
                    zzkrVar.name = zzesVar.name;
                    zzkrVar.zzavc = Long.valueOf(zzesVar.zzahf);
                    zzkrVar.zzava = new zzks[zzesVar.zzahg.size()];
                    Iterator<String> it = zzesVar.zzahg.iterator();
                    int i2 = 0;
                    while (it.hasNext()) {
                        String next = it.next();
                        zzks zzksVar = new zzks();
                        zzkrVar.zzava[i2] = zzksVar;
                        zzksVar.name = next;
                        zzjf().zza(zzksVar, zzesVar.zzahg.get(next));
                        i2++;
                    }
                    zzkuVar3.zzawa = zza(zzeaVar.zzah(), zzkuVar3.zzavj, zzkuVar3.zzavi);
                    zzkuVar3.zzavl = zzkrVar.zzavb;
                    zzkuVar3.zzavm = zzkrVar.zzavb;
                    long zzgt = zzeaVar.zzgt();
                    zzkuVar3.zzavo = zzgt != 0 ? Long.valueOf(zzgt) : bArr;
                    long zzgs = zzeaVar.zzgs();
                    if (zzgs != 0) {
                        zzgt = zzgs;
                    }
                    zzkuVar3.zzavn = zzgt != 0 ? Long.valueOf(zzgt) : bArr;
                    zzeaVar.zzhb();
                    zzkuVar3.zzavy = Integer.valueOf((int) zzeaVar.zzgy());
                    zzkuVar3.zzavu = Long.valueOf(this.zzacv.zzgk().zzgw());
                    zzkuVar3.zzavk = Long.valueOf(this.zzacv.zzbt().currentTimeMillis());
                    zzkuVar3.zzavz = Boolean.TRUE;
                    zzea zzeaVar2 = zzeaVar;
                    zzeaVar2.zzr(zzkuVar3.zzavl.longValue());
                    zzeaVar2.zzs(zzkuVar3.zzavm.longValue());
                    zzjh().zza(zzeaVar2);
                    zzjh().setTransactionSuccessful();
                    try {
                        byte[] bArr2 = new byte[zzktVar.zzwb()];
                        zzacb zzb = zzacb.zzb(bArr2, 0, bArr2.length);
                        zzktVar.zza(zzb);
                        zzb.zzvt();
                        return zzjf().zzb(bArr2);
                    } catch (IOException e) {
                        this.zzacv.zzgi().zziv().zze("Data loss. Failed to bundle and serialize. appId", zzfi.zzbp(str), e);
                        return bArr;
                    }
                }
                this.zzacv.zzgi().zzjb().zzg("Log and bundle disabled. package_name", str);
            }
            return new byte[0];
        } finally {
            zzjh().endTransaction();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    final void zzb(zzef zzefVar, zzeb zzebVar) {
        zzfk zziv;
        String str;
        Object zzbp;
        String zzbo;
        Object value;
        zzfk zziv2;
        String str2;
        Object zzbp2;
        String zzbo2;
        Object obj;
        Preconditions.checkNotNull(zzefVar);
        Preconditions.checkNotEmpty(zzefVar.packageName);
        Preconditions.checkNotNull(zzefVar.origin);
        Preconditions.checkNotNull(zzefVar.zzage);
        Preconditions.checkNotEmpty(zzefVar.zzage.name);
        zzab();
        zzlc();
        if (TextUtils.isEmpty(zzebVar.zzafa)) {
            return;
        }
        if (!zzebVar.zzafk) {
            zzg(zzebVar);
            return;
        }
        zzef zzefVar2 = new zzef(zzefVar);
        boolean z = false;
        zzefVar2.active = false;
        zzjh().beginTransaction();
        try {
            zzef zzi = zzjh().zzi(zzefVar2.packageName, zzefVar2.zzage.name);
            if (zzi != null && !zzi.origin.equals(zzefVar2.origin)) {
                this.zzacv.zzgi().zziy().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzacv.zzgf().zzbo(zzefVar2.zzage.name), zzefVar2.origin, zzi.origin);
            }
            if (zzi != null && zzi.active) {
                zzefVar2.origin = zzi.origin;
                zzefVar2.creationTimestamp = zzi.creationTimestamp;
                zzefVar2.triggerTimeout = zzi.triggerTimeout;
                zzefVar2.triggerEventName = zzi.triggerEventName;
                zzefVar2.zzagg = zzi.zzagg;
                zzefVar2.active = zzi.active;
                zzefVar2.zzage = new zzka(zzefVar2.zzage.name, zzi.zzage.zzast, zzefVar2.zzage.getValue(), zzi.zzage.origin);
            } else if (TextUtils.isEmpty(zzefVar2.triggerEventName)) {
                zzefVar2.zzage = new zzka(zzefVar2.zzage.name, zzefVar2.creationTimestamp, zzefVar2.zzage.getValue(), zzefVar2.zzage.origin);
                zzefVar2.active = true;
                z = true;
            }
            if (zzefVar2.active) {
                zzka zzkaVar = zzefVar2.zzage;
                zzkc zzkcVar = new zzkc(zzefVar2.packageName, zzefVar2.origin, zzkaVar.name, zzkaVar.zzast, zzkaVar.getValue());
                if (zzjh().zza(zzkcVar)) {
                    zziv2 = this.zzacv.zzgi().zzjb();
                    str2 = "User property updated immediately";
                    zzbp2 = zzefVar2.packageName;
                    zzbo2 = this.zzacv.zzgf().zzbo(zzkcVar.name);
                    obj = zzkcVar.value;
                } else {
                    zziv2 = this.zzacv.zzgi().zziv();
                    str2 = "(2)Too many active user properties, ignoring";
                    zzbp2 = zzfi.zzbp(zzefVar2.packageName);
                    zzbo2 = this.zzacv.zzgf().zzbo(zzkcVar.name);
                    obj = zzkcVar.value;
                }
                zziv2.zzd(str2, zzbp2, zzbo2, obj);
                if (z && zzefVar2.zzagg != null) {
                    zzc(new zzex(zzefVar2.zzagg, zzefVar2.creationTimestamp), zzebVar);
                }
            }
            if (zzjh().zza(zzefVar2)) {
                zziv = this.zzacv.zzgi().zzjb();
                str = "Conditional property added";
                zzbp = zzefVar2.packageName;
                zzbo = this.zzacv.zzgf().zzbo(zzefVar2.zzage.name);
                value = zzefVar2.zzage.getValue();
            } else {
                zziv = this.zzacv.zzgi().zziv();
                str = "Too many conditional properties, ignoring";
                zzbp = zzfi.zzbp(zzefVar2.packageName);
                zzbo = this.zzacv.zzgf().zzbo(zzefVar2.zzage.name);
                value = zzefVar2.zzage.getValue();
            }
            zziv.zzd(str, zzbp, zzbo, value);
            zzjh().setTransactionSuccessful();
        } finally {
            zzjh().endTransaction();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    final void zzb(zzex zzexVar, zzeb zzebVar) {
        List<zzef> zzb;
        List<zzef> zzb2;
        List<zzef> zzb3;
        zzfk zziv;
        String str;
        Object zzbp;
        String zzbo;
        Object obj;
        Preconditions.checkNotNull(zzebVar);
        Preconditions.checkNotEmpty(zzebVar.packageName);
        zzab();
        zzlc();
        String str2 = zzebVar.packageName;
        long j = zzexVar.zzahr;
        if (zzjf().zzd(zzexVar, zzebVar)) {
            if (!zzebVar.zzafk) {
                zzg(zzebVar);
                return;
            }
            zzjh().beginTransaction();
            try {
                zzek zzjh = zzjh();
                Preconditions.checkNotEmpty(str2);
                zzjh.zzab();
                zzjh.zzch();
                if (j < 0) {
                    zzjh.zzgi().zziy().zze("Invalid time querying timed out conditional properties", zzfi.zzbp(str2), Long.valueOf(j));
                    zzb = Collections.emptyList();
                } else {
                    zzb = zzjh.zzb("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzef zzefVar : zzb) {
                    if (zzefVar != null) {
                        this.zzacv.zzgi().zzjb().zzd("User property timed out", zzefVar.packageName, this.zzacv.zzgf().zzbo(zzefVar.zzage.name), zzefVar.zzage.getValue());
                        if (zzefVar.zzagf != null) {
                            zzc(new zzex(zzefVar.zzagf, j), zzebVar);
                        }
                        zzjh().zzj(str2, zzefVar.zzage.name);
                    }
                }
                zzek zzjh2 = zzjh();
                Preconditions.checkNotEmpty(str2);
                zzjh2.zzab();
                zzjh2.zzch();
                if (j < 0) {
                    zzjh2.zzgi().zziy().zze("Invalid time querying expired conditional properties", zzfi.zzbp(str2), Long.valueOf(j));
                    zzb2 = Collections.emptyList();
                } else {
                    zzb2 = zzjh2.zzb("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zzb2.size());
                for (zzef zzefVar2 : zzb2) {
                    if (zzefVar2 != null) {
                        this.zzacv.zzgi().zzjb().zzd("User property expired", zzefVar2.packageName, this.zzacv.zzgf().zzbo(zzefVar2.zzage.name), zzefVar2.zzage.getValue());
                        zzjh().zzg(str2, zzefVar2.zzage.name);
                        if (zzefVar2.zzagh != null) {
                            arrayList.add(zzefVar2.zzagh);
                        }
                        zzjh().zzj(str2, zzefVar2.zzage.name);
                    }
                }
                ArrayList arrayList2 = arrayList;
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    zzc(new zzex((zzex) obj2, j), zzebVar);
                }
                zzek zzjh3 = zzjh();
                String str3 = zzexVar.name;
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str3);
                zzjh3.zzab();
                zzjh3.zzch();
                if (j < 0) {
                    zzjh3.zzgi().zziy().zzd("Invalid time querying triggered conditional properties", zzfi.zzbp(str2), zzjh3.zzgf().zzbm(str3), Long.valueOf(j));
                    zzb3 = Collections.emptyList();
                } else {
                    zzb3 = zzjh3.zzb("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str3, String.valueOf(j)});
                }
                ArrayList arrayList3 = new ArrayList(zzb3.size());
                for (zzef zzefVar3 : zzb3) {
                    if (zzefVar3 != null) {
                        zzka zzkaVar = zzefVar3.zzage;
                        zzkc zzkcVar = new zzkc(zzefVar3.packageName, zzefVar3.origin, zzkaVar.name, j, zzkaVar.getValue());
                        if (zzjh().zza(zzkcVar)) {
                            zziv = this.zzacv.zzgi().zzjb();
                            str = "User property triggered";
                            zzbp = zzefVar3.packageName;
                            zzbo = this.zzacv.zzgf().zzbo(zzkcVar.name);
                            obj = zzkcVar.value;
                        } else {
                            zziv = this.zzacv.zzgi().zziv();
                            str = "Too many active user properties, ignoring";
                            zzbp = zzfi.zzbp(zzefVar3.packageName);
                            zzbo = this.zzacv.zzgf().zzbo(zzkcVar.name);
                            obj = zzkcVar.value;
                        }
                        zziv.zzd(str, zzbp, zzbo, obj);
                        if (zzefVar3.zzagg != null) {
                            arrayList3.add(zzefVar3.zzagg);
                        }
                        zzefVar3.zzage = new zzka(zzkcVar);
                        zzefVar3.active = true;
                        zzjh().zza(zzefVar3);
                    }
                }
                zzc(zzexVar, zzebVar);
                ArrayList arrayList4 = arrayList3;
                int size2 = arrayList4.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList4.get(i2);
                    i2++;
                    zzc(new zzex((zzex) obj3, j), zzebVar);
                }
                zzjh().setTransactionSuccessful();
            } finally {
                zzjh().endTransaction();
            }
        }
    }

    final void zzb(zzjs zzjsVar) {
        this.zzasc++;
    }

    @WorkerThread
    final void zzb(zzka zzkaVar, zzeb zzebVar) {
        zzab();
        zzlc();
        if (TextUtils.isEmpty(zzebVar.zzafa)) {
            return;
        }
        if (!zzebVar.zzafk) {
            zzg(zzebVar);
            return;
        }
        int zzcj = this.zzacv.zzgg().zzcj(zzkaVar.name);
        if (zzcj != 0) {
            this.zzacv.zzgg();
            this.zzacv.zzgg().zza(zzebVar.packageName, zzcj, "_ev", zzkd.zza(zzkaVar.name, 24, true), zzkaVar.name != null ? zzkaVar.name.length() : 0);
            return;
        }
        int zzi = this.zzacv.zzgg().zzi(zzkaVar.name, zzkaVar.getValue());
        if (zzi != 0) {
            this.zzacv.zzgg();
            String zza2 = zzkd.zza(zzkaVar.name, 24, true);
            Object value = zzkaVar.getValue();
            this.zzacv.zzgg().zza(zzebVar.packageName, zzi, "_ev", zza2, (value == null || !((value instanceof String) || (value instanceof CharSequence))) ? 0 : String.valueOf(value).length());
            return;
        }
        Object zzj = this.zzacv.zzgg().zzj(zzkaVar.name, zzkaVar.getValue());
        if (zzj == null) {
            return;
        }
        zzkc zzkcVar = new zzkc(zzebVar.packageName, zzkaVar.origin, zzkaVar.name, zzkaVar.zzast, zzj);
        this.zzacv.zzgi().zzjb().zze("Setting user property", this.zzacv.zzgf().zzbo(zzkcVar.name), zzj);
        zzjh().beginTransaction();
        try {
            zzg(zzebVar);
            boolean zza3 = zzjh().zza(zzkcVar);
            zzjh().setTransactionSuccessful();
            if (zza3) {
                this.zzacv.zzgi().zzjb().zze("User property set", this.zzacv.zzgf().zzbo(zzkcVar.name), zzkcVar.value);
            } else {
                this.zzacv.zzgi().zziv().zze("Too many unique user properties are set. Ignoring user property", this.zzacv.zzgf().zzbo(zzkcVar.name), zzkcVar.value);
                this.zzacv.zzgg().zza(zzebVar.packageName, 9, (String) null, (String) null, 0);
            }
        } finally {
            zzjh().endTransaction();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        r6.zzacv.zzgj().zzalv.set(r6.zzacv.zzbt().currentTimeMillis());
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0132 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x016d, B:24:0x0061, B:31:0x00b0, B:32:0x00c5, B:35:0x00cd, B:37:0x00d9, B:39:0x00df, B:43:0x00ec, B:46:0x011c, B:48:0x0132, B:49:0x015a, B:51:0x0164, B:53:0x016a, B:54:0x0142, B:55:0x0103, B:57:0x010d), top: B:4:0x0029, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0142 A[Catch: all -> 0x0179, TryCatch #1 {all -> 0x0179, blocks: (B:5:0x0029, B:12:0x0045, B:13:0x016d, B:24:0x0061, B:31:0x00b0, B:32:0x00c5, B:35:0x00cd, B:37:0x00d9, B:39:0x00df, B:43:0x00ec, B:46:0x011c, B:48:0x0132, B:49:0x015a, B:51:0x0164, B:53:0x016a, B:54:0x0142, B:55:0x0103, B:57:0x010d), top: B:4:0x0029, outer: #0 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzb(String str, int i, Throwable th, byte[] bArr, Map<String, List<String>> map) {
        zzek zzjh;
        zzab();
        zzlc();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzase = false;
                zzlh();
            }
        }
        this.zzacv.zzgi().zzjc().zzg("onConfigFetched. Response size", Integer.valueOf(bArr.length));
        zzjh().beginTransaction();
        try {
            zzea zzbf = zzjh().zzbf(str);
            boolean z = true;
            boolean z2 = (i == 200 || i == 204 || i == 304) && th == null;
            if (zzbf == null) {
                this.zzacv.zzgi().zziy().zzg("App does not exist in onConfigFetched. appId", zzfi.zzbp(str));
            } else {
                if (!z2 && i != 404) {
                    zzbf.zzy(this.zzacv.zzbt().currentTimeMillis());
                    zzjh().zza(zzbf);
                    this.zzacv.zzgi().zzjc().zze("Fetching config failed. code, error", Integer.valueOf(i), th);
                    zzky().zzbz(str);
                    this.zzacv.zzgj().zzalu.set(this.zzacv.zzbt().currentTimeMillis());
                    if (i != 503 && i != 429) {
                        z = false;
                    }
                    zzlg();
                }
                List<String> list = map != null ? map.get("Last-Modified") : null;
                String str2 = (list == null || list.size() <= 0) ? null : list.get(0);
                if (i != 404 && i != 304) {
                    if (!zzky().zza(str, bArr, str2)) {
                        zzjh = zzjh();
                        zzjh.endTransaction();
                    }
                    zzbf.zzx(this.zzacv.zzbt().currentTimeMillis());
                    zzjh().zza(zzbf);
                    if (i != 404) {
                        this.zzacv.zzgi().zziz().zzg("Config not found. Using empty config. appId", str);
                    } else {
                        this.zzacv.zzgi().zzjc().zze("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), Integer.valueOf(bArr.length));
                    }
                    if (zzkz().zzex() && zzlf()) {
                        zzle();
                    }
                    zzlg();
                }
                if (zzky().zzbx(str) == null && !zzky().zza(str, null, null)) {
                    zzjh = zzjh();
                    zzjh.endTransaction();
                }
                zzbf.zzx(this.zzacv.zzbt().currentTimeMillis());
                zzjh().zza(zzbf);
                if (i != 404) {
                }
                if (zzkz().zzex()) {
                    zzle();
                }
                zzlg();
            }
            zzjh().setTransactionSuccessful();
            zzjh = zzjh();
            zzjh.endTransaction();
        } catch (Throwable th2) {
            zzjh().endTransaction();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final Clock zzbt() {
        return this.zzacv.zzbt();
    }

    @WorkerThread
    final void zzc(zzef zzefVar, zzeb zzebVar) {
        Preconditions.checkNotNull(zzefVar);
        Preconditions.checkNotEmpty(zzefVar.packageName);
        Preconditions.checkNotNull(zzefVar.zzage);
        Preconditions.checkNotEmpty(zzefVar.zzage.name);
        zzab();
        zzlc();
        if (TextUtils.isEmpty(zzebVar.zzafa)) {
            return;
        }
        if (!zzebVar.zzafk) {
            zzg(zzebVar);
            return;
        }
        zzjh().beginTransaction();
        try {
            zzg(zzebVar);
            zzef zzi = zzjh().zzi(zzefVar.packageName, zzefVar.zzage.name);
            if (zzi != null) {
                this.zzacv.zzgi().zzjb().zze("Removing conditional user property", zzefVar.packageName, this.zzacv.zzgf().zzbo(zzefVar.zzage.name));
                zzjh().zzj(zzefVar.packageName, zzefVar.zzage.name);
                if (zzi.active) {
                    zzjh().zzg(zzefVar.packageName, zzefVar.zzage.name);
                }
                if (zzefVar.zzagh != null) {
                    zzc(this.zzacv.zzgg().zza(zzefVar.packageName, zzefVar.zzagh.name, zzefVar.zzagh.zzahg != null ? zzefVar.zzagh.zzahg.zzin() : null, zzi.origin, zzefVar.zzagh.zzahr, true, false), zzebVar);
                }
            } else {
                this.zzacv.zzgi().zziy().zze("Conditional user property doesn't exist", zzfi.zzbp(zzefVar.packageName), this.zzacv.zzgf().zzbo(zzefVar.zzage.name));
            }
            zzjh().setTransactionSuccessful();
        } finally {
            zzjh().endTransaction();
        }
    }

    @WorkerThread
    final void zzc(zzex zzexVar, String str) {
        zzea zzbf = zzjh().zzbf(str);
        if (zzbf == null || TextUtils.isEmpty(zzbf.zzag())) {
            this.zzacv.zzgi().zzjb().zzg("No app data available; dropping event", str);
            return;
        }
        Boolean zzc = zzc(zzbf);
        if (zzc == null) {
            if (!"_ui".equals(zzexVar.name)) {
                this.zzacv.zzgi().zziy().zzg("Could not find package. appId", zzfi.zzbp(str));
            }
        } else if (!zzc.booleanValue()) {
            this.zzacv.zzgi().zziv().zzg("App version does not match; dropping event. appId", zzfi.zzbp(str));
            return;
        }
        zzb(zzexVar, new zzeb(str, zzbf.getGmpAppId(), zzbf.zzag(), zzbf.zzgu(), zzbf.zzgv(), zzbf.zzgw(), zzbf.zzgx(), (String) null, zzbf.isMeasurementEnabled(), false, zzbf.zzgr(), zzbf.zzhk(), 0L, 0, zzbf.zzhl(), zzbf.zzhm(), false));
    }

    @WorkerThread
    final void zzc(zzka zzkaVar, zzeb zzebVar) {
        zzab();
        zzlc();
        if (TextUtils.isEmpty(zzebVar.zzafa)) {
            return;
        }
        if (!zzebVar.zzafk) {
            zzg(zzebVar);
            return;
        }
        this.zzacv.zzgi().zzjb().zzg("Removing user property", this.zzacv.zzgf().zzbo(zzkaVar.name));
        zzjh().beginTransaction();
        try {
            zzg(zzebVar);
            zzjh().zzg(zzebVar.packageName, zzkaVar.name);
            zzjh().setTransactionSuccessful();
            this.zzacv.zzgi().zzjb().zzg("User property removed", this.zzacv.zzgf().zzbo(zzkaVar.name));
        } finally {
            zzjh().endTransaction();
        }
    }

    @WorkerThread
    @VisibleForTesting
    final void zzd(zzeb zzebVar) {
        if (this.zzasj != null) {
            this.zzask = new ArrayList();
            this.zzask.addAll(this.zzasj);
        }
        zzek zzjh = zzjh();
        String str = zzebVar.packageName;
        Preconditions.checkNotEmpty(str);
        zzjh.zzab();
        zzjh.zzch();
        try {
            SQLiteDatabase writableDatabase = zzjh.getWritableDatabase();
            String[] strArr = {str};
            int delete = writableDatabase.delete("apps", "app_id=?", strArr) + 0 + writableDatabase.delete("events", "app_id=?", strArr) + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("queue", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr) + writableDatabase.delete("main_event_params", "app_id=?", strArr);
            if (delete > 0) {
                zzjh.zzgi().zzjc().zze("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzjh.zzgi().zziv().zze("Error resetting analytics data. appId, error", zzfi.zzbp(str), e);
        }
        zzeb zza2 = zza(this.zzacv.getContext(), zzebVar.packageName, zzebVar.zzafa, zzebVar.zzafk, zzebVar.zzafm, zzebVar.zzafn, zzebVar.zzaga);
        if (!this.zzacv.zzgk().zzbc(zzebVar.packageName) || zzebVar.zzafk) {
            zzf(zza2);
        }
    }

    final void zze(zzeb zzebVar) {
        zzab();
        zzlc();
        Preconditions.checkNotEmpty(zzebVar.packageName);
        zzg(zzebVar);
    }

    @WorkerThread
    final void zze(zzef zzefVar) {
        zzeb zzce = zzce(zzefVar.packageName);
        if (zzce != null) {
            zzb(zzefVar, zzce);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x03af A[Catch: all -> 0x03d8, TryCatch #2 {all -> 0x03d8, blocks: (B:25:0x0091, B:27:0x009f, B:29:0x00a5, B:31:0x00b1, B:33:0x00d9, B:35:0x0134, B:39:0x0147, B:41:0x015c, B:43:0x0167, B:45:0x0171, B:46:0x018f, B:47:0x0193, B:49:0x0199, B:51:0x01a5, B:52:0x01c4, B:54:0x01c9, B:55:0x01d1, B:57:0x01e5, B:59:0x01f1, B:61:0x023e, B:63:0x0242, B:64:0x0247, B:66:0x0253, B:67:0x0308, B:69:0x0323, B:70:0x0328, B:71:0x0391, B:72:0x03ab, B:73:0x03c9, B:78:0x026a, B:80:0x0296, B:82:0x029c, B:84:0x02a4, B:85:0x02ac, B:88:0x02b5, B:92:0x02c5, B:95:0x02f2, B:97:0x02f8, B:98:0x02fd, B:100:0x0303, B:103:0x02da, B:106:0x027d, B:109:0x0340, B:111:0x0375, B:113:0x0379, B:114:0x037e, B:115:0x03af, B:117:0x03b3, B:119:0x01d8), top: B:24:0x0091, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e5 A[Catch: all -> 0x03d8, TryCatch #2 {all -> 0x03d8, blocks: (B:25:0x0091, B:27:0x009f, B:29:0x00a5, B:31:0x00b1, B:33:0x00d9, B:35:0x0134, B:39:0x0147, B:41:0x015c, B:43:0x0167, B:45:0x0171, B:46:0x018f, B:47:0x0193, B:49:0x0199, B:51:0x01a5, B:52:0x01c4, B:54:0x01c9, B:55:0x01d1, B:57:0x01e5, B:59:0x01f1, B:61:0x023e, B:63:0x0242, B:64:0x0247, B:66:0x0253, B:67:0x0308, B:69:0x0323, B:70:0x0328, B:71:0x0391, B:72:0x03ab, B:73:0x03c9, B:78:0x026a, B:80:0x0296, B:82:0x029c, B:84:0x02a4, B:85:0x02ac, B:88:0x02b5, B:92:0x02c5, B:95:0x02f2, B:97:0x02f8, B:98:0x02fd, B:100:0x0303, B:103:0x02da, B:106:0x027d, B:109:0x0340, B:111:0x0375, B:113:0x0379, B:114:0x037e, B:115:0x03af, B:117:0x03b3, B:119:0x01d8), top: B:24:0x0091, inners: #0, #1, #3 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzf(zzeb zzebVar) {
        int i;
        zzea zzbf;
        ApplicationInfo applicationInfo;
        zzet zzetVar;
        zzek zzjh;
        String str;
        String str2;
        zzex zzexVar;
        long j;
        PackageInfo packageInfo;
        boolean z;
        zzex zzexVar2;
        zzab();
        zzlc();
        Preconditions.checkNotNull(zzebVar);
        Preconditions.checkNotEmpty(zzebVar.packageName);
        if (TextUtils.isEmpty(zzebVar.zzafa)) {
            return;
        }
        zzea zzbf2 = zzjh().zzbf(zzebVar.packageName);
        if (zzbf2 != null && TextUtils.isEmpty(zzbf2.getGmpAppId()) && !TextUtils.isEmpty(zzebVar.zzafa)) {
            zzbf2.zzx(0L);
            zzjh().zza(zzbf2);
            zzky().zzca(zzebVar.packageName);
        }
        if (!zzebVar.zzafk) {
            zzg(zzebVar);
            return;
        }
        long j2 = zzebVar.zzaga;
        if (j2 == 0) {
            j2 = this.zzacv.zzbt().currentTimeMillis();
        }
        int i2 = zzebVar.zzagb;
        if (i2 == 0 || i2 == 1) {
            i = i2;
        } else {
            this.zzacv.zzgi().zziy().zze("Incorrect app type, assuming installed app. appId, appType", zzfi.zzbp(zzebVar.packageName), Integer.valueOf(i2));
            i = 0;
        }
        zzjh().beginTransaction();
        try {
            zzbf = zzjh().zzbf(zzebVar.packageName);
            applicationInfo = null;
            if (zzbf != null && zzbf.getGmpAppId() != null && !zzbf.getGmpAppId().equals(zzebVar.zzafa)) {
                this.zzacv.zzgi().zziy().zzg("New GMP App Id passed in. Removing cached database data. appId", zzfi.zzbp(zzbf.zzah()));
                zzek zzjh2 = zzjh();
                String zzah = zzbf.zzah();
                zzjh2.zzch();
                zzjh2.zzab();
                Preconditions.checkNotEmpty(zzah);
                try {
                    SQLiteDatabase writableDatabase = zzjh2.getWritableDatabase();
                    String[] strArr = {zzah};
                    int delete = writableDatabase.delete("events", "app_id=?", strArr) + 0 + writableDatabase.delete("user_attributes", "app_id=?", strArr) + writableDatabase.delete("conditional_properties", "app_id=?", strArr) + writableDatabase.delete("apps", "app_id=?", strArr) + writableDatabase.delete("raw_events", "app_id=?", strArr) + writableDatabase.delete("raw_events_metadata", "app_id=?", strArr) + writableDatabase.delete("event_filters", "app_id=?", strArr) + writableDatabase.delete("property_filters", "app_id=?", strArr) + writableDatabase.delete("audience_filter_values", "app_id=?", strArr);
                    if (delete > 0) {
                        zzjh2.zzgi().zzjc().zze("Deleted application data. app, records", zzah, Integer.valueOf(delete));
                    }
                } catch (SQLiteException e) {
                    zzjh2.zzgi().zziv().zze("Error deleting application data. appId, error", zzfi.zzbp(zzah), e);
                }
                zzbf = null;
            }
        } finally {
        }
        if (zzbf != null) {
            if (zzbf.zzgu() != -2147483648L) {
                if (zzbf.zzgu() != zzebVar.zzafg) {
                    Bundle bundle = new Bundle();
                    bundle.putString("_pv", zzbf.zzag());
                    zzexVar2 = new zzex("_au", new zzeu(bundle), "auto", j2);
                    zzb(zzexVar2, zzebVar);
                }
            } else if (zzbf.zzag() != null && !zzbf.zzag().equals(zzebVar.zztg)) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("_pv", zzbf.zzag());
                zzexVar2 = new zzex("_au", new zzeu(bundle2), "auto", j2);
                zzb(zzexVar2, zzebVar);
            }
            zzjh().endTransaction();
        }
        zzg(zzebVar);
        if (i == 0) {
            zzjh = zzjh();
            str = zzebVar.packageName;
            str2 = "_f";
        } else {
            if (i != 1) {
                zzetVar = null;
                if (zzetVar == null) {
                    if (zzebVar.zzafz) {
                        zzexVar = new zzex("_cd", new zzeu(new Bundle()), "auto", j2);
                    }
                    zzjh().setTransactionSuccessful();
                }
                long j3 = ((j2 / 3600000) + 1) * 3600000;
                if (i == 0) {
                    j = 1;
                    zzb(new zzka("_fot", j2, Long.valueOf(j3), "auto"), zzebVar);
                    zzab();
                    zzlc();
                    Bundle bundle3 = new Bundle();
                    bundle3.putLong("_c", 1L);
                    bundle3.putLong("_r", 1L);
                    bundle3.putLong("_uwa", 0L);
                    bundle3.putLong("_pfo", 0L);
                    bundle3.putLong("_sys", 0L);
                    bundle3.putLong("_sysu", 0L);
                    if (this.zzacv.zzgk().zzbc(zzebVar.packageName) && zzebVar.zzagc) {
                        bundle3.putLong("_dac", 1L);
                    }
                    if (this.zzacv.getContext().getPackageManager() == null) {
                        this.zzacv.zzgi().zziv().zzg("PackageManager is null, first open report might be inaccurate. appId", zzfi.zzbp(zzebVar.packageName));
                    } else {
                        try {
                            packageInfo = Wrappers.packageManager(this.zzacv.getContext()).getPackageInfo(zzebVar.packageName, 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            this.zzacv.zzgi().zziv().zze("Package info is null, first open report might be inaccurate. appId", zzfi.zzbp(zzebVar.packageName), e2);
                            packageInfo = null;
                        }
                        if (packageInfo != null && packageInfo.firstInstallTime != 0) {
                            if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                bundle3.putLong("_uwa", 1L);
                                z = false;
                            } else {
                                z = true;
                            }
                            zzb(new zzka("_fi", j2, Long.valueOf(z ? 1L : 0L), "auto"), zzebVar);
                        }
                        try {
                            applicationInfo = Wrappers.packageManager(this.zzacv.getContext()).getApplicationInfo(zzebVar.packageName, 0);
                        } catch (PackageManager.NameNotFoundException e3) {
                            this.zzacv.zzgi().zziv().zze("Application info is null, first open report might be inaccurate. appId", zzfi.zzbp(zzebVar.packageName), e3);
                        }
                        ApplicationInfo applicationInfo2 = applicationInfo;
                        if (applicationInfo2 != null) {
                            if ((applicationInfo2.flags & 1) != 0) {
                                bundle3.putLong("_sys", 1L);
                            }
                            if ((applicationInfo2.flags & 128) != 0) {
                                bundle3.putLong("_sysu", 1L);
                            }
                        }
                    }
                    zzek zzjh3 = zzjh();
                    String str3 = zzebVar.packageName;
                    Preconditions.checkNotEmpty(str3);
                    zzjh3.zzab();
                    zzjh3.zzch();
                    long zzm = zzjh3.zzm(str3, "first_open_count");
                    if (zzm >= 0) {
                        bundle3.putLong("_pfo", zzm);
                    }
                    zzb(new zzex("_f", new zzeu(bundle3), "auto", j2), zzebVar);
                } else {
                    j = 1;
                    if (i == 1) {
                        zzb(new zzka("_fvt", j2, Long.valueOf(j3), "auto"), zzebVar);
                        zzab();
                        zzlc();
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("_c", 1L);
                        bundle4.putLong("_r", 1L);
                        if (this.zzacv.zzgk().zzbc(zzebVar.packageName) && zzebVar.zzagc) {
                            bundle4.putLong("_dac", 1L);
                        }
                        zzb(new zzex("_v", new zzeu(bundle4), "auto", j2), zzebVar);
                    }
                }
                Bundle bundle5 = new Bundle();
                bundle5.putLong("_et", j);
                zzexVar = new zzex("_e", new zzeu(bundle5), "auto", j2);
                zzb(zzexVar, zzebVar);
                zzjh().setTransactionSuccessful();
            }
            zzjh = zzjh();
            str = zzebVar.packageName;
            str2 = "_v";
        }
        zzetVar = zzjh.zzf(str, str2);
        if (zzetVar == null) {
        }
        zzb(zzexVar, zzebVar);
        zzjh().setTransactionSuccessful();
    }

    @WorkerThread
    final void zzf(zzef zzefVar) {
        zzeb zzce = zzce(zzefVar.packageName);
        if (zzce != null) {
            zzc(zzefVar, zzce);
        }
    }

    @WorkerThread
    final void zzg(Runnable runnable) {
        zzab();
        if (this.zzasb == null) {
            this.zzasb = new ArrayList();
        }
        this.zzasb.add(runnable);
    }

    public final zzfg zzgf() {
        return this.zzacv.zzgf();
    }

    public final zzkd zzgg() {
        return this.zzacv.zzgg();
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final zzgi zzgh() {
        return this.zzacv.zzgh();
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final zzfi zzgi() {
        return this.zzacv.zzgi();
    }

    public final zzeh zzgk() {
        return this.zzacv.zzgk();
    }

    @Override // com.google.android.gms.internal.measurement.zzhk
    public final zzee zzgl() {
        return this.zzacv.zzgl();
    }

    final String zzh(zzeb zzebVar) {
        try {
            return (String) this.zzacv.zzgh().zzb(new zzjx(this, zzebVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            this.zzacv.zzgi().zziv().zze("Failed to get app instance id. appId", zzfi.zzbp(zzebVar.packageName), e);
            return null;
        }
    }

    public final zzjz zzjf() {
        zza(this.zzary);
        return this.zzary;
    }

    public final zzed zzjg() {
        zza(this.zzarx);
        return this.zzarx;
    }

    public final zzek zzjh() {
        zza(this.zzaru);
        return this.zzaru;
    }

    public final zzfm zzkz() {
        zza(this.zzart);
        return this.zzart;
    }

    final void zzlc() {
        if (!this.zzvn) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @WorkerThread
    final void zzle() {
        zzea zzbf;
        String str;
        zzfk zzjc;
        String str2;
        zzab();
        zzlc();
        this.zzasg = true;
        try {
            this.zzacv.zzgl();
            Boolean zzkr = this.zzacv.zzga().zzkr();
            if (zzkr == null) {
                zzjc = this.zzacv.zzgi().zziy();
                str2 = "Upload data called on the client side before use of service was decided";
            } else {
                if (!zzkr.booleanValue()) {
                    if (this.zzasa <= 0) {
                        zzab();
                        if (this.zzasj != null) {
                            zzjc = this.zzacv.zzgi().zzjc();
                            str2 = "Uploading requested multiple times";
                        } else {
                            if (zzkz().zzex()) {
                                long currentTimeMillis = this.zzacv.zzbt().currentTimeMillis();
                                zzd(null, currentTimeMillis - zzeh.zzhr());
                                long j = this.zzacv.zzgj().zzalt.get();
                                if (j != 0) {
                                    this.zzacv.zzgi().zzjb().zzg("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - j)));
                                }
                                String zzhv = zzjh().zzhv();
                                if (TextUtils.isEmpty(zzhv)) {
                                    this.zzasl = -1L;
                                    String zzag = zzjh().zzag(currentTimeMillis - zzeh.zzhr());
                                    if (!TextUtils.isEmpty(zzag) && (zzbf = zzjh().zzbf(zzag)) != null) {
                                        zzb(zzbf);
                                    }
                                } else {
                                    if (this.zzasl == -1) {
                                        this.zzasl = zzjh().zzic();
                                    }
                                    List<Pair<zzku, Long>> zzb = zzjh().zzb(zzhv, this.zzacv.zzgk().zzb(zzhv, zzez.zzaik), Math.max(0, this.zzacv.zzgk().zzb(zzhv, zzez.zzail)));
                                    if (!zzb.isEmpty()) {
                                        Iterator<Pair<zzku, Long>> it = zzb.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                str = null;
                                                break;
                                            }
                                            zzku zzkuVar = (zzku) it.next().first;
                                            if (!TextUtils.isEmpty(zzkuVar.zzavv)) {
                                                str = zzkuVar.zzavv;
                                                break;
                                            }
                                        }
                                        if (str != null) {
                                            int i = 0;
                                            while (true) {
                                                if (i >= zzb.size()) {
                                                    break;
                                                }
                                                zzku zzkuVar2 = (zzku) zzb.get(i).first;
                                                if (!TextUtils.isEmpty(zzkuVar2.zzavv) && !zzkuVar2.zzavv.equals(str)) {
                                                    zzb = zzb.subList(0, i);
                                                    break;
                                                }
                                                i++;
                                            }
                                        }
                                        zzkt zzktVar = new zzkt();
                                        zzktVar.zzavf = new zzku[zzb.size()];
                                        ArrayList arrayList = new ArrayList(zzb.size());
                                        boolean z = zzeh.zzht() && this.zzacv.zzgk().zzau(zzhv);
                                        for (int i2 = 0; i2 < zzktVar.zzavf.length; i2++) {
                                            zzktVar.zzavf[i2] = (zzku) zzb.get(i2).first;
                                            arrayList.add((Long) zzb.get(i2).second);
                                            zzktVar.zzavf[i2].zzavu = Long.valueOf(this.zzacv.zzgk().zzgw());
                                            zzktVar.zzavf[i2].zzavk = Long.valueOf(currentTimeMillis);
                                            zzku zzkuVar3 = zzktVar.zzavf[i2];
                                            this.zzacv.zzgl();
                                            zzkuVar3.zzavz = false;
                                            if (!z) {
                                                zzktVar.zzavf[i2].zzawh = null;
                                            }
                                        }
                                        String zzb2 = this.zzacv.zzgi().isLoggable(2) ? zzjf().zzb(zzktVar) : null;
                                        byte[] zza2 = zzjf().zza(zzktVar);
                                        String str3 = zzez.zzaiu.get();
                                        try {
                                            URL url = new URL(str3);
                                            Preconditions.checkArgument(!arrayList.isEmpty());
                                            if (this.zzasj != null) {
                                                this.zzacv.zzgi().zziv().log("Set uploading progress before finishing the previous upload");
                                            } else {
                                                this.zzasj = new ArrayList(arrayList);
                                            }
                                            this.zzacv.zzgj().zzalu.set(currentTimeMillis);
                                            this.zzacv.zzgi().zzjc().zzd("Uploading data. app, uncompressed size, data", zzktVar.zzavf.length > 0 ? zzktVar.zzavf[0].zzth : "?", Integer.valueOf(zza2.length), zzb2);
                                            this.zzasf = true;
                                            zzfm zzkz = zzkz();
                                            zzjv zzjvVar = new zzjv(this, zzhv);
                                            zzkz.zzab();
                                            zzkz.zzch();
                                            Preconditions.checkNotNull(url);
                                            Preconditions.checkNotNull(zza2);
                                            Preconditions.checkNotNull(zzjvVar);
                                            zzkz.zzgh().zzd(new zzfq(zzkz, zzhv, url, zza2, null, zzjvVar));
                                        } catch (MalformedURLException unused) {
                                            this.zzacv.zzgi().zziv().zze("Failed to parse upload URL. Not uploading. appId", zzfi.zzbp(zzhv), str3);
                                        }
                                    }
                                }
                            }
                            this.zzacv.zzgi().zzjc().log("Network not connected, ignoring upload request");
                        }
                    }
                    zzlg();
                }
                zzjc = this.zzacv.zzgi().zziv();
                str2 = "Upload called in the client side when service should be used";
            }
            zzjc.log(str2);
        } finally {
            this.zzasg = false;
            zzlh();
        }
    }

    @WorkerThread
    final void zzlj() {
        zzfk zziv;
        String str;
        zzab();
        zzlc();
        if (this.zzarz) {
            return;
        }
        this.zzacv.zzgi().zzja().log("This instance being marked as an uploader");
        zzab();
        zzlc();
        if (zzlk() && zzli()) {
            int zza2 = zza(this.zzasi);
            int zzis = this.zzacv.zzfz().zzis();
            zzab();
            if (zza2 > zzis) {
                zziv = this.zzacv.zzgi().zziv();
                str = "Panic: can't downgrade version. Previous, current version";
            } else if (zza2 < zzis) {
                if (zza(zzis, this.zzasi)) {
                    zziv = this.zzacv.zzgi().zzjc();
                    str = "Storage version upgraded. Previous, current version";
                } else {
                    zziv = this.zzacv.zzgi().zziv();
                    str = "Storage version upgrade failed. Previous, current version";
                }
            }
            zziv.zze(str, Integer.valueOf(zza2), Integer.valueOf(zzis));
        }
        this.zzarz = true;
        zzlg();
    }

    final void zzll() {
        this.zzasd++;
    }

    final zzgn zzlm() {
        return this.zzacv;
    }

    final void zzm(boolean z) {
        zzlg();
    }
}
