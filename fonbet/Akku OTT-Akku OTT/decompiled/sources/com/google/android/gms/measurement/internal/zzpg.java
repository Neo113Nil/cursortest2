package com.google.android.gms.measurement.internal;

import android.app.BroadcastOptions;
import android.content.ComponentName;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import androidx.collection.SieveCacheKt;
import androidx.compose.runtime.ComposerKt;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.d;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.channels.OverlappingFileLockException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;
import kotlin.time.DurationKt;

/* loaded from: classes4.dex */
public final class zzpg implements zzjg {
    private static volatile zzpg zzb;
    private List zzA;
    private long zzB;
    private final Map zzC;
    private final Map zzD;
    private final Map zzE;
    private zzlu zzG;
    private String zzH;
    private zzay zzI;
    private long zzJ;

    @VisibleForTesting
    long zza;
    private final zzht zzc;
    private final zzgz zzd;
    private zzav zze;
    private zzhb zzf;
    private zzok zzg;
    private zzad zzh;
    private final zzpk zzi;
    private zzlp zzj;
    private zznn zzk;
    private final zzou zzl;
    private zzhk zzm;
    private final zzic zzn;
    private boolean zzp;
    private List zzq;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private boolean zzw;
    private FileLock zzx;
    private FileChannel zzy;
    private List zzz;
    private final AtomicBoolean zzo = new AtomicBoolean(false);
    private final Deque zzr = new LinkedList();
    private final Map zzF = new HashMap();
    private final zzpo zzK = new zzpb(this);

    public zzpg(zzph zzphVar, zzic zzicVar) {
        C0875q.g(zzphVar);
        this.zzn = zzic.zzy(zzphVar.zza, null, null);
        this.zzB = -1L;
        this.zzl = new zzou(this);
        zzpk zzpkVar = new zzpk(this);
        zzpkVar.zzax();
        this.zzi = zzpkVar;
        zzgz zzgzVar = new zzgz(this);
        zzgzVar.zzax();
        this.zzd = zzgzVar;
        zzht zzhtVar = new zzht(this);
        zzhtVar.zzax();
        this.zzc = zzhtVar;
        this.zzC = new HashMap();
        this.zzD = new HashMap();
        this.zzE = new HashMap();
        zzaW().zzj(new zzov(this, zzphVar));
    }

