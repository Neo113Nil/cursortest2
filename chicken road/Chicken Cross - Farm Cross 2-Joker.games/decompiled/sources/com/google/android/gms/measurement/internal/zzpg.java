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
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.measurement.zzpr;
import com.google.android.gms.internal.measurement.zzqp;
import com.google.android.gms.internal.measurement.zzrb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.net.HttpHeaders;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.mbridge.msdk.MBridgeConstans;
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
import java.security.SecureRandom;
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

/* compiled from: com.google.android.gms:play-services-measurement@@23.0.0 */
/* loaded from: classes8.dex */
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

    zzpg(zzph zzphVar, zzic zzicVar) {
        Preconditions.checkNotNull(zzphVar);
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
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (zzb == null) {
            synchronized (zzpg.class) {
                if (zzb == null) {
                    zzb = new zzpg((zzph) Preconditions.checkNotNull(new zzph(context)), null);
                }
            }
        }
        return zzb;
    }

    static final void zzaA(com.google.android.gms.internal.measurement.zzhr zzhrVar, int i, String str) {
        List zza = zzhrVar.zza();
        for (int i2 = 0; i2 < zza.size(); i2++) {
            if ("_err".equals(((com.google.android.gms.internal.measurement.zzhw) zza.get(i2)).zzb())) {
                return;
            }
        }
        com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn.zzb("_err");
        zzn.zzf(Long.valueOf(i).longValue());
        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzn.zzbc();
        com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
        zzn2.zzb("_ev");
        zzn2.zzd(str);
        com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc();
        zzhrVar.zzf(zzhwVar);
        zzhrVar.zzf(zzhwVar2);
    }

    static final void zzaB(com.google.android.gms.internal.measurement.zzhr zzhrVar, String str) {
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

    /* JADX WARN: Removed duplicated region for block: B:114:0x03da A[Catch: all -> 0x0e16, TryCatch #1 {all -> 0x0e16, blocks: (B:3:0x0011, B:6:0x0029, B:9:0x0031, B:10:0x0045, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x06de, B:27:0x0102, B:30:0x0114, B:32:0x011a, B:34:0x0155, B:36:0x0163, B:39:0x0183, B:41:0x0189, B:43:0x0199, B:45:0x01a7, B:47:0x01b7, B:49:0x01c4, B:54:0x01c7, B:57:0x01dd, B:63:0x020e, B:66:0x0218, B:68:0x0226, B:70:0x026b, B:71:0x0242, B:73:0x0252, B:80:0x0278, B:82:0x02a4, B:83:0x02ce, B:85:0x0305, B:86:0x030c, B:89:0x0318, B:91:0x0352, B:92:0x036d, B:94:0x0373, B:96:0x0381, B:98:0x0395, B:99:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:114:0x03da, B:115:0x03e6, B:118:0x03f0, B:122:0x0413, B:123:0x0402, B:132:0x0492, B:134:0x049c, B:137:0x04ad, B:139:0x04c0, B:141:0x04cc, B:143:0x059b, B:145:0x05a1, B:146:0x05ad, B:148:0x05b3, B:150:0x05c3, B:152:0x05cd, B:153:0x05e2, B:155:0x05e8, B:156:0x0603, B:158:0x0609, B:160:0x0627, B:162:0x0632, B:164:0x065b, B:165:0x0638, B:167:0x0648, B:171:0x0668, B:172:0x0684, B:174:0x068a, B:177:0x069d, B:182:0x06aa, B:183:0x06ae, B:185:0x06b4, B:187:0x06c6, B:195:0x04e8, B:197:0x04f6, B:200:0x0509, B:202:0x051c, B:204:0x0528, B:206:0x0537, B:208:0x0546, B:210:0x0552, B:212:0x055e, B:214:0x0568, B:217:0x0575, B:219:0x057b, B:223:0x058b, B:221:0x0596, B:225:0x041b, B:227:0x0427, B:229:0x0433, B:233:0x0478, B:234:0x0450, B:237:0x0462, B:239:0x0468, B:241:0x0472, B:249:0x0120, B:251:0x012b, B:253:0x0137, B:255:0x013d, B:258:0x0148, B:263:0x06f5, B:265:0x0703, B:267:0x070c, B:269:0x073d, B:270:0x0714, B:272:0x071d, B:274:0x0723, B:276:0x072f, B:278:0x0737, B:285:0x0740, B:286:0x074c, B:289:0x0754, B:292:0x0766, B:293:0x0771, B:295:0x0779, B:296:0x079e, B:298:0x07b8, B:299:0x07cd, B:301:0x07e7, B:302:0x07fc, B:303:0x080a, B:305:0x0810, B:307:0x0820, B:308:0x0827, B:310:0x0833, B:312:0x083a, B:315:0x083d, B:317:0x087f, B:319:0x0885, B:320:0x08ac, B:322:0x08b4, B:323:0x08bd, B:325:0x08c3, B:326:0x08c9, B:328:0x08de, B:330:0x08ee, B:332:0x08fe, B:334:0x0906, B:335:0x0909, B:416:0x097b, B:418:0x0994, B:420:0x09aa, B:422:0x09af, B:424:0x09b3, B:426:0x09b7, B:428:0x09c1, B:429:0x09c7, B:431:0x09cb, B:433:0x09d1, B:434:0x09df, B:435:0x09e8, B:505:0x0a0a, B:509:0x0a11, B:520:0x0893, B:522:0x0899, B:524:0x089f, B:525:0x07f9, B:526:0x07ca, B:527:0x077e, B:529:0x0784), top: B:2:0x0011, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x049c A[Catch: all -> 0x0e16, TryCatch #1 {all -> 0x0e16, blocks: (B:3:0x0011, B:6:0x0029, B:9:0x0031, B:10:0x0045, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x06de, B:27:0x0102, B:30:0x0114, B:32:0x011a, B:34:0x0155, B:36:0x0163, B:39:0x0183, B:41:0x0189, B:43:0x0199, B:45:0x01a7, B:47:0x01b7, B:49:0x01c4, B:54:0x01c7, B:57:0x01dd, B:63:0x020e, B:66:0x0218, B:68:0x0226, B:70:0x026b, B:71:0x0242, B:73:0x0252, B:80:0x0278, B:82:0x02a4, B:83:0x02ce, B:85:0x0305, B:86:0x030c, B:89:0x0318, B:91:0x0352, B:92:0x036d, B:94:0x0373, B:96:0x0381, B:98:0x0395, B:99:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:114:0x03da, B:115:0x03e6, B:118:0x03f0, B:122:0x0413, B:123:0x0402, B:132:0x0492, B:134:0x049c, B:137:0x04ad, B:139:0x04c0, B:141:0x04cc, B:143:0x059b, B:145:0x05a1, B:146:0x05ad, B:148:0x05b3, B:150:0x05c3, B:152:0x05cd, B:153:0x05e2, B:155:0x05e8, B:156:0x0603, B:158:0x0609, B:160:0x0627, B:162:0x0632, B:164:0x065b, B:165:0x0638, B:167:0x0648, B:171:0x0668, B:172:0x0684, B:174:0x068a, B:177:0x069d, B:182:0x06aa, B:183:0x06ae, B:185:0x06b4, B:187:0x06c6, B:195:0x04e8, B:197:0x04f6, B:200:0x0509, B:202:0x051c, B:204:0x0528, B:206:0x0537, B:208:0x0546, B:210:0x0552, B:212:0x055e, B:214:0x0568, B:217:0x0575, B:219:0x057b, B:223:0x058b, B:221:0x0596, B:225:0x041b, B:227:0x0427, B:229:0x0433, B:233:0x0478, B:234:0x0450, B:237:0x0462, B:239:0x0468, B:241:0x0472, B:249:0x0120, B:251:0x012b, B:253:0x0137, B:255:0x013d, B:258:0x0148, B:263:0x06f5, B:265:0x0703, B:267:0x070c, B:269:0x073d, B:270:0x0714, B:272:0x071d, B:274:0x0723, B:276:0x072f, B:278:0x0737, B:285:0x0740, B:286:0x074c, B:289:0x0754, B:292:0x0766, B:293:0x0771, B:295:0x0779, B:296:0x079e, B:298:0x07b8, B:299:0x07cd, B:301:0x07e7, B:302:0x07fc, B:303:0x080a, B:305:0x0810, B:307:0x0820, B:308:0x0827, B:310:0x0833, B:312:0x083a, B:315:0x083d, B:317:0x087f, B:319:0x0885, B:320:0x08ac, B:322:0x08b4, B:323:0x08bd, B:325:0x08c3, B:326:0x08c9, B:328:0x08de, B:330:0x08ee, B:332:0x08fe, B:334:0x0906, B:335:0x0909, B:416:0x097b, B:418:0x0994, B:420:0x09aa, B:422:0x09af, B:424:0x09b3, B:426:0x09b7, B:428:0x09c1, B:429:0x09c7, B:431:0x09cb, B:433:0x09d1, B:434:0x09df, B:435:0x09e8, B:505:0x0a0a, B:509:0x0a11, B:520:0x0893, B:522:0x0899, B:524:0x089f, B:525:0x07f9, B:526:0x07ca, B:527:0x077e, B:529:0x0784), top: B:2:0x0011, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x05a1 A[Catch: all -> 0x0e16, TryCatch #1 {all -> 0x0e16, blocks: (B:3:0x0011, B:6:0x0029, B:9:0x0031, B:10:0x0045, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x06de, B:27:0x0102, B:30:0x0114, B:32:0x011a, B:34:0x0155, B:36:0x0163, B:39:0x0183, B:41:0x0189, B:43:0x0199, B:45:0x01a7, B:47:0x01b7, B:49:0x01c4, B:54:0x01c7, B:57:0x01dd, B:63:0x020e, B:66:0x0218, B:68:0x0226, B:70:0x026b, B:71:0x0242, B:73:0x0252, B:80:0x0278, B:82:0x02a4, B:83:0x02ce, B:85:0x0305, B:86:0x030c, B:89:0x0318, B:91:0x0352, B:92:0x036d, B:94:0x0373, B:96:0x0381, B:98:0x0395, B:99:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:114:0x03da, B:115:0x03e6, B:118:0x03f0, B:122:0x0413, B:123:0x0402, B:132:0x0492, B:134:0x049c, B:137:0x04ad, B:139:0x04c0, B:141:0x04cc, B:143:0x059b, B:145:0x05a1, B:146:0x05ad, B:148:0x05b3, B:150:0x05c3, B:152:0x05cd, B:153:0x05e2, B:155:0x05e8, B:156:0x0603, B:158:0x0609, B:160:0x0627, B:162:0x0632, B:164:0x065b, B:165:0x0638, B:167:0x0648, B:171:0x0668, B:172:0x0684, B:174:0x068a, B:177:0x069d, B:182:0x06aa, B:183:0x06ae, B:185:0x06b4, B:187:0x06c6, B:195:0x04e8, B:197:0x04f6, B:200:0x0509, B:202:0x051c, B:204:0x0528, B:206:0x0537, B:208:0x0546, B:210:0x0552, B:212:0x055e, B:214:0x0568, B:217:0x0575, B:219:0x057b, B:223:0x058b, B:221:0x0596, B:225:0x041b, B:227:0x0427, B:229:0x0433, B:233:0x0478, B:234:0x0450, B:237:0x0462, B:239:0x0468, B:241:0x0472, B:249:0x0120, B:251:0x012b, B:253:0x0137, B:255:0x013d, B:258:0x0148, B:263:0x06f5, B:265:0x0703, B:267:0x070c, B:269:0x073d, B:270:0x0714, B:272:0x071d, B:274:0x0723, B:276:0x072f, B:278:0x0737, B:285:0x0740, B:286:0x074c, B:289:0x0754, B:292:0x0766, B:293:0x0771, B:295:0x0779, B:296:0x079e, B:298:0x07b8, B:299:0x07cd, B:301:0x07e7, B:302:0x07fc, B:303:0x080a, B:305:0x0810, B:307:0x0820, B:308:0x0827, B:310:0x0833, B:312:0x083a, B:315:0x083d, B:317:0x087f, B:319:0x0885, B:320:0x08ac, B:322:0x08b4, B:323:0x08bd, B:325:0x08c3, B:326:0x08c9, B:328:0x08de, B:330:0x08ee, B:332:0x08fe, B:334:0x0906, B:335:0x0909, B:416:0x097b, B:418:0x0994, B:420:0x09aa, B:422:0x09af, B:424:0x09b3, B:426:0x09b7, B:428:0x09c1, B:429:0x09c7, B:431:0x09cb, B:433:0x09d1, B:434:0x09df, B:435:0x09e8, B:505:0x0a0a, B:509:0x0a11, B:520:0x0893, B:522:0x0899, B:524:0x089f, B:525:0x07f9, B:526:0x07ca, B:527:0x077e, B:529:0x0784), top: B:2:0x0011, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x04e8 A[Catch: all -> 0x0e16, TryCatch #1 {all -> 0x0e16, blocks: (B:3:0x0011, B:6:0x0029, B:9:0x0031, B:10:0x0045, B:13:0x005d, B:16:0x0083, B:18:0x00b8, B:21:0x00c9, B:23:0x00d3, B:26:0x06de, B:27:0x0102, B:30:0x0114, B:32:0x011a, B:34:0x0155, B:36:0x0163, B:39:0x0183, B:41:0x0189, B:43:0x0199, B:45:0x01a7, B:47:0x01b7, B:49:0x01c4, B:54:0x01c7, B:57:0x01dd, B:63:0x020e, B:66:0x0218, B:68:0x0226, B:70:0x026b, B:71:0x0242, B:73:0x0252, B:80:0x0278, B:82:0x02a4, B:83:0x02ce, B:85:0x0305, B:86:0x030c, B:89:0x0318, B:91:0x0352, B:92:0x036d, B:94:0x0373, B:96:0x0381, B:98:0x0395, B:99:0x038a, B:107:0x039c, B:110:0x03a3, B:111:0x03bb, B:114:0x03da, B:115:0x03e6, B:118:0x03f0, B:122:0x0413, B:123:0x0402, B:132:0x0492, B:134:0x049c, B:137:0x04ad, B:139:0x04c0, B:141:0x04cc, B:143:0x059b, B:145:0x05a1, B:146:0x05ad, B:148:0x05b3, B:150:0x05c3, B:152:0x05cd, B:153:0x05e2, B:155:0x05e8, B:156:0x0603, B:158:0x0609, B:160:0x0627, B:162:0x0632, B:164:0x065b, B:165:0x0638, B:167:0x0648, B:171:0x0668, B:172:0x0684, B:174:0x068a, B:177:0x069d, B:182:0x06aa, B:183:0x06ae, B:185:0x06b4, B:187:0x06c6, B:195:0x04e8, B:197:0x04f6, B:200:0x0509, B:202:0x051c, B:204:0x0528, B:206:0x0537, B:208:0x0546, B:210:0x0552, B:212:0x055e, B:214:0x0568, B:217:0x0575, B:219:0x057b, B:223:0x058b, B:221:0x0596, B:225:0x041b, B:227:0x0427, B:229:0x0433, B:233:0x0478, B:234:0x0450, B:237:0x0462, B:239:0x0468, B:241:0x0472, B:249:0x0120, B:251:0x012b, B:253:0x0137, B:255:0x013d, B:258:0x0148, B:263:0x06f5, B:265:0x0703, B:267:0x070c, B:269:0x073d, B:270:0x0714, B:272:0x071d, B:274:0x0723, B:276:0x072f, B:278:0x0737, B:285:0x0740, B:286:0x074c, B:289:0x0754, B:292:0x0766, B:293:0x0771, B:295:0x0779, B:296:0x079e, B:298:0x07b8, B:299:0x07cd, B:301:0x07e7, B:302:0x07fc, B:303:0x080a, B:305:0x0810, B:307:0x0820, B:308:0x0827, B:310:0x0833, B:312:0x083a, B:315:0x083d, B:317:0x087f, B:319:0x0885, B:320:0x08ac, B:322:0x08b4, B:323:0x08bd, B:325:0x08c3, B:326:0x08c9, B:328:0x08de, B:330:0x08ee, B:332:0x08fe, B:334:0x0906, B:335:0x0909, B:416:0x097b, B:418:0x0994, B:420:0x09aa, B:422:0x09af, B:424:0x09b3, B:426:0x09b7, B:428:0x09c1, B:429:0x09c7, B:431:0x09cb, B:433:0x09d1, B:434:0x09df, B:435:0x09e8, B:505:0x0a0a, B:509:0x0a11, B:520:0x0893, B:522:0x0899, B:524:0x089f, B:525:0x07f9, B:526:0x07ca, B:527:0x077e, B:529:0x0784), top: B:2:0x0011, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x0a45 A[Catch: all -> 0x0dfe, TryCatch #5 {all -> 0x0dfe, blocks: (B:410:0x094a, B:411:0x095d, B:413:0x0963, B:438:0x0c1f, B:440:0x09f4, B:443:0x0a25, B:445:0x0a45, B:446:0x0a4d, B:448:0x0a53, B:452:0x0a65, B:457:0x0a8d, B:458:0x0ab0, B:460:0x0abc, B:462:0x0ad2, B:463:0x0b11, B:466:0x0b27, B:468:0x0b2e, B:470:0x0b3d, B:472:0x0b41, B:474:0x0b45, B:476:0x0b49, B:477:0x0b55, B:478:0x0b5a, B:480:0x0b60, B:482:0x0b7e, B:483:0x0b83, B:484:0x0c1c, B:486:0x0b9a, B:488:0x0ba2, B:491:0x0bc3, B:493:0x0beb, B:494:0x0bf5, B:496:0x0c05, B:498:0x0c0d, B:499:0x0bac, B:503:0x0a79, B:511:0x0c2c, B:513:0x0c39, B:514:0x0c3f, B:515:0x0c47, B:517:0x0c4d, B:338:0x0c66, B:340:0x0c76, B:341:0x0cf7, B:390:0x0c8e, B:392:0x0c94, B:394:0x0c9e, B:395:0x0ca5, B:400:0x0cb5, B:401:0x0cbc, B:403:0x0ce8, B:404:0x0cef, B:405:0x0cec, B:406:0x0cb9, B:408:0x0ca2), top: B:409:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0a8d A[Catch: all -> 0x0dfe, TryCatch #5 {all -> 0x0dfe, blocks: (B:410:0x094a, B:411:0x095d, B:413:0x0963, B:438:0x0c1f, B:440:0x09f4, B:443:0x0a25, B:445:0x0a45, B:446:0x0a4d, B:448:0x0a53, B:452:0x0a65, B:457:0x0a8d, B:458:0x0ab0, B:460:0x0abc, B:462:0x0ad2, B:463:0x0b11, B:466:0x0b27, B:468:0x0b2e, B:470:0x0b3d, B:472:0x0b41, B:474:0x0b45, B:476:0x0b49, B:477:0x0b55, B:478:0x0b5a, B:480:0x0b60, B:482:0x0b7e, B:483:0x0b83, B:484:0x0c1c, B:486:0x0b9a, B:488:0x0ba2, B:491:0x0bc3, B:493:0x0beb, B:494:0x0bf5, B:496:0x0c05, B:498:0x0c0d, B:499:0x0bac, B:503:0x0a79, B:511:0x0c2c, B:513:0x0c39, B:514:0x0c3f, B:515:0x0c47, B:517:0x0c4d, B:338:0x0c66, B:340:0x0c76, B:341:0x0cf7, B:390:0x0c8e, B:392:0x0c94, B:394:0x0c9e, B:395:0x0ca5, B:400:0x0cb5, B:401:0x0cbc, B:403:0x0ce8, B:404:0x0cef, B:405:0x0cec, B:406:0x0cb9, B:408:0x0ca2), top: B:409:0x094a }] */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0ab0 A[Catch: all -> 0x0dfe, TryCatch #5 {all -> 0x0dfe, blocks: (B:410:0x094a, B:411:0x095d, B:413:0x0963, B:438:0x0c1f, B:440:0x09f4, B:443:0x0a25, B:445:0x0a45, B:446:0x0a4d, B:448:0x0a53, B:452:0x0a65, B:457:0x0a8d, B:458:0x0ab0, B:460:0x0abc, B:462:0x0ad2, B:463:0x0b11, B:466:0x0b27, B:468:0x0b2e, B:470:0x0b3d, B:472:0x0b41, B:474:0x0b45, B:476:0x0b49, B:477:0x0b55, B:478:0x0b5a, B:480:0x0b60, B:482:0x0b7e, B:483:0x0b83, B:484:0x0c1c, B:486:0x0b9a, B:488:0x0ba2, B:491:0x0bc3, B:493:0x0beb, B:494:0x0bf5, B:496:0x0c05, B:498:0x0c0d, B:499:0x0bac, B:503:0x0a79, B:511:0x0c2c, B:513:0x0c39, B:514:0x0c3f, B:515:0x0c47, B:517:0x0c4d, B:338:0x0c66, B:340:0x0c76, B:341:0x0cf7, B:390:0x0c8e, B:392:0x0c94, B:394:0x0c9e, B:395:0x0ca5, B:400:0x0cb5, B:401:0x0cbc, B:403:0x0ce8, B:404:0x0cef, B:405:0x0cec, B:406:0x0cb9, B:408:0x0ca2), top: B:409:0x094a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zzaG(String str, long j) {
        boolean z;
        boolean z2;
        int i;
        com.google.android.gms.internal.measurement.zzic zzicVar;
        com.google.android.gms.internal.measurement.zzic zzicVar2;
        zzpc zzpcVar;
        long parseLong;
        int zzm;
        long j2;
        zzpc zzpcVar2;
        SecureRandom secureRandom;
        Long l;
        Boolean bool;
        long zzaj;
        com.google.android.gms.internal.measurement.zzic zzicVar3;
        String[] strArr;
        String str2;
        String str3;
        String str4;
        boolean z3;
        String str5;
        boolean z4;
        boolean z5;
        int i2;
        String str6;
        boolean z6;
        String str7;
        int i3;
        String str8;
        int i4;
        boolean z7;
        boolean z8;
        String str9;
        int i5;
        boolean z9;
        boolean z10;
        String str10;
        zzpg zzpgVar = this;
        String str11 = "_f";
        String str12 = "_ai";
        String str13 = FirebaseAnalytics.Event.PURCHASE;
        String str14 = FirebaseAnalytics.Param.ITEMS;
        zzj().zzb();
        try {
            zzpc zzpcVar3 = new zzpc(zzpgVar, null);
            zzj().zzat(str, j, zzpgVar.zzB, zzpcVar3);
            List list = zzpcVar3.zzc;
            try {
                if (list != null && !list.isEmpty()) {
                    com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) zzpcVar3.zza.zzcl();
                    zzicVar4.zzi();
                    com.google.android.gms.internal.measurement.zzhr zzhrVar = null;
                    com.google.android.gms.internal.measurement.zzhr zzhrVar2 = null;
                    int i6 = -1;
                    int i7 = 0;
                    int i8 = 0;
                    boolean z11 = false;
                    boolean z12 = false;
                    int i9 = -1;
                    while (true) {
                        z2 = z12;
                        i = i8;
                        String str15 = "_et";
                        String str16 = str14;
                        zzicVar = zzicVar4;
                        int i10 = i6;
                        if (i7 >= zzpcVar3.zzc.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzhr zzhrVar3 = (com.google.android.gms.internal.measurement.zzhr) ((com.google.android.gms.internal.measurement.zzhs) zzpcVar3.zzc.get(i7)).zzcl();
                        int i11 = i7;
                        if (zzh().zzj(zzpcVar3.zza.zzA(), zzhrVar3.zzk())) {
                            zzaV().zze().zzc("Dropping blocked raw event. appId", zzgu.zzl(zzpcVar3.zza.zzA()), zzpgVar.zzn.zzl().zza(zzhrVar3.zzk()));
                            if (!zzh().zzn(zzpcVar3.zza.zzA()) && !zzh().zzo(zzpcVar3.zza.zzA()) && !"_err".equals(zzhrVar3.zzk())) {
                                zzt().zzN(zzpgVar.zzK, zzpcVar3.zza.zzA(), 11, "_ev", zzhrVar3.zzk(), 0);
                            }
                            str7 = str11;
                            str3 = str12;
                            str5 = str13;
                            i8 = i;
                            str8 = str16;
                            zzicVar4 = zzicVar;
                            i6 = i10;
                            i4 = i11;
                            z7 = z2;
                        } else {
                            String zzk = zzhrVar3.zzk();
                            String str17 = str11;
                            com.google.android.gms.internal.measurement.zzhr zzhrVar4 = zzhrVar;
                            if (zzk.equals(str13) || zzk.equals("_iap") || zzk.equals("ecommerce_purchase")) {
                                com.google.android.gms.internal.measurement.zzhv zzn = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn.zzb("_ct");
                                if (!z11) {
                                    String zzA = zzpcVar3.zza.zzA();
                                    if (zzpgVar.zzaP(zzA, str13) && zzpgVar.zzaP(zzA, "_iap") && zzpgVar.zzaP(zzA, "ecommerce_purchase")) {
                                        str2 = "new";
                                        zzn.zzd(str2);
                                        zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbc());
                                        z11 = true;
                                    }
                                }
                                str2 = "returning";
                                zzn.zzd(str2);
                                zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) zzn.zzbc());
                                z11 = true;
                            }
                            if (zzhrVar3.zzk().equals(zzjm.zza(str12))) {
                                zzhrVar3.zzl(str12);
                                zzaV().zzk().zza("Renaming ad_impression to _ai");
                                if (Log.isLoggable(zzaV().zzn(), 5)) {
                                    for (int i12 = 0; i12 < zzhrVar3.zzb(); i12++) {
                                        if (FirebaseAnalytics.Param.AD_PLATFORM.equals(zzhrVar3.zzc(i12).zzb()) && !zzhrVar3.zzc(i12).zzd().isEmpty() && "admob".equalsIgnoreCase(zzhrVar3.zzc(i12).zzd())) {
                                            zzaV().zzh().zza("AdMob ad impression logged from app. Potentially duplicative.");
                                        }
                                    }
                                }
                            }
                            boolean zzk2 = zzh().zzk(zzpcVar3.zza.zzA(), zzhrVar3.zzk());
                            if (zzk2) {
                                str3 = str12;
                            } else {
                                zzp();
                                String zzk3 = zzhrVar3.zzk();
                                Preconditions.checkNotEmpty(zzk3);
                                str3 = str12;
                                if (zzk3.hashCode() != 95027 || !zzk3.equals("_ui")) {
                                    z5 = z2;
                                    str5 = str13;
                                    str4 = "_et";
                                    z3 = z11;
                                    z4 = false;
                                    if (z4) {
                                        ArrayList arrayList = new ArrayList(zzhrVar3.zza());
                                        int i13 = -1;
                                        int i14 = -1;
                                        for (int i15 = 0; i15 < arrayList.size(); i15++) {
                                            if ("value".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i15)).zzb())) {
                                                i13 = i15;
                                            } else if ("currency".equals(((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i15)).zzb())) {
                                                i14 = i15;
                                            }
                                        }
                                        if (i13 != -1) {
                                            if (((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i13)).zze() || ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i13)).zzi()) {
                                                if (i14 != -1) {
                                                    String zzd = ((com.google.android.gms.internal.measurement.zzhw) arrayList.get(i14)).zzd();
                                                    if (zzd.length() == 3) {
                                                        int i16 = 0;
                                                        while (i16 < zzd.length()) {
                                                            int codePointAt = zzd.codePointAt(i16);
                                                            if (Character.isLetter(codePointAt)) {
                                                                i16 += Character.charCount(codePointAt);
                                                            }
                                                        }
                                                    }
                                                }
                                                zzaV().zzh().zza("Value parameter discarded. You must also supply a 3-letter ISO_4217 currency code in the currency parameter.");
                                                zzhrVar3.zzj(i13);
                                                zzaB(zzhrVar3, "_c");
                                                zzaA(zzhrVar3, 19, "currency");
                                                break;
                                            }
                                            zzaV().zzh().zza("Value must be specified with a numeric type.");
                                            zzhrVar3.zzj(i13);
                                            zzaB(zzhrVar3, "_c");
                                            zzaA(zzhrVar3, 18, "value");
                                        }
                                        if ("_e".equals(zzhrVar3.zzk())) {
                                            zzp();
                                            if (zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar3.zzbc(), "_fr") == null) {
                                                if (zzhrVar2 != null && Math.abs(zzhrVar2.zzn() - zzhrVar3.zzn()) <= 1000) {
                                                    com.google.android.gms.internal.measurement.zzhr zzhrVar5 = (com.google.android.gms.internal.measurement.zzhr) zzhrVar2.clone();
                                                    if (zzpgVar.zzaI(zzhrVar3, zzhrVar5)) {
                                                        zzicVar4 = zzicVar;
                                                        zzicVar4.zzf(i9, zzhrVar5);
                                                        i2 = i10;
                                                        str6 = str17;
                                                        zzhrVar = null;
                                                        zzhrVar2 = null;
                                                    }
                                                }
                                                zzicVar4 = zzicVar;
                                                zzhrVar = zzhrVar3;
                                                i2 = i;
                                                str6 = str17;
                                            } else {
                                                zzicVar4 = zzicVar;
                                                i2 = i10;
                                                str6 = str17;
                                                zzhrVar = zzhrVar4;
                                            }
                                        } else {
                                            zzicVar4 = zzicVar;
                                            if ("_vs".equals(zzhrVar3.zzk())) {
                                                zzp();
                                                if (zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar3.zzbc(), str4) == null) {
                                                    if (zzhrVar4 != null && Math.abs(zzhrVar4.zzn() - zzhrVar3.zzn()) <= 1000) {
                                                        com.google.android.gms.internal.measurement.zzhr zzhrVar6 = (com.google.android.gms.internal.measurement.zzhr) zzhrVar4.clone();
                                                        if (zzpgVar.zzaI(zzhrVar6, zzhrVar3)) {
                                                            i2 = i10;
                                                            zzicVar4.zzf(i2, zzhrVar6);
                                                            str6 = str17;
                                                            zzhrVar = null;
                                                            zzhrVar2 = null;
                                                        }
                                                    }
                                                    i2 = i10;
                                                    zzhrVar2 = zzhrVar3;
                                                    i9 = i;
                                                }
                                                i2 = i10;
                                            } else {
                                                i2 = i10;
                                                if (zzd().zzp(null, zzfy.zzbj)) {
                                                    str6 = str17;
                                                    if ((str6.equals(zzhrVar3.zzk()) || "_v".equals(zzhrVar3.zzk())) && (str6.equals(zzhrVar3.zzk()) || "_v".equals(zzhrVar3.zzk()))) {
                                                        int i17 = 0;
                                                        while (true) {
                                                            if (i17 >= zzhrVar3.zzb()) {
                                                                break;
                                                            }
                                                            com.google.android.gms.internal.measurement.zzhw zzc = zzhrVar3.zzc(i17);
                                                            if ("_elt".equals(zzc.zzb())) {
                                                                zzhrVar3.zzr(zzc.zzf());
                                                                zzhrVar3.zzj(i17);
                                                                break;
                                                            }
                                                            i17++;
                                                        }
                                                    }
                                                    zzhrVar = zzhrVar4;
                                                }
                                            }
                                            str6 = str17;
                                            zzhrVar = zzhrVar4;
                                        }
                                        if (zzhrVar3.zzb() != 0) {
                                            zzp();
                                            Bundle zzE = zzpk.zzE(zzhrVar3.zza());
                                            int i18 = 0;
                                            while (i18 < zzhrVar3.zzb()) {
                                                com.google.android.gms.internal.measurement.zzhw zzc2 = zzhrVar3.zzc(i18);
                                                String str18 = str16;
                                                if (!zzc2.zzb().equals(str18) || zzc2.zzk().isEmpty()) {
                                                    z8 = z5;
                                                    str9 = str6;
                                                    i5 = i2;
                                                    if (!zzc2.zzb().equals(str18)) {
                                                        zzpgVar.zzU(zzhrVar3.zzk(), (com.google.android.gms.internal.measurement.zzhv) zzc2.zzcl(), zzE, zzpcVar3.zza.zzA());
                                                    }
                                                } else {
                                                    String zzA2 = zzpcVar3.zza.zzA();
                                                    List zzk4 = zzc2.zzk();
                                                    Bundle[] bundleArr = new Bundle[zzk4.size()];
                                                    z8 = z5;
                                                    str9 = str6;
                                                    int i19 = 0;
                                                    while (i19 < zzk4.size()) {
                                                        com.google.android.gms.internal.measurement.zzhw zzhwVar = (com.google.android.gms.internal.measurement.zzhw) zzk4.get(i19);
                                                        zzp();
                                                        int i20 = i2;
                                                        Bundle zzE2 = zzpk.zzE(zzhwVar.zzk());
                                                        Iterator it = zzhwVar.zzk().iterator();
                                                        while (it.hasNext()) {
                                                            zzpgVar.zzU(zzhrVar3.zzk(), (com.google.android.gms.internal.measurement.zzhv) ((com.google.android.gms.internal.measurement.zzhw) it.next()).zzcl(), zzE2, zzA2);
                                                            it = it;
                                                            zzk4 = zzk4;
                                                        }
                                                        bundleArr[i19] = zzE2;
                                                        i19++;
                                                        i2 = i20;
                                                        zzk4 = zzk4;
                                                    }
                                                    i5 = i2;
                                                    zzE.putParcelableArray(str18, bundleArr);
                                                }
                                                i18++;
                                                z5 = z8;
                                                str16 = str18;
                                                i2 = i5;
                                                str6 = str9;
                                            }
                                            z6 = z5;
                                            str7 = str6;
                                            i3 = i2;
                                            str8 = str16;
                                            zzhrVar3.zzi();
                                            zzpk zzp = zzp();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (String str19 : zzE.keySet()) {
                                                com.google.android.gms.internal.measurement.zzhv zzn2 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                                zzn2.zzb(str19);
                                                Object obj = zzE.get(str19);
                                                if (obj != null) {
                                                    zzp.zzd(zzn2, obj);
                                                    arrayList2.add((com.google.android.gms.internal.measurement.zzhw) zzn2.zzbc());
                                                }
                                            }
                                            Iterator it2 = arrayList2.iterator();
                                            while (it2.hasNext()) {
                                                zzhrVar3.zzf((com.google.android.gms.internal.measurement.zzhw) it2.next());
                                            }
                                        } else {
                                            z6 = z5;
                                            str7 = str6;
                                            i3 = i2;
                                            str8 = str16;
                                        }
                                        i4 = i11;
                                        zzpcVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar3.zzbc());
                                        zzicVar4.zzg(zzhrVar3);
                                        i8 = i + 1;
                                        z7 = z6;
                                        i6 = i3;
                                        z11 = z3;
                                    }
                                    if ("_e".equals(zzhrVar3.zzk())) {
                                    }
                                    if (zzhrVar3.zzb() != 0) {
                                    }
                                    i4 = i11;
                                    zzpcVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar3.zzbc());
                                    zzicVar4.zzg(zzhrVar3);
                                    i8 = i + 1;
                                    z7 = z6;
                                    i6 = i3;
                                    z11 = z3;
                                }
                            }
                            str5 = str13;
                            int i21 = 0;
                            boolean z13 = false;
                            boolean z14 = false;
                            while (true) {
                                z3 = z11;
                                if (i21 >= zzhrVar3.zzb()) {
                                    break;
                                }
                                if ("_c".equals(zzhrVar3.zzc(i21).zzb())) {
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar = (com.google.android.gms.internal.measurement.zzhv) zzhrVar3.zzc(i21).zzcl();
                                    str10 = str15;
                                    zzhvVar.zzf(1L);
                                    zzhrVar3.zzd(i21, (com.google.android.gms.internal.measurement.zzhw) zzhvVar.zzbc());
                                    z13 = true;
                                } else {
                                    str10 = str15;
                                    if ("_r".equals(zzhrVar3.zzc(i21).zzb())) {
                                        com.google.android.gms.internal.measurement.zzhv zzhvVar2 = (com.google.android.gms.internal.measurement.zzhv) zzhrVar3.zzc(i21).zzcl();
                                        zzhvVar2.zzf(1L);
                                        zzhrVar3.zzd(i21, (com.google.android.gms.internal.measurement.zzhw) zzhvVar2.zzbc());
                                        z14 = true;
                                    }
                                }
                                i21++;
                                z11 = z3;
                                str15 = str10;
                            }
                            str4 = str15;
                            if (!z13 && zzk2) {
                                zzaV().zzk().zzb("Marking event as conversion", zzpgVar.zzn.zzl().zza(zzhrVar3.zzk()));
                                com.google.android.gms.internal.measurement.zzhv zzn3 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn3.zzb("_c");
                                zzn3.zzf(1L);
                                zzhrVar3.zzg(zzn3);
                            }
                            if (!z14) {
                                zzaV().zzk().zzb("Marking event as real-time", zzpgVar.zzn.zzl().zza(zzhrVar3.zzk()));
                                com.google.android.gms.internal.measurement.zzhv zzn4 = com.google.android.gms.internal.measurement.zzhw.zzn();
                                zzn4.zzb("_r");
                                zzn4.zzf(1L);
                                zzhrVar3.zzg(zzn4);
                            }
                            if (zzj().zzw(zzC(), zzpcVar3.zza.zzA(), false, false, false, false, true, false, false).zze > zzd().zzm(zzpcVar3.zza.zzA(), zzfy.zzo)) {
                                zzaB(zzhrVar3, "_r");
                                z9 = z2;
                            } else {
                                z9 = true;
                            }
                            if (zzpp.zzh(zzhrVar3.zzk()) && zzk2) {
                                z4 = zzk2;
                                z10 = z9;
                                if (zzj().zzw(zzC(), zzpcVar3.zza.zzA(), false, false, true, false, false, false, false).zzc > zzd().zzm(zzpcVar3.zza.zzA(), zzfy.zzn)) {
                                    zzaV().zze().zzb("Too many conversions. Not logging as conversion. appId", zzgu.zzl(zzpcVar3.zza.zzA()));
                                    boolean z15 = false;
                                    int i22 = -1;
                                    com.google.android.gms.internal.measurement.zzhv zzhvVar3 = null;
                                    for (int i23 = 0; i23 < zzhrVar3.zzb(); i23++) {
                                        com.google.android.gms.internal.measurement.zzhw zzc3 = zzhrVar3.zzc(i23);
                                        if ("_c".equals(zzc3.zzb())) {
                                            zzhvVar3 = (com.google.android.gms.internal.measurement.zzhv) zzc3.zzcl();
                                            i22 = i23;
                                        } else if ("_err".equals(zzc3.zzb())) {
                                            z15 = true;
                                        }
                                    }
                                    if (z15) {
                                        if (zzhvVar3 != null) {
                                            zzhrVar3.zzj(i22);
                                        } else {
                                            zzhvVar3 = null;
                                        }
                                    }
                                    if (zzhvVar3 != null) {
                                        com.google.android.gms.internal.measurement.zzhv zzhvVar4 = (com.google.android.gms.internal.measurement.zzhv) zzhvVar3.clone();
                                        zzhvVar4.zzb("_err");
                                        zzhvVar4.zzf(10L);
                                        zzhrVar3.zzd(i22, (com.google.android.gms.internal.measurement.zzhw) zzhvVar4.zzbc());
                                    } else {
                                        zzaV().zzb().zzb("Did not find conversion parameter. appId", zzgu.zzl(zzpcVar3.zza.zzA()));
                                    }
                                }
                            } else {
                                z4 = zzk2;
                                z10 = z9;
                            }
                            z5 = z10;
                            if (z4) {
                            }
                            if ("_e".equals(zzhrVar3.zzk())) {
                            }
                            if (zzhrVar3.zzb() != 0) {
                            }
                            i4 = i11;
                            zzpcVar3.zzc.set(i4, (com.google.android.gms.internal.measurement.zzhs) zzhrVar3.zzbc());
                            zzicVar4.zzg(zzhrVar3);
                            i8 = i + 1;
                            z7 = z6;
                            i6 = i3;
                            z11 = z3;
                        }
                        i7 = i4 + 1;
                        str14 = str8;
                        str12 = str3;
                        str13 = str5;
                        z12 = z7;
                        str11 = str7;
                    }
                    com.google.android.gms.internal.measurement.zzic zzicVar5 = zzicVar;
                    long j3 = 0;
                    long j4 = 0;
                    int i24 = i;
                    int i25 = 0;
                    while (i25 < i24) {
                        com.google.android.gms.internal.measurement.zzhs zzd2 = zzicVar5.zzd(i25);
                        if ("_e".equals(zzd2.zzd())) {
                            zzp();
                            if (zzpk.zzF(zzd2, "_fr") != null) {
                                zzicVar5.zzj(i25);
                                i24--;
                                i25--;
                                i25++;
                            }
                        }
                        zzp();
                        com.google.android.gms.internal.measurement.zzhw zzF = zzpk.zzF(zzd2, "_et");
                        if (zzF != null) {
                            Long valueOf = zzF.zze() ? Long.valueOf(zzF.zzf()) : null;
                            if (valueOf != null && valueOf.longValue() > 0) {
                                j4 += valueOf.longValue();
                            }
                        }
                        i25++;
                    }
                    zzpgVar.zzaH(zzicVar5, j4, false);
                    Iterator it3 = zzicVar5.zzb().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        if ("_s".equals(((com.google.android.gms.internal.measurement.zzhs) it3.next()).zzd())) {
                            zzj().zzk(zzicVar5.zzK(), "_se");
                            break;
                        }
                    }
                    if (zzpk.zzx(zzicVar5, "_sid") >= 0) {
                        zzpgVar.zzaH(zzicVar5, j4, true);
                    } else {
                        int zzx = zzpk.zzx(zzicVar5, "_se");
                        if (zzx >= 0) {
                            zzicVar5.zzr(zzx);
                            zzaV().zzb().zzb("Session engagement user property is in the bundle without session ID. appId", zzgu.zzl(zzpcVar3.zza.zzA()));
                        }
                    }
                    String zzA3 = zzpcVar3.zza.zzA();
                    zzaW().zzg();
                    zzu();
                    zzh zzu = zzj().zzu(zzA3);
                    if (zzu == null) {
                        zzaV().zzb().zzb("Cannot fix consent fields without appInfo. appId", zzgu.zzl(zzA3));
                    } else {
                        zzpgVar.zzI(zzu, zzicVar5);
                    }
                    String zzA4 = zzpcVar3.zza.zzA();
                    zzaW().zzg();
                    zzu();
                    zzh zzu2 = zzj().zzu(zzA4);
                    if (zzu2 == null) {
                        zzaV().zze().zzb("Cannot populate ad_campaign_info without appInfo. appId", zzgu.zzl(zzA4));
                    } else {
                        zzpgVar.zzJ(zzu2, zzicVar5);
                    }
                    zzicVar5.zzv(Long.MAX_VALUE);
                    zzicVar5.zzx(Long.MIN_VALUE);
                    for (int i26 = 0; i26 < zzicVar5.zzc(); i26++) {
                        com.google.android.gms.internal.measurement.zzhs zzd3 = zzicVar5.zzd(i26);
                        if (zzd3.zzf() < zzicVar5.zzu()) {
                            zzicVar5.zzv(zzd3.zzf());
                        }
                        if (zzd3.zzf() > zzicVar5.zzw()) {
                            zzicVar5.zzx(zzd3.zzf());
                        }
                    }
                    zzicVar5.zzak();
                    zzjl zzjlVar = zzjl.zza;
                    zzjl zzs = zzpgVar.zzB(zzpcVar3.zza.zzA()).zzs(zzjl.zzf(zzpcVar3.zza.zzaf(), 100));
                    zzjl zzad = zzj().zzad(zzpcVar3.zza.zzA());
                    zzj().zzac(zzpcVar3.zza.zzA(), zzs);
                    zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                    if (!zzs.zzo(zzjkVar) && zzad.zzo(zzjkVar)) {
                        zzj().zzi(zzpcVar3.zza.zzA());
                    } else if (zzs.zzo(zzjkVar) && !zzad.zzo(zzjkVar)) {
                        zzj().zzj(zzpcVar3.zza.zzA());
                    }
                    zzjk zzjkVar2 = zzjk.AD_STORAGE;
                    if (!zzs.zzo(zzjkVar2)) {
                        zzicVar5.zzR();
                        zzicVar5.zzU();
                        zzicVar5.zzan();
                    }
                    if (!zzs.zzo(zzjkVar)) {
                        zzicVar5.zzX();
                        zzicVar5.zzav();
                    }
                    zzqp.zza();
                    if (zzd().zzp(zzpcVar3.zza.zzA(), zzfy.zzaP) && zzt().zzX(zzpcVar3.zza.zzA()) && zzpgVar.zzB(zzpcVar3.zza.zzA()).zzo(zzjkVar2) && zzpcVar3.zza.zzak()) {
                        zzpgVar.zzT(zzicVar5, zzpcVar3);
                    }
                    zzicVar5.zzag();
                    zzicVar5.zzaf(zzm().zzb(zzicVar5.zzK(), zzicVar5.zzb(), zzicVar5.zzk(), Long.valueOf(zzicVar5.zzu()), Long.valueOf(zzicVar5.zzw()), !zzs.zzo(zzjkVar)));
                    if (zzd().zzD(zzpcVar3.zza.zzA())) {
                        try {
                            HashMap hashMap = new HashMap();
                            ArrayList arrayList3 = new ArrayList();
                            SecureRandom zzf = zzt().zzf();
                            int i27 = 0;
                            while (i27 < zzicVar5.zzc()) {
                                com.google.android.gms.internal.measurement.zzhr zzhrVar7 = (com.google.android.gms.internal.measurement.zzhr) zzicVar5.zzd(i27).zzcl();
                                if (zzhrVar7.zzk().equals("_ep")) {
                                    zzp();
                                    String str20 = (String) zzpk.zzI((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc(), "_en");
                                    zzbc zzbcVar = (zzbc) hashMap.get(str20);
                                    if (zzbcVar == null && (zzbcVar = zzj().zzf(zzpcVar3.zza.zzA(), (String) Preconditions.checkNotNull(str20))) != null) {
                                        hashMap.put(str20, zzbcVar);
                                    }
                                    if (zzbcVar != null && zzbcVar.zzi == null) {
                                        Long l2 = zzbcVar.zzj;
                                        if (l2 != null && l2.longValue() > 1) {
                                            zzp();
                                            zzpk.zzC(zzhrVar7, "_sr", l2);
                                        }
                                        Boolean bool2 = zzbcVar.zzk;
                                        if (bool2 != null && bool2.booleanValue()) {
                                            zzp();
                                            zzpk.zzC(zzhrVar7, "_efs", 1L);
                                        }
                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc());
                                    }
                                    zzicVar5.zzf(i27, zzhrVar7);
                                    zzpcVar2 = zzpcVar3;
                                    zzicVar3 = zzicVar5;
                                    secureRandom = zzf;
                                } else {
                                    zzht zzh = zzh();
                                    String zzA5 = zzpcVar3.zza.zzA();
                                    String zza = zzh.zza(zzA5, "measurement.account.time_zone_offset_minutes");
                                    if (!TextUtils.isEmpty(zza)) {
                                        try {
                                            parseLong = Long.parseLong(zza);
                                        } catch (NumberFormatException e) {
                                            zzh.zzu.zzaV().zze().zzc("Unable to parse timezone offset. appId", zzgu.zzl(zzA5), e);
                                        }
                                        long zzaj2 = zzt().zzaj(zzhrVar7.zzn(), parseLong);
                                        com.google.android.gms.internal.measurement.zzhs zzhsVar = (com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc();
                                        Long l3 = 1L;
                                        if (!TextUtils.isEmpty("_dbg")) {
                                            Iterator it4 = zzhsVar.zza().iterator();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzhw zzhwVar2 = (com.google.android.gms.internal.measurement.zzhw) it4.next();
                                                Iterator it5 = it4;
                                                if (!"_dbg".equals(zzhwVar2.zzb())) {
                                                    it4 = it5;
                                                } else if (l3.equals(Long.valueOf(zzhwVar2.zzf()))) {
                                                    zzm = 1;
                                                }
                                            }
                                        }
                                        zzm = zzh().zzm(zzpcVar3.zza.zzA(), zzhrVar7.zzk());
                                        if (zzm > 0) {
                                            zzaV().zze().zzc("Sample rate must be positive. event, rate", zzhrVar7.zzk(), Integer.valueOf(zzm));
                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc());
                                            zzicVar5.zzf(i27, zzhrVar7);
                                        } else {
                                            zzbc zzbcVar2 = (zzbc) hashMap.get(zzhrVar7.zzk());
                                            if (zzbcVar2 == null) {
                                                j2 = parseLong;
                                                zzbcVar2 = zzj().zzf(zzpcVar3.zza.zzA(), zzhrVar7.zzk());
                                                if (zzbcVar2 == null) {
                                                    zzaV().zze().zzc("Event being bundled has no eventAggregate. appId, eventName", zzpcVar3.zza.zzA(), zzhrVar7.zzk());
                                                    zzbcVar2 = new zzbc(zzpcVar3.zza.zzA(), zzhrVar7.zzk(), 1L, 1L, 1L, zzhrVar7.zzn(), 0L, null, null, null, null);
                                                }
                                            } else {
                                                j2 = parseLong;
                                            }
                                            zzp();
                                            Long l4 = (Long) zzpk.zzI((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc(), "_eid");
                                            Boolean valueOf2 = Boolean.valueOf(l4 != null);
                                            if (zzm == 1) {
                                                arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc());
                                                if (valueOf2.booleanValue() && (zzbcVar2.zzi != null || zzbcVar2.zzj != null || zzbcVar2.zzk != null)) {
                                                    hashMap.put(zzhrVar7.zzk(), zzbcVar2.zzc(null, null, null));
                                                }
                                                zzicVar5.zzf(i27, zzhrVar7);
                                            } else {
                                                if (zzf.nextInt(zzm) == 0) {
                                                    zzp();
                                                    zzpcVar2 = zzpcVar3;
                                                    com.google.android.gms.internal.measurement.zzic zzicVar6 = zzicVar5;
                                                    Long valueOf3 = Long.valueOf(zzm);
                                                    zzpk.zzC(zzhrVar7, "_sr", valueOf3);
                                                    arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc());
                                                    if (valueOf2.booleanValue()) {
                                                        zzbcVar2 = zzbcVar2.zzc(null, valueOf3, null);
                                                    }
                                                    hashMap.put(zzhrVar7.zzk(), zzbcVar2.zzb(zzhrVar7.zzn(), zzaj2));
                                                    secureRandom = zzf;
                                                    zzicVar3 = zzicVar6;
                                                } else {
                                                    zzpcVar2 = zzpcVar3;
                                                    com.google.android.gms.internal.measurement.zzic zzicVar7 = zzicVar5;
                                                    Long l5 = zzbcVar2.zzh;
                                                    if (l5 != null) {
                                                        zzaj = l5.longValue();
                                                        secureRandom = zzf;
                                                        l = l4;
                                                        bool = valueOf2;
                                                    } else {
                                                        secureRandom = zzf;
                                                        l = l4;
                                                        bool = valueOf2;
                                                        zzaj = zzt().zzaj(zzhrVar7.zzp(), j2);
                                                    }
                                                    if (zzaj != zzaj2) {
                                                        zzp();
                                                        zzpk.zzC(zzhrVar7, "_efs", 1L);
                                                        zzp();
                                                        Long valueOf4 = Long.valueOf(zzm);
                                                        zzpk.zzC(zzhrVar7, "_sr", valueOf4);
                                                        arrayList3.add((com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc());
                                                        if (bool.booleanValue()) {
                                                            zzbcVar2 = zzbcVar2.zzc(null, valueOf4, true);
                                                        }
                                                        hashMap.put(zzhrVar7.zzk(), zzbcVar2.zzb(zzhrVar7.zzn(), zzaj2));
                                                    } else if (bool.booleanValue()) {
                                                        hashMap.put(zzhrVar7.zzk(), zzbcVar2.zzc(l, null, null));
                                                    }
                                                    zzicVar3 = zzicVar7;
                                                }
                                                zzicVar3.zzf(i27, zzhrVar7);
                                            }
                                        }
                                        zzpcVar2 = zzpcVar3;
                                        zzicVar3 = zzicVar5;
                                        secureRandom = zzf;
                                    }
                                    parseLong = j3;
                                    long zzaj22 = zzt().zzaj(zzhrVar7.zzn(), parseLong);
                                    com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) zzhrVar7.zzbc();
                                    Long l32 = 1L;
                                    if (!TextUtils.isEmpty("_dbg")) {
                                    }
                                    zzm = zzh().zzm(zzpcVar3.zza.zzA(), zzhrVar7.zzk());
                                    if (zzm > 0) {
                                    }
                                    zzpcVar2 = zzpcVar3;
                                    zzicVar3 = zzicVar5;
                                    secureRandom = zzf;
                                }
                                i27++;
                                zzf = secureRandom;
                                zzicVar5 = zzicVar3;
                                zzpcVar3 = zzpcVar2;
                                j3 = 0;
                                zzpgVar = this;
                            }
                            zzpc zzpcVar4 = zzpcVar3;
                            zzicVar2 = zzicVar5;
                            if (arrayList3.size() < zzicVar2.zzc()) {
                                zzicVar2.zzi();
                                zzicVar2.zzh(arrayList3);
                            }
                            Iterator it6 = hashMap.entrySet().iterator();
                            while (it6.hasNext()) {
                                zzj().zzh((zzbc) ((Map.Entry) it6.next()).getValue());
                            }
                            zzpcVar = zzpcVar4;
                        } catch (Throwable th) {
                            th = th;
                            Throwable th2 = th;
                            zzj().zzd();
                            throw th2;
                        }
                    } else {
                        zzicVar2 = zzicVar5;
                        zzpcVar = zzpcVar3;
                    }
                    String zzA6 = zzpcVar.zza.zzA();
                    zzh zzu3 = zzj().zzu(zzA6);
                    if (zzu3 == null) {
                        zzaV().zzb().zzb("Bundling raw events w/o app info. appId", zzgu.zzl(zzpcVar.zza.zzA()));
                    } else if (zzicVar2.zzc() > 0) {
                        long zzp2 = zzu3.zzp();
                        if (zzp2 != 0) {
                            zzicVar2.zzA(zzp2);
                        } else {
                            zzicVar2.zzB();
                        }
                        long zzn5 = zzu3.zzn();
                        if (zzn5 != 0) {
                            zzp2 = zzn5;
                        }
                        if (zzp2 != 0) {
                            zzicVar2.zzy(zzp2);
                        } else {
                            zzicVar2.zzz();
                        }
                        zzu3.zzM(zzicVar2.zzc());
                        zzicVar2.zzaJ((int) zzu3.zzaF());
                        zzicVar2.zzZ((int) zzu3.zzG());
                        zzu3.zzo(zzicVar2.zzu());
                        zzu3.zzq(zzicVar2.zzw());
                        String zzaa = zzu3.zzaa();
                        if (zzaa != null) {
                            zzicVar2.zzaa(zzaa);
                        } else {
                            zzicVar2.zzab();
                        }
                        zzj().zzv(zzu3, false, false);
                    }
                    if (zzicVar2.zzc() > 0) {
                        this.zzn.zzaU();
                        com.google.android.gms.internal.measurement.zzgl zzb2 = zzh().zzb(zzpcVar.zza.zzA());
                        if (zzb2 != null && zzb2.zza()) {
                            zzicVar2.zzal(zzb2.zzb());
                            zzj().zzz((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), z2);
                        }
                        if (zzpcVar.zza.zzP().isEmpty()) {
                            zzicVar2.zzal(-1L);
                        } else {
                            zzaV().zze().zzb("Did not find measurement config or missing version info. appId", zzgu.zzl(zzpcVar.zza.zzA()));
                        }
                        zzj().zzz((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), z2);
                    }
                    zzav zzj = zzj();
                    List list2 = zzpcVar.zzb;
                    Preconditions.checkNotNull(list2);
                    zzj.zzg();
                    zzj.zzaw();
                    StringBuilder sb = new StringBuilder("rowid in (");
                    for (int i28 = 0; i28 < list2.size(); i28++) {
                        if (i28 != 0) {
                            sb.append(",");
                        }
                        sb.append(((Long) list2.get(i28)).longValue());
                    }
                    sb.append(")");
                    int delete = zzj.zze().delete("raw_events", sb.toString(), null);
                    if (delete != list2.size()) {
                        zzj.zzu.zzaV().zzb().zzc("Deleted fewer rows from raw events table than expected", Integer.valueOf(delete), Integer.valueOf(list2.size()));
                    }
                    zzav zzj2 = zzj();
                    SQLiteDatabase zze = zzj2.zze();
                    try {
                        strArr = new String[2];
                        strArr[0] = zzA6;
                        z = true;
                    } catch (SQLiteException e2) {
                        e = e2;
                        z = true;
                    }
                    try {
                        strArr[1] = zzA6;
                        zze.execSQL("delete from raw_events_metadata where app_id=? and metadata_fingerprint not in (select distinct metadata_fingerprint from raw_events where app_id=?)", strArr);
                    } catch (SQLiteException e3) {
                        e = e3;
                        zzj2.zzu.zzaV().zzb().zzc("Failed to remove unused event metadata. appId", zzgu.zzl(zzA6), e);
                        zzj().zzc();
                        boolean z16 = z;
                        zzj().zzd();
                        return z16;
                    }
                    zzj().zzc();
                    boolean z162 = z;
                    zzj().zzd();
                    return z162;
                }
                z = false;
                zzj().zzc();
                boolean z1622 = z;
                zzj().zzd();
                return z1622;
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

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
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar.zzbc(), "_sc");
        String zzd = zzF == null ? null : zzF.zzd();
        zzp();
        com.google.android.gms.internal.measurement.zzhw zzF2 = zzpk.zzF((com.google.android.gms.internal.measurement.zzhs) zzhrVar2.zzbc(), "_pc");
        String zzd2 = zzF2 != null ? zzF2.zzd() : null;
        if (zzd2 == null || !zzd2.equals(zzd)) {
            return false;
        }
        Preconditions.checkArgument("_e".equals(zzhrVar.zzk()));
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzaL() {
        long max;
        long j;
        zzaW().zzg();
        zzu();
        if (this.zza > 0) {
            long abs = 3600000 - Math.abs(zzaZ().elapsedRealtime() - this.zza);
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
        boolean z2 = z;
        long max3 = Math.max(zzj().zzM(), zzj().zzO());
        if (max3 != 0) {
            long abs2 = currentTimeMillis - Math.abs(max3 - currentTimeMillis);
            long abs3 = currentTimeMillis - Math.abs(zza - currentTimeMillis);
            long abs4 = currentTimeMillis - Math.abs(zza2 - currentTimeMillis);
            j = abs2 + max2;
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
                        break;
                    }
                    zzd();
                    j += Math.max(0L, ((Long) zzfy.zzP.zzb(null)).longValue()) * (1 << i);
                    if (j > abs4) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (j != 0) {
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
            return;
        }
        j = 0;
        if (j != 0) {
        }
    }

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
        ((List) Preconditions.checkNotNull(this.zzq)).clear();
    }

    private final Boolean zzaN(zzh zzhVar) {
        try {
            if (zzhVar.zzt() != -2147483648L) {
                if (zzhVar.zzt() == Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionCode) {
                    return true;
                }
            } else {
                String str = Wrappers.packageManager(this.zzn.zzaY()).getPackageInfo(zzhVar.zzc(), 0).versionName;
                String zzr = zzhVar.zzr();
                if (zzr != null && zzr.equals(str)) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

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

    private final boolean zzaP(String str, String str2) {
        zzbc zzf = zzj().zzf(str, str2);
        return zzf == null || zzf.zzc < 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzaQ(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT < 34) {
            context.sendBroadcast(intent);
        } else {
            context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
        }
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
        String valueOf = String.valueOf(zzosVar.getClass());
        String.valueOf(valueOf);
        throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(valueOf)));
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
                return true;
            }
            if (ordinal == 3) {
                return false;
            }
        }
        return bool;
    }

    final void zzA(String str, zzjl zzjlVar) {
        zzaW().zzg();
        zzu();
        this.zzC.put(str, zzjlVar);
        zzj().zzZ(str, zzjlVar);
    }

    final zzjl zzB(String str) {
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

    final long zzC() {
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

    final void zzD(zzbg zzbgVar, String str) {
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

    final void zzE(zzbg zzbgVar, zzr zzrVar) {
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
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

    final void zzF(zzbg zzbgVar, zzr zzrVar) {
        zzbg zzbgVar2;
        List<zzah> zzt;
        List<zzah> zzt2;
        List<zzah> zzt3;
        String str;
        Preconditions.checkNotNull(zzrVar);
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
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
                Preconditions.checkNotEmpty(str2);
                zzj.zzg();
                zzj.zzaw();
                if (j < 0) {
                    zzj.zzu.zzaV().zze().zzc("Invalid time querying timed out conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    zzt = Collections.emptyList();
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
                Preconditions.checkNotEmpty(str2);
                zzj2.zzg();
                zzj2.zzaw();
                if (j < 0) {
                    zzj2.zzu.zzaV().zze().zzc("Invalid time querying expired conditional properties", zzgu.zzl(str2), Long.valueOf(j));
                    zzt2 = Collections.emptyList();
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
                Preconditions.checkNotEmpty(str2);
                Preconditions.checkNotEmpty(str4);
                zzj3.zzg();
                zzj3.zzaw();
                if (j < 0) {
                    zzic zzicVar = zzj3.zzu;
                    zzicVar.zzaV().zze().zzd("Invalid time querying triggered conditional properties", zzgu.zzl(str2), zzicVar.zzl().zza(str4), Long.valueOf(j));
                    zzt3 = Collections.emptyList();
                } else {
                    zzt3 = zzj3.zzt("active=0 and app_id=? and trigger_event_name=? and abs(? - creation_timestamp) <= trigger_timeout", new String[]{str2, str4, String.valueOf(j)});
                }
                ArrayList arrayList2 = new ArrayList(zzt3.size());
                for (zzah zzahVar3 : zzt3) {
                    if (zzahVar3 != null) {
                        zzpl zzplVar = zzahVar3.zzc;
                        zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar3.zza), zzahVar3.zzb, zzplVar.zzb, j, Preconditions.checkNotNull(zzplVar.zza()));
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
            } finally {
                zzj().zzd();
            }
        }
    }

    final Bundle zzG(String str, zzbg zzbgVar) {
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

    /* JADX WARN: Can't wrap try/catch for region: R(15:367|(10:372|373|374|(1:376)|58|(0)(0)|61|(0)(0)|67|68)|377|378|379|380|373|374|(0)|58|(0)(0)|61|(0)(0)|67|68) */
    /* JADX WARN: Can't wrap try/catch for region: R(67:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))|84|85|(1:87)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|(3:108|109|110)|(3:111|112|113)|114|(1:116)|117|(2:119|(1:123)(1:122))(1:332)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|(6:146|(1:150)|151|(1:153)(1:186)|154|(1:156)(15:157|(1:159)(1:185)|160|(1:162)(1:184)|163|(1:165)(1:183)|166|(1:168)(1:182)|169|(1:171)(1:181)|172|(1:174)(1:180)|175|(1:177)(1:179)|178))|187|(1:189)|190|(1:192)(1:331)|(4:197|(4:200|(3:202|203|(3:205|206|(3:208|209|211)(1:321))(1:323))(1:328)|322|198)|329|212)|330|(1:215)|216|(1:218)|219|(2:223|(4:225|(1:227)|228|(29:236|(1:238)(1:319)|239|(1:241)|242|243|(2:245|(1:247))|248|(3:250|(1:252)|253)(1:318)|254|(1:258)|259|(1:261)|262|(4:265|(2:271|272)|273|263)|277|278|279|280|281|(2:282|(2:284|(1:286)(1:301))(3:302|303|(1:308)(1:307)))|287|288|289|290|(1:292)(2:297|298)|293|294|295)))|320|243|(0)|248|(0)(0)|254|(2:256|258)|259|(0)|262|(1:263)|277|278|279|280|281|(3:282|(0)(0)|301)|287|288|289|290|(0)(0)|293|294|295) */
    /* JADX WARN: Can't wrap try/catch for region: R(69:(2:70|(3:72|(1:74)|75))|76|(2:78|(3:80|(1:82)|83))|84|85|(1:87)|88|(2:92|(1:94))|95|(2:101|(2:103|104))|107|108|109|110|(3:111|112|113)|114|(1:116)|117|(2:119|(1:123)(1:122))(1:332)|124|(1:126)|127|(1:129)|130|(1:132)|133|(1:135)|136|(1:138)|139|(1:141)|142|(6:146|(1:150)|151|(1:153)(1:186)|154|(1:156)(15:157|(1:159)(1:185)|160|(1:162)(1:184)|163|(1:165)(1:183)|166|(1:168)(1:182)|169|(1:171)(1:181)|172|(1:174)(1:180)|175|(1:177)(1:179)|178))|187|(1:189)|190|(1:192)(1:331)|(4:197|(4:200|(3:202|203|(3:205|206|(3:208|209|211)(1:321))(1:323))(1:328)|322|198)|329|212)|330|(1:215)|216|(1:218)|219|(2:223|(4:225|(1:227)|228|(29:236|(1:238)(1:319)|239|(1:241)|242|243|(2:245|(1:247))|248|(3:250|(1:252)|253)(1:318)|254|(1:258)|259|(1:261)|262|(4:265|(2:271|272)|273|263)|277|278|279|280|281|(2:282|(2:284|(1:286)(1:301))(3:302|303|(1:308)(1:307)))|287|288|289|290|(1:292)(2:297|298)|293|294|295)))|320|243|(0)|248|(0)(0)|254|(2:256|258)|259|(0)|262|(1:263)|277|278|279|280|281|(3:282|(0)(0)|301)|287|288|289|290|(0)(0)|293|294|295) */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x07f8, code lost:
    
        if (r12.isEmpty() == false) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x0b41, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x0b42, code lost:
    
        r2.zzu.zzaV().zzb().zzc("Error storing raw event. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r16.zza), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x0b73, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:317:0x0b75, code lost:
    
        zzaV().zzb().zzc("Data loss. Failed to insert raw event metadata. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r4.zzK()), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x02a8, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:384:0x02aa, code lost:
    
        r8.zzu.zzaV().zzb().zzc("Error pruning currencies. appId", com.google.android.gms.measurement.internal.zzgu.zzl(r15), r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x053e A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x057e A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0631 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x063c A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0647 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0652 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x065e A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x066f A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x06c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x06d5  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x06d7 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0744 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x076a A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x079d A[Catch: all -> 0x0bbb, TRY_LEAVE, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:215:0x07fd A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x080d A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0844 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0901 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0918 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0983 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x09a4 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x09c0 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0a82 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0b28 A[Catch: SQLiteException -> 0x0b41, all -> 0x0bbb, TRY_LEAVE, TryCatch #6 {SQLiteException -> 0x0b41, blocks: (B:290:0x0b19, B:292:0x0b28), top: B:289:0x0b19, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0b3c  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0a91 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x076f A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:332:0x05ed A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:340:0x032f A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:353:0x01a5 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0216 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:376:0x02e0 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0204 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0398 A[Catch: all -> 0x0bbb, TryCatch #7 {all -> 0x0bbb, blocks: (B:42:0x0157, B:45:0x0168, B:47:0x0170, B:51:0x017a, B:58:0x0319, B:61:0x0352, B:63:0x0398, B:65:0x039d, B:66:0x03b4, B:70:0x03bf, B:72:0x03d7, B:74:0x03dc, B:75:0x03f3, B:78:0x0417, B:82:0x0438, B:83:0x044f, B:84:0x0458, B:87:0x0477, B:88:0x048b, B:90:0x0495, B:92:0x04a1, B:94:0x04a7, B:95:0x04ae, B:97:0x04bb, B:99:0x04c3, B:101:0x04cb, B:104:0x04d5, B:107:0x04e1, B:109:0x04ee, B:112:0x0517, B:116:0x053e, B:117:0x0553, B:119:0x057e, B:122:0x0595, B:123:0x05d1, B:124:0x05f9, B:126:0x0631, B:127:0x0634, B:129:0x063c, B:130:0x063f, B:132:0x0647, B:133:0x064a, B:135:0x0652, B:136:0x0655, B:138:0x065e, B:139:0x0662, B:141:0x066f, B:142:0x0672, B:144:0x069e, B:146:0x06a8, B:150:0x06bf, B:154:0x06cc, B:157:0x06d7, B:160:0x06e4, B:163:0x06f1, B:166:0x06fe, B:169:0x070b, B:172:0x0718, B:175:0x0723, B:178:0x0730, B:187:0x073c, B:189:0x0744, B:190:0x0747, B:192:0x076a, B:194:0x0775, B:197:0x077d, B:198:0x0797, B:200:0x079d, B:203:0x07b1, B:206:0x07bd, B:209:0x07ca, B:326:0x07e4, B:212:0x07f4, B:215:0x07fd, B:216:0x0800, B:218:0x080d, B:219:0x0812, B:221:0x0830, B:223:0x0834, B:225:0x0844, B:227:0x084f, B:228:0x085a, B:230:0x0864, B:232:0x0870, B:234:0x087a, B:236:0x0880, B:238:0x0890, B:239:0x08a6, B:241:0x08ac, B:242:0x08b5, B:243:0x08c3, B:245:0x0901, B:247:0x090b, B:248:0x090e, B:250:0x0918, B:252:0x0936, B:253:0x0941, B:254:0x097b, B:256:0x0983, B:258:0x098d, B:259:0x099a, B:261:0x09a4, B:262:0x09b1, B:263:0x09ba, B:265:0x09c0, B:267:0x09fc, B:269:0x0a06, B:271:0x0a18, B:278:0x0a1e, B:280:0x0a62, B:281:0x0a6f, B:282:0x0a7c, B:284:0x0a82, B:288:0x0ace, B:290:0x0b19, B:292:0x0b28, B:293:0x0b8a, B:298:0x0b3e, B:300:0x0b42, B:303:0x0a91, B:305:0x0abb, B:312:0x0b5b, B:313:0x0b72, B:317:0x0b75, B:331:0x076f, B:332:0x05ed, B:336:0x0523, B:340:0x032f, B:341:0x0336, B:343:0x033c, B:346:0x034c, B:351:0x0197, B:353:0x01a5, B:355:0x01ba, B:360:0x01da, B:363:0x0210, B:365:0x0216, B:367:0x0224, B:369:0x0239, B:372:0x0240, B:374:0x02d6, B:376:0x02e0, B:377:0x026d, B:379:0x028f, B:380:0x02bd, B:384:0x02aa, B:386:0x01e6, B:388:0x0204), top: B:41:0x0157, inners: #0, #3, #4, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzH(zzbg zzbgVar, zzr zzrVar) {
        boolean z;
        String zzd;
        String str;
        String str2;
        long longValue;
        String str3;
        String str4;
        zzbg zzbgVar2;
        String str5;
        zzpn zzpnVar;
        zzpn zzpnVar2;
        zzbe zzbeVar;
        long j;
        long zzH;
        String str6;
        long j2;
        zzbb zzbbVar;
        zzbc zzf;
        zzbc zza;
        String str7;
        com.google.android.gms.internal.measurement.zzic zzaE;
        String str8;
        String str9;
        String str10;
        long j3;
        String str11;
        zzjl zzs;
        long j4;
        Map emptyMap;
        ArrayList arrayList;
        String str12;
        zzjl zzs2;
        zzjk zzjkVar;
        zzbb zzbbVar2;
        zzjl zzjlVar;
        zzic zzicVar;
        zzh zzu;
        zzjl zzjlVar2;
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
        long j5;
        zzpn zzm;
        Preconditions.checkNotNull(zzrVar);
        String str13 = zzrVar.zza;
        Preconditions.checkNotEmpty(str13);
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
            String str14 = zzbgVar.zza;
            if (zzh.zzj(str13, str14)) {
                zzaV().zze().zzc("Dropping blocked event. appId", zzgu.zzl(str13), this.zzn.zzl().zza(str14));
                if (!zzh().zzn(str13) && !zzh().zzo(str13)) {
                    if ("_err".equals(str14)) {
                        return;
                    }
                    zzt().zzN(this.zzK, str13, 11, "_ev", str14, 0);
                    return;
                }
                zzh zzu3 = zzj().zzu(str13);
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
            zzgv zza2 = zzgv.zza(zzbgVar);
            zzt().zzG(zza2, zzd().zzd(str13));
            int zzn2 = zzd().zzn(str13, zzfy.zzag, 10, 35);
            Bundle bundle = zza2.zzd;
            for (String str15 : new TreeSet(bundle.keySet())) {
                if (FirebaseAnalytics.Param.ITEMS.equals(str15)) {
                    zzt().zzH(bundle.getParcelableArray(str15), zzn2);
                }
            }
            zzbg zzb2 = zza2.zzb();
            if (Log.isLoggable(zzaV().zzn(), 2)) {
                zzaV().zzk().zzb("Logging event", this.zzn.zzl().zzd(zzb2));
            }
            zzj().zzb();
            try {
                zzao(zzrVar);
                String str16 = zzb2.zza;
                if (!"ecommerce_purchase".equals(str16) && !FirebaseAnalytics.Event.PURCHASE.equals(str16) && !FirebaseAnalytics.Event.REFUND.equals(str16)) {
                    z = false;
                    if (!"_iap".equals(str16)) {
                        if (!z) {
                            str3 = "value";
                            str = "app_id";
                            str2 = "_fx";
                            str4 = "raw_events";
                            zzbgVar2 = zzb2;
                            str5 = "_err";
                            String str17 = zzbgVar2.zza;
                            boolean zzh2 = zzpp.zzh(str17);
                            boolean equals = str5.equals(str17);
                            zzt();
                            zzbeVar = zzbgVar2.zzb;
                            if (zzbeVar == null) {
                                j = 0;
                            } else {
                                zzbd zzbdVar2 = new zzbd(zzbeVar);
                                j = 0;
                                while (zzbdVar2.hasNext()) {
                                    String next = zzbdVar2.next();
                                    String str18 = next;
                                    if (zzbeVar.zza(next) instanceof Parcelable[]) {
                                        j += ((Parcelable[]) r11).length;
                                    }
                                }
                            }
                            zzbg zzbgVar3 = zzbgVar2;
                            zzar zzx = zzj().zzx(zzC(), str13, j + 1, true, zzh2, false, equals, false, false, false);
                            long j6 = zzx.zzb;
                            zzd();
                            zzH = j6 - zzal.zzH();
                            if (zzH > 0) {
                                if (zzH % 1000 == 1) {
                                    zzaV().zzb().zzc("Data loss. Too many events logged. appId, count", zzgu.zzl(str13), Long.valueOf(zzx.zzb));
                                }
                                zzj().zzc();
                            } else {
                                if (zzh2) {
                                    long j7 = zzx.zza;
                                    zzd();
                                    long intValue = j7 - ((Integer) zzfy.zzm.zzb(null)).intValue();
                                    if (intValue > 0) {
                                        if (intValue % 1000 == 1) {
                                            zzaV().zzb().zzc("Data loss. Too many public events logged. appId, count", zzgu.zzl(str13), Long.valueOf(zzx.zza));
                                        }
                                        zzt().zzN(this.zzK, str13, 16, "_ev", zzbgVar3.zza, 0);
                                        zzj().zzc();
                                    }
                                }
                                if (equals) {
                                    long max = zzx.zzd - Math.max(0, Math.min(1000000, zzd().zzm(zzrVar.zza, zzfy.zzl)));
                                    if (max > 0) {
                                        if (max == 1) {
                                            zzaV().zzb().zzc("Too many error events logged. appId, count", zzgu.zzl(str13), Long.valueOf(zzx.zzd));
                                        }
                                        zzj().zzc();
                                    }
                                }
                                Bundle zzf2 = zzbeVar.zzf();
                                zzpp zzt = zzt();
                                String str19 = zzbgVar3.zzc;
                                zzt.zzM(zzf2, "_o", str19);
                                if (zzt().zzaa(str13, zzrVar.zzB)) {
                                    zzt().zzM(zzf2, "_dbg", 1L);
                                    zzt().zzM(zzf2, "_r", 1L);
                                }
                                if ("_s".equals(str17) && (zzm = zzj().zzm(zzrVar.zza, "_sno")) != null) {
                                    Object obj = zzm.zze;
                                    if (obj instanceof Long) {
                                        zzt().zzM(zzf2, "_sno", obj);
                                    }
                                }
                                if (zzd().zzp(null, zzfy.zzaX) && Objects.equals(str19, "am") && Objects.equals(str17, "_ai")) {
                                    String str20 = str3;
                                    Object obj2 = zzf2.get(str20);
                                    if (obj2 instanceof String) {
                                        try {
                                            double parseDouble = Double.parseDouble((String) obj2);
                                            zzf2.remove(str20);
                                            zzf2.putDouble(str20, parseDouble);
                                        } catch (NumberFormatException unused) {
                                        }
                                    }
                                }
                                zzav zzj3 = zzj();
                                Preconditions.checkNotEmpty(str13);
                                zzj3.zzg();
                                zzj3.zzaw();
                                try {
                                    str6 = str4;
                                } catch (SQLiteException e) {
                                    e = e;
                                    str6 = str4;
                                }
                                try {
                                    try {
                                        j2 = zzj3.zze().delete(str6, "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str13, String.valueOf(Math.max(0, Math.min(1000000, zzj3.zzu.zzc().zzm(str13, zzfy.zzp))))});
                                    } catch (SQLiteException e2) {
                                        e = e2;
                                        zzj3.zzu.zzaV().zzb().zzc("Error deleting over the limit events. appId", zzgu.zzl(str13), e);
                                        j2 = 0;
                                        if (j2 > 0) {
                                        }
                                        zzic zzicVar2 = this.zzn;
                                        zzbbVar = new zzbb(zzicVar2, zzbgVar3.zzc, str13, zzbgVar3.zza, zzbgVar3.zzd, 0L, zzf2);
                                        zzav zzj4 = zzj();
                                        String str21 = zzbbVar.zzb;
                                        zzf = zzj4.zzf(str13, str21);
                                        if (zzf == null) {
                                        }
                                        zzj().zzh(zza);
                                        zzaW().zzg();
                                        zzu();
                                        Preconditions.checkNotNull(zzbbVar);
                                        Preconditions.checkNotNull(zzrVar);
                                        String str22 = zzbbVar.zza;
                                        Preconditions.checkNotEmpty(str22);
                                        str7 = zzrVar.zza;
                                        Preconditions.checkArgument(str22.equals(str7));
                                        zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                        zzaE.zza(1);
                                        zzaE.zzC("android");
                                        if (!TextUtils.isEmpty(str7)) {
                                        }
                                        str8 = zzrVar.zzd;
                                        if (!TextUtils.isEmpty(str8)) {
                                        }
                                        str9 = zzrVar.zzc;
                                        if (!TextUtils.isEmpty(str9)) {
                                        }
                                        str10 = zzrVar.zzu;
                                        if (!TextUtils.isEmpty(str10)) {
                                        }
                                        j3 = zzrVar.zzj;
                                        if (j3 != -2147483648L) {
                                        }
                                        zzaE.zzN(zzrVar.zze);
                                        str11 = zzrVar.zzb;
                                        if (!TextUtils.isEmpty(str11)) {
                                        }
                                        zzs = zzB((String) Preconditions.checkNotNull(str7)).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                        zzaE.zzat(zzs.zzk());
                                        zzqp.zza();
                                        if (zzd().zzp(str7, zzfy.zzaP)) {
                                            zzaE.zzaH(zzrVar.zzz);
                                            j5 = zzrVar.zzA;
                                            if (!zzs.zzo(zzjk.AD_STORAGE)) {
                                                j5 = (j5 & (-2)) | 32;
                                            }
                                            zzaE.zzaz(j5 != 1);
                                            if (j5 == 0) {
                                            }
                                        }
                                        j4 = zzrVar.zzf;
                                        if (j4 != 0) {
                                        }
                                        zzaE.zzar(zzrVar.zzq);
                                        zzpk zzp = zzp();
                                        com.google.android.gms.internal.measurement.zzjr zza3 = com.google.android.gms.internal.measurement.zzjr.zza(zzp.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement"), zzfu.zza);
                                        if (zza3 != null) {
                                        }
                                        if (emptyMap != null) {
                                            arrayList = new ArrayList();
                                            int intValue2 = ((Integer) zzfy.zzaf.zzb(null)).intValue();
                                            while (r9.hasNext()) {
                                            }
                                        }
                                        arrayList = null;
                                        if (arrayList != null) {
                                        }
                                        if (zzd().zzp(null, zzfy.zzba)) {
                                        }
                                        str12 = zzrVar.zza;
                                        zzs2 = zzB((String) Preconditions.checkNotNull(str12)).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                        zzjkVar = zzjk.AD_STORAGE;
                                        if (zzs2.zzo(zzjkVar)) {
                                            zzc = this.zzk.zzc(str12, zzs2);
                                            if (!TextUtils.isEmpty((CharSequence) zzc.first)) {
                                            }
                                        }
                                        zzbbVar2 = zzbbVar;
                                        zzjlVar = zzs2;
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
                                        zzu = zzj().zzu(str12);
                                        if (zzu == null) {
                                        }
                                        if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE)) {
                                        }
                                        if (!TextUtils.isEmpty(zzu.zzl())) {
                                        }
                                        zzn = zzj().zzn(str12);
                                        while (i2 < zzn.size()) {
                                        }
                                        zzj = zzj();
                                        zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE.zzbc();
                                        zzj.zzg();
                                        zzj.zzaw();
                                        Preconditions.checkNotNull(zzidVar);
                                        Preconditions.checkNotEmpty(zzidVar.zzA());
                                        byte[] zzcc = zzidVar.zzcc();
                                        long zzt2 = zzj.zzg.zzp().zzt(zzcc);
                                        ContentValues contentValues2 = new ContentValues();
                                        String str23 = str;
                                        contentValues2.put(str23, zzidVar.zzA());
                                        contentValues2.put("metadata_fingerprint", Long.valueOf(zzt2));
                                        contentValues2.put("metadata", zzcc);
                                        zzbb zzbbVar3 = zzbbVar2;
                                        zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues2, 4);
                                        zzj2 = zzj();
                                        zzbdVar = new zzbd(zzbbVar3.zzf);
                                        while (true) {
                                            if (zzbdVar.hasNext()) {
                                            }
                                        }
                                        i3 = 1;
                                        zzj2.zzg();
                                        zzj2.zzaw();
                                        Preconditions.checkNotNull(zzbbVar3);
                                        String str24 = zzbbVar3.zza;
                                        Preconditions.checkNotEmpty(str24);
                                        byte[] zzcc2 = zzj2.zzg.zzp().zzh(zzbbVar3).zzcc();
                                        contentValues = new ContentValues();
                                        contentValues.put(str23, str24);
                                        contentValues.put("name", zzbbVar3.zzb);
                                        contentValues.put("timestamp", Long.valueOf(zzbbVar3.zzd));
                                        contentValues.put("metadata_fingerprint", Long.valueOf(zzt2));
                                        contentValues.put("data", zzcc2);
                                        contentValues.put("realtime", Integer.valueOf(i3));
                                        if (zzj2.zze().insert(str6, null, contentValues) == -1) {
                                        }
                                        zzj().zzc();
                                        zzj().zzd();
                                        zzaL();
                                        zzaV().zzk().zzb("Background event processing time, ms", Long.valueOf(((System.nanoTime() - nanoTime) + 500000) / 1000000));
                                        return;
                                    }
                                    if (zzs2.zzo(zzjkVar) && zzrVar.zzn) {
                                        zzc = this.zzk.zzc(str12, zzs2);
                                        if (!TextUtils.isEmpty((CharSequence) zzc.first)) {
                                            zzaE.zzQ((String) zzc.first);
                                            if (zzc.second != null) {
                                                zzaE.zzT(((Boolean) zzc.second).booleanValue());
                                            }
                                            String str25 = str2;
                                            if (!zzbbVar.zzb.equals(str25) && !((String) zzc.first).equals("00000000-0000-0000-0000-000000000000") && (zzu2 = zzj().zzu(str12)) != null && zzu2.zzaq()) {
                                                zzR(str12, false, null, null);
                                                Bundle bundle2 = new Bundle();
                                                Long zzas = zzu2.zzas();
                                                if (zzas != null) {
                                                    zzjlVar = zzs2;
                                                    long longValue2 = zzas.longValue();
                                                    zzbbVar2 = zzbbVar;
                                                    bundle2.putLong("_pfo", Math.max(0L, longValue2));
                                                } else {
                                                    zzbbVar2 = zzbbVar;
                                                    zzjlVar = zzs2;
                                                }
                                                Long zzau = zzu2.zzau();
                                                if (zzau != null) {
                                                    bundle2.putLong("_uwa", zzau.longValue());
                                                }
                                                bundle2.putLong("_r", 1L);
                                                this.zzK.zza(str12, str25, bundle2);
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
                                                zzu = zzj().zzu(str12);
                                                if (zzu == null) {
                                                    zzu = new zzh(zzicVar, str12);
                                                    zzjlVar2 = zzjlVar;
                                                    zzu.zze(zzK(zzjlVar2));
                                                    zzu.zzm(zzrVar.zzk);
                                                    zzu.zzg(zzrVar.zzb);
                                                    if (zzjlVar2.zzo(zzjkVar)) {
                                                        zzu.zzk(this.zzk.zzf(str12, zzrVar.zzn));
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
                                                    zzjlVar2 = zzjlVar;
                                                    i = 0;
                                                }
                                                if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE) && !TextUtils.isEmpty(zzu.zzd())) {
                                                    zzaE.zzW((String) Preconditions.checkNotNull(zzu.zzd()));
                                                }
                                                if (!TextUtils.isEmpty(zzu.zzl())) {
                                                    zzaE.zzah((String) Preconditions.checkNotNull(zzu.zzl()));
                                                }
                                                zzn = zzj().zzn(str12);
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
                                                Preconditions.checkNotNull(zzidVar);
                                                Preconditions.checkNotEmpty(zzidVar.zzA());
                                                byte[] zzcc3 = zzidVar.zzcc();
                                                long zzt22 = zzj.zzg.zzp().zzt(zzcc3);
                                                ContentValues contentValues22 = new ContentValues();
                                                String str232 = str;
                                                contentValues22.put(str232, zzidVar.zzA());
                                                contentValues22.put("metadata_fingerprint", Long.valueOf(zzt22));
                                                contentValues22.put("metadata", zzcc3);
                                                zzbb zzbbVar32 = zzbbVar2;
                                                zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                                zzj2 = zzj();
                                                zzbdVar = new zzbd(zzbbVar32.zzf);
                                                while (true) {
                                                    if (zzbdVar.hasNext()) {
                                                        String next2 = zzbdVar.next();
                                                        String str26 = next2;
                                                        if ("_r".equals(next2)) {
                                                            break;
                                                        }
                                                    } else {
                                                        zzht zzh3 = zzh();
                                                        String str27 = zzbbVar32.zza;
                                                        boolean zzk = zzh3.zzk(str27, zzbbVar32.zzb);
                                                        zzar zzw = zzj().zzw(zzC(), str27, false, false, false, false, false, false, false);
                                                        if (!zzk || zzw.zze >= zzd().zzm(str27, zzfy.zzo)) {
                                                            i3 = 0;
                                                        }
                                                    }
                                                }
                                                i3 = 1;
                                                zzj2.zzg();
                                                zzj2.zzaw();
                                                Preconditions.checkNotNull(zzbbVar32);
                                                String str242 = zzbbVar32.zza;
                                                Preconditions.checkNotEmpty(str242);
                                                byte[] zzcc22 = zzj2.zzg.zzp().zzh(zzbbVar32).zzcc();
                                                contentValues = new ContentValues();
                                                contentValues.put(str232, str242);
                                                contentValues.put("name", zzbbVar32.zzb);
                                                contentValues.put("timestamp", Long.valueOf(zzbbVar32.zzd));
                                                contentValues.put("metadata_fingerprint", Long.valueOf(zzt22));
                                                contentValues.put("data", zzcc22);
                                                contentValues.put("realtime", Integer.valueOf(i3));
                                                if (zzj2.zze().insert(str6, null, contentValues) == -1) {
                                                    zzj2.zzu.zzaV().zzb().zzb("Failed to insert raw event (got -1). appId", zzgu.zzl(str242));
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
                                    zzbb zzbbVar322 = zzbbVar2;
                                    zzj.zze().insertWithOnConflict("raw_events_metadata", null, contentValues22, 4);
                                    zzj2 = zzj();
                                    zzbdVar = new zzbd(zzbbVar322.zzf);
                                    while (true) {
                                        if (zzbdVar.hasNext()) {
                                        }
                                    }
                                    i3 = 1;
                                    zzj2.zzg();
                                    zzj2.zzaw();
                                    Preconditions.checkNotNull(zzbbVar322);
                                    String str2422 = zzbbVar322.zza;
                                    Preconditions.checkNotEmpty(str2422);
                                    byte[] zzcc222 = zzj2.zzg.zzp().zzh(zzbbVar322).zzcc();
                                    contentValues = new ContentValues();
                                    contentValues.put(str232, str2422);
                                    contentValues.put("name", zzbbVar322.zzb);
                                    contentValues.put("timestamp", Long.valueOf(zzbbVar322.zzd));
                                    contentValues.put("metadata_fingerprint", Long.valueOf(zzt22));
                                    contentValues.put("data", zzcc222);
                                    contentValues.put("realtime", Integer.valueOf(i3));
                                    if (zzj2.zze().insert(str6, null, contentValues) == -1) {
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
                                if (j2 > 0) {
                                    zzaV().zze().zzc("Data lost. Too many events stored on disk, deleted. appId", zzgu.zzl(str13), Long.valueOf(j2));
                                }
                                zzic zzicVar22 = this.zzn;
                                zzbbVar = new zzbb(zzicVar22, zzbgVar3.zzc, str13, zzbgVar3.zza, zzbgVar3.zzd, 0L, zzf2);
                                zzav zzj42 = zzj();
                                String str212 = zzbbVar.zzb;
                                zzf = zzj42.zzf(str13, str212);
                                if (zzf == null) {
                                    zzbbVar = zzbbVar.zza(zzicVar22, zzf.zzf);
                                    zza = zzf.zza(zzbbVar.zzd);
                                } else if (zzj().zzS(str13) < zzd().zzh(str13) || !zzh2) {
                                    zza = new zzbc(str13, str212, 0L, 0L, 0L, zzbbVar.zzd, 0L, null, null, null, null);
                                } else {
                                    zzaV().zzb().zzd("Too many event names used, ignoring event. appId, name, supported count", zzgu.zzl(str13), zzicVar22.zzl().zza(str212), Integer.valueOf(zzd().zzh(str13)));
                                    zzt().zzN(this.zzK, str13, 8, null, null, 0);
                                }
                                zzj().zzh(zza);
                                zzaW().zzg();
                                zzu();
                                Preconditions.checkNotNull(zzbbVar);
                                Preconditions.checkNotNull(zzrVar);
                                String str222 = zzbbVar.zza;
                                Preconditions.checkNotEmpty(str222);
                                str7 = zzrVar.zza;
                                Preconditions.checkArgument(str222.equals(str7));
                                zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                                zzaE.zza(1);
                                zzaE.zzC("android");
                                if (!TextUtils.isEmpty(str7)) {
                                    zzaE.zzL(str7);
                                }
                                str8 = zzrVar.zzd;
                                if (!TextUtils.isEmpty(str8)) {
                                    zzaE.zzJ(str8);
                                }
                                str9 = zzrVar.zzc;
                                if (!TextUtils.isEmpty(str9)) {
                                    zzaE.zzM(str9);
                                }
                                str10 = zzrVar.zzu;
                                if (!TextUtils.isEmpty(str10)) {
                                    zzaE.zzau(str10);
                                }
                                j3 = zzrVar.zzj;
                                if (j3 != -2147483648L) {
                                    zzaE.zzaj((int) j3);
                                }
                                zzaE.zzN(zzrVar.zze);
                                str11 = zzrVar.zzb;
                                if (!TextUtils.isEmpty(str11)) {
                                    zzaE.zzad(str11);
                                }
                                zzs = zzB((String) Preconditions.checkNotNull(str7)).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                zzaE.zzat(zzs.zzk());
                                zzqp.zza();
                                if (zzd().zzp(str7, zzfy.zzaP) && zzt().zzX(str7)) {
                                    zzaE.zzaH(zzrVar.zzz);
                                    j5 = zzrVar.zzA;
                                    if (!zzs.zzo(zzjk.AD_STORAGE) && j5 != 0) {
                                        j5 = (j5 & (-2)) | 32;
                                    }
                                    zzaE.zzaz(j5 != 1);
                                    if (j5 == 0) {
                                        com.google.android.gms.internal.measurement.zzhd zzh4 = com.google.android.gms.internal.measurement.zzhe.zzh();
                                        zzh4.zza((j5 & 1) != 0);
                                        zzh4.zzb((2 & j5) != 0);
                                        zzh4.zzc((4 & j5) != 0);
                                        zzh4.zzd((8 & j5) != 0);
                                        zzh4.zze((16 & j5) != 0);
                                        zzh4.zzf((32 & j5) != 0);
                                        zzh4.zzg((64 & j5) != 0);
                                        zzaE.zzaI((com.google.android.gms.internal.measurement.zzhe) zzh4.zzbc());
                                    }
                                }
                                j4 = zzrVar.zzf;
                                if (j4 != 0) {
                                    zzaE.zzY(j4);
                                }
                                zzaE.zzar(zzrVar.zzq);
                                zzpk zzp2 = zzp();
                                com.google.android.gms.internal.measurement.zzjr zza32 = com.google.android.gms.internal.measurement.zzjr.zza(zzp2.zzg.zzn.zzaY().getContentResolver(), com.google.android.gms.internal.measurement.zzkb.zza("com.google.android.gms.measurement"), zzfu.zza);
                                emptyMap = zza32 != null ? Collections.emptyMap() : zza32.zzb();
                                if (emptyMap != null && !emptyMap.isEmpty()) {
                                    arrayList = new ArrayList();
                                    int intValue22 = ((Integer) zzfy.zzaf.zzb(null)).intValue();
                                    for (Map.Entry entry : emptyMap.entrySet()) {
                                        if (((String) entry.getKey()).startsWith("measurement.id.")) {
                                            try {
                                                int parseInt = Integer.parseInt((String) entry.getValue());
                                                if (parseInt != 0) {
                                                    arrayList.add(Integer.valueOf(parseInt));
                                                    if (arrayList.size() >= intValue22) {
                                                        zzp2.zzu.zzaV().zze().zzb("Too many experiment IDs. Number of IDs", Integer.valueOf(arrayList.size()));
                                                        break;
                                                    }
                                                    continue;
                                                } else {
                                                    continue;
                                                }
                                            } catch (NumberFormatException e4) {
                                                zzp2.zzu.zzaV().zze().zzb("Experiment ID NumberFormatException", e4);
                                            }
                                        }
                                    }
                                }
                                arrayList = null;
                                if (arrayList != null) {
                                    zzaE.zzaq(arrayList);
                                }
                                if (zzd().zzp(null, zzfy.zzba)) {
                                    zzaE.zzaP("");
                                }
                                str12 = zzrVar.zza;
                                zzs2 = zzB((String) Preconditions.checkNotNull(str12)).zzs(zzjl.zzf(zzrVar.zzs, 100));
                                zzjkVar = zzjk.AD_STORAGE;
                                zzbbVar2 = zzbbVar;
                                zzjlVar = zzs2;
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
                                zzu = zzj().zzu(str12);
                                if (zzu == null) {
                                }
                                if (zzjlVar2.zzo(zzjk.ANALYTICS_STORAGE)) {
                                    zzaE.zzW((String) Preconditions.checkNotNull(zzu.zzd()));
                                }
                                if (!TextUtils.isEmpty(zzu.zzl())) {
                                }
                                zzn = zzj().zzn(str12);
                                while (i2 < zzn.size()) {
                                }
                                zzj = zzj();
                                zzidVar = (com.google.android.gms.internal.measurement.zzid) zzaE.zzbc();
                                zzj.zzg();
                                zzj.zzaw();
                                Preconditions.checkNotNull(zzidVar);
                                Preconditions.checkNotEmpty(zzidVar.zzA());
                                byte[] zzcc32 = zzidVar.zzcc();
                                long zzt222 = zzj.zzg.zzp().zzt(zzcc32);
                                ContentValues contentValues222 = new ContentValues();
                                String str2322 = str;
                                contentValues222.put(str2322, zzidVar.zzA());
                                contentValues222.put("metadata_fingerprint", Long.valueOf(zzt222));
                                contentValues222.put("metadata", zzcc32);
                            }
                        }
                        z = true;
                    }
                    zzbe zzbeVar2 = zzb2.zzb;
                    zzd = zzbeVar2.zzd("currency");
                    if (z) {
                        str = "app_id";
                        str2 = "_fx";
                        longValue = zzbeVar2.zzb("value").longValue();
                    } else {
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
                            zzaV().zze().zzc("Data lost. Currency value is too big. appId", zzgu.zzl(str13), Double.valueOf(doubleValue));
                            zzj().zzc();
                        } else {
                            longValue = Math.round(doubleValue);
                            if (FirebaseAnalytics.Event.REFUND.equals(str16)) {
                                longValue = -longValue;
                            }
                        }
                    }
                    if (!TextUtils.isEmpty(zzd)) {
                        String upperCase = zzd.toUpperCase(Locale.US);
                        if (upperCase.matches("[A-Z]{3}")) {
                            String.valueOf(upperCase);
                            String concat = "_ltv_".concat(String.valueOf(upperCase));
                            zzpn zzm3 = zzj().zzm(str13, concat);
                            if (zzm3 != null && (zzm3.zze instanceof Long)) {
                                str3 = "value";
                                str4 = "raw_events";
                                zzbgVar2 = zzb2;
                                str5 = "_err";
                                zzpnVar = new zzpn(str13, zzb2.zzc, concat, zzaZ().currentTimeMillis(), Long.valueOf(((Long) zzm3.zze).longValue() + longValue));
                                zzpnVar2 = zzpnVar;
                                if (!zzj().zzl(zzpnVar2)) {
                                    zzaV().zzb().zzd("Too many unique user properties are set. Ignoring user property. appId", zzgu.zzl(str13), this.zzn.zzl().zzc(zzpnVar2.zzc), zzpnVar2.zze);
                                    zzt().zzN(this.zzK, str13, 9, null, null, 0);
                                }
                                String str172 = zzbgVar2.zza;
                                boolean zzh22 = zzpp.zzh(str172);
                                boolean equals2 = str5.equals(str172);
                                zzt();
                                zzbeVar = zzbgVar2.zzb;
                                if (zzbeVar == null) {
                                }
                                zzbg zzbgVar32 = zzbgVar2;
                                zzar zzx2 = zzj().zzx(zzC(), str13, j + 1, true, zzh22, false, equals2, false, false, false);
                                long j62 = zzx2.zzb;
                                zzd();
                                zzH = j62 - zzal.zzH();
                                if (zzH > 0) {
                                }
                            }
                            str3 = "value";
                            str4 = "raw_events";
                            zzbgVar2 = zzb2;
                            str5 = "_err";
                            zzav zzj5 = zzj();
                            int zzm4 = zzd().zzm(str13, zzfy.zzT) - 1;
                            Preconditions.checkNotEmpty(str13);
                            zzj5.zzg();
                            zzj5.zzaw();
                            zzj5.zze().execSQL("delete from user_attributes where app_id=? and name in (select name from user_attributes where app_id=? and name like '!_ltv!_%' escape '!'order by set_timestamp desc limit ?,10);", new String[]{str13, str13, String.valueOf(zzm4)});
                            zzpnVar = new zzpn(str13, zzbgVar2.zzc, concat, zzaZ().currentTimeMillis(), Long.valueOf(longValue));
                            zzpnVar2 = zzpnVar;
                            if (!zzj().zzl(zzpnVar2)) {
                            }
                            String str1722 = zzbgVar2.zza;
                            boolean zzh222 = zzpp.zzh(str1722);
                            boolean equals22 = str5.equals(str1722);
                            zzt();
                            zzbeVar = zzbgVar2.zzb;
                            if (zzbeVar == null) {
                            }
                            zzbg zzbgVar322 = zzbgVar2;
                            zzar zzx22 = zzj().zzx(zzC(), str13, j + 1, true, zzh222, false, equals22, false, false, false);
                            long j622 = zzx22.zzb;
                            zzd();
                            zzH = j622 - zzal.zzH();
                            if (zzH > 0) {
                            }
                        }
                    }
                    str3 = "value";
                    str4 = "raw_events";
                    zzbgVar2 = zzb2;
                    str5 = "_err";
                    String str17222 = zzbgVar2.zza;
                    boolean zzh2222 = zzpp.zzh(str17222);
                    boolean equals222 = str5.equals(str17222);
                    zzt();
                    zzbeVar = zzbgVar2.zzb;
                    if (zzbeVar == null) {
                    }
                    zzbg zzbgVar3222 = zzbgVar2;
                    zzar zzx222 = zzj().zzx(zzC(), str13, j + 1, true, zzh2222, false, equals222, false, false, false);
                    long j6222 = zzx222.zzb;
                    zzd();
                    zzH = j6222 - zzal.zzH();
                    if (zzH > 0) {
                    }
                }
                z = true;
                if (!"_iap".equals(str16)) {
                }
                zzbe zzbeVar22 = zzb2.zzb;
                zzd = zzbeVar22.zzd("currency");
                if (z) {
                }
                if (!TextUtils.isEmpty(zzd)) {
                }
                str3 = "value";
                str4 = "raw_events";
                zzbgVar2 = zzb2;
                str5 = "_err";
                String str172222 = zzbgVar2.zza;
                boolean zzh22222 = zzpp.zzh(str172222);
                boolean equals2222 = str5.equals(str172222);
                zzt();
                zzbeVar = zzbgVar2.zzb;
                if (zzbeVar == null) {
                }
                zzbg zzbgVar32222 = zzbgVar2;
                zzar zzx2222 = zzj().zzx(zzC(), str13, j + 1, true, zzh22222, false, equals2222, false, false, false);
                long j62222 = zzx2222.zzb;
                zzd();
                zzH = j62222 - zzal.zzH();
                if (zzH > 0) {
                }
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzI(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
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
        zzicVar.zzaD(((Boolean) Preconditions.checkNotNull(zzz.zzj())).booleanValue());
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
                    } else if (MBridgeConstans.DYNAMIC_VIEW_WX_APP.equals(str)) {
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

    final void zzJ(zzh zzhVar, com.google.android.gms.internal.measurement.zzic zzicVar) {
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

    final String zzK(zzjl zzjlVar) {
        if (!zzjlVar.zzo(zzjk.ANALYTICS_STORAGE)) {
            return null;
        }
        byte[] bArr = new byte[16];
        zzt().zzf().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    final void zzL(List list) {
        Preconditions.checkArgument(!list.isEmpty());
        if (this.zzz != null) {
            zzaV().zzb().zza("Set uploading progress before finishing the previous upload");
        } else {
            this.zzz = new ArrayList(list);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0128, code lost:
    
        r12.zzB = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0110, code lost:
    
        if (r8 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0125, code lost:
    
        if (r8 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0171, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0173, code lost:
    
        r0.close();
        r4 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        r0 = android.text.TextUtils.isEmpty(r8);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x019c, code lost:
    
        if (r0 != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x019e, code lost:
    
        r0 = zzj().zzu(r8);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01a6, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01a8, code lost:
    
        zzW(r0);
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x017b, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0195, code lost:
    
        if (r0 != 0) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v15, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0195 -> B:60:0x0173). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0195 -> B:61:0x0198). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzM() {
        zzav zzj;
        long zzF;
        SQLiteException e;
        zzav zzavVar;
        Cursor cursor;
        zzaW().zzg();
        zzu();
        ?? r0 = 1;
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
                    long currentTimeMillis = zzaZ().currentTimeMillis();
                    Cursor cursor2 = null;
                    r8 = null;
                    Cursor cursor3 = null;
                    r8 = null;
                    r8 = null;
                    r8 = null;
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
                            cursor2 = r0;
                        }
                        try {
                            r0 = zzj.zze().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf(zzF)});
                            try {
                                if (r0.moveToFirst()) {
                                    str = r0.getString(0);
                                    cursor = r0;
                                    zzavVar = zzj;
                                    zzj = zzj;
                                } else {
                                    zzj.zzu.zzaV().zzk().zza("No expired configs for apps with pending events");
                                    cursor = r0;
                                    zzavVar = zzj;
                                    zzj = zzj;
                                }
                            } catch (SQLiteException e2) {
                                e = e2;
                                zzgs zzb2 = zzj.zzu.zzaV().zzb();
                                ?? r4 = "Error selecting expired configs";
                                zzb2.zzb("Error selecting expired configs", e);
                                cursor = r0;
                                zzavVar = r4;
                                zzj = r4;
                            }
                        } catch (SQLiteException e3) {
                            e = e3;
                            r0 = 0;
                            zzgs zzb22 = zzj.zzu.zzaV().zzb();
                            ?? r42 = "Error selecting expired configs";
                            zzb22.zzb("Error selecting expired configs", e);
                            cursor = r0;
                            zzavVar = r42;
                            zzj = r42;
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            throw th;
                        }
                    } else {
                        if (this.zzB == -1) {
                            zzav zzj2 = zzj();
                            try {
                                try {
                                    cursor3 = zzj2.zze().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                                    if (cursor3.moveToFirst()) {
                                        j = cursor3.getLong(0);
                                    }
                                } catch (SQLiteException e4) {
                                    zzj2.zzu.zzaV().zzb().zzb("Error querying raw events", e4);
                                }
                            } finally {
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                            }
                        }
                        zzN(zzF3, currentTimeMillis);
                    }
                } else {
                    zzaV().zzk().zza("Network not connected, ignoring upload request");
                    zzaL();
                }
            }
        } finally {
            this.zzw = false;
            zzaM();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:315:0x0432, code lost:
    
        if (r1 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:316:0x0434, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x045b, code lost:
    
        if (r1 != null) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:356:0x01dd, code lost:
    
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:420:0x0200, code lost:
    
        if (r10 == null) goto L90;
     */
    /* JADX WARN: Removed duplicated region for block: B:185:0x06fd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x072a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:324:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:335:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09da  */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzN(String str, long j) {
        Cursor cursor;
        Cursor cursor2;
        List emptyList;
        List<Pair> list;
        String str2;
        boolean z;
        Object obj;
        long j2;
        String str3;
        zzot zzotVar;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        List list2;
        String str4;
        String str5;
        Cursor cursor3;
        Cursor cursor4;
        int i;
        int i2;
        SQLiteDatabase zze;
        long currentTimeMillis;
        byte[] blob;
        zzpk zzp;
        long j3;
        long j4;
        int zzm = zzd().zzm(str, zzfy.zzg);
        int i3 = 0;
        int max = Math.max(0, zzd().zzm(str, zzfy.zzh));
        zzav zzj = zzj();
        zzj.zzg();
        zzj.zzaw();
        int i4 = 1;
        Preconditions.checkArgument(zzm > 0);
        ?? r10 = max > 0 ? 1 : 0;
        Preconditions.checkArgument(r10);
        Preconditions.checkNotEmpty(str);
        try {
            try {
                cursor2 = zzj.zze().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(zzm));
                try {
                } catch (SQLiteException e) {
                    e = e;
                    zzj.zzu.zzaV().zzb().zzc("Error querying bundles. appId", zzgu.zzl(str), e);
                    emptyList = Collections.emptyList();
                }
            } catch (Throwable th) {
                th = th;
                cursor = r10;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursor2 = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor2.moveToFirst()) {
            list = new ArrayList();
            int i5 = 0;
            while (true) {
                long j5 = cursor2.getLong(i3);
                try {
                    blob = cursor2.getBlob(i4);
                    zzp = zzj.zzg.zzp();
                } catch (IOException e3) {
                    zzj.zzu.zzaV().zzb().zzc("Failed to unzip queued bundle. appId", zzgu.zzl(str), e3);
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
                        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
                        byteArrayOutputStream.write(bArr, 0, read);
                        byteArrayInputStream = byteArrayInputStream2;
                    }
                    gZIPInputStream.close();
                    byteArrayInputStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (!list.isEmpty() && byteArray.length + i5 > max) {
                        break;
                    }
                    try {
                        com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) zzpk.zzw(com.google.android.gms.internal.measurement.zzid.zzaE(), byteArray);
                        if (!list.isEmpty()) {
                            com.google.android.gms.internal.measurement.zzid zzidVar = (com.google.android.gms.internal.measurement.zzid) ((Pair) list.get(0)).first;
                            com.google.android.gms.internal.measurement.zzid zzidVar2 = (com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc();
                            if (!zzidVar.zzaf().equals(zzidVar2.zzaf()) || !zzidVar.zzam().equals(zzidVar2.zzam()) || zzidVar.zzao() != zzidVar2.zzao() || !zzidVar.zzaq().equals(zzidVar2.zzaq())) {
                                break;
                            }
                            Iterator it = zzidVar.zzf().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    j3 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zziu zziuVar = (com.google.android.gms.internal.measurement.zziu) it.next();
                                Iterator it2 = it;
                                if ("_npa".equals(zziuVar.zzc())) {
                                    j3 = zziuVar.zzg();
                                    break;
                                }
                                it = it2;
                            }
                            Iterator it3 = zzidVar2.zzf().iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    j4 = -1;
                                    break;
                                }
                                com.google.android.gms.internal.measurement.zziu zziuVar2 = (com.google.android.gms.internal.measurement.zziu) it3.next();
                                if ("_npa".equals(zziuVar2.zzc())) {
                                    j4 = zziuVar2.zzg();
                                    break;
                                }
                            }
                            if (j3 != j4) {
                                break;
                            }
                        }
                        if (!cursor2.isNull(2)) {
                            zzicVar.zzao(cursor2.getInt(2));
                        }
                        i5 += byteArray.length;
                        list.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar.zzbc(), Long.valueOf(j5)));
                    } catch (IOException e4) {
                        zzj.zzu.zzaV().zzb().zzc("Failed to merge queued bundle. appId", zzgu.zzl(str), e4);
                    }
                    if (!cursor2.moveToNext() || i5 > max) {
                        break;
                    }
                    i3 = 0;
                    i4 = 1;
                } catch (IOException e5) {
                    zzp.zzu.zzaV().zzb().zzb("Failed to ungzip content", e5);
                    throw e5;
                }
            }
            if (!list.isEmpty()) {
            }
        } else {
            emptyList = Collections.emptyList();
            if (cursor2 != null) {
                cursor2.close();
            }
            list = emptyList;
            if (!list.isEmpty()) {
                return;
            }
            com.google.android.gms.internal.measurement.zzpo.zza();
            zzal zzd = zzd();
            zzfx zzfxVar = zzfy.zzbh;
            if (zzd.zzp(null, zzfxVar)) {
                com.google.android.gms.internal.measurement.zzpo.zza();
                if (zzd().zzp(null, zzfxVar)) {
                    if (zzB(str).zzo(zzjk.ANALYTICS_STORAGE) || !zzh().zzB(str)) {
                        ArrayList arrayList = new ArrayList(list.size());
                        zzav zzj2 = zzj();
                        Preconditions.checkNotEmpty(str);
                        zzj2.zzg();
                        zzj2.zzaw();
                        List arrayList2 = new ArrayList();
                        try {
                            try {
                                zze = zzj2.zze();
                                currentTimeMillis = zzj2.zzu.zzaZ().currentTimeMillis();
                                str2 = "_f";
                                try {
                                    cursor4 = zze.query("no_data_mode_events", new String[]{"data"}, "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(currentTimeMillis)}, null, null, "rowid", null);
                                } catch (SQLiteException e6) {
                                    e = e6;
                                    cursor4 = null;
                                    zzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                                    arrayList2 = Collections.emptyList();
                                }
                            } catch (SQLiteException e7) {
                                e = e7;
                                str2 = "_f";
                            }
                            try {
                                try {
                                    if (cursor4.moveToFirst()) {
                                        do {
                                            try {
                                                arrayList2.add((com.google.android.gms.internal.measurement.zzhs) ((com.google.android.gms.internal.measurement.zzhr) zzpk.zzw(com.google.android.gms.internal.measurement.zzhs.zzk(), cursor4.getBlob(0))).zzbc());
                                            } catch (com.google.android.gms.internal.measurement.zzmr e8) {
                                                zzj2.zzu.zzaV().zzh().zzc("Failed to parse stored NO_DATA mode event, appId", zzgu.zzl(str), e8);
                                            }
                                        } while (cursor4.moveToNext());
                                        cursor4.close();
                                        int delete = zze.delete("no_data_mode_events", "app_id=? AND timestamp_millis <= CAST(? AS INTEGER)", new String[]{str, String.valueOf(currentTimeMillis)});
                                        zzgs zzk = zzj2.zzu.zzaV().zzk();
                                        StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 34);
                                        sb.append("Pruned ");
                                        sb.append(delete);
                                        sb.append(" NO_DATA mode events. appId");
                                        zzk.zzb(sb.toString(), str);
                                    }
                                } catch (SQLiteException e9) {
                                    e = e9;
                                    zzj2.zzu.zzaV().zzb().zzc("Error flushing NO_DATA mode events. appId", zzgu.zzl(str), e);
                                    arrayList2 = Collections.emptyList();
                                }
                                boolean z6 = true;
                                for (Pair pair : list) {
                                    com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) pair.first).zzcl();
                                    if (z6 && !arrayList2.isEmpty()) {
                                        List zzb2 = zzicVar2.zzb();
                                        zzicVar2.zzi();
                                        zzicVar2.zzh(arrayList2);
                                        zzicVar2.zzh(zzb2);
                                        z6 = false;
                                    }
                                    com.google.android.gms.internal.measurement.zzhh zzb3 = com.google.android.gms.internal.measurement.zzho.zzb();
                                    com.google.android.gms.internal.measurement.zzgf zzx = zzh().zzx(str);
                                    ArrayList arrayList3 = new ArrayList();
                                    if (zzx != null) {
                                        for (com.google.android.gms.internal.measurement.zzfu zzfuVar : zzx.zza()) {
                                            com.google.android.gms.internal.measurement.zzhk zza = com.google.android.gms.internal.measurement.zzhl.zza();
                                            int zzb4 = zzfuVar.zzb();
                                            zzji zzjiVar = zzji.UNINITIALIZED;
                                            int i6 = zzb4 - 1;
                                            if (i6 == 1) {
                                                i = 3;
                                                i2 = 2;
                                            } else if (i6 != 2) {
                                                i = 3;
                                                i2 = i6 != 3 ? i6 != 4 ? 1 : 5 : 4;
                                            } else {
                                                i = 3;
                                                i2 = 3;
                                            }
                                            zza.zza(i2);
                                            int zzd2 = zzfuVar.zzd() - 1;
                                            zza.zzb(zzd2 != 1 ? zzd2 != 2 ? 1 : i : 2);
                                            arrayList3.add((com.google.android.gms.internal.measurement.zzhl) zza.zzbc());
                                        }
                                    }
                                    zzb3.zza(arrayList3);
                                    zzicVar2.zzaQ(zzb3);
                                    arrayList.add(Pair.create((com.google.android.gms.internal.measurement.zzid) zzicVar2.zzbc(), (Long) pair.second));
                                }
                                list = arrayList;
                                if (list.isEmpty()) {
                                    return;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                cursor3 = cursor4;
                                if (cursor3 != null) {
                                    cursor3.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            cursor3 = null;
                            if (cursor3 != null) {
                            }
                            throw th;
                        }
                    } else {
                        List asList = Arrays.asList(((String) zzfy.zzbi.zzb(null)).split(","));
                        for (Pair pair2 : list) {
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
                                        Preconditions.checkNotNull(zzhsVar);
                                        Preconditions.checkNotEmpty(str);
                                        zzic zzicVar3 = zzj3.zzu;
                                        zzicVar3.zzaV().zzk().zzb("Caching events in NO_DATA mode", zzhsVar);
                                        ContentValues contentValues = new ContentValues();
                                        contentValues.put("app_id", str);
                                        contentValues.put("name", zzhsVar.zzd());
                                        contentValues.put("data", zzhsVar.zzcc());
                                        contentValues.put("timestamp_millis", Long.valueOf(zzhsVar.zzf()));
                                        try {
                                            if (zzj3.zze().insert("no_data_mode_events", null, contentValues) == -1) {
                                                try {
                                                    zzicVar3.zzaV().zzb().zzb("Failed to insert NO_DATA mode event (got -1). appId", zzgu.zzl(str));
                                                } catch (SQLiteException e10) {
                                                    e = e10;
                                                    try {
                                                        zzj3.zzu.zzaV().zzb().zzc("Error storing NO_DATA mode event. appId", zzgu.zzl(str), e);
                                                    } catch (SQLiteException unused) {
                                                        zzaV().zzh().zzb("Failed handling NO_DATA mode bundles. appId", str);
                                                    }
                                                }
                                            }
                                        } catch (SQLiteException e11) {
                                            e = e11;
                                        }
                                    }
                                }
                            } catch (SQLiteException unused2) {
                            }
                        }
                        list = Collections.emptyList();
                    }
                }
                str2 = "_f";
                if (list.isEmpty()) {
                }
            } else {
                str2 = "_f";
            }
            zzjl zzB = zzB(str);
            zzjk zzjkVar = zzjk.AD_STORAGE;
            if (zzB.zzo(zzjkVar)) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        str5 = null;
                        break;
                    }
                    com.google.android.gms.internal.measurement.zzid zzidVar3 = (com.google.android.gms.internal.measurement.zzid) ((Pair) it4.next()).first;
                    if (!zzidVar3.zzG().isEmpty()) {
                        str5 = zzidVar3.zzG();
                        break;
                    }
                }
                if (str5 != null) {
                    int i7 = 0;
                    while (true) {
                        if (i7 >= list.size()) {
                            break;
                        }
                        com.google.android.gms.internal.measurement.zzid zzidVar4 = (com.google.android.gms.internal.measurement.zzid) ((Pair) list.get(i7)).first;
                        if (!zzidVar4.zzG().isEmpty() && !zzidVar4.zzG().equals(str5)) {
                            list = list.subList(0, i7);
                            break;
                        }
                        i7++;
                    }
                }
            }
            com.google.android.gms.internal.measurement.zzhz zzh = com.google.android.gms.internal.measurement.zzib.zzh();
            int size = list.size();
            List arrayList4 = new ArrayList(list.size());
            boolean z7 = zzd().zzC(str) && zzB(str).zzo(zzjkVar);
            boolean zzo = zzB(str).zzo(zzjkVar);
            boolean zzo2 = zzB(str).zzo(zzjk.ANALYTICS_STORAGE);
            zzrb.zza();
            boolean zzp2 = zzd().zzp(str, zzfy.zzaM);
            zzou zzouVar = this.zzl;
            zzot zza2 = zzouVar.zza(str);
            int i8 = 0;
            while (i8 < size) {
                com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzid) ((Pair) list.get(i8)).first).zzcl();
                arrayList4.add((Long) ((Pair) list.get(i8)).second);
                zzd().zzi();
                zzicVar4.zzO(133005L);
                zzicVar4.zzs(j);
                int i9 = size;
                this.zzn.zzaU();
                zzicVar4.zzae(false);
                if (!z7) {
                    zzicVar4.zzan();
                }
                if (!zzo) {
                    zzicVar4.zzR();
                    zzicVar4.zzU();
                }
                if (!zzo2) {
                    zzicVar4.zzX();
                }
                zzS(str, zzicVar4);
                if (!zzp2) {
                    zzicVar4.zzav();
                }
                if (!zzo2) {
                    zzicVar4.zzag();
                }
                String zzP = zzicVar4.zzP();
                if (TextUtils.isEmpty(zzP)) {
                    z2 = zzo;
                } else {
                    z2 = zzo;
                    if (!zzP.equals("00000000-0000-0000-0000-000000000000")) {
                        z3 = z7;
                        z4 = zzo2;
                        z5 = zzp2;
                        list2 = list;
                        str4 = str2;
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
                        i8++;
                        str2 = str4;
                        size = i9;
                        zzo = z2;
                        z7 = z3;
                        zzo2 = z4;
                        list = list2;
                        zzp2 = z5;
                    }
                }
                ArrayList arrayList5 = new ArrayList(zzicVar4.zzb());
                Iterator it5 = arrayList5.iterator();
                z3 = z7;
                z4 = zzo2;
                Long l = null;
                Long l2 = null;
                boolean z8 = false;
                boolean z9 = false;
                while (it5.hasNext()) {
                    boolean z10 = zzp2;
                    com.google.android.gms.internal.measurement.zzhs zzhsVar2 = (com.google.android.gms.internal.measurement.zzhs) it5.next();
                    List list3 = list;
                    if ("_fx".equals(zzhsVar2.zzd())) {
                        it5.remove();
                        list = list3;
                        zzp2 = z10;
                        z8 = true;
                        z9 = true;
                    } else {
                        String str6 = str2;
                        if (str6.equals(zzhsVar2.zzd())) {
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
                            str2 = str6;
                            list = list3;
                            zzp2 = z10;
                            z9 = true;
                        } else {
                            str2 = str6;
                            list = list3;
                            zzp2 = z10;
                        }
                    }
                }
                z5 = zzp2;
                list2 = list;
                str4 = str2;
                if (z8) {
                    zzicVar4.zzi();
                    zzicVar4.zzh(arrayList5);
                }
                if (z9) {
                    zzR(zzicVar4.zzK(), true, l, l2);
                }
                if (zzicVar4.zzc() != 0) {
                }
                i8++;
                str2 = str4;
                size = i9;
                zzo = z2;
                z7 = z3;
                zzo2 = z4;
                list = list2;
                zzp2 = z5;
            }
            if (zzh.zzb() == 0) {
                zzL(arrayList4);
                zzV(false, 204, null, null, str, Collections.emptyList());
                return;
            }
            com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
            List arrayList6 = new ArrayList();
            boolean z11 = zza2.zzc() == zzls.SGTM_CLIENT;
            if (zza2.zzc() == zzls.SGTM) {
                z = z11;
            } else {
                if (!z11) {
                    j2 = j;
                    obj = null;
                    if (zzi().zzb()) {
                        return;
                    }
                    Object zzi = Log.isLoggable(zzaV().zzn(), 2) ? zzp().zzi(zzibVar) : obj;
                    zzp();
                    byte[] zzcc = zzibVar.zzcc();
                    zzL(arrayList4);
                    this.zzk.zze.zzb(j2);
                    zzaV().zzk().zzd("Uploading data. app, uncompressed size, data", str, Integer.valueOf(zzcc.length), zzi);
                    this.zzv = true;
                    zzi().zzc(str, zza2, zzibVar, new zzow(this, str, arrayList6));
                    return;
                }
                z = true;
            }
            Iterator it6 = ((com.google.android.gms.internal.measurement.zzib) zzh.zzbc()).zza().iterator();
            while (true) {
                if (it6.hasNext()) {
                    if (((com.google.android.gms.internal.measurement.zzid) it6.next()).zzY()) {
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
            com.google.android.gms.internal.measurement.zzhz zzi2 = com.google.android.gms.internal.measurement.zzib.zzi(zzibVar2);
            if (!TextUtils.isEmpty(str3)) {
                zzi2.zzi(str3);
            }
            String zzc = zzh().zzc(str);
            if (!TextUtils.isEmpty(zzc)) {
                zzi2.zzj(zzc);
            }
            ArrayList arrayList7 = new ArrayList();
            Iterator it7 = zzibVar2.zza().iterator();
            while (it7.hasNext()) {
                com.google.android.gms.internal.measurement.zzic zzaF = com.google.android.gms.internal.measurement.zzid.zzaF((com.google.android.gms.internal.measurement.zzid) it7.next());
                zzaF.zzan();
                arrayList7.add((com.google.android.gms.internal.measurement.zzid) zzaF.zzbc());
            }
            zzi2.zzg();
            zzi2.zzf(arrayList7);
            zzaV().zzk().zzb("[sgtm] Processed MeasurementBatch for sGTM with sgtmJoinId: ", TextUtils.isEmpty(str3) ? "null" : zzi2.zzh());
            com.google.android.gms.internal.measurement.zzib zzibVar3 = (com.google.android.gms.internal.measurement.zzib) zzi2.zzbc();
            if (TextUtils.isEmpty(str3)) {
                obj = null;
            } else {
                com.google.android.gms.internal.measurement.zzib zzibVar4 = (com.google.android.gms.internal.measurement.zzib) zzh.zzbc();
                zzaW().zzg();
                zzu();
                com.google.android.gms.internal.measurement.zzhz zzh2 = com.google.android.gms.internal.measurement.zzib.zzh();
                zzaV().zzk().zzb("[sgtm] Processing Google Signal, sgtmJoinId:", str3);
                zzh2.zzi(str3);
                for (com.google.android.gms.internal.measurement.zzid zzidVar5 : zzibVar4.zza()) {
                    com.google.android.gms.internal.measurement.zzic zzaE = com.google.android.gms.internal.measurement.zzid.zzaE();
                    zzaE.zzam(zzidVar5.zzZ());
                    zzaE.zzaJ(zzidVar5.zzav());
                    zzh2.zze(zzaE);
                }
                com.google.android.gms.internal.measurement.zzib zzibVar5 = (com.google.android.gms.internal.measurement.zzib) zzh2.zzbc();
                String zzc2 = zzouVar.zzg.zzh().zzc(str);
                if (TextUtils.isEmpty(zzc2)) {
                    obj = null;
                    zzotVar = new zzot((String) zzfy.zzr.zzb(null), Collections.emptyMap(), z ? zzls.GOOGLE_SIGNAL_PENDING : zzls.GOOGLE_SIGNAL, null);
                } else {
                    Uri parse = Uri.parse((String) zzfy.zzr.zzb(null));
                    Uri.Builder buildUpon = parse.buildUpon();
                    String authority = parse.getAuthority();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(zzc2).length() + 1 + String.valueOf(authority).length());
                    sb2.append(zzc2);
                    sb2.append(".");
                    sb2.append(authority);
                    buildUpon.authority(sb2.toString());
                    obj = null;
                    zzotVar = new zzot(buildUpon.build().toString(), Collections.emptyMap(), z ? zzls.GOOGLE_SIGNAL_PENDING : zzls.GOOGLE_SIGNAL, null);
                }
                arrayList6.add(Pair.create(zzibVar5, zzotVar));
            }
            if (z) {
                com.google.android.gms.internal.measurement.zzhz zzhzVar = (com.google.android.gms.internal.measurement.zzhz) zzibVar3.zzcl();
                for (int i10 = 0; i10 < zzibVar3.zzb(); i10++) {
                    com.google.android.gms.internal.measurement.zzic zzicVar5 = (com.google.android.gms.internal.measurement.zzic) zzibVar3.zzc(i10).zzcl();
                    zzicVar5.zzt();
                    zzicVar5.zzaO(j);
                    zzhzVar.zzd(i10, zzicVar5);
                }
                arrayList6.add(Pair.create((com.google.android.gms.internal.measurement.zzib) zzhzVar.zzbc(), zza2));
                zzL(arrayList4);
                zzV(false, 204, null, null, str, arrayList6);
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
            j2 = j;
            zzibVar = zzibVar3;
            if (zzi().zzb()) {
            }
        }
    }

    final boolean zzO(String str, String str2) {
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

    final void zzP(String str) {
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
                Preconditions.checkNotEmpty(str);
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
        } finally {
            this.zzw = false;
            zzaM();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x007f  */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzQ(String str, int i, Throwable th, byte[] bArr, zzpj zzpjVar) {
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

    final void zzR(String str, boolean z, Long l, Long l2) {
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

    final void zzS(String str, com.google.android.gms.internal.measurement.zzic zzicVar) {
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
                if (zzpdVar == null || zzpdVar.zzb + zzd().zzl(str, zzfy.zzak) < zzaZ().elapsedRealtime()) {
                    zzpdVar = new zzpd(this, (byte[]) null);
                    map.put(str, zzpdVar);
                }
                zzicVar.zzax(zzpdVar.zza);
            }
        }
        if (zzh().zzu(str)) {
            zzicVar.zzav();
        }
    }

    final void zzT(com.google.android.gms.internal.measurement.zzic zzicVar, zzpc zzpcVar) {
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

    final void zzU(String str, com.google.android.gms.internal.measurement.zzhv zzhvVar, Bundle bundle, String str2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r23 != null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzV(boolean z, int i, Throwable th, byte[] bArr, String str, List list) {
        byte[] bArr2;
        int i2 = i;
        zzaW().zzg();
        zzu();
        if (bArr == null) {
            try {
                bArr2 = new byte[0];
            } finally {
                this.zzv = false;
                zzaM();
            }
        } else {
            bArr2 = bArr;
        }
        List<Long> list2 = (List) Preconditions.checkNotNull(this.zzz);
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
            return;
        } catch (Throwable th2) {
            zzj().zzd();
            throw th2;
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

    final void zzW(zzh zzhVar) {
        zzaW().zzg();
        if (TextUtils.isEmpty(zzhVar.zzf())) {
            zzX((String) Preconditions.checkNotNull(zzhVar.zzc()), 204, null, null, null);
            return;
        }
        String str = (String) Preconditions.checkNotNull(zzhVar.zzc());
        zzaV().zzk().zzb("Fetching remote configuration", str);
        com.google.android.gms.internal.measurement.zzgl zzb2 = zzh().zzb(str);
        String zzd = zzh().zzd(str);
        ArrayMap arrayMap = null;
        if (zzb2 != null) {
            if (!TextUtils.isEmpty(zzd)) {
                ArrayMap arrayMap2 = new ArrayMap();
                arrayMap2.put(HttpHeaders.IF_MODIFIED_SINCE, zzd);
                arrayMap = arrayMap2;
            }
            String zze = zzh().zze(str);
            if (!TextUtils.isEmpty(zze)) {
                if (arrayMap == null) {
                    arrayMap = new ArrayMap();
                }
                arrayMap.put(HttpHeaders.IF_NONE_MATCH, zze);
            }
        }
        this.zzu = true;
        zzi().zzd(zzhVar, arrayMap, new zzgw() { // from class: com.google.android.gms.measurement.internal.zzpf
            @Override // com.google.android.gms.measurement.internal.zzgw
            public final /* synthetic */ void zza(String str2, int i, Throwable th, byte[] bArr, Map map) {
                zzpg.this.zzX(str2, i, th, bArr, map);
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:5:0x002b, B:13:0x0047, B:14:0x014b, B:24:0x0061, B:28:0x00b1, B:29:0x00a2, B:30:0x00b6, B:34:0x00c7, B:35:0x00e1, B:37:0x00f5, B:38:0x0114, B:40:0x011e, B:42:0x0124, B:43:0x0128, B:45:0x0132, B:47:0x0140, B:48:0x0148, B:49:0x0103, B:50:0x00cf, B:52:0x00d9), top: B:4:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f5 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:5:0x002b, B:13:0x0047, B:14:0x014b, B:24:0x0061, B:28:0x00b1, B:29:0x00a2, B:30:0x00b6, B:34:0x00c7, B:35:0x00e1, B:37:0x00f5, B:38:0x0114, B:40:0x011e, B:42:0x0124, B:43:0x0128, B:45:0x0132, B:47:0x0140, B:48:0x0148, B:49:0x0103, B:50:0x00cf, B:52:0x00d9), top: B:4:0x002b, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0103 A[Catch: all -> 0x015f, TryCatch #1 {all -> 0x015f, blocks: (B:5:0x002b, B:13:0x0047, B:14:0x014b, B:24:0x0061, B:28:0x00b1, B:29:0x00a2, B:30:0x00b6, B:34:0x00c7, B:35:0x00e1, B:37:0x00f5, B:38:0x0114, B:40:0x011e, B:42:0x0124, B:43:0x0128, B:45:0x0132, B:47:0x0140, B:48:0x0148, B:49:0x0103, B:50:0x00cf, B:52:0x00d9), top: B:4:0x002b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzX(String str, int i, Throwable th, byte[] bArr, Map map) {
        boolean z;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotEmpty(str);
        if (bArr == null) {
            try {
                bArr = new byte[0];
            } finally {
                this.zzu = false;
                zzaM();
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
                    String zzaK = zzaK(map, HttpHeaders.LAST_MODIFIED);
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
            }
            if (th == null) {
                z = true;
                if (zzu == null) {
                }
                zzj().zzc();
            }
            z = false;
            if (zzu == null) {
            }
            zzj().zzc();
        } finally {
            zzj().zzd();
        }
    }

    final void zzY(Runnable runnable) {
        zzaW().zzg();
        if (this.zzq == null) {
            this.zzq = new ArrayList();
        }
        this.zzq.add(runnable);
    }

    final void zzZ() {
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
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaV();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final zzhz zzaW() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaW();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Context zzaY() {
        return this.zzn.zzaY();
    }

    @Override // com.google.android.gms.measurement.internal.zzjg
    public final Clock zzaZ() {
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzaZ();
    }

    final boolean zzaa() {
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

    final void zzab(zzr zzrVar) {
        if (this.zzz != null) {
            ArrayList arrayList = new ArrayList();
            this.zzA = arrayList;
            arrayList.addAll(this.zzz);
        }
        zzav zzj = zzj();
        String str = (String) Preconditions.checkNotNull(zzrVar.zza);
        Preconditions.checkNotEmpty(str);
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

    final void zzac(zzpl zzplVar, zzr zzrVar) {
        String str;
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
            String str2 = zzplVar.zzb;
            int zzp = zzt.zzp(str2);
            if (zzp != 0) {
                zzpp zzt2 = zzt();
                zzd();
                zzt().zzN(this.zzK, zzrVar.zza, zzp, "_ev", zzt2.zzC(str2, 24, true), str2 != null ? str2.length() : 0);
                return;
            }
            int zzK = zzt().zzK(str2, zzplVar.zza());
            if (zzK != 0) {
                zzpp zzt3 = zzt();
                zzd();
                String zzC = zzt3.zzC(str2, 24, true);
                Object zza = zzplVar.zza();
                zzt().zzN(this.zzK, zzrVar.zza, zzK, "_ev", zzC, (zza == null || !((zza instanceof String) || (zza instanceof CharSequence))) ? 0 : zza.toString().length());
                return;
            }
            Object zzL = zzt().zzL(str2, zzplVar.zza());
            if (zzL != null) {
                if ("_sid".equals(str2)) {
                    long j2 = zzplVar.zzc;
                    String str3 = zzplVar.zzf;
                    String str4 = (String) Preconditions.checkNotNull(zzrVar.zza);
                    zzpn zzm2 = zzj().zzm(str4, "_sno");
                    if (zzm2 != null) {
                        Object obj = zzm2.zze;
                        if (obj instanceof Long) {
                            j = ((Long) obj).longValue();
                            str = "_sid";
                            zzac(new zzpl("_sno", j2, Long.valueOf(j + 1), str3), zzrVar);
                        }
                    }
                    if (zzm2 != null) {
                        zzaV().zze().zzb("Retrieved last session number from database does not contain a valid (long) value", zzm2.zze);
                    }
                    zzbc zzf = zzj().zzf(str4, "_s");
                    if (zzf != null) {
                        zzgs zzk = zzaV().zzk();
                        str = "_sid";
                        long j3 = zzf.zzc;
                        zzk.zzb("Backfill the session number. Last used session number", Long.valueOf(j3));
                        j = j3;
                    } else {
                        str = "_sid";
                        j = 0;
                    }
                    zzac(new zzpl("_sno", j2, Long.valueOf(j + 1), str3), zzrVar);
                } else {
                    str = "_sid";
                }
                String str5 = zzrVar.zza;
                zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(str5), (String) Preconditions.checkNotNull(zzplVar.zzf), str2, zzplVar.zzc, zzL);
                zzgs zzk2 = zzaV().zzk();
                zzic zzicVar = this.zzn;
                String str6 = zzpnVar.zzc;
                zzk2.zzc("Setting user property", zzicVar.zzl().zzc(str6), zzL);
                zzj().zzb();
                try {
                    if ("_id".equals(str6) && (zzm = zzj().zzm(str5, "_id")) != null && !zzpnVar.zze.equals(zzm.zze)) {
                        zzj().zzk(str5, "_lair");
                    }
                    zzao(zzrVar);
                    boolean zzl = zzj().zzl(zzpnVar);
                    if (str.equals(str2)) {
                        long zzu = zzp().zzu(zzrVar.zzu);
                        zzh zzu2 = zzj().zzu(str5);
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
                        zzt().zzN(this.zzK, str5, 9, null, null, 0);
                    }
                } finally {
                    zzj().zzd();
                }
            }
        }
    }

    final void zzad(String str, zzr zzrVar) {
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
                    zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), "_lair");
                }
                zzj().zzk((String) Preconditions.checkNotNull(zzrVar.zza), str);
                zzj().zzc();
                zzaV().zzj().zzb("User property removed", zzicVar.zzl().zzc(str));
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzae() {
        this.zzs++;
    }

    final void zzaf() {
        this.zzt++;
    }

    final zzic zzag() {
        return this.zzn;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x00bb, code lost:
    
        if (true == r11.booleanValue()) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x00bd, code lost:
    
        r17 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x00c2, code lost:
    
        r4 = true;
        r3 = new com.google.android.gms.measurement.internal.zzpl("_npa", r13, java.lang.Long.valueOf(r17), "auto");
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x00cf, code lost:
    
        if (r10 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x00d9, code lost:
    
        if (r10.zze.equals(r3.zzd) != false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x00db, code lost:
    
        zzac(r3, r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x00c0, code lost:
    
        r17 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x041d A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x010c A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f8 A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f2 A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0100 A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0119 A[Catch: all -> 0x044d, TRY_LEAVE, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0285 A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x02b0 A[Catch: all -> 0x044d, TRY_LEAVE, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0380 A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0390 A[Catch: all -> 0x044d, TryCatch #2 {all -> 0x044d, blocks: (B:25:0x0093, B:27:0x00a4, B:31:0x00e5, B:33:0x00f2, B:34:0x00fb, B:36:0x0100, B:38:0x0119, B:41:0x0130, B:43:0x0159, B:46:0x0161, B:48:0x0170, B:49:0x0255, B:51:0x0285, B:52:0x0288, B:54:0x02b0, B:58:0x0380, B:59:0x0383, B:61:0x0390, B:62:0x039d, B:63:0x043e, B:68:0x02c5, B:71:0x02e9, B:73:0x02f1, B:75:0x02fb, B:79:0x030e, B:81:0x031e, B:84:0x032a, B:86:0x033c, B:88:0x0361, B:90:0x0367, B:91:0x036f, B:93:0x0375, B:97:0x034d, B:99:0x0317, B:104:0x02d5, B:105:0x0183, B:107:0x01ae, B:108:0x01bd, B:110:0x01c4, B:112:0x01ca, B:114:0x01d4, B:116:0x01de, B:118:0x01e4, B:120:0x01ea, B:122:0x01ef, B:125:0x020d, B:129:0x0212, B:130:0x0226, B:131:0x0234, B:132:0x0242, B:133:0x03b5, B:135:0x03eb, B:136:0x03ee, B:138:0x03fb, B:139:0x0406, B:140:0x041d, B:142:0x0423, B:143:0x010c, B:144:0x00f8, B:146:0x00b3, B:149:0x00c2, B:151:0x00d1, B:153:0x00db, B:157:0x00e2), top: B:24:0x0093, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02c5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void zzah(zzr zzrVar) {
        boolean z;
        zzbc zzf;
        boolean z2;
        String str;
        long j;
        long zzN;
        zzic zzicVar;
        PackageInfo packageInfo;
        String str2;
        ApplicationInfo applicationInfo;
        long j2;
        boolean z3;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str3 = zzrVar.zza;
        Preconditions.checkNotEmpty(str3);
        if (zzaR(zzrVar)) {
            zzh zzu = zzj().zzu(str3);
            if (zzu != null && TextUtils.isEmpty(zzu.zzf()) && !TextUtils.isEmpty(zzrVar.zzb)) {
                zzu.zzI(0L);
                zzj().zzv(zzu, false, false);
                zzh().zzh(str3);
            }
            if (!zzrVar.zzh) {
                zzao(zzrVar);
                return;
            }
            long j3 = zzrVar.zzl;
            if (j3 == 0) {
                j3 = zzaZ().currentTimeMillis();
            }
            int i = zzrVar.zzm;
            if (i != 0 && i != 1) {
                zzaV().zze().zzc("Incorrect app type, assuming installed app. appId, appType", zzgu.zzl(str3), Integer.valueOf(i));
                i = 0;
            }
            zzj().zzb();
            try {
                zzpn zzm = zzj().zzm(str3, "_npa");
                Boolean zzaT = zzaT(zzrVar);
                if (zzm != null && !"auto".equals(zzm.zzb)) {
                    z = true;
                    if (zzd().zzp(null, zzfy.zzbb)) {
                        zzan(zzrVar, j3);
                    } else {
                        zzan(zzrVar, zzrVar.zzD);
                    }
                    zzao(zzrVar);
                    if (i != 0) {
                        zzf = zzj().zzf(str3, "_f");
                        z2 = false;
                    } else {
                        zzf = zzj().zzf(str3, "_v");
                        z2 = z;
                    }
                    if (zzf != null) {
                        long j4 = ((j3 / 3600000) + 1) * 3600000;
                        if (z2) {
                            long j5 = j3;
                            zzac(new zzpl("_fvt", j5, Long.valueOf(j4), "auto"), zzrVar);
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
                            zzE(new zzbg("_v", new zzbe(bundle), "auto", j5), zzrVar);
                        } else {
                            zzac(new zzpl("_fot", j3, Long.valueOf(j4), "auto"), zzrVar);
                            zzaW().zzg();
                            zzhk zzhkVar = (zzhk) Preconditions.checkNotNull(this.zzm);
                            if (str3 != null && !str3.isEmpty()) {
                                zzic zzicVar2 = zzhkVar.zza;
                                zzicVar2.zzaW().zzg();
                                if (zzhkVar.zza()) {
                                    str = "_elt";
                                    zzhj zzhjVar = new zzhj(zzhkVar, str3);
                                    zzicVar2.zzaW().zzg();
                                    j = j3;
                                    Intent intent = new Intent("com.google.android.finsky.BIND_GET_INSTALL_REFERRER_SERVICE");
                                    intent.setComponent(new ComponentName("com.android.vending", "com.google.android.finsky.externalreferrer.GetInstallReferrerService"));
                                    PackageManager packageManager = zzicVar2.zzaY().getPackageManager();
                                    if (packageManager == null) {
                                        zzicVar2.zzaV().zzf().zza("Failed to obtain Package Manager to verify binding conditions for Install Referrer");
                                    } else {
                                        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
                                        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                                            zzicVar2.zzaV().zzi().zza("Play Service for fetching Install Referrer is unavailable on device");
                                        } else {
                                            ResolveInfo resolveInfo = queryIntentServices.get(0);
                                            if (resolveInfo.serviceInfo != null) {
                                                String str4 = resolveInfo.serviceInfo.packageName;
                                                if (resolveInfo.serviceInfo.name != null && "com.android.vending".equals(str4) && zzhkVar.zza()) {
                                                    try {
                                                        zzicVar2.zzaV().zzk().zzb("Install Referrer Service is", ConnectionTracker.getInstance().bindService(zzicVar2.zzaY(), new Intent(intent), zzhjVar, 1) ? "available" : "not available");
                                                    } catch (RuntimeException e) {
                                                        zzhkVar.zza.zzaV().zzb().zzb("Exception occurred while binding to Install Referrer Service", e.getMessage());
                                                    }
                                                } else {
                                                    zzicVar2.zzaV().zze().zza("Play Store version 8.3.73 or higher required for Install Referrer");
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    zzicVar2.zzaV().zzi().zza("Install Referrer Reporter is not available");
                                    str = "_elt";
                                    j = j3;
                                }
                                zzaW().zzg();
                                zzu();
                                Bundle bundle2 = new Bundle();
                                bundle2.putLong("_c", 1L);
                                bundle2.putLong("_r", 1L);
                                bundle2.putLong("_uwa", 0L);
                                bundle2.putLong("_pfo", 0L);
                                bundle2.putLong("_sys", 0L);
                                bundle2.putLong("_sysu", 0L);
                                bundle2.putLong("_et", 1L);
                                if (zzrVar.zzo) {
                                    bundle2.putLong("_dac", 1L);
                                }
                                String str5 = (String) Preconditions.checkNotNull(zzrVar.zza);
                                zzav zzj = zzj();
                                Preconditions.checkNotEmpty(str5);
                                zzj.zzg();
                                zzj.zzaw();
                                zzN = zzj.zzN(str5, "first_open_count");
                                zzicVar = this.zzn;
                                if (zzicVar.zzaY().getPackageManager() != null) {
                                    zzaV().zzb().zzb("PackageManager is null, first open report might be inaccurate. appId", zzgu.zzl(str5));
                                } else {
                                    try {
                                        packageInfo = Wrappers.packageManager(zzicVar.zzaY()).getPackageInfo(str5, 0);
                                    } catch (PackageManager.NameNotFoundException e2) {
                                        zzaV().zzb().zzc("Package info is null, first open report might be inaccurate. appId", zzgu.zzl(str5), e2);
                                        packageInfo = null;
                                    }
                                    if (packageInfo == null || packageInfo.firstInstallTime == 0) {
                                        str2 = "_sysu";
                                    } else {
                                        str2 = "_sysu";
                                        if (packageInfo.firstInstallTime != packageInfo.lastUpdateTime) {
                                            if (!zzd().zzp(null, zzfy.zzaI)) {
                                                bundle2.putLong("_uwa", 1L);
                                            } else if (zzN == 0) {
                                                bundle2.putLong("_uwa", 1L);
                                                zzN = 0;
                                            }
                                            z3 = false;
                                        } else {
                                            z3 = true;
                                        }
                                        zzac(new zzpl("_fi", j, Long.valueOf(true != z3 ? 0L : 1L), "auto"), zzrVar);
                                    }
                                    try {
                                        applicationInfo = Wrappers.packageManager(this.zzn.zzaY()).getApplicationInfo(str5, 0);
                                    } catch (PackageManager.NameNotFoundException e3) {
                                        zzaV().zzb().zzc("Application info is null, first open report might be inaccurate. appId", zzgu.zzl(str5), e3);
                                        applicationInfo = null;
                                    }
                                    if (applicationInfo != null) {
                                        if ((applicationInfo.flags & 1) != 0) {
                                            j2 = 1;
                                            bundle2.putLong("_sys", 1L);
                                        } else {
                                            j2 = 1;
                                        }
                                        if ((applicationInfo.flags & 128) != 0) {
                                            bundle2.putLong(str2, j2);
                                        }
                                    }
                                }
                                if (zzN >= 0) {
                                    bundle2.putLong("_pfo", zzN);
                                }
                                if (zzd().zzp(null, zzfy.zzbj)) {
                                    bundle2.putLong(str, zzaZ().currentTimeMillis());
                                }
                                zzE(new zzbg("_f", new zzbe(bundle2), "auto", j), zzrVar);
                            }
                            str = "_elt";
                            j = j3;
                            zzhkVar.zza.zzaV().zzf().zza("Install Referrer Reporter was called with invalid app package name");
                            zzaW().zzg();
                            zzu();
                            Bundle bundle22 = new Bundle();
                            bundle22.putLong("_c", 1L);
                            bundle22.putLong("_r", 1L);
                            bundle22.putLong("_uwa", 0L);
                            bundle22.putLong("_pfo", 0L);
                            bundle22.putLong("_sys", 0L);
                            bundle22.putLong("_sysu", 0L);
                            bundle22.putLong("_et", 1L);
                            if (zzrVar.zzo) {
                            }
                            String str52 = (String) Preconditions.checkNotNull(zzrVar.zza);
                            zzav zzj2 = zzj();
                            Preconditions.checkNotEmpty(str52);
                            zzj2.zzg();
                            zzj2.zzaw();
                            zzN = zzj2.zzN(str52, "first_open_count");
                            zzicVar = this.zzn;
                            if (zzicVar.zzaY().getPackageManager() != null) {
                            }
                            if (zzN >= 0) {
                            }
                            if (zzd().zzp(null, zzfy.zzbj)) {
                            }
                            zzE(new zzbg("_f", new zzbe(bundle22), "auto", j), zzrVar);
                        }
                    } else {
                        long j6 = j3;
                        if (zzrVar.zzi) {
                            zzE(new zzbg("_cd", new zzbe(new Bundle()), "auto", j6), zzrVar);
                        }
                    }
                    zzj().zzc();
                }
                z = true;
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
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzai(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
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

    final void zzaj(zzah zzahVar) {
        zzr zzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzaO != null) {
            zzak(zzahVar, zzaO);
        }
    }

    final void zzak(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzb);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
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
                zzah zzq = zzj().zzq((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzc.zzb);
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
                    zzpn zzpnVar = new zzpn((String) Preconditions.checkNotNull(zzahVar2.zza), zzahVar2.zzb, zzplVar3.zzb, zzplVar3.zzc, Preconditions.checkNotNull(zzplVar3.zza()));
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
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzal(zzah zzahVar) {
        zzr zzaO = zzaO((String) Preconditions.checkNotNull(zzahVar.zza));
        if (zzaO != null) {
            zzam(zzahVar, zzaO);
        }
    }

    final void zzam(zzah zzahVar, zzr zzrVar) {
        Preconditions.checkNotNull(zzahVar);
        Preconditions.checkNotEmpty(zzahVar.zza);
        Preconditions.checkNotNull(zzahVar.zzc);
        Preconditions.checkNotEmpty(zzahVar.zzc.zzb);
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
                String str = (String) Preconditions.checkNotNull(zzahVar.zza);
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
                        zzH((zzbg) Preconditions.checkNotNull(zzt().zzac(str, ((zzbg) Preconditions.checkNotNull(zzbgVar)).zza, zzbeVar != null ? zzbeVar.zzf() : null, zzq.zzb, zzbgVar.zzd, true, true)), zzrVar);
                    }
                } else {
                    zzaV().zze().zzc("Conditional user property doesn't exist", zzgu.zzl(zzahVar.zza), this.zzn.zzl().zzc(zzahVar.zzc.zzb));
                }
                zzj().zzc();
            } finally {
                zzj().zzd();
            }
        }
    }

    final void zzan(zzr zzrVar, long j) {
        zzh zzu = zzj().zzu((String) Preconditions.checkNotNull(zzrVar.zza));
        if (zzu != null && zzt().zzB(zzrVar.zzb, zzu.zzf())) {
            zzaV().zze().zzb("New GMP App Id passed in. Removing cached database data. appId", zzgu.zzl(zzu.zzc()));
            zzav zzj = zzj();
            String zzc = zzu.zzc();
            zzj.zzaw();
            zzj.zzg();
            Preconditions.checkNotEmpty(zzc);
            try {
                SQLiteDatabase zze = zzj.zze();
                String[] strArr = {zzc};
                int delete = zze.delete("events", "app_id=?", strArr) + zze.delete("user_attributes", "app_id=?", strArr) + zze.delete("conditional_properties", "app_id=?", strArr) + zze.delete("apps", "app_id=?", strArr) + zze.delete("raw_events", "app_id=?", strArr) + zze.delete("raw_events_metadata", "app_id=?", strArr) + zze.delete("event_filters", "app_id=?", strArr) + zze.delete("property_filters", "app_id=?", strArr) + zze.delete("audience_filter_values", "app_id=?", strArr) + zze.delete("consent_settings", "app_id=?", strArr) + zze.delete("default_event_params", "app_id=?", strArr) + zze.delete("trigger_uris", "app_id=?", strArr);
                com.google.android.gms.internal.measurement.zzpo.zza();
                zzic zzicVar = zzj.zzu;
                if (zzicVar.zzc().zzp(null, zzfy.zzbh)) {
                    delete += zze.delete("no_data_mode_events", "app_id=?", strArr);
                }
                if (delete > 0) {
                    zzicVar.zzaV().zzk().zzc("Deleted application data. app, records", zzc, Integer.valueOf(delete));
                }
            } catch (SQLiteException e) {
                zzj.zzu.zzaV().zzb().zzc("Error deleting application data. appId, error", zzgu.zzl(zzc), e);
            }
            zzu = null;
        }
        if (zzu != null) {
            boolean z = (zzu.zzt() == -2147483648L || zzu.zzt() == zzrVar.zzj) ? false : true;
            String zzr = zzu.zzr();
            if (z || ((zzu.zzt() != -2147483648L || zzr == null || zzr.equals(zzrVar.zzc)) ? false : true)) {
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

    /* JADX WARN: Code restructure failed: missing block: B:40:0x01dc, code lost:
    
        if (r11 != false) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final zzh zzao(zzr zzrVar) {
        boolean z;
        String str;
        long j;
        String str2;
        String str3;
        String str4;
        zzaW().zzg();
        zzu();
        Preconditions.checkNotNull(zzrVar);
        String str5 = zzrVar.zza;
        Preconditions.checkNotEmpty(str5);
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

    final String zzap(zzr zzrVar) {
        try {
            return (String) zzaW().zzh(new zzoz(this, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zzaV().zzb().zzc("Failed to get app instance id. appId", zzgu.zzl(zzrVar.zza), e);
            return null;
        }
    }

    final List zzaq(zzr zzrVar, Bundle bundle) {
        int[] iArr;
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
                    int i = 0;
                    while (i < intArray.length) {
                        zzav zzj = zzj();
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        zzj.zzg();
                        zzj.zzaw();
                        try {
                            iArr = intArray;
                            try {
                                int delete = zzj.zze().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                                zzgs zzk = zzj.zzu.zzaV().zzk();
                                StringBuilder sb = new StringBuilder(String.valueOf(delete).length() + 46);
                                sb.append("Pruned ");
                                sb.append(delete);
                                sb.append(" trigger URIs. appId, source, timestamp");
                                zzk.zzd(sb.toString(), str, Integer.valueOf(i2), Long.valueOf(j));
                            } catch (SQLiteException e) {
                                e = e;
                                zzj.zzu.zzaV().zzb().zzc("Error pruning trigger URIs. appId", zzgu.zzl(str), e);
                                i++;
                                intArray = iArr;
                            }
                        } catch (SQLiteException e2) {
                            e = e2;
                            iArr = intArray;
                        }
                        i++;
                        intArray = iArr;
                    }
                }
            }
        }
        zzav zzj2 = zzj();
        String str2 = zzrVar.zza;
        Preconditions.checkNotEmpty(str2);
        zzj2.zzg();
        zzj2.zzaw();
        List arrayList = new ArrayList();
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
            } catch (Throwable th) {
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            zzj2.zzu.zzaV().zzb().zzc("Error querying trigger uris. appId", zzgu.zzl(str2), e3);
            arrayList = Collections.emptyList();
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    final void zzar(String str, zzaf zzafVar) {
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
            Preconditions.checkNotNull(valueOf3);
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

    final void zzas(boolean z) {
        zzaL();
    }

    public final void zzat(String str, zzlu zzluVar) {
        zzaW().zzg();
        String str2 = this.zzH;
        if (str2 == null || str2.equals(str) || zzluVar != null) {
            this.zzH = str;
            this.zzG = zzluVar;
        }
    }

    final /* synthetic */ void zzau(zzph zzphVar) {
        zzaW().zzg();
        this.zzm = new zzhk(this);
        zzav zzavVar = new zzav(this);
        zzavVar.zzax();
        this.zze = zzavVar;
        zzd().zza((zzak) Preconditions.checkNotNull(this.zzc));
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

    final /* synthetic */ zzic zzax() {
        return this.zzn;
    }

    final /* synthetic */ Deque zzay() {
        return this.zzr;
    }

    final /* synthetic */ void zzaz(long j) {
        this.zzJ = j;
    }

    protected final void zzc() {
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
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzc();
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
        return ((zzic) Preconditions.checkNotNull(this.zzn)).zzk();
    }

    final void zzu() {
        if (!this.zzo.get()) {
            throw new IllegalStateException("UploadController is not initialized");
        }
    }

    final void zzv(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
        zzjl zzf = zzjl.zzf(zzrVar.zzs, zzrVar.zzx);
        zzB(str);
        zzaV().zzk().zzc("Setting storage consent for package", str, zzf);
        zzA(str, zzf);
    }

    final void zzw(zzr zzrVar) {
        zzaW().zzg();
        zzu();
        String str = zzrVar.zza;
        Preconditions.checkNotEmpty(str);
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

    final zzaz zzx(String str) {
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
    final Bundle zzy(String str) {
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

    final zzaz zzz(String str, zzaz zzazVar, zzjl zzjlVar, zzan zzanVar) {
        zzji zzjiVar;
        int i = 90;
        if (zzh().zzx(str) == null) {
            if (zzazVar.zzc() == zzji.DENIED) {
                i = zzazVar.zzb();
                zzanVar.zzb(zzjk.AD_USER_DATA, i);
            } else {
                zzanVar.zzc(zzjk.AD_USER_DATA, zzam.FAILSAFE);
            }
            return new zzaz((Boolean) false, i, (Boolean) true, "-");
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
            return new zzaz((Boolean) false, i, Boolean.valueOf(zzy), "-");
        }
        return new zzaz((Boolean) true, i, Boolean.valueOf(zzy), zzy ? TextUtils.join("", zzz) : "");
    }
}
