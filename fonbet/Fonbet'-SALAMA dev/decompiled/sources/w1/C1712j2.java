package w1;

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
import n1.C1450e;

/* renamed from: w1.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1712j2 implements I2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17753a;

    /* JADX WARN: Removed duplicated region for block: B:186:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0192  */
    @Override // w1.I2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Object obj) {
        String sb;
        int i7;
        Bundle bundle;
        int i8;
        int i9;
        Intent registerReceiver;
        boolean z4 = true;
        switch (this.f17753a) {
            case 0:
                K2 k22 = (K2) obj;
                C1759x1.z().A(new R1(new C1728n2(L.f(k22.f17443a), L.f(k22.f17444b)), 16));
                return;
            case 1:
                int i10 = AbstractC1716k2.f17765a[((M2) obj).f17450a - 1];
                if (i10 == 1) {
                    C1759x1.z().A(new R1(new U1(0), 1));
                    return;
                } else if (i10 == 2) {
                    C1759x1.z().A(new R1(new q2(true, 0), 17));
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    C1759x1.z().A(new R1(new q2(false, 0), 17));
                    return;
                }
            case 2:
                u1.d dVar = (u1.d) obj;
                if (dVar == null) {
                    AbstractC1706i0.o(2, "Consent is null, do not send the frame.");
                    return;
                }
                HashMap hashMap = dVar.f16592a;
                C1700g2 c1700g2 = new C1700g2();
                c1700g2.f17720d = hashMap;
                C1759x1.z().A(new R1(c1700g2, 18));
                return;
            case 3:
                C1742s c1742s = (C1742s) obj;
                AtomicInteger atomicInteger = W1.f17571e;
                if (c1742s == null) {
                    AbstractC1706i0.o(2, "Error is null, do not send the frame.");
                } else {
                    String str = c1742s.f17844a;
                    boolean equals = "uncaught".equals(str);
                    List list = equals ? c1742s.f17851h : null;
                    int incrementAndGet = W1.f17571e.incrementAndGet();
                    Throwable th = c1742s.f17848e;
                    if (th == null) {
                        sb = "";
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                            sb2.append(stackTraceElement);
                            sb2.append(AbstractC1762y1.f17933a);
                        }
                        if (th.getCause() != null) {
                            sb2.append(AbstractC1762y1.f17933a);
                            sb2.append("Caused by: ");
                            for (StackTraceElement stackTraceElement2 : th.getCause().getStackTrace()) {
                                sb2.append(stackTraceElement2);
                                sb2.append(AbstractC1762y1.f17933a);
                            }
                        }
                        sb = sb2.toString();
                    }
                    if (th != null) {
                        if (!"uncaught".equals(str)) {
                            i7 = 2;
                            int i11 = th != null ? 0 : 2;
                            char[] cArr = O2.f17483d;
                            W1 w12 = new W1(new X1(incrementAndGet, c1742s.f17844a, c1742s.f17845b, c1742s.f17846c, c1742s.f17847d, sb, i7, i11, c1742s.f17849f, c1742s.f17850g, list, "", ""));
                            if (equals) {
                                C1759x1.z().A(w12);
                            } else {
                                A1 a12 = (A1) ((C1450e) ((A1.x0) C1759x1.z().f17925b).f613b).f15308b;
                                if (a12 != null) {
                                    a12.a(w12);
                                }
                            }
                        }
                        i7 = 3;
                        if (th != null) {
                        }
                        char[] cArr2 = O2.f17483d;
                        W1 w122 = new W1(new X1(incrementAndGet, c1742s.f17844a, c1742s.f17845b, c1742s.f17846c, c1742s.f17847d, sb, i7, i11, c1742s.f17849f, c1742s.f17850g, list, "", ""));
                        if (equals) {
                        }
                    } else {
                        if (!SentryStackFrame.JsonKeys.NATIVE.equals(str)) {
                            i7 = 1;
                            if (th != null) {
                            }
                            char[] cArr22 = O2.f17483d;
                            W1 w1222 = new W1(new X1(incrementAndGet, c1742s.f17844a, c1742s.f17845b, c1742s.f17846c, c1742s.f17847d, sb, i7, i11, c1742s.f17849f, c1742s.f17850g, list, "", ""));
                            if (equals) {
                            }
                        }
                        i7 = 3;
                        if (th != null) {
                        }
                        char[] cArr222 = O2.f17483d;
                        W1 w12222 = new W1(new X1(incrementAndGet, c1742s.f17844a, c1742s.f17845b, c1742s.f17846c, c1742s.f17847d, sb, i7, i11, c1742s.f17849f, c1742s.f17850g, list, "", ""));
                        if (equals) {
                        }
                    }
                }
                String str2 = c1742s.f17847d;
                return;
            case 4:
                G g3 = (G) obj;
                boolean z7 = g3.f17382b;
                Map map = g3.f17381a;
                if (map != null && map.size() != 0) {
                    C1759x1.z().A(new R1(new u2(map, z7), 29));
                }
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : map.entrySet()) {
                    if (((H) entry.getKey()).equals(H.AndroidInstallationId)) {
                        hashMap2.put(((H) entry.getKey()).name(), AbstractC1706i0.d(Base64.decode((String) entry.getValue(), 2)).toUpperCase(Locale.getDefault()));
                    } else {
                        hashMap2.put(((H) entry.getKey()).name(), (String) entry.getValue());
                    }
                }
                Objects.toString(map);
                return;
            case 5:
                M m7 = (M) obj;
                boolean b7 = t.e.b(8, m7.f17447a);
                Bundle bundle2 = m7.f17448b;
                int i12 = m7.f17447a;
                if (b7 && bundle2.containsKey("orientation_name")) {
                    int i13 = bundle2.getInt("orientation_name");
                    if (i13 != 0 && R1.f17523f != i13) {
                        R1.f17523f = i13;
                        C1759x1.z().A(new R1(new C1680b2(i13), 15));
                    }
                    switch (i12) {
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
                if (!t.e.b(1, i12) || (bundle = bundle2.getBundle("launch_options")) == null) {
                    return;
                }
                bundle.toString();
                for (String str3 : bundle.keySet()) {
                    if (str3 != null) {
                        Object obj2 = bundle.get(str3);
                        String obj3 = obj2 != null ? obj2.toString() : "null";
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(obj3);
                        if (!str3.isEmpty() && arrayList.size() != 0) {
                            C1759x1.z().A(new R1(new C1684c2(str3, arrayList), 23));
                        }
                    }
                }
                return;
            case 6:
                O o7 = (O) obj;
                String str4 = o7.f17479a;
                String str5 = o7.f17480b;
                if ((str4 == null || str4.isEmpty()) && (str5 == null || str5.isEmpty())) {
                    return;
                }
                C1759x1.z().A(new R1(new C1684c2(0, str4, str5), 5));
                return;
            case 7:
                S s7 = (S) obj;
                s7.getClass();
                C1759x1.z().A(new R1(new t2(s7.f17525a, s7.f17526b, s7.f17527c), 24));
                "LocationProvider".concat(String.valueOf(s7));
                return;
            case 8:
                U u4 = (U) obj;
                C1759x1.z().A(new R1(new C1688d2(t.e.e(u4.f17547b), u4.f17548c, u4.f17549d, u4.f17550e, u4.f17551f, u4.f17552g, u4.f17553h, u4.f17554i), 6));
                "NetworkProvider".concat(String.valueOf(u4));
                return;
            case 9:
                C1678b0 c1678b0 = (C1678b0) obj;
                String str6 = c1678b0.f17645a;
                Map map2 = c1678b0.f17647c;
                map2.put("fl.origin.attribute.version", c1678b0.f17646b);
                if (map2.size() > 10) {
                    int size = map2.size();
                    AbstractC1706i0.o(2, "MaxOriginParams exceeded: ".concat(String.valueOf(size)));
                    map2.clear();
                    map2.put("fl.parameter.limit.exceeded", String.valueOf(size));
                }
                C1759x1.z().A(new R1(new v2(str6, map2), 26));
                Objects.toString(map2);
                return;
            case 10:
                C1686d0 c1686d0 = (C1686d0) obj;
                if (c1686d0 == null) {
                    return;
                }
                C1759x1.z().A(new R1(new C1692e2(c1686d0), 8));
                return;
            case 11:
                C1754w c1754w = (C1754w) obj;
                if (c1754w != null) {
                    C1726n0.a();
                    I i14 = c1754w.f17897d;
                    C1759x1.z().A(new w2(new z2(c1754w.f17895b, c1754w.f17894a, (i14 == null || !i14.f17412a) ? 1 : 3, c1754w.f17896c), 1));
                }
                "SessionInfoData".concat(String.valueOf(c1754w));
                return;
            case 12:
                C1710j0 c1710j0 = (C1710j0) obj;
                if (c1710j0 == null) {
                    return;
                }
                HashMap hashMap3 = new HashMap();
                boolean z8 = c1710j0.f17749a;
                I i15 = c1710j0.f17750b;
                if (z8) {
                    hashMap3.put("boot.time", R1.c(Long.toString(System.currentTimeMillis() - SystemClock.elapsedRealtime())));
                    StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
                    hashMap3.put("disk.size.total.internal", R1.c(Long.toString(statFs.getBlockCountLong())));
                    hashMap3.put("disk.size.available.internal", R1.c(Long.toString(statFs.getAvailableBlocksLong())));
                    if (i15 != null && !i15.f17412a) {
                        try {
                            StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getAbsolutePath());
                            hashMap3.put("disk.size.total.external", R1.c(Long.toString(statFs2.getBlockCountLong())));
                            hashMap3.put("disk.size.available.external", R1.c(Long.toString(statFs2.getAvailableBlocksLong())));
                        } catch (Exception e7) {
                            e7.getMessage();
                        }
                    }
                    C1722m0.i();
                    TelephonyManager telephonyManager = (TelephonyManager) AbstractC1707i1.f17743c.getSystemService("phone");
                    hashMap3.put("carrier.name", R1.c(telephonyManager == null ? null : telephonyManager.getNetworkOperatorName()));
                    C1722m0.i();
                    TelephonyManager telephonyManager2 = (TelephonyManager) AbstractC1707i1.f17743c.getSystemService("phone");
                    hashMap3.put("carrier.details", R1.c(telephonyManager2 == null ? null : telephonyManager2.getNetworkOperator()));
                }
                ActivityManager activityManager = (ActivityManager) AbstractC1707i1.f17743c.getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                hashMap3.put("memory.available".concat(z8 ? ".start" : ".end"), R1.c(Long.toString(memoryInfo.availMem)));
                hashMap3.put("memory.total".concat(z8 ? ".start" : ".end"), R1.c(Long.toString(memoryInfo.availMem)));
                int i16 = -1;
                try {
                    registerReceiver = AbstractC1707i1.f17743c.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                } catch (Exception e8) {
                    e = e8;
                    z4 = false;
                }
                if (registerReceiver == null) {
                    z4 = false;
                    i9 = -1;
                    float f7 = i16 / i9;
                    hashMap3.put("battery.charging".concat(!z8 ? ".start" : ".end"), R1.c(Boolean.toString(z4)));
                    hashMap3.put("battery.remaining".concat(z8 ? ".start" : ".end"), R1.c(Float.toString(f7)));
                    if (i15 != null) {
                        hashMap3.put("instantapp.name", R1.c(i15.f17413b));
                    }
                    C1759x1.z().A(new R1(new C1700g2(0, hashMap3), 11));
                    return;
                }
                int intExtra = registerReceiver.getIntExtra("status", -1);
                if (intExtra != 2 && intExtra != 5) {
                    z4 = false;
                }
                try {
                    i8 = registerReceiver.getIntExtra("level", -1);
                } catch (Exception e9) {
                    e = e9;
                    i8 = -1;
                    "Error getting battery status: ".concat(String.valueOf(e));
                    i9 = i16;
                    i16 = i8;
                    float f72 = i16 / i9;
                    hashMap3.put("battery.charging".concat(!z8 ? ".start" : ".end"), R1.c(Boolean.toString(z4)));
                    hashMap3.put("battery.remaining".concat(z8 ? ".start" : ".end"), R1.c(Float.toString(f72)));
                    if (i15 != null) {
                    }
                    C1759x1.z().A(new R1(new C1700g2(0, hashMap3), 11));
                    return;
                }
                try {
                    i16 = registerReceiver.getIntExtra("scale", -1);
                } catch (Exception e10) {
                    e = e10;
                    "Error getting battery status: ".concat(String.valueOf(e));
                    i9 = i16;
                    i16 = i8;
                    float f722 = i16 / i9;
                    hashMap3.put("battery.charging".concat(!z8 ? ".start" : ".end"), R1.c(Boolean.toString(z4)));
                    hashMap3.put("battery.remaining".concat(z8 ? ".start" : ".end"), R1.c(Float.toString(f722)));
                    if (i15 != null) {
                    }
                    C1759x1.z().A(new R1(new C1700g2(0, hashMap3), 11));
                    return;
                }
                i9 = i16;
                i16 = i8;
                float f7222 = i16 / i9;
                hashMap3.put("battery.charging".concat(!z8 ? ".start" : ".end"), R1.c(Boolean.toString(z4)));
                hashMap3.put("battery.remaining".concat(z8 ? ".start" : ".end"), R1.c(Float.toString(f7222)));
                if (i15 != null && i15.f17412a) {
                    hashMap3.put("instantapp.name", R1.c(i15.f17413b));
                }
                C1759x1.z().A(new R1(new C1700g2(0, hashMap3), 11));
                return;
            default:
                String str7 = (String) obj;
                C1759x1.z().A(new R1(new C1708i2(str7, 0), 12));
                "TimeZoneProvider".concat(String.valueOf(str7));
                return;
        }
    }
}
