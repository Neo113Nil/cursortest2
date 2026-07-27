package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.NetworkUnreachable;
import com.vungle.ads.internal.model.j3;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.privacy.PrivacyManager;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;

@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/ConfigManager;", "", "", "getAdsEndpoint", "getConfigExtension", "<init>", "()V", "com/vungle/ads/internal/q0", "Lcom/vungle/ads/internal/network/VungleApiClient;", "vungleApiClient", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes7.dex */
public final class ConfigManager {

    /* renamed from: a, reason: collision with root package name */
    public static volatile com.vungle.ads.internal.model.w2 f11882a;
    public static volatile Map b;
    public static volatile com.vungle.ads.internal.model.i2 c;
    public static volatile List d;
    public static volatile String e;
    public static Map f;
    public static String h;
    public static final ConfigManager INSTANCE = new ConfigManager();
    public static final Lazy g = LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) u0.f12142a);

    private ConfigManager() {
    }

    public static void b(String applicationId) {
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        h = applicationId;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000b, code lost:
    
        r1 = com.vungle.ads.internal.ServiceLocator.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c() {
        ServiceLocator serviceLocator;
        final Map map = b;
        if (map == null || map.isEmpty() || serviceLocator == null) {
            return;
        }
        final com.vungle.ads.internal.downloader.t tVar = (com.vungle.ads.internal.downloader.t) serviceLocator.getService(com.vungle.ads.internal.downloader.t.class);
        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) serviceLocator.getService(com.vungle.ads.internal.executor.a.class))).f11913a.execute(new Runnable() { // from class: com.vungle.ads.internal.ConfigManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                ConfigManager.a(map, tVar);
            }
        });
    }

    public static boolean d() {
        Boolean bool;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (bool = w2Var.n) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static String e() {
        com.vungle.ads.internal.model.i2 i2Var = c;
        String str = null;
        String str2 = i2Var != null ? i2Var.e : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.f11883a : str;
    }

    public static int f() {
        com.vungle.ads.internal.model.b2 b2Var;
        Integer num;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (b2Var = w2Var.f12025a) == null || (num = b2Var.b) == null) {
            return 3;
        }
        return num.intValue();
    }

    public static long g() {
        com.vungle.ads.internal.model.b2 b2Var;
        Long l;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (b2Var = w2Var.f12025a) == null || (l = b2Var.f11955a) == null) {
            return 1048576000L;
        }
        long j = 1024;
        return l.longValue() * j * j;
    }

    public static String h() {
        com.vungle.ads.internal.model.i2 i2Var = c;
        String str = null;
        String str2 = i2Var != null ? i2Var.c : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.b : str;
    }

    public static String i() {
        com.vungle.ads.internal.model.v2 v2Var;
        com.vungle.ads.internal.model.l2 l2Var;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (v2Var = w2Var.f) == null || (l2Var = v2Var.f12022a) == null) {
            return null;
        }
        return l2Var.e;
    }

    public static String j() {
        com.vungle.ads.internal.model.v2 v2Var;
        com.vungle.ads.internal.model.l2 l2Var;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (v2Var = w2Var.f) == null || (l2Var = v2Var.f12022a) == null) {
            return null;
        }
        return l2Var.f;
    }

    public static String k() {
        com.vungle.ads.internal.model.v2 v2Var;
        com.vungle.ads.internal.model.l2 l2Var;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (v2Var = w2Var.f) == null || (l2Var = v2Var.f12022a) == null) {
            return null;
        }
        return l2Var.c;
    }

    public static String l() {
        com.vungle.ads.internal.model.v2 v2Var;
        com.vungle.ads.internal.model.l2 l2Var;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (v2Var = w2Var.f) == null || (l2Var = v2Var.f12022a) == null) {
            return null;
        }
        return l2Var.b;
    }

    public static boolean m() {
        com.vungle.ads.internal.model.v2 v2Var;
        com.vungle.ads.internal.model.l2 l2Var;
        Boolean bool;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (v2Var = w2Var.f) == null || (l2Var = v2Var.f12022a) == null || (bool = l2Var.f11989a) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static String n() {
        com.vungle.ads.internal.model.i2 i2Var = c;
        String str = null;
        String str2 = i2Var != null ? i2Var.d : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.c : str;
    }

    public static String o() {
        com.vungle.ads.internal.model.i2 i2Var = c;
        if (i2Var != null) {
            return i2Var.b;
        }
        return null;
    }

    public static com.vungle.ads.internal.model.o2 p() {
        com.vungle.ads.internal.model.v2 v2Var;
        com.vungle.ads.internal.model.p2 p2Var;
        LinkedHashMap linkedHashMap = com.vungle.ads.internal.model.o2.b;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        return (com.vungle.ads.internal.model.o2) com.vungle.ads.internal.model.o2.b.get((w2Var == null || (v2Var = w2Var.f) == null || (p2Var = v2Var.b) == null) ? null : p2Var.f12001a);
    }

    public static boolean q() {
        Boolean bool;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (bool = w2Var.s) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean r() {
        Boolean bool;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (bool = w2Var.r) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public static boolean s() {
        Boolean bool;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (bool = w2Var.o) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean t() {
        Boolean bool;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (bool = w2Var.m) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public final String getAdsEndpoint() {
        com.vungle.ads.internal.model.i2 i2Var = c;
        String str = null;
        String str2 = i2Var != null ? i2Var.f11979a : null;
        if (str2 != null && str2.length() != 0) {
            str = str2;
        }
        return str == null ? Constants.DEFAULT_ADS_ENDPOINT : str;
    }

    public final String getConfigExtension() {
        String str = e;
        return str == null ? "" : str;
    }

    public static long b() {
        Long l;
        com.vungle.ads.internal.model.w2 w2Var = f11882a;
        if (w2Var == null || (l = w2Var.p) == null) {
            return -1L;
        }
        return l.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074 A[Catch: all -> 0x007f, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:5:0x000b, B:10:0x0013, B:16:0x0041, B:22:0x0052, B:25:0x0058, B:27:0x005c, B:28:0x0060, B:31:0x006b, B:33:0x006f, B:34:0x0065, B:37:0x0074, B:40:0x0027, B:42:0x002b, B:45:0x0034), top: B:4:0x000b, outer: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Context context, com.vungle.ads.internal.model.w2 w2Var, q0 source, k2 k2Var) {
        Long l;
        char c2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            synchronized (this) {
                ServiceLocator a2 = s1.a();
                if (a2 == null) {
                    return;
                }
                FilePreferences filePreferences = (FilePreferences) a2.getService(FilePreferences.class);
                INSTANCE.getClass();
                if (w2Var != null && (l = w2Var.p) != null && l.longValue() != -1) {
                    c2 = w2Var.c == null ? (char) 1 : (char) 2;
                    if (c2 != 0) {
                        boolean z = com.vungle.ads.internal.util.u.f12190a;
                        com.vungle.ads.internal.util.t.b("ConfigManager", "Config is not available.");
                        return;
                    }
                    if (c2 != 1) {
                        Map a3 = a(context, w2Var, source, k2Var, a2, filePreferences);
                        Unit unit = Unit.INSTANCE;
                        if (a3 != null) {
                            a(a3);
                            return;
                        }
                        return;
                    }
                    if (source != q0.INIT_CACHED && w2Var != null) {
                        Long l2 = w2Var.p;
                        long longValue = l2 != null ? l2.longValue() : -1L;
                        com.vungle.ads.internal.model.w2 w2Var2 = f11882a;
                        if (w2Var2 != null) {
                            w2Var2.p = Long.valueOf(longValue);
                        }
                        com.vungle.ads.internal.model.w2 w2Var3 = f11882a;
                        if (w2Var3 != null) {
                            a(w2Var3, filePreferences);
                        }
                    }
                    return;
                }
                c2 = 0;
                if (c2 != 0) {
                }
            }
        } catch (Exception e2) {
            boolean z2 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("ConfigManager", com.iab.omid.library.vungle.internal.l.a("Error while validating config: ").append(e2.getMessage()).toString());
        }
    }

    public static void a(final Map map) {
        ServiceLocator serviceLocator;
        serviceLocator = ServiceLocator.INSTANCE;
        if (serviceLocator == null) {
            return;
        }
        final com.vungle.ads.internal.downloader.t tVar = (com.vungle.ads.internal.downloader.t) serviceLocator.getService(com.vungle.ads.internal.downloader.t.class);
        ((com.vungle.ads.internal.executor.d) ((com.vungle.ads.internal.executor.a) serviceLocator.getService(com.vungle.ads.internal.executor.a.class))).f11913a.execute(new Runnable() { // from class: com.vungle.ads.internal.ConfigManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ConfigManager.a(com.vungle.ads.internal.downloader.t.this, map);
            }
        });
    }

    public static Map a(Context context, com.vungle.ads.internal.model.w2 w2Var, q0 q0Var, k2 k2Var, ServiceLocator serviceLocator, FilePreferences filePreferences) {
        Boolean bool;
        FilePreferences filePreferences2;
        com.vungle.ads.internal.model.s2 s2Var;
        Boolean bool2;
        com.vungle.ads.internal.model.s2 s2Var2;
        Integer num;
        f11882a = w2Var;
        if (q0Var != q0.AD_RESPONSE) {
            b = w2Var != null ? w2Var.e() : null;
        }
        c = w2Var != null ? w2Var.c() : null;
        d = w2Var != null ? w2Var.d() : null;
        VungleApiClient vungleApiClient = (VungleApiClient) serviceLocator.getService(VungleApiClient.class);
        com.vungle.ads.internal.executor.a aVar = (com.vungle.ads.internal.executor.a) serviceLocator.getService(com.vungle.ads.internal.executor.a.class);
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        com.vungle.ads.internal.executor.j e2 = ((com.vungle.ads.internal.executor.d) aVar).e();
        com.vungle.ads.internal.model.w2 w2Var2 = f11882a;
        boolean z = true;
        int intValue = (w2Var2 == null || (s2Var2 = w2Var2.d) == null || (num = s2Var2.f12012a) == null) ? 1 : num.intValue();
        com.vungle.ads.internal.model.w2 w2Var3 = f11882a;
        analyticsClient.a(vungleApiClient, e2, intValue, (w2Var3 == null || (s2Var = w2Var3.d) == null || (bool2 = s2Var.b) == null) ? false : bool2.booleanValue());
        if (q0Var != q0.INIT_CACHED && w2Var != null) {
            a(w2Var, filePreferences);
            String ext = w2Var.a();
            if (ext != null) {
                ConfigManager configManager = INSTANCE;
                configManager.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(ext, "ext");
                synchronized (configManager) {
                    e = ext;
                    Unit unit = Unit.INSTANCE;
                }
                ServiceLocator a2 = s1.a();
                if (a2 != null && (filePreferences2 = (FilePreferences) a2.getService(FilePreferences.class)) != null) {
                    filePreferences2.a("config_extension", ext).b();
                }
            }
        }
        if (k2Var != null) {
            AnalyticsClient.a(analyticsClient, k2Var, (com.vungle.ads.internal.util.s) null, 6);
        }
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        com.vungle.ads.internal.model.w2 w2Var4 = f11882a;
        if (w2Var4 != null && (bool = w2Var4.h) != null) {
            z = bool.booleanValue();
        }
        privacyManager.getClass();
        PrivacyManager.a(z);
        Map e3 = w2Var != null ? w2Var.e() : null;
        if (e3 == null || e3.isEmpty() || Intrinsics.areEqual(e3, f)) {
            return null;
        }
        f = e3;
        return e3;
    }

    public static final void a(Map map, com.vungle.ads.internal.downloader.t capturedTdm) {
        Intrinsics.checkNotNullParameter(capturedTdm, "$capturedTdm");
        Set<String> keySet = map.keySet();
        ArrayList arrayList = new ArrayList();
        for (String str : keySet) {
            capturedTdm.getClass();
            String a2 = com.vungle.ads.internal.downloader.t.a(str);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        capturedTdm.a(CollectionsKt.toSet(arrayList));
        capturedTdm.a(map);
    }

    public static final void a(com.vungle.ads.internal.downloader.t capturedTdm, Map templates) {
        Intrinsics.checkNotNullParameter(capturedTdm, "$capturedTdm");
        Intrinsics.checkNotNullParameter(templates, "$templates");
        capturedTdm.b(templates);
    }

    public static j3 a(String str) {
        List list = d;
        Object obj = null;
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((j3) next).b(), str)) {
                obj = next;
                break;
            }
        }
        return (j3) obj;
    }

    public static com.vungle.ads.internal.model.w2 a(FilePreferences filePreferences, String appId) {
        Long a2;
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        Intrinsics.checkNotNullParameter(appId, "appId");
        try {
            String string = filePreferences.getString("config_app_id");
            if (string != null && string.length() != 0 && StringsKt.equals(string, appId, true)) {
                String string2 = filePreferences.getString("config_response");
                if (string2 == null) {
                    return null;
                }
                long a3 = filePreferences.a("config_update_time", 0L);
                INSTANCE.getClass();
                Json json = (Json) g.getValue();
                KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(com.vungle.ads.internal.model.w2.class));
                Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                com.vungle.ads.internal.model.w2 w2Var = (com.vungle.ads.internal.model.w2) json.decodeFromString(serializer, string2);
                com.vungle.ads.internal.model.f2 b2 = w2Var.b();
                if (((b2 == null || (a2 = b2.a()) == null) ? -1L : a2.longValue()) + a3 < System.currentTimeMillis()) {
                    boolean z = com.vungle.ads.internal.util.u.f12190a;
                    com.vungle.ads.internal.util.t.c("ConfigManager", "cache config expired. re-config");
                    return null;
                }
                boolean z2 = com.vungle.ads.internal.util.u.f12190a;
                com.vungle.ads.internal.util.t.c("ConfigManager", "use cache config.");
                return w2Var;
            }
            boolean z3 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.c("ConfigManager", "app id mismatch, re-config");
            return null;
        } catch (Exception e2) {
            boolean z4 = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("ConfigManager", com.iab.omid.library.vungle.internal.l.a("Error while parsing cached config: ").append(e2.getMessage()).toString());
            return null;
        }
    }

    public static void a(com.vungle.ads.internal.model.w2 config, FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        try {
            String str = h;
            if (str == null) {
                Intrinsics.throwUninitializedPropertyAccessException("applicationId");
                str = null;
            }
            filePreferences.a("config_app_id", str);
            filePreferences.b("config_update_time", System.currentTimeMillis());
            Json json = (Json) g.getValue();
            KSerializer<Object> serializer = SerializersKt.serializer(json.getSerializersModule(), Reflection.typeOf(com.vungle.ads.internal.model.w2.class));
            Intrinsics.checkNotNull(serializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            filePreferences.a("config_response", json.encodeToString(serializer, config));
            filePreferences.b();
        } catch (Exception e2) {
            boolean z = com.vungle.ads.internal.util.u.f12190a;
            com.vungle.ads.internal.util.t.b("ConfigManager", com.iab.omid.library.vungle.internal.l.a("Exception: ").append(e2.getMessage()).append(" for updating cached config").toString());
        }
    }

    public final void a() {
        synchronized (this) {
            c = null;
            d = null;
            f11882a = null;
            b = null;
            e = null;
            f = null;
            Unit unit = Unit.INSTANCE;
        }
    }

    public static void a(Context context, p2 onComplete) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(onComplete, "onComplete");
        try {
            com.vungle.ads.internal.network.m a2 = ((VungleApiClient) LazyKt.lazy(LazyThreadSafetyMode.SYNCHRONIZED, (Function0) new r0(context)).getValue()).a();
            if (a2 != null) {
                a2.a(new s0(context, onComplete));
            }
        } catch (Throwable th) {
            if (th instanceof UnknownHostException ? true : th instanceof SecurityException) {
                new NetworkUnreachable(com.iab.omid.library.vungle.internal.l.a("Config unknown: ").append(th.getMessage()).toString()).logErrorNoReturnValue$vungle_ads_release();
            } else {
                new NetworkUnreachable(com.iab.omid.library.vungle.internal.l.a("Config: ").append(th.getMessage()).toString()).logErrorNoReturnValue$vungle_ads_release();
            }
            onComplete.invoke(Boolean.FALSE);
        }
    }
}
