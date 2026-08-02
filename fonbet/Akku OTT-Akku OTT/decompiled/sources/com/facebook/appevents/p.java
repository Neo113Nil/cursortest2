package com.facebook.appevents;

import android.content.Context;
import android.os.Bundle;
import androidx.media3.common.P;
import com.facebook.C0688a;
import com.facebook.C0728q;
import com.facebook.S;
import com.facebook.appevents.A;
import com.facebook.appevents.l;
import com.facebook.internal.C0715k;
import com.facebook.internal.u;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class p {
    public static final a Companion = new a();
    public static final String c;
    public static ScheduledThreadPoolExecutor d;
    public static final Object e;
    public static volatile String f;
    public static boolean g;
    public static final m h;
    public final String a;
    public final C0689a b;

    @SourceDebugExtension({"SMAP\nAppEventsLoggerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppEventsLoggerImpl.kt\ncom/facebook/appevents/AppEventsLoggerImpl$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,872:1\n1#2:873\n37#3,2:874\n*S KotlinDebug\n*F\n+ 1 AppEventsLoggerImpl.kt\ncom/facebook/appevents/AppEventsLoggerImpl$Companion\n*L\n718#1:874,2\n*E\n"})
    public static final class a {
        public static final void a(a aVar, C0692d appEvent, C0689a accessTokenAppId) {
            boolean z;
            String str = appEvent.e;
            boolean z2 = appEvent.c;
            aVar.getClass();
            String str2 = j.a;
            int i = 1;
            if (!com.facebook.internal.instrument.crashshield.a.b(j.class)) {
                try {
                    Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
                    Intrinsics.checkNotNullParameter(appEvent, "appEvent");
                    j.d.execute(new com.csdcorp.speech_to_text.i(i, accessTokenAppId, appEvent));
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, j.class);
                }
            }
            boolean z3 = false;
            if (C0715k.b(C0715k.b.OnDevicePostInstallEventProcessing) && com.facebook.appevents.ondeviceprocessing.a.a()) {
                String applicationId = accessTokenAppId.a;
                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.ondeviceprocessing.a.class)) {
                    try {
                        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
                        Intrinsics.checkNotNullParameter(appEvent, "event");
                        com.facebook.appevents.ondeviceprocessing.a aVar2 = com.facebook.appevents.ondeviceprocessing.a.a;
                        aVar2.getClass();
                        if (!com.facebook.internal.instrument.crashshield.a.b(aVar2)) {
                            if (z2) {
                                try {
                                    if (com.facebook.appevents.ondeviceprocessing.a.b.contains(str)) {
                                        z = true;
                                        if (z2 || z) {
                                            com.facebook.w.c().execute(new P(2, applicationId, appEvent));
                                        }
                                    }
                                } catch (Throwable th2) {
                                    com.facebook.internal.instrument.crashshield.a.a(th2, aVar2);
                                }
                            }
                            z = false;
                            if (z2) {
                            }
                            com.facebook.w.c().execute(new P(2, applicationId, appEvent));
                        }
                    } catch (Throwable th3) {
                        com.facebook.internal.instrument.crashshield.a.a(th3, com.facebook.appevents.ondeviceprocessing.a.class);
                    }
                }
            }
            if (C0715k.b(C0715k.b.GPSARATriggers)) {
                com.facebook.appevents.gps.ara.a.a.d(accessTokenAppId.a, appEvent);
            }
            if (C0715k.b(C0715k.b.GPSPACAProcessing)) {
                com.facebook.appevents.gps.pa.a aVar3 = com.facebook.appevents.gps.pa.a.a;
                String str3 = accessTokenAppId.a;
                aVar3.getClass();
                if (!com.facebook.internal.instrument.crashshield.a.b(aVar3)) {
                    try {
                        if (!com.facebook.appevents.gps.pa.a.c) {
                            com.facebook.appevents.gps.pa.a.a();
                        }
                        if (com.facebook.appevents.gps.pa.a.b) {
                            String str4 = null;
                            try {
                                JSONObject jSONObject = appEvent.a;
                                if (jSONObject != null) {
                                    str4 = jSONObject.getString("_eventName");
                                }
                            } catch (JSONException unused) {
                            }
                            aVar3.b(str3, str4);
                        }
                    } catch (Throwable th4) {
                        com.facebook.internal.instrument.crashshield.a.a(th4, aVar3);
                    }
                }
            }
            if (z2) {
                return;
            }
            if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                try {
                    z3 = p.g;
                } catch (Throwable th5) {
                    com.facebook.internal.instrument.crashshield.a.a(th5, p.class);
                }
            }
            if (z3) {
                return;
            }
            if (!Intrinsics.areEqual(str, "fb_mobile_activate_app")) {
                com.facebook.internal.u.Companion.getClass();
                u.a.a(com.facebook.G.d, "AppEvents", "Warning: Please call AppEventsLogger.activateApp(...)from the long-lived activity's onResume() methodbefore logging other app events.");
            } else {
                if (com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                    return;
                }
                try {
                    p.g = true;
                } catch (Throwable th6) {
                    com.facebook.internal.instrument.crashshield.a.a(th6, p.class);
                }
            }
        }

        @JvmStatic
        public static Pair b(Bundle bundle, A a, boolean z) {
            boolean c = com.facebook.appevents.internal.k.c();
            String str = SessionDescription.SUPPORTED_SDP_VERSION;
            String str2 = c ? "1" : SessionDescription.SUPPORTED_SDP_VERSION;
            A.Companion.getClass();
            Pair b = A.a.b("is_implicit_purchase_logging_enabled", str2, bundle, a);
            Object c2 = A.a.c("fb_iap_product_id", bundle, a);
            String str3 = c2 instanceof String ? (String) c2 : null;
            if (!z) {
                if ((bundle != null ? bundle.getString("fb_content_id") : null) == null && str3 != null) {
                    Pair b2 = A.a.b("fb_content_id", str3, bundle, a);
                    b = A.a.b("android_dynamic_ads_content_id", "client_manual", (Bundle) b2.getFirst(), (A) b2.getSecond());
                }
            }
            Bundle bundle2 = (Bundle) b.getFirst();
            A a2 = (A) b.getSecond();
            if (S.c()) {
                str = "1";
            }
            Pair b3 = A.a.b("is_autolog_app_events_enabled", str, bundle2, a2);
            return new Pair((Bundle) b3.getFirst(), (A) b3.getSecond());
        }

        @JvmStatic
        public static l.b c() {
            l.b bVar;
            synchronized (p.c()) {
                bVar = null;
                if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                    try {
                        bVar = l.b.a;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, p.class);
                    }
                }
            }
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x002b  */
        @JvmStatic
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static String d() {
            m callback;
            if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                try {
                    callback = p.h;
                } catch (Throwable th) {
                    com.facebook.internal.instrument.crashshield.a.a(th, p.class);
                }
                Intrinsics.checkNotNullParameter(callback, "callback");
                if (!com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
                    Context a = com.facebook.w.a();
                    if (a == null) {
                        throw new IllegalArgumentException("Please provide a valid Context.");
                    }
                    com.android.installreferrer.api.a aVar = new com.android.installreferrer.api.a(a);
                    try {
                        aVar.c(new com.facebook.internal.r(aVar, callback));
                    } catch (Exception unused) {
                    }
                }
                return com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
            }
            callback = null;
            Intrinsics.checkNotNullParameter(callback, "callback");
            if (!com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false)) {
            }
            return com.facebook.w.a().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("install_referrer", null);
        }

        public static void e() {
            synchronized (p.c()) {
                if (p.b() != null) {
                    return;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
                if (!com.facebook.internal.instrument.crashshield.a.b(p.class)) {
                    try {
                        p.d = scheduledThreadPoolExecutor;
                    } catch (Throwable th) {
                        com.facebook.internal.instrument.crashshield.a.a(th, p.class);
                    }
                }
                Unit unit = Unit.INSTANCE;
                n nVar = new n();
                ScheduledThreadPoolExecutor b = p.b();
                if (b == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                b.scheduleAtFixedRate(nVar, 0L, 86400L, TimeUnit.SECONDS);
            }
        }
    }

    static {
        String canonicalName = p.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "com.facebook.appevents.AppEventsLoggerImpl";
        }
        c = canonicalName;
        e = new Object();
        h = new m(0);
    }

    public p(String activityName, String str) {
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        com.facebook.internal.F.f();
        this.a = activityName;
        C0688a.Companion.getClass();
        C0688a accessToken = C0688a.b.b();
        if (accessToken == null || new Date().after(accessToken.a) || !(str == null || Intrinsics.areEqual(str, accessToken.j))) {
            this.b = new C0689a(null, str == null ? com.facebook.internal.E.p(com.facebook.w.a()) : str);
        } else {
            Intrinsics.checkNotNullParameter(accessToken, "accessToken");
            this.b = new C0689a(accessToken.e, com.facebook.w.b());
        }
        Companion.getClass();
        a.e();
    }

    public static final /* synthetic */ String a() {
        if (com.facebook.internal.instrument.crashshield.a.b(p.class)) {
            return null;
        }
        try {
            return f;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, p.class);
            return null;
        }
    }

    public static final /* synthetic */ ScheduledThreadPoolExecutor b() {
        if (com.facebook.internal.instrument.crashshield.a.b(p.class)) {
            return null;
        }
        try {
            return d;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, p.class);
            return null;
        }
    }

    public static final /* synthetic */ Object c() {
        if (com.facebook.internal.instrument.crashshield.a.b(p.class)) {
            return null;
        }
        try {
            return e;
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, p.class);
            return null;
        }
    }

    public static /* synthetic */ void g(p pVar, String str, Double d2, Bundle bundle, boolean z, UUID uuid) {
        if (com.facebook.internal.instrument.crashshield.a.b(p.class)) {
            return;
        }
        try {
            pVar.f(str, d2, bundle, z, uuid, null);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, p.class);
        }
    }

    public final void d(Bundle bundle, String str, double d2) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            try {
                g(this, str, Double.valueOf(d2), bundle, false, com.facebook.appevents.internal.f.b());
            } catch (Throwable th) {
                th = th;
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void e(String str, Bundle bundle) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            try {
                g(this, str, null, bundle, false, com.facebook.appevents.internal.f.b());
            } catch (Throwable th) {
                th = th;
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x008d A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x0044, B:26:0x005e, B:29:0x009f, B:31:0x00ab, B:33:0x00b1, B:36:0x00ba, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:99:0x00d1, B:45:0x00d9, B:48:0x00e0, B:55:0x00e8, B:56:0x011a, B:59:0x012a, B:61:0x013a, B:67:0x0160, B:69:0x0177, B:71:0x017f, B:72:0x0189, B:75:0x01a1, B:80:0x01af, B:84:0x01c2, B:93:0x0158, B:101:0x00bd, B:103:0x0065, B:105:0x006f, B:107:0x0075, B:110:0x007e, B:111:0x0083, B:112:0x0087, B:114:0x008d, B:117:0x0095, B:125:0x0081, B:127:0x004a, B:129:0x0052, B:131:0x0058, B:87:0x0146, B:90:0x0150), top: B:4:0x0010, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x0044, B:26:0x005e, B:29:0x009f, B:31:0x00ab, B:33:0x00b1, B:36:0x00ba, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:99:0x00d1, B:45:0x00d9, B:48:0x00e0, B:55:0x00e8, B:56:0x011a, B:59:0x012a, B:61:0x013a, B:67:0x0160, B:69:0x0177, B:71:0x017f, B:72:0x0189, B:75:0x01a1, B:80:0x01af, B:84:0x01c2, B:93:0x0158, B:101:0x00bd, B:103:0x0065, B:105:0x006f, B:107:0x0075, B:110:0x007e, B:111:0x0083, B:112:0x0087, B:114:0x008d, B:117:0x0095, B:125:0x0081, B:127:0x004a, B:129:0x0052, B:131:0x0058, B:87:0x0146, B:90:0x0150), top: B:4:0x0010, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x0044, B:26:0x005e, B:29:0x009f, B:31:0x00ab, B:33:0x00b1, B:36:0x00ba, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:99:0x00d1, B:45:0x00d9, B:48:0x00e0, B:55:0x00e8, B:56:0x011a, B:59:0x012a, B:61:0x013a, B:67:0x0160, B:69:0x0177, B:71:0x017f, B:72:0x0189, B:75:0x01a1, B:80:0x01af, B:84:0x01c2, B:93:0x0158, B:101:0x00bd, B:103:0x0065, B:105:0x006f, B:107:0x0075, B:110:0x007e, B:111:0x0083, B:112:0x0087, B:114:0x008d, B:117:0x0095, B:125:0x0081, B:127:0x004a, B:129:0x0052, B:131:0x0058, B:87:0x0146, B:90:0x0150), top: B:4:0x0010, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013a A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x0044, B:26:0x005e, B:29:0x009f, B:31:0x00ab, B:33:0x00b1, B:36:0x00ba, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:99:0x00d1, B:45:0x00d9, B:48:0x00e0, B:55:0x00e8, B:56:0x011a, B:59:0x012a, B:61:0x013a, B:67:0x0160, B:69:0x0177, B:71:0x017f, B:72:0x0189, B:75:0x01a1, B:80:0x01af, B:84:0x01c2, B:93:0x0158, B:101:0x00bd, B:103:0x0065, B:105:0x006f, B:107:0x0075, B:110:0x007e, B:111:0x0083, B:112:0x0087, B:114:0x008d, B:117:0x0095, B:125:0x0081, B:127:0x004a, B:129:0x0052, B:131:0x0058, B:87:0x0146, B:90:0x0150), top: B:4:0x0010, inners: #1, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0160 A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #2 {all -> 0x0038, blocks: (B:5:0x0010, B:12:0x001b, B:14:0x0021, B:17:0x002b, B:19:0x0031, B:22:0x003c, B:24:0x0044, B:26:0x005e, B:29:0x009f, B:31:0x00ab, B:33:0x00b1, B:36:0x00ba, B:37:0x00bf, B:38:0x00c3, B:40:0x00c9, B:99:0x00d1, B:45:0x00d9, B:48:0x00e0, B:55:0x00e8, B:56:0x011a, B:59:0x012a, B:61:0x013a, B:67:0x0160, B:69:0x0177, B:71:0x017f, B:72:0x0189, B:75:0x01a1, B:80:0x01af, B:84:0x01c2, B:93:0x0158, B:101:0x00bd, B:103:0x0065, B:105:0x006f, B:107:0x0075, B:110:0x007e, B:111:0x0083, B:112:0x0087, B:114:0x008d, B:117:0x0095, B:125:0x0081, B:127:0x004a, B:129:0x0052, B:131:0x0058, B:87:0x0146, B:90:0x0150), top: B:4:0x0010, inners: #1, #6 }] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.Currency] */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.Currency] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(String eventName, Double d2, Bundle bundle, boolean z, UUID uuid, A a2) {
        A a3;
        boolean b;
        boolean contains;
        List<String> list;
        Iterator<String> it;
        Double d3;
        List<String> list2;
        String string;
        if (com.facebook.internal.instrument.crashshield.a.b(this) || eventName == null) {
            return;
        }
        try {
            if (eventName.length() == 0) {
                return;
            }
            if (!z) {
                if (com.facebook.appevents.internal.k.c()) {
                    if (!Intrinsics.areEqual(eventName, "fb_mobile_purchase")) {
                        if (!Intrinsics.areEqual(eventName, "Subscribe")) {
                            if (Intrinsics.areEqual(eventName, "StartTrial")) {
                            }
                        }
                    }
                    if ((C0715k.b(C0715k.b.AndroidManualImplicitPurchaseDedupe) && Intrinsics.areEqual(eventName, "fb_mobile_purchase")) || (C0715k.b(C0715k.b.AndroidManualImplicitSubsDedupe) && (Intrinsics.areEqual(eventName, "Subscribe") || Intrinsics.areEqual(eventName, "StartTrial")))) {
                        List<String> list3 = com.facebook.appevents.iap.p.a;
                        ?? r1 = 0;
                        if (d2 != null) {
                            d3 = d2;
                        } else {
                            com.facebook.internal.n b2 = com.facebook.internal.p.b(com.facebook.w.b());
                            if ((b2 != null ? b2.w : null) != null && !b2.w.isEmpty()) {
                                list = b2.w;
                                it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        d3 = null;
                                        break;
                                    }
                                    String next = it.next();
                                    if (bundle != null) {
                                        try {
                                            d3 = Double.valueOf(bundle.getDouble(next));
                                            break;
                                        } catch (Exception unused) {
                                            continue;
                                        }
                                    }
                                }
                            }
                            list = com.facebook.appevents.iap.p.b;
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                }
                            }
                        }
                        List<String> list4 = com.facebook.appevents.iap.p.a;
                        com.facebook.internal.n b3 = com.facebook.internal.p.b(com.facebook.w.b());
                        if ((b3 != null ? b3.v : null) != null && !b3.v.isEmpty()) {
                            list2 = b3.v;
                            for (String str : list2) {
                                if (bundle != null) {
                                    try {
                                        string = bundle.getString(str);
                                    } catch (Exception unused2) {
                                        continue;
                                    }
                                } else {
                                    string = r1;
                                }
                                if (string != null && string.length() != 0) {
                                    r1 = Currency.getInstance(string);
                                    break;
                                }
                            }
                            if (d3 != null && r1 != 0) {
                                Pair a4 = com.facebook.appevents.iap.p.a(com.facebook.appevents.iap.s.c(CollectionsKt.listOf(new com.facebook.appevents.iap.a(eventName, d3.doubleValue(), r1)), System.currentTimeMillis(), false, CollectionsKt.listOf(new Pair(bundle, a2))), bundle, a2);
                                Bundle bundle2 = (Bundle) a4.component1();
                                a3 = (A) a4.component2();
                                bundle = bundle2;
                                b = com.facebook.internal.m.b("app_events_killswitch", com.facebook.w.b(), false);
                                com.facebook.G g2 = com.facebook.G.d;
                                if (b) {
                                    com.facebook.internal.u.Companion.getClass();
                                    u.a.b(g2, "AppEvents", "KillSwitch is enabled and fail to log app event: %s", eventName);
                                    return;
                                }
                                com.facebook.appevents.integrity.b bVar = com.facebook.appevents.integrity.b.a;
                                if (!com.facebook.internal.instrument.crashshield.a.b(com.facebook.appevents.integrity.b.class)) {
                                    try {
                                        Intrinsics.checkNotNullParameter(eventName, "eventName");
                                    } catch (Throwable th) {
                                        com.facebook.internal.instrument.crashshield.a.a(th, com.facebook.appevents.integrity.b.class);
                                    }
                                    if (com.facebook.appevents.integrity.b.b) {
                                        contains = com.facebook.appevents.integrity.b.c.contains(eventName);
                                        if (contains) {
                                            a aVar = Companion;
                                            aVar.getClass();
                                            Pair b4 = a.b(bundle, a3, z);
                                            Bundle bundle3 = (Bundle) b4.component1();
                                            A a5 = (A) b4.component2();
                                            try {
                                                if (!com.facebook.appevents.integrity.e.a.c(bundle3)) {
                                                    com.facebook.appevents.integrity.g.b(bundle3, eventName);
                                                }
                                                com.facebook.appevents.integrity.a.a(bundle3);
                                                com.facebook.appevents.integrity.d.e(bundle3, eventName);
                                                com.facebook.appevents.integrity.h.c(bundle3);
                                                com.facebook.appevents.integrity.e.b(bundle3);
                                                com.facebook.appevents.integrity.i.f(bundle3, eventName);
                                                a.a(aVar, new C0692d(this.a, eventName, d2, bundle3, z, com.facebook.appevents.internal.f.l == 0, uuid, a5), this.b);
                                                return;
                                            } catch (C0728q e2) {
                                                u.a aVar2 = com.facebook.internal.u.Companion;
                                                Object[] objArr = {e2.toString()};
                                                aVar2.getClass();
                                                u.a.b(g2, "AppEvents", "Invalid app event: %s", objArr);
                                                return;
                                            } catch (JSONException e3) {
                                                u.a aVar3 = com.facebook.internal.u.Companion;
                                                Object[] objArr2 = {e3.toString()};
                                                aVar3.getClass();
                                                u.a.b(g2, "AppEvents", "JSON encoding for app event failed: '%s'", objArr2);
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                }
                                contains = false;
                                if (contains) {
                                }
                            }
                        }
                        list2 = com.facebook.appevents.iap.p.a;
                        while (r4.hasNext()) {
                        }
                        if (d3 != null) {
                            Pair a42 = com.facebook.appevents.iap.p.a(com.facebook.appevents.iap.s.c(CollectionsKt.listOf(new com.facebook.appevents.iap.a(eventName, d3.doubleValue(), r1)), System.currentTimeMillis(), false, CollectionsKt.listOf(new Pair(bundle, a2))), bundle, a2);
                            Bundle bundle22 = (Bundle) a42.component1();
                            a3 = (A) a42.component2();
                            bundle = bundle22;
                            b = com.facebook.internal.m.b("app_events_killswitch", com.facebook.w.b(), false);
                            com.facebook.G g22 = com.facebook.G.d;
                            if (b) {
                            }
                        }
                    }
                }
            }
            a3 = a2;
            b = com.facebook.internal.m.b("app_events_killswitch", com.facebook.w.b(), false);
            com.facebook.G g222 = com.facebook.G.d;
            if (b) {
            }
        } catch (Throwable th2) {
            com.facebook.internal.instrument.crashshield.a.a(th2, this);
        }
    }

    public final void h(Bundle bundle, String str) {
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            try {
                g(this, str, null, bundle, true, com.facebook.appevents.internal.f.b());
            } catch (Throwable th) {
                th = th;
                com.facebook.internal.instrument.crashshield.a.a(th, this);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final void i(BigDecimal bigDecimal, Currency currency, Bundle bundle, boolean z, A a2) {
        Throwable th;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        if (currency == null) {
            try {
                Companion.getClass();
                u.a aVar = com.facebook.internal.u.Companion;
                com.facebook.G g2 = com.facebook.G.e;
                aVar.getClass();
                u.a.a(g2, "AppEvents", "currency cannot be null");
                return;
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            try {
                bundle.putString("fb_currency", currency.getCurrencyCode());
                try {
                    f("fb_mobile_purchase", Double.valueOf(bigDecimal.doubleValue()), bundle, z, com.facebook.appevents.internal.f.b(), a2);
                    Companion.getClass();
                    if (a.c() != l.b.b) {
                        j.c(w.d);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    com.facebook.internal.instrument.crashshield.a.a(th, this);
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        com.facebook.internal.instrument.crashshield.a.a(th, this);
    }

    public final void j(Bundle payload, String str) {
        String str2;
        String string;
        if (com.facebook.internal.instrument.crashshield.a.b(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(payload, "payload");
            try {
                string = payload.getString("fb_push_payload");
            } catch (JSONException unused) {
                str2 = null;
            }
            if (com.facebook.internal.E.z(string)) {
                return;
            }
            str2 = new JSONObject(string).getString("campaign");
            if (str2 == null) {
                u.a aVar = com.facebook.internal.u.Companion;
                com.facebook.G g2 = com.facebook.G.e;
                String str3 = c;
                aVar.getClass();
                u.a.a(g2, str3, "Malformed payload specified for logging a push notification open.");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("fb_push_campaign", str2);
            if (str != null) {
                bundle.putString("fb_push_action", str);
            }
            e("fb_mobile_push_opened", bundle);
        } catch (Throwable th) {
            com.facebook.internal.instrument.crashshield.a.a(th, this);
        }
    }

    public p(Context context, String str) {
        this(com.facebook.internal.E.k(context), str);
    }
}
