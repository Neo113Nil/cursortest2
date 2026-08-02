package p000;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class f31 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f2292j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2293k;

    /* JADX INFO: renamed from: l */
    public Object f2294l;

    public f31(v22 v22Var, gv1 gv1Var) {
        this.f2292j = 16;
        this.f2294l = gv1Var;
        Objects.requireNonNull(v22Var);
        this.f2293k = v22Var;
    }

    /* JADX INFO: renamed from: a */
    private final void m1588a() {
        s62 s62Var = (s62) this.f2294l;
        IBinder iBinder = (IBinder) this.f2293k;
        synchronized (s62Var) {
            if (iBinder == null) {
                s62Var.m4486a("Null service connection");
                return;
            }
            try {
                s62Var.f7041l = new a81(iBinder);
                s62Var.f7039j = 2;
                ((ScheduledExecutorService) s62Var.f7044o.f2673l).execute(new z02(s62Var, 0));
            } catch (RemoteException e) {
                s62Var.m4486a(e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m1589b() {
        vy1 vy1Var = (vy1) this.f2293k;
        synchronized (vy1Var.f8301l) {
            ((iu0) vy1Var.f8302m).mo86j((v92) this.f2294l);
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:106:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02d6 A[Catch: NotFoundException -> 0x02db, TRY_LEAVE, TryCatch #4 {NotFoundException -> 0x02db, blocks: (B:104:0x02c4, B:107:0x02d6), top: B:296:0x02c4 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:115:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:119:0x0307  */
    /* JADX WARN: Code duplicated, block: B:122:0x031b A[EDGE_INSN: B:122:0x031b->B:123:0x031d BREAK  A[LOOP:0: B:117:0x0301->B:304:?]] */
    /* JADX WARN: Code duplicated, block: B:124:0x031f  */
    /* JADX WARN: Code duplicated, block: B:125:0x0326  */
    /* JADX WARN: Code duplicated, block: B:128:0x0343  */
    /* JADX WARN: Code duplicated, block: B:130:0x038f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0398  */
    /* JADX WARN: Code duplicated, block: B:134:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:137:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:138:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03fe  */
    /* JADX WARN: Code duplicated, block: B:144:0x040a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x040c  */
    /* JADX WARN: Code duplicated, block: B:146:0x040d A[PHI: r12
      0x040d: PHI (r12v18 boolean) = (r12v10 boolean), (r12v9 boolean) binds: [B:145:0x040c, B:142:0x0407] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:148:0x0439  */
    /* JADX WARN: Code duplicated, block: B:151:0x0477 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0479  */
    /* JADX WARN: Code duplicated, block: B:156:0x049b  */
    /* JADX WARN: Code duplicated, block: B:157:0x04ae A[PHI: r25 r26 r27
      0x04ae: PHI (r25v2 f02) = (r25v0 f02), (r25v3 f02) binds: [B:155:0x0499, B:153:0x047c] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r26v2 wc1) = (r26v0 wc1), (r26v3 wc1) binds: [B:155:0x0499, B:153:0x047c] A[DONT_GENERATE, DONT_INLINE]
      0x04ae: PHI (r27v2 f72) = (r27v0 f72), (r27v3 f72) binds: [B:155:0x0499, B:153:0x047c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:159:0x04bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:170:0x04de  */
    /* JADX WARN: Code duplicated, block: B:171:0x04e7  */
    /* JADX WARN: Code duplicated, block: B:174:0x0510  */
    /* JADX WARN: Code duplicated, block: B:177:0x0520  */
    /* JADX WARN: Code duplicated, block: B:180:0x053f  */
    /* JADX WARN: Code duplicated, block: B:182:0x054d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x056a  */
    /* JADX WARN: Code duplicated, block: B:190:0x0570  */
    /* JADX WARN: Code duplicated, block: B:192:0x058e  */
    /* JADX WARN: Code duplicated, block: B:196:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:199:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:204:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:206:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:208:0x0600  */
    /* JADX WARN: Code duplicated, block: B:209:0x060b  */
    /* JADX WARN: Code duplicated, block: B:212:0x0615  */
    /* JADX WARN: Code duplicated, block: B:215:0x062b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0637  */
    /* JADX WARN: Code duplicated, block: B:222:0x0645  */
    /* JADX WARN: Code duplicated, block: B:225:0x0659  */
    /* JADX WARN: Code duplicated, block: B:226:0x065e  */
    /* JADX WARN: Code duplicated, block: B:228:0x0670  */
    /* JADX WARN: Code duplicated, block: B:230:0x0690 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0706  */
    /* JADX WARN: Code duplicated, block: B:243:0x0722  */
    /* JADX WARN: Code duplicated, block: B:246:0x072e  */
    /* JADX WARN: Code duplicated, block: B:255:0x0778  */
    /* JADX WARN: Code duplicated, block: B:257:0x0780  */
    /* JADX WARN: Code duplicated, block: B:258:0x0782  */
    /* JADX WARN: Code duplicated, block: B:260:0x078a  */
    /* JADX WARN: Code duplicated, block: B:264:0x0797  */
    /* JADX WARN: Code duplicated, block: B:268:0x07cc  */
    /* JADX WARN: Code duplicated, block: B:270:0x07d7  */
    /* JADX WARN: Code duplicated, block: B:272:0x0808  */
    /* JADX WARN: Code duplicated, block: B:275:0x081e  */
    /* JADX WARN: Code duplicated, block: B:279:0x0832  */
    /* JADX WARN: Code duplicated, block: B:296:0x02c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x031b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0198 A[Catch: NameNotFoundException -> 0x01b7, TryCatch #1 {NameNotFoundException -> 0x01b7, blocks: (B:45:0x018d, B:47:0x0198, B:49:0x01a4), top: B:290:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a4 A[Catch: NameNotFoundException -> 0x01b7, TRY_LEAVE, TryCatch #1 {NameNotFoundException -> 0x01b7, blocks: (B:45:0x018d, B:47:0x0198, B:49:0x01a4), top: B:290:0x018d }] */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:73:0x0209  */
    /* JADX WARN: Code duplicated, block: B:74:0x0214  */
    /* JADX WARN: Code duplicated, block: B:75:0x021f  */
    /* JADX WARN: Code duplicated, block: B:76:0x022a  */
    /* JADX WARN: Code duplicated, block: B:77:0x0235  */
    /* JADX WARN: Code duplicated, block: B:78:0x0240  */
    /* JADX WARN: Code duplicated, block: B:79:0x024b  */
    /* JADX WARN: Code duplicated, block: B:83:0x025f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0260 A[Catch: IllegalStateException -> 0x0282, TryCatch #2 {IllegalStateException -> 0x0282, blocks: (B:81:0x0257, B:85:0x0266, B:89:0x026e, B:91:0x0272, B:84:0x0260), top: B:292:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x026c  */
    /* JADX WARN: Code duplicated, block: B:88:0x026d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0272 A[Catch: IllegalStateException -> 0x0282, TRY_LEAVE, TryCatch #2 {IllegalStateException -> 0x0282, blocks: (B:81:0x0257, B:85:0x0266, B:89:0x026e, B:91:0x0272, B:84:0x0260), top: B:292:0x0257 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:99:0x02b3  */
    /* JADX WARN: Type inference failed for: r0v55, types: [r22] */
    /* JADX INFO: renamed from: c */
    private final void m1590c() {
        String string;
        String str;
        PackageInfo packageInfo;
        CharSequence applicationLabel;
        int i;
        String str2;
        int iM1568g;
        f02 f02Var;
        Bundle bundleM771M;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        b32 b32Var;
        wc1 wc1Var;
        wc1 wc1Var2;
        wc1 wc1Var3;
        wc1 wc1Var4;
        String strM5219G;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final v22 v22Var;
        int iM588F;
        boolean zM770L;
        boolean z;
        C0809vn c0809vn;
        l12 l12VarM1911H;
        h12 h12VarM775Q;
        h12 h12VarM775Q2;
        k12 k12Var;
        h12 h12Var;
        f02 f02Var2;
        wc1 wc1Var5;
        f72 f72Var;
        l12 l12Var;
        l12 l12Var2;
        f02 f02Var3;
        h12 h12VarM775Q3;
        h12 h12VarM775Q4;
        Boolean boolM772N;
        bz1 bz1Var;
        iz1 iz1Var;
        f02 f02Var4;
        f72 f72Var2;
        C0809vn c0809vn2;
        ky1 ky1Var;
        boolean zM1565d;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        wc1 wc1Var6;
        Context context;
        boolean z2;
        Iterator it;
        String str3;
        f72 f72Var3;
        String strM5655q;
        Bundle bundle;
        f02 f02Var5 = (f02) this.f2293k;
        q12 q12Var = (q12) this.f2294l;
        a02 a02Var = f02Var5.f2248p;
        ky1 ky1Var2 = f02Var5.f2247o;
        fz1 fz1Var = f02Var5.f2246n;
        f72 f72Var4 = f02Var5.f2250r;
        f02.m1560m(a02Var);
        a02Var.mo11z();
        bt1 bt1Var = f02Var5.f2245m;
        ((f02) bt1Var.f7192j).getClass();
        au1 au1Var = new au1(f02Var5);
        au1Var.m1082D();
        f02Var5.f2229B = au1Var;
        wv1 wv1Var = q12Var.f6313d;
        String str4 = "";
        vx1 vx1Var = new vx1(f02Var5, q12Var.f6312c, wv1Var == null ? 0L : wv1Var.f8710j, (wv1Var == null || (bundle = wv1Var.f8713m) == null) ? "" : bundle.getString("runtime_google_app_id", ""));
        vx1Var.m3447C();
        f02Var5.f2230C = vx1Var;
        ay1 ay1Var = new ay1(f02Var5);
        ay1Var.m3447C();
        f02Var5.f2258z = ay1Var;
        v42 v42Var = new v42(f02Var5);
        v42Var.m3447C();
        f02Var5.f2228A = v42Var;
        boolean z3 = f72Var4.f1519k;
        f02 f02Var6 = (f02) f72Var4.f7192j;
        if (z3) {
            C0270h1.m2191g("Can't initialize twice");
            return;
        }
        f72Var4.mo11z();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                ky1 ky1Var3 = ((f02) f72Var4.f7192j).f2247o;
                f02.m1560m(ky1Var3);
                ky1Var3.f4603r.m5312a("Utils falling back to Random for random id");
            }
        }
        f72Var4.f2341m.set(jNextLong);
        f02Var6.f2239L.incrementAndGet();
        f72Var4.f1519k = true;
        if (fz1Var.f1519k) {
            C0270h1.m2191g("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((f02) fz1Var.f7192j).f2242j.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        fz1Var.f2549l = sharedPreferences2;
        boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
        fz1Var.f2541A = z4;
        if (!z4) {
            SharedPreferences.Editor editorEdit = fz1Var.f2549l.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        long jMax2 = Math.max(0L, ((Long) jx1.f4173d.m2715a(null)).longValue());
        C0593pt c0593pt = new C0593pt();
        c0593pt.f6251n = fz1Var;
        p80.m3860e("health_monitor");
        p80.m3858b(jMax2 > 0);
        c0593pt.f6248k = "health_monitor:start";
        c0593pt.f6249l = "health_monitor:count";
        c0593pt.f6250m = "health_monitor:value";
        c0593pt.f6247j = jMax2;
        fz1Var.f2551n = c0593pt;
        ((f02) fz1Var.f7192j).f2239L.incrementAndGet();
        fz1Var.f1519k = true;
        vx1 vx1Var2 = f02Var5.f2230C;
        if (vx1Var2.f5182k) {
            C0270h1.m2191g("Can't initialize twice");
            return;
        }
        f02 f02Var7 = (f02) vx1Var2.f7192j;
        ky1 ky1Var4 = f02Var7.f2247o;
        ky1 ky1Var5 = f02Var7.f2247o;
        f02.m1560m(ky1Var4);
        ky1Var4.f4608w.m5314c(Long.valueOf(vx1Var2.f8291s), Long.valueOf(vx1Var2.f8290r), "sdkVersion bundled with app, dynamiteVersion");
        Context context2 = f02Var7.f2242j;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str5 = "Unknown";
        String installerPackageName = "unknown";
        try {
            if (packageManager != null) {
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4600o.m5313b(ky1.m3106I(packageName), "Error retrieving app installer package name. appId");
                }
                String str6 = installerPackageName;
                try {
                    if (str6 != null) {
                        if ("com.android.vending".equals(str6)) {
                            installerPackageName = "";
                        }
                        packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                        if (packageInfo != null) {
                            applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (TextUtils.isEmpty(applicationLabel)) {
                                string = "Unknown";
                            } else {
                                string = applicationLabel.toString();
                            }
                            try {
                                str = packageInfo.versionName;
                                try {
                                    i = packageInfo.versionCode;
                                    vx1Var = vx1Var;
                                    str2 = installerPackageName;
                                } catch (PackageManager.NameNotFoundException unused2) {
                                    str5 = str;
                                    f02.m1560m(ky1Var5);
                                    ky1Var5.f4600o.m5314c(ky1.m3106I(packageName), string, "Error retrieving package info. appId, appName");
                                    str = str5;
                                    str2 = installerPackageName;
                                    i = Integer.MIN_VALUE;
                                }
                            } catch (PackageManager.NameNotFoundException unused3) {
                            }
                        }
                        vx1Var2.f8284l = packageName;
                        vx1Var2.f8287o = str2;
                        vx1Var2.f8285m = str;
                        vx1Var2.f8286n = i;
                        vx1Var2.f8288p = string;
                        vx1Var2.f8289q = 0L;
                        iM1568g = f02Var7.m1568g();
                        if (iM1568g == 0) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4608w.m5312a("App measurement collection enabled");
                        } else if (iM1568g == 1) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4606u.m5312a("App measurement deactivated via the manifest");
                        } else if (iM1568g == 3) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4606u.m5312a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                        } else if (iM1568g == 4) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4606u.m5312a("App measurement disabled via the manifest");
                        } else if (iM1568g == 6) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4605t.m5312a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                        } else if (iM1568g == 7) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4606u.m5312a("App measurement disabled via the global data collection setting");
                        } else if (iM1568g != 8) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4606u.m5312a("App measurement disabled");
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4601p.m5312a("Invalid scion state in identity");
                        } else {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4606u.m5312a("App measurement disabled due to denied storage consent");
                        }
                        vx1Var2.f8296x = "";
                        strM5655q = vx1Var2.f8294v;
                        if (TextUtils.isEmpty(strM5655q)) {
                            strM5655q = AbstractC0875xf.m5655q(context2, f02Var7.f2257y);
                        }
                        if (!TextUtils.isEmpty(strM5655q)) {
                            str4 = strM5655q;
                        }
                        vx1Var2.f8296x = str4;
                        if (iM1568g == 0) {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4608w.m5314c(vx1Var2.f8284l, vx1Var2.f8296x, "App measurement enabled for app package, google app id");
                        }
                        vx1Var2.f8292t = null;
                        bt1 bt1Var2 = f02Var7.f2245m;
                        f02Var = (f02) bt1Var2.f7192j;
                        p80.m3860e("analytics.safelisted_events");
                        bundleM771M = bt1Var2.m771M();
                        if (bundleM771M != null) {
                            if (bundleM771M.containsKey("analytics.safelisted_events")) {
                                numValueOf = Integer.valueOf(bundleM771M.getInt("analytics.safelisted_events"));
                            }
                            if (numValueOf != null) {
                                try {
                                    stringArray = f02Var.f2242j.getResources().getStringArray(numValueOf.intValue());
                                    if (stringArray == null) {
                                        listAsList = null;
                                    } else {
                                        listAsList = Arrays.asList(stringArray);
                                    }
                                } catch (Resources.NotFoundException e) {
                                    ky1 ky1Var6 = f02Var.f2247o;
                                    f02.m1560m(ky1Var6);
                                    ky1Var6.f4600o.m5313b(e, "Failed to load string array from metadata: resource not found");
                                }
                            } else {
                                listAsList = null;
                            }
                            if (listAsList != null) {
                                vx1Var2.f8292t = listAsList;
                                break;
                            }
                            if (listAsList.isEmpty()) {
                                it = listAsList.iterator();
                                do {
                                    if (it.hasNext()) {
                                        vx1Var2.f8292t = listAsList;
                                        break;
                                    } else {
                                        str3 = (String) it.next();
                                        f72Var3 = f02Var7.f2250r;
                                        f02.m1558k(f72Var3);
                                    }
                                } while (f72Var3.m1702F0("safelisted event", str3));
                            } else {
                                f02.m1560m(ky1Var5);
                                ky1Var5.f4605t.m5312a("Safelisted event list is empty. Ignoring");
                            }
                            if (packageManager != null) {
                                vx1Var2.f8295w = yd0.m5773l(context2) ? 1 : 0;
                            } else {
                                vx1Var2.f8295w = 0;
                            }
                            ((f02) vx1Var2.f7192j).f2239L.incrementAndGet();
                            vx1Var2.f5182k = true;
                            b32Var = new b32(f02Var5);
                            b32Var.m3447C();
                            f02Var5.f2231D = b32Var;
                            if (!b32Var.f5182k) {
                                C0270h1.m2191g("Can't initialize twice");
                                return;
                            }
                            b32Var.f703l = (JobScheduler) ((f02) b32Var.f7192j).f2242j.getSystemService("jobscheduler");
                            ((f02) b32Var.f7192j).f2239L.incrementAndGet();
                            b32Var.f5182k = true;
                            f02.m1560m(ky1Var2);
                            wc1Var = ky1Var2.f4607v;
                            wc1Var2 = ky1Var2.f4606u;
                            wc1Var3 = ky1Var2.f4608w;
                            wc1Var4 = ky1Var2.f4600o;
                            bt1Var.m765G();
                            wc1Var2.m5313b(161000L, "App measurement initialized, version");
                            f02.m1560m(ky1Var2);
                            wc1Var2.m5312a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                            strM5219G = vx1Var.m5219G();
                            if (f72Var4.m1726g0(strM5219G, bt1Var.f983l)) {
                                f02.m1560m(ky1Var2);
                                wc1Var2.m5312a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                            } else {
                                f02.m1560m(ky1Var2);
                                wc1Var2.m5312a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5219G)));
                            }
                            f02.m1560m(ky1Var2);
                            wc1Var.m5312a("Debug-level message logging enabled");
                            i2 = f02Var5.f2237J;
                            atomicInteger = f02Var5.f2239L;
                            if (i2 != atomicInteger.get()) {
                                f02.m1560m(ky1Var2);
                                wc1Var4.m5314c(Integer.valueOf(f02Var5.f2237J), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                            }
                            f02Var5.f2232E = true;
                            j = f02Var5.f2240M;
                            v22Var = f02Var5.f2254v;
                            a02 a02Var2 = f02Var5.f2248p;
                            f02.m1560m(a02Var2);
                            a02Var2.mo11z();
                            f02.m1557j(f02Var5.f2231D);
                            iM588F = f02Var5.f2231D.m588F();
                            fs1.m1890a();
                            zM770L = bt1Var.m770L(null, jx1.f4143P0);
                            if (iM588F == 2) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (zM770L) {
                                f72Var4.mo11z();
                                if (f72Var4.m1722Y() == 1) {
                                    f72Var4.mo11z();
                                    IntentFilter intentFilter = new IntentFilter();
                                    intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter);
                                    ky1 ky1Var7 = f02Var6.f2247o;
                                    f02.m1560m(ky1Var7);
                                    ky1Var7.f4607v.m5312a("Registered app receiver");
                                    if (z2) {
                                        f02.m1557j(f02Var5.f2231D);
                                        f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                                    }
                                } else if (z) {
                                    z = true;
                                    f72Var4.mo11z();
                                    IntentFilter intentFilter2 = new IntentFilter();
                                    intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                    intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                    z2 = z;
                                    xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter2);
                                    ky1 ky1Var8 = f02Var6.f2247o;
                                    f02.m1560m(ky1Var8);
                                    ky1Var8.f4607v.m5312a("Registered app receiver");
                                    if (z2) {
                                        f02.m1557j(f02Var5.f2231D);
                                        f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                                    }
                                }
                            } else if (z) {
                                z = true;
                                f72Var4.mo11z();
                                IntentFilter intentFilter3 = new IntentFilter();
                                intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter3);
                                ky1 ky1Var9 = f02Var6.f2247o;
                                f02.m1560m(ky1Var9);
                                ky1Var9.f4607v.m5312a("Registered app receiver");
                                if (z2) {
                                    f02.m1557j(f02Var5.f2231D);
                                    f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                                }
                            }
                            c0809vn = fz1Var.f2553p;
                            l12VarM1911H = fz1Var.m1911H();
                            int i3 = l12VarM1911H.f4645b;
                            h12VarM775Q = bt1Var.m775Q("google_analytics_default_allow_ad_storage", false);
                            h12VarM775Q2 = bt1Var.m775Q("google_analytics_default_allow_analytics_storage", false);
                            k12Var = k12.f4250l;
                            h12Var = h12.f3002k;
                            if (h12VarM775Q == h12Var || h12VarM775Q2 != h12Var) {
                                f02Var2 = f02Var5;
                                wc1Var5 = wc1Var4;
                                f72Var = f72Var4;
                                if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                                    EnumMap enumMap = new EnumMap(k12.class);
                                    enumMap.put(k12.f4249k, h12VarM775Q);
                                    enumMap.put(k12Var, h12VarM775Q2);
                                    l12Var = new l12(enumMap, -10);
                                }
                                if (l12Var != null) {
                                    f02.m1559l(v22Var);
                                    v22Var.m5041W(l12Var, true);
                                    l12Var2 = l12Var;
                                } else {
                                    l12Var2 = l12VarM1911H;
                                }
                                f02.m1559l(v22Var);
                                f02Var3 = (f02) v22Var.f7192j;
                                v22Var.m5045a0(l12Var2);
                                fz1Var.mo11z();
                                int i4 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
                                h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
                                if (h12VarM775Q3 != h12Var) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
                                }
                                h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
                                if (h12VarM775Q4 == h12Var && l12.m3154l(-10, i4)) {
                                    f02.m1559l(v22Var);
                                    EnumMap enumMap2 = new EnumMap(k12.class);
                                    enumMap2.put(k12.f4251m, h12VarM775Q4);
                                    v22Var.m5040V(new zt1(enumMap2, -10, (Boolean) null, (String) null), true);
                                } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H()) && (i4 == 0 || i4 == 30)) {
                                    f02.m1559l(v22Var);
                                    v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                                boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
                                if (boolM772N != null || boolM772N.booleanValue()) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var.m5312a("TCF client enabled.");
                                    f02.m1559l(v22Var);
                                    v22Var.mo11z();
                                    ky1 ky1Var10 = f02Var3.f2247o;
                                    f02.m1560m(ky1Var10);
                                    ky1Var10.f4607v.m5312a("Register tcfPrefChangeListener.");
                                    if (v22Var.f8007C == null) {
                                        v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                                        v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                                v22 v22Var2 = v22Var;
                                                v22Var2.getClass();
                                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                    ky1 ky1Var11 = ((f02) v22Var2.f7192j).f2247o;
                                                    f02.m1560m(ky1Var11);
                                                    ky1Var11.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                                    t12 t12Var = v22Var2.f8008D;
                                                    p80.m3863h(t12Var);
                                                    t12Var.m4403b(500L);
                                                }
                                            }
                                        };
                                    }
                                    fz1 fz1Var2 = f02Var3.f2246n;
                                    f02.m1558k(fz1Var2);
                                    fz1Var2.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                                    f02.m1559l(v22Var);
                                    v22Var.m5025G();
                                }
                                bz1Var = fz1Var.f2552o;
                                if (bz1Var.m821a() == 0) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
                                    bz1Var.m822b(j);
                                }
                                f02.m1559l(v22Var);
                                iz1Var = v22Var.f8024z;
                                if (iz1Var.m2753d() && iz1Var.m2752c()) {
                                    fz1 fz1Var3 = iz1Var.f3760a.f2246n;
                                    f02.m1558k(fz1Var3);
                                    fz1Var3.f2546F.m5182m(null);
                                }
                                if (f02Var2.m1569h()) {
                                    f02Var4 = f02Var2;
                                    f72Var2 = f72Var;
                                    if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                        c0809vn2 = c0809vn;
                                    } else {
                                        String strM5220H = f02Var4.m1575r().m5220H();
                                        fz1Var.mo11z();
                                        String string2 = fz1Var.m1908E().getString("gmp_app_id", null);
                                        zIsEmpty = TextUtils.isEmpty(strM5220H);
                                        boolean zIsEmpty2 = TextUtils.isEmpty(string2);
                                        if (!zIsEmpty || zIsEmpty2) {
                                            c0809vn2 = c0809vn;
                                        } else {
                                            p80.m3863h(strM5220H);
                                            if (strM5220H.equals(string2)) {
                                                c0809vn2 = c0809vn;
                                            } else {
                                                f02.m1560m(ky1Var2);
                                                wc1Var2.m5312a("Rechecking which service to use due to a GMP App Id change");
                                                fz1Var.mo11z();
                                                fz1Var.mo11z();
                                                Boolean boolValueOf = fz1Var.m1908E().contains("measurement_enabled") ? Boolean.valueOf(fz1Var.m1908E().getBoolean("measurement_enabled", true)) : null;
                                                SharedPreferences.Editor editorEdit2 = fz1Var.m1908E().edit();
                                                editorEdit2.clear();
                                                editorEdit2.apply();
                                                if (boolValueOf != null) {
                                                    fz1Var.mo11z();
                                                    SharedPreferences.Editor editorEdit3 = fz1Var.m1908E().edit();
                                                    editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                                    editorEdit3.apply();
                                                }
                                                f02Var4.m1572o().m534E();
                                                f02Var4.f2228A.m5061I();
                                                f02Var4.f2228A.m5059G();
                                                bz1Var.m822b(j);
                                                c0809vn2 = c0809vn;
                                                c0809vn2.m5182m(null);
                                            }
                                        }
                                        String strM5220H2 = f02Var4.m1575r().m5220H();
                                        fz1Var.mo11z();
                                        SharedPreferences.Editor editorEdit4 = fz1Var.m1908E().edit();
                                        editorEdit4.putString("gmp_app_id", strM5220H2);
                                        editorEdit4.apply();
                                    }
                                    if (!fz1Var.m1911H().m3157i(k12Var)) {
                                        c0809vn2.m5182m(null);
                                    }
                                    f02.m1559l(v22Var);
                                    v22Var.f8014p.set(c0809vn2.m5181l());
                                    try {
                                        f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                    } catch (ClassNotFoundException unused4) {
                                        C0809vn c0809vn3 = fz1Var.f2545E;
                                        if (!TextUtils.isEmpty(c0809vn3.m5181l())) {
                                            f02.m1560m(ky1Var2);
                                            ky1Var = ky1Var2;
                                            ky1Var.f4603r.m5312a("Remote config removed with active feature rollouts");
                                            c0809vn3.m5182m(null);
                                        }
                                        if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                            zM1565d = f02Var4.m1565d();
                                            sharedPreferences = fz1Var.f2549l;
                                            if (sharedPreferences == null) {
                                                zContains = false;
                                            } else {
                                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                                            }
                                            if (!zContains) {
                                                fz1Var.m1912I(!zM1565d);
                                            }
                                            if (zM1565d) {
                                                f02.m1559l(v22Var);
                                                v22Var.m5031M();
                                            }
                                            s52 s52Var = f02Var4.f2249q;
                                            f02.m1559l(s52Var);
                                            s52Var.f7034n.m325y();
                                            f02Var4.m1573p().m5057E(new AtomicReference());
                                            f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                                        }
                                        fs1.m1890a();
                                        if (bt1Var.m770L(null, jx1.f4143P0)) {
                                            f72Var2.mo11z();
                                            if (f72Var2.m1722Y() == 1) {
                                                long jIntValue = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                                                long jNextInt = new Random().nextInt(5000);
                                                f02Var4.f2252t.getClass();
                                                jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                                if (jMax > 500) {
                                                    f02.m1560m(ky1Var);
                                                    wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                                }
                                                f02.m1559l(v22Var);
                                                v22Var.mo11z();
                                                if (v22Var.f8019u == null) {
                                                    v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                                                }
                                                v22Var.f8019u.m4403b(jMax);
                                            }
                                        }
                                        fz1Var.f2561x.m5853b(true);
                                    }
                                    ky1Var = ky1Var2;
                                    if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                        zM1565d = f02Var4.m1565d();
                                        sharedPreferences = fz1Var.f2549l;
                                        if (sharedPreferences == null) {
                                            zContains = false;
                                        } else {
                                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                                        }
                                        if (!zContains && !bt1Var.m773O()) {
                                            fz1Var.m1912I(!zM1565d);
                                        }
                                        if (zM1565d) {
                                            f02.m1559l(v22Var);
                                            v22Var.m5031M();
                                        }
                                        s52 s52Var2 = f02Var4.f2249q;
                                        f02.m1559l(s52Var2);
                                        s52Var2.f7034n.m325y();
                                        f02Var4.m1573p().m5057E(new AtomicReference());
                                        f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                                    }
                                } else {
                                    if (f02Var2.m1565d()) {
                                        f72Var2 = f72Var;
                                        if (f72Var2.m1725e0("android.permission.INTERNET")) {
                                            wc1Var6 = wc1Var5;
                                        } else {
                                            f02.m1560m(ky1Var2);
                                            wc1Var6 = wc1Var5;
                                            wc1Var6.m5312a("App is missing INTERNET permission");
                                        }
                                        if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                                            f02.m1560m(ky1Var2);
                                            wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                                        }
                                        f02Var4 = f02Var2;
                                        context = f02Var4.f2242j;
                                        if (!tk1.m4792a(context).m1503f() && !bt1Var.m762D()) {
                                            if (!f72.m1695w0(context)) {
                                                f02.m1560m(ky1Var2);
                                                wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                                            }
                                            if (!f72.m1687V(context)) {
                                                f02.m1560m(ky1Var2);
                                                wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                                            }
                                        }
                                        f02.m1560m(ky1Var2);
                                        wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
                                    } else {
                                        f02Var4 = f02Var2;
                                        f72Var2 = f72Var;
                                    }
                                    ky1Var = ky1Var2;
                                }
                                fs1.m1890a();
                                if (bt1Var.m770L(null, jx1.f4143P0)) {
                                    f72Var2.mo11z();
                                    if (f72Var2.m1722Y() == 1) {
                                        long jIntValue2 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                                        long jNextInt2 = new Random().nextInt(5000);
                                        f02Var4.f2252t.getClass();
                                        jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            f02.m1560m(ky1Var);
                                            wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        f02.m1559l(v22Var);
                                        v22Var.mo11z();
                                        if (v22Var.f8019u == null) {
                                            v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                                        }
                                        v22Var.f8019u.m4403b(jMax);
                                    }
                                }
                                fz1Var.f2561x.m5853b(true);
                            }
                            f02Var2 = f02Var5;
                            wc1Var5 = wc1Var4;
                            f72Var = f72Var4;
                            if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                                f02.m1559l(v22Var);
                                v22Var.m5041W(new l12(-10), false);
                            }
                            l12Var = null;
                            if (l12Var != null) {
                                f02.m1559l(v22Var);
                                v22Var.m5041W(l12Var, true);
                                l12Var2 = l12Var;
                            } else {
                                l12Var2 = l12VarM1911H;
                            }
                            f02.m1559l(v22Var);
                            f02Var3 = (f02) v22Var.f7192j;
                            v22Var.m5045a0(l12Var2);
                            fz1Var.mo11z();
                            int i5 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
                            h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
                            if (h12VarM775Q3 != h12Var) {
                                f02.m1560m(ky1Var2);
                                wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
                            }
                            h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
                            if (h12VarM775Q4 == h12Var) {
                                if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                    f02.m1559l(v22Var);
                                    v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                                }
                            } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                f02.m1559l(v22Var);
                                v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                            boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
                            if (boolM772N != null) {
                                f02.m1560m(ky1Var2);
                                wc1Var.m5312a("TCF client enabled.");
                                f02.m1559l(v22Var);
                                v22Var.mo11z();
                                ky1 ky1Var11 = f02Var3.f2247o;
                                f02.m1560m(ky1Var11);
                                ky1Var11.f4607v.m5312a("Register tcfPrefChangeListener.");
                                if (v22Var.f8007C == null) {
                                    v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                                    v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                            v22 v22Var2 = v22Var;
                                            v22Var2.getClass();
                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                ky1 ky1Var12 = ((f02) v22Var2.f7192j).f2247o;
                                                f02.m1560m(ky1Var12);
                                                ky1Var12.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                                t12 t12Var = v22Var2.f8008D;
                                                p80.m3863h(t12Var);
                                                t12Var.m4403b(500L);
                                            }
                                        }
                                    };
                                }
                                fz1 fz1Var4 = f02Var3.f2246n;
                                f02.m1558k(fz1Var4);
                                fz1Var4.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                                f02.m1559l(v22Var);
                                v22Var.m5025G();
                            } else {
                                f02.m1560m(ky1Var2);
                                wc1Var.m5312a("TCF client enabled.");
                                f02.m1559l(v22Var);
                                v22Var.mo11z();
                                ky1 ky1Var12 = f02Var3.f2247o;
                                f02.m1560m(ky1Var12);
                                ky1Var12.f4607v.m5312a("Register tcfPrefChangeListener.");
                                if (v22Var.f8007C == null) {
                                    v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                                    v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                            v22 v22Var2 = v22Var;
                                            v22Var2.getClass();
                                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                                ky1 ky1Var13 = ((f02) v22Var2.f7192j).f2247o;
                                                f02.m1560m(ky1Var13);
                                                ky1Var13.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                                t12 t12Var = v22Var2.f8008D;
                                                p80.m3863h(t12Var);
                                                t12Var.m4403b(500L);
                                            }
                                        }
                                    };
                                }
                                fz1 fz1Var5 = f02Var3.f2246n;
                                f02.m1558k(fz1Var5);
                                fz1Var5.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                                f02.m1559l(v22Var);
                                v22Var.m5025G();
                            }
                            bz1Var = fz1Var.f2552o;
                            if (bz1Var.m821a() == 0) {
                                f02.m1560m(ky1Var2);
                                wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
                                bz1Var.m822b(j);
                            }
                            f02.m1559l(v22Var);
                            iz1Var = v22Var.f8024z;
                            if (iz1Var.m2753d()) {
                                fz1 fz1Var6 = iz1Var.f3760a.f2246n;
                                f02.m1558k(fz1Var6);
                                fz1Var6.f2546F.m5182m(null);
                            }
                            if (f02Var2.m1569h()) {
                                if (f02Var2.m1565d()) {
                                    f72Var2 = f72Var;
                                    if (f72Var2.m1725e0("android.permission.INTERNET")) {
                                        f02.m1560m(ky1Var2);
                                        wc1Var6 = wc1Var5;
                                        wc1Var6.m5312a("App is missing INTERNET permission");
                                    } else {
                                        wc1Var6 = wc1Var5;
                                    }
                                    if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                                        f02.m1560m(ky1Var2);
                                        wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                                    }
                                    f02Var4 = f02Var2;
                                    context = f02Var4.f2242j;
                                    if (!tk1.m4792a(context).m1503f()) {
                                        if (!f72.m1695w0(context)) {
                                            f02.m1560m(ky1Var2);
                                            wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                                        }
                                        if (!f72.m1687V(context)) {
                                            f02.m1560m(ky1Var2);
                                            wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                                        }
                                    }
                                    f02.m1560m(ky1Var2);
                                    wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
                                } else {
                                    f02Var4 = f02Var2;
                                    f72Var2 = f72Var;
                                }
                                ky1Var = ky1Var2;
                            } else {
                                f02Var4 = f02Var2;
                                f72Var2 = f72Var;
                                if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                    String strM5220H3 = f02Var4.m1575r().m5220H();
                                    fz1Var.mo11z();
                                    String string3 = fz1Var.m1908E().getString("gmp_app_id", null);
                                    zIsEmpty = TextUtils.isEmpty(strM5220H3);
                                    boolean zIsEmpty3 = TextUtils.isEmpty(string3);
                                    if (zIsEmpty) {
                                        c0809vn2 = c0809vn;
                                    } else {
                                        c0809vn2 = c0809vn;
                                    }
                                    String strM5220H4 = f02Var4.m1575r().m5220H();
                                    fz1Var.mo11z();
                                    SharedPreferences.Editor editorEdit5 = fz1Var.m1908E().edit();
                                    editorEdit5.putString("gmp_app_id", strM5220H4);
                                    editorEdit5.apply();
                                } else {
                                    c0809vn2 = c0809vn;
                                }
                                if (!fz1Var.m1911H().m3157i(k12Var)) {
                                    c0809vn2.m5182m(null);
                                }
                                f02.m1559l(v22Var);
                                v22Var.f8014p.set(c0809vn2.m5181l());
                                f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                                ky1Var = ky1Var2;
                                if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                    zM1565d = f02Var4.m1565d();
                                    sharedPreferences = fz1Var.f2549l;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        fz1Var.m1912I(!zM1565d);
                                    }
                                    if (zM1565d) {
                                        f02.m1559l(v22Var);
                                        v22Var.m5031M();
                                    }
                                    s52 s52Var3 = f02Var4.f2249q;
                                    f02.m1559l(s52Var3);
                                    s52Var3.f7034n.m325y();
                                    f02Var4.m1573p().m5057E(new AtomicReference());
                                    f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                                }
                            }
                            fs1.m1890a();
                            if (bt1Var.m770L(null, jx1.f4143P0)) {
                                f72Var2.mo11z();
                                if (f72Var2.m1722Y() == 1) {
                                    long jIntValue3 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                                    long jNextInt3 = new Random().nextInt(5000);
                                    f02Var4.f2252t.getClass();
                                    jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                                    if (jMax > 500) {
                                        f02.m1560m(ky1Var);
                                        wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                    }
                                    f02.m1559l(v22Var);
                                    v22Var.mo11z();
                                    if (v22Var.f8019u == null) {
                                        v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                                    }
                                    v22Var.f8019u.m4403b(jMax);
                                }
                            }
                            fz1Var.f2561x.m5853b(true);
                        }
                        ky1 ky1Var13 = f02Var.f2247o;
                        f02.m1560m(ky1Var13);
                        ky1Var13.f4600o.m5312a("Failed to load metadata: Metadata bundle is null");
                        numValueOf = null;
                        if (numValueOf != null) {
                            stringArray = f02Var.f2242j.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } else {
                            listAsList = null;
                        }
                        if (listAsList != null) {
                            vx1Var2.f8292t = listAsList;
                            break;
                        }
                        if (listAsList.isEmpty()) {
                            it = listAsList.iterator();
                            do {
                                if (it.hasNext()) {
                                    vx1Var2.f8292t = listAsList;
                                    break;
                                } else {
                                    str3 = (String) it.next();
                                    f72Var3 = f02Var7.f2250r;
                                    f02.m1558k(f72Var3);
                                }
                            } while (f72Var3.m1702F0("safelisted event", str3));
                        } else {
                            f02.m1560m(ky1Var5);
                            ky1Var5.f4605t.m5312a("Safelisted event list is empty. Ignoring");
                        }
                        if (packageManager != null) {
                            vx1Var2.f8295w = yd0.m5773l(context2) ? 1 : 0;
                        } else {
                            vx1Var2.f8295w = 0;
                        }
                        ((f02) vx1Var2.f7192j).f2239L.incrementAndGet();
                        vx1Var2.f5182k = true;
                        b32Var = new b32(f02Var5);
                        b32Var.m3447C();
                        f02Var5.f2231D = b32Var;
                        if (!b32Var.f5182k) {
                            C0270h1.m2191g("Can't initialize twice");
                            return;
                        }
                        b32Var.f703l = (JobScheduler) ((f02) b32Var.f7192j).f2242j.getSystemService("jobscheduler");
                        ((f02) b32Var.f7192j).f2239L.incrementAndGet();
                        b32Var.f5182k = true;
                        f02.m1560m(ky1Var2);
                        wc1Var = ky1Var2.f4607v;
                        wc1Var2 = ky1Var2.f4606u;
                        wc1Var3 = ky1Var2.f4608w;
                        wc1Var4 = ky1Var2.f4600o;
                        bt1Var.m765G();
                        wc1Var2.m5313b(161000L, "App measurement initialized, version");
                        f02.m1560m(ky1Var2);
                        wc1Var2.m5312a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                        strM5219G = vx1Var.m5219G();
                        if (f72Var4.m1726g0(strM5219G, bt1Var.f983l)) {
                            f02.m1560m(ky1Var2);
                            wc1Var2.m5312a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                        } else {
                            f02.m1560m(ky1Var2);
                            wc1Var2.m5312a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5219G)));
                        }
                        f02.m1560m(ky1Var2);
                        wc1Var.m5312a("Debug-level message logging enabled");
                        i2 = f02Var5.f2237J;
                        atomicInteger = f02Var5.f2239L;
                        if (i2 != atomicInteger.get()) {
                            f02.m1560m(ky1Var2);
                            wc1Var4.m5314c(Integer.valueOf(f02Var5.f2237J), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                        }
                        f02Var5.f2232E = true;
                        j = f02Var5.f2240M;
                        v22Var = f02Var5.f2254v;
                        a02 a02Var3 = f02Var5.f2248p;
                        f02.m1560m(a02Var3);
                        a02Var3.mo11z();
                        f02.m1557j(f02Var5.f2231D);
                        iM588F = f02Var5.f2231D.m588F();
                        fs1.m1890a();
                        zM770L = bt1Var.m770L(null, jx1.f4143P0);
                        if (iM588F == 2) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (zM770L) {
                            f72Var4.mo11z();
                            if (f72Var4.m1722Y() == 1) {
                                f72Var4.mo11z();
                                IntentFilter intentFilter4 = new IntentFilter();
                                intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter4);
                                ky1 ky1Var14 = f02Var6.f2247o;
                                f02.m1560m(ky1Var14);
                                ky1Var14.f4607v.m5312a("Registered app receiver");
                                if (z2) {
                                    f02.m1557j(f02Var5.f2231D);
                                    f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                                }
                            } else if (z) {
                                z = true;
                                f72Var4.mo11z();
                                IntentFilter intentFilter5 = new IntentFilter();
                                intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                                intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                                z2 = z;
                                xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter5);
                                ky1 ky1Var15 = f02Var6.f2247o;
                                f02.m1560m(ky1Var15);
                                ky1Var15.f4607v.m5312a("Registered app receiver");
                                if (z2) {
                                    f02.m1557j(f02Var5.f2231D);
                                    f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                                }
                            }
                        } else if (z) {
                            z = true;
                            f72Var4.mo11z();
                            IntentFilter intentFilter6 = new IntentFilter();
                            intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter6);
                            ky1 ky1Var16 = f02Var6.f2247o;
                            f02.m1560m(ky1Var16);
                            ky1Var16.f4607v.m5312a("Registered app receiver");
                            if (z2) {
                                f02.m1557j(f02Var5.f2231D);
                                f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                            }
                        }
                        c0809vn = fz1Var.f2553p;
                        l12VarM1911H = fz1Var.m1911H();
                        int i6 = l12VarM1911H.f4645b;
                        h12VarM775Q = bt1Var.m775Q("google_analytics_default_allow_ad_storage", false);
                        h12VarM775Q2 = bt1Var.m775Q("google_analytics_default_allow_analytics_storage", false);
                        k12Var = k12.f4250l;
                        h12Var = h12.f3002k;
                        if (h12VarM775Q == h12Var) {
                            f02Var2 = f02Var5;
                            wc1Var5 = wc1Var4;
                            f72Var = f72Var4;
                            if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                                EnumMap enumMap3 = new EnumMap(k12.class);
                                enumMap3.put(k12.f4249k, h12VarM775Q);
                                enumMap3.put(k12Var, h12VarM775Q2);
                                l12Var = new l12(enumMap3, -10);
                            } else {
                                if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                    f02.m1559l(v22Var);
                                    v22Var.m5041W(new l12(-10), false);
                                }
                                l12Var = null;
                            }
                        } else {
                            f02Var2 = f02Var5;
                            wc1Var5 = wc1Var4;
                            f72Var = f72Var4;
                            if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                                EnumMap enumMap4 = new EnumMap(k12.class);
                                enumMap4.put(k12.f4249k, h12VarM775Q);
                                enumMap4.put(k12Var, h12VarM775Q2);
                                l12Var = new l12(enumMap4, -10);
                            } else {
                                if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                    f02.m1559l(v22Var);
                                    v22Var.m5041W(new l12(-10), false);
                                }
                                l12Var = null;
                            }
                        }
                        if (l12Var != null) {
                            f02.m1559l(v22Var);
                            v22Var.m5041W(l12Var, true);
                            l12Var2 = l12Var;
                        } else {
                            l12Var2 = l12VarM1911H;
                        }
                        f02.m1559l(v22Var);
                        f02Var3 = (f02) v22Var.f7192j;
                        v22Var.m5045a0(l12Var2);
                        fz1Var.mo11z();
                        int i7 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
                        h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
                        if (h12VarM775Q3 != h12Var) {
                            f02.m1560m(ky1Var2);
                            wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
                        }
                        h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
                        if (h12VarM775Q4 == h12Var) {
                            if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                f02.m1559l(v22Var);
                                v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                            }
                        } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                            f02.m1559l(v22Var);
                            v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
                        if (boolM772N != null) {
                            f02.m1560m(ky1Var2);
                            wc1Var.m5312a("TCF client enabled.");
                            f02.m1559l(v22Var);
                            v22Var.mo11z();
                            ky1 ky1Var17 = f02Var3.f2247o;
                            f02.m1560m(ky1Var17);
                            ky1Var17.f4607v.m5312a("Register tcfPrefChangeListener.");
                            if (v22Var.f8007C == null) {
                                v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                                v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                        v22 v22Var2 = v22Var;
                                        v22Var2.getClass();
                                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                            ky1 ky1Var18 = ((f02) v22Var2.f7192j).f2247o;
                                            f02.m1560m(ky1Var18);
                                            ky1Var18.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                            t12 t12Var = v22Var2.f8008D;
                                            p80.m3863h(t12Var);
                                            t12Var.m4403b(500L);
                                        }
                                    }
                                };
                            }
                            fz1 fz1Var7 = f02Var3.f2246n;
                            f02.m1558k(fz1Var7);
                            fz1Var7.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                            f02.m1559l(v22Var);
                            v22Var.m5025G();
                        } else {
                            f02.m1560m(ky1Var2);
                            wc1Var.m5312a("TCF client enabled.");
                            f02.m1559l(v22Var);
                            v22Var.mo11z();
                            ky1 ky1Var18 = f02Var3.f2247o;
                            f02.m1560m(ky1Var18);
                            ky1Var18.f4607v.m5312a("Register tcfPrefChangeListener.");
                            if (v22Var.f8007C == null) {
                                v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                                v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                        v22 v22Var2 = v22Var;
                                        v22Var2.getClass();
                                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                            ky1 ky1Var19 = ((f02) v22Var2.f7192j).f2247o;
                                            f02.m1560m(ky1Var19);
                                            ky1Var19.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                            t12 t12Var = v22Var2.f8008D;
                                            p80.m3863h(t12Var);
                                            t12Var.m4403b(500L);
                                        }
                                    }
                                };
                            }
                            fz1 fz1Var8 = f02Var3.f2246n;
                            f02.m1558k(fz1Var8);
                            fz1Var8.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                            f02.m1559l(v22Var);
                            v22Var.m5025G();
                        }
                        bz1Var = fz1Var.f2552o;
                        if (bz1Var.m821a() == 0) {
                            f02.m1560m(ky1Var2);
                            wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
                            bz1Var.m822b(j);
                        }
                        f02.m1559l(v22Var);
                        iz1Var = v22Var.f8024z;
                        if (iz1Var.m2753d()) {
                            fz1 fz1Var9 = iz1Var.f3760a.f2246n;
                            f02.m1558k(fz1Var9);
                            fz1Var9.f2546F.m5182m(null);
                        }
                        if (f02Var2.m1569h()) {
                            if (f02Var2.m1565d()) {
                                f72Var2 = f72Var;
                                if (f72Var2.m1725e0("android.permission.INTERNET")) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var6 = wc1Var5;
                                    wc1Var6.m5312a("App is missing INTERNET permission");
                                } else {
                                    wc1Var6 = wc1Var5;
                                }
                                if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                f02Var4 = f02Var2;
                                context = f02Var4.f2242j;
                                if (!tk1.m4792a(context).m1503f()) {
                                    if (!f72.m1695w0(context)) {
                                        f02.m1560m(ky1Var2);
                                        wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!f72.m1687V(context)) {
                                        f02.m1560m(ky1Var2);
                                        wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                f02.m1560m(ky1Var2);
                                wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
                            } else {
                                f02Var4 = f02Var2;
                                f72Var2 = f72Var;
                            }
                            ky1Var = ky1Var2;
                        } else {
                            f02Var4 = f02Var2;
                            f72Var2 = f72Var;
                            if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                String strM5220H5 = f02Var4.m1575r().m5220H();
                                fz1Var.mo11z();
                                String string4 = fz1Var.m1908E().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strM5220H5);
                                boolean zIsEmpty4 = TextUtils.isEmpty(string4);
                                if (zIsEmpty) {
                                    c0809vn2 = c0809vn;
                                } else {
                                    c0809vn2 = c0809vn;
                                }
                                String strM5220H6 = f02Var4.m1575r().m5220H();
                                fz1Var.mo11z();
                                SharedPreferences.Editor editorEdit6 = fz1Var.m1908E().edit();
                                editorEdit6.putString("gmp_app_id", strM5220H6);
                                editorEdit6.apply();
                            } else {
                                c0809vn2 = c0809vn;
                            }
                            if (!fz1Var.m1911H().m3157i(k12Var)) {
                                c0809vn2.m5182m(null);
                            }
                            f02.m1559l(v22Var);
                            v22Var.f8014p.set(c0809vn2.m5181l());
                            f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            ky1Var = ky1Var2;
                            if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                                zM1565d = f02Var4.m1565d();
                                sharedPreferences = fz1Var.f2549l;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains) {
                                    fz1Var.m1912I(!zM1565d);
                                }
                                if (zM1565d) {
                                    f02.m1559l(v22Var);
                                    v22Var.m5031M();
                                }
                                s52 s52Var4 = f02Var4.f2249q;
                                f02.m1559l(s52Var4);
                                s52Var4.f7034n.m325y();
                                f02Var4.m1573p().m5057E(new AtomicReference());
                                f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                            }
                        }
                        fs1.m1890a();
                        if (bt1Var.m770L(null, jx1.f4143P0)) {
                            f72Var2.mo11z();
                            if (f72Var2.m1722Y() == 1) {
                                long jIntValue4 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                                long jNextInt4 = new Random().nextInt(5000);
                                f02Var4.f2252t.getClass();
                                jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    f02.m1560m(ky1Var);
                                    wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                f02.m1559l(v22Var);
                                v22Var.mo11z();
                                if (v22Var.f8019u == null) {
                                    v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                                }
                                v22Var.f8019u.m4403b(jMax);
                            }
                        }
                        fz1Var.f2561x.m5853b(true);
                    }
                    str6 = "manual_install";
                    packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        if (TextUtils.isEmpty(applicationLabel)) {
                            string = applicationLabel.toString();
                        } else {
                            string = "Unknown";
                        }
                        str = packageInfo.versionName;
                        i = packageInfo.versionCode;
                        vx1Var = vx1Var;
                        str2 = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException unused5) {
                    string = "Unknown";
                }
                installerPackageName = str6;
                vx1Var2.f8284l = packageName;
                vx1Var2.f8287o = str2;
                vx1Var2.f8285m = str;
                vx1Var2.f8286n = i;
                vx1Var2.f8288p = string;
                vx1Var2.f8289q = 0L;
                iM1568g = f02Var7.m1568g();
                if (iM1568g == 0) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4608w.m5312a("App measurement collection enabled");
                } else if (iM1568g == 1) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5312a("App measurement deactivated via the manifest");
                } else if (iM1568g == 3) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5312a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iM1568g == 4) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5312a("App measurement disabled via the manifest");
                } else if (iM1568g == 6) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4605t.m5312a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iM1568g == 7) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5312a("App measurement disabled via the global data collection setting");
                } else if (iM1568g != 8) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5312a("App measurement disabled");
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4601p.m5312a("Invalid scion state in identity");
                } else {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5312a("App measurement disabled due to denied storage consent");
                }
                vx1Var2.f8296x = "";
                strM5655q = vx1Var2.f8294v;
                if (TextUtils.isEmpty(strM5655q)) {
                    strM5655q = AbstractC0875xf.m5655q(context2, f02Var7.f2257y);
                }
                if (!TextUtils.isEmpty(strM5655q)) {
                    str4 = strM5655q;
                }
                vx1Var2.f8296x = str4;
                if (iM1568g == 0) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4608w.m5314c(vx1Var2.f8284l, vx1Var2.f8296x, "App measurement enabled for app package, google app id");
                }
                vx1Var2.f8292t = null;
                bt1 bt1Var3 = f02Var7.f2245m;
                f02Var = (f02) bt1Var3.f7192j;
                p80.m3860e("analytics.safelisted_events");
                bundleM771M = bt1Var3.m771M();
                if (bundleM771M != null) {
                    if (bundleM771M.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleM771M.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        stringArray = f02Var.f2242j.getResources().getStringArray(numValueOf.intValue());
                        if (stringArray == null) {
                            listAsList = null;
                        } else {
                            listAsList = Arrays.asList(stringArray);
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        vx1Var2.f8292t = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                vx1Var2.f8292t = listAsList;
                                break;
                            } else {
                                str3 = (String) it.next();
                                f72Var3 = f02Var7.f2250r;
                                f02.m1558k(f72Var3);
                            }
                        } while (f72Var3.m1702F0("safelisted event", str3));
                    } else {
                        f02.m1560m(ky1Var5);
                        ky1Var5.f4605t.m5312a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        vx1Var2.f8295w = yd0.m5773l(context2) ? 1 : 0;
                    } else {
                        vx1Var2.f8295w = 0;
                    }
                    ((f02) vx1Var2.f7192j).f2239L.incrementAndGet();
                    vx1Var2.f5182k = true;
                    b32Var = new b32(f02Var5);
                    b32Var.m3447C();
                    f02Var5.f2231D = b32Var;
                    if (!b32Var.f5182k) {
                        C0270h1.m2191g("Can't initialize twice");
                        return;
                    }
                    b32Var.f703l = (JobScheduler) ((f02) b32Var.f7192j).f2242j.getSystemService("jobscheduler");
                    ((f02) b32Var.f7192j).f2239L.incrementAndGet();
                    b32Var.f5182k = true;
                    f02.m1560m(ky1Var2);
                    wc1Var = ky1Var2.f4607v;
                    wc1Var2 = ky1Var2.f4606u;
                    wc1Var3 = ky1Var2.f4608w;
                    wc1Var4 = ky1Var2.f4600o;
                    bt1Var.m765G();
                    wc1Var2.m5313b(161000L, "App measurement initialized, version");
                    f02.m1560m(ky1Var2);
                    wc1Var2.m5312a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strM5219G = vx1Var.m5219G();
                    if (f72Var4.m1726g0(strM5219G, bt1Var.f983l)) {
                        f02.m1560m(ky1Var2);
                        wc1Var2.m5312a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        f02.m1560m(ky1Var2);
                        wc1Var2.m5312a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5219G)));
                    }
                    f02.m1560m(ky1Var2);
                    wc1Var.m5312a("Debug-level message logging enabled");
                    i2 = f02Var5.f2237J;
                    atomicInteger = f02Var5.f2239L;
                    if (i2 != atomicInteger.get()) {
                        f02.m1560m(ky1Var2);
                        wc1Var4.m5314c(Integer.valueOf(f02Var5.f2237J), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    f02Var5.f2232E = true;
                    j = f02Var5.f2240M;
                    v22Var = f02Var5.f2254v;
                    a02 a02Var4 = f02Var5.f2248p;
                    f02.m1560m(a02Var4);
                    a02Var4.mo11z();
                    f02.m1557j(f02Var5.f2231D);
                    iM588F = f02Var5.f2231D.m588F();
                    fs1.m1890a();
                    zM770L = bt1Var.m770L(null, jx1.f4143P0);
                    if (iM588F == 2) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zM770L) {
                        f72Var4.mo11z();
                        if (f72Var4.m1722Y() == 1) {
                            f72Var4.mo11z();
                            IntentFilter intentFilter7 = new IntentFilter();
                            intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter7);
                            ky1 ky1Var19 = f02Var6.f2247o;
                            f02.m1560m(ky1Var19);
                            ky1Var19.f4607v.m5312a("Registered app receiver");
                            if (z2) {
                                f02.m1557j(f02Var5.f2231D);
                                f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            f72Var4.mo11z();
                            IntentFilter intentFilter8 = new IntentFilter();
                            intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter8);
                            ky1 ky1Var110 = f02Var6.f2247o;
                            f02.m1560m(ky1Var110);
                            ky1Var110.f4607v.m5312a("Registered app receiver");
                            if (z2) {
                                f02.m1557j(f02Var5.f2231D);
                                f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                            }
                        }
                    } else if (z) {
                        z = true;
                        f72Var4.mo11z();
                        IntentFilter intentFilter9 = new IntentFilter();
                        intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter9);
                        ky1 ky1Var111 = f02Var6.f2247o;
                        f02.m1560m(ky1Var111);
                        ky1Var111.f4607v.m5312a("Registered app receiver");
                        if (z2) {
                            f02.m1557j(f02Var5.f2231D);
                            f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                        }
                    }
                    c0809vn = fz1Var.f2553p;
                    l12VarM1911H = fz1Var.m1911H();
                    int i8 = l12VarM1911H.f4645b;
                    h12VarM775Q = bt1Var.m775Q("google_analytics_default_allow_ad_storage", false);
                    h12VarM775Q2 = bt1Var.m775Q("google_analytics_default_allow_analytics_storage", false);
                    k12Var = k12.f4250l;
                    h12Var = h12.f3002k;
                    if (h12VarM775Q == h12Var) {
                        f02Var2 = f02Var5;
                        wc1Var5 = wc1Var4;
                        f72Var = f72Var4;
                        if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                            EnumMap enumMap5 = new EnumMap(k12.class);
                            enumMap5.put(k12.f4249k, h12VarM775Q);
                            enumMap5.put(k12Var, h12VarM775Q2);
                            l12Var = new l12(enumMap5, -10);
                        } else {
                            if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                f02.m1559l(v22Var);
                                v22Var.m5041W(new l12(-10), false);
                            }
                            l12Var = null;
                        }
                    } else {
                        f02Var2 = f02Var5;
                        wc1Var5 = wc1Var4;
                        f72Var = f72Var4;
                        if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                            EnumMap enumMap6 = new EnumMap(k12.class);
                            enumMap6.put(k12.f4249k, h12VarM775Q);
                            enumMap6.put(k12Var, h12VarM775Q2);
                            l12Var = new l12(enumMap6, -10);
                        } else {
                            if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                                f02.m1559l(v22Var);
                                v22Var.m5041W(new l12(-10), false);
                            }
                            l12Var = null;
                        }
                    }
                    if (l12Var != null) {
                        f02.m1559l(v22Var);
                        v22Var.m5041W(l12Var, true);
                        l12Var2 = l12Var;
                    } else {
                        l12Var2 = l12VarM1911H;
                    }
                    f02.m1559l(v22Var);
                    f02Var3 = (f02) v22Var.f7192j;
                    v22Var.m5045a0(l12Var2);
                    fz1Var.mo11z();
                    int i9 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
                    h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
                    if (h12VarM775Q3 != h12Var) {
                        f02.m1560m(ky1Var2);
                        wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
                    }
                    h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
                    if (h12VarM775Q4 == h12Var) {
                        if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                            f02.m1559l(v22Var);
                            v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                        f02.m1559l(v22Var);
                        v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
                    if (boolM772N != null) {
                        f02.m1560m(ky1Var2);
                        wc1Var.m5312a("TCF client enabled.");
                        f02.m1559l(v22Var);
                        v22Var.mo11z();
                        ky1 ky1Var112 = f02Var3.f2247o;
                        f02.m1560m(ky1Var112);
                        ky1Var112.f4607v.m5312a("Register tcfPrefChangeListener.");
                        if (v22Var.f8007C == null) {
                            v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                            v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                    v22 v22Var2 = v22Var;
                                    v22Var2.getClass();
                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                        ky1 ky1Var113 = ((f02) v22Var2.f7192j).f2247o;
                                        f02.m1560m(ky1Var113);
                                        ky1Var113.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                        t12 t12Var = v22Var2.f8008D;
                                        p80.m3863h(t12Var);
                                        t12Var.m4403b(500L);
                                    }
                                }
                            };
                        }
                        fz1 fz1Var10 = f02Var3.f2246n;
                        f02.m1558k(fz1Var10);
                        fz1Var10.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                        f02.m1559l(v22Var);
                        v22Var.m5025G();
                    } else {
                        f02.m1560m(ky1Var2);
                        wc1Var.m5312a("TCF client enabled.");
                        f02.m1559l(v22Var);
                        v22Var.mo11z();
                        ky1 ky1Var113 = f02Var3.f2247o;
                        f02.m1560m(ky1Var113);
                        ky1Var113.f4607v.m5312a("Register tcfPrefChangeListener.");
                        if (v22Var.f8007C == null) {
                            v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                            v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                    v22 v22Var2 = v22Var;
                                    v22Var2.getClass();
                                    if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                        ky1 ky1Var114 = ((f02) v22Var2.f7192j).f2247o;
                                        f02.m1560m(ky1Var114);
                                        ky1Var114.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                        t12 t12Var = v22Var2.f8008D;
                                        p80.m3863h(t12Var);
                                        t12Var.m4403b(500L);
                                    }
                                }
                            };
                        }
                        fz1 fz1Var11 = f02Var3.f2246n;
                        f02.m1558k(fz1Var11);
                        fz1Var11.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                        f02.m1559l(v22Var);
                        v22Var.m5025G();
                    }
                    bz1Var = fz1Var.f2552o;
                    if (bz1Var.m821a() == 0) {
                        f02.m1560m(ky1Var2);
                        wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
                        bz1Var.m822b(j);
                    }
                    f02.m1559l(v22Var);
                    iz1Var = v22Var.f8024z;
                    if (iz1Var.m2753d()) {
                        fz1 fz1Var12 = iz1Var.f3760a.f2246n;
                        f02.m1558k(fz1Var12);
                        fz1Var12.f2546F.m5182m(null);
                    }
                    if (f02Var2.m1569h()) {
                        if (f02Var2.m1565d()) {
                            f72Var2 = f72Var;
                            if (f72Var2.m1725e0("android.permission.INTERNET")) {
                                f02.m1560m(ky1Var2);
                                wc1Var6 = wc1Var5;
                                wc1Var6.m5312a("App is missing INTERNET permission");
                            } else {
                                wc1Var6 = wc1Var5;
                            }
                            if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                                f02.m1560m(ky1Var2);
                                wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            f02Var4 = f02Var2;
                            context = f02Var4.f2242j;
                            if (!tk1.m4792a(context).m1503f()) {
                                if (!f72.m1695w0(context)) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!f72.m1687V(context)) {
                                    f02.m1560m(ky1Var2);
                                    wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                                }
                            }
                            f02.m1560m(ky1Var2);
                            wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
                        } else {
                            f02Var4 = f02Var2;
                            f72Var2 = f72Var;
                        }
                        ky1Var = ky1Var2;
                    } else {
                        f02Var4 = f02Var2;
                        f72Var2 = f72Var;
                        if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                            String strM5220H7 = f02Var4.m1575r().m5220H();
                            fz1Var.mo11z();
                            String string5 = fz1Var.m1908E().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strM5220H7);
                            boolean zIsEmpty5 = TextUtils.isEmpty(string5);
                            if (zIsEmpty) {
                                c0809vn2 = c0809vn;
                            } else {
                                c0809vn2 = c0809vn;
                            }
                            String strM5220H8 = f02Var4.m1575r().m5220H();
                            fz1Var.mo11z();
                            SharedPreferences.Editor editorEdit7 = fz1Var.m1908E().edit();
                            editorEdit7.putString("gmp_app_id", strM5220H8);
                            editorEdit7.apply();
                        } else {
                            c0809vn2 = c0809vn;
                        }
                        if (!fz1Var.m1911H().m3157i(k12Var)) {
                            c0809vn2.m5182m(null);
                        }
                        f02.m1559l(v22Var);
                        v22Var.f8014p.set(c0809vn2.m5181l());
                        f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        ky1Var = ky1Var2;
                        if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                            zM1565d = f02Var4.m1565d();
                            sharedPreferences = fz1Var.f2549l;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                fz1Var.m1912I(!zM1565d);
                            }
                            if (zM1565d) {
                                f02.m1559l(v22Var);
                                v22Var.m5031M();
                            }
                            s52 s52Var5 = f02Var4.f2249q;
                            f02.m1559l(s52Var5);
                            s52Var5.f7034n.m325y();
                            f02Var4.m1573p().m5057E(new AtomicReference());
                            f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                        }
                    }
                    fs1.m1890a();
                    if (bt1Var.m770L(null, jx1.f4143P0)) {
                        f72Var2.mo11z();
                        if (f72Var2.m1722Y() == 1) {
                            long jIntValue5 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                            long jNextInt5 = new Random().nextInt(5000);
                            f02Var4.f2252t.getClass();
                            jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                f02.m1560m(ky1Var);
                                wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            f02.m1559l(v22Var);
                            v22Var.mo11z();
                            if (v22Var.f8019u == null) {
                                v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                            }
                            v22Var.f8019u.m4403b(jMax);
                        }
                    }
                    fz1Var.f2561x.m5853b(true);
                }
                ky1 ky1Var114 = f02Var.f2247o;
                f02.m1560m(ky1Var114);
                ky1Var114.f4600o.m5312a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = f02Var.f2242j.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    vx1Var2.f8292t = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            vx1Var2.f8292t = listAsList;
                            break;
                        } else {
                            str3 = (String) it.next();
                            f72Var3 = f02Var7.f2250r;
                            f02.m1558k(f72Var3);
                        }
                    } while (f72Var3.m1702F0("safelisted event", str3));
                } else {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4605t.m5312a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    vx1Var2.f8295w = yd0.m5773l(context2) ? 1 : 0;
                } else {
                    vx1Var2.f8295w = 0;
                }
                ((f02) vx1Var2.f7192j).f2239L.incrementAndGet();
                vx1Var2.f5182k = true;
                b32Var = new b32(f02Var5);
                b32Var.m3447C();
                f02Var5.f2231D = b32Var;
                if (!b32Var.f5182k) {
                    C0270h1.m2191g("Can't initialize twice");
                    return;
                }
                b32Var.f703l = (JobScheduler) ((f02) b32Var.f7192j).f2242j.getSystemService("jobscheduler");
                ((f02) b32Var.f7192j).f2239L.incrementAndGet();
                b32Var.f5182k = true;
                f02.m1560m(ky1Var2);
                wc1Var = ky1Var2.f4607v;
                wc1Var2 = ky1Var2.f4606u;
                wc1Var3 = ky1Var2.f4608w;
                wc1Var4 = ky1Var2.f4600o;
                bt1Var.m765G();
                wc1Var2.m5313b(161000L, "App measurement initialized, version");
                f02.m1560m(ky1Var2);
                wc1Var2.m5312a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strM5219G = vx1Var.m5219G();
                if (f72Var4.m1726g0(strM5219G, bt1Var.f983l)) {
                    f02.m1560m(ky1Var2);
                    wc1Var2.m5312a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    f02.m1560m(ky1Var2);
                    wc1Var2.m5312a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5219G)));
                }
                f02.m1560m(ky1Var2);
                wc1Var.m5312a("Debug-level message logging enabled");
                i2 = f02Var5.f2237J;
                atomicInteger = f02Var5.f2239L;
                if (i2 != atomicInteger.get()) {
                    f02.m1560m(ky1Var2);
                    wc1Var4.m5314c(Integer.valueOf(f02Var5.f2237J), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                f02Var5.f2232E = true;
                j = f02Var5.f2240M;
                v22Var = f02Var5.f2254v;
                a02 a02Var5 = f02Var5.f2248p;
                f02.m1560m(a02Var5);
                a02Var5.mo11z();
                f02.m1557j(f02Var5.f2231D);
                iM588F = f02Var5.f2231D.m588F();
                fs1.m1890a();
                zM770L = bt1Var.m770L(null, jx1.f4143P0);
                if (iM588F == 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (zM770L) {
                    f72Var4.mo11z();
                    if (f72Var4.m1722Y() == 1) {
                        f72Var4.mo11z();
                        IntentFilter intentFilter10 = new IntentFilter();
                        intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter10);
                        ky1 ky1Var115 = f02Var6.f2247o;
                        f02.m1560m(ky1Var115);
                        ky1Var115.f4607v.m5312a("Registered app receiver");
                        if (z2) {
                            f02.m1557j(f02Var5.f2231D);
                            f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        f72Var4.mo11z();
                        IntentFilter intentFilter11 = new IntentFilter();
                        intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter11);
                        ky1 ky1Var116 = f02Var6.f2247o;
                        f02.m1560m(ky1Var116);
                        ky1Var116.f4607v.m5312a("Registered app receiver");
                        if (z2) {
                            f02.m1557j(f02Var5.f2231D);
                            f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                        }
                    }
                } else if (z) {
                    z = true;
                    f72Var4.mo11z();
                    IntentFilter intentFilter12 = new IntentFilter();
                    intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter12);
                    ky1 ky1Var117 = f02Var6.f2247o;
                    f02.m1560m(ky1Var117);
                    ky1Var117.f4607v.m5312a("Registered app receiver");
                    if (z2) {
                        f02.m1557j(f02Var5.f2231D);
                        f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                    }
                }
                c0809vn = fz1Var.f2553p;
                l12VarM1911H = fz1Var.m1911H();
                int i10 = l12VarM1911H.f4645b;
                h12VarM775Q = bt1Var.m775Q("google_analytics_default_allow_ad_storage", false);
                h12VarM775Q2 = bt1Var.m775Q("google_analytics_default_allow_analytics_storage", false);
                k12Var = k12.f4250l;
                h12Var = h12.f3002k;
                if (h12VarM775Q == h12Var) {
                    f02Var2 = f02Var5;
                    wc1Var5 = wc1Var4;
                    f72Var = f72Var4;
                    if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                        EnumMap enumMap7 = new EnumMap(k12.class);
                        enumMap7.put(k12.f4249k, h12VarM775Q);
                        enumMap7.put(k12Var, h12VarM775Q2);
                        l12Var = new l12(enumMap7, -10);
                    } else {
                        if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                            f02.m1559l(v22Var);
                            v22Var.m5041W(new l12(-10), false);
                        }
                        l12Var = null;
                    }
                } else {
                    f02Var2 = f02Var5;
                    wc1Var5 = wc1Var4;
                    f72Var = f72Var4;
                    if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                        EnumMap enumMap8 = new EnumMap(k12.class);
                        enumMap8.put(k12.f4249k, h12VarM775Q);
                        enumMap8.put(k12Var, h12VarM775Q2);
                        l12Var = new l12(enumMap8, -10);
                    } else {
                        if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                            f02.m1559l(v22Var);
                            v22Var.m5041W(new l12(-10), false);
                        }
                        l12Var = null;
                    }
                }
                if (l12Var != null) {
                    f02.m1559l(v22Var);
                    v22Var.m5041W(l12Var, true);
                    l12Var2 = l12Var;
                } else {
                    l12Var2 = l12VarM1911H;
                }
                f02.m1559l(v22Var);
                f02Var3 = (f02) v22Var.f7192j;
                v22Var.m5045a0(l12Var2);
                fz1Var.mo11z();
                int i11 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
                h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
                if (h12VarM775Q3 != h12Var) {
                    f02.m1560m(ky1Var2);
                    wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
                }
                h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
                if (h12VarM775Q4 == h12Var) {
                    if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                        f02.m1559l(v22Var);
                        v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                    f02.m1559l(v22Var);
                    v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
                if (boolM772N != null) {
                    f02.m1560m(ky1Var2);
                    wc1Var.m5312a("TCF client enabled.");
                    f02.m1559l(v22Var);
                    v22Var.mo11z();
                    ky1 ky1Var118 = f02Var3.f2247o;
                    f02.m1560m(ky1Var118);
                    ky1Var118.f4607v.m5312a("Register tcfPrefChangeListener.");
                    if (v22Var.f8007C == null) {
                        v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                        v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                v22 v22Var2 = v22Var;
                                v22Var2.getClass();
                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                    ky1 ky1Var119 = ((f02) v22Var2.f7192j).f2247o;
                                    f02.m1560m(ky1Var119);
                                    ky1Var119.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                    t12 t12Var = v22Var2.f8008D;
                                    p80.m3863h(t12Var);
                                    t12Var.m4403b(500L);
                                }
                            }
                        };
                    }
                    fz1 fz1Var13 = f02Var3.f2246n;
                    f02.m1558k(fz1Var13);
                    fz1Var13.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                    f02.m1559l(v22Var);
                    v22Var.m5025G();
                } else {
                    f02.m1560m(ky1Var2);
                    wc1Var.m5312a("TCF client enabled.");
                    f02.m1559l(v22Var);
                    v22Var.mo11z();
                    ky1 ky1Var119 = f02Var3.f2247o;
                    f02.m1560m(ky1Var119);
                    ky1Var119.f4607v.m5312a("Register tcfPrefChangeListener.");
                    if (v22Var.f8007C == null) {
                        v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                        v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                                v22 v22Var2 = v22Var;
                                v22Var2.getClass();
                                if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                    ky1 ky1Var1110 = ((f02) v22Var2.f7192j).f2247o;
                                    f02.m1560m(ky1Var1110);
                                    ky1Var1110.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                    t12 t12Var = v22Var2.f8008D;
                                    p80.m3863h(t12Var);
                                    t12Var.m4403b(500L);
                                }
                            }
                        };
                    }
                    fz1 fz1Var14 = f02Var3.f2246n;
                    f02.m1558k(fz1Var14);
                    fz1Var14.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                    f02.m1559l(v22Var);
                    v22Var.m5025G();
                }
                bz1Var = fz1Var.f2552o;
                if (bz1Var.m821a() == 0) {
                    f02.m1560m(ky1Var2);
                    wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
                    bz1Var.m822b(j);
                }
                f02.m1559l(v22Var);
                iz1Var = v22Var.f8024z;
                if (iz1Var.m2753d()) {
                    fz1 fz1Var15 = iz1Var.f3760a.f2246n;
                    f02.m1558k(fz1Var15);
                    fz1Var15.f2546F.m5182m(null);
                }
                if (f02Var2.m1569h()) {
                    if (f02Var2.m1565d()) {
                        f72Var2 = f72Var;
                        if (f72Var2.m1725e0("android.permission.INTERNET")) {
                            f02.m1560m(ky1Var2);
                            wc1Var6 = wc1Var5;
                            wc1Var6.m5312a("App is missing INTERNET permission");
                        } else {
                            wc1Var6 = wc1Var5;
                        }
                        if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                            f02.m1560m(ky1Var2);
                            wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        f02Var4 = f02Var2;
                        context = f02Var4.f2242j;
                        if (!tk1.m4792a(context).m1503f()) {
                            if (!f72.m1695w0(context)) {
                                f02.m1560m(ky1Var2);
                                wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!f72.m1687V(context)) {
                                f02.m1560m(ky1Var2);
                                wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                            }
                        }
                        f02.m1560m(ky1Var2);
                        wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
                    } else {
                        f02Var4 = f02Var2;
                        f72Var2 = f72Var;
                    }
                    ky1Var = ky1Var2;
                } else {
                    f02Var4 = f02Var2;
                    f72Var2 = f72Var;
                    if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                        String strM5220H9 = f02Var4.m1575r().m5220H();
                        fz1Var.mo11z();
                        String string6 = fz1Var.m1908E().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strM5220H9);
                        boolean zIsEmpty6 = TextUtils.isEmpty(string6);
                        if (zIsEmpty) {
                            c0809vn2 = c0809vn;
                        } else {
                            c0809vn2 = c0809vn;
                        }
                        String strM5220H10 = f02Var4.m1575r().m5220H();
                        fz1Var.mo11z();
                        SharedPreferences.Editor editorEdit8 = fz1Var.m1908E().edit();
                        editorEdit8.putString("gmp_app_id", strM5220H10);
                        editorEdit8.apply();
                    } else {
                        c0809vn2 = c0809vn;
                    }
                    if (!fz1Var.m1911H().m3157i(k12Var)) {
                        c0809vn2.m5182m(null);
                    }
                    f02.m1559l(v22Var);
                    v22Var.f8014p.set(c0809vn2.m5181l());
                    f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    ky1Var = ky1Var2;
                    if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                        zM1565d = f02Var4.m1565d();
                        sharedPreferences = fz1Var.f2549l;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            fz1Var.m1912I(!zM1565d);
                        }
                        if (zM1565d) {
                            f02.m1559l(v22Var);
                            v22Var.m5031M();
                        }
                        s52 s52Var6 = f02Var4.f2249q;
                        f02.m1559l(s52Var6);
                        s52Var6.f7034n.m325y();
                        f02Var4.m1573p().m5057E(new AtomicReference());
                        f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                    }
                }
                fs1.m1890a();
                if (bt1Var.m770L(null, jx1.f4143P0)) {
                    f72Var2.mo11z();
                    if (f72Var2.m1722Y() == 1) {
                        long jIntValue6 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                        long jNextInt6 = new Random().nextInt(5000);
                        f02Var4.f2252t.getClass();
                        jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            f02.m1560m(ky1Var);
                            wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        f02.m1559l(v22Var);
                        v22Var.mo11z();
                        if (v22Var.f8019u == null) {
                            v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                        }
                        v22Var.f8019u.m4403b(jMax);
                    }
                }
                fz1Var.f2561x.m5853b(true);
            }
            f02.m1560m(ky1Var5);
            ky1Var5.f4600o.m5313b(ky1.m3106I(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strM5655q = vx1Var2.f8294v;
            if (TextUtils.isEmpty(strM5655q)) {
                strM5655q = AbstractC0875xf.m5655q(context2, f02Var7.f2257y);
            }
            if (!TextUtils.isEmpty(strM5655q)) {
                str4 = strM5655q;
            }
            vx1Var2.f8296x = str4;
            if (iM1568g == 0) {
                f02.m1560m(ky1Var5);
                ky1Var5.f4608w.m5314c(vx1Var2.f8284l, vx1Var2.f8296x, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4600o.m5314c(ky1.m3106I(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        string = "Unknown";
        str = string;
        str2 = installerPackageName;
        i = Integer.MIN_VALUE;
        vx1Var2.f8284l = packageName;
        vx1Var2.f8287o = str2;
        vx1Var2.f8285m = str;
        vx1Var2.f8286n = i;
        vx1Var2.f8288p = string;
        vx1Var2.f8289q = 0L;
        iM1568g = f02Var7.m1568g();
        if (iM1568g == 0) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4608w.m5312a("App measurement collection enabled");
        } else if (iM1568g == 1) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4606u.m5312a("App measurement deactivated via the manifest");
        } else if (iM1568g == 3) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4606u.m5312a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iM1568g == 4) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4606u.m5312a("App measurement disabled via the manifest");
        } else if (iM1568g == 6) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4605t.m5312a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iM1568g == 7) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4606u.m5312a("App measurement disabled via the global data collection setting");
        } else if (iM1568g != 8) {
            f02.m1560m(ky1Var5);
            ky1Var5.f4606u.m5312a("App measurement disabled");
            f02.m1560m(ky1Var5);
            ky1Var5.f4601p.m5312a("Invalid scion state in identity");
        } else {
            f02.m1560m(ky1Var5);
            ky1Var5.f4606u.m5312a("App measurement disabled due to denied storage consent");
        }
        vx1Var2.f8296x = "";
        vx1Var2.f8292t = null;
        bt1 bt1Var4 = f02Var7.f2245m;
        f02Var = (f02) bt1Var4.f7192j;
        p80.m3860e("analytics.safelisted_events");
        bundleM771M = bt1Var4.m771M();
        if (bundleM771M != null) {
            if (bundleM771M.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM771M.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = f02Var.f2242j.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                vx1Var2.f8292t = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        vx1Var2.f8292t = listAsList;
                        break;
                    } else {
                        str3 = (String) it.next();
                        f72Var3 = f02Var7.f2250r;
                        f02.m1558k(f72Var3);
                    }
                } while (f72Var3.m1702F0("safelisted event", str3));
            } else {
                f02.m1560m(ky1Var5);
                ky1Var5.f4605t.m5312a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                vx1Var2.f8295w = yd0.m5773l(context2) ? 1 : 0;
            } else {
                vx1Var2.f8295w = 0;
            }
            ((f02) vx1Var2.f7192j).f2239L.incrementAndGet();
            vx1Var2.f5182k = true;
            b32Var = new b32(f02Var5);
            b32Var.m3447C();
            f02Var5.f2231D = b32Var;
            if (!b32Var.f5182k) {
                C0270h1.m2191g("Can't initialize twice");
                return;
            }
            b32Var.f703l = (JobScheduler) ((f02) b32Var.f7192j).f2242j.getSystemService("jobscheduler");
            ((f02) b32Var.f7192j).f2239L.incrementAndGet();
            b32Var.f5182k = true;
            f02.m1560m(ky1Var2);
            wc1Var = ky1Var2.f4607v;
            wc1Var2 = ky1Var2.f4606u;
            wc1Var3 = ky1Var2.f4608w;
            wc1Var4 = ky1Var2.f4600o;
            bt1Var.m765G();
            wc1Var2.m5313b(161000L, "App measurement initialized, version");
            f02.m1560m(ky1Var2);
            wc1Var2.m5312a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strM5219G = vx1Var.m5219G();
            if (f72Var4.m1726g0(strM5219G, bt1Var.f983l)) {
                f02.m1560m(ky1Var2);
                wc1Var2.m5312a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                f02.m1560m(ky1Var2);
                wc1Var2.m5312a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5219G)));
            }
            f02.m1560m(ky1Var2);
            wc1Var.m5312a("Debug-level message logging enabled");
            i2 = f02Var5.f2237J;
            atomicInteger = f02Var5.f2239L;
            if (i2 != atomicInteger.get()) {
                f02.m1560m(ky1Var2);
                wc1Var4.m5314c(Integer.valueOf(f02Var5.f2237J), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            f02Var5.f2232E = true;
            j = f02Var5.f2240M;
            v22Var = f02Var5.f2254v;
            a02 a02Var6 = f02Var5.f2248p;
            f02.m1560m(a02Var6);
            a02Var6.mo11z();
            f02.m1557j(f02Var5.f2231D);
            iM588F = f02Var5.f2231D.m588F();
            fs1.m1890a();
            zM770L = bt1Var.m770L(null, jx1.f4143P0);
            if (iM588F == 2) {
                z = true;
            } else {
                z = false;
            }
            if (zM770L) {
                f72Var4.mo11z();
                if (f72Var4.m1722Y() == 1) {
                    f72Var4.mo11z();
                    IntentFilter intentFilter13 = new IntentFilter();
                    intentFilter13.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter13.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter13);
                    ky1 ky1Var1110 = f02Var6.f2247o;
                    f02.m1560m(ky1Var1110);
                    ky1Var1110.f4607v.m5312a("Registered app receiver");
                    if (z2) {
                        f02.m1557j(f02Var5.f2231D);
                        f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    f72Var4.mo11z();
                    IntentFilter intentFilter14 = new IntentFilter();
                    intentFilter14.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter14.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter14);
                    ky1 ky1Var1111 = f02Var6.f2247o;
                    f02.m1560m(ky1Var1111);
                    ky1Var1111.f4607v.m5312a("Registered app receiver");
                    if (z2) {
                        f02.m1557j(f02Var5.f2231D);
                        f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                    }
                }
            } else if (z) {
                z = true;
                f72Var4.mo11z();
                IntentFilter intentFilter15 = new IntentFilter();
                intentFilter15.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter15.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter15);
                ky1 ky1Var1112 = f02Var6.f2247o;
                f02.m1560m(ky1Var1112);
                ky1Var1112.f4607v.m5312a("Registered app receiver");
                if (z2) {
                    f02.m1557j(f02Var5.f2231D);
                    f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                }
            }
            c0809vn = fz1Var.f2553p;
            l12VarM1911H = fz1Var.m1911H();
            int i12 = l12VarM1911H.f4645b;
            h12VarM775Q = bt1Var.m775Q("google_analytics_default_allow_ad_storage", false);
            h12VarM775Q2 = bt1Var.m775Q("google_analytics_default_allow_analytics_storage", false);
            k12Var = k12.f4250l;
            h12Var = h12.f3002k;
            if (h12VarM775Q == h12Var) {
                f02Var2 = f02Var5;
                wc1Var5 = wc1Var4;
                f72Var = f72Var4;
                if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                    EnumMap enumMap9 = new EnumMap(k12.class);
                    enumMap9.put(k12.f4249k, h12VarM775Q);
                    enumMap9.put(k12Var, h12VarM775Q2);
                    l12Var = new l12(enumMap9, -10);
                } else {
                    if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                        f02.m1559l(v22Var);
                        v22Var.m5041W(new l12(-10), false);
                    }
                    l12Var = null;
                }
            } else {
                f02Var2 = f02Var5;
                wc1Var5 = wc1Var4;
                f72Var = f72Var4;
                if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                    EnumMap enumMap10 = new EnumMap(k12.class);
                    enumMap10.put(k12.f4249k, h12VarM775Q);
                    enumMap10.put(k12Var, h12VarM775Q2);
                    l12Var = new l12(enumMap10, -10);
                } else {
                    if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                        f02.m1559l(v22Var);
                        v22Var.m5041W(new l12(-10), false);
                    }
                    l12Var = null;
                }
            }
            if (l12Var != null) {
                f02.m1559l(v22Var);
                v22Var.m5041W(l12Var, true);
                l12Var2 = l12Var;
            } else {
                l12Var2 = l12VarM1911H;
            }
            f02.m1559l(v22Var);
            f02Var3 = (f02) v22Var.f7192j;
            v22Var.m5045a0(l12Var2);
            fz1Var.mo11z();
            int i13 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
            h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
            if (h12VarM775Q3 != h12Var) {
                f02.m1560m(ky1Var2);
                wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
            }
            h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
            if (h12VarM775Q4 == h12Var) {
                if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                    f02.m1559l(v22Var);
                    v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                f02.m1559l(v22Var);
                v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
            if (boolM772N != null) {
                f02.m1560m(ky1Var2);
                wc1Var.m5312a("TCF client enabled.");
                f02.m1559l(v22Var);
                v22Var.mo11z();
                ky1 ky1Var1113 = f02Var3.f2247o;
                f02.m1560m(ky1Var1113);
                ky1Var1113.f4607v.m5312a("Register tcfPrefChangeListener.");
                if (v22Var.f8007C == null) {
                    v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                    v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                            v22 v22Var2 = v22Var;
                            v22Var2.getClass();
                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                ky1 ky1Var1114 = ((f02) v22Var2.f7192j).f2247o;
                                f02.m1560m(ky1Var1114);
                                ky1Var1114.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                t12 t12Var = v22Var2.f8008D;
                                p80.m3863h(t12Var);
                                t12Var.m4403b(500L);
                            }
                        }
                    };
                }
                fz1 fz1Var16 = f02Var3.f2246n;
                f02.m1558k(fz1Var16);
                fz1Var16.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                f02.m1559l(v22Var);
                v22Var.m5025G();
            } else {
                f02.m1560m(ky1Var2);
                wc1Var.m5312a("TCF client enabled.");
                f02.m1559l(v22Var);
                v22Var.mo11z();
                ky1 ky1Var1114 = f02Var3.f2247o;
                f02.m1560m(ky1Var1114);
                ky1Var1114.f4607v.m5312a("Register tcfPrefChangeListener.");
                if (v22Var.f8007C == null) {
                    v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                    v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                            v22 v22Var2 = v22Var;
                            v22Var2.getClass();
                            if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                                ky1 ky1Var1115 = ((f02) v22Var2.f7192j).f2247o;
                                f02.m1560m(ky1Var1115);
                                ky1Var1115.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                                t12 t12Var = v22Var2.f8008D;
                                p80.m3863h(t12Var);
                                t12Var.m4403b(500L);
                            }
                        }
                    };
                }
                fz1 fz1Var17 = f02Var3.f2246n;
                f02.m1558k(fz1Var17);
                fz1Var17.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
                f02.m1559l(v22Var);
                v22Var.m5025G();
            }
            bz1Var = fz1Var.f2552o;
            if (bz1Var.m821a() == 0) {
                f02.m1560m(ky1Var2);
                wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
                bz1Var.m822b(j);
            }
            f02.m1559l(v22Var);
            iz1Var = v22Var.f8024z;
            if (iz1Var.m2753d()) {
                fz1 fz1Var18 = iz1Var.f3760a.f2246n;
                f02.m1558k(fz1Var18);
                fz1Var18.f2546F.m5182m(null);
            }
            if (f02Var2.m1569h()) {
                if (f02Var2.m1565d()) {
                    f72Var2 = f72Var;
                    if (f72Var2.m1725e0("android.permission.INTERNET")) {
                        f02.m1560m(ky1Var2);
                        wc1Var6 = wc1Var5;
                        wc1Var6.m5312a("App is missing INTERNET permission");
                    } else {
                        wc1Var6 = wc1Var5;
                    }
                    if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                        f02.m1560m(ky1Var2);
                        wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    f02Var4 = f02Var2;
                    context = f02Var4.f2242j;
                    if (!tk1.m4792a(context).m1503f()) {
                        if (!f72.m1695w0(context)) {
                            f02.m1560m(ky1Var2);
                            wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!f72.m1687V(context)) {
                            f02.m1560m(ky1Var2);
                            wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                        }
                    }
                    f02.m1560m(ky1Var2);
                    wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
                } else {
                    f02Var4 = f02Var2;
                    f72Var2 = f72Var;
                }
                ky1Var = ky1Var2;
            } else {
                f02Var4 = f02Var2;
                f72Var2 = f72Var;
                if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                    String strM5220H11 = f02Var4.m1575r().m5220H();
                    fz1Var.mo11z();
                    String string7 = fz1Var.m1908E().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strM5220H11);
                    boolean zIsEmpty7 = TextUtils.isEmpty(string7);
                    if (zIsEmpty) {
                        c0809vn2 = c0809vn;
                    } else {
                        c0809vn2 = c0809vn;
                    }
                    String strM5220H12 = f02Var4.m1575r().m5220H();
                    fz1Var.mo11z();
                    SharedPreferences.Editor editorEdit9 = fz1Var.m1908E().edit();
                    editorEdit9.putString("gmp_app_id", strM5220H12);
                    editorEdit9.apply();
                } else {
                    c0809vn2 = c0809vn;
                }
                if (!fz1Var.m1911H().m3157i(k12Var)) {
                    c0809vn2.m5182m(null);
                }
                f02.m1559l(v22Var);
                v22Var.f8014p.set(c0809vn2.m5181l());
                f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                ky1Var = ky1Var2;
                if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                    zM1565d = f02Var4.m1565d();
                    sharedPreferences = fz1Var.f2549l;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        fz1Var.m1912I(!zM1565d);
                    }
                    if (zM1565d) {
                        f02.m1559l(v22Var);
                        v22Var.m5031M();
                    }
                    s52 s52Var7 = f02Var4.f2249q;
                    f02.m1559l(s52Var7);
                    s52Var7.f7034n.m325y();
                    f02Var4.m1573p().m5057E(new AtomicReference());
                    f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
                }
            }
            fs1.m1890a();
            if (bt1Var.m770L(null, jx1.f4143P0)) {
                f72Var2.mo11z();
                if (f72Var2.m1722Y() == 1) {
                    long jIntValue7 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                    long jNextInt7 = new Random().nextInt(5000);
                    f02Var4.f2252t.getClass();
                    jMax = Math.max(500L, ((jIntValue7 * 1000) + jNextInt7) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        f02.m1560m(ky1Var);
                        wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    f02.m1559l(v22Var);
                    v22Var.mo11z();
                    if (v22Var.f8019u == null) {
                        v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                    }
                    v22Var.f8019u.m4403b(jMax);
                }
            }
            fz1Var.f2561x.m5853b(true);
        }
        ky1 ky1Var1115 = f02Var.f2247o;
        f02.m1560m(ky1Var1115);
        ky1Var1115.f4600o.m5312a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = f02Var.f2242j.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            vx1Var2.f8292t = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    vx1Var2.f8292t = listAsList;
                    break;
                } else {
                    str3 = (String) it.next();
                    f72Var3 = f02Var7.f2250r;
                    f02.m1558k(f72Var3);
                }
            } while (f72Var3.m1702F0("safelisted event", str3));
        } else {
            f02.m1560m(ky1Var5);
            ky1Var5.f4605t.m5312a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            vx1Var2.f8295w = yd0.m5773l(context2) ? 1 : 0;
        } else {
            vx1Var2.f8295w = 0;
        }
        ((f02) vx1Var2.f7192j).f2239L.incrementAndGet();
        vx1Var2.f5182k = true;
        b32Var = new b32(f02Var5);
        b32Var.m3447C();
        f02Var5.f2231D = b32Var;
        if (!b32Var.f5182k) {
            C0270h1.m2191g("Can't initialize twice");
            return;
        }
        b32Var.f703l = (JobScheduler) ((f02) b32Var.f7192j).f2242j.getSystemService("jobscheduler");
        ((f02) b32Var.f7192j).f2239L.incrementAndGet();
        b32Var.f5182k = true;
        f02.m1560m(ky1Var2);
        wc1Var = ky1Var2.f4607v;
        wc1Var2 = ky1Var2.f4606u;
        wc1Var3 = ky1Var2.f4608w;
        wc1Var4 = ky1Var2.f4600o;
        bt1Var.m765G();
        wc1Var2.m5313b(161000L, "App measurement initialized, version");
        f02.m1560m(ky1Var2);
        wc1Var2.m5312a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strM5219G = vx1Var.m5219G();
        if (f72Var4.m1726g0(strM5219G, bt1Var.f983l)) {
            f02.m1560m(ky1Var2);
            wc1Var2.m5312a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            f02.m1560m(ky1Var2);
            wc1Var2.m5312a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strM5219G)));
        }
        f02.m1560m(ky1Var2);
        wc1Var.m5312a("Debug-level message logging enabled");
        i2 = f02Var5.f2237J;
        atomicInteger = f02Var5.f2239L;
        if (i2 != atomicInteger.get()) {
            f02.m1560m(ky1Var2);
            wc1Var4.m5314c(Integer.valueOf(f02Var5.f2237J), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        f02Var5.f2232E = true;
        j = f02Var5.f2240M;
        v22Var = f02Var5.f2254v;
        a02 a02Var7 = f02Var5.f2248p;
        f02.m1560m(a02Var7);
        a02Var7.mo11z();
        f02.m1557j(f02Var5.f2231D);
        iM588F = f02Var5.f2231D.m588F();
        fs1.m1890a();
        zM770L = bt1Var.m770L(null, jx1.f4143P0);
        if (iM588F == 2) {
            z = true;
        } else {
            z = false;
        }
        if (zM770L) {
            f72Var4.mo11z();
            if (f72Var4.m1722Y() == 1) {
                f72Var4.mo11z();
                IntentFilter intentFilter16 = new IntentFilter();
                intentFilter16.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter16.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter16);
                ky1 ky1Var1116 = f02Var6.f2247o;
                f02.m1560m(ky1Var1116);
                ky1Var1116.f4607v.m5312a("Registered app receiver");
                if (z2) {
                    f02.m1557j(f02Var5.f2231D);
                    f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                }
            } else if (z) {
                z = true;
                f72Var4.mo11z();
                IntentFilter intentFilter17 = new IntentFilter();
                intentFilter17.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter17.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter17);
                ky1 ky1Var1117 = f02Var6.f2247o;
                f02.m1560m(ky1Var1117);
                ky1Var1117.f4607v.m5312a("Registered app receiver");
                if (z2) {
                    f02.m1557j(f02Var5.f2231D);
                    f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
                }
            }
        } else if (z) {
            z = true;
            f72Var4.mo11z();
            IntentFilter intentFilter18 = new IntentFilter();
            intentFilter18.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter18.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z2 = z;
            xe1.m5643l(f02Var6.f2242j, new C0680s5(f02Var6), intentFilter18);
            ky1 ky1Var1118 = f02Var6.f2247o;
            f02.m1560m(ky1Var1118);
            ky1Var1118.f4607v.m5312a("Registered app receiver");
            if (z2) {
                f02.m1557j(f02Var5.f2231D);
                f02Var5.f2231D.m587E(((Long) jx1.f4116C.m2715a(null)).longValue());
            }
        }
        c0809vn = fz1Var.f2553p;
        l12VarM1911H = fz1Var.m1911H();
        int i14 = l12VarM1911H.f4645b;
        h12VarM775Q = bt1Var.m775Q("google_analytics_default_allow_ad_storage", false);
        h12VarM775Q2 = bt1Var.m775Q("google_analytics_default_allow_analytics_storage", false);
        k12Var = k12.f4250l;
        h12Var = h12.f3002k;
        if (h12VarM775Q == h12Var) {
            f02Var2 = f02Var5;
            wc1Var5 = wc1Var4;
            f72Var = f72Var4;
            if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                EnumMap enumMap11 = new EnumMap(k12.class);
                enumMap11.put(k12.f4249k, h12VarM775Q);
                enumMap11.put(k12Var, h12VarM775Q2);
                l12Var = new l12(enumMap11, -10);
            } else {
                if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                    f02.m1559l(v22Var);
                    v22Var.m5041W(new l12(-10), false);
                }
                l12Var = null;
            }
        } else {
            f02Var2 = f02Var5;
            wc1Var5 = wc1Var4;
            f72Var = f72Var4;
            if (l12.m3154l(-10, fz1Var.m1908E().getInt("consent_source", 100))) {
                EnumMap enumMap12 = new EnumMap(k12.class);
                enumMap12.put(k12.f4249k, h12VarM775Q);
                enumMap12.put(k12Var, h12VarM775Q2);
                l12Var = new l12(enumMap12, -10);
            } else {
                if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                    f02.m1559l(v22Var);
                    v22Var.m5041W(new l12(-10), false);
                }
                l12Var = null;
            }
        }
        if (l12Var != null) {
            f02.m1559l(v22Var);
            v22Var.m5041W(l12Var, true);
            l12Var2 = l12Var;
        } else {
            l12Var2 = l12VarM1911H;
        }
        f02.m1559l(v22Var);
        f02Var3 = (f02) v22Var.f7192j;
        v22Var.m5045a0(l12Var2);
        fz1Var.mo11z();
        int i15 = zt1.m6037b(fz1Var.m1908E().getString("dma_consent_settings", null)).f9954a;
        h12VarM775Q3 = bt1Var.m775Q("google_analytics_default_allow_ad_personalization_signals", true);
        if (h12VarM775Q3 != h12Var) {
            f02.m1560m(ky1Var2);
            wc1Var3.m5313b(h12VarM775Q3, "Default ad personalization consent from Manifest");
        }
        h12VarM775Q4 = bt1Var.m775Q("google_analytics_default_allow_ad_user_data", true);
        if (h12VarM775Q4 == h12Var) {
            if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
                f02.m1559l(v22Var);
                v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(f02Var2.m1575r().m5220H())) {
            f02.m1559l(v22Var);
            v22Var.m5040V(new zt1((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolM772N = bt1Var.m772N("google_analytics_tcf_data_enabled");
        if (boolM772N != null) {
            f02.m1560m(ky1Var2);
            wc1Var.m5312a("TCF client enabled.");
            f02.m1559l(v22Var);
            v22Var.mo11z();
            ky1 ky1Var1119 = f02Var3.f2247o;
            f02.m1560m(ky1Var1119);
            ky1Var1119.f4607v.m5312a("Register tcfPrefChangeListener.");
            if (v22Var.f8007C == null) {
                v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                        v22 v22Var2 = v22Var;
                        v22Var2.getClass();
                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                            ky1 ky1Var11110 = ((f02) v22Var2.f7192j).f2247o;
                            f02.m1560m(ky1Var11110);
                            ky1Var11110.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                            t12 t12Var = v22Var2.f8008D;
                            p80.m3863h(t12Var);
                            t12Var.m4403b(500L);
                        }
                    }
                };
            }
            fz1 fz1Var19 = f02Var3.f2246n;
            f02.m1558k(fz1Var19);
            fz1Var19.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
            f02.m1559l(v22Var);
            v22Var.m5025G();
        } else {
            f02.m1560m(ky1Var2);
            wc1Var.m5312a("TCF client enabled.");
            f02.m1559l(v22Var);
            v22Var.mo11z();
            ky1 ky1Var11110 = f02Var3.f2247o;
            f02.m1560m(ky1Var11110);
            ky1Var11110.f4607v.m5312a("Register tcfPrefChangeListener.");
            if (v22Var.f8007C == null) {
                v22Var.f8008D = new t12(v22Var, f02Var3, 2);
                v22Var.f8007C = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: r22
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str7) {
                        v22 v22Var2 = v22Var;
                        v22Var2.getClass();
                        if (Objects.equals(str7, "IABTCF_TCString") || Objects.equals(str7, "IABTCF_gdprApplies") || Objects.equals(str7, "IABTCF_EnableAdvertiserConsentMode")) {
                            ky1 ky1Var11111 = ((f02) v22Var2.f7192j).f2247o;
                            f02.m1560m(ky1Var11111);
                            ky1Var11111.f4608w.m5312a("IABTCF_TCString change picked up in listener.");
                            t12 t12Var = v22Var2.f8008D;
                            p80.m3863h(t12Var);
                            t12Var.m4403b(500L);
                        }
                    }
                };
            }
            fz1 fz1Var110 = f02Var3.f2246n;
            f02.m1558k(fz1Var110);
            fz1Var110.m1909F().registerOnSharedPreferenceChangeListener(v22Var.f8007C);
            f02.m1559l(v22Var);
            v22Var.m5025G();
        }
        bz1Var = fz1Var.f2552o;
        if (bz1Var.m821a() == 0) {
            f02.m1560m(ky1Var2);
            wc1Var3.m5313b(Long.valueOf(j), "Persisting first open");
            bz1Var.m822b(j);
        }
        f02.m1559l(v22Var);
        iz1Var = v22Var.f8024z;
        if (iz1Var.m2753d()) {
            fz1 fz1Var111 = iz1Var.f3760a.f2246n;
            f02.m1558k(fz1Var111);
            fz1Var111.f2546F.m5182m(null);
        }
        if (f02Var2.m1569h()) {
            if (f02Var2.m1565d()) {
                f72Var2 = f72Var;
                if (f72Var2.m1725e0("android.permission.INTERNET")) {
                    f02.m1560m(ky1Var2);
                    wc1Var6 = wc1Var5;
                    wc1Var6.m5312a("App is missing INTERNET permission");
                } else {
                    wc1Var6 = wc1Var5;
                }
                if (!f72Var2.m1725e0("android.permission.ACCESS_NETWORK_STATE")) {
                    f02.m1560m(ky1Var2);
                    wc1Var6.m5312a("App is missing ACCESS_NETWORK_STATE permission");
                }
                f02Var4 = f02Var2;
                context = f02Var4.f2242j;
                if (!tk1.m4792a(context).m1503f()) {
                    if (!f72.m1695w0(context)) {
                        f02.m1560m(ky1Var2);
                        wc1Var6.m5312a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!f72.m1687V(context)) {
                        f02.m1560m(ky1Var2);
                        wc1Var6.m5312a("AppMeasurementService not registered/enabled");
                    }
                }
                f02.m1560m(ky1Var2);
                wc1Var6.m5312a("Uploading is not possible. App measurement disabled");
            } else {
                f02Var4 = f02Var2;
                f72Var2 = f72Var;
            }
            ky1Var = ky1Var2;
        } else {
            f02Var4 = f02Var2;
            f72Var2 = f72Var;
            if (TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                String strM5220H13 = f02Var4.m1575r().m5220H();
                fz1Var.mo11z();
                String string8 = fz1Var.m1908E().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strM5220H13);
                boolean zIsEmpty8 = TextUtils.isEmpty(string8);
                if (zIsEmpty) {
                    c0809vn2 = c0809vn;
                } else {
                    c0809vn2 = c0809vn;
                }
                String strM5220H14 = f02Var4.m1575r().m5220H();
                fz1Var.mo11z();
                SharedPreferences.Editor editorEdit10 = fz1Var.m1908E().edit();
                editorEdit10.putString("gmp_app_id", strM5220H14);
                editorEdit10.apply();
            } else {
                c0809vn2 = c0809vn;
            }
            if (!fz1Var.m1911H().m3157i(k12Var)) {
                c0809vn2.m5182m(null);
            }
            f02.m1559l(v22Var);
            v22Var.f8014p.set(c0809vn2.m5181l());
            f02Var6.f2242j.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            ky1Var = ky1Var2;
            if (!TextUtils.isEmpty(f02Var4.m1575r().m5220H())) {
                zM1565d = f02Var4.m1565d();
                sharedPreferences = fz1Var.f2549l;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    fz1Var.m1912I(!zM1565d);
                }
                if (zM1565d) {
                    f02.m1559l(v22Var);
                    v22Var.m5031M();
                }
                s52 s52Var8 = f02Var4.f2249q;
                f02.m1559l(s52Var8);
                s52Var8.f7034n.m325y();
                f02Var4.m1573p().m5057E(new AtomicReference());
                f02Var4.m1573p().m5058F(fz1Var.f2548H.m1677x());
            }
        }
        fs1.m1890a();
        if (bt1Var.m770L(null, jx1.f4143P0)) {
            f72Var2.mo11z();
            if (f72Var2.m1722Y() == 1) {
                long jIntValue8 = ((Integer) jx1.f4219w0.m2715a(null)).intValue();
                long jNextInt8 = new Random().nextInt(5000);
                f02Var4.f2252t.getClass();
                jMax = Math.max(500L, ((jIntValue8 * 1000) + jNextInt8) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    f02.m1560m(ky1Var);
                    wc1Var3.m5313b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                f02.m1559l(v22Var);
                v22Var.mo11z();
                if (v22Var.f8019u == null) {
                    v22Var.f8019u = new t12(v22Var, f02Var3, 0);
                }
                v22Var.f8019u.m4403b(jMax);
            }
        }
        fz1Var.f2561x.m5853b(true);
    }

    /* JADX INFO: renamed from: d */
    private final void m1591d() {
        vy1 vy1Var = (vy1) this.f2293k;
        synchronized (vy1Var.f8301l) {
            try {
                lu0 lu0Var = (lu0) vy1Var.f8302m;
                if (lu0Var != null) {
                    Exception excM5130f = ((v92) this.f2294l).m5130f();
                    p80.m3863h(excM5130f);
                    lu0Var.mo309e(excM5130f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private final void m1592e() {
        vy1 vy1Var = (vy1) this.f2293k;
        synchronized (vy1Var.f8301l) {
            try {
                ou0 ou0Var = (ou0) vy1Var.f8302m;
                if (ou0Var != null) {
                    ou0Var.mo306b(((v92) this.f2294l).m5131g());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m1593f() {
        s62 s62Var = (s62) this.f2294l;
        int i = ((a82) this.f2293k).f65a;
        synchronized (s62Var) {
            a82 a82Var = (a82) s62Var.f7043n.get(i);
            if (a82Var != null) {
                Log.w("MessengerIpcClient", "Timing out request: " + i);
                s62Var.f7043n.remove(i);
                a82Var.m101b(new p61("Timed out waiting for response", null));
                s62Var.m4488c();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:91:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00c5 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:101:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r0 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        ((java.lang.Runnable) r12.f2294l).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0061, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0062, code lost:
    
        p000.w61.f8439o.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r12.f2294l), (java.lang.Throwable) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007f, code lost:
    
        r12.f2294l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00cc, code lost:
    
        if (r0 == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d5, code lost:
    
        r0 = r0 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00d6, code lost:
    
        ((java.lang.Runnable) r12.f2294l).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00e2, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00e4, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00e5, code lost:
    
        p000.v61.f8106o.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r12.f2294l), (java.lang.Throwable) r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0102, code lost:
    
        r12.f2294l = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0104, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:?, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m1594g() {
        Runnable runnable;
        Runnable runnable2;
        boolean z = false;
        switch (this.f2292j) {
            case 2:
                boolean zInterrupted = false;
                while (true) {
                    try {
                        synchronized (((v61) this.f2293k).f8108k) {
                            if (z) {
                                runnable = (Runnable) ((v61) this.f2293k).f8108k.poll();
                                this.f2294l = runnable;
                                if (runnable == null) {
                                    ((v61) this.f2293k).f8109l = 1;
                                }
                                break;
                            } else {
                                v61 v61Var = (v61) this.f2293k;
                                if (v61Var.f8109l != 4) {
                                    v61Var.f8110m++;
                                    v61Var.f8109l = 4;
                                    z = true;
                                    runnable = (Runnable) ((v61) this.f2293k).f8108k.poll();
                                    this.f2294l = runnable;
                                    if (runnable == null) {
                                        ((v61) this.f2293k).f8109l = 1;
                                    }
                                    break;
                                }
                            }
                        }
                        if (!zInterrupted) {
                            return;
                        }
                        this.f2294l = null;
                    } catch (Throwable th) {
                        if (zInterrupted) {
                            Thread.currentThread().interrupt();
                        }
                        throw th;
                    }
                }
                Thread.currentThread().interrupt();
                return;
            default:
                boolean zInterrupted2 = false;
                while (true) {
                    try {
                        synchronized (((w61) this.f2293k).f8441k) {
                            if (z) {
                                runnable2 = (Runnable) ((w61) this.f2293k).f8441k.poll();
                                this.f2294l = runnable2;
                                if (runnable2 == null) {
                                    ((w61) this.f2293k).f8442l = 1;
                                }
                                break;
                            } else {
                                w61 w61Var = (w61) this.f2293k;
                                if (w61Var.f8442l != 4) {
                                    w61Var.f8443m++;
                                    w61Var.f8442l = 4;
                                    z = true;
                                    runnable2 = (Runnable) ((w61) this.f2293k).f8441k.poll();
                                    this.f2294l = runnable2;
                                    if (runnable2 == null) {
                                        ((w61) this.f2293k).f8442l = 1;
                                    }
                                    break;
                                }
                            }
                        }
                        if (!zInterrupted2) {
                            return;
                        }
                        this.f2294l = null;
                    } catch (Throwable th2) {
                        if (zInterrupted2) {
                            Thread.currentThread().interrupt();
                        }
                        throw th2;
                    }
                }
                Thread.currentThread().interrupt();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:136:0x0374  */
    /* JADX WARN: Code duplicated, block: B:276:0x0660 A[Catch: all -> 0x065d, TryCatch #18 {all -> 0x065d, blocks: (B:262:0x063f, B:264:0x0643, B:266:0x0647, B:271:0x0654, B:276:0x0660, B:277:0x066b), top: B:363:0x063f }] */
    /* JADX WARN: Code duplicated, block: B:351:0x0385 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v113, types: [android.app.Service] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [e6] */
    @Override // java.lang.Runnable
    public final void run() {
        wb0 wb0Var;
        ?? r8;
        ?? r9;
        wb0 x82Var;
        Long lValueOf;
         = 0;
        ?? r6 = 0;
        int i = 1;
        switch (this.f2292j) {
            case 0:
                ((zk0) ((f50) this.f2293k).f2314l).f9822D.mo1034f((np0) this.f2294l);
                return;
            case 1:
                ((zk0) ((f50) this.f2293k).f2314l).f9822D.mo1036i((an0) this.f2294l);
                return;
            case 2:
                try {
                    m1594g();
                    return;
                } catch (Error e) {
                    synchronized (((v61) this.f2293k).f8108k) {
                        ((v61) this.f2293k).f8109l = 1;
                        throw e;
                    }
                }
            case 3:
                try {
                    m1594g();
                    return;
                } catch (Error e2) {
                    synchronized (((w61) this.f2293k).f8441k) {
                        ((w61) this.f2293k).f8442l = 1;
                        throw e2;
                    }
                }
            case 4:
                C0253gl c0253gl = (C0253gl) this.f2294l;
                wp0 wp0Var = (wp0) this.f2293k;
                l90 l90Var = (l90) wp0Var.f8624p;
                e90 e90Var = (e90) wp0Var.f8620l;
                el1 el1Var = (el1) l90Var.f4731j.get((C0679s4) wp0Var.f8621m);
                if (el1Var == null) {
                    return;
                }
                if (c0253gl.f2796k != 0) {
                    el1Var.m1454o(c0253gl, null);
                    return;
                }
                wp0Var.f8619k = true;
                if (e90Var.mo3893r()) {
                    if (!wp0Var.f8619k || (wb0Var = (wb0) wp0Var.f8622n) == null) {
                        return;
                    }
                    e90Var.m3889j(wb0Var, (Set) wp0Var.f8623o);
                    return;
                }
                try {
                    e90Var.m3889j(null, e90Var.mo3893r() ? e90Var.f2017z : Collections.EMPTY_SET);
                    return;
                } catch (SecurityException e3) {
                    Log.e("GoogleApiManager", "Failed to get service from broker. ", e3);
                    e90Var.m3888d("Failed to get service from broker.");
                    el1Var.m1454o(new C0253gl(10, null, null), null);
                    return;
                }
            case 5:
                p90 p90Var = (p90) this.f2294l;
                an0 an0Var = (an0) this.f2293k;
                bj0 bj0Var = (bj0) p90Var.f6028k;
                if (bj0Var == null) {
                    return;
                }
                a81 a81Var = bj0Var.f887a;
                try {
                    byte[] bArr = (byte[]) an0Var.f254k;
                    so1 so1Var = so1.f7176a;
                    int i2 = fo1.f2465a;
                    c72 c72VarM896u = c72.m896u(bArr, so1.f7177b);
                    ?? r2 = false;
                    for (p62 p62Var : ((p72) a81Var.f64l).f6012f) {
                        List listM897t = c72VarM896u.m897t();
                        p62Var.getClass();
                        an0 an0Var2 = y62.f9189i;
                        an0Var2.getClass();
                        if (listM897t == null || listM897t.isEmpty()) {
                            r8 = false;
                        } else {
                            Iterator it = listM897t.iterator();
                            r8 = false;
                            while (it.hasNext()) {
                                h62 h62Var = (h62) ((ConcurrentHashMap) an0Var2.f254k).get((String) it.next());
                                if (h62Var != null) {
                                    y62 y62Var = h62Var.f3074a;
                                    if (y62Var.f9195e) {
                                        C0415l c0415l = y62Var.f9191a;
                                        if (c0415l != null && (c0415l.f4613a || ((vr0) c0415l.f4617e).f8254a == 3 || y62Var.f9198h.m3747t())) {
                                            synchronized (y62Var) {
                                                try {
                                                    C0415l c0415l2 = y62Var.f9191a;
                                                    if (c0415l2 != null) {
                                                        if (c0415l2.f4613a) {
                                                            y62Var.f9191a = null;
                                                            ((AtomicInteger) y62Var.f9197g.f1083k).incrementAndGet();
                                                        } else if ((((vr0) c0415l2.f4617e).f8254a == 3) != false || y62Var.f9198h.m3747t()) {
                                                            y62Var.f9191a = null;
                                                            ((AtomicInteger) y62Var.f9197g.f1083k).incrementAndGet();
                                                        }
                                                    }
                                                } catch (Throwable th) {
                                                    throw th;
                                                }
                                            }
                                        }
                                        r9 = false;
                                    } else {
                                        r9 = true;
                                    }
                                    r8 = (r8 == true ? 1 : 0) | r9;
                                }
                            }
                        }
                        if (r8 != false && r2 == false) {
                            ((s72) a81Var.f63k).mo3638a();
                            r2 = true;
                        }
                    }
                    return;
                } catch (mp1 unused) {
                    return;
                }
            case 6:
                ml1 ml1Var = (ml1) this.f2293k;
                am1 am1Var = (am1) this.f2294l;
                ml1Var.getClass();
                C0253gl c0253gl2 = am1Var.f250k;
                if (c0253gl2.f2796k == 0) {
                    gm1 gm1Var = am1Var.f251l;
                    p80.m3863h(gm1Var);
                    C0253gl c0253gl3 = gm1Var.f2807l;
                    if (c0253gl3.f2796k != 0) {
                        Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(c0253gl3)), new Exception());
                        ml1Var.f5088i.m5411c(c0253gl3);
                        ml1Var.f5087h.m3887c();
                        return;
                    }
                    wp0 wp0Var2 = ml1Var.f5088i;
                    IBinder iBinder = gm1Var.f2806k;
                    if (iBinder == null) {
                        x82Var = null;
                    } else {
                        int i3 = AbstractBinderC0935z1.f9565c;
                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                        x82Var = iInterfaceQueryLocalInterface instanceof wb0 ? (wb0) iInterfaceQueryLocalInterface : new x82(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                    }
                    Set set = ml1Var.f5085f;
                    wp0Var2.getClass();
                    if (x82Var == null || set == null) {
                        Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
                        wp0Var2.m5411c(new C0253gl(4, null, null));
                    } else {
                        wp0Var2.f8622n = x82Var;
                        wp0Var2.f8623o = set;
                        if (wp0Var2.f8619k) {
                            ((e90) wp0Var2.f8620l).m3889j(x82Var, set);
                        }
                    }
                } else {
                    ml1Var.f5088i.m5411c(c0253gl2);
                }
                ml1Var.f5087h.m3887c();
                return;
            case 7:
                f12 f12Var = (f12) this.f2294l;
                f12Var.mo1562a();
                if (u90.m4898g()) {
                    f12Var.mo1564c().m6J(this);
                    return;
                }
                rt1 rt1Var = (rt1) this.f2293k;
                ?? r7 = rt1Var.f6964c != 0 ? 1 : 0;
                rt1Var.f6964c = 0L;
                if (r7 != 0) {
                    rt1Var.mo23a();
                    return;
                }
                return;
            case 8:
                v92 v92Var = (v92) this.f2294l;
                boolean z = v92Var.f8143d;
                rv1 rv1Var = (rv1) this.f2293k;
                if (z) {
                    rv1Var.f6985m.m5137m();
                    return;
                }
                try {
                    ((rv1) this.f2293k).f6985m.m5135k(rv1Var.f6984l.mo92p(v92Var));
                    return;
                } catch (a41 e4) {
                    boolean z2 = e4.getCause() instanceof Exception;
                    rv1 rv1Var2 = (rv1) this.f2293k;
                    if (z2) {
                        rv1Var2.f6985m.m5136l((Exception) e4.getCause());
                        return;
                    } else {
                        rv1Var2.f6985m.m5136l(e4);
                        return;
                    }
                } catch (Exception e5) {
                    ((rv1) this.f2293k).f6985m.m5136l(e5);
                    return;
                }
            case 9:
                rv1 rv1Var3 = (rv1) this.f2293k;
                try {
                    v92 v92Var2 = (v92) rv1Var3.f6984l.mo92p((v92) this.f2294l);
                    if (v92Var2 == null) {
                        rv1Var3.mo309e(new NullPointerException("Continuation returned null"));
                        return;
                    }
                    iw1 iw1Var = rc1.f6821b;
                    v92Var2.m5127c(iw1Var, rv1Var3);
                    v92Var2.m5126b(iw1Var, rv1Var3);
                    v92Var2.f8141b.m3364n(new vy1((Executor) iw1Var, (hu0) rv1Var3));
                    v92Var2.m5139o();
                    return;
                } catch (a41 e6) {
                    if (e6.getCause() instanceof Exception) {
                        rv1Var3.f6985m.m5136l((Exception) e6.getCause());
                        return;
                    } else {
                        rv1Var3.f6985m.m5136l(e6);
                        return;
                    }
                } catch (Exception e7) {
                    rv1Var3.f6985m.m5136l(e7);
                    return;
                }
            case 10:
                hz1 hz1Var = (hz1) this.f2293k;
                f02 f02Var = hz1Var.f3365k.f3760a;
                a02 a02Var = f02Var.f2248p;
                f02.m1560m(a02Var);
                a02Var.mo11z();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", hz1Var.f3364j);
                try {
                    ku1 ku1Var = (ku1) ((mu1) this.f2294l);
                    Parcel parcelM5810d = ku1Var.m5810d();
                    iu1.m2702b(parcelM5810d, bundle);
                    Parcel parcelM5809c = ku1Var.m5809c(parcelM5810d, 1);
                    Bundle bundle2 = (Bundle) iu1.m2701a(parcelM5809c, Bundle.CREATOR);
                    parcelM5809c.recycle();
                    if (bundle2 == null) {
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4600o.m5312a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e8) {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5313b(e8.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                a02 a02Var2 = f02Var.f2248p;
                f02.m1560m(a02Var2);
                a02Var2.mo11z();
                throw new IllegalStateException("Unexpected call on client side");
            case C0561oy.TTL_EXPIRY_EVENT_TO_LOG_FIELD_NUMBER /* 11 */:
                m1589b();
                return;
            case C0561oy.OVERFLOW_POLICY_FIELD_NUMBER /* 12 */:
                m1588a();
                return;
            case C0561oy.ONGOING_EXPERIMENTS_FIELD_NUMBER /* 13 */:
                m1590c();
                return;
            case 14:
                b12 b12Var = (b12) this.f2293k;
                b12Var.f681b.m5550W();
                hr1 hr1Var = (hr1) this.f2294l;
                Object objM600b = hr1Var.f3301l.m600b();
                x62 x62Var = b12Var.f681b;
                if (objM600b == null) {
                    x62Var.getClass();
                    String str = hr1Var.f3299j;
                    p80.m3863h(str);
                    z72 z72VarM5548Q = x62Var.m5548Q(str);
                    if (z72VarM5548Q != null) {
                        x62Var.m5555b0(hr1Var, z72VarM5548Q);
                        return;
                    }
                    return;
                }
                x62Var.getClass();
                String str2 = hr1Var.f3299j;
                p80.m3863h(str2);
                z72 z72VarM5548Q2 = x62Var.m5548Q(str2);
                if (z72VarM5548Q2 != null) {
                    x62Var.m5554a0(hr1Var, z72VarM5548Q2);
                    return;
                }
                return;
            case 15:
                m1591d();
                return;
            case 16:
                gv1 gv1Var = (gv1) this.f2294l;
                v22 v22Var = (v22) this.f2293k;
                s52 s52Var = ((f02) v22Var.f7192j).f2249q;
                f02.m1559l(s52Var);
                f02 f02Var2 = (f02) s52Var.f7192j;
                fz1 fz1Var = f02Var2.f2246n;
                fz1 fz1Var2 = f02Var2.f2246n;
                f02.m1558k(fz1Var);
                if (fz1Var.m1911H().m3157i(k12.f4250l)) {
                    f02.m1558k(fz1Var2);
                    f02Var2.f2252t.getClass();
                    if (!fz1Var2.m1913J(System.currentTimeMillis())) {
                        f02.m1558k(fz1Var2);
                        if (fz1Var2.f2563z.m821a() != 0) {
                            f02.m1558k(fz1Var2);
                            lValueOf = Long.valueOf(fz1Var2.f2563z.m821a());
                        }
                    }
                    if (lValueOf == null) {
                        f72 f72Var = ((f02) v22Var.f7192j).f2250r;
                        f02.m1558k(f72Var);
                        f72Var.m1734p0(gv1Var, lValueOf.longValue());
                        return;
                    } else {
                        try {
                            gv1Var.mo785n(null);
                            return;
                        } catch (RemoteException e9) {
                            ky1 ky1Var3 = ((f02) v22Var.f7192j).f2247o;
                            f02.m1560m(ky1Var3);
                            ky1Var3.f4600o.m5313b(e9, "getSessionId failed with exception");
                            return;
                        }
                    }
                }
                ky1 ky1Var4 = f02Var2.f2247o;
                f02.m1560m(ky1Var4);
                ky1Var4.f4605t.m5312a("Analytics storage consent denied; will not get session id");
                lValueOf = null;
                if (lValueOf == null) {
                    gv1Var.mo785n(null);
                    return;
                }
                f72 f72Var2 = ((f02) v22Var.f7192j).f2250r;
                f02.m1558k(f72Var2);
                f72Var2.m1734p0(gv1Var, lValueOf.longValue());
                return;
            case 17:
                ((v22) this.f2293k).m5036R((Boolean) this.f2294l, true);
                return;
            case 18:
                v22 v22Var2 = (v22) this.f2293k;
                f02 f02Var3 = (f02) v22Var2.f7192j;
                fz1 fz1Var3 = f02Var3.f2246n;
                ky1 ky1Var5 = f02Var3.f2247o;
                f02.m1558k(fz1Var3);
                fz1Var3.mo11z();
                fz1Var3.mo11z();
                zt1 zt1VarM6037b = zt1.m6037b(fz1Var3.m1908E().getString("dma_consent_settings", null));
                zt1 zt1Var = (zt1) this.f2294l;
                int i4 = zt1Var.f9954a;
                if (!l12.m3154l(i4, zt1VarM6037b.f9954a)) {
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4606u.m5313b(Integer.valueOf(i4), "Lower precedence consent source ignored, proposed source");
                    return;
                }
                SharedPreferences.Editor editorEdit = fz1Var3.m1908E().edit();
                editorEdit.putString("dma_consent_settings", zt1Var.f9955b);
                editorEdit.apply();
                f02.m1560m(ky1Var5);
                ky1Var5.f4608w.m5313b(zt1Var, "Setting DMA consent(FE)");
                f02 f02Var4 = (f02) v22Var2.f7192j;
                if (f02Var4.m1573p().m5063K()) {
                    v42 v42VarM1573p = f02Var4.m1573p();
                    v42VarM1573p.mo11z();
                    v42VarM1573p.m3446B();
                    v42VarM1573p.m5067O(new o42(v42VarM1573p, i));
                    return;
                }
                v42 v42VarM1573p2 = f02Var4.m1573p();
                v42VarM1573p2.mo11z();
                v42VarM1573p2.m3446B();
                if (v42VarM1573p2.m5062J()) {
                    v42VarM1573p2.m5067O(new v32(v42VarM1573p2, v42VarM1573p2.m5069Q(false)));
                    return;
                }
                return;
            case 19:
                v22 v22Var3 = ((AppMeasurementDynamiteService) this.f2293k).f1351b.f2254v;
                f02.m1559l(v22Var3);
                a81 a81Var2 = (a81) this.f2294l;
                v22Var3.mo11z();
                v22Var3.m3446B();
                a81 a81Var3 = v22Var3.f8011m;
                if (a81Var2 != a81Var3) {
                    p80.m3865j("EventInterceptor already set.", a81Var3 == null);
                }
                v22Var3.f8011m = a81Var2;
                return;
            case 20:
                f02 f02Var5 = (f02) ((v22) this.f2294l).f7192j;
                vx1 vx1VarM1575r = f02Var5.m1575r();
                String str3 = (String) this.f2293k;
                String str4 = vx1VarM1575r.f8283A;
                if (str4 != null && !str4.equals(str3)) {
                    r6 = 1;
                }
                vx1VarM1575r.f8283A = str3;
                if (r6 != 0) {
                    f02Var5.m1575r().m5218F();
                    return;
                }
                return;
            case 21:
                m1592e();
                return;
            case 22:
                v42 v42Var = (v42) this.f2293k;
                nx1 nx1Var = v42Var.f8065m;
                f02 f02Var6 = (f02) v42Var.f7192j;
                if (nx1Var == null) {
                    ky1 ky1Var6 = f02Var6.f2247o;
                    f02.m1560m(ky1Var6);
                    ky1Var6.f4600o.m5312a("Failed to send current screen to service");
                    return;
                }
                try {
                    f32 f32Var = (f32) this.f2294l;
                    if (f32Var == null) {
                        nx1Var.mo575q(0L, null, null, f02Var6.f2242j.getPackageName());
                    } else {
                        nx1Var.mo575q(f32Var.f2297c, f32Var.f2295a, f32Var.f2296b, f02Var6.f2242j.getPackageName());
                    }
                    v42Var.m5066N();
                    return;
                } catch (RemoteException e10) {
                    ky1 ky1Var7 = ((f02) v42Var.f7192j).f2247o;
                    f02.m1560m(ky1Var7);
                    ky1Var7.f4600o.m5313b(e10, "Failed to send current screen to the service");
                    return;
                }
            case 23:
                ((q42) this.f2293k).f6377l.m5064L((ComponentName) this.f2294l);
                return;
            case 24:
                m1593f();
                return;
            case 25:
                v42 v42Var2 = ((q42) this.f2293k).f6377l;
                v42Var2.f8065m = null;
                if (((C0253gl) this.f2294l).f2796k != 7777) {
                    v42Var2.m5068P();
                    return;
                }
                if (v42Var2.f8068p == null) {
                    v42Var2.f8068p = Executors.newScheduledThreadPool(1);
                }
                v42Var2.f8068p.schedule(new cm1(7, this), ((Long) jx1.f4162Z.m2715a(null)).longValue(), TimeUnit.MILLISECONDS);
                return;
            case 26:
                x62 x62Var2 = (x62) this.f2294l;
                x62Var2.m5550W();
                Runnable runnable = (Runnable) this.f2293k;
                x62Var2.mo1564c().mo11z();
                if (x62Var2.f8836y == null) {
                    x62Var2.f8836y = new ArrayList();
                }
                x62Var2.f8836y.add(runnable);
                x62Var2.m5581q();
                return;
            case 27:
                c32 c32Var = (c32) this.f2294l;
                JobParameters jobParameters = (JobParameters) this.f2293k;
                Log.v("FA", "[sgtm] AppMeasurementJobService processed last Scion upload request.");
                ((b52) ((Service) c32Var.f1083k)).mo595c(jobParameters);
                return;
            case 28:
                vy1 vy1Var = (vy1) this.f2293k;
                try {
                    v92 v92VarMo3002k = ((kb1) vy1Var.f8301l).mo3002k(((v92) this.f2294l).m5131g());
                    iw1 iw1Var2 = rc1.f6821b;
                    v92VarMo3002k.m5127c(iw1Var2, vy1Var);
                    v92VarMo3002k.m5126b(iw1Var2, vy1Var);
                    v92VarMo3002k.f8141b.m3364n(new vy1((Executor) iw1Var2, (hu0) vy1Var));
                    v92VarMo3002k.m5139o();
                    return;
                } catch (a41 e11) {
                    if (e11.getCause() instanceof Exception) {
                        vy1Var.mo309e((Exception) e11.getCause());
                        return;
                    } else {
                        ((v92) vy1Var.f8302m).m5136l(e11);
                        return;
                    }
                } catch (CancellationException unused2) {
                    vy1Var.mo307c();
                    return;
                } catch (Exception e12) {
                    ((v92) vy1Var.f8302m).m5136l(e12);
                    return;
                }
            default:
                Context context = ((x22) this.f2294l).f8764b;
                v01 v01VarM1369d = g72.f2640m;
                if (v01VarM1369d == null) {
                    synchronized (g72.f2639l) {
                        v01VarM1369d = g72.f2640m;
                        if (v01VarM1369d == null) {
                            ?? c0163e6 = new C0163e6(4, 4);
                            try {
                                String[] list = context.getAssets().list("phenotype");
                                if (list != null) {
                                    for (String str5 : list) {
                                        if (str5.endsWith("_package_metadata.binarypb")) {
                                            try {
                                                AssetManager assets = context.getAssets();
                                                StringBuilder sb = new StringBuilder(str5.length() + 10);
                                                sb.append("phenotype/");
                                                sb.append(str5);
                                                InputStream inputStreamOpen = assets.open(sb.toString());
                                                try {
                                                    so1 so1Var2 = so1.f7176a;
                                                    int i5 = fo1.f2465a;
                                                    g72 g72Var = new g72(context, h72.m2223v(inputStreamOpen, so1.f7177b));
                                                    c0163e6.m1371g(g72Var.f2642k, g72Var);
                                                    if (inputStreamOpen != null) {
                                                        inputStreamOpen.close();
                                                    }
                                                } catch (Throwable th2) {
                                                    if (inputStreamOpen != null) {
                                                        try {
                                                            inputStreamOpen.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        break;
                                                    }
                                                    throw th2;
                                                }
                                            } catch (mp1 e13) {
                                                StringBuilder sb2 = new StringBuilder(str5.length() + 45);
                                                sb2.append("Unable to read Phenotype PackageMetadata for ");
                                                sb2.append(str5);
                                                Log.e("PackageInfo", sb2.toString(), e13);
                                            }
                                        }
                                    }
                                }
                            } catch (IOException e14) {
                                Log.e("PackageInfo", "Unable to read Phenotype PackageMetadata from assets.", e14);
                            }
                            v01VarM1369d = c0163e6.m1369d(true);
                            g72.f2640m = v01VarM1369d;
                        }
                        break;
                    }
                }
                String str6 = (String) this.f2293k;
                if (v01VarM1369d.containsKey(str6)) {
                    return;
                }
                StringBuilder sb3 = new StringBuilder(str6.length() + 173);
                sb3.append("Config package ");
                sb3.append(str6);
                sb3.append(" cannot use FILE backing without declarative registration. See go/phenotype-android-integration#phenotype for more information. This will lead to stale flags.");
                Log.e("FilePhenotypeFlags", sb3.toString());
                return;
        }
    }

    public String toString() {
        int i = this.f2292j;
        String str = "IDLE";
        Object obj = this.f2293k;
        switch (i) {
            case 2:
                Runnable runnable = (Runnable) this.f2294l;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i2 = ((v61) obj).f8109l;
                if (i2 != 1) {
                    if (i2 == 2) {
                        str = "QUEUING";
                    } else if (i2 != 3) {
                        str = i2 != 4 ? "null" : "RUNNING";
                    } else {
                        str = "QUEUED";
                    }
                }
                sb.append(str);
                sb.append("}");
                return sb.toString();
            case 3:
                Runnable runnable2 = (Runnable) this.f2294l;
                if (runnable2 != null) {
                    return "SequentialExecutorWorker{running=" + runnable2 + "}";
                }
                StringBuilder sb2 = new StringBuilder("SequentialExecutorWorker{state=");
                int i3 = ((w61) obj).f8442l;
                if (i3 != 1) {
                    if (i3 == 2) {
                        str = "QUEUING";
                    } else if (i3 != 3) {
                        str = i3 != 4 ? "null" : "RUNNING";
                    } else {
                        str = "QUEUED";
                    }
                }
                sb2.append(str);
                sb2.append("}");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ f31(Object obj, Object obj2, int i, boolean z) {
        this.f2292j = i;
        this.f2294l = obj;
        this.f2293k = obj2;
    }

    public /* synthetic */ f31(Executor executor, int i) {
        this.f2292j = i;
        this.f2293k = executor;
    }

    public f31(hz1 hz1Var, mu1 mu1Var, hz1 hz1Var2) {
        this.f2292j = 10;
        this.f2294l = mu1Var;
        this.f2293k = hz1Var;
    }

    public /* synthetic */ f31(int i, Object obj, Object obj2) {
        this.f2292j = i;
        this.f2293k = obj;
        this.f2294l = obj2;
    }

    public f31(c32 c32Var, x62 x62Var, Runnable runnable) {
        this.f2292j = 26;
        this.f2294l = x62Var;
        this.f2293k = runnable;
    }

    public f31(v42 v42Var, f32 f32Var) {
        this.f2292j = 22;
        this.f2294l = f32Var;
        Objects.requireNonNull(v42Var);
        this.f2293k = v42Var;
    }
}
