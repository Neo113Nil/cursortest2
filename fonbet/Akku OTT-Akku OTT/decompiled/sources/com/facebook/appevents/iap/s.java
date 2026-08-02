package com.facebook.appevents.iap;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import com.facebook.appevents.A;
import com.facebook.appevents.iap.u;
import com.facebook.internal.C0715k;
import com.facebook.w;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public final class s {
    public static String d;
    public static final s a = new s();
    public static final ConcurrentHashMap<a, List<Pair<Long, Pair<Bundle, A>>>> b = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<a, List<Pair<Long, Pair<Bundle, A>>>> c = new ConcurrentHashMap<>();
    public static final AtomicBoolean e = new AtomicBoolean(false);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0142 A[Catch: all -> 0x0116, TryCatch #2 {all -> 0x0116, blocks: (B:33:0x00e5, B:35:0x00ec, B:38:0x00fa, B:45:0x010a, B:49:0x0119, B:52:0x0134, B:56:0x0142, B:64:0x0130, B:65:0x00f1, B:68:0x0101, B:80:0x0165, B:81:0x016a, B:84:0x017a, B:86:0x0181, B:87:0x0189, B:90:0x01a2, B:92:0x01aa, B:93:0x01b2, B:95:0x01ba, B:97:0x01f9, B:101:0x01d0, B:103:0x01d8, B:104:0x01e0, B:106:0x01e8, B:116:0x01ff, B:117:0x0205, B:119:0x020b, B:121:0x0213, B:124:0x022f, B:125:0x0234, B:127:0x023a, B:131:0x025a, B:144:0x0262, B:150:0x0268, B:147:0x0272, B:134:0x027c, B:141:0x0282, B:137:0x028d, B:156:0x0220, B:61:0x012a), top: B:32:0x00e5, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v4, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r21v6 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v6, types: [android.os.BaseBundle] */
    /* JADX WARN: Type inference failed for: r9v7, types: [android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r9v8 */
    @JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final synchronized Bundle c(List<a> purchases, long j, boolean z, List<Pair<Bundle, A>> purchaseParameters) {
        Bundle bundle;
        Bundle bundle2;
        ?? r4;
        Long l;
        boolean z2;
        ?? r0;
        Object obj;
        long j2;
        Object b2;
        synchronized (s.class) {
            Bundle bundle3 = null;
            bundle3 = null;
            if (com.facebook.internal.instrument.crashshield.a.b(s.class)) {
                return null;
            }
            try {
                Intrinsics.checkNotNullParameter(purchases, "purchases");
                Intrinsics.checkNotNullParameter(purchaseParameters, "purchaseParameters");
                if (purchaseParameters.isEmpty()) {
                    return null;
                }
                if (purchases.size() != purchaseParameters.size()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int size = purchases.size();
                ?? r9 = 0;
                int i = 0;
                while (i < size) {
                    a aVar = purchases.get(i);
                    Pair<Bundle, A> pair = purchaseParameters.get(i);
                    Bundle component1 = pair.component1();
                    A component2 = pair.component2();
                    int i2 = i;
                    a aVar2 = new a(aVar.a, new BigDecimal(String.valueOf(aVar.b)).setScale(2, RoundingMode.HALF_UP).doubleValue(), aVar.c);
                    List<Pair<Long, Pair<Bundle, A>>> list = z ? b.get(aVar2) : c.get(aVar2);
                    if (list == null || list.isEmpty()) {
                        bundle2 = bundle3;
                        Bundle bundle4 = bundle2;
                        r4 = bundle4;
                        l = r4;
                        z2 = false;
                        r0 = bundle4;
                    } else {
                        Object obj2 = bundle3;
                        Object obj3 = obj2;
                        ?? r21 = obj3;
                        z2 = false;
                        Object obj4 = obj2;
                        Bundle bundle5 = bundle3;
                        for (Pair<Long, Pair<Bundle, A>> pair2 : list) {
                            long longValue = pair2.getFirst().longValue();
                            Pair<Bundle, A> second = pair2.getSecond();
                            Bundle component12 = second.component1();
                            A component22 = second.component2();
                            long abs = Math.abs(j - longValue);
                            List<String> list2 = p.a;
                            com.facebook.internal.n b3 = com.facebook.internal.p.b(w.b());
                            if (b3 != null) {
                                bundle = bundle5;
                                try {
                                    obj = b3.z;
                                } catch (Throwable th) {
                                    th = th;
                                    com.facebook.internal.instrument.crashshield.a.a(th, s.class);
                                    return bundle;
                                }
                            } else {
                                bundle = bundle5;
                                obj = bundle5;
                            }
                            if (obj != null) {
                                Long l2 = b3.z;
                                if (l2 != null && l2.longValue() == 0) {
                                }
                                j2 = b3.z.longValue();
                                if (abs <= j2) {
                                    if (r21 != 0 && longValue >= r21.longValue()) {
                                    }
                                    s sVar = a;
                                    boolean z3 = !z;
                                    if (!com.facebook.internal.instrument.crashshield.a.b(s.class)) {
                                        try {
                                            obj4 = sVar.b(component1, component2, component12, component22, z3, false);
                                        } catch (Throwable th2) {
                                            com.facebook.internal.instrument.crashshield.a.a(th2, s.class);
                                        }
                                        b2 = a.b(component1, component2, component12, component22, z3, true);
                                        if (b2 != null) {
                                            obj3 = b2;
                                        }
                                        if (obj4 == null) {
                                            r21 = Long.valueOf(longValue);
                                            arrayList.add(new Pair(aVar2, Long.valueOf(longValue)));
                                            z2 = true;
                                        }
                                    }
                                    obj4 = bundle;
                                    b2 = a.b(component1, component2, component12, component22, z3, true);
                                    if (b2 != null) {
                                    }
                                    if (obj4 == null) {
                                    }
                                }
                                bundle5 = bundle;
                                obj4 = obj4;
                                r21 = r21;
                            }
                            j2 = p.c;
                            if (abs <= j2) {
                            }
                            bundle5 = bundle;
                            obj4 = obj4;
                            r21 = r21;
                        }
                        bundle2 = bundle5;
                        r4 = obj3;
                        r0 = obj4;
                        l = r21;
                    }
                    if (r4 != null) {
                        if (r9 == 0) {
                            r9 = new Bundle();
                        }
                        r9.putString("fb_iap_test_dedup_result", "1");
                        r9.putString("fb_iap_test_dedup_key_used", r4);
                    }
                    if (z2) {
                        if (r9 == 0) {
                            r9 = new Bundle();
                        }
                        r9.putString("fb_iap_non_deduped_event_time", String.valueOf(l != null ? l.longValue() / 1000 : 0L));
                        r9.putString("fb_iap_actual_dedup_result", "1");
                        r9.putString("fb_iap_actual_dedup_key_used", r0);
                    }
                    if (z && !z2) {
                        ConcurrentHashMap<a, List<Pair<Long, Pair<Bundle, A>>>> concurrentHashMap = c;
                        if (concurrentHashMap.get(aVar2) == null) {
                            concurrentHashMap.put(aVar2, new ArrayList());
                        }
                        List<Pair<Long, Pair<Bundle, A>>> list3 = concurrentHashMap.get(aVar2);
                        if (list3 != null) {
                            list3.add(new Pair<>(Long.valueOf(j), new Pair(component1, component2)));
                        }
                    } else if (!z && !z2) {
                        ConcurrentHashMap<a, List<Pair<Long, Pair<Bundle, A>>>> concurrentHashMap2 = b;
                        if (concurrentHashMap2.get(aVar2) == null) {
                            concurrentHashMap2.put(aVar2, new ArrayList());
                        }
                        List<Pair<Long, Pair<Bundle, A>>> list4 = concurrentHashMap2.get(aVar2);
                        if (list4 != null) {
                            list4.add(new Pair<>(Long.valueOf(j), new Pair(component1, component2)));
                        }
                    }
                    i = i2 + 1;
                    bundle3 = bundle2;
                    r9 = r9;
                }
                bundle = bundle3;
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Pair pair3 = (Pair) it.next();
                    List<Pair<Long, Pair<Bundle, A>>> list5 = z ? b.get(pair3.getFirst()) : c.get(pair3.getFirst());
                    if (list5 != null) {
                        Iterator<Pair<Long, Pair<Bundle, A>>> it2 = list5.iterator();
                        int i3 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            int i4 = i3 + 1;
                            if (it2.next().getFirst().longValue() == ((Number) pair3.getSecond()).longValue()) {
                                list5.remove(i3);
                                break;
                            }
                            i3 = i4;
                        }
                        if (z) {
                            if (list5.isEmpty()) {
                                b.remove(pair3.getFirst());
                            } else {
                                b.put(pair3.getFirst(), list5);
                            }
                        } else if (list5.isEmpty()) {
                            c.remove(pair3.getFirst());
                        } else {
                            c.put(pair3.getFirst(), list5);
                        }
                    }
                }
                return r9;
            } catch (Throwable th3) {
                th = th3;
                bundle = bundle3;
            }
        }
    }

    @JvmStatic
    public static final void d() {
        if (com.facebook.internal.instrument.crashshield.a.b(s.class)) {
            return;
        }
        try {
            if (e.get()) {
                u.a a2 = a.a();
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    f.b(u.a.V1);
                    return;
                }
                if (ordinal != 2) {
                    if (ordinal == 3 && C0715k.b(C0715k.b.IapLoggingLib5To7)) {
                        i.b(w.a(), a2);
                        return;
                    }
                    return;
                }
                if (C0715k.b(C0715k.b.IapLoggingLib2)) {
                    i.b(w.a(), a2);
                } else {
                    f.b(u.a.V2_V4);
                }
            }
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, s.class);
        }
    }

    public final u.a a() {
        String string;
        List split$default;
        u.a aVar = u.a.V5_V7;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return null;
        }
        try {
            Context a2 = w.a();
            ApplicationInfo applicationInfo = a2.getPackageManager().getApplicationInfo(a2.getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "context.packageManager.g…TA_DATA\n                )");
            string = applicationInfo.metaData.getString("com.google.android.play.billingclient.version");
        } catch (Exception unused) {
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
            return null;
        }
        if (string == null) {
            return u.a.NONE;
        }
        split$default = StringsKt__StringsKt.split$default(string, new String[]{"."}, false, 3, 2, (Object) null);
        if (string.length() != 0) {
            String concat = "GPBL.".concat(string);
            if (!com.facebook.internal.instrument.crashshield.a.b(s.class)) {
                try {
                    d = concat;
                } catch (Throwable th2) {
                    com.facebook.internal.instrument.crashshield.a.a(th2, s.class);
                }
            }
            Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
            if (intOrNull != null) {
                int intValue = intOrNull.intValue();
                return intValue == 1 ? u.a.V1 : intValue < 5 ? u.a.V2_V4 : aVar;
            }
        }
        return aVar;
    }

    public final String b(Bundle bundle, A a2, Bundle bundle2, A a3, boolean z, boolean z2) {
        if (!com.facebook.internal.instrument.crashshield.a.b(this)) {
            try {
                List<Pair> c2 = z2 ? p.c(z) : p.b(z);
                if (c2 != null) {
                    for (Pair pair : c2) {
                        A.a aVar = A.Companion;
                        String str = (String) pair.getFirst();
                        aVar.getClass();
                        Object c3 = A.a.c(str, bundle, a2);
                        String str2 = c3 instanceof String ? (String) c3 : null;
                        if (str2 != null && str2.length() != 0) {
                            for (String str3 : (List) pair.getSecond()) {
                                A.Companion.getClass();
                                Object c4 = A.a.c(str3, bundle2, a3);
                                String str4 = c4 instanceof String ? (String) c4 : null;
                                if (str4 != null && str4.length() != 0 && Intrinsics.areEqual(str4, str2)) {
                                    return z ? (String) pair.getFirst() : str3;
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.instrument.crashshield.a.a(th, this);
                return null;
            }
        }
        return null;
    }
}
