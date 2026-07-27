package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import e2.AbstractC0292g;
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
    public static final HashSet f6439n = new HashSet(Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final O2 f6440o = new O2();

    /* renamed from: a, reason: collision with root package name */
    protected final Context f6441a;

    /* renamed from: b, reason: collision with root package name */
    protected final Kh f6442b;

    /* renamed from: c, reason: collision with root package name */
    protected final PublicLogger f6443c;

    /* renamed from: d, reason: collision with root package name */
    protected final Tn f6444d;

    /* renamed from: e, reason: collision with root package name */
    protected final Jg f6445e;
    protected final C6 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0429d0 f6446g;

    /* renamed from: h, reason: collision with root package name */
    protected final Bi f6447h;

    /* renamed from: i, reason: collision with root package name */
    public C0905vb f6448i;

    /* renamed from: j, reason: collision with root package name */
    public final Hf f6449j;

    /* renamed from: k, reason: collision with root package name */
    public final T9 f6450k;

    /* renamed from: l, reason: collision with root package name */
    public final Oe f6451l;

    /* renamed from: m, reason: collision with root package name */
    public final C0580in f6452m;

    public Q2(Context context, Bi bi, Kh kh, T9 t9, C0977y6 c0977y6, Tn tn, Jg jg, C6 c6, C0429d0 c0429d0, Oe oe) {
        Context applicationContext = context.getApplicationContext();
        this.f6441a = applicationContext;
        this.f6447h = bi;
        this.f6442b = kh;
        this.f6450k = t9;
        this.f6444d = tn;
        this.f6445e = jg;
        this.f = c6;
        this.f6446g = c0429d0;
        this.f6451l = oe;
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.b().getApiKey());
        this.f6443c = orCreatePublicLogger;
        if (AbstractC0509g3.a(kh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f6449j = c0977y6;
        this.f6452m = new C0580in(applicationContext);
    }

    public void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            this.f6443c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f6443c.info("Put error environment pair <%s, %s>", str, str2);
        Kh kh = this.f6442b;
        synchronized (kh) {
            I8 i8 = kh.f6184c;
            i8.f6091b.b(i8.f6090a, str, str2);
        }
    }

    public final void b(Map<String, String> map) {
        if (AbstractC0711no.a((Map) map)) {
            return;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        String str;
        this.f6443c.info("Clear app environment", new Object[0]);
        Bi bi = this.f6447h;
        Kh kh = this.f6442b;
        bi.getClass();
        W5 n3 = U3.n();
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(n3, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
    }

    public final void d(String str) {
        if (this.f6442b.f()) {
            return;
        }
        this.f6447h.f5775d.c();
        C0905vb c0905vb = this.f6448i;
        c0905vb.f8506a.removeCallbacks(c0905vb.f8508c, c0905vb.f8507b.f6442b.f6383b.getApiKey());
        this.f6442b.f6186e = true;
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", str, 3, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    public final void e(String str) {
        this.f6447h.f5775d.b();
        C0905vb c0905vb = this.f6448i;
        C0905vb.a(c0905vb.f8506a, c0905vb.f8507b, c0905vb.f8508c);
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", str, 6400, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6442b.f6186e = false;
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
        C0909vf c0909vf;
        Bi bi = this.f6447h;
        Kh kh = this.f6442b;
        bi.getClass();
        C1011zf c1011zf = kh.f6185d;
        synchronized (kh) {
            str = kh.f;
        }
        PublicLogger orCreatePublicLogger = LoggerStorage.getOrCreatePublicLogger(kh.f6383b.getApiKey());
        Set set = D9.f5834a;
        JSONObject jSONObject = new JSONObject();
        if (c1011zf != null && (c0909vf = c1011zf.f8685a) != null) {
            try {
                jSONObject.put("preloadInfo", c0909vf.c());
            } catch (Throwable unused) {
            }
        }
        String jSONObject2 = jSONObject.toString();
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        u3.c(str);
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f6443c.info("Pause session", new Object[0]);
        d(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            this.f6443c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f6443c.info("Put app environment: <%s, %s>", str, str2);
        Bi bi = this.f6447h;
        Kh kh = this.f6442b;
        bi.getClass();
        W5 b3 = U3.b(str, str2);
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str3 = kh.f;
        }
        bi.a(new Ah(b3, false, 1, null, new Kh(gf, counterConfiguration, i8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(Map<Thread, StackTraceElement[]> map) {
        StackTraceElement[] stackTraceElementArr;
        C0454e0 c0454e0 = new C0454e0(new C0480f0(this, map));
        C0826sa c0826sa = new C0826sa();
        C0977y6 c0977y6 = C0587j4.l().f7570a;
        Thread a3 = c0454e0.a();
        Map map2 = null;
        try {
            stackTraceElementArr = c0454e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a3.getStackTrace();
                } catch (SecurityException unused) {
                }
            }
        } catch (SecurityException unused2) {
            stackTraceElementArr = null;
        }
        C0994yn c0994yn = (C0994yn) c0826sa.apply(a3, stackTraceElementArr);
        ArrayList arrayList = new ArrayList();
        TreeMap treeMap = new TreeMap(new Dn());
        try {
            map2 = c0454e0.c();
        } catch (SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            Thread thread = (Thread) entry.getKey();
            if (thread != a3 && thread != null) {
                arrayList.add((C0994yn) c0826sa.apply(thread, (StackTraceElement[]) entry.getValue()));
            }
        }
        a(new V(c0994yn, arrayList, c0977y6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(ECommerceEvent eCommerceEvent) {
        String str;
        this.f6443c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new Object[0]);
        Bi bi = this.f6447h;
        Kh kh = this.f6442b;
        bi.getClass();
        for (Ii ii : eCommerceEvent.toProto()) {
            U3 u3 = new U3(LoggerStorage.getOrCreatePublicLogger(kh.f6383b.getApiKey()));
            EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
            u3.f6778d = 41000;
            u3.f6776b = u3.e(Base64Utils.compressBase64(MessageNano.toByteArray((MessageNano) ii.f6110a)));
            u3.f6780g = ii.f6111b.getBytesTruncated();
            Gf gf = new Gf(kh.f6382a);
            CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
            I8 i8 = kh.f6184c;
            synchronized (kh) {
                str = kh.f;
            }
            bi.a(new Ah(u3, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, Throwable th) {
        Ig ig = new Ig(str, a(th));
        Bi bi = this.f6447h;
        byte[] byteArray = MessageNano.toByteArray(this.f6445e.fromModel(ig));
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str, 5892, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6443c.info("Error received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str) {
        this.f6443c.info("Event received: " + WrapUtils.wrapToTag(str), new Object[0]);
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", str, 1, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(Revenue revenue) {
        String str;
        Si si = P2.f6381a;
        si.getClass();
        C0840so a3 = si.a(revenue);
        if (!a3.f8320a) {
            this.f6443c.warning("Passed revenue is not valid. Reason: " + a3.f8321b, new Object[0]);
            return;
        }
        Bi bi = this.f6447h;
        Ti ti = new Ti(revenue, this.f6443c);
        Kh kh = this.f6442b;
        bi.getClass();
        U3 a4 = U3.a(LoggerStorage.getOrCreatePublicLogger(kh.f6383b.getApiKey()), ti);
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(a4, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f6443c.info("Revenue received for productID: " + WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(Throwable th) {
        Sn a3 = Vn.a(th, new V(null, null, this.f6449j.a()), null, (String) this.f6450k.f6653b.a(), (Boolean) this.f6450k.f6654c.a());
        Bi bi = this.f6447h;
        bi.a(bi.a(a3, this.f6442b));
        this.f6443c.info("Unhandled exception received: " + a3, new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(UserProfile userProfile) {
        String str;
        C0504fo c0504fo = new C0504fo(C0504fo.f7312c);
        Iterator<UserProfileUpdate<? extends InterfaceC0530go>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            InterfaceC0530go userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            ((Hd) userProfileUpdatePatcher).f6032e = this.f6443c;
            userProfileUpdatePatcher.a(c0504fo);
        }
        C0633ko c0633ko = new C0633ko();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < c0504fo.f7313a.size(); i3++) {
            SparseArray sparseArray = c0504fo.f7313a;
            Iterator it2 = ((HashMap) sparseArray.get(sparseArray.keyAt(i3))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((C0556ho) it2.next());
            }
        }
        c0633ko.f7727a = (C0556ho[]) arrayList.toArray(new C0556ho[arrayList.size()]);
        C0840so a3 = f6440o.a(c0633ko);
        if (!a3.f8320a) {
            this.f6443c.warning("UserInfo wasn't sent because " + a3.f8321b, new Object[0]);
            return;
        }
        Bi bi = this.f6447h;
        Kh kh = this.f6442b;
        bi.getClass();
        W5 a4 = U3.a(c0633ko);
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(a4, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f6443c.info("User profile received", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        e(null);
        this.f6443c.info("Resume session", new Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f6443c.info("Send event buffer", new Object[0]);
        Bi bi = this.f6447h;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        U3 u3 = new U3("", "", 256, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z3) {
        this.f6442b.f6383b.setDataSendingEnabled(z3);
        this.f6443c.info("Updated data sending enabled: %s", Boolean.valueOf(z3));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(String str, byte[] bArr) {
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        u3.f6789p = Collections.singletonMap(str, bArr);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(String str) {
        String str2;
        Bi bi = this.f6447h;
        Kh kh = this.f6442b;
        bi.getClass();
        U3 u3 = new U3(LoggerStorage.getOrCreatePublicLogger(kh.f6383b.getApiKey()));
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        u3.f6778d = 40962;
        u3.c(str);
        u3.f6776b = u3.e(str);
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str2 = kh.f;
        }
        bi.a(new Ah(u3, false, 1, null, new Kh(gf, counterConfiguration, i8, str2)));
        this.f6443c.info("Set user profile ID: " + WrapUtils.wrapToTag(str), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(AdRevenue adRevenue, boolean z3) {
        String str;
        Bi bi = this.f6447h;
        E e3 = new E(adRevenue, z3, this.f6452m, this.f6443c);
        Kh kh = this.f6442b;
        bi.getClass();
        U3 a3 = U3.a(LoggerStorage.getOrCreatePublicLogger(kh.f6383b.getApiKey()), e3);
        Gf gf = new Gf(kh.f6382a);
        CounterConfiguration counterConfiguration = new CounterConfiguration(kh.f6383b);
        I8 i8 = kh.f6184c;
        synchronized (kh) {
            str = kh.f;
        }
        bi.a(new Ah(a3, false, 1, null, new Kh(gf, counterConfiguration, i8, str)));
        this.f6443c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + AbstractC0698nb.b(adRevenue.payload) + ", autoCollected=" + z3 + "}", new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(String str, String str2) {
        this.f6443c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(str2, str, 1, 0, publicLogger);
        u3.f6785l = EnumC0851t9.JS;
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
    }

    public final void a(Map<String, String> map) {
        if (AbstractC0711no.a((Map) map)) {
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
        this.f6443c.info("Event received: " + WrapUtils.wrapToTag(str) + ". With value: " + WrapUtils.wrapToTag(str2), new Object[0]);
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(str2, str, 1, 0, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
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
        return Vn.a(th2, new V(null, null, this.f6449j.a()), stackTraceElementArr != null ? Arrays.asList(stackTraceElementArr) : null, (String) this.f6450k.f6653b.a(), (Boolean) this.f6450k.f6654c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(String str, String str2, Throwable th) {
        B6 b6 = new B6(new Ig(str2, a(th)), str);
        Bi bi = this.f6447h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(b6));
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6443c.info("Error received: id: %s, message: %s", WrapUtils.wrapToTag(str), WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(PluginErrorDetails pluginErrorDetails) {
        Sn a3 = this.f6451l.a(pluginErrorDetails);
        Bi bi = this.f6447h;
        In in = a3.f6621a;
        String str = in != null ? (String) WrapUtils.getOrDefault(in.f6126a, "") : "";
        byte[] byteArray = MessageNano.toByteArray(this.f6444d.fromModel(a3));
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str, 5891, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6443c.info("Crash from plugin received: %s", WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final void b(String str) {
        Bi bi = this.f6447h;
        W5 a3 = W5.a(str);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(a3, kh), kh, 1, (Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Ka
    public final boolean b() {
        return this.f6442b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(String str, Map<String, Object> map) {
        Bi bi = this.f6447h;
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        bi.a(new U3("", str, 1, 0, publicLogger), this.f6442b, 1, map);
        PublicLogger publicLogger2 = this.f6443c;
        StringBuilder sb = new StringBuilder("Event received: ");
        sb.append(WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0388bb
    public final void a(Sn sn) {
        Bi bi = this.f6447h;
        Ah a3 = bi.a(sn, this.f6442b);
        Kh kh = a3.f5703e;
        Tl tl = bi.f5776e;
        if (tl != null) {
            kh.f6383b.setUuid(((Sl) tl).g());
        } else {
            kh.getClass();
        }
        bi.f5774c.b(a3);
        this.f6443c.info("Unhandled exception received: " + sn, new Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(PluginErrorDetails pluginErrorDetails, String str) {
        Sn sn;
        Oe oe = this.f6451l;
        if (pluginErrorDetails != null) {
            sn = oe.a(pluginErrorDetails);
        } else {
            oe.getClass();
            sn = null;
        }
        Ig ig = new Ig(str, sn);
        Bi bi = this.f6447h;
        byte[] byteArray = MessageNano.toByteArray(this.f6445e.fromModel(ig));
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str, 5896, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6443c.info("Error from plugin received: %s", WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ya, io.appmetrica.analytics.impl.InterfaceC0506g0
    public final void a(V v3) {
        C0403c0 c0403c0 = new C0403c0(v3, (String) this.f6450k.f6653b.a(), (Boolean) this.f6450k.f6654c.a());
        Bi bi = this.f6447h;
        byte[] byteArray = MessageNano.toByteArray(this.f6446g.fromModel(c0403c0));
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, "", 5968, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        String str = null;
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        PublicLogger publicLogger2 = this.f6443c;
        StringBuilder sb = new StringBuilder("ANR was reported ");
        C0994yn c0994yn = v3.f6734a;
        if (c0994yn != null) {
            str = "Thread[name=" + c0994yn.f8646a + ",tid={" + c0994yn.f8648c + ", priority=" + c0994yn.f8647b + ", group=" + c0994yn.f8649d + "}] at " + AbstractC0292g.Z(c0994yn.f, IOUtils.LINE_SEPARATOR_UNIX, null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(ModuleEvent moduleEvent) {
        EnumC0851t9 enumC0851t9;
        if (f6439n.contains(Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        String value = moduleEvent.getValue();
        String name = moduleEvent.getName();
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i3 = J8.f6150a[moduleEvent.getCategory().ordinal()];
        if (i3 == 1) {
            enumC0851t9 = EnumC0851t9.NATIVE;
        } else if (i3 == 2) {
            enumC0851t9 = EnumC0851t9.SYSTEM;
        } else {
            throw new T0.b();
        }
        u3.f6785l = enumC0851t9;
        u3.f6777c = AbstractC0698nb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            u3.f6789p = moduleEvent.getExtras();
        }
        this.f6447h.a(u3, this.f6442b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(String str, String str2, PluginErrorDetails pluginErrorDetails) {
        Sn sn;
        Oe oe = this.f6451l;
        if (pluginErrorDetails != null) {
            sn = oe.a(pluginErrorDetails);
        } else {
            oe.getClass();
            sn = null;
        }
        B6 b6 = new B6(new Ig(str2, sn), str);
        Bi bi = this.f6447h;
        byte[] byteArray = MessageNano.toByteArray(this.f.fromModel(b6));
        PublicLogger publicLogger = this.f6443c;
        Set set = D9.f5834a;
        EnumC0569ib enumC0569ib = EnumC0569ib.EVENT_TYPE_UNDEFINED;
        U3 u3 = new U3(byteArray, str2, 5896, publicLogger);
        Kh kh = this.f6442b;
        bi.getClass();
        bi.a(Bi.a(u3, kh), kh, 1, (Map) null);
        this.f6443c.info("Error with identifier: %s from plugin received: %s", str, WrapUtils.wrapToTag(str2));
    }
}
