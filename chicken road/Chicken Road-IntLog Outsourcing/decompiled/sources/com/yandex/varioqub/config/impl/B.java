package com.yandex.varioqub.config.impl;

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.util.Log;
import b2.AbstractC0279e;
import com.yandex.varioqub.analyticadapter.VarioqubConfigAdapter;
import com.yandex.varioqub.analyticadapter.data.ConfigData;
import com.yandex.varioqub.config.FetchError;
import com.yandex.varioqub.config.OnFetchCompleteListener;
import com.yandex.varioqub.config.VarioqubApi;
import com.yandex.varioqub.config.VarioqubSettings;
import com.yandex.varioqub.config.model.ConfigValue;
import com.yandex.varioqub.protobuf.nano.MessageNano;
import g4.AbstractC0465j;
import g4.AbstractC0466k;
import g4.AbstractC0467l;
import g4.AbstractC0476u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import n2.AbstractC1341c;
import t4.InterfaceC1430a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class B implements VarioqubApi {

    /* renamed from: a, reason: collision with root package name */
    public C0391a f5385a;

    /* renamed from: b, reason: collision with root package name */
    public C0393c f5386b;

    /* renamed from: c, reason: collision with root package name */
    public t f5387c;

    /* renamed from: d, reason: collision with root package name */
    public Executor f5388d;

    /* renamed from: e, reason: collision with root package name */
    public g f5389e;

    /* renamed from: f, reason: collision with root package name */
    public VarioqubSettings f5390f;

    /* renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f5391g = new AtomicBoolean(false);

    /* JADX WARN: Finally extract failed */
    public static final void a(B b6, OnFetchCompleteListener onFetchCompleteListener) {
        LinkedHashMap e02;
        Object wVar;
        C0393c c0393c;
        boolean z;
        C0393c c0393c2 = b6.f5386b;
        if (c0393c2 == null) {
            kotlin.jvm.internal.i.l("configFetcher");
            throw null;
        }
        VarioqubSettings varioqubSettings = b6.f5390f;
        if (varioqubSettings == null) {
            kotlin.jvm.internal.i.l("settings");
            throw null;
        }
        g gVar = b6.f5389e;
        if (gVar == null) {
            kotlin.jvm.internal.i.l("identifierProvider");
            throw null;
        }
        c0393c2.a();
        h hVar = gVar.f5417b.await(10L, TimeUnit.SECONDS) ? new h(gVar.f5418c, gVar.f5419d) : null;
        if (hVar == null) {
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError("identifiers is null", FetchError.IDENTIFIERS_NULL);
                return;
            }
            return;
        }
        c0393c2.f5404e.getClass();
        if (System.currentTimeMillis() - c0393c2.f5405f <= c0393c2.f5401b) {
            if (C.f5392a) {
                Log.d("Varioqub/ConfigFetcher", "fetch request was throttled");
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError("fetch request was throttled", FetchError.REQUEST_THROTTLED);
                return;
            }
            return;
        }
        l.b(1);
        i iVar = c0393c2.f5400a;
        String a6 = D.a(varioqubSettings.getClientId$config_release());
        String str = c0393c2.f5408i;
        String str2 = hVar.f5420a;
        String str3 = hVar.f5421b;
        Map<String, String> clientFeatures$config_release = varioqubSettings.getClientFeatures$config_release();
        String adapterName = c0393c2.f5403d.f5394a.getAdapterName();
        p pVar = new p();
        pVar.f5435a = str;
        pVar.f5436b = str2;
        pVar.f5440f = AbstractC0392b.c().versionName;
        pVar.f5441g = AbstractC0392b.d();
        pVar.f5438d = "0.7.0";
        pVar.f5439e = "android";
        pVar.f5442h = AbstractC0392b.b();
        pVar.f5443i = str3;
        ArrayList arrayList = new ArrayList(clientFeatures$config_release.size());
        for (Map.Entry<String, String> entry : clientFeatures$config_release.entrySet()) {
            n nVar = new n();
            nVar.f5430a = entry.getKey();
            nVar.f5431b = entry.getValue();
            arrayList.add(nVar);
        }
        Object[] array = arrayList.toArray(new n[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        pVar.f5437c = (n[]) array;
        synchronized (l.f5428c) {
            e02 = AbstractC0476u.e0(l.f5427b);
        }
        int size = e02.size();
        o[] oVarArr = new o[size];
        for (int i2 = 0; i2 < size; i2++) {
            oVarArr[i2] = new o();
        }
        int i3 = 0;
        for (Object obj : e02.entrySet()) {
            int i6 = i3 + 1;
            if (i3 < 0) {
                AbstractC0466k.C0();
                throw null;
            }
            o oVar = new o();
            oVar.f5433a = (String) ((Map.Entry) obj).getKey();
            oVar.f5434b = ((Number) r12.getValue()).longValue();
            oVarArr[i3] = oVar;
            i3 = i6;
            c0393c2 = c0393c2;
        }
        C0393c c0393c3 = c0393c2;
        pVar.f5444j = oVarArr;
        pVar.f5445k = String.valueOf(AbstractC0392b.a());
        pVar.f5446l = Build.VERSION.RELEASE;
        pVar.f5447m = adapterName;
        pVar.f5448n = adapterName;
        String str4 = "Varioqub request formed - " + pVar;
        if (C.f5392a) {
            Log.d("Varioqub/RequestBodyFormer", str4);
        }
        byte[] byteArray = MessageNano.toByteArray(pVar);
        if (iVar.f5423b.compareAndSet(false, true)) {
            Context context = AbstractC0394d.f5413a;
            if (context == null) {
                kotlin.jvm.internal.i.l("appContext");
                throw null;
            }
            String string = context.getSharedPreferences(context.getPackageName() + "_varioqub_pref", 0).getString("etag", "");
            if (string == null) {
                string = "";
            }
            iVar.f5424c = string;
        }
        String str5 = "Network request to: " + a6 + ". Content length - " + byteArray.length;
        if (C.f5392a) {
            Log.d("Varioqub/NetworkClient", str5);
        }
        try {
            B.d dVar = new B.d();
            B4.j jVar = T4.s.f2931b;
            T4.s z5 = AbstractC1341c.z("application/x-protobuf");
            int i7 = T4.x.f2999a;
            int length = byteArray.length;
            U4.c.a(byteArray.length, 0, length);
            dVar.j("POST", new T4.w(z5, length, byteArray, 0));
            dVar.l(a6);
            dVar.i("If-None-Match", iVar.f5424c);
            M0.e eVar = new M0.e(dVar);
            T4.u uVar = iVar.f5422a;
            uVar.getClass();
            T4.z d6 = new X4.r(uVar, eVar).d();
            try {
                String c2 = d6.f3020f.c("ETag");
                if (c2 == null) {
                    c2 = null;
                }
                if (c2 == null) {
                    c2 = "";
                }
                iVar.f5424c = c2;
                m.b(c2);
                if (d6.f3030p) {
                    T4.B b7 = d6.f3021g;
                    byte[] a7 = b7 != null ? b7.a() : null;
                    if (a7 == null) {
                        a7 = new byte[0];
                    }
                    wVar = new y(a7);
                } else {
                    int i8 = d6.f3018d;
                    wVar = i8 == 304 ? v.f5463a : new x(i8);
                }
                AbstractC1477a.e(d6, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC1477a.e(d6, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            String f3 = AbstractC0279e.f("request for ", a6, " failed : ");
            if (C.f5392a) {
                Log.e("Varioqub/NetworkClient", f3, th3);
            }
            wVar = new w(th3);
        }
        if (wVar instanceof v) {
            if (C.f5392a) {
                Log.d("Varioqub/ConfigFetcher", "fetch response from cache");
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onSuccess();
            }
        } else if (wVar instanceof w) {
            String str6 = "fetch failed with exception " + ((w) wVar).f5464a;
            if (C.f5392a) {
                Log.d("Varioqub/ConfigFetcher", str6);
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError(str6, FetchError.INTERNAL_ERROR);
            }
        } else if (wVar instanceof x) {
            String str7 = "failed with network code " + ((x) wVar).f5465a;
            if (C.f5392a) {
                Log.d("Varioqub/ConfigFetcher", str7);
            }
            if (onFetchCompleteListener != null) {
                onFetchCompleteListener.onError(str7, FetchError.NETWORK_ERROR);
            }
        } else if (wVar instanceof y) {
            y yVar = (y) wVar;
            c0393c = c0393c3;
            c0393c.f5407h.clear();
            if (yVar.f5466a.length == 0) {
                boolean z6 = C.f5392a;
                if (z6 && z6) {
                    Log.e("Varioqub/Varioqub/ConfigFetcher", "fetch failed with empty body", null);
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onError("fetch failed with empty body", FetchError.EMPTY_RESULT);
                }
            }
            try {
                r rVar = (r) MessageNano.mergeFrom(new r(), yVar.f5466a);
                String str8 = "fetched config - " + rVar;
                if (C.f5392a) {
                    Log.d("Varioqub/ConfigFetcher", str8);
                }
                c0393c.f5412m = !kotlin.jvm.internal.i.a(c0393c.f5409j, rVar.f5453b);
                c0393c.f5409j = rVar.f5453b;
                c0393c.f5408i = rVar.f5452a;
                c0393c.f5410k = rVar.f5455d;
                for (q qVar : rVar.f5454c) {
                    String str9 = qVar.f5450a;
                    s[] sVarArr = qVar.f5451b;
                    kotlin.jvm.internal.i.e(sVarArr, "<this>");
                    if (sVarArr.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    long j2 = sVarArr[sVarArr.length - 1].f5458b;
                    s[] sVarArr2 = qVar.f5451b;
                    kotlin.jvm.internal.i.e(sVarArr2, "<this>");
                    if (sVarArr2.length == 0) {
                        throw new NoSuchElementException("Array is empty.");
                    }
                    s sVar = sVarArr2[sVarArr2.length - 1];
                    c0393c.f5407h.put(str9, new ConfigValue(sVar.f5459c ? null : sVar.f5457a, 2, j2));
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onSuccess();
                }
                c0393c.f5404e.getClass();
                c0393c.f5406g = System.currentTimeMillis();
            } catch (Throwable th4) {
                if (C.f5392a) {
                    Log.e("Varioqub/ConfigFetcher", "exception while fetch ", th4);
                }
                if (onFetchCompleteListener != null) {
                    onFetchCompleteListener.onError("exception while fetch ", FetchError.RESPONSE_PARSE_ERROR);
                }
            }
            c0393c.f5404e.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            c0393c.f5405f = currentTimeMillis;
            m.a(currentTimeMillis);
            m.b(c0393c.f5406g);
            if (!m.a().edit().putString("experiments", c0393c.f5409j).commit() && (z = C.f5392a) && z) {
                Log.e("Varioqub/Varioqub/PreferenceManager", "save experiments failed", null);
            }
            m.c(c0393c.f5408i);
            m.b(c0393c.f5407h);
            m.a(c0393c.f5412m);
            l.a(1);
        }
        c0393c = c0393c3;
        c0393c.f5404e.getClass();
        long currentTimeMillis2 = System.currentTimeMillis();
        c0393c.f5405f = currentTimeMillis2;
        m.a(currentTimeMillis2);
        m.b(c0393c.f5406g);
        if (!m.a().edit().putString("experiments", c0393c.f5409j).commit()) {
            Log.e("Varioqub/Varioqub/PreferenceManager", "save experiments failed", null);
        }
        m.c(c0393c.f5408i);
        m.b(c0393c.f5407h);
        m.a(c0393c.f5412m);
        l.a(1);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void activateConfig(InterfaceC1430a interfaceC1430a) {
        a();
        C0393c c0393c = this.f5386b;
        if (c0393c == null) {
            kotlin.jvm.internal.i.l("configFetcher");
            throw null;
        }
        c0393c.a();
        C0391a c0391a = c0393c.f5403d;
        String str = c0393c.f5410k;
        long j2 = c0393c.f5406g;
        if (!kotlin.jvm.internal.i.a(c0391a.f5398e, str) && c0391a.f5395b.getActivateEvent$config_release()) {
            c0391a.f5394a.reportConfigChanged(new ConfigData(c0391a.f5398e, str, j2));
            m.a(str);
        }
        c0391a.f5398e = str;
        if (c0393c.f5412m) {
            C0391a c0391a2 = c0393c.f5403d;
            Collection values = c0393c.f5407h.values();
            c0391a2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC0467l.D0(values, 10));
            Iterator it = values.iterator();
            while (it.hasNext()) {
                arrayList.add(Long.valueOf(((ConfigValue) it.next()).getTestId()));
            }
            Set X02 = AbstractC0465j.X0(arrayList);
            Set other = c0391a2.f5396c;
            kotlin.jvm.internal.i.e(other, "other");
            Set W02 = AbstractC0465j.W0(X02);
            W02.retainAll(other);
            Set<Long> W03 = AbstractC0465j.W0(W02);
            c0391a2.f5396c = W03;
            c0391a2.f5394a.setTriggeredTestIds(W03);
            m.a(c0391a2.f5396c);
            C0391a c0391a3 = c0393c.f5403d;
            String str2 = c0393c.f5409j;
            c0391a3.f5397d = str2;
            c0391a3.f5394a.setExperiments(str2);
            c0393c.f5412m = false;
        }
        t tVar = c0393c.f5402c;
        HashMap hashMap = new HashMap(c0393c.f5407h);
        tVar.a();
        tVar.f5461b = hashMap;
        m.a(hashMap);
        if (interfaceC1430a != null) {
            interfaceC1430a.invoke();
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void clearClientFeatures() {
        Executor executor = this.f5388d;
        if (executor != null) {
            executor.execute(new B2.b(20, this));
        } else {
            kotlin.jvm.internal.i.l("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void fetchConfig(OnFetchCompleteListener onFetchCompleteListener) {
        a();
        Executor executor = this.f5388d;
        if (executor != null) {
            executor.execute(new B3.c(this, 20, onFetchCompleteListener));
        } else {
            kotlin.jvm.internal.i.l("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final Set getAllKeys() {
        a();
        t tVar = this.f5387c;
        if (tVar == null) {
            kotlin.jvm.internal.i.l("storage");
            throw null;
        }
        tVar.a();
        Set keySet = tVar.f5461b.keySet();
        Set other = tVar.f5460a.keySet();
        kotlin.jvm.internal.i.e(keySet, "<this>");
        kotlin.jvm.internal.i.e(other, "other");
        Set W02 = AbstractC0465j.W0(keySet);
        W02.addAll(other);
        return AbstractC0465j.X0(W02);
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final boolean getBoolean(String str, boolean z) {
        ConfigValue value = getValue(str);
        return value != null ? value.asBoolean() : z;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final double getDouble(String str, double d6) {
        ConfigValue value = getValue(str);
        return value != null ? value.asDouble() : d6;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getId() {
        a();
        C0393c c0393c = this.f5386b;
        if (c0393c != null) {
            c0393c.a();
            return c0393c.f5408i;
        }
        kotlin.jvm.internal.i.l("configFetcher");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final long getLong(String str, long j2) {
        ConfigValue value = getValue(str);
        return value != null ? value.asLong() : j2;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final String getString(String str, String str2) {
        String asString;
        ConfigValue value = getValue(str);
        return (value == null || (asString = value.asString()) == null) ? str2 : asString;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final ConfigValue getValue(String str) {
        a();
        t tVar = this.f5387c;
        if (tVar == null) {
            kotlin.jvm.internal.i.l("storage");
            throw null;
        }
        tVar.a();
        ConfigValue configValue = (ConfigValue) tVar.f5461b.get(str);
        if (configValue == null) {
            tVar.a();
            configValue = (ConfigValue) tVar.f5460a.get(str);
        }
        if (configValue == null || configValue.getTestId() <= 0) {
            return configValue;
        }
        C0391a c0391a = this.f5385a;
        if (c0391a == null) {
            kotlin.jvm.internal.i.l("analyticAdapter");
            throw null;
        }
        long testId = configValue.getTestId();
        synchronized (c0391a.f5399f) {
            c0391a.f5396c.add(Long.valueOf(testId));
        }
        c0391a.f5394a.setTriggeredTestIds(c0391a.f5396c);
        m.a(c0391a.f5396c);
        if (configValue.getValue() != null) {
            return configValue;
        }
        t tVar2 = this.f5387c;
        if (tVar2 != null) {
            tVar2.a();
            return (ConfigValue) tVar2.f5460a.get(str);
        }
        kotlin.jvm.internal.i.l("storage");
        throw null;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void init(VarioqubSettings varioqubSettings, VarioqubConfigAdapter varioqubConfigAdapter, Context context) {
        if (this.f5391g.get()) {
            return;
        }
        synchronized (this) {
            if (!this.f5391g.get()) {
                l.b(2);
                C0391a c0391a = new C0391a(varioqubConfigAdapter, varioqubSettings);
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                t tVar = new t();
                a(varioqubSettings, c0391a, newSingleThreadExecutor, context, tVar, new C0393c(new i(), TimeUnit.SECONDS.toMillis(varioqubSettings.getFetchThrottleIntervalSec$config_release()), tVar, c0391a, new u()), new g(c0391a));
                l.a(2);
            }
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void putClientFeature(String str, String str2) {
        Executor executor = this.f5388d;
        if (executor != null) {
            executor.execute(new J0.a(this, str, str2, 8));
        } else {
            kotlin.jvm.internal.i.l("executor");
            throw null;
        }
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(Map map) {
        a();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), ConfigValue.Companion.createInappDefault$config_release(entry.getValue().toString()));
        }
        t tVar = this.f5387c;
        if (tVar == null) {
            kotlin.jvm.internal.i.l("storage");
            throw null;
        }
        tVar.f5460a = hashMap;
    }

    @Override // com.yandex.varioqub.config.VarioqubApi
    public final void setDefaults(int i2, InterfaceC1430a interfaceC1430a) {
        a();
        Executor executor = this.f5388d;
        if (executor != null) {
            executor.execute(new U.a(i2, 1, this, interfaceC1430a));
        } else {
            kotlin.jvm.internal.i.l("executor");
            throw null;
        }
    }

    public static final void a(B b6, int i2, InterfaceC1430a interfaceC1430a) {
        t tVar = b6.f5387c;
        if (tVar == null) {
            kotlin.jvm.internal.i.l("storage");
            throw null;
        }
        if (i2 != -1) {
            Context context = AbstractC0394d.f5413a;
            if (context != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (context.getResources() != null) {
                    XmlResourceParser xml = context.getResources().getXml(i2);
                    String str = "";
                    String str2 = str;
                    String str3 = str2;
                    while (xml.next() != 1) {
                        int eventType = xml.getEventType();
                        if (eventType == 2) {
                            str2 = xml.getName();
                        } else if (eventType == 3) {
                            if (kotlin.jvm.internal.i.a(xml.getName(), "entry") && str.length() > 0 && str3.length() > 0) {
                                linkedHashMap.put(str, ConfigValue.Companion.createInappDefault$config_release(str3));
                            }
                            str2 = "";
                        } else if (eventType == 4) {
                            if (kotlin.jvm.internal.i.a(str2, "key")) {
                                str = xml.getText();
                            } else if (kotlin.jvm.internal.i.a(str2, "value")) {
                                str3 = xml.getText();
                            }
                        }
                    }
                }
                tVar.f5460a = linkedHashMap;
                if (interfaceC1430a != null) {
                    interfaceC1430a.invoke();
                    return;
                }
                return;
            }
            kotlin.jvm.internal.i.l("appContext");
            throw null;
        }
        throw new IllegalArgumentException(AbstractC0279e.d(i2, "Invalid resId: "));
    }

    public static final void a(B b6, String str, String str2) {
        VarioqubSettings varioqubSettings = b6.f5390f;
        if (varioqubSettings != null) {
            varioqubSettings.putClientFeature$config_release(str, str2);
        } else {
            kotlin.jvm.internal.i.l("settings");
            throw null;
        }
    }

    public static final void a(B b6) {
        VarioqubSettings varioqubSettings = b6.f5390f;
        if (varioqubSettings != null) {
            varioqubSettings.clearClientFeatures$config_release();
        } else {
            kotlin.jvm.internal.i.l("settings");
            throw null;
        }
    }

    public final void a() {
        if (!this.f5391g.get()) {
            throw new IllegalStateException("VarioqubConfig is not inited. Please call init() method first");
        }
    }

    public final void a(VarioqubSettings varioqubSettings, C0391a c0391a, ExecutorService executorService, Context context, t tVar, C0393c c0393c, g gVar) {
        this.f5390f = varioqubSettings;
        this.f5385a = c0391a;
        this.f5387c = tVar;
        this.f5386b = c0393c;
        this.f5388d = executorService;
        this.f5389e = gVar;
        AbstractC0394d.f5413a = context.getApplicationContext();
        D.f5393a = varioqubSettings.getUrl$config_release();
        C.f5392a = varioqubSettings.getLogs$config_release();
        String string = m.a().getString("experiments", "");
        if (string == null) {
            string = "";
        }
        c0391a.f5397d = string;
        c0391a.f5396c = m.b();
        String string2 = m.a().getString("config_version", "");
        c0391a.f5398e = string2 != null ? string2 : "";
        c0391a.f5394a.setExperiments(c0391a.f5397d);
        c0391a.f5394a.setTriggeredTestIds(c0391a.f5396c);
        this.f5391g.set(true);
        executorService.execute(new B2.b(19, gVar));
    }

    public static final void a(g gVar) {
        gVar.getClass();
        l.b(3);
        C0391a c0391a = gVar.f5416a;
        c0391a.f5394a.requestDeviceId(new e(gVar));
        C0391a c0391a2 = gVar.f5416a;
        c0391a2.f5394a.requestUserId(new f(gVar));
    }
}