    public static zzpg zza(Context context) {
        C0875q.g(context);
        C0875q.g(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                try {
                    if (zzb == null) {
                        zzb = new zzpg(new zzph(context), null);
                    }
                } finally {
                }
            }
        }
        return zzb;
    }

    @VisibleForTesting
    public static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i, String str) {
        List zza = zzhrVar.zza();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i2)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb("_err");
        zzn.zzf(i);
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn2.zzb("_ev");
        zzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    @VisibleForTesting
    public static final void zzaB(com.google.android.gms.internal.measurement.zzhr zzhrVar, @NonNull String str) {
        List zza = zzhrVar.zza();
        for (int i = 0; i < zza.size(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i)).zzb())) {
                zzhrVar.zzj(i);
                return;
            }
        }
    }

    private final int zzaC(String str, zzan zzanVar) {
        zzjk zzjkVar;
        zzji zzA;
        zzht zzhtVar = this.zzc;
        if (zzhtVar.zzx(str) == null) {
            zzanVar.zzc(zzjk.AD_PERSONALIZATION, zzam.FAILSAFE);
            return 1;
        }
        zzh zzu = zzj().zzu(str);
        if (zzu != null && zze.zzc(zzu.zzaH()).zza() == zzji.POLICY && (zzA = zzhtVar.zzA(str, (zzjkVar = zzjk.AD_PERSONALIZATION))) != zzji.UNINITIALIZED) {
            zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
            return zzA == zzji.GRANTED ? 0 : 1;
        }
        zzjk zzjkVar2 = zzjk.AD_PERSONALIZATION;
        zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
        return zzhtVar.zzv(str, zzjkVar2) ? 0 : 1;
    }

    private final Map zzaD(com.google.android.gms.internal.measurement.zzhs zzhsVar) {
        HashMap hashMap = new HashMap();
        zzp();
        for (Map.Entry entry : zzpk.zzH(zzhsVar, "gad_").entrySet()) {
            hashMap.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
        return hashMap;
    }

    private final zzay zzaE() {
        if (this.zzI == null) {
            this.zzI = new zzoy(this, this.zzn);
        }
        return this.zzI;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @WorkerThread
    /* renamed from: zzaF, reason: merged with bridge method [inline-methods] */
    public final void zzav() {
        zzaW().zzg();
        if (this.zzr.isEmpty() || zzaE().zzc()) {
            return;
        }
        long max = Math.max(0L, ((Integer) zzfy.zzaB.zzb(null)).intValue() - (zzaZ().elapsedRealtime() - this.zzJ));
        zzaV().zzk().zzb("Scheduling notify next app runnable, delay in ms", Long.valueOf(max));
        zzaE().zzb(max);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @androidx.annotation.WorkerThread
    private final boolean zzaG(java.lang.String r44, long r45) {
        /*
            Method dump skipped, instructions count: 3597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzpg.zzaG(java.lang.String, long):boolean");
    }

    @VisibleForTesting
    private final void zzaH(com.google.android.gms.internal.measurement.zzic zzicVar, long j, boolean z) {
        Object obj;
        String str = true != z ? "_lte" : "_se";
        zzpn zzm = zzj().zzm(zzicVar.zzK(), str);
        zzpn zzpnVar = (zzm == null || (obj = zzm.zze) == null) ? new zzpn(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), Long.valueOf(j)) : new zzpn(zzicVar.zzK(), "auto", str, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj).longValue() + j));
        com.google.android.gms.internal.measurement.zzit zzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
        zzm2.zzb(str);
        zzm2.zza(zzaZ().currentTimeMillis());
        Object obj2 = zzpnVar.zze;
        zzm2.zze(((Long) obj2).longValue());
        com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) zzm2.zzbc();
        int zzx = zzpk.zzx(zzicVar, str);
        if (zzx >= 0) {
            zzicVar.zzn(zzx, zziuVar);
        } else {
            zzicVar.zzo(zziuVar);
        }
        if (j > 0) {
            zzj().zzl(zzpnVar);
            zzaV().zzk().zzc("Updated engagement user property. scope, value", true != z ? "lifetime" : "session-scoped", obj2);
        }
    }

    private final boolean zzaI(com.google.android.gms.internal.measurement.zzhr zzhrVar, com.google.android.gms.internal.measurement.zzhr zzhrVar2) {
        C0875q.a("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        String zzd = zzF == null ? null : zzF.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF2 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_pc");
        String zzd2 = zzF2 != null ? zzF2.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        C0875q.a("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF3 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_et");
        if (zzF3 == null || !zzF3.zze() || zzF3.zzf() <= 0) {
            return true;
        }
        long zzf = zzF3.zzf();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF4 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_et");
        if (zzF4 != null && zzF4.zzf() > 0) {
            zzf += zzF4.zzf();
        }
        zzp();
        zzpk.zzC(zzhrVar2, "_et", Long.valueOf(zzf));
        zzp();
        zzpk.zzC(zzhrVar, "_fr", 1L);
        return true;
    }

    private final boolean zzaJ() {
        zzaW().zzg();
        zzu();
        return zzj().zzP() || !TextUtils.isEmpty(zzj().zzF());
    }

    private static String zzaK(Map map, String str) {
        if (map == null) {
            return null;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (str.equalsIgnoreCase((String) entry.getKey())) {
                if (((List) entry.getValue()).isEmpty()) {
                    return null;
                }
                return (String) ((List) entry.getValue()).get(0);
            }
        }
        return null;
    }

    @WorkerThread
    private final void zzaL() {
        long max;
        long j;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long abs = DurationKt.MILLIS_IN_HOUR - Math.abs(zzaZ().elapsedRealtime() - this.zza);
            if (abs > 0) {
                zzaV().zzk().zzb("Upload has been suspended. Will update scheduling later in approximately ms", Long.valueOf(abs));
                zzk().zzb();
                zzl().zzd();
                return;
            }
            this.zza = 0L;
        }
        if (!this.zzn.zzH() || !zzaJ()) {
            zzaV().zzk().zza("Nothing to upload or uploading impossible");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        long currentTimeMillis = zzaZ().currentTimeMillis();
        zzd();
        long max2 = Math.max(0L, ((Long) zzfy.zzO.zzb(null)).longValue());
        boolean z = true;
        if (!zzj().zzR() && !zzj().zzG()) {
            z = false;
        }
        if (z) {
            String zzA = zzd().zzA();
            if (TextUtils.isEmpty(zzA) || ".none.".equals(zzA)) {
                zzd();
                max = Math.max(0L, ((Long) zzfy.zzI.zzb(null)).longValue());
            } else {
                zzd();
                max = Math.max(0L, ((Long) zzfy.zzJ.zzb(null)).longValue());
            }
        } else {
            zzd();
            max = Math.max(0L, ((Long) zzfy.zzH.zzb(null)).longValue());
        }
        long zza = this.zzk.zzd.zza();
        long zza2 = this.zzk.zze.zza();
        long j2 = 0;
        boolean z2 = z;
        long max3 = Math.max(zzj().zzM(), zzj().zzO());
        if (max3 == 0) {
            j = 0;
        } else {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j = max2 + abs2;
            long max4 = Math.max(abs3, abs4);
            if (z2 && max4 > 0) {
                j = Math.min(abs2, max4) + max;
            }
            if (!zzp().zzs(max4, max)) {
                j = max4 + max;
            }
            if (abs4 != 0 && abs4 >= abs2) {
                int i = 0;
                while (true) {
                    zzd();
                    if (i >= Math.min(20, Math.max(0, ((Integer) zzfy.zzQ.zzb(null)).intValue()))) {
                        j = 0;
                        break;
                    }
                    zzd();
                    j += Math.max(j2, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    }
                    i++;
                    j2 = 0;
                }
            }
            j2 = 0;
        }
        if (j == j2) {
            zzaV().zzk().zza("Next upload time is 0");
            zzk().zzb();
            zzl().zzd();
            return;
        }
        if (!zzi().zzb()) {
            zzaV().zzk().zza("No network");
            zzk().zza();
            zzl().zzd();
            return;
        }
        long zza3 = this.zzk.zzc.zza();
        zzd();
        long max5 = Math.max(0L, ((Long) zzfy.zzF.zzb(null)).longValue());
        if (!zzp().zzs(zza3, max5)) {
            j = Math.max(j, zza3 + max5);
        }
        zzk().zzb();
        long currentTimeMillis2 = j - zzaZ().currentTimeMillis();
        if (currentTimeMillis2 <= 0) {
            zzd();
            currentTimeMillis2 = Math.max(0L, ((Long) zzfy.zzK.zzb(null)).longValue());
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaV().zzk().zzb("Upload scheduled in approximately ms", Long.valueOf(currentTimeMillis2));
        zzl().zzc(currentTimeMillis2);
    }

    @WorkerThread
    private final void zzaM() {
        zzaW().zzg();
        if (this.zzu || this.zzv || this.zzw) {
            zzaV().zzk().zzd("Not stopping services. fetch, network, upload", Boolean.valueOf(this.zzu), Boolean.valueOf(this.zzv), Boolean.valueOf(this.zzw));
            return;
        }
        zzaV().zzk().zza("Stopping uploading service(s)");
        List list = this.zzq;
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        List list2 = this.zzq;
        C0875q.g(list2);
        list2.clear();
    }

    @WorkerThread
    private final Boolean zzaN(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != SieveCacheKt.NodeMetaAndPreviousMask) {
                if (zzhVar.zzt() == d.a(this.zzn.zzaY()).b(0, zzhVar.zzc()).versionCode) {
                    return Boolean.TRUE;
                }
            } else {
                String str = d.a(this.zzn.zzaY()).b(0, zzhVar.zzc()).versionName;
                String zzr = zzhVar.zzr();
                if (zzr != null && zzr.equals(str)) {
                    return Boolean.TRUE;
                }
            }
            return Boolean.FALSE;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @WorkerThread
    private final zzr zzaO(String str) {
        zzh zzu = zzj().zzu(str);
        if (zzu == null || TextUtils.isEmpty(zzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping", str);
            return null;
        }
        Boolean zzaN = zzaN(zzu);
        if (zzaN == null || zzaN.booleanValue()) {
            return new zzr(str, zzu.zzf(), zzu.zzr(), zzu.zzt(), zzu.zzv(), zzu.zzx(), zzu.zzz(), (String) null, zzu.zzD(), false, zzu.zzl(), 0L, 0, zzu.zzac(), false, zzu.zzae(), zzu.zzB(), zzu.zzag(), zzB(str).zzl(), "", (String) null, zzu.zzai(), zzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzu.zzao(), zzu.zzaw(), zzu.zzay(), zzu.zzaH(), 0L, zzu.zzaL());
        }
        zzaV().zzb().zzb("App version does not match; dropping. appId", zzgu.zzl(str));
        return null;
    }

    @WorkerThread
    private final boolean zzaP(String str, String str2) {
        zzbc zzf = zzj().zzf(str, str2);
        return zzf == null || zzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaQ(Context context, Intent intent) {
        BroadcastOptions makeBasic;
        BroadcastOptions shareIdentityEnabled;
        Bundle bundle;
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
            return;
        }
        makeBasic = BroadcastOptions.makeBasic();
        shareIdentityEnabled = makeBasic.setShareIdentityEnabled(true);
        bundle = shareIdentityEnabled.toBundle();
        context.sendBroadcast(intent, null, bundle);
    }

    private static final boolean zzaR(zzr zzrVar) {
        return !TextUtils.isEmpty(zzrVar.zzb);
    }

    private static final zzos zzaS(zzos zzosVar) {
        if (zzosVar == null) {
            throw new IllegalStateException("Upload Component not created");
        }
        if (zzosVar.zzav()) {
            return zzosVar;
        }
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(zzosVar.getClass())));
    }

    private static final Boolean zzaT(zzr zzrVar) {
        Boolean bool = zzrVar.zzp;
        String str = zzrVar.zzC;
        if (!TextUtils.isEmpty(str)) {
            zzji zza = zze.zzc(str).zza();
            zzji zzjiVar = zzji.UNINITIALIZED;
            int ordinal = zza.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                return null;
            }
            if (ordinal == 2) {
                return Boolean.TRUE;
            }
            if (ordinal == 3) {
                return Boolean.FALSE;
            }
        }
        return bool;
    }

    @WorkerThread
    public final void zzA(String str, zzjl zzjlVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjlVar);
        zzj().zzZ(str, zzjlVar);
    }

    @WorkerThread
    public final zzjl zzB(String str) {
        zzjl zzjlVar = zzjl.zza;
        zzaW().zzg();
        zzu();
        zzjl zzjlVar2 = (zzjl) this.zzC.get(str);
        if (zzjlVar2 == null) {
            zzjlVar2 = zzj().zzX(str);
            if (zzjlVar2 == null) {
                zzjlVar2 = zzjl.zza;
            }
            zzA(str, zzjlVar2);
        }
        return zzjlVar2;
    }

    public final long zzC() {
        long currentTimeMillis = zzaZ().currentTimeMillis();
        zznn zznnVar = this.zzk;
        zznnVar.zzaw();
        zznnVar.zzg();
        zzhe zzheVar = zznnVar.zzf;
        long zza = zzheVar.zza();
        if (zza == 0) {
            zza = zznnVar.zzu.zzk().zzf().nextInt(86400000) + 1;
            zzheVar.zzb(zza);
        }
        return ((((currentTimeMillis + zza) / 1000) / 60) / 60) / 24;
    }

    @WorkerThread
    public final void zzD(zzbg zzbgVar, String str) {
        zzh zzu = zzj().zzu(str);
        if (zzu == null || TextUtils.isEmpty(zzu.zzr())) {
            zzaV().zzj().zzb("No app data available; dropping event", str);
            return;
        }
        Boolean zzaN = zzaN(zzu);
        if (zzaN == null) {
            if (!"_ui".equals(zzbgVar.zza)) {
                zzaV().zze().zzb("Could not find package. appId", zzgu.zzl(str));
            }
        } else if (!zzaN.booleanValue()) {
            zzaV().zzb().zzb("App version does not match; dropping event. appId", zzgu.zzl(str));
            return;
        }
        zzE(zzbgVar, new zzr(str, zzu.zzf(), zzu.zzr(), zzu.zzt(), zzu.zzv(), zzu.zzx(), zzu.zzz(), (String) null, zzu.zzD(), false, zzu.zzl(), 0L, 0, zzu.zzac(), false, zzu.zzae(), zzu.zzB(), zzu.zzag(), zzB(str).zzl(), "", (String) null, zzu.zzai(), zzu.zzak(), zzB(str).zzb(), zzx(str).zze(), zzu.zzao(), zzu.zzaw(), zzu.zzay(), zzu.zzaH(), 0L, zzu.zzaL()));
    }

    @WorkerThread
    public final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        C0875q.d(str);
        zzgv zza = zzgv.zza(zzbgVar);
        zzt().zzI(zza.zzd, zzj().zzU(str));
        zzt().zzG(zza, zzd().zzd(str));
        zzbg zzb2 = zza.zzb();
        if (!zzd().zzp(null, zzfy.zzbf) && Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN.equals(zzb2.zza)) {
            zzbe zzbeVar = zzb2.zzb;
            if ("referrer API v2".equals(zzbeVar.zzd("_cis"))) {
                String zzd = zzbeVar.zzd("gclid");
                if (!TextUtils.isEmpty(zzd)) {
                    zzac(new zzpl("_lgclid", zzb2.zzd, zzd, "auto"), zzrVar);
                }
            }
        }
        zzF(zzb2, zzrVar);
    }

    @WorkerThread
    public final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> zzt;
        List<zzah> zzt2;
        List<zzah> zzt3;
        String str;
        C0875q.g(zzrVar);
        String str2 = zzrVar.zza;
        C0875q.d(str2);
        zzaW().zzg();
        zzu();
        long j = zzbgVar.zzd;
        zzgv zza = zzgv.zza(zzbgVar);
        zzaW().zzg();
        zzpp.zzav((this.zzG == null || (str = this.zzH) == null || !str.equals(str2)) ? null : this.zzG, zza.zzd, false);
        zzbg zzb2 = zza.zzb();
        zzp();
        if (zzpk.zzD(zzb2, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            List list = zzrVar.zzr;
            if (list != null) {
                String str3 = zzb2.zza;
                if (!list.contains(str3)) {
                    zzaV().zzj().zzd("Dropping non-safelisted event. appId, event name, origin", str2, zzb2.zza, zzb2.zzc);
                    return;
                } else {
                    Bundle zzf = zzb2.zzb.zzf();
                    zzf.putLong("ga_safelisted", 1L);
                    zzbgVar2 = new zzbg(str3, new zzbe(zzf), zzb2.zzc, zzb2.zzd);
                }
            } else {
                zzbgVar2 = zzb2;
            }
            zzj().zzb();
            try {
                String str4 = zzbgVar2.zza;
                if ("_s".equals(str4) && !zzj().zzQ(str2, "_s") && zzbgVar2.zzb.zzb("_sid").longValue() != 0) {
                    if (!zzj().zzQ(str2, "_f") && !zzj().zzQ(str2, "_v")) {
                        zzj().zzW(str2, Long.valueOf(zzaZ().currentTimeMillis() - 15000), "_sid", zzG(str2, zzbgVar2));
                    }
                    zzj().zzW(str2, null, "_sid", zzG(str2, zzbgVar2));
                }
                zzav zzj = zzj();
                C0875q.d(str2);
                zzj.zzg();
                zzj.zzaw();
                if (j < 0) {
                    zzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    zzt = Collections.EMPTY_LIST;
                } else {
                    zzt = zzj.zzt("active=0 and app_id=? and abs(? - creation_timestamp) > trigger_timeout", new String[]{str2, String.valueOf(j)});
                }
                for (zzah zzahVar : zzt) {
                    if (zzahVar != null) {
                        zzaV().zzk().zzd("User property timed out", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb), zzahVar.zzc.zza());
                        zzbg zzbgVar3 = zzahVar.zzg;
                        if (zzbgVar3 != null) {
                            zzH(new zzbg(zzbgVar3, j), zzrVar);
                        }
                        zzj().zzr(str2, zzahVar.zzc.zzb);
                    }
                }
                zzav zzj2 = zzj();
                C0875q.d(str2);
                zzj2.zzg();
                zzj2.zzaw();
                if (j < 0) {
                    zzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    zzt2 = Collections.EMPTY_LIST;
                } else {
                    zzt2 = zzj2.zzt("active<>0 and app_id=? and abs(? - triggered_timestamp) > time_to_live", new String[]{str2, String.valueOf(j)});
                }
                ArrayList arrayList = new ArrayList(zzt2.size());
                for (zzah zzahVar2 : zzt2) {
                    if (zzahVar2 != null) {
                        zzaV().zzk().zzd("User property expired", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                        zzj().zzk(str2, zzahVar2.zzc.zzb);
                        zzbg zzbgVar4 = zzahVar2.zzk;
                        if (zzbgVar4 != null) {
                            arrayList.add(zzbgVar4);
                        }
                        zzj().zzr(str2, zzahVar2.zzc.zzb);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zzH(new zzbg((zzbg) it.next(), j), zzrVar);
                }
                zzav zzj3 = zzj();
                C0875q.d(str2);
                C0875q.d(str4);
                zzj3.zzg();
                zzj3.zzaw();
                if (j < 0) {
                    zzic zzicVar = zzj3.zzu;
                    zzicVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar.zzl().zza(str4), Long.valueOf(j));
                    zzt3 = Collections.EMPTY_LIST;
                } else {
                    zzt3 = zzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(zzt3.size());
                for (zzah zzahVar3 : zzt3) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.zzc;
                        String str5 = zzahVar3.zza;
                        C0875q.g(str5);
                        String str6 = zzahVar3.zzb;
                        String str7 = zzplVar.zzb;
                        Object zza2 = zzplVar.zza();
                        C0875q.g(zza2);
                        zzpn zzpnVar = new zzpn(str5, str6, str7, j, zza2);
                        if (zzj().zzl(zzpnVar)) {
                            zzaV().zzk().zzd("User property triggered", zzahVar3.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        } else {
                            zzaV().zzb().zzd("Too many active user properties, ignoring", zzgu.zzl(zzahVar3.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                        }
                        zzbg zzbgVar5 = zzahVar3.zzi;
                        if (zzbgVar5 != null) {
                            arrayList2.add(zzbgVar5);
                        }
                        zzahVar3.zzc = new zzpl(zzpnVar);
                        zzahVar3.zze = true;
                        zzj().zzp(zzahVar3);
                    }
                }
                zzH(zzbgVar2, zzrVar);
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zzH(new zzbg((zzbg) it2.next(), j), zzrVar);
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final Bundle zzG(String str, zzbg zzbgVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_sid", zzbgVar.zzb.zzb("_sid").longValue());
        zzpn zzm = zzj().zzm(str, "_sno");
        if (zzm != null) {
            Object obj = zzm.zze;
            if (obj instanceof Long) {
                bundle.putLong("_sno", ((Long) obj).longValue());
            }
        }
        return bundle;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:358|(2:360|(10:362|363|364|(1:366)|58|(0)(0)|61|(0)(0)|67|68))|367|368|369|370|371|363|364|(0)|58|(0)(0)|61|(0)(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(68:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))(1:330)|84|85|(1:87)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|108|109|110|111|(1:113)|114|(2:116|(1:120)(1:119))(1:326)|121|(1:123)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(6:143|(1:147)|148|(1:150)(1:183)|151|(1:153)(15:154|(1:156)(1:182)|157|(1:159)(1:181)|160|(1:162)(1:180)|163|(1:165)(1:179)|166|(1:168)(1:178)|169|(1:171)(1:177)|172|(1:174)(1:176)|175))|184|(1:186)|187|(1:189)(1:325)|(35:193|(4:196|(3:198|199|(3:201|202|(3:204|205|207)(1:316))(1:318))(1:322)|317|194)|323|208|(1:210)|(1:212)|213|(1:215)|216|(2:220|(4:222|(1:224)|225|(29:233|(1:235)(1:314)|236|(1:238)|239|240|(2:242|(1:244))|245|(3:247|(1:249)|250)(1:313)|251|(1:255)|256|(1:258)|259|(4:262|(2:268|269)|270|260)|274|275|276|277|278|(2:279|(2:281|(1:283)(1:298))(3:299|300|(1:305)(1:304)))|284|285|286|287|(1:289)(2:294|295)|290|291|292)))|315|240|(0)|245|(0)(0)|251|(2:253|255)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|284|285|286|287|(0)(0)|290|291|292)|324|(0)|213|(0)|216|(3:218|220|(0))|315|240|(0)|245|(0)(0)|251|(0)|256|(0)|259|(1:260)|274|275|276|277|278|(3:279|(0)(0)|298)|284|285|286|287|(0)(0)|290|291|292) */
    /* JADX WARN: Code restructure failed: missing block: B:296:0x0ad1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0ad8, code lost:
    
        r2.zzu.zzaV().zzb().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r3.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x0aee, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x0b09, code lost:
    
        zzaV().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r8.zzK()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x028b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:374:0x028c, code lost:
    
        r12.zzu.zzaV().zzb().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r10), r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:212:0x07a7 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07b7 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x07eb A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:242:0x08a3 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x08ba A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0921 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:258:0x093f A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0958 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0a17 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0abd A[Catch: all -> 0x0176, SQLiteException -> 0x0ad1, TRY_LEAVE, TryCatch #5 {SQLiteException -> 0x0ad1, blocks: (B:287:0x0aac, B:289:0x0abd), top: B:286:0x0aac, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0ad3  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0a24 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0918  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x0307 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:366:0x02c6 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0367 A[Catch: all -> 0x0176, TryCatch #1 {all -> 0x0176, blocks: (B:43:0x0155, B:46:0x0164, B:48:0x016c, B:51:0x0179, B:58:0x02f3, B:61:0x0326, B:63:0x0367, B:65:0x036c, B:66:0x0383, B:70:0x038e, B:72:0x03a7, B:74:0x03ac, B:75:0x03c3, B:78:0x03e5, B:82:0x0408, B:83:0x041f, B:84:0x042b, B:87:0x0448, B:88:0x045c, B:90:0x0464, B:92:0x0470, B:94:0x0476, B:95:0x047d, B:97:0x048a, B:99:0x0492, B:101:0x049a, B:104:0x04a2, B:107:0x04ae, B:109:0x04bb, B:113:0x04fd, B:114:0x0512, B:116:0x0534, B:119:0x054b, B:120:0x0586, B:121:0x05b1, B:123:0x05e3, B:124:0x05e6, B:126:0x05ee, B:127:0x05f1, B:129:0x05f9, B:130:0x05fc, B:132:0x0604, B:133:0x0607, B:135:0x0610, B:136:0x0614, B:138:0x0621, B:139:0x0624, B:141:0x064d, B:143:0x0657, B:147:0x066c, B:151:0x0678, B:154:0x0681, B:157:0x068e, B:160:0x069c, B:163:0x06aa, B:166:0x06b8, B:169:0x06c6, B:172:0x06d1, B:175:0x06de, B:184:0x06ea, B:186:0x06f0, B:187:0x06f3, B:189:0x0716, B:191:0x071f, B:193:0x0728, B:194:0x0742, B:196:0x0748, B:199:0x075c, B:202:0x0768, B:205:0x0775, B:320:0x078e, B:208:0x079e, B:212:0x07a7, B:213:0x07aa, B:215:0x07b7, B:216:0x07bc, B:218:0x07d7, B:220:0x07db, B:222:0x07eb, B:224:0x07f6, B:225:0x07ff, B:227:0x0809, B:229:0x0815, B:231:0x081f, B:233:0x0825, B:235:0x0834, B:236:0x084a, B:238:0x0850, B:239:0x0859, B:240:0x0867, B:242:0x08a3, B:244:0x08ad, B:245:0x08b0, B:247:0x08ba, B:249:0x08d6, B:250:0x08e1, B:251:0x0919, B:253:0x0921, B:255:0x092b, B:256:0x0935, B:258:0x093f, B:259:0x0949, B:260:0x0952, B:262:0x0958, B:264:0x0994, B:266:0x099e, B:268:0x09b0, B:275:0x09b6, B:277:0x09fb, B:278:0x0a06, B:279:0x0a11, B:281:0x0a17, B:285:0x0a64, B:287:0x0aac, B:289:0x0abd, B:290:0x0b1e, B:295:0x0ad5, B:297:0x0ad8, B:300:0x0a24, B:302:0x0a50, B:308:0x0af1, B:309:0x0b08, B:312:0x0b09, B:325:0x0719, B:326:0x05a3, B:329:0x04e4, B:331:0x0307, B:332:0x030e, B:334:0x0314, B:337:0x0320, B:342:0x0192, B:344:0x019e, B:346:0x01b3, B:351:0x01d3, B:354:0x0209, B:356:0x020f, B:358:0x021d, B:360:0x022b, B:362:0x0237, B:364:0x02bc, B:366:0x02c6, B:368:0x0260, B:370:0x0279, B:371:0x029f, B:374:0x028c, B:375:0x01df, B:377:0x01fd), top: B:42:0x0155, inners: #0, #3, #5, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x038c  */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [boolean, int] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzH(zzbg zzbgVar, zzr zzrVar) {
        String str;
        String str2;
        long longValue;
        zzbg zzbgVar2;
        zzpn zzpnVar;
        zzpn zzpnVar2;
        zzbe zzbeVar;
        long j;
        long zzH;
        long j2;
        ?? r5;
        long j3;
        zzbb zzbbVar;
        zzbc zzbcVar;
        ArrayList arrayList;
        String str3;
        zzjl zzs;
        zzjk zzjkVar;
        String str4;
        zzjk zzjkVar2;
        zzic zzicVar;
        zzh zzu;
        int i;
        List zzn;
        int i2;
        zzav zzj;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        zzav zzj2;
        zzbd zzbdVar;
        int i3;
        ContentValues contentValues;
        Pair zzc;
        zzh zzu2;
        zzpn zzm;
        C0875q.g(zzrVar);
        String str5 = zzrVar.zza;
        C0875q.d(str5);
        long nanoTime = System.nanoTime();
        zzaW().zzg();
        zzu();
        zzp();
        if (zzpk.zzD(zzbgVar, zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzht zzh = zzh();
            String str6 = zzbgVar.zza;
            if (zzh.zzj(str5, str6)) {
                zzaV().zze().zzc("Dropping blocked event. appId", zzgu.zzl(str5), this.zzn.zzl().zza(str6));
                if (!zzh().zzn(str5) && !zzh().zzo(str5)) {
                    if ("_err".equals(str6)) {
                        return;
                    }
                    zzt().zzN(this.zzK, str5, 11, "_ev", str6, 0);
                    return;
                }
                zzh zzu3 = zzj().zzu(str5);
                if (zzu3 != null) {
                    long abs = Math.abs(zzaZ().currentTimeMillis() - Math.max(zzu3.zzJ(), zzu3.zzH()));
                    zzd();
                    if (abs > ((Long) zzfy.zzN.zzb(null)).longValue()) {
                        zzaV().zzj().zza("Fetching config for blocked app");
                        zzW(zzu3);
                        return;
                    }
                    return;
                }
                return;
            }
            zzgv zza = zzgv.zza(zzbgVar);
            zzt().zzG(zza, zzd().zzd(str5));
            int zzn2 = zzd().zzn(str5, zzfy.zzag, 10, 35);
            Bundle bundle = zza.zzd;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            while (it.hasNext()) {
                String str7 = (String) it.next();
                if (FirebaseAnalytics.Param.ITEMS.equals(str7)) {
                    zzt().zzH(bundle.getParcelableArray(str7), zzn2);
                }
            }
            zzbg zzb2 = zza.zzb();
            if (Log.isLoggable(zzaV().zzn(), 2)) {
                zzaV().zzk().zzb("Logging event", this.zzn.zzl().zzd(zzb2));
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str8 = zzb2.zza;
                boolean z = "ecommerce_purchase".equals(str8) || FirebaseAnalytics.Event.PURCHASE.equals(str8) || FirebaseAnalytics.Event.REFUND.equals(str8);
                if (!"_iap".equals(str8)) {
                    if (!z) {
                        str = "app_id";
                        str2 = "_fx";
                        zzbgVar2 = zzb2;
                        String str9 = zzbgVar2.zza;
                        boolean zzh2 = zzpp.zzh(str9);
                        boolean equals = "_err".equals(str9);
                        zzt();
                        zzbeVar = zzbgVar2.zzb;
                        if (zzbeVar != null) {
                            j = 0;
                        } else {
                            zzbd zzbdVar2 = new zzbd(zzbeVar);
                            j = 0;
                            while (zzbdVar2.hasNext()) {
                                if (zzbeVar.zza(zzbdVar2.next()) instanceof Parcelable[]) {
                                    j += ((Parcelable[]) r11).length;
                                }
                            }
                        }
                        String str10 = str5;
                        zzbg zzbgVar3 = zzbgVar2;
                        zzar zzx = zzj().zzx(zzC(), str10, j + 1, true, zzh2, false, equals, false, false, false);
                        long j4 = zzx.zzb;
                        zzd();
                        zzH = j4 - zzal.zzH();
                        if (zzH <= 0) {
                            if (zzH % 1000 == 1) {
                                zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgu.zzl(str10), Long.valueOf(zzx.zzb));
                            }
                            zzj().zzc();
                        } else {
                            if (zzh2) {
                                long j5 = zzx.zza;
                                zzd();
                                long intValue = j5 - ((Integer) zzfy.zzm.zzb(null)).intValue();
                                if (intValue > 0) {
                                    if (intValue % 1000 == 1) {
                                        zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgu.zzl(str10), Long.valueOf(zzx.zza));
                                    }
                                    zzt().zzN(this.zzK, str10, 16, "_ev", zzbgVar3.zza, 0);
                                    zzj().zzc();
                                }
                            }
                            if (equals) {
                                j2 = 1;
                                r5 = 0;
                                long max = zzx.zzd - Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfy.zzl)));
                                if (max > 0) {
                                    if (max == 1) {
                                        zzaV().zzb().zzc("Too many error events logged. appId, count", zzgu.zzl(str10), Long.valueOf(zzx.zzd));
                                    }
                                    zzj().zzc();
                                }
                            } else {
                                j2 = 1;
                                r5 = 0;
                            }
                            Bundle zzf = zzbeVar.zzf();
                            zzpp zzt = zzt();
                            String str11 = zzbgVar3.zzc;
                            zzt.zzM(zzf, "_o", str11);
                            if (zzt().zzaa(str10, zzrVar.zzB)) {
                                zzpp zzt2 = zzt();
                                Long valueOf = Long.valueOf(j2);
                                zzt2.zzM(zzf, "_dbg", valueOf);
                                zzt().zzM(zzf, "_r", valueOf);
                            }
                            if ("_s".equals(str9) && (zzm = zzj().zzm(zzrVar.zza, "_sno")) != null) {
                                Object obj = zzm.zze;
                                if (obj instanceof Long) {
                                    zzt().zzM(zzf, "_sno", obj);
                                }
                            }
                            if (zzd().zzp(null, zzfy.zzaX) && Objects.equals(str11, "am") && Objects.equals(str9, "_ai")) {
                                Object obj2 = zzf.get("value");
                                if (obj2 instanceof String) {
                                    try {
                                        double parseDouble = Double.parseDouble((String) obj2);
                                        zzf.remove("value");
                                        zzf.putDouble("value", parseDouble);
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                            }
                            zzav zzj3 = zzj();
                            C0875q.d(str10);
                            zzj3.zzg();
                            zzj3.zzaw();
                            try {
                                j3 = zzj3.zze().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str10, String.valueOf(Math.max((int) r5, Math.min(1000000, zzj3.zzu.zzc().zzm(str10, zzfy.zzp))))});
                            } catch (SQLiteException e) {
                                zzj3.zzu.zzaV().zzb().zzc("Error deleting over the limit events. appId", zzgu.zzl(str10), e);
                                j3 = 0;
                            }
                            if (j3 > 0) {
                                zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgu.zzl(str10), Long.valueOf(j3));
                            }
                            zzic zzicVar2 = this.zzn;
                            zzbb zzbbVar2 = new zzbb(zzicVar2, zzbgVar3.zzc, str10, zzbgVar3.zza, zzbgVar3.zzd, 0L, zzf);
                            zzav zzj4 = zzj();
                            String str12 = zzbbVar2.zzb;
                            zzbc zzf2 = zzj4.zzf(str10, str12);
                            if (zzf2 != null) {
                                zzbb zza2 = zzbbVar2.zza(zzicVar2, zzf2.zzf);
                                zzbc zza3 = zzf2.zza(zza2.zzd);
                                zzbbVar = zza2;
                                zzbcVar = zza3;
                            } else if (zzj().zzS(str10) < zzd().zzh(str10) || !zzh2) {
                                zzbcVar = new zzbc(str10, str12, 0L, 0L, 0L, zzbbVar2.zzd, 0L, null, null, null, null);
                                zzbbVar = zzbbVar2;
                            } else {
                                zzaV().zzb().zzd("Too many event names used, ignoring event. appId, name, supported count", zzgu.zzl(str10), zzicVar2.zzl().zza(str12), Integer.valueOf(zzd().zzh(str10)));
                                zzt().zzN(this.zzK, str10, 8, null, null, 0);
                            }
                            zzj().zzh(zzbcVar);
                            zzaW().zzg();
                            zzu();
                            String str13 = zzbbVar.zza;
                            C0875q.d(str13);
                            String str14 = zzrVar.zza;
                            C0875q.a(str13.equals(str14));
                            com.google.android.gms.internal.measurement.zzic zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                            zzaE.zza(1);
                            zzaE.zzC("android");
                            if (!TextUtils.isEmpty(str14)) {
                                zzaE.zzL(str14);
                            }
                            String str15 = zzrVar.zzd;
                            if (!TextUtils.isEmpty(str15)) {
                                zzaE.zzJ(str15);
                            }
                            String str16 = zzrVar.zzc;
                            if (!TextUtils.isEmpty(str16)) {
                                zzaE.zzM(str16);
                            }
                            String str17 = zzrVar.zzu;
                            if (!TextUtils.isEmpty(str17)) {
                                zzaE.zzau(str17);
                            }
                            long j6 = zzrVar.zzj;
                            if (j6 != SieveCacheKt.NodeMetaAndPreviousMask) {
                                zzaE.zzaj((int) j6);
                            }
                            zzaE.zzN(zzrVar.zze);
                            String str18 = zzrVar.zzb;
                            if (!TextUtils.isEmpty(str18)) {
                                zzaE.zzad(str18);
                            }
                            C0875q.g(str14);
                            zzjl zzs2 = zzB(str14).zzs(zzjl.zzf(zzrVar.zzs, 100));
                            zzaE.zzat(zzs2.zzk());
                            zzqp.zza();
                            if (zzd().zzp(str14, zzfy.zzaP) && zzt().zzX(str14)) {
                                zzaE.zzaH(zzrVar.zzz);
                                long j7 = zzrVar.zzA;
                                if (!zzs2.zzo(zzjk.AD_STORAGE) && j7 != 0) {
                                    j7 = (j7 & (-2)) | 32;
                                }
                                zzaE.zzaz(j7 == j2 ? true : r5);
                                if (j7 != 0) {
                                    com.google.android.gms.internal.measurement.zzhd zzh3 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                    zzh3.zza((j7 & j2) != 0 ? true : r5);
                                    zzh3.zzb((j7 & 2) != 0 ? true : r5);
                                    zzh3.zzc((j7 & 4) != 0 ? true : r5);
                                    zzh3.zzd((j7 & 8) != 0 ? true : r5);
                                    zzh3.zze((j7 & 16) != 0 ? true : r5);
                                    zzh3.zzf((32 & j7) != 0 ? true : r5);
                                    zzh3.zzg((j7 & 64) != 0 ? true : r5);
                                    zzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzh3.zzbc());
                                }
                            }
                            long j8 = zzrVar.zzf;
                            if (j8 != 0) {
                                zzaE.zzY(j8);
                            }
                            zzaE.zzar(zzrVar.zzq);
                            zzpk zzp = zzp();
                            com.google.android.gms.internal.measurement.zzjr zza4 = com.google.android.gms.internal.measurement.zzjr.zza(zzp.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement"), zzfu.zza);
                            Map zzb3 = zza4 == null ? Collections.EMPTY_MAP : zza4.zzb();
                            try {
                                if (zzb3 != null && !zzb3.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue2 = ((Integer) zzfy.zzaf.zzb(null)).intValue();
                                    for (Map.Entry entry : zzb3.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue2) {
                                                        zzp.zzu.zzaV().zze().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e2) {
                                                zzp.zzu.zzaV().zze().zzb("Experiment ID NumberFormatException", e2);
                                            }
                                        }
                                    }
                                    if (arrayList.isEmpty()) {
                                    }
                                    if (arrayList != null) {
                                        zzaE.zzaq(arrayList);
                                    }
                                    if (zzd().zzp(null, zzfy.zzba)) {
                                        zzaE.zzaP("");
                                    }
                                    str3 = zzrVar.zza;
                                    C0875q.g(str3);
                                    zzs = zzB(str3).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                    zzjkVar = zzjk.AD_STORAGE;
                                    if (zzs.zzo(zzjkVar) && zzrVar.zzn) {
                                        zzc = this.zzk.zzc(str3, zzs);
                                        if (!TextUtils.isEmpty((CharSequence) zzc.first)) {
                                            zzaE.zzQ((String) zzc.first);
                                            Object obj3 = zzc.second;
                                            if (obj3 != null) {
                                                zzaE.zzT(((Boolean) obj3).booleanValue());
                                            }
                                            String str19 = str2;
                                            if (!zzbbVar.zzb.equals(str19) && !((String) zzc.first).equals("00000000-0000-0000-0000-000000000000") && (zzu2 = zzj().zzu(str3)) != null && zzu2.zzaq()) {
                                                zzR(str3, r5, null, null);
                                                Bundle bundle2 = new Bundle();
                                                Long zzas = zzu2.zzas();
                                                if (zzas != null) {
                                                    str4 = "raw_events";
                                                    long longValue2 = zzas.longValue();
                                                    zzjkVar2 = zzjkVar;
                                                    bundle2.putLong("_pfo", Math.max(0L, longValue2));
                                                } else {
                                                    str4 = "raw_events";
                                                    zzjkVar2 = zzjkVar;
                                                }
                                                Long zzau = zzu2.zzau();
                                                if (zzau != null) {
                                                    bundle2.putLong("_uwa", zzau.longValue());
                                                }
                                                bundle2.putLong("_r", j2);
                                                this.zzK.zza(str3, str19, bundle2);
                                                zzicVar = this.zzn;
                                                zzicVar.zzu().zzw();
                                                zzaE.zzF(Build.MODEL);
                                                zzicVar.zzu().zzw();
                                                zzaE.zzE(Build.VERSION.RELEASE);
                                                zzaE.zzI((int) zzicVar.zzu().zzb());
                                                zzaE.zzH(zzicVar.zzu().zzc());
                                                zzaE.zzay(zzrVar.zzw);
                                                if (zzicVar.zzB()) {
                                                    zzaE.zzK();
                                                    if (!TextUtils.isEmpty(null)) {
                                                        zzaE.zzam(null);
                                                    }
                                                }
                                                zzu = zzj().zzu(str3);
                                                if (zzu == null) {
                                                    zzu = new zzh(zzicVar, str3);
                                                    zzu.zze(zzK(zzs));
                                                    zzu.zzm(zzrVar.zzk);
                                                    zzu.zzg(zzrVar.zzb);
                                                    if (zzs.zzo(zzjkVar2)) {
                                                        zzu.zzk(this.zzk.zzf(str3, zzrVar.zzn));
                                                    }
                                                    zzu.zzF(0L);
                                                    zzu.zzo(0L);
                                                    zzu.zzq(0L);
                                                    zzu.zzs(zzrVar.zzc);
                                                    zzu.zzu(zzrVar.zzj);
                                                    zzu.zzw(zzrVar.zzd);
                                                    zzu.zzy(zzrVar.zze);
                                                    zzu.zzA(zzrVar.zzf);
                                                    zzu.zzE(zzrVar.zzh);
                                                    zzu.zzC(zzrVar.zzq);
                                                    i = 0;
                                                    zzj().zzv(zzu, false, false);
                                                } else {
                                                    i = 0;
                                                }
                                                if (zzs.zzo(zzjk.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzu.zzd())) {
                                                    String zzd = zzu.zzd();
                                                    C0875q.g(zzd);
                                                    zzaE.zzW(zzd);
                                                }
                                                if (!TextUtils.isEmpty(zzu.zzl())) {
                                                    String zzl = zzu.zzl();
                                                    C0875q.g(zzl);
                                                    zzaE.zzah(zzl);
                                                }
                                                zzn = zzj().zzn(str3);
                                                for (i2 = i; i2 < zzn.size(); i2++) {
                                                    com.google.android.gms.internal.measurement.zzit zzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
                                                    zzm2.zzb(((zzpn) zzn.get(i2)).zzc);
                                                    zzm2.zza(((zzpn) zzn.get(i2)).zzd);
                                                    zzp().zzc(zzm2, ((zzpn) zzn.get(i2)).zze);
                                                    zzaE.zzp(zzm2);
                                                    if ("_sid".equals(((zzpn) zzn.get(i2)).zzc) && zzu.zzam() != 0 && zzp().zzu(zzrVar.zzu) != zzu.zzam()) {
                                                        zzaE.zzav();
                                                    }
                                                }
                                                zzj = zzj();
                                                zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE.zzbc();
                                                zzj.zzg();
                                                zzj.zzaw();
                                                C0875q.g(zzidVar);
                                                C0875q.d(zzidVar.zzA());
                                                byte[] zzcc = zzidVar.zzcc();
                                                long zzt3 = zzj.zzg.zzp().zzt(zzcc);
                                                ContentValues contentValues2 = new ContentValues();
                                                String str20 = str;
                                                contentValues2.put(str20, zzidVar.zzA());
                                                contentValues2.put("metadata_fingerprint", Long.valueOf(zzt3));
                                                contentValues2.put("metadata", zzcc);
                                                zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                                zzj2 = zzj();
                                                zzbdVar = new zzbd(zzbbVar.zzf);
                                                while (true) {
                                                    if (zzbdVar.hasNext()) {
                                                        if ("_r".equals(zzbdVar.next())) {
                                                            break;
                                                        }
                                                    } else {
                                                        zzht zzh4 = zzh();
                                                        String str21 = zzbbVar.zza;
                                                        boolean zzk = zzh4.zzk(str21, zzbbVar.zzb);
                                                        zzar zzw = zzj().zzw(zzC(), str21, false, false, false, false, false, false, false);
                                                        if (!zzk || zzw.zze >= zzd().zzm(str21, zzfy.zzo)) {
                                                            i3 = i;
                                                        }
                                                    }
                                                }
                                                i3 = 1;
                                                zzj2.zzg();
                                                zzj2.zzaw();
                                                String str22 = zzbbVar.zza;
                                                C0875q.d(str22);
                                                byte[] zzcc2 = zzj2.zzg.zzp().zzh(zzbbVar).zzcc();
                                                contentValues = new ContentValues();
                                                contentValues.put(str20, str22);
                                                contentValues.put("name", zzbbVar.zzb);
                                                contentValues.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, Long.valueOf(zzbbVar.zzd));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(zzt3));
                                                contentValues.put("data", zzcc2);
                                                contentValues.put("realtime", Integer.valueOf(i3));
                                                if (zzj2.zze().insert(str4, null, contentValues) == -1) {
                                                    zzj2.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgu.zzl(str22));
                                                } else {
                                                    this.zza = 0L;
                                                }
                                                zzj().zzc();
                                                zzj().zzd();
                                                zzaL();
                                                zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                                return;
                                            }
                                        }
                                    }
                                    str4 = "raw_events";
                                    zzjkVar2 = zzjkVar;
                                    zzicVar = this.zzn;
                                    zzicVar.zzu().zzw();
                                    zzaE.zzF(Build.MODEL);
                                    zzicVar.zzu().zzw();
                                    zzaE.zzE(Build.VERSION.RELEASE);
                                    zzaE.zzI((int) zzicVar.zzu().zzb());
                                    zzaE.zzH(zzicVar.zzu().zzc());
                                    zzaE.zzay(zzrVar.zzw);
                                    if (zzicVar.zzB()) {
                                    }
                                    zzu = zzj().zzu(str3);
                                    if (zzu == null) {
                                    }
                                    if (zzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                                        String zzd2 = zzu.zzd();
                                        C0875q.g(zzd2);
                                        zzaE.zzW(zzd2);
                                    }
                                    if (!TextUtils.isEmpty(zzu.zzl())) {
                                    }
                                    zzn = zzj().zzn(str3);
                                    while (i2 < zzn.size()) {
                                    }
                                    zzj = zzj();
                                    zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE.zzbc();
                                    zzj.zzg();
                                    zzj.zzaw();
                                    C0875q.g(zzidVar);
                                    C0875q.d(zzidVar.zzA());
                                    byte[] zzcc3 = zzidVar.zzcc();
                                    long zzt32 = zzj.zzg.zzp().zzt(zzcc3);
                                    ContentValues contentValues22 = new ContentValues();
                                    String str202 = str;
                                    contentValues22.put(str202, zzidVar.zzA());
                                    contentValues22.put("metadata_fingerprint", Long.valueOf(zzt32));
                                    contentValues22.put("metadata", zzcc3);
                                    zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    zzj2 = zzj();
                                    zzbdVar = new zzbd(zzbbVar.zzf);
                                    while (true) {
                                        if (zzbdVar.hasNext()) {
                                        }
                                    }
                                    i3 = 1;
                                    zzj2.zzg();
                                    zzj2.zzaw();
                                    String str222 = zzbbVar.zza;
                                    C0875q.d(str222);
                                    byte[] zzcc22 = zzj2.zzg.zzp().zzh(zzbbVar).zzcc();
                                    contentValues = new ContentValues();
                                    contentValues.put(str202, str222);
                                    contentValues.put("name", zzbbVar.zzb);
                                    contentValues.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, Long.valueOf(zzbbVar.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzt32));
                                    contentValues.put("data", zzcc22);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (zzj2.zze().insert(str4, null, contentValues) == -1) {
                                    }
                                    zzj().zzc();
                                    zzj().zzd();
                                    zzaL();
                                    zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                    return;
                                }
                                zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                zzj2 = zzj();
                                zzbdVar = new zzbd(zzbbVar.zzf);
                                while (true) {
                                    if (zzbdVar.hasNext()) {
                                    }
                                }
                                i3 = 1;
                                zzj2.zzg();
                                zzj2.zzaw();
                                String str2222 = zzbbVar.zza;
                                C0875q.d(str2222);
                                byte[] zzcc222 = zzj2.zzg.zzp().zzh(zzbbVar).zzcc();
                                contentValues = new ContentValues();
                                contentValues.put(str202, str2222);
                                contentValues.put("name", zzbbVar.zzb);
                                contentValues.put(io.flutter.plugins.firebase.crashlytics.Constants.TIMESTAMP, Long.valueOf(zzbbVar.zzd));
                                contentValues.put("metadata_fingerprint", Long.valueOf(zzt32));
                                contentValues.put("data", zzcc222);
                                contentValues.put("realtime", Integer.valueOf(i3));
                                if (zzj2.zze().insert(str4, null, contentValues) == -1) {
                                }
                                zzj().zzc();
                                zzj().zzd();
                                zzaL();
                                zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                return;
                            } catch (SQLiteException e3) {
                                zzj.zzu.zzaV().zzb().zzc("Error storing raw event metadata. appId", zzgu.zzl(zzidVar.zzA()), e3);
                                throw e3;
                            }
                            arrayList = null;
                            if (arrayList != null) {
                            }
                            if (zzd().zzp(null, zzfy.zzba)) {
                            }
                            str3 = zzrVar.zza;
                            C0875q.g(str3);
                            zzs = zzB(str3).zzs(zzjl.zzf(zzrVar.zzs, 100));
                            zzjkVar = zzjk.AD_STORAGE;
                            if (zzs.zzo(zzjkVar)) {
                                zzc = this.zzk.zzc(str3, zzs);
                                if (!TextUtils.isEmpty((CharSequence) zzc.first)) {
                                }
                            }
                            str4 = "raw_events";
                            zzjkVar2 = zzjkVar;
                            zzicVar = this.zzn;
                            zzicVar.zzu().zzw();
                            zzaE.zzF(Build.MODEL);
                            zzicVar.zzu().zzw();
                            zzaE.zzE(Build.VERSION.RELEASE);
                            zzaE.zzI((int) zzicVar.zzu().zzb());
                            zzaE.zzH(zzicVar.zzu().zzc());
                            zzaE.zzay(zzrVar.zzw);
                            if (zzicVar.zzB()) {
                            }
                            zzu = zzj().zzu(str3);
                            if (zzu == null) {
                            }
                            if (zzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                            }
                            if (!TextUtils.isEmpty(zzu.zzl())) {
                            }
                            zzn = zzj().zzn(str3);
                            while (i2 < zzn.size()) {
                            }
                            zzj = zzj();
                            zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE.zzbc();
                            zzj.zzg();
                            zzj.zzaw();
                            C0875q.g(zzidVar);
                            C0875q.d(zzidVar.zzA());
                            byte[] zzcc32 = zzidVar.zzcc();
                            long zzt322 = zzj.zzg.zzp().zzt(zzcc32);
                            ContentValues contentValues222 = new ContentValues();
                            String str2022 = str;
                            contentValues222.put(str2022, zzidVar.zzA());
                            contentValues222.put("metadata_fingerprint", Long.valueOf(zzt322));
                            contentValues222.put("metadata", zzcc32);
                        }
                        zzj().zzd();
                    }
                    z = true;
                }
                zzbe zzbeVar2 = zzb2.zzb;
                String zzd3 = zzbeVar2.zzd(FirebaseAnalytics.Param.CURRENCY);
                if (z) {
                    double doubleValue = zzbeVar2.zzc("value").doubleValue() * 1000000.0d;
                    if (doubleValue == 0.0d) {
                        str = "app_id";
                        str2 = "_fx";
                        doubleValue = zzbeVar2.zzb("value").longValue() * 1000000.0d;
                    } else {
                        str = "app_id";
                        str2 = "_fx";
                    }
                    if (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d) {
                        zzaV().zze().zzc("Data lost. Currency value is too big. appId", zzgu.zzl(str5), Double.valueOf(doubleValue));
                        zzj().zzc();
                        zzj().zzd();
                    } else {
                        longValue = Math.round(doubleValue);
                        if (FirebaseAnalytics.Event.REFUND.equals(str8)) {
                            longValue = -longValue;
                        }
                    }
                } else {
                    str = "app_id";
                    str2 = "_fx";
                    longValue = zzbeVar2.zzb("value").longValue();
                }
                if (!TextUtils.isEmpty(zzd3)) {
                    String upperCase = zzd3.toUpperCase(Locale.US);
                    if (upperCase.matches("[A-Z]{3}")) {
                        String concat = "_ltv_".concat(upperCase);
                        zzpn zzm3 = zzj().zzm(str5, concat);
                        if (zzm3 != null) {
                            Object obj4 = zzm3.zze;
                            if (obj4 instanceof Long) {
                                zzbgVar2 = zzb2;
                                zzpnVar = new zzpn(str5, zzb2.zzc, concat, zzaZ().currentTimeMillis(), Long.valueOf(((Long) obj4).longValue() + longValue));
                                str5 = str5;
                                zzpnVar2 = zzpnVar;
                                if (!zzj().zzl(zzpnVar2)) {
                                    zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgu.zzl(str5), this.zzn.zzl().zzc(zzpnVar2.zzc), zzpnVar2.zze);
                                    zzt().zzN(this.zzK, str5, 9, null, null, 0);
                                }
                                String str92 = zzbgVar2.zza;
                                boolean zzh22 = zzpp.zzh(str92);
                                boolean equals2 = "_err".equals(str92);
                                zzt();
                                zzbeVar = zzbgVar2.zzb;
                                if (zzbeVar != null) {
                                }
                                String str102 = str5;
                                zzbg zzbgVar32 = zzbgVar2;
                                zzar zzx2 = zzj().zzx(zzC(), str102, j + 1, true, zzh22, false, equals2, false, false, false);
                                long j42 = zzx2.zzb;
                                zzd();
                                zzH = j42 - zzal.zzH();
                                if (zzH <= 0) {
                                }
                                zzj().zzd();
                            }
                        }
                        zzav zzj5 = zzj();
                        int zzm4 = zzd().zzm(str5, zzfy.zzT) - 1;
                        C0875q.d(str5);
                        zzj5.zzg();
                        zzj5.zzaw();
                        zzj5.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str5, str5, String.valueOf(zzm4)});
                        zzbgVar2 = zzb2;
                        zzpnVar = new zzpn(str5, zzb2.zzc, concat, zzaZ().currentTimeMillis(), Long.valueOf(longValue));
                        str5 = str5;
                        zzpnVar2 = zzpnVar;
                        if (!zzj().zzl(zzpnVar2)) {
                        }
                        String str922 = zzbgVar2.zza;
                        boolean zzh222 = zzpp.zzh(str922);
                        boolean equals22 = "_err".equals(str922);
                        zzt();
                        zzbeVar = zzbgVar2.zzb;
                        if (zzbeVar != null) {
                        }
                        String str1022 = str5;
                        zzbg zzbgVar322 = zzbgVar2;
                        zzar zzx22 = zzj().zzx(zzC(), str1022, j + 1, true, zzh222, false, equals22, false, false, false);
                        long j422 = zzx22.zzb;
                        zzd();
                        zzH = j422 - zzal.zzH();
                        if (zzH <= 0) {
                        }
                        zzj().zzd();
                    }
                }
                zzbgVar2 = zzb2;
                String str9222 = zzbgVar2.zza;
                boolean zzh2222 = zzpp.zzh(str9222);
                boolean equals222 = "_err".equals(str9222);
                zzt();
                zzbeVar = zzbgVar2.zzb;
                if (zzbeVar != null) {
                }
                String str10222 = str5;
                zzbg zzbgVar3222 = zzbgVar2;
                zzar zzx222 = zzj().zzx(zzC(), str10222, j + 1, true, zzh2222, false, equals222, false, false, false);
                long j4222 = zzx222.zzb;
                zzd();
                zzH = j4222 - zzal.zzH();
                if (zzH <= 0) {
                }
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        com.google.android.gms.internal.measurement.zziu zziuVar;
        zzaW().zzg();
        zzu();
        zzan zzd = zzan.zzd(zzicVar.zzaA());
        String zzc = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzjl zzB = zzB(zzc);
        zzji zzjiVar = zzji.UNINITIALIZED;
        int ordinal = zzB.zzp().ordinal();
        if (ordinal == 1) {
            zzd.zzc(zzjk.AD_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal == 2 || ordinal == 3) {
            zzd.zzb(zzjk.AD_STORAGE, zzB.zzb());
        } else {
            zzd.zzc(zzjk.AD_STORAGE, zzam.FAILSAFE);
        }
        int ordinal2 = zzB.zzq().ordinal();
        if (ordinal2 == 1) {
            zzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.REMOTE_ENFORCED_DEFAULT);
        } else if (ordinal2 == 2 || ordinal2 == 3) {
            zzd.zzb(zzjk.ANALYTICS_STORAGE, zzB.zzb());
        } else {
            zzd.zzc(zzjk.ANALYTICS_STORAGE, zzam.FAILSAFE);
        }
        String zzc2 = zzhVar.zzc();
        zzaW().zzg();
        zzu();
        zzaz zzz = zzz(zzc2, zzx(zzc2), zzB(zzc2), zzd);
        Boolean zzj = zzz.zzj();
        C0875q.g(zzj);
        zzicVar.zzaD(zzj.booleanValue());
        if (!TextUtils.isEmpty(zzz.zzk())) {
            zzicVar.zzaF(zzz.zzk());
        }
        zzaW().zzg();
        zzu();
        Iterator it = zzicVar.zzk().iterator();
        while (true) {
            if (it.hasNext()) {
                zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                if ("_npa".equals(zziuVar.zzc())) {
                    break;
                }
            } else {
                zziuVar = null;
                break;
            }
        }
        if (zziuVar != null) {
            zzjk zzjkVar = zzjk.AD_PERSONALIZATION;
            if (zzd.zza(zzjkVar) == zzam.UNSET) {
                zzpn zzm = zzj().zzm(zzhVar.zzc(), "_npa");
                if (zzm != null) {
                    String str = zzm.zzb;
                    if ("tcf".equals(str)) {
                        zzd.zzc(zzjkVar, zzam.TCF);
                    } else if ("app".equals(str)) {
                        zzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                } else {
                    Boolean zzae = zzhVar.zzae();
                    if (zzae == null || ((zzae.booleanValue() && zziuVar.zzg() != 1) || !(zzae.booleanValue() || zziuVar.zzg() == 0))) {
                        zzd.zzc(zzjkVar, zzam.API);
                    } else {
                        zzd.zzc(zzjkVar, zzam.MANIFEST);
                    }
                }
            }
        } else {
            int zzaC = zzaC(zzhVar.zzc(), zzd);
            com.google.android.gms.internal.measurement.zzit zzm2 = com.google.android.gms.internal.measurement.zziu.zzm();
            zzm2.zzb("_npa");
            zzm2.zza(zzaZ().currentTimeMillis());
            zzm2.zze(zzaC);
            zzicVar.zzo((com.google.android.gms.internal.measurement.zziu) zzm2.zzbc());
            zzaV().zzk().zzc("Setting user property", "non_personalized_ads(_npa)", Integer.valueOf(zzaC));
        }
        zzicVar.zzaB(zzd.toString());
        boolean zzy = this.zzc.zzy(zzhVar.zzc());
        List zzb2 = zzicVar.zzb();
        int i = 0;
        for (int i2 = 0; i2 < zzb2.size(); i2++) {
            if ("_tcf".equals(((com.google.android.gms.internal.measurement.zzhs) zzb2.get(i2)).zzd())) {
                com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) zzb2.get(i2)).zzcl();
                List zza = zzhrVar.zza();
                int i3 = 0;
                while (true) {
                    if (i3 >= zza.size()) {
                        break;
                    }
                    if ("_tcfd".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i3)).zzb())) {
                        String zzd2 = ((com.google.android.gms.internal.measurement.zzhw) zza.get(i3)).zzd();
                        if (zzy && zzd2.length() > 4) {
                            char[] charArray = zzd2.toCharArray();
                            int i4 = 1;
                            while (true) {
                                if (i4 >= 64) {
                                    break;
                                }
                                if (charArray[4] == "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i4)) {
                                    i = i4;
                                    break;
                                }
                                i4++;
                            }
                            charArray[4] = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i | 1);
                            zzd2 = String.valueOf(charArray);
                        }
                        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                        zzn.zzb("_tcfd");
                        zzn.zzd(zzd2);
                        zzhrVar.zze(i3, zzn);
                    } else {
                        i3++;
                    }
                }
                zzicVar.zzf(i2, zzhrVar);
                return;
            }
        }
    }

    @WorkerThread
    public final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
        zzaW().zzg();
        zzu();
        com.google.android.gms.internal.measurement.zzgx zzr = com.google.android.gms.internal.measurement.zzha.zzr();
        byte[] zzaJ = zzhVar.zzaJ();
        if (zzaJ != null) {
            try {
                zzr = (com.google.android.gms.internal.measurement.zzgx) zzpk.zzw(zzr, zzaJ);
            } catch (com.google.android.gms.internal.measurement.zzmr unused) {
                zzaV().zze().zzb("Failed to parse locally stored ad campaign info. appId", zzgu.zzl(zzhVar.zzc()));
            }
        }
        for (com.google.android.gms.internal.measurement.zzhs zzhsVar : zzicVar.zzb()) {
            if (zzhsVar.zzd().equals(Constants.ScionAnalytics.EVENT_FIREBASE_CAMPAIGN)) {
                String str = (String) zzpk.zzJ(zzhsVar, "gclid", "");
                String str2 = (String) zzpk.zzJ(zzhsVar, "gbraid", "");
                String str3 = (String) zzpk.zzJ(zzhsVar, "gad_source", "");
                String[] split = ((String) zzfy.zzbg.zzb(null)).split(",");
                zzp();
                if (!zzpk.zzG(zzhsVar, split).isEmpty()) {
                    long longValue = ((Long) zzpk.zzJ(zzhsVar, "click_timestamp", 0L)).longValue();
                    if (longValue <= 0) {
                        longValue = zzhsVar.zzf();
                    }
                    if ("referrer API v2".equals(zzpk.zzI(zzhsVar, "_cis"))) {
                        if (longValue > zzr.zzo()) {
                            if (str.isEmpty()) {
                                zzr.zzj();
                            } else {
                                zzr.zzi(str);
                            }
                            if (str2.isEmpty()) {
                                zzr.zzl();
                            } else {
                                zzr.zzk(str2);
                            }
                            if (str3.isEmpty()) {
                                zzr.zzn();
                            } else {
                                zzr.zzm(str3);
                            }
                            zzr.zzp(longValue);
                            zzr.zzs();
                            zzr.zzt(zzaD(zzhsVar));
                        }
                    } else if (longValue > zzr.zzg()) {
                        if (str.isEmpty()) {
                            zzr.zzb();
                        } else {
                            zzr.zza(str);
                        }
                        if (str2.isEmpty()) {
                            zzr.zzd();
                        } else {
                            zzr.zzc(str2);
                        }
                        if (str3.isEmpty()) {
                            zzr.zzf();
                        } else {
                            zzr.zze(str3);
                        }
                        zzr.zzh(longValue);
                        zzr.zzq();
                        zzr.zzr(zzaD(zzhsVar));
                    }
                }
            }
        }
        if (!((com.google.android.gms.internal.measurement.zzha) zzr.zzbc()).equals(com.google.android.gms.internal.measurement.zzha.zzs())) {
            zzicVar.zzaM((com.google.android.gms.internal.measurement.zzha) zzr.zzbc());
        }
        zzhVar.zzaI(((com.google.android.gms.internal.measurement.zzha) zzr.zzbc()).zzcc());
        if (zzhVar.zza()) {
            zzj().zzv(zzhVar, false, false);
        }
        if (zzd().zzp(null, zzfy.zzbf)) {
            zzj().zzk(zzhVar.zzc(), "_lgclid");
        }
    }

    @WorkerThread
    public final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    @VisibleForTesting
    public final void zzL(List list) {
        C0875q.a(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0124, code lost:
    
        if (r7 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0194, code lost:
    
        if (r1 == 0) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    /* JADX WARN: Type inference failed for: r1v12, types: [long] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v22, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v25, types: [android.database.Cursor] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzM() {
        zzav zzj;
        long zzF;
        SQLiteException e;
        zzh zzu;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean zzJ = zzicVar.zzt().zzJ();
            if (zzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (zzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else {
                zzaW().zzg();
                if (this.zzz != null) {
                    zzaV().zzk().zza("Uploading requested multiple times");
                } else if (zzi().zzb()) {
                    ?? currentTimeMillis = zzaZ().currentTimeMillis();
                    Cursor cursor = null;
                    r7 = null;
                    Cursor cursor2 = null;
                    r7 = null;
                    r7 = null;
                    String str = null;
                    int zzm = zzd().zzm(null, zzfy.zzai);
                    zzd();
                    long zzF2 = currentTimeMillis - zzal.zzF();
                    for (int i = 0; i < zzm && zzaG(null, zzF2); i++) {
                    }
                    zzqp.zza();
                    zzaW().zzg();
                    zzav();
                    long zza = this.zzk.zzd.zza();
                    if (zza != 0) {
                        zzaV().zzj().zzb("Uploading events. Elapsed time since last upload attempt (ms)", Long.valueOf(Math.abs(currentTimeMillis - zza)));
                    }
                    String zzF3 = zzj().zzF();
                    long j = -1;
                    if (TextUtils.isEmpty(zzF3)) {
                        try {
                            this.zzB = -1L;
                            zzj = zzj();
                            zzd();
                            zzF = currentTimeMillis - zzal.zzF();
                            zzj.zzg();
                            zzj.zzaw();
                        } catch (Throwable th) {
                            th = th;
                            cursor = currentTimeMillis;
                        }
                        try {
                            currentTimeMillis = zzj.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzF)});
                            try {
                                if (currentTimeMillis.moveToFirst()) {
                                    str = currentTimeMillis.getString(0);
                                } else {
                                    zzj.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzj.zzu.zzaV().zzb().zzb("Error selecting expired configs", e);
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            currentTimeMillis = 0;
                        } catch (Throwable th2) {
                            th = th2;
                            throw th;
                        }
                        currentTimeMillis.close();
                        if (!TextUtils.isEmpty(str) && (zzu = zzj().zzu(str)) != null) {
                            zzW(zzu);
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzav zzj2 = zzj();
                            try {
                                try {
                                    cursor2 = zzj2.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor2.moveToFirst()) {
                                        j = cursor2.getLong(0);
                                    }
                                } finally {
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                }
                            } catch (SQLiteException e4) {
                                zzj2.zzu.zzaV().zzb().zzb("Error querying raw events", e4);
                            }
                            cursor2.close();
                            this.zzB = j;
                        }
                        zzN(zzF3, currentTimeMillis);
                    }
                } else {
                    zzaV().zzk().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th3) {
            this.zzw = false;
            zzaM();
            throw th3;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:266:0x0484, code lost:
    
        if (r23 != null) goto L177;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x022a, code lost:
    
        if (r10 != null) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:224:0x09b7  */
    /* JADX WARN: Removed duplicated region for block: B:229:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0492  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x055c  */
    /* JADX WARN: Removed duplicated region for block: B:337:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0a05  */
    /* JADX WARN: Type inference failed for: r10v53, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.google.android.gms.measurement.internal.zzpg] */
    @VisibleForTesting
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzN(String str, long j) {
        long j2;
        Cursor cursor;
        Cursor cursor2;
        List list;
        List<Pair> list2;
        List list3;
        boolean z;
        String str2;
        String str3;
        zzot zzotVar;
        boolean z2;
        List list4;
        boolean z3;
        int i;
        String str4;
        List list5;
        List list6;
        Cursor cursor3;
        Cursor cursor4;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it;
        ArrayList arrayList3;
        int i2;
        int i3;
        SQLiteDatabase zze;
        long currentTimeMillis;
        Cursor query;
        Cursor cursor5;
        byte[] blob;
        zzpk zzp;
        com.google.android.gms.internal.measurement.zzid zzidVar;
        long j3;
        long j4;
        long j5;
        int zzm = zzd().zzm(str, zzfy.zzg);
        int i4 = 0;
        int max = Math.max(0, zzd().zzm(str, zzfy.zzh));
        zzav zzj = zzj();
        zzj.zzg();
        zzj.zzaw();
        int i5 = 1;
        C0875q.a(zzm > 0);
        C0875q.a(max > 0);
        C0875q.d(str);
        try {
            try {
                j2 = -1;
                try {
                    cursor2 = zzj.zze().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(zzm));
                    try {
                    } catch (SQLiteException e) {
                        e = e;
                        cursor5 = cursor2;
                    } catch (Throwable th) {
                        th = th;
                        cursor5 = cursor2;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    cursor2 = null;
                    try {
                        zzj.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str), e);
                        list = Collections.EMPTY_LIST;
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursor2;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                cursor = null;
            }
        } catch (SQLiteException e3) {
            e = e3;
            j2 = -1;
        }
        if (cursor2.moveToFirst()) {
            ArrayList arrayList4 = new ArrayList();
            int i6 = 0;
            while (true) {
                long j6 = cursor2.getLong(i4);
                try {
                    blob = cursor2.getBlob(i5);
                    zzp = zzj.zzg.zzp();
                } catch (IOException e4) {
                    e = e4;
                    cursor5 = cursor2;
                }
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(blob);
                    GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int read = gZIPInputStream.read(bArr);
                        if (read <= 0) {
                            break;
                        }
                        cursor5 = cursor2;
                        try {
                            try {
                                byteArrayOutputStream.write(bArr, 0, read);
                                cursor2 = cursor5;
                            } catch (IOException e5) {
                                e = e5;
                                try {
                                    zzp.zzu.zzaV().zzb().zzb("Failed to ungzip content", e);
                                    throw e;
                                } catch (IOException e6) {
                                    e = e6;
                                    zzj.zzu.zzaV().zzb().zzc("Failed to unzip queued bundle. appId", zzgu.zzl(str), e);
                                    if (cursor5.moveToNext()) {
                                        break;
                                    }
                                    cursor2 = cursor5;
                                    i4 = 0;
                                    i5 = 1;
                                    cursor5.close();
                                    list2 = arrayList4;
                                    if (list2.isEmpty()) {
                                    }
                                }
                            }
                        } catch (SQLiteException e7) {
                            e = e7;
                            cursor2 = cursor5;
                            zzj.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str), e);
                            list = Collections.EMPTY_LIST;
                        } catch (Throwable th4) {
                            th = th4;
                            cursor = cursor5;
                            if (cursor != null) {
                            }
                            throw th;
                        }
                    }
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (!arrayList4.isEmpty() && byteArray.length + i6 > max) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), byteArray);
                        if (!arrayList4.isEmpty()) {
                            com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) ((Pair) arrayList4.get(0)).first;
                            com.google.android.gms.internal.measurement.zzid zzidVar3 = (com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc();
                            if (!zzidVar2.zzaf().equals(zzidVar3.zzaf()) || !zzidVar2.zzam().equals(zzidVar3.zzam()) || zzidVar2.zzao() != zzidVar3.zzao() || !zzidVar2.zzaq().equals(zzidVar3.zzaq())) {
                                break;
                            }
                            Iterator it2 = zzidVar2.zzf().iterator();
                            while (true) {
                                Iterator it3 = it2;
                                if (!it2.hasNext()) {
                                    zzidVar = zzidVar3;
                                    j3 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it3.next();
                                zzidVar = zzidVar3;
                                if ("_npa".equals(zziuVar.zzc())) {
                                    j3 = zziuVar.zzg();
                                    break;
                                } else {
                                    it2 = it3;
                                    zzidVar3 = zzidVar;
                                }
                            }
                            Iterator it4 = zzidVar.zzf().iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    j4 = j3;
                                    j5 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it4.next();
                                j4 = j3;
                                if ("_npa".equals(zziuVar2.zzc())) {
                                    j5 = zziuVar2.zzg();
                                    break;
                                }
                                j3 = j4;
                            }
                            if (j4 != j5) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            zzicVar.zzao(cursor2.getInt(2));
                        }
                        i6 += byteArray.length;
                        arrayList4.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc(), Long.valueOf(j6)));
                    } catch (IOException e8) {
                        zzj.zzu.zzaV().zzb().zzc("Failed to merge queued bundle. appId", zzgu.zzl(str), e8);
                    }
                    cursor5 = cursor2;
                    if (cursor5.moveToNext() || i6 > max) {
                        break;
                        break;
                    } else {
                        cursor2 = cursor5;
                        i4 = 0;
                        i5 = 1;
                    }
                } catch (IOException e9) {
                    e = e9;
                    cursor5 = cursor2;
                }
            }
            cursor5 = cursor2;
            cursor5.close();
            list2 = arrayList4;
            if (list2.isEmpty()) {
            }
        } else {
            list = Collections.EMPTY_LIST;
            cursor2.close();
            list2 = list;
            if (list2.isEmpty()) {
                return;
            }
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzal zzd = zzd();
            zzfx zzfxVar = zzfy.zzbh;
            if (zzd.zzp(null, zzfxVar)) {
                com.google.android.gms.internal.measurement.zzpo.zza();
                if (!zzd().zzp(null, zzfxVar)) {
                    list5 = list2;
                } else if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE) || !zzh().zzB(str)) {
                    ArrayList arrayList5 = new ArrayList(list2.size());
                    zzav zzj2 = zzj();
                    C0875q.d(str);
                    zzj2.zzg();
                    zzj2.zzaw();
                    ArrayList arrayList6 = new ArrayList();
                    try {
                        try {
                            zze = zzj2.zze();
                            currentTimeMillis = zzj2.zzu.zzaZ().currentTimeMillis();
                            query = zze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                            list6 = list2;
                        } catch (Throwable th5) {
                            th = th5;
                            cursor3 = null;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                        try {
                        } catch (SQLiteException e10) {
                            e = e10;
                            cursor4 = query;
                        } catch (Throwable th6) {
                            th = th6;
                            cursor4 = query;
                            cursor3 = cursor4;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } catch (SQLiteException e11) {
                        e = e11;
                        list6 = list2;
                    }
                    if (query.moveToFirst()) {
                        while (true) {
                            try {
                                arrayList6.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), query.getBlob(0))).zzbc());
                                cursor4 = query;
                            } catch (com.google.android.gms.internal.measurement.zzmr e12) {
                                cursor4 = query;
                                try {
                                    try {
                                        zzj2.zzu.zzaV().zzh().zzc("Failed to parse stored NO_DATA mode event, appId", zzgu.zzl(str), e12);
                                    } catch (SQLiteException e13) {
                                        e = e13;
                                        zzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                                        ?? r10 = Collections.EMPTY_LIST;
                                        arrayList2 = r10;
                                        arrayList = r10;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    cursor3 = cursor4;
                                    if (cursor3 != null) {
                                    }
                                    throw th;
                                }
                            }
                            if (!cursor4.moveToNext()) {
                                break;
                            } else {
                                query = cursor4;
                            }
                        }
                        cursor4.close();
                        try {
                            int delete = zze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(currentTimeMillis)});
                            zzgs zzk = zzj2.zzu.zzaV().zzk();
                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                            sb.append("Pruned ");
                            sb.append(delete);
                            sb.append(" NO_DATA mode events. appId");
                            zzk.zzb(sb.toString(), str);
                            arrayList2 = arrayList6;
                        } catch (SQLiteException e14) {
                            e = e14;
                            cursor4 = null;
                            zzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                            ?? r102 = Collections.EMPTY_LIST;
                            arrayList2 = r102;
                            arrayList = r102;
                        }
                        it = list6.iterator();
                        boolean z4 = true;
                        ArrayList arrayList7 = arrayList2;
                        while (it.hasNext()) {
                            Pair pair = (Pair) it.next();
                            com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair.first).zzcl();
                            if (z4 && !arrayList7.isEmpty()) {
                                List zzb2 = zzicVar2.zzb();
                                zzicVar2.zzi();
                                zzicVar2.zzh(arrayList7);
                                zzicVar2.zzh(zzb2);
                                z4 = false;
                            }
                            com.google.android.gms.internal.measurement.zzhh zzb3 = com.google.android.gms.internal.measurement.zzho.zzb();
                            com.google.android.gms.internal.measurement.zzgf zzx = zzh().zzx(str);
                            ArrayList arrayList8 = new ArrayList();
                            if (zzx != null) {
                                arrayList7 = arrayList7;
                                for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzx.zza()) {
                                    com.google.android.gms.internal.measurement.zzhk zza = com.google.android.gms.internal.measurement.zzhl.zza();
                                    int zzb4 = zzfuVar.zzb();
                                    zzji zzjiVar = zzji.UNINITIALIZED;
                                    Iterator it5 = it;
                                    int i7 = zzb4 - 1;
                                    boolean z5 = z4;
                                    if (i7 == 1) {
                                        arrayList3 = arrayList7;
                                        i2 = 3;
                                        i3 = 2;
                                    } else if (i7 != 2) {
                                        arrayList3 = arrayList7;
                                        i2 = 3;
                                        i3 = i7 != 3 ? i7 != 4 ? 1 : 5 : 4;
                                    } else {
                                        arrayList3 = arrayList7;
                                        i2 = 3;
                                        i3 = 3;
                                    }
                                    zza.zza(i3);
                                    int zzd2 = zzfuVar.zzd() - 1;
                                    if (zzd2 == 1) {
                                        i2 = 2;
                                    } else if (zzd2 != 2) {
                                        i2 = 1;
                                    }
                                    zza.zzb(i2);
                                    arrayList8.add((com.google.android.gms.internal.measurement.zzhl) zza.zzbc());
                                    z4 = z5;
                                    it = it5;
                                    arrayList7 = arrayList3;
                                }
                            }
                            Iterator it6 = it;
                            boolean z6 = z4;
                            ArrayList arrayList9 = arrayList7;
                            zzb3.zza(arrayList8);
                            zzicVar2.zzaQ(zzb3);
                            arrayList5.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair.second));
                            z4 = z6;
                            it = it6;
                            arrayList7 = arrayList9;
                        }
                        list5 = arrayList5;
                    } else {
                        cursor4 = query;
                        arrayList = arrayList6;
                        cursor4.close();
                        arrayList2 = arrayList;
                        it = list6.iterator();
                        boolean z42 = true;
                        ArrayList arrayList72 = arrayList2;
                        while (it.hasNext()) {
                        }
                        list5 = arrayList5;
                    }
                } else {
                    List asList = Arrays.asList(((String) zzfy.zzbi.zzb(null)).split(","));
                    for (Pair pair2 : list2) {
                        try {
                            zzj().zzH(((Long) pair2.second).longValue());
                            for (com.google.android.gms.internal.measurement.zzhs zzhsVar : ((com.google.android.gms.internal.measurement.zzid) pair2.first).zzc()) {
                                if (asList.contains(zzhsVar.zzd())) {
                                    if (zzhsVar.zzd().equals("_f") || zzhsVar.zzd().equals("_v")) {
                                        com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzhsVar.zzcl();
                                        zzp();
                                        zzpk.zzC(zzhrVar, "_dac", 1L);
                                        zzhsVar = (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc();
                                    }
                                    zzav zzj3 = zzj();
                                    zzj3.zzg();
                                    zzj3.zzaw();
                                    C0875q.g(zzhsVar);
                                    C0875q.d(str);
                                    zzic zzicVar3 = zzj3.zzu;
                                    zzicVar3.zzaV().zzk().zzb("Caching events in NO_DATA mode", zzhsVar);
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("app_id", str);
                                    contentValues.put("name", zzhsVar.zzd());
                                    contentValues.put("data", zzhsVar.zzcc());
                                    contentValues.put("timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                    try {
                                        if (zzj3.zze().insert("no_data_mode_events", null, contentValues) == j2) {
                                            zzicVar3.zzaV().zzb().zzb("Failed to insert NO_DATA mode event (got -1). appId", zzgu.zzl(str));
                                        }
                                    } catch (SQLiteException e15) {
                                        zzj3.zzu.zzaV().zzb().zzc("Error storing NO_DATA mode event. appId", zzgu.zzl(str), e15);
                                    }
                                }
                            }
                        } catch (SQLiteException unused) {
                            zzaV().zzh().zzb("Failed handling NO_DATA mode bundles. appId", str);
                        }
                    }
                    list5 = Collections.EMPTY_LIST;
                }
                boolean isEmpty = list5.isEmpty();
                list3 = list5;
                if (isEmpty) {
                    return;
                }
            } else {
                list3 = list2;
            }
            zzjl zzB = zzB(str);
            zzjk zzjkVar = zzjk.AD_STORAGE;
            if (zzB.zzo(zzjkVar)) {
                Iterator it7 = list3.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        str4 = null;
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzid zzidVar4 = (com.google.android.gms.internal.measurement.zzid) ((Pair) it7.next()).first;
                    if (!zzidVar4.zzG().isEmpty()) {
                        str4 = zzidVar4.zzG();
                        break;
                    }
                }
                if (str4 != null) {
                    int i8 = 0;
                    while (true) {
                        if (i8 >= list3.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzid zzidVar5 = (com.google.android.gms.internal.measurement.zzid) ((Pair) list3.get(i8)).first;
                        if (!zzidVar5.zzG().isEmpty() && !zzidVar5.zzG().equals(str4)) {
                            list3 = list3.subList(0, i8);
                            break;
                        }
                        i8++;
                    }
                }
            }
            com.google.android.gms.internal.measurement.zzhz zzh = com.google.android.gms.internal.measurement.zzib.zzh();
            int size = list3.size();
            ArrayList arrayList10 = new ArrayList(list3.size());
            boolean z7 = zzd().zzC(str) && zzB(str).zzo(zzjkVar);
            boolean zzo = zzB(str).zzo(zzjkVar);
            boolean zzo2 = zzB(str).zzo(zzjk.ANALYTICS_STORAGE);
            zzrb.zza();
            boolean zzp2 = zzd().zzp(str, zzfy.zzaM);
            zzou zzouVar = this.zzl;
            zzot zza2 = zzouVar.zza(str);
            int i9 = 0;
            List list7 = list3;
            while (i9 < size) {
                boolean z8 = zzo;
                com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((Pair) list7.get(i9)).first).zzcl();
                int i10 = size;
                arrayList10.add((Long) ((Pair) list7.get(i9)).second);
                zzd().zzi();
                boolean z9 = z7;
                boolean z10 = zzo2;
                zzicVar4.zzO(133005L);
                zzicVar4.zzs(j);
                this.zzn.zzaU();
                zzicVar4.zzae(false);
                if (!z9) {
                    zzicVar4.zzan();
                }
                if (!z8) {
                    zzicVar4.zzR();
                    zzicVar4.zzU();
                }
                if (!z10) {
                    zzicVar4.zzX();
                }
                zzS(str, zzicVar4);
                if (!zzp2) {
                    zzicVar4.zzav();
                }
                if (!z10) {
                    zzicVar4.zzag();
                }
                String zzP = zzicVar4.zzP();
                if (TextUtils.isEmpty(zzP) || zzP.equals("00000000-0000-0000-0000-000000000000")) {
                    ArrayList arrayList11 = new ArrayList(zzicVar4.zzb());
                    Iterator it8 = arrayList11.iterator();
                    z2 = z9;
                    Long l = null;
                    Long l2 = null;
                    boolean z11 = false;
                    boolean z12 = false;
                    while (it8.hasNext()) {
                        List list8 = list7;
                        com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) it8.next();
                        boolean z13 = zzp2;
                        int i11 = i9;
                        if ("_fx".equals(zzhsVar2.zzd())) {
                            it8.remove();
                            zzp2 = z13;
                            list7 = list8;
                            i9 = i11;
                            z11 = true;
                        } else if ("_f".equals(zzhsVar2.zzd())) {
                            zzp();
                            com.google.android.gms.internal.measurement.zzhw zzF = zzpk.zzF(zzhsVar2, "_pfo");
                            if (zzF != null) {
                                l = Long.valueOf(zzF.zzf());
                            }
                            zzp();
                            com.google.android.gms.internal.measurement.zzhw zzF2 = zzpk.zzF(zzhsVar2, "_uwa");
                            if (zzF2 != null) {
                                l2 = Long.valueOf(zzF2.zzf());
                            }
                            zzp2 = z13;
                            list7 = list8;
                            i9 = i11;
                        } else {
                            zzp2 = z13;
                            list7 = list8;
                            i9 = i11;
                        }
                        z12 = true;
                    }
                    list4 = list7;
                    z3 = zzp2;
                    i = i9;
                    if (z11) {
                        zzicVar4.zzi();
                        zzicVar4.zzh(arrayList11);
                    }
                    if (z12) {
                        zzR(zzicVar4.zzK(), true, l, l2);
                    }
                } else {
                    z2 = z9;
                    list4 = list7;
                    z3 = zzp2;
                    i = i9;
                }
                if (zzicVar4.zzc() != 0) {
                    if (zzd().zzp(str, zzfy.zzaC)) {
                        zzicVar4.zzas(zzp().zzt(((com.google.android.gms.internal.measurement.zzid) zzicVar4.zzbc()).zzcc()));
                    }
                    com.google.android.gms.internal.measurement.zzis zzd3 = zza2.zzd();
                    if (zzd3 != null) {
                        zzicVar4.zzaN(zzd3);
                    }
                    zzh.zze(zzicVar4);
                }
                i9 = i + 1;
                zzo2 = z10;
                zzo = z8;
                size = i10;
                z7 = z2;
                zzp2 = z3;
                list7 = list4;
            }
            if (zzh.zzb() == 0) {
                zzL(arrayList10);
                zzV(false, ComposerKt.providerMapsKey, null, null, str, Collections.EMPTY_LIST);
                return;
            }
            com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
            ArrayList arrayList12 = new ArrayList();
            boolean z14 = zza2.zzc() == zzls.SGTM_CLIENT;
            if (zza2.zzc() == zzls.SGTM) {
                z = z14;
            } else {
                if (!z14) {
                    str2 = null;
                    if (zzi().zzb()) {
                        return;
                    }
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        str2 = zzp().zzi(zzibVar);
                    }
                    zzp();
                    byte[] zzcc = zzibVar.zzcc();
                    zzL(arrayList10);
                    this.zzk.zze.zzb(j);
                    zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcc.length), str2);
                    this.zzv = true;
                    zzi().zzc(str, zza2, zzibVar, new zzow(this, str, arrayList12));
                    return;
                }
                z = true;
            }
            Iterator it9 = ((com.google.android.gms.internal.measurement.zzib) zzh.zzbc()).zza().iterator();
            while (true) {
                if (it9.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.zzid) it9.next()).zzY()) {
                        str3 = UUID.randomUUID().toString();
                        break;
                    }
                } else {
                    str3 = null;
                    break;
                }
            }
            com.google.android.gms.internal.measurement.zzib zzibVar2 = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
            zzaW().zzg();
            zzu();
            com.google.android.gms.internal.measurement.zzhz zzi = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar2);
            if (!TextUtils.isEmpty(str3)) {
                zzi.zzi(str3);
            }
            String zzc = zzh().zzc(str);
            if (!TextUtils.isEmpty(zzc)) {
                zzi.zzj(zzc);
            }
            ArrayList arrayList13 = new ArrayList();
            Iterator it10 = zzibVar2.zza().iterator();
            while (it10.hasNext()) {
                com.google.android.gms.internal.measurement.zzic zzaF = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it10.next());
                zzaF.zzan();
                arrayList13.add((com.google.android.gms.internal.measurement.zzid) zzaF.zzbc());
            }
            zzi.zzg();
            zzi.zzf(arrayList13);
            zzaV().zzk().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str3) ? "null" : zzi.zzh());
            com.google.android.gms.internal.measurement.zzib zzibVar3 = (com.google.android.gms.internal.measurement.zzib) zzi.zzbc();
            if (TextUtils.isEmpty(str3)) {
                str2 = null;
            } else {
                com.google.android.gms.internal.measurement.zzib zzibVar4 = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
                zzaW().zzg();
                zzu();
                com.google.android.gms.internal.measurement.zzhz zzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", str3);
                zzh2.zzi(str3);
                for (com.google.android.gms.internal.measurement.zzid zzidVar6 : zzibVar4.zza()) {
                    com.google.android.gms.internal.measurement.zzic zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzaE.zzam(zzidVar6.zzZ());
                    zzaE.zzaJ(zzidVar6.zzav());
                    zzh2.zze(zzaE);
                }
                com.google.android.gms.internal.measurement.zzib zzibVar5 = (com.google.android.gms.internal.measurement.zzib) zzh2.zzbc();
                String zzc2 = zzouVar.zzg.zzh().zzc(str);
                if (TextUtils.isEmpty(zzc2)) {
                    str2 = null;
                    zzotVar = new zzot((String) zzfy.zzr.zzb(null), Collections.EMPTY_MAP, z ? zzls.GOOGLE_SIGNAL_PENDING : zzls.GOOGLE_SIGNAL, null);
                } else {
                    Uri parse = Uri.parse((String) zzfy.zzr.zzb(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    String authority = parse.getAuthority();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzc2).length() + 1 + String.valueOf(authority).length());
                    sb2.append(zzc2);
                    sb2.append(".");
                    sb2.append(authority);
                    buildUpon.authority(sb2.toString());
                    str2 = null;
                    zzotVar = new zzot(buildUpon.build().toString(), Collections.EMPTY_MAP, z ? zzls.GOOGLE_SIGNAL_PENDING : zzls.GOOGLE_SIGNAL, null);
                }
                arrayList12.add(Pair.create(zzibVar5, zzotVar));
            }
            if (z) {
                com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar3.zzcl();
                for (int i12 = 0; i12 < zzibVar3.zzb(); i12++) {
                    com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) zzibVar3.zzc(i12).zzcl();
                    zzicVar5.zzt();
                    zzicVar5.zzaO(j);
                    zzhzVar.zzd(i12, zzicVar5);
                }
                arrayList12.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zza2));
                zzL(arrayList10);
                zzV(false, ComposerKt.providerMapsKey, null, null, str, arrayList12);
                if (zzO(str, zza2.zza())) {
                    zzaV().zzk().zzb("[sgtm] Sending sgtm batches available notification to app", str);
                    Intent intent = new Intent();
                    intent.setAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    intent.setPackage(str);
                    zzaQ(this.zzn.zzaY(), intent);
                    return;
                }
                return;
            }
            zzibVar = zzibVar3;
            if (zzi().zzb()) {
            }
        }
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzO(String str, String str2) {
        zzh zzu = zzj().zzu(str);
        if (zzu != null && zzt().zzaa(str, zzu.zzay())) {
            this.zzF.remove(str2);
            return true;
        }
        zzpe zzpeVar = (zzpe) this.zzF.get(str2);
        if (zzpeVar == null) {
            return true;
        }
        return zzpeVar.zzb();
    }

    @WorkerThread
    public final void zzP(String str) {
        com.google.android.gms.internal.measurement.zzib zzd;
        zzaW().zzg();
        zzu();
        this.zzw = true;
        try {
            zzic zzicVar = this.zzn;
            zzicVar.zzaU();
            Boolean zzJ = zzicVar.zzt().zzJ();
            if (zzJ == null) {
                zzaV().zze().zza("Upload data called on the client side before use of service was decided");
            } else if (zzJ.booleanValue()) {
                zzaV().zzb().zza("Upload called in the client side when service should be used");
            } else if (this.zza > 0) {
                zzaL();
            } else if (!zzi().zzb()) {
                zzaV().zzk().zza("Network not connected, ignoring upload request");
                zzaL();
            } else if (zzj().zzD(str)) {
                zzav zzj = zzj();
                C0875q.d(str);
                zzj.zzg();
                zzj.zzaw();
                List zzC = zzj.zzC(str, zzoo.zza(zzls.GOOGLE_SIGNAL), 1);
                zzpj zzpjVar = zzC.isEmpty() ? null : (zzpj) zzC.get(0);
                if (zzpjVar != null && (zzd = zzpjVar.zzd()) != null) {
                    zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, type, url", str, zzpjVar.zzf(), zzpjVar.zze());
                    byte[] zzcc = zzd.zzcc();
                    if (Log.isLoggable(zzaV().zzn(), 2)) {
                        zzaV().zzk().zzd("[sgtm] Uploading data from upload queue. appId, uncompressed size, data", str, Integer.valueOf(zzcc.length), zzp().zzi(zzd));
                    }
                    zzot zza = zzpjVar.zza();
                    this.zzv = true;
                    zzi().zzc(str, zza, zzd, new zzox(this, str, zzpjVar));
                }
            } else {
                zzaV().zzk().zzb("[sgtm] Upload queue has no batches for appId", str);
            }
            this.zzw = false;
            zzaM();
        } catch (Throwable th) {
            this.zzw = false;
            zzaM();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    @VisibleForTesting
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzQ(@NonNull String str, int i, Throwable th, byte[] bArr, zzpj zzpjVar) {
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaM();
                throw th2;
            }
        }
        if (i != 200) {
            if (i == 204) {
                i = 204;
            }
            String str2 = new String(bArr, StandardCharsets.UTF_8);
            ?? substring = str2.substring(0, Math.min(32, str2.length()));
            zzgs zzh = zzaV().zzh();
            Integer valueOf = Integer.valueOf(i);
            if (th == null) {
                th = substring;
            }
            zzh.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf, th);
            zzj().zzK(Long.valueOf(zzpjVar.zzc()));
            zzaL();
            this.zzv = false;
            zzaM();
        }
        if (th == null) {
            zzj().zzE(Long.valueOf(zzpjVar.zzc()));
            zzaV().zzk().zzc("Successfully uploaded batch from upload queue. appId, status", str, Integer.valueOf(i));
            if (zzi().zzb() && zzj().zzD(str)) {
                zzP(str);
            } else {
                zzaL();
            }
            this.zzv = false;
            zzaM();
        }
        String str22 = new String(bArr, StandardCharsets.UTF_8);
        ?? substring2 = str22.substring(0, Math.min(32, str22.length()));
        zzgs zzh2 = zzaV().zzh();
        Integer valueOf2 = Integer.valueOf(i);
        if (th == null) {
        }
        zzh2.zzd("Network upload failed. Will retry later. appId, status, error", str, valueOf2, th);
        zzj().zzK(Long.valueOf(zzpjVar.zzc()));
        zzaL();
        this.zzv = false;
        zzaM();
    }

    @WorkerThread
    public final void zzR(String str, boolean z, Long l, Long l2) {
        zzh zzu = zzj().zzu(str);
        if (zzu != null) {
            zzu.zzar(z);
            zzu.zzat(l);
            zzu.zzav(l2);
            if (zzu.zza()) {
                zzj().zzv(zzu, false, false);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
    
        if ((zzd().zzl(r7, com.google.android.gms.measurement.internal.zzfy.zzak) + r1.zzb) < zzaZ().elapsedRealtime()) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzS(String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
        int zzx;
        int indexOf;
        Set zzl = zzh().zzl(str);
        if (zzl != null) {
            zzicVar.zzaw(zzl);
        }
        if (zzh().zzp(str)) {
            zzicVar.zzG();
        }
        if (zzh().zzq(str)) {
            String zzD = zzicVar.zzD();
            if (!TextUtils.isEmpty(zzD) && (indexOf = zzD.indexOf(".")) != -1) {
                zzicVar.zzE(zzD.substring(0, indexOf));
            }
        }
        if (zzh().zzr(str) && (zzx = zzpk.zzx(zzicVar, "_id")) != -1) {
            zzicVar.zzr(zzx);
        }
        if (zzh().zzs(str)) {
            zzicVar.zzan();
        }
        if (zzh().zzt(str)) {
            zzicVar.zzX();
            if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE)) {
                Map map = this.zzE;
                zzpd zzpdVar = (zzpd) map.get(str);
                if (zzpdVar != null) {
                }
                zzpdVar = new zzpd(this, (byte[]) null);
                map.put(str, zzpdVar);
                zzicVar.zzax(zzpdVar.zza);
            }
        }
        if (zzh().zzu(str)) {
            zzicVar.zzav();
        }
    }

    public final void zzT(com.google.android.gms.internal.measurement.zzic zzicVar, zzpc zzpcVar) {
        for (int i = 0; i < zzicVar.zzc(); i++) {
            com.google.android.gms.internal.measurement.zzhr zzhrVar = (com.google.android.gms.internal.measurement.zzhr) zzicVar.zzd(i).zzcl();
            Iterator it = zzhrVar.zza().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if ("_c".equals(((com.google.android.gms.internal.measurement.zzhw) it.next()).zzb())) {
                    if (zzpcVar.zza.zzar() >= zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzal)) {
                        int zzm = zzd().zzm(zzpcVar.zza.zzA(), zzfy.zzay);
                        String str = null;
                        if (zzm <= 0) {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                str = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn.zzb("_tu");
                                zzn.zzd(str);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzn2.zzb("_tr");
                            zzn2.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc());
                            zzoh zzf = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, str);
                            if (zzf != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzf.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzf);
                                Deque deque = this.zzr;
                                if (!deque.contains(zzpcVar.zza.zzA())) {
                                    deque.add(zzpcVar.zza.zzA());
                                }
                            }
                        } else if (zzj().zzw(zzC(), zzpcVar.zza.zzA(), false, false, false, false, false, false, true).zzg > zzm) {
                            com.google.android.gms.internal.measurement.zzhv zzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzn3.zzb("_tnr");
                            zzn3.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn3.zzbc());
                        } else {
                            if (zzd().zzp(zzpcVar.zza.zzA(), zzfy.zzaR)) {
                                str = zzt().zzaw();
                                com.google.android.gms.internal.measurement.zzhv zzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn4.zzb("_tu");
                                zzn4.zzd(str);
                                zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn4.zzbc());
                            }
                            com.google.android.gms.internal.measurement.zzhv zzn5 = com.google.android.gms.internal.measurement.zzhw.zzn();
                            zzn5.zzb("_tr");
                            zzn5.zzf(1L);
                            zzhrVar.zzf((com.google.android.gms.internal.measurement.zzhw) zzn5.zzbc());
                            zzoh zzf2 = zzp().zzf(zzpcVar.zza.zzA(), zzicVar, zzhrVar, str);
                            if (zzf2 != null) {
                                zzaV().zzk().zzc("Generated trigger URI. appId, uri", zzpcVar.zza.zzA(), zzf2.zza);
                                zzj().zzY(zzpcVar.zza.zzA(), zzf2);
                                Deque deque2 = this.zzr;
                                if (!deque2.contains(zzpcVar.zza.zzA())) {
                                    deque2.add(zzpcVar.zza.zzA());
                                }
                            }
                        }
                    }
                    zzicVar.zze(i, (com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc());
                }
            }
        }
    }

    @VisibleForTesting
    public final void zzU(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
        List listOf = CollectionUtils.listOf((Object[]) new String[]{"_o", "_sn", "_sc", "_si"});
        long zzf = (zzpp.zzZ(zzhvVar.zza()) || zzpp.zzZ(str)) ? zzd().zzf(str2, true) : zzd().zze(str2, true);
        long codePointCount = zzhvVar.zzc().codePointCount(0, zzhvVar.zzc().length());
        zzpp zzt = zzt();
        String zza = zzhvVar.zza();
        zzd();
        String zzC = zzt.zzC(zza, 40, true);
        if (codePointCount <= zzf || listOf.contains(zzhvVar.zza())) {
            return;
        }
        if ("_ev".equals(zzhvVar.zza())) {
            bundle.putString("_ev", zzt().zzC(zzhvVar.zzc(), zzd().zzf(str2, true), true));
            return;
        }
        zzaV().zzh().zzc("Param value is too long; discarded. Name, value length", zzC, Long.valueOf(codePointCount));
        if (bundle.getLong("_err") == 0) {
            bundle.putLong("_err", 4L);
            if (bundle.getString("_ev") == null) {
                bundle.putString("_ev", zzC);
                bundle.putLong("_el", codePointCount);
            }
        }
        bundle.remove(zzhvVar.zza());
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r21 != null) goto L16;
     */
    @VisibleForTesting
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzV(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        int i2 = i;
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } catch (Throwable th2) {
                this.zzv = false;
                zzaM();
                throw th2;
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = this.zzz;
        C0875q.g(list2);
        this.zzz = null;
        try {
            if (z) {
                if (i2 != 200) {
                    if (i2 == 204) {
                        i2 = 204;
                    }
                    String str2 = new String(bArr2, StandardCharsets.UTF_8);
                    zzaV().zzh().zzd("Network upload failed. Will retry later. code, error", Integer.valueOf(i2), th, str2.substring(0, Math.min(32, str2.length())));
                    this.zzk.zze.zzb(zzaZ().currentTimeMillis());
                    if (i2 == 503 || i2 == 429) {
                        this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                    }
                    zzj().zzJ(list2);
                    zzaL();
                    this.zzv = false;
                    zzaM();
                    return;
                }
            }
            HashMap hashMap = new HashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) pair.first;
                zzot zzotVar = (zzot) pair.second;
                if (zzotVar.zzc() != zzls.SGTM_CLIENT) {
                    long zzA = zzj().zzA(str, zzibVar, zzotVar.zza(), zzotVar.zzb(), zzotVar.zzc(), null);
                    if (zzotVar.zzc() == zzls.GOOGLE_SIGNAL_PENDING && zzA != -1 && !zzibVar.zze().isEmpty()) {
                        hashMap.put(zzibVar.zze(), Long.valueOf(zzA));
                    }
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Pair pair2 = (Pair) it2.next();
                com.google.android.gms.internal.measurement.zzib zzibVar2 = (com.google.android.gms.internal.measurement.zzib) pair2.first;
                zzot zzotVar2 = (zzot) pair2.second;
                if (zzotVar2.zzc() == zzls.SGTM_CLIENT) {
                    zzj().zzA(str, zzibVar2, zzotVar2.zza(), zzotVar2.zzb(), zzotVar2.zzc(), (Long) hashMap.get(zzibVar2.zze()));
                }
            }
            List zzC = zzj().zzC(str, zzoo.zza(zzls.SGTM_CLIENT), 1);
            if (!zzC.isEmpty()) {
                long zzg = ((zzpj) zzC.get(0)).zzg();
                if (zzaZ().currentTimeMillis() > ((Long) zzfy.zzE.zzb(null)).longValue() + zzg) {
                    zzaV().zze().zzc("[sgtm] client batches are queued too long. appId, creationTime", str, Long.valueOf(zzg));
                }
            }
            for (Long l : list2) {
                try {
                    zzj().zzH(l.longValue());
                } catch (SQLiteException e) {
                    List list3 = this.zzA;
                    if (list3 == null || !list3.contains(l)) {
                        throw e;
                    }
                }
            }
            zzj().zzc();
            zzj().zzd();
            this.zzA = null;
            if (zzi().zzb() && zzj().zzD(str)) {
                zzP(str);
            } else if (zzi().zzb() && zzaJ()) {
                zzM();
            } else {
                this.zzB = -1L;
                zzaL();
            }
            this.zza = 0L;
            this.zzv = false;
            zzaM();
            return;
        } catch (Throwable th3) {
            zzj().zzd();
            throw th3;
        }
        zzgs zzk = zzaV().zzk();
        Integer valueOf = Integer.valueOf(i2);
        zzk.zzc("Network upload successful with code, uploadAttempted", valueOf, Boolean.valueOf(z));
        if (z) {
            try {
                this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
            } catch (SQLiteException e2) {
                zzaV().zzb().zzb("Database error while trying to delete uploaded bundles", e2);
                this.zza = zzaZ().elapsedRealtime();
                zzaV().zzk().zzb("Disable upload, time", Long.valueOf(this.zza));
            }
        }
        this.zzk.zze.zzb(0L);
        zzaL();
        if (z) {
            zzaV().zzk().zzc("Successful upload. Got network response. code, size", valueOf, Integer.valueOf(bArr2.length));
        } else {
            zzaV().zzk().zza("Purged empty bundles");
        }
        zzj().zzb();
    }

    @WorkerThread
    public final void zzW(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            String zzc = zzhVar.zzc();
            C0875q.g(zzc);
            zzX(zzc, ComposerKt.providerMapsKey, null, null, null);
            return;
        }
        String zzc2 = zzhVar.zzc();
        C0875q.g(zzc2);
        zzaV().zzk().zzb("Fetching remote configuration", zzc2);
        com.google.android.gms.internal.measurement.zzgl zzb2 = zzh().zzb(zzc2);
        String zzd = zzh().zzd(zzc2);
        ArrayMap arrayMap = null;
        if (zzb2 != null) {
            if (!TextUtils.isEmpty(zzd)) {
                arrayMap = new ArrayMap();
                arrayMap.put("If-Modified-Since", zzd);
            }
            String zze = zzh().zze(zzc2);
            if (!TextUtils.isEmpty(zze)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put("If-None-Match", zze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, arrayMap, new zzgw() { // from class: com.google.android.gms.measurement.internal.zzpf
            @Override // com.google.android.gms.measurement.internal.zzgw
            public final /* synthetic */ void zza(String str, int i, Throwable th, byte[] bArr, Map map) {
                zzpg.this.zzX(str, i, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fd A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:5:0x002f, B:13:0x004c, B:14:0x0153, B:24:0x0069, B:28:0x00b9, B:29:0x00aa, B:30:0x00be, B:34:0x00cf, B:35:0x00e9, B:37:0x00fd, B:38:0x011c, B:40:0x0126, B:42:0x012c, B:43:0x0130, B:45:0x013a, B:47:0x0148, B:48:0x0150, B:49:0x010b, B:50:0x00d7, B:52:0x00e1), top: B:4:0x002f, outer: #0 }] */
    @VisibleForTesting
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzX(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzaW().zzg();
        zzu();
        C0875q.d(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } catch (Throwable th2) {
                this.zzu = false;
                zzaM();
                throw th2;
            }
        }
        zzgs zzk = zzaV().zzk();
        Integer valueOf = Integer.valueOf(bArr.length);
        zzk.zzb("onConfigFetched. Response size", valueOf);
        zzj().zzb();
        try {
            zzh zzu = zzj().zzu(str);
            if (i != 200 && i != 204) {
                if (i == 304) {
                    i = 304;
                }
                z = false;
                if (zzu == null) {
                    zzaV().zze().zzb("App does not exist in onConfigFetched. appId", zzgu.zzl(str));
                } else {
                    if (!z && i != 404) {
                        zzu.zzK(zzaZ().currentTimeMillis());
                        zzj().zzv(zzu, false, false);
                        zzaV().zzk().zzc("Fetching config failed. code, error", Integer.valueOf(i), th);
                        zzh().zzf(str);
                        this.zzk.zze.zzb(zzaZ().currentTimeMillis());
                        if (i == 503 || i == 429) {
                            this.zzk.zzc.zzb(zzaZ().currentTimeMillis());
                        }
                        zzaL();
                    }
                    String zzaK = zzaK(map, "Last-Modified");
                    String zzaK2 = zzaK(map, "ETag");
                    if (i != 404 && i != 304) {
                        zzh().zzi(str, bArr, zzaK, zzaK2);
                        zzu.zzI(zzaZ().currentTimeMillis());
                        zzj().zzv(zzu, false, false);
                        if (i != 404) {
                            zzaV().zzh().zzb("Config not found. Using empty config. appId", str);
                        } else {
                            zzaV().zzk().zzc("Successfully fetched config. Got network response. code, size", Integer.valueOf(i), valueOf);
                        }
                        if (!zzi().zzb() && zzaJ()) {
                            zzM();
                        } else if (zzi().zzb() || !zzj().zzD(zzu.zzc())) {
                            zzaL();
                        } else {
                            zzP(zzu.zzc());
                        }
                    }
                    if (zzh().zzb(str) == null) {
                        zzh().zzi(str, null, null, null);
                    }
                    zzu.zzI(zzaZ().currentTimeMillis());
                    zzj().zzv(zzu, false, false);
                    if (i != 404) {
                    }
                    if (!zzi().zzb()) {
                    }
                    if (zzi().zzb()) {
                    }
                    zzaL();
                }
                zzj().zzc();
                zzj().zzd();
                this.zzu = false;
                zzaM();
            }
            if (th == null) {
                z = true;
                if (zzu == null) {
                }
                zzj().zzc();
                zzj().zzd();
                this.zzu = false;
                zzaM();
            }
            z = false;
            if (zzu == null) {
            }
            zzj().zzc();
            zzj().zzd();
            this.zzu = false;
            zzaM();
        } catch (Throwable th3) {
            zzj().zzd();
            throw th3;
        }
    }

    @WorkerThread
    public final void zzY(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    @WorkerThread
    public final void zzZ() {
        zzaW().zzg();
        zzu();
        if (this.zzp) {
            return;
        }
        this.zzp = true;
        if (zzaa()) {
            FileChannel fileChannel = this.zzy;
            zzaW().zzg();
            int i = 0;
            if (fileChannel == null || !fileChannel.isOpen()) {
                zzaV().zzb().zza("Bad channel to read from");
            } else {
                ByteBuffer allocate = ByteBuffer.allocate(4);
                try {
                    fileChannel.position(0L);
                    int read = fileChannel.read(allocate);
                    if (read == 4) {
                        allocate.flip();
                        i = allocate.getInt();
                    } else if (read != -1) {
                        zzaV().zze().zzb("Unexpected data length. Bytes read", Integer.valueOf(read));
                    }
                } catch (IOException e) {
                    zzaV().zzb().zzb("Failed to read from channel", e);
                }
            }
            int zzm = this.zzn.zzv().zzm();
            zzaW().zzg();
            if (i > zzm) {
                zzaV().zzb().zzc("Panic: can't downgrade version. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzm));
                return;
            }
            if (i < zzm) {
                FileChannel fileChannel2 = this.zzy;
                zzaW().zzg();
                if (fileChannel2 == null || !fileChannel2.isOpen()) {
                    zzaV().zzb().zza("Bad channel to read from");
                } else {
                    ByteBuffer allocate2 = ByteBuffer.allocate(4);
                    allocate2.putInt(zzm);
                    allocate2.flip();
                    try {
                        fileChannel2.truncate(0L);
                        fileChannel2.write(allocate2);
                        fileChannel2.force(true);
                        if (fileChannel2.size() != 4) {
                            zzaV().zzb().zzb("Error writing to channel. Bytes written", Long.valueOf(fileChannel2.size()));
                        }
                        zzaV().zzk().zzc("Storage version upgraded. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzm));
                        return;
                    } catch (IOException e2) {
                        zzaV().zzb().zzb("Failed to write to channel", e2);
                    }
                }
                zzaV().zzb().zzc("Storage version upgrade failed. Previous, current version", Integer.valueOf(i), Integer.valueOf(zzm));
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzae zzaU() {
        return this.zzn.zzaU();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzgu zzaV() {
        zzic zzicVar = this.zzn;
        C0875q.g(zzicVar);
        return zzicVar.zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaW() {
        zzic zzicVar = this.zzn;
        C0875q.g(zzicVar);
        return zzicVar.zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Clock zzaZ() {
        zzic zzicVar = this.zzn;
        C0875q.g(zzicVar);
        return zzicVar.zzaZ();
    }

    @VisibleForTesting
    @WorkerThread
    public final boolean zzaa() {
        zzaW().zzg();
        FileLock fileLock = this.zzx;
        if (fileLock != null && fileLock.isValid()) {
            zzaV().zzk().zza("Storage concurrent access okay");
            return true;
        }
        this.zze.zzu.zzc();
        File filesDir = this.zzn.zzaY().getFilesDir();
        com.google.android.gms.internal.measurement.zzbv.zza();
        int i = com.google.android.gms.internal.measurement.zzca.zzb;
        try {
            FileChannel channel = new RandomAccessFile(new File(new File(filesDir, "google_app_measurement.db").getPath()), "rw").getChannel();
            this.zzy = channel;
            FileLock tryLock = channel.tryLock();
            this.zzx = tryLock;
            if (tryLock != null) {
                zzaV().zzk().zza("Storage concurrent access okay");
                return true;
            }
            zzaV().zzb().zza("Storage concurrent data access panic");
            return false;
        } catch (FileNotFoundException e) {
            zzaV().zzb().zzb("Failed to acquire storage lock", e);
            return false;
        } catch (IOException e2) {
            zzaV().zzb().zzb("Failed to access storage lock file", e2);
            return false;
        } catch (OverlappingFileLockException e3) {
            zzaV().zze().zzb("Storage lock already acquired", e3);
            return false;
        }
    }

    @VisibleForTesting(otherwise = 4)
    @WorkerThread
    public final void zzab(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzj = zzj();
        String str = zzrVar.zza;
        C0875q.g(str);
        C0875q.d(str);
        zzj.zzg();
        zzj.zzaw();
        try {
            SQLiteDatabase zze = zzj.zze();
            String[] strArr = {str};
            int delete = zze.delete("apps", "app_id=?", strArr) + zze.delete("events", "app_id=?", strArr) + zze.delete("events_snapshot", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("queue", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("main_event_params", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr) + zze.delete("upload_queue", "app_id=?", strArr);
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzic zzicVar = zzj.zzu;
            if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
            }
            if (delete > 0) {
                zzicVar.zzaV().zzk().zzc("Reset analytics data. app, records", str, Integer.valueOf(delete));
            }
        } catch (SQLiteException e) {
            zzj.zzu.zzaV().zzb().zzc("Error resetting analytics data. appId, error", zzgu.zzl(str), e);
        }
        if (zzrVar.zzh) {
            zzah(zzrVar);
        }
    }

    @WorkerThread
    public final void zzac(zzpl zzplVar, zzr zzrVar) {
        zzpn zzm;
        long j;
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzpp zzt = zzt();
            String str = zzplVar.zzb;
            int zzp = zzt.zzp(str);
            if (zzp != 0) {
                zzpp zzt2 = zzt();
                zzd();
                zzt().zzN(this.zzK, zzrVar.zza, zzp, "_ev", zzt2.zzC(str, 24, true), str != null ? str.length() : 0);
                return;
            }
            int zzK = zzt().zzK(str, zzplVar.zza());
            if (zzK != 0) {
                zzpp zzt3 = zzt();
                zzd();
                String zzC = zzt3.zzC(str, 24, true);
                Object zza = zzplVar.zza();
                if (zza != null && ((zza instanceof String) || (zza instanceof CharSequence))) {
                    r13 = zza.toString().length();
                }
                zzt().zzN(this.zzK, zzrVar.zza, zzK, "_ev", zzC, r13);
                return;
            }
            Object zzL = zzt().zzL(str, zzplVar.zza());
            if (zzL != null) {
                if ("_sid".equals(str)) {
                    long j2 = zzplVar.zzc;
                    String str2 = zzplVar.zzf;
                    String str3 = zzrVar.zza;
                    C0875q.g(str3);
                    zzpn zzm2 = zzj().zzm(str3, "_sno");
                    if (zzm2 != null) {
                        Object obj = zzm2.zze;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            zzac(new zzpl("_sno", j2, Long.valueOf(j + 1), str2), zzrVar);
                        }
                    }
                    if (zzm2 != null) {
                        zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzm2.zze);
                    }
                    zzbc zzf = zzj().zzf(str3, "_s");
                    if (zzf != null) {
                        zzgs zzk = zzaV().zzk();
                        long j3 = zzf.zzc;
                        zzk.zzb("Backfill the session number. Last used session number", Long.valueOf(j3));
                        j = j3;
                    } else {
                        j = 0;
                    }
                    zzac(new zzpl("_sno", j2, Long.valueOf(j + 1), str2), zzrVar);
                }
                String str4 = zzrVar.zza;
                C0875q.g(str4);
                String str5 = zzplVar.zzf;
                C0875q.g(str5);
                zzpn zzpnVar = new zzpn(str4, str5, str, zzplVar.zzc, zzL);
                zzgs zzk2 = zzaV().zzk();
                zzic zzicVar = this.zzn;
                String str6 = zzpnVar.zzc;
                zzk2.zzc("Setting user property", zzicVar.zzl().zzc(str6), zzL);
                zzj().zzb();
                try {
                    if ("_id".equals(str6) && (zzm = zzj().zzm(str4, "_id")) != null && !zzpnVar.zze.equals(zzm.zze)) {
                        zzj().zzk(str4, "_lair");
                    }
                    zzao(zzrVar);
                    boolean zzl = zzj().zzl(zzpnVar);
                    if ("_sid".equals(str)) {
                        long zzu = zzp().zzu(zzrVar.zzu);
                        zzh zzu2 = zzj().zzu(str4);
                        if (zzu2 != null) {
                            zzu2.zzan(zzu);
                            if (zzu2.zza()) {
                                zzj().zzv(zzu2, false, false);
                            }
                        }
                    }
                    zzj().zzc();
                    if (!zzl) {
                        zzaV().zzb().zzc("Too many unique user properties are set. Ignoring user property", zzicVar.zzl().zzc(str6), zzpnVar.zze);
                        zzt().zzN(this.zzK, str4, 9, null, null, 0);
                    }
                    zzj().zzd();
                } catch (Throwable th) {
                    zzj().zzd();
                    throw th;
                }
            }
        }
    }

    @WorkerThread
    public final void zzad(String str, zzr zzrVar) {
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            Boolean zzaT = zzaT(zzrVar);
            if ("_npa".equals(str) && zzaT != null) {
                zzaV().zzj().zza("Falling back to manifest metadata value for ad personalization");
                zzac(new zzpl("_npa", zzaZ().currentTimeMillis(), Long.valueOf(true != zzaT.booleanValue() ? 0L : 1L), "auto"), zzrVar);
                return;
            }
            zzgs zzj = zzaV().zzj();
            zzic zzicVar = this.zzn;
            zzj.zzb("Removing user property", zzicVar.zzl().zzc(str));
            zzj().zzb();
            try {
                zzao(zzrVar);
                if ("_id".equals(str)) {
                    zzav zzj2 = zzj();
                    String str2 = zzrVar.zza;
                    C0875q.g(str2);
                    zzj2.zzk(str2, "_lair");
                }
                zzav zzj3 = zzj();
                String str3 = zzrVar.zza;
                C0875q.g(str3);
                zzj3.zzk(str3, str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzicVar.zzl().zzc(str));
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    public final void zzae() {
        this.zzs++;
    }

    public final void zzaf() {
        this.zzt++;
    }

    public final zzic zzag() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00c0, code lost:
    
        if (true == r12.booleanValue()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00c2, code lost:
    
        r23 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c7, code lost:
    
        r15 = new com.google.android.gms.measurement.internal.zzpl("_npa", r17, java.lang.Long.valueOf(r23), "auto");
        r24 = 1;
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00da, code lost:
    
        if (r11 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00e4, code lost:
    
        if (r11.zze.equals(r15.zzd) != false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00e6, code lost:
    
        zzac(r15, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c5, code lost:
    
        r23 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0403 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x015d, B:46:0x0167, B:48:0x0176, B:49:0x0252, B:51:0x027e, B:52:0x0281, B:54:0x02a5, B:58:0x0368, B:59:0x036b, B:61:0x0378, B:62:0x0385, B:63:0x0423, B:68:0x02ba, B:70:0x02dd, B:72:0x02e5, B:74:0x02eb, B:78:0x02fe, B:80:0x030e, B:83:0x031a, B:85:0x0307, B:88:0x0326, B:90:0x034b, B:92:0x0351, B:93:0x0359, B:95:0x035f, B:99:0x0337, B:102:0x02c9, B:103:0x0187, B:105:0x01b2, B:106:0x01c1, B:108:0x01c8, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01ea, B:120:0x01ef, B:123:0x020f, B:128:0x0213, B:129:0x0227, B:130:0x0235, B:132:0x0243, B:133:0x039c, B:135:0x03d2, B:136:0x03d5, B:138:0x03e2, B:139:0x03ed, B:140:0x0403, B:142:0x0409, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x011a A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x015d, B:46:0x0167, B:48:0x0176, B:49:0x0252, B:51:0x027e, B:52:0x0281, B:54:0x02a5, B:58:0x0368, B:59:0x036b, B:61:0x0378, B:62:0x0385, B:63:0x0423, B:68:0x02ba, B:70:0x02dd, B:72:0x02e5, B:74:0x02eb, B:78:0x02fe, B:80:0x030e, B:83:0x031a, B:85:0x0307, B:88:0x0326, B:90:0x034b, B:92:0x0351, B:93:0x0359, B:95:0x035f, B:99:0x0337, B:102:0x02c9, B:103:0x0187, B:105:0x01b2, B:106:0x01c1, B:108:0x01c8, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01ea, B:120:0x01ef, B:123:0x020f, B:128:0x0213, B:129:0x0227, B:130:0x0235, B:132:0x0243, B:133:0x039c, B:135:0x03d2, B:136:0x03d5, B:138:0x03e2, B:139:0x03ed, B:140:0x0403, B:142:0x0409, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0106 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x015d, B:46:0x0167, B:48:0x0176, B:49:0x0252, B:51:0x027e, B:52:0x0281, B:54:0x02a5, B:58:0x0368, B:59:0x036b, B:61:0x0378, B:62:0x0385, B:63:0x0423, B:68:0x02ba, B:70:0x02dd, B:72:0x02e5, B:74:0x02eb, B:78:0x02fe, B:80:0x030e, B:83:0x031a, B:85:0x0307, B:88:0x0326, B:90:0x034b, B:92:0x0351, B:93:0x0359, B:95:0x035f, B:99:0x0337, B:102:0x02c9, B:103:0x0187, B:105:0x01b2, B:106:0x01c1, B:108:0x01c8, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01ea, B:120:0x01ef, B:123:0x020f, B:128:0x0213, B:129:0x0227, B:130:0x0235, B:132:0x0243, B:133:0x039c, B:135:0x03d2, B:136:0x03d5, B:138:0x03e2, B:139:0x03ed, B:140:0x0403, B:142:0x0409, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100 A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x015d, B:46:0x0167, B:48:0x0176, B:49:0x0252, B:51:0x027e, B:52:0x0281, B:54:0x02a5, B:58:0x0368, B:59:0x036b, B:61:0x0378, B:62:0x0385, B:63:0x0423, B:68:0x02ba, B:70:0x02dd, B:72:0x02e5, B:74:0x02eb, B:78:0x02fe, B:80:0x030e, B:83:0x031a, B:85:0x0307, B:88:0x0326, B:90:0x034b, B:92:0x0351, B:93:0x0359, B:95:0x035f, B:99:0x0337, B:102:0x02c9, B:103:0x0187, B:105:0x01b2, B:106:0x01c1, B:108:0x01c8, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01ea, B:120:0x01ef, B:123:0x020f, B:128:0x0213, B:129:0x0227, B:130:0x0235, B:132:0x0243, B:133:0x039c, B:135:0x03d2, B:136:0x03d5, B:138:0x03e2, B:139:0x03ed, B:140:0x0403, B:142:0x0409, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010e A[Catch: all -> 0x00b3, TryCatch #1 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x015d, B:46:0x0167, B:48:0x0176, B:49:0x0252, B:51:0x027e, B:52:0x0281, B:54:0x02a5, B:58:0x0368, B:59:0x036b, B:61:0x0378, B:62:0x0385, B:63:0x0423, B:68:0x02ba, B:70:0x02dd, B:72:0x02e5, B:74:0x02eb, B:78:0x02fe, B:80:0x030e, B:83:0x031a, B:85:0x0307, B:88:0x0326, B:90:0x034b, B:92:0x0351, B:93:0x0359, B:95:0x035f, B:99:0x0337, B:102:0x02c9, B:103:0x0187, B:105:0x01b2, B:106:0x01c1, B:108:0x01c8, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01ea, B:120:0x01ef, B:123:0x020f, B:128:0x0213, B:129:0x0227, B:130:0x0235, B:132:0x0243, B:133:0x039c, B:135:0x03d2, B:136:0x03d5, B:138:0x03e2, B:139:0x03ed, B:140:0x0403, B:142:0x0409, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[Catch: all -> 0x00b3, TRY_LEAVE, TryCatch #1 {all -> 0x00b3, blocks: (B:25:0x0095, B:27:0x00a3, B:31:0x00f3, B:33:0x0100, B:34:0x0109, B:36:0x010e, B:38:0x0127, B:42:0x013d, B:44:0x015d, B:46:0x0167, B:48:0x0176, B:49:0x0252, B:51:0x027e, B:52:0x0281, B:54:0x02a5, B:58:0x0368, B:59:0x036b, B:61:0x0378, B:62:0x0385, B:63:0x0423, B:68:0x02ba, B:70:0x02dd, B:72:0x02e5, B:74:0x02eb, B:78:0x02fe, B:80:0x030e, B:83:0x031a, B:85:0x0307, B:88:0x0326, B:90:0x034b, B:92:0x0351, B:93:0x0359, B:95:0x035f, B:99:0x0337, B:102:0x02c9, B:103:0x0187, B:105:0x01b2, B:106:0x01c1, B:108:0x01c8, B:110:0x01ce, B:112:0x01d8, B:114:0x01de, B:116:0x01e4, B:118:0x01ea, B:120:0x01ef, B:123:0x020f, B:128:0x0213, B:129:0x0227, B:130:0x0235, B:132:0x0243, B:133:0x039c, B:135:0x03d2, B:136:0x03d5, B:138:0x03e2, B:139:0x03ed, B:140:0x0403, B:142:0x0409, B:143:0x011a, B:144:0x0106, B:146:0x00b8, B:149:0x00c7, B:151:0x00dc, B:153:0x00e6, B:157:0x00f0), top: B:24:0x0095, inners: #0, #2, #3 }] */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzah(zzr zzrVar) {
        long j;
        long j2;
        zzbc zzf;
        boolean z;
        String str;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        long j3;
        boolean z2;
        zzaW().zzg();
        zzu();
        C0875q.g(zzrVar);
        String str2 = zzrVar.zza;
        C0875q.d(str2);
        if (zzaR(zzrVar)) {
            zzh zzu = zzj().zzu(str2);
            if (zzu != null && TextUtils.isEmpty(zzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzu.zzI(0L);
                zzj().zzv(zzu, false, false);
                zzh().zzh(str2);
            }
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            long j4 = zzrVar.zzl;
            if (j4 == 0) {
                j4 = zzaZ().currentTimeMillis();
            }
            long j5 = j4;
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str2), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                zzpn zzm = zzj().zzm(str2, "_npa");
                Boolean zzaT = zzaT(zzrVar);
                if (zzm != null && !"auto".equals(zzm.zzb)) {
                    j = j5;
                    j2 = 1;
                    if (zzd().zzp(null, zzfy.zzbb)) {
                        zzan(zzrVar, j);
                    } else {
                        zzan(zzrVar, zzrVar.zzD);
                    }
                    zzao(zzrVar);
                    if (i != 0) {
                        zzf = zzj().zzf(str2, "_f");
                        z = false;
                    } else {
                        zzf = zzj().zzf(str2, "_v");
                        z = true;
                    }
                    if (zzf != null) {
                        long j6 = ((j / DurationKt.MILLIS_IN_HOUR) + j2) * DurationKt.MILLIS_IN_HOUR;
                        if (z) {
                            long j7 = j;
                            zzac(new zzpl("_fvt", j7, Long.valueOf(j6), "auto"), zzrVar);
                            zzaW().zzg();
                            zzu();
                            Bundle bundle = new Bundle();
                            bundle.putLong("_c", 1L);
                            bundle.putLong("_r", 1L);
                            bundle.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                                bundle.putLong("_dac", 1L);
                            }
                            if (zzd().zzp(null, zzfy.zzbj)) {
                                bundle.putLong("_elt", zzaZ().currentTimeMillis());
                            }
                            zzE(new zzbg("_v", new zzbe(bundle), "auto", j7), zzrVar);
                        } else {
                            Long valueOf = Long.valueOf(j6);
                            long j8 = j;
                            zzac(new zzpl("_fot", j8, valueOf, "auto"), zzrVar);
                            zzaW().zzg();
                            zzhk zzhkVar = this.zzm;
                            C0875q.g(zzhkVar);
                            if (str2 == null || str2.isEmpty()) {
                                str = "_elt";
                                zzhkVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                            } else {
                                zzic zzicVar = zzhkVar.zza;
                                zzicVar.zzaW().zzg();
                                if (zzhkVar.zza()) {
                                    zzhj zzhjVar = new zzhj(zzhkVar, str2);
                                    zzicVar.zzaW().zzg();
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    str = "_elt";
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzicVar.zzaY().getPackageManager();
                                    if (packageManager == null) {
                                        zzicVar.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzicVar.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ServiceInfo serviceInfo = queryIntentServices.get(0).serviceInfo;
                                            if (serviceInfo != null) {
                                                String str3 = serviceInfo.packageName;
                                                if (serviceInfo.name != null && "com.android.vending".equals(str3) && zzhkVar.zza()) {
                                                    try {
                                                        zzicVar.zzaV().zzk().zzb("Install Referrer Service is", com.google.android.gms.common.stats.a.b().a(zzicVar.zzaY(), new Intent(intent), zzhjVar, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e) {
                                                        zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } else {
                                                    zzicVar.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzicVar.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                    str = "_elt";
                                }
                            }
                            zzaW().zzg();
                            zzu();
                            Bundle bundle2 = new Bundle();
                            long j9 = j2;
                            bundle2.putLong("_c", j9);
                            bundle2.putLong("_r", j9);
                            bundle2.putLong("_uwa", 0L);
                            bundle2.putLong("_pfo", 0L);
                            bundle2.putLong("_sys", 0L);
                            bundle2.putLong("_sysu", 0L);
                            bundle2.putLong("_et", j9);
                            if (zzrVar.zzo) {
                                bundle2.putLong("_dac", j9);
                            }
                            String str4 = zzrVar.zza;
                            C0875q.g(str4);
                            zzav zzj = zzj();
                            C0875q.d(str4);
                            zzj.zzg();
                            zzj.zzaw();
                            long zzN = zzj.zzN(str4, "first_open_count");
                            zzic zzicVar2 = this.zzn;
                            if (zzicVar2.zzaY().getPackageManager() == null) {
                                zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgu.zzl(str4));
                            } else {
                                try {
                                    packageInfo = d.a(zzicVar2.zzaY()).b(0, str4);
                                } catch (PackageManager.NameNotFoundException e2) {
                                    zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e2);
                                    packageInfo = null;
                                }
                                if (packageInfo != null) {
                                    long j10 = packageInfo.firstInstallTime;
                                    if (j10 != 0) {
                                        if (j10 != packageInfo.lastUpdateTime) {
                                            if (!zzd().zzp(null, zzfy.zzaI)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (zzN == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                zzN = 0;
                                            }
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        zzac(new zzpl("_fi", j8, Long.valueOf(true != z2 ? 0L : 1L), "auto"), zzrVar);
                                    }
                                }
                                try {
                                    applicationInfo = d.a(this.zzn.zzaY()).a(0, str4);
                                } catch (PackageManager.NameNotFoundException e3) {
                                    zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgu.zzl(str4), e3);
                                    applicationInfo = null;
                                }
                                if (applicationInfo != null) {
                                    if ((applicationInfo.flags & 1) != 0) {
                                        j3 = 1;
                                        bundle2.putLong("_sys", 1L);
                                    } else {
                                        j3 = 1;
                                    }
                                    if ((applicationInfo.flags & 128) != 0) {
                                        bundle2.putLong("_sysu", j3);
                                    }
                                }
                            }
                            if (zzN >= 0) {
                                bundle2.putLong("_pfo", zzN);
                            }
                            if (zzd().zzp(null, zzfy.zzbj)) {
                                bundle2.putLong(str, zzaZ().currentTimeMillis());
                            }
                            zzE(new zzbg("_f", new zzbe(bundle2), "auto", j8), zzrVar);
                        }
                    } else {
                        long j11 = j;
                        if (zzrVar.zzi) {
                            zzE(new zzbg("_cd", new zzbe(new Bundle()), "auto", j11), zzrVar);
                        }
                    }
                    zzj().zzc();
                    zzj().zzd();
                }
                j = j5;
                j2 = 1;
                if (zzm != null) {
                    zzad("_npa", zzrVar);
                }
                if (zzd().zzp(null, zzfy.zzbb)) {
                }
                zzao(zzrVar);
                if (i != 0) {
                }
                if (zzf != null) {
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzai(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        C0875q.g(zzrVar);
        String str = zzrVar.zza;
        C0875q.d(str);
        int i = 0;
        if (zzd().zzp(null, zzfy.zzaz)) {
            long currentTimeMillis = zzaZ().currentTimeMillis();
            int zzm = zzd().zzm(null, zzfy.zzai);
            zzd();
            long zzF = currentTimeMillis - zzal.zzF();
            while (i < zzm && zzaG(null, zzF)) {
                i++;
            }
        } else {
            zzd();
            long zzH = zzal.zzH();
            while (i < zzH && zzaG(str, 0L)) {
                i++;
            }
        }
        if (zzd().zzp(null, zzfy.zzaA)) {
            zzaW().zzg();
            zzav();
        }
        if (this.zzl.zzc(str, com.google.android.gms.internal.measurement.zzin.zzb(zzrVar.zzE))) {
            zzaV().zzk().zzb("[sgtm] Going background, trigger client side upload. appId", str);
            zzN(str, zzaZ().currentTimeMillis());
        }
    }

    @WorkerThread
    public final void zzaj(zzah zzahVar) {
        String str = zzahVar.zza;
        C0875q.g(str);
        zzr zzaO = zzaO(str);
        if (zzaO != null) {
            zzak(zzahVar, zzaO);
        }
    }

    @WorkerThread
    public final void zzak(zzah zzahVar, zzr zzrVar) {
        C0875q.g(zzahVar);
        C0875q.d(zzahVar.zza);
        C0875q.g(zzahVar.zzb);
        C0875q.g(zzahVar.zzc);
        C0875q.d(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzah zzahVar2 = new zzah(zzahVar);
            boolean z = false;
            zzahVar2.zze = false;
            zzj().zzb();
            try {
                zzav zzj = zzj();
                String str = zzahVar2.zza;
                C0875q.g(str);
                zzah zzq = zzj.zzq(str, zzahVar2.zzc.zzb);
                if (zzq != null && !zzq.zzb.equals(zzahVar2.zzb)) {
                    zzaV().zze().zzd("Updating a conditional user property with different origin. name, origin, origin (from DB)", this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzb, zzq.zzb);
                }
                if (zzq != null && zzq.zze) {
                    zzahVar2.zzb = zzq.zzb;
                    zzahVar2.zzd = zzq.zzd;
                    zzahVar2.zzh = zzq.zzh;
                    zzahVar2.zzf = zzq.zzf;
                    zzahVar2.zzi = zzq.zzi;
                    zzahVar2.zze = true;
                    zzpl zzplVar = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar.zzb, zzq.zzc.zzc, zzplVar.zza(), zzq.zzc.zzf);
                } else if (TextUtils.isEmpty(zzahVar2.zzf)) {
                    zzpl zzplVar2 = zzahVar2.zzc;
                    zzahVar2.zzc = new zzpl(zzplVar2.zzb, zzahVar2.zzd, zzplVar2.zza(), zzahVar2.zzc.zzf);
                    zzahVar2.zze = true;
                    z = true;
                }
                if (zzahVar2.zze) {
                    zzpl zzplVar3 = zzahVar2.zzc;
                    String str2 = zzahVar2.zza;
                    C0875q.g(str2);
                    String str3 = zzahVar2.zzb;
                    String str4 = zzplVar3.zzb;
                    long j = zzplVar3.zzc;
                    Object zza = zzplVar3.zza();
                    C0875q.g(zza);
                    zzpn zzpnVar = new zzpn(str2, str3, str4, j, zza);
                    if (zzj().zzl(zzpnVar)) {
                        zzaV().zzj().zzd("User property updated immediately", zzahVar2.zza, this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    } else {
                        zzaV().zzb().zzd("(2)Too many active user properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzpnVar.zzc), zzpnVar.zze);
                    }
                    if (z && zzahVar2.zzi != null) {
                        zzH(new zzbg(zzahVar2.zzi, zzahVar2.zzd), zzrVar);
                    }
                }
                if (zzj().zzp(zzahVar2)) {
                    zzaV().zzj().zzd("Conditional property added", zzahVar2.zza, this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                } else {
                    zzaV().zzb().zzd("Too many conditional properties, ignoring", zzgu.zzl(zzahVar2.zza), this.zzn.zzl().zzc(zzahVar2.zzc.zzb), zzahVar2.zzc.zza());
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzal(zzah zzahVar) {
        String str = zzahVar.zza;
        C0875q.g(str);
        zzr zzaO = zzaO(str);
        if (zzaO != null) {
            zzam(zzahVar, zzaO);
        }
    }

    @WorkerThread
    public final void zzam(zzah zzahVar, zzr zzrVar) {
        C0875q.g(zzahVar);
        C0875q.d(zzahVar.zza);
        C0875q.g(zzahVar.zzc);
        C0875q.d(zzahVar.zzc.zzb);
        zzaW().zzg();
        zzu();
        if (zzaR(zzrVar)) {
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str = zzahVar.zza;
                C0875q.g(str);
                zzah zzq = zzj().zzq(str, zzahVar.zzc.zzb);
                if (zzq != null) {
                    zzaV().zzj().zzc("Removing conditional user property", zzahVar.zza, this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                    zzj().zzr(str, zzahVar.zzc.zzb);
                    if (zzq.zze) {
                        zzj().zzk(str, zzahVar.zzc.zzb);
                    }
                    zzbg zzbgVar = zzahVar.zzk;
                    if (zzbgVar != null) {
                        zzbe zzbeVar = zzbgVar.zzb;
                        zzbg zzac = zzt().zzac(str, zzbgVar.zza, zzbeVar != null ? zzbeVar.zzf() : null, zzq.zzb, zzbgVar.zzd, true, true);
                        C0875q.g(zzac);
                        zzH(zzac, zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
                zzj().zzd();
            } catch (Throwable th) {
                zzj().zzd();
                throw th;
            }
        }
    }

    @WorkerThread
    public final void zzan(zzr zzrVar, long j) {
        zzav zzj = zzj();
        String str = zzrVar.zza;
        C0875q.g(str);
        zzh zzu = zzj.zzu(str);
        if (zzu != null && zzt().zzB(zzrVar.zzb, zzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgu.zzl(zzu.zzc()));
            zzav zzj2 = zzj();
            String zzc = zzu.zzc();
            zzj2.zzaw();
            zzj2.zzg();
            C0875q.d(zzc);
            try {
                SQLiteDatabase zze = zzj2.zze();
                String[] strArr = {zzc};
                int delete = zze.delete("events", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("apps", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("event_filters", "app_id=?", strArr) + zze.delete("property_filters", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("consent_settings", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpo.zza();
                zzic zzicVar = zzj2.zzu;
                if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                    delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    zzicVar.zzaV().zzk().zzc("Deleted application data. app, records", zzc, Integer.valueOf(delete));
                }
            } catch (SQLiteException e) {
                zzj2.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgu.zzl(zzc), e);
            }
            zzu = null;
        }
        if (zzu != null) {
            boolean z = (zzu.zzt() == SieveCacheKt.NodeMetaAndPreviousMask || zzu.zzt() == zzrVar.zzj) ? false : true;
            String zzr = zzu.zzr();
            if (z || ((zzu.zzt() != SieveCacheKt.NodeMetaAndPreviousMask || zzr == null || zzr.equals(zzrVar.zzc)) ? false : true)) {
                Bundle bundle = new Bundle();
                bundle.putString("_pv", zzr);
                zzbg zzbgVar = new zzbg("_au", new zzbe(bundle), "auto", j);
                if (zzd().zzp(null, zzfy.zzbc)) {
                    zzE(zzbgVar, zzrVar);
                } else {
                    zzF(zzbgVar, zzrVar);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0199  */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzh zzao(zzr zzrVar) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        zzaW().zzg();
        zzu();
        C0875q.g(zzrVar);
        String str5 = zzrVar.zza;
        C0875q.d(str5);
        String str6 = zzrVar.zzt;
        byte[] bArr = null;
        if (!str6.isEmpty()) {
            this.zzE.put(str5, new zzpd(this, str6, bArr));
        }
        zzh zzu = zzj().zzu(str5);
        zzjl zzs = zzB(str5).zzs(zzjl.zzf(zzrVar.zzs, 100));
        zzjk zzjkVar = zzjk.AD_STORAGE;
        String zzf = zzs.zzo(zzjkVar) ? this.zzk.zzf(str5, zzrVar.zzn) : "";
        boolean z2 = true;
        if (zzu == null) {
            zzh zzhVar = new zzh(this.zzn, str5);
            if (zzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                zzhVar.zze(zzK(zzs));
            }
            if (zzs.zzo(zzjkVar)) {
                zzhVar.zzk(zzf);
            }
            zzu = zzhVar;
        } else if (zzs.zzo(zzjkVar) && zzf != null && !zzf.equals(zzu.zzj())) {
            boolean isEmpty = TextUtils.isEmpty(zzu.zzj());
            zzu.zzk(zzf);
            if (zzrVar.zzn && !"00000000-0000-0000-0000-000000000000".equals(this.zzk.zzc(str5, zzs).first) && !isEmpty) {
                if (zzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                    zzu.zze(zzK(zzs));
                    z = false;
                } else {
                    z = true;
                }
                if (zzj().zzm(str5, "_id") != null && zzj().zzm(str5, "_lair") == null) {
                    zzj().zzl(new zzpn(str5, "auto", "_lair", zzaZ().currentTimeMillis(), 1L));
                }
                zzu.zzg(zzrVar.zzb);
                str = zzrVar.zzk;
                if (!TextUtils.isEmpty(str)) {
                    zzu.zzm(str);
                }
                j = zzrVar.zze;
                if (j != 0) {
                    zzu.zzy(j);
                }
                str2 = zzrVar.zzc;
                if (!TextUtils.isEmpty(str2)) {
                    zzu.zzs(str2);
                }
                zzu.zzu(zzrVar.zzj);
                str3 = zzrVar.zzd;
                if (str3 != null) {
                    zzu.zzw(str3);
                }
                zzu.zzA(zzrVar.zzf);
                zzu.zzE(zzrVar.zzh);
                str4 = zzrVar.zzg;
                if (!TextUtils.isEmpty(str4)) {
                    zzu.zzab(str4);
                }
                zzu.zzad(zzrVar.zzn);
                zzu.zzaf(zzrVar.zzp);
                zzu.zzC(zzrVar.zzq);
                zzu.zzi(zzrVar.zzu);
                zzpr.zza();
                if (zzd().zzp(null, zzfy.zzaL)) {
                    zzpr.zza();
                    if (zzd().zzp(null, zzfy.zzaK)) {
                        zzu.zzah(null);
                    }
                } else {
                    zzu.zzah(zzrVar.zzr);
                }
                zzu.zzaj(zzrVar.zzv);
                zzu.zzaz(zzrVar.zzB);
                zzqp.zza();
                if (zzd().zzp(null, zzfy.zzaP)) {
                    zzu.zzap(zzrVar.zzz);
                }
                zzu.zzal(zzrVar.zzw);
                zzu.zzaG(zzrVar.zzC);
                zzu.zzaK(zzrVar.zzE);
                if (!zzu.zza()) {
                    z2 = z;
                } else if (!z) {
                    return zzu;
                }
                zzj().zzv(zzu, z2, false);
                return zzu;
            }
            if (TextUtils.isEmpty(zzu.zzd()) && zzs.zzo(zzjk.ANALYTICS_STORAGE)) {
                zzu.zze(zzK(zzs));
            }
        } else if (TextUtils.isEmpty(zzu.zzd()) && zzs.zzo(zzjk.ANALYTICS_STORAGE)) {
            zzu.zze(zzK(zzs));
        }
        z = false;
        zzu.zzg(zzrVar.zzb);
        str = zzrVar.zzk;
        if (!TextUtils.isEmpty(str)) {
        }
        j = zzrVar.zze;
        if (j != 0) {
        }
        str2 = zzrVar.zzc;
        if (!TextUtils.isEmpty(str2)) {
        }
        zzu.zzu(zzrVar.zzj);
        str3 = zzrVar.zzd;
        if (str3 != null) {
        }
        zzu.zzA(zzrVar.zzf);
        zzu.zzE(zzrVar.zzh);
        str4 = zzrVar.zzg;
        if (!TextUtils.isEmpty(str4)) {
        }
        zzu.zzad(zzrVar.zzn);
        zzu.zzaf(zzrVar.zzp);
        zzu.zzC(zzrVar.zzq);
        zzu.zzi(zzrVar.zzu);
        zzpr.zza();
        if (zzd().zzp(null, zzfy.zzaL)) {
        }
        zzu.zzaj(zzrVar.zzv);
        zzu.zzaz(zzrVar.zzB);
        zzqp.zza();
        if (zzd().zzp(null, zzfy.zzaP)) {
        }
        zzu.zzal(zzrVar.zzw);
        zzu.zzaG(zzrVar.zzC);
        zzu.zzaK(zzrVar.zzE);
        if (!zzu.zza()) {
        }
        zzj().zzv(zzu, z2, false);
        return zzu;
    }

    public final String zzap(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoz(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    @WorkerThread
    public final List zzaq(zzr zzrVar, Bundle bundle) {
        zzaW().zzg();
        zzqp.zza();
        zzal zzd = zzd();
        String str = zzrVar.zza;
        if (!zzd.zzp(str, zzfy.zzaP) || str == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    zzaV().zzb().zza("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        zzav zzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        C0875q.d(str);
                        zzj.zzg();
                        zzj.zzaw();
                        try {
                            int delete = zzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            zzgs zzk = zzj.zzu.zzaV().zzk();
                            StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                            sb.append("Pruned ");
                            sb.append(delete);
                            sb.append(" trigger URIs. appId, source, timestamp");
                            zzk.zzd(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            zzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                        }
                    }
                }
            }
        }
        zzav zzj2 = zzj();
        String str2 = zzrVar.zza;
        C0875q.d(str2);
        zzj2.zzg();
        zzj2.zzaw();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                cursor = zzj2.zze().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str2}, null, null, "rowid", null);
                if (cursor.moveToFirst()) {
                    do {
                        String string = cursor.getString(0);
                        if (string == null) {
                            string = "";
                        }
                        arrayList.add(new zzoh(string, cursor.getLong(1), cursor.getInt(2)));
                    } while (cursor.moveToNext());
                }
            } catch (SQLiteException e2) {
                zzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e2);
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    public final void zzar(String str, zzaf zzafVar) {
        zzaW().zzg();
        zzu();
        zzav zzj = zzj();
        long j = zzafVar.zza;
        zzpj zzB = zzj.zzB(j);
        if (zzB == null) {
            zzaV().zze().zzc("[sgtm] Queued batch doesn't exist. appId, rowId", str, Long.valueOf(j));
            return;
        }
        String zze = zzB.zze();
        if (zzafVar.zzb != zzlr.SUCCESS.zza()) {
            if (zzafVar.zzb == zzlr.BACKOFF.zza()) {
                Map map = this.zzF;
                zzpe zzpeVar = (zzpe) map.get(zze);
                if (zzpeVar == null) {
                    zzpeVar = new zzpe(this);
                    map.put(zze, zzpeVar);
                } else {
                    zzpeVar.zza();
                }
                zzaV().zzk().zzd("[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds", str, zze, Long.valueOf((zzpeVar.zzc() - zzaZ().currentTimeMillis()) / 1000));
            }
            zzav zzj2 = zzj();
            Long valueOf = Long.valueOf(zzafVar.zza);
            zzj2.zzK(valueOf);
            zzaV().zzk().zzc("[sgtm] increased batch retry count after failed client upload. appId, rowId", str, valueOf);
            return;
        }
        Map map2 = this.zzF;
        if (map2.containsKey(zze)) {
            map2.remove(zze);
        }
        zzav zzj3 = zzj();
        Long valueOf2 = Long.valueOf(j);
        zzj3.zzE(valueOf2);
        zzaV().zzk().zzc("[sgtm] queued batch deleted after successful client upload. appId, rowId", str, valueOf2);
        long j2 = zzafVar.zzc;
        if (j2 > 0) {
            zzav zzj4 = zzj();
            zzj4.zzg();
            zzj4.zzaw();
            Long valueOf3 = Long.valueOf(j2);
            ContentValues contentValues = new ContentValues();
            contentValues.put("upload_type", Integer.valueOf(zzls.GOOGLE_SIGNAL.zza()));
            zzic zzicVar = zzj4.zzu;
            contentValues.put(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.valueOf(zzicVar.zzaZ().currentTimeMillis()));
            try {
                if (zzj4.zze().update("upload_queue", contentValues, "rowid=? AND app_id=? AND upload_type=?", new String[]{String.valueOf(j2), str, String.valueOf(zzls.GOOGLE_SIGNAL_PENDING.zza())}) != 1) {
                    zzicVar.zzaV().zze().zzc("Google Signal pending batch not updated. appId, rowId", str, valueOf3);
                }
                zzaV().zzk().zzc("[sgtm] queued Google Signal batch updated. appId, signalRowId", str, Long.valueOf(zzafVar.zzc));
                zzP(str);
            } catch (SQLiteException e) {
                zzj4.zzu.zzaV().zzb().zzd("Failed to update google Signal pending batch. appid, rowId", str, Long.valueOf(j2), e);
                throw e;
            }
        }
    }

    public final void zzas(boolean z) {
        zzaL();
    }

    @WorkerThread
    public final void zzat(String str, zzlu zzluVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzluVar != null) {
            this.zzH = str;
            this.zzG = zzluVar;
        }
    }

    public final /* synthetic */ void zzau(zzph zzphVar) {
        zzaW().zzg();
        this.zzm = new zzhk(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzax();
        this.zze = zzavVar;
        zzht zzhtVar = this.zzc;
        zzal zzd = zzd();
        C0875q.g(zzhtVar);
        zzd.zza(zzhtVar);
        zznn zznnVar = new zznn(this);
        zznnVar.zzax();
        this.zzk = zznnVar;
        zzad zzadVar = new zzad(this);
        zzadVar.zzax();
        this.zzh = zzadVar;
        zzlp zzlpVar = new zzlp(this);
        zzlpVar.zzax();
        this.zzj = zzlpVar;
        zzok zzokVar = new zzok(this);
        zzokVar.zzax();
        this.zzg = zzokVar;
        this.zzf = new zzhb(this);
        if (this.zzs != this.zzt) {
            zzaV().zzb().zzc("Not all upload components initialized", Integer.valueOf(this.zzs), Integer.valueOf(this.zzt));
        }
        this.zzo.set(true);
        zzaV().zzk().zza("UploadController is now fully initialized");
    }

    public final /* synthetic */ zzic zzax() {
        return this.zzn;
    }

    public final /* synthetic */ Deque zzay() {
        return this.zzr;
    }

    public final /* synthetic */ void zzaz(long j) {
        this.zzJ = j;
    }

    @WorkerThread
    public final void zzc() {
        zzaW().zzg();
        zzj().zzI();
        zzav zzj = zzj();
        zzj.zzg();
        zzj.zzaw();
        if (zzj.zzag()) {
            zzfx zzfxVar = zzfy.zzav;
            if (((Long) zzfxVar.zzb(null)).longValue() != 0) {
                SQLiteDatabase zze = zzj.zze();
                zzic zzicVar = zzj.zzu;
                int delete = zze.delete("trigger_uris", "abs(timestamp_millis - ?) > cast(? as integer)", new String[]{String.valueOf(zzicVar.zzaZ().currentTimeMillis()), String.valueOf(zzfxVar.zzb(null))});
                if (delete > 0) {
                    zzicVar.zzaV().zzk().zzb("Deleted stale trigger uris. rowsDeleted", Integer.valueOf(delete));
                }
            }
        }
        if (this.zzk.zzd.zza() == 0) {
            this.zzk.zzd.zzb(zzaZ().currentTimeMillis());
        }
        zzaL();
    }

    public final zzal zzd() {
        zzic zzicVar = this.zzn;
        C0875q.g(zzicVar);
        return zzicVar.zzc();
    }

    public final zzou zzf() {
        return this.zzl;
    }

    public final zzht zzh() {
        zzht zzhtVar = this.zzc;
        zzaS(zzhtVar);
        return zzhtVar;
    }

    public final zzgz zzi() {
        zzgz zzgzVar = this.zzd;
        zzaS(zzgzVar);
        return zzgzVar;
    }

    public final zzav zzj() {
        zzav zzavVar = this.zze;
        zzaS(zzavVar);
        return zzavVar;
    }

    public final zzhb zzk() {
        zzhb zzhbVar = this.zzf;
        if (zzhbVar != null) {
            return zzhbVar;
        }
        throw new IllegalStateException("Network broadcast receiver not created");
    }

    public final zzok zzl() {
        zzok zzokVar = this.zzg;
        zzaS(zzokVar);
        return zzokVar;
    }

    public final zzad zzm() {
        zzad zzadVar = this.zzh;
        zzaS(zzadVar);
        return zzadVar;
    }

    public final zzlp zzn() {
        zzlp zzlpVar = this.zzj;
        zzaS(zzlpVar);
        return zzlpVar;
    }

    public final zzpk zzp() {
        zzpk zzpkVar = this.zzi;
        zzaS(zzpkVar);
        return zzpkVar;
    }

    public final zznn zzq() {
        return this.zzk;
    }

    public final zzgn zzs() {
        return this.zzn.zzl();
    }

    public final zzpp zzt() {
        zzic zzicVar = this.zzn;
        C0875q.g(zzicVar);
        return zzicVar.zzk();
    }

    public final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    @WorkerThread
    public final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        C0875q.d(str);
        zzjl zzf = zzjl.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzf);
        zzA(str, zzf);
    }

    @WorkerThread
    public final void zzw(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        C0875q.d(str);
        zzaz zzg = zzaz.zzg(zzrVar.zzy);
        zzaV().zzk().zzc("Setting DMA consent for package", str, zzg);
        zzaW().zzg();
        zzu();
        zzji zzc = zzaz.zzh(zzy(str), 100).zzc();
        this.zzD.put(str, zzg);
        zzj().zzab(str, zzg);
        zzji zzc2 = zzaz.zzh(zzy(str), 100).zzc();
        zzaW().zzg();
        zzu();
        zzji zzjiVar = zzji.DENIED;
        boolean z = zzc == zzjiVar && zzc2 == zzji.GRANTED;
        boolean z2 = zzc == zzji.GRANTED && zzc2 == zzjiVar;
        if (z || z2) {
            zzaV().zzk().zzb("Generated _dcu event for", str);
            Bundle bundle = new Bundle();
            if (zzj().zzw(zzC(), str, false, false, false, false, false, false, false).zzf < zzd().zzm(str, zzfy.zzam)) {
                bundle.putLong("_r", 1L);
                zzaV().zzk().zzc("_dcu realtime event count", str, Long.valueOf(zzj().zzw(zzC(), str, false, false, false, false, false, true, false).zzf));
            }
            this.zzK.zza(str, "_dcu", bundle);
        }
    }

    @WorkerThread
    public final zzaz zzx(String str) {
        zzaW().zzg();
        zzu();
        Map map = this.zzD;
        zzaz zzazVar = (zzaz) map.get(str);
        if (zzazVar != null) {
            return zzazVar;
        }
        zzaz zzaa = zzj().zzaa(str);
        map.put(str, zzaa);
        return zzaa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    public final Bundle zzy(String str) {
        zzaW().zzg();
        zzu();
        if (zzh().zzx(str) == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        zzjl zzB = zzB(str);
        bundle.putAll(zzB.zzn());
        bundle.putAll(zzz(str, zzx(str), zzB, new zzan()).zzf());
        zzpn zzm = zzj().zzm(str, "_npa");
        bundle.putString("ad_personalization", 1 != (zzm != null ? zzm.zze.equals(1L) : zzaC(str, new zzan())) ? "granted" : "denied");
        return bundle;
    }

    @VisibleForTesting
    @WorkerThread
    public final zzaz zzz(String str, zzaz zzazVar, zzjl zzjlVar, zzan zzanVar) {
        zzji zzjiVar;
        int i = 90;
        if (zzh().zzx(str) == null) {
            if (zzazVar.zzc() == zzji.DENIED) {
                i = zzazVar.zzb();
                zzanVar.zzb(zzjk.AD_USER_DATA, i);
            } else {
                zzanVar.zzc(zzjk.AD_USER_DATA, zzam.FAILSAFE);
            }
            return new zzaz(Boolean.FALSE, i, Boolean.TRUE, "-");
        }
        zzji zzc = zzazVar.zzc();
        zzji zzjiVar2 = zzji.GRANTED;
        if (zzc == zzjiVar2 || zzc == (zzjiVar = zzji.DENIED)) {
            i = zzazVar.zzb();
            zzanVar.zzb(zzjk.AD_USER_DATA, i);
        } else {
            if (zzc == zzji.POLICY) {
                zzht zzhtVar = this.zzc;
                zzjk zzjkVar = zzjk.AD_USER_DATA;
                zzji zzA = zzhtVar.zzA(str, zzjkVar);
                if (zzA != zzji.UNINITIALIZED) {
                    zzanVar.zzc(zzjkVar, zzam.REMOTE_ENFORCED_DEFAULT);
                    zzc = zzA;
                }
            }
            zzht zzhtVar2 = this.zzc;
            zzjk zzjkVar2 = zzjk.AD_USER_DATA;
            zzjk zzw = zzhtVar2.zzw(str, zzjkVar2);
            zzji zzp = zzjlVar.zzp();
            boolean z = zzp == zzjiVar2 || zzp == zzjiVar;
            if (zzw == zzjk.AD_STORAGE && z) {
                zzanVar.zzc(zzjkVar2, zzam.REMOTE_DELEGATION);
                zzc = zzp;
            } else {
                zzanVar.zzc(zzjkVar2, zzam.REMOTE_DEFAULT);
                zzc = true != zzhtVar2.zzv(str, zzjkVar2) ? zzjiVar : zzjiVar2;
            }
        }
        boolean zzy = this.zzc.zzy(str);
        SortedSet zzz = zzh().zzz(str);
        if (zzc == zzji.DENIED || zzz.isEmpty()) {
            return new zzaz(Boolean.FALSE, i, Boolean.valueOf(zzy), "-");
        }
        return new zzaz(Boolean.TRUE, i, Boolean.valueOf(zzy), zzy ? TextUtils.join("", zzz) : "");
    }
}
