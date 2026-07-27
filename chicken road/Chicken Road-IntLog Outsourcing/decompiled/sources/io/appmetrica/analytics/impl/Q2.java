package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import g4.AbstractC0465j;
import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.ModuleEvent;
import io.appmetrica.analytics.Revenue;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.plugins.IPluginReporter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import io.appmetrica.analytics.profile.UserProfile;
import io.appmetrica.analytics.profile.UserProfileUpdate;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class Q2 implements Ka {

    /* renamed from: n, reason: collision with root package name */
    public static final HashSet f7297n = new HashSet(Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final O2 f7298o = new O2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f7299a;

    /* renamed from: b, reason: collision with root package name */
    protected final Kh f7300b;

    /* renamed from: c, reason: collision with root package name */
    protected final PublicLogger f7301c;

    /* renamed from: d, reason: collision with root package name */
    protected final Tn f7302d;

    /* renamed from: e, reason: collision with root package name */
    protected final Jg f7303e;

    /* renamed from: f, reason: collision with root package name */
    protected final C6 f7304f;

    /* renamed from: g, reason: collision with root package name */
    public final C0578d0 f7305g;

    /* renamed from: h, reason: collision with root package name */
    protected final Bi f7306h;

    /* renamed from: i, reason: collision with root package name */
    public C1054vb f7307i;

    /* renamed from: j, reason: collision with root package name */
    public final Hf f7308j;

    /* renamed from: k, reason: collision with root package name */
    public final T9 f7309k;

    /* renamed from: l, reason: collision with root package name */
    public final Oe f7310l;

    /* renamed from: m, reason: collision with root package name */
    public final C0729in f7311m;

    public Q2(Context context, Bi bi, Kh kh, T9 t9, C1126y6 c1126y6, Tn tn, Jg jg, C6 c6, C0578d0 c0578d0, Oe oe) {
        Context applicationContext = context.getApplicationContext();
        this.f7299a = applicationContext;
        this.f7306h = bi;
        this.f7300b = kh;
        this.f7309k = t9;
        this.f7302d = tn;
        this.f7303e = jg;
        this.f7304f = c6;
        this.f7305g = c0578d0;
        this.f7310l = oe;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.b().getApiKey());
        this.f7301c = orCreatePublicLogger;
        if (AbstractC0658g3.a(kh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f7308j = c1126y6;
        this.f7311m = new C0729in(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f7301c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f7301c.info("Put error environment pair <%s, %s>", str, str2);
        Kh kh = this.f7300b;
        synchronized (kh) {
            I8 i8 = kh.f7037c;
            i8.f6940b.b(i8.f6939a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC0860no.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f7301c.info("Clear app environment", new Object[0]);
        Bi bi = this.f7306h;
        Kh kh = this.f7300b;
        bi.getClass();
        W5 n6 = U3.n();
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str = kh.f7040f;
        }
        bi.a(new Ah(n6, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
    }

    public final void d(String str) {
        if (this.f7300b.f()) {
            return;
        }
        this.f7306h.f6608d.c();
        C1054vb c1054vb = this.f7307i;
        c1054vb.f9461a.removeCallbacks(c1054vb.f9463c, c1054vb.f9462b.f7300b.f7239b.getApiKey());
        this.f7300b.f7039e = true;
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", str, 3, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    public final void e(String str) {
        this.f7306h.f6608d.b();
        C1054vb c1054vb = this.f7307i;
        C1054vb.a(c1054vb.f9461a, c1054vb.f9462b, c1054vb.f9463c);
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", str, 6400, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7300b.f7039e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final IPluginReporter getPluginExtension() {
        return this;
    }

    public String j() {
        return "[BaseReporter]";
    }

    public void k() {
        String str;
        C1058vf c1058vf;
        Bi bi = this.f7306h;
        Kh kh = this.f7300b;
        bi.getClass();
        C1160zf c1160zf = kh.f7038d;
        synchronized (kh) {
            str = kh.f7040f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.f7239b.getApiKey());
        Set set = D9.f6670a;
        JSONObject jSONObject = new JSONObject();
        if (c1160zf != null && (c1058vf = c1160zf.f9647a) != null) {
            try {
                jSONObject.put("preloadInfo", c1058vf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        u32.c(str);
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f7301c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f7301c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f7301c.info("Put app environment: <%s, %s>", str, str2);
        Bi bi = this.f7306h;
        Kh kh = this.f7300b;
        bi.getClass();
        W5 b6 = U3.b(str, str2);
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str3 = kh.f7040f;
        }
        bi.a(new Ah(b6, false, 1, null, new Kh(gf, counterConfiguration, i8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0603e0 c0603e0 = new C0603e0(new C0629f0(this, map));
        C0975sa c0975sa = new C0975sa();
        C1126y6 c1126y6 = C0736j4.l().f8482a;
        Thread a6 = c0603e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0603e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a6.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C1143yn c1143yn = (C1143yn) c0975sa.apply(a6, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            map2 = c0603e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a6 && thread != null) {
                arrayList.add((C1143yn) c0975sa.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c1143yn, arrayList, c1126y6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f7301c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Bi bi = this.f7306h;
        Kh kh = this.f7300b;
        bi.getClass();
        for (Ii ii : eCommerceEvent.toProto()) {
            U3 u32 = new U3(LoggerStorage.getOrCreatePublicLogger(kh.f7239b.getApiKey()));
            EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
            u32.f7651d = 41000;
            u32.f7649b = u32.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ii.f6960a)));
            u32.f7654g = ii.f6961b.getBytesTruncated();
            Gf gf = new Gf(kh.f7238a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
            I8 i8 = kh.f7037c;
            synchronized (kh) {
                str = kh.f7040f;
            }
            bi.a(new Ah(u32, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Ig ig = new Ig(str, a(th));
        Bi bi = this.f7306h;
        byte[] byteArray = MessageNano.toByteArray(this.f7303e.fromModel(ig));
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str, 5892, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7301c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f7301c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", str, 1, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Si si = P2.f7237a;
        si.getClass();
        C0989so a6 = si.a(revenue);
        if (!a6.f9268a) {
            this.f7301c.warning("Passed revenue is not valid. Reason: " + a6.f9269b, new Object[0]);
            return;
        }
        Bi bi = this.f7306h;
        Ti ti = new Ti(revenue, this.f7301c);
        Kh kh = this.f7300b;
        bi.getClass();
        U3 a7 = U3.a(LoggerStorage.getOrCreatePublicLogger(kh.f7239b.getApiKey()), ti);
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str = kh.f7040f;
        }
        bi.a(new Ah(a7, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f7301c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Sn a6 = Vn.a(th, new V(null, null, this.f7308j.a()), null, (String) this.f7309k.f7524b.a(), (Boolean) this.f7309k.f7525c.a());
        Bi bi = this.f7306h;
        bi.a(bi.a(a6, this.f7300b));
        this.f7301c.info("Unhandled exception received: " + a6, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        C0653fo c0653fo = new C0653fo(C0653fo.f8208c);
        Iterator<UserProfileUpdate<? extends InterfaceC0679go>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0679go userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Hd) userProfileUpdatePatcher).f6879e = this.f7301c;
            userProfileUpdatePatcher.a(c0653fo);
        }
        C0782ko c0782ko = new C0782ko();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < c0653fo.f8209a.size(); i2++) {
            SparseArray sparseArray = c0653fo.f8209a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i2))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0705ho) it2.next());
            }
        }
        c0782ko.f8648a = (C0705ho[]) arrayList.toArray(new C0705ho[arrayList.size()]);
        C0989so a6 = f7298o.a(c0782ko);
        if (!a6.f9268a) {
            this.f7301c.warning("UserInfo wasn't sent because " + a6.f9269b, new Object[0]);
            return;
        }
        Bi bi = this.f7306h;
        Kh kh = this.f7300b;
        bi.getClass();
        W5 a7 = U3.a(c0782ko);
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str = kh.f7040f;
        }
        bi.a(new Ah(a7, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f7301c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f7301c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f7301c.info("Send event buffer", new Object[0]);
        Bi bi = this.f7306h;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        U3 u32 = new U3("", "", 256, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z) {
        this.f7300b.f7239b.setDataSendingEnabled(z);
        this.f7301c.info("Updated data sending enabled: %s", Boolean.valueOf(z));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        u32.f7663p = Collections.singletonMap(str, bArr);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Bi bi = this.f7306h;
        Kh kh = this.f7300b;
        bi.getClass();
        U3 u32 = new U3(LoggerStorage.getOrCreatePublicLogger(kh.f7239b.getApiKey()));
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        u32.f7651d = 40962;
        u32.c(str);
        u32.f7649b = u32.e(str);
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str2 = kh.f7040f;
        }
        bi.a(new Ah(u32, false, 1, null, new Kh(gf, counterConfiguration, i8, str2)));
        this.f7301c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z) {
        String str;
        Bi bi = this.f7306h;
        E e3 = new E(adRevenue, z, this.f7311m, this.f7301c);
        Kh kh = this.f7300b;
        bi.getClass();
        U3 a6 = U3.a(LoggerStorage.getOrCreatePublicLogger(kh.f7239b.getApiKey()), e3);
        Gf gf = new Gf(kh.f7238a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f7239b);
        I8 i8 = kh.f7037c;
        synchronized (kh) {
            str = kh.f7040f;
        }
        bi.a(new Ah(a6, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f7301c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0847nb.b(adRevenue.payload) + ", autoCollected=" + z + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(String str, String str2) {
        this.f7301c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(str2, str, 1, 0, publicLogger);
        u32.f7659l = EnumC1000t9.JS;
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0860no.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2) {
        reportError(str, str2, (Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, String str2) {
        this.f7301c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(str2, str, 1, 0, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
    }

    public final Sn a(Throwable th) {
        Throwable th2;
        StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof W1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return Vn.a(th2, new V(null, null, this.f7308j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f7309k.f7524b.a(), (Boolean) this.f7309k.f7525c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        B6 b6 = new B6(new Ig(str2, a(th)), str);
        Bi bi = this.f7306h;
        byte[] byteArray = MessageNano.toByteArray(this.f7304f.fromModel(b6));
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7301c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Sn a6 = this.f7310l.a(pluginErrorDetails);
        Bi bi = this.f7306h;
        In in = a6.f7491a;
        String str = in != null ? (String) WrapUtils.getOrDefault(in.f6977a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f7302d.fromModel(a6));
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str, 5891, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7301c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(String str) {
        Bi bi = this.f7306h;
        W5 a6 = W5.a(str);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(a6, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final boolean b() {
        return this.f7300b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Bi bi = this.f7306h;
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        bi.a(new U3("", str, 1, 0, publicLogger), this.f7300b, 1, map);
        PublicLogger publicLogger2 = this.f7301c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0537bb
    public final void a(Sn sn) {
        Bi bi = this.f7306h;
        Ah a6 = bi.a(sn, this.f7300b);
        Kh kh = a6.f6534e;
        Tl tl = bi.f6609e;
        if (tl != null) {
            kh.f7239b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        bi.f6607c.b(a6);
        this.f7301c.info("Unhandled exception received: " + sn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Sn sn;
        Oe oe = this.f7310l;
        if (pluginErrorDetails != null) {
            sn = oe.a(pluginErrorDetails);
        } else {
            oe.getClass();
            sn = null;
        }
        Ig ig = new Ig(str, sn);
        Bi bi = this.f7306h;
        byte[] byteArray = MessageNano.toByteArray(this.f7303e.fromModel(ig));
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str, 5896, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7301c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0655g0
    public final void a(V v4) {
        C0552c0 c0552c0 = new C0552c0(v4, (String) this.f7309k.f7524b.a(), (Boolean) this.f7309k.f7525c.a());
        Bi bi = this.f7306h;
        byte[] byteArray = MessageNano.toByteArray(this.f7305g.fromModel(c0552c0));
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, "", 5968, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        String str = null;
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        PublicLogger publicLogger2 = this.f7301c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C1143yn c1143yn = v4.f7607a;
        if (c1143yn != null) {
            str = "Thread[name=" + c1143yn.f9605a + ",tid={" + c1143yn.f9607c + ", priority=" + c1143yn.f9606b + ", group=" + c1143yn.f9608d + "}] at " + AbstractC0465j.K0(c1143yn.f9610f, "\n", null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        EnumC1000t9 enumC1000t9;
        if (f7297n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i2 = J8.f7002a[moduleEvent.getCategory().ordinal()];
        if (i2 == 1) {
            enumC1000t9 = EnumC1000t9.NATIVE;
        } else if (i2 == 2) {
            enumC1000t9 = EnumC1000t9.SYSTEM;
        } else {
            throw new C1.b();
        }
        u32.f7659l = enumC1000t9;
        u32.f7650c = AbstractC0847nb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            u32.f7663p = moduleEvent.getExtras();
        }
        this.f7306h.a(u32, this.f7300b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Sn sn;
        Oe oe = this.f7310l;
        if (pluginErrorDetails != null) {
            sn = oe.a(pluginErrorDetails);
        } else {
            oe.getClass();
            sn = null;
        }
        B6 b6 = new B6(new Ig(str2, sn), str);
        Bi bi = this.f7306h;
        byte[] byteArray = MessageNano.toByteArray(this.f7304f.fromModel(b6));
        PublicLogger publicLogger = this.f7301c;
        Set set = D9.f6670a;
        EnumC0718ib enumC0718ib = EnumC0718ib.EVENT_TYPE_UNDEFINED;
        U3 u32 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh = this.f7300b;
        bi.getClass();
        bi.a(Bi.a(u32, kh), kh, 1, (Map) null);
        this.f7301c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
