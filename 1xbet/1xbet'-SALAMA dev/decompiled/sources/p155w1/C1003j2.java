package p155w1;

import A1.x0;
import android.app.ActivityManager;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Base64;
import io.sentry.protocol.SentryStackFrame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p096n1.e;
import p145u1.d;

/* JADX INFO: renamed from: w1.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1003j2 implements I2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17759a;

    /* JADX WARN: Code duplicated, block: B:176:0x049d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0190  */
    /* JADX WARN: Code duplicated, block: B:59:0x0192  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a6  */
    @Override // p155w1.I2
    public final void a(Object obj) {
        String string;
        int i7;
        Bundle bundle;
        int intExtra;
        int i8;
        String str;
        boolean z4 = true;
        switch (this.f17759a) {
            case 0:
                K2 k7 = (K2) obj;
                C1050x1.z().A(new R1(new C1019n2(L.f(k7.f17449a), L.f(k7.f17450b)), 16));
                return;
            case 1:
                int i9 = AbstractC1007k2.f17771a[((M2) obj).f17456a - 1];
                if (i9 == 1) {
                    C1050x1.z().A(new R1(new U1(0), 1));
                    return;
                } else if (i9 == 2) {
                    C1050x1.z().A(new R1(new q2(true, 0), 17));
                    return;
                } else {
                    if (i9 != 3) {
                        return;
                    }
                    C1050x1.z().A(new R1(new q2(false, 0), 17));
                    return;
                }
            case 2:
                d dVar = (d) obj;
                if (dVar == null) {
                    AbstractC0997i0.o(2, "Consent is null, do not send the frame.");
                    return;
                }
                HashMap map = dVar.f16598a;
                C0991g2 c0991g2 = new C0991g2();
                c0991g2.f17726d = map;
                C1050x1.z().A(new R1(c0991g2, 18));
                return;
            case 3:
                C1033s c1033s = (C1033s) obj;
                AtomicInteger atomicInteger = W1.f17577e;
                if (c1033s == null) {
                    AbstractC0997i0.o(2, "Error is null, do not send the frame.");
                } else {
                    String str2 = c1033s.f17850a;
                    boolean zEquals = "uncaught".equals(str2);
                    List list = zEquals ? c1033s.f17857h : null;
                    int iIncrementAndGet = W1.f17577e.incrementAndGet();
                    Throwable th = c1033s.f17854e;
                    if (th == null) {
                        string = "";
                    } else {
                        StringBuilder sb = new StringBuilder();
                        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                            sb.append(stackTraceElement);
                            sb.append(AbstractC1053y1.f17939a);
                        }
                        if (th.getCause() != null) {
                            sb.append(AbstractC1053y1.f17939a);
                            sb.append("Caused by: ");
                            for (StackTraceElement stackTraceElement2 : th.getCause().getStackTrace()) {
                                sb.append(stackTraceElement2);
                                sb.append(AbstractC1053y1.f17939a);
                            }
                        }
                        string = sb.toString();
                    }
                    if (th != null) {
                        if ("uncaught".equals(str2)) {
                            i7 = 3;
                        } else {
                            i7 = 2;
                        }
                    } else if (SentryStackFrame.JsonKeys.NATIVE.equals(str2)) {
                        i7 = 3;
                    } else {
                        i7 = 1;
                    }
                    int i10 = th == null ? 0 : 2;
                    char[] cArr = O2.f17489d;
                    W1 w7 = new W1(new X1(iIncrementAndGet, c1033s.f17850a, c1033s.f17851b, c1033s.f17852c, c1033s.f17853d, string, i7, i10, c1033s.f17855f, c1033s.f17856g, list, "", ""));
                    if (zEquals) {
                        A1 a2 = (A1) ((e) ((x0) C1050x1.z().f17931b).f613b).f15314b;
                        if (a2 != null) {
                            a2.a(w7);
                        }
                    } else {
                        C1050x1.z().A(w7);
                    }
                }
                String str3 = c1033s.f17853d;
                return;
            case 4:
                G g3 = (G) obj;
                boolean z7 = g3.f17388b;
                Map map2 = g3.f17387a;
                if (map2 != null && map2.size() != 0) {
                    C1050x1.z().A(new R1(new u2(map2, z7), 29));
                }
                HashMap map3 = new HashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (((H) entry.getKey()).equals(H.AndroidInstallationId)) {
                        map3.put(((H) entry.getKey()).name(), AbstractC0997i0.d(Base64.decode((String) entry.getValue(), 2)).toUpperCase(Locale.getDefault()));
                    } else {
                        map3.put(((H) entry.getKey()).name(), (String) entry.getValue());
                    }
                }
                Objects.toString(map2);
                return;
            case 5:
                M m7 = (M) obj;
                boolean zB = p136t.e.b(8, m7.f17453a);
                Bundle bundle2 = m7.f17454b;
                int i11 = m7.f17453a;
                if (zB && bundle2.containsKey("orientation_name")) {
                    int i12 = bundle2.getInt("orientation_name");
                    if (i12 != 0 && R1.f17529f != i12) {
                        R1.f17529f = i12;
                        C1050x1.z().A(new R1(new C0971b2(i12), 15));
                    }
                    switch (i11) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            break;
                        default:
                            throw null;
                    }
                }
                if (!p136t.e.b(1, i11) || (bundle = bundle2.getBundle("launch_options")) == null) {
                    return;
                }
                bundle.toString();
                for (String str4 : bundle.keySet()) {
                    if (str4 != null) {
                        Object obj2 = bundle.get(str4);
                        String string2 = obj2 != null ? obj2.toString() : "null";
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(string2);
                        if (!str4.isEmpty() && arrayList.size() != 0) {
                            C1050x1.z().A(new R1(new C0975c2(str4, arrayList), 23));
                        }
                    }
                }
                return;
            case 6:
                O o7 = (O) obj;
                String str5 = o7.f17485a;
                String str6 = o7.f17486b;
                if ((str5 == null || str5.isEmpty()) && (str6 == null || str6.isEmpty())) {
                    return;
                }
                C1050x1.z().A(new R1(new C0975c2(0, str5, str6), 5));
                return;
            case 7:
                S s7 = (S) obj;
                s7.getClass();
                C1050x1.z().A(new R1(new t2(s7.f17531a, s7.f17532b, s7.f17533c), 24));
                "LocationProvider".concat(String.valueOf(s7));
                return;
            case 8:
                U u4 = (U) obj;
                C1050x1.z().A(new R1(new C0979d2(p136t.e.e(u4.f17553b), u4.f17554c, u4.f17555d, u4.f17556e, u4.f17557f, u4.f17558g, u4.f17559h, u4.f17560i), 6));
                "NetworkProvider".concat(String.valueOf(u4));
                return;
            case 9:
                C0969b0 c0969b0 = (C0969b0) obj;
                String str7 = c0969b0.f17651a;
                Map map4 = c0969b0.f17653c;
                map4.put("fl.origin.attribute.version", c0969b0.f17652b);
                if (map4.size() > 10) {
                    int size = map4.size();
                    AbstractC0997i0.o(2, "MaxOriginParams exceeded: ".concat(String.valueOf(size)));
                    map4.clear();
                    map4.put("fl.parameter.limit.exceeded", String.valueOf(size));
                }
                C1050x1.z().A(new R1(new v2(str7, map4), 26));
                Objects.toString(map4);
                return;
            case 10:
                C0977d0 c0977d0 = (C0977d0) obj;
                if (c0977d0 == null) {
                    return;
                }
                C1050x1.z().A(new R1(new C0983e2(c0977d0), 8));
                return;
            case 11:
                C1045w c1045w = (C1045w) obj;
                if (c1045w != null) {
                    C1017n0.a();
                    I i13 = c1045w.f17903d;
                    C1050x1.z().A(new w2(new z2(c1045w.f17901b, c1045w.f17900a, (i13 == null || !i13.f17418a) ? 1 : 3, c1045w.f17902c), 1));
                }
                "SessionInfoData".concat(String.valueOf(c1045w));
                return;
            case 12:
                C1001j0 c1001j0 = (C1001j0) obj;
                if (c1001j0 == null) {
                    return;
                }
                HashMap map5 = new HashMap();
                boolean z8 = c1001j0.f17755a;
                I i14 = c1001j0.f17756b;
                if (z8) {
                    map5.put("boot.time", R1.c(Long.toString(System.currentTimeMillis() - SystemClock.elapsedRealtime())));
                    StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    map5.put("disk.size.total.internal", R1.c(Long.toString(statFs.getBlockCountLong())));
                    map5.put("disk.size.available.internal", R1.c(Long.toString(statFs.getAvailableBlocksLong())));
                    if (i14 != null && !i14.f17418a) {
                        try {
                            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                            map5.put("disk.size.total.external", R1.c(Long.toString(statFs2.getBlockCountLong())));
                            map5.put("disk.size.available.external", R1.c(Long.toString(statFs2.getAvailableBlocksLong())));
                        } catch (Exception e7) {
                            e7.getMessage();
                        }
                    }
                    C1013m0.i();
                    TelephonyManager telephonyManager = (TelephonyManager) AbstractC0998i1.f17749c.getSystemService("phone");
                    map5.put("carrier.name", R1.c(telephonyManager == null ? null : telephonyManager.getNetworkOperatorName()));
                    C1013m0.i();
                    TelephonyManager telephonyManager2 = (TelephonyManager) AbstractC0998i1.f17749c.getSystemService("phone");
                    map5.put("carrier.details", R1.c(telephonyManager2 == null ? null : telephonyManager2.getNetworkOperator()));
                    break;
                }
                ActivityManager activityManager = (ActivityManager) AbstractC0998i1.f17749c.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                map5.put("memory.available".concat(z8 ? ".start" : ".end"), R1.c(Long.toString(memoryInfo.availMem)));
                map5.put("memory.total".concat(z8 ? ".start" : ".end"), R1.c(Long.toString(memoryInfo.availMem)));
                int intExtra2 = -1;
                try {
                    Intent intentRegisterReceiver = AbstractC0998i1.f17749c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver != null) {
                        int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
                        if (intExtra3 != 2 && intExtra3 != 5) {
                            z4 = false;
                        }
                        try {
                            intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                            try {
                                intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                            } catch (Exception e8) {
                                e = e8;
                                "Error getting battery status: ".concat(String.valueOf(e));
                            }
                        } catch (Exception e9) {
                            e = e9;
                            intExtra = -1;
                            "Error getting battery status: ".concat(String.valueOf(e));
                            i8 = intExtra2;
                            intExtra2 = intExtra;
                            float f7 = intExtra2 / i8;
                            HashMap mapC = R1.c(Boolean.toString(z4));
                            if (z8) {
                                str = ".start";
                            } else {
                                str = ".end";
                            }
                            map5.put("battery.charging".concat(str), mapC);
                            map5.put("battery.remaining".concat(z8 ? ".start" : ".end"), R1.c(Float.toString(f7)));
                            if (i14 != null) {
                                map5.put("instantapp.name", R1.c(i14.f17419b));
                            }
                            C1050x1.z().A(new R1(new C0991g2(0, map5), 11));
                            return;
                        }
                        i8 = intExtra2;
                        intExtra2 = intExtra;
                    } else {
                        z4 = false;
                        i8 = -1;
                    }
                    break;
                } catch (Exception e10) {
                    e = e10;
                    z4 = false;
                }
                float f8 = intExtra2 / i8;
                HashMap mapC2 = R1.c(Boolean.toString(z4));
                if (z8) {
                    str = ".start";
                } else {
                    str = ".end";
                }
                map5.put("battery.charging".concat(str), mapC2);
                map5.put("battery.remaining".concat(z8 ? ".start" : ".end"), R1.c(Float.toString(f8)));
                if (i14 != null && i14.f17418a) {
                    map5.put("instantapp.name", R1.c(i14.f17419b));
                }
                C1050x1.z().A(new R1(new C0991g2(0, map5), 11));
                return;
            default:
                String str8 = (String) obj;
                C1050x1.z().A(new R1(new C0999i2(str8, 0), 12));
                "TimeZoneProvider".concat(String.valueOf(str8));
                return;
        }
    }
}
