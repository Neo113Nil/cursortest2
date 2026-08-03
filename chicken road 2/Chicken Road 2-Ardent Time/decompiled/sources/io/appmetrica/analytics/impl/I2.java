package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public abstract class I2 implements io.appmetrica.analytics.impl.Da {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashSet f4401n = new java.util.HashSet(java.util.Arrays.asList(1, 13));

    /* renamed from: o, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.G2 f4402o = new io.appmetrica.analytics.impl.G2();

    /* renamed from: a, reason: collision with root package name */
    protected final android.content.Context f4403a;

    /* renamed from: b, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.Fh f4404b;

    /* renamed from: c, reason: collision with root package name */
    protected final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f4405c;

    /* renamed from: d, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.Rn f4406d;

    /* renamed from: e, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.Eg f4407e;

    /* renamed from: f, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.C0763v6 f4408f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0292d0 f4409g;

    /* renamed from: h, reason: collision with root package name */
    protected final io.appmetrica.analytics.impl.C0801wi f4410h;

    /* renamed from: i, reason: collision with root package name */
    public io.appmetrica.analytics.impl.C0587ob f4411i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Cf f4412j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.M9 f4413k;

    /* renamed from: l, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Je f4414l;

    /* renamed from: m, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0366fn f4415m;

    public I2(android.content.Context context, io.appmetrica.analytics.impl.C0801wi c0801wi, io.appmetrica.analytics.impl.Fh fh, io.appmetrica.analytics.impl.M9 m9, io.appmetrica.analytics.impl.C0659r6 c0659r6, io.appmetrica.analytics.impl.Rn rn, io.appmetrica.analytics.impl.Eg eg, io.appmetrica.analytics.impl.C0763v6 c0763v6, io.appmetrica.analytics.impl.C0292d0 c0292d0, io.appmetrica.analytics.impl.Je je) {
        android.content.Context applicationContext = context.getApplicationContext();
        this.f4403a = applicationContext;
        this.f4410h = c0801wi;
        this.f4404b = fh;
        this.f4413k = m9;
        this.f4406d = rn;
        this.f4407e = eg;
        this.f4408f = c0763v6;
        this.f4409g = c0292d0;
        this.f4414l = je;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.b().getApiKey());
        this.f4405c = orCreatePublicLogger;
        if (io.appmetrica.analytics.impl.Y2.a(fh.b().isLogEnabled())) {
            orCreatePublicLogger.setEnabled(true);
        }
        this.f4412j = c0659r6;
        this.f4415m = new io.appmetrica.analytics.impl.C0366fn(applicationContext);
    }

    public void a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str)) {
            this.f4405c.warning("Invalid Error Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f4405c.info("Put error environment pair <%s, %s>", str, str2);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        synchronized (fh) {
            io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
            d8.f4203b.b(d8.f4202a, str, str2);
        }
    }

    public final void b(java.util.Map<java.lang.String, java.lang.String> map) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map)) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public final void c(java.lang.String str) {
        if (this.f4404b.f()) {
            return;
        }
        this.f4410h.f7028d.c();
        io.appmetrica.analytics.impl.C0587ob c0587ob = this.f4411i;
        c0587ob.f6579a.removeCallbacks(c0587ob.f6581c, c0587ob.f6580b.f4404b.f4368b.getApiKey());
        this.f4404b.f4295e = true;
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", str, 3, 0, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void clearAppEnvironment() {
        java.lang.String str;
        this.f4405c.info("Clear app environment", new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.P5 n2 = io.appmetrica.analytics.impl.M3.n();
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str = fh.f4296f;
        }
        c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(n2, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str)));
    }

    public final void d(java.lang.String str) {
        this.f4410h.f7028d.b();
        io.appmetrica.analytics.impl.C0587ob c0587ob = this.f4411i;
        io.appmetrica.analytics.impl.C0587ob.a(c0587ob.f6579a, c0587ob.f6580b, c0587ob.f6581c);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", str, 6400, 0, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        this.f4404b.f4295e = false;
    }

    @Override // io.appmetrica.analytics.IReporter
    public final io.appmetrica.analytics.plugins.IPluginReporter getPluginExtension() {
        return this;
    }

    public java.lang.String j() {
        return "[BaseReporter]";
    }

    public void k() {
        java.lang.String str;
        io.appmetrica.analytics.impl.C0643qf c0643qf;
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.C0746uf c0746uf = fh.f4294d;
        synchronized (fh) {
            str = fh.f4296f;
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger orCreatePublicLogger = io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.f4368b.getApiKey());
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (c0746uf != null && (c0643qf = c0746uf.f6906a) != null) {
            try {
                jSONObject.put("preloadInfo", c0643qf.c());
            } catch (java.lang.Throwable unused) {
            }
        }
        java.lang.String jSONObject2 = jSONObject.toString();
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(jSONObject2, "", 6144, 0, orCreatePublicLogger);
        m3.c(str);
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void pauseSession() {
        this.f4405c.info("Pause session", new java.lang.Object[0]);
        c(null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void putAppEnvironmentValue(java.lang.String str, java.lang.String str2) {
        java.lang.String str3;
        if (android.text.TextUtils.isEmpty(str)) {
            this.f4405c.warning("Invalid App Environment (key,value) pair: (%s,%s).", str, str2);
            return;
        }
        this.f4405c.info("Put app environment: <%s, %s>", str, str2);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.P5 b2 = io.appmetrica.analytics.impl.M3.b(str, str2);
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str3 = fh.f4296f;
        }
        c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(b2, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str3)));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue) {
        reportAdRevenue(adRevenue, false);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportAnr(java.util.Map<java.lang.Thread, java.lang.StackTraceElement[]> map) {
        java.lang.StackTraceElement[] stackTraceElementArr;
        io.appmetrica.analytics.impl.C0317e0 c0317e0 = new io.appmetrica.analytics.impl.C0317e0(new io.appmetrica.analytics.impl.C0343f0(this, map));
        io.appmetrica.analytics.impl.C0508la c0508la = new io.appmetrica.analytics.impl.C0508la();
        io.appmetrica.analytics.impl.C0659r6 c0659r6 = io.appmetrica.analytics.impl.C0244b4.l().f5491a;
        java.lang.Thread a2 = c0317e0.a();
        java.util.Map map2 = null;
        try {
            stackTraceElementArr = c0317e0.b();
            if (stackTraceElementArr == null) {
                try {
                    stackTraceElementArr = a2.getStackTrace();
                } catch (java.lang.SecurityException unused) {
                }
            }
        } catch (java.lang.SecurityException unused2) {
            stackTraceElementArr = null;
        }
        io.appmetrica.analytics.impl.C0806wn c0806wn = (io.appmetrica.analytics.impl.C0806wn) c0508la.apply(a2, stackTraceElementArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.TreeMap treeMap = new java.util.TreeMap(new io.appmetrica.analytics.impl.Bn());
        try {
            map2 = c0317e0.c();
        } catch (java.lang.SecurityException unused3) {
        }
        if (map2 != null) {
            treeMap.putAll(map2);
        }
        for (java.util.Map.Entry entry : treeMap.entrySet()) {
            java.lang.Thread thread = (java.lang.Thread) entry.getKey();
            if (thread != a2 && thread != null) {
                arrayList.add((io.appmetrica.analytics.impl.C0806wn) c0508la.apply(thread, (java.lang.StackTraceElement[]) entry.getValue()));
            }
        }
        a(new io.appmetrica.analytics.impl.V(c0806wn, arrayList, c0659r6.a()));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportECommerce(io.appmetrica.analytics.ecommerce.ECommerceEvent eCommerceEvent) {
        java.lang.String str;
        this.f4405c.info("E-commerce event received: " + eCommerceEvent.getPublicDescription(), new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        for (io.appmetrica.analytics.impl.Di di : eCommerceEvent.toProto()) {
            io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.f4368b.getApiKey()));
            io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
            m3.f4816d = 41000;
            m3.f4814b = m3.e(io.appmetrica.analytics.coreutils.internal.io.Base64Utils.compressBase64(io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray((io.appmetrica.analytics.protobuf.nano.MessageNano) di.f4214a)));
            m3.f4819g = di.f4215b.getBytesTruncated();
            io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
            io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
            io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
            synchronized (fh) {
                str = fh.f4296f;
            }
            c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(m3, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str)));
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.Dg dg = new io.appmetrica.analytics.impl.Dg(str, a(th));
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        byte[] byteArray = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4407e.fromModel(dg));
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(byteArray, str, 5892, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        this.f4405c.info("Error received: %s", io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str) {
        this.f4405c.info("Event received: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str), new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", str, 1, 0, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportRevenue(io.appmetrica.analytics.Revenue revenue) {
        java.lang.String str;
        io.appmetrica.analytics.impl.Ni ni = io.appmetrica.analytics.impl.H2.f4366a;
        ni.getClass();
        io.appmetrica.analytics.impl.C0652qo a2 = ni.a(revenue);
        if (!a2.f6701a) {
            this.f4405c.warning("Passed revenue is not valid. Reason: " + a2.f6702b, new java.lang.Object[0]);
            return;
        }
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Oi oi = new io.appmetrica.analytics.impl.Oi(revenue, this.f4405c);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.M3 a3 = io.appmetrica.analytics.impl.M3.a(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.f4368b.getApiKey()), oi);
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str = fh.f4296f;
        }
        c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(a3, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str)));
        this.f4405c.info("Revenue received for productID: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(revenue.productID) + " of quantity: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(revenue.quantity) + " with price (in micros): " + revenue.priceMicros + " " + revenue.currency, new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUnhandledException(java.lang.Throwable th) {
        io.appmetrica.analytics.impl.Qn a2 = io.appmetrica.analytics.impl.Tn.a(th, new io.appmetrica.analytics.impl.V(null, null, this.f4412j.a()), null, (java.lang.String) this.f4413k.f4654b.a(), (java.lang.Boolean) this.f4413k.f4655c.a());
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        c0801wi.a(c0801wi.a(a2, this.f4404b));
        this.f4405c.info("Unhandled exception received: " + a2, new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportUserProfile(io.appmetrica.analytics.profile.UserProfile userProfile) {
        java.lang.String str;
        io.appmetrica.analytics.impl.Cdo cdo = new io.appmetrica.analytics.impl.Cdo(io.appmetrica.analytics.impl.Cdo.f5756c);
        java.util.Iterator<io.appmetrica.analytics.profile.UserProfileUpdate<? extends io.appmetrica.analytics.impl.InterfaceC0341eo>> it = userProfile.getUserProfileUpdates().iterator();
        while (it.hasNext()) {
            io.appmetrica.analytics.impl.InterfaceC0341eo userProfileUpdatePatcher = it.next().getUserProfileUpdatePatcher();
            userProfileUpdatePatcher.a(this.f4405c);
            userProfileUpdatePatcher.a(cdo);
        }
        io.appmetrica.analytics.impl.C0444io c0444io = new io.appmetrica.analytics.impl.C0444io();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 = 0; i2 < cdo.f5757a.size(); i2++) {
            android.util.SparseArray sparseArray = cdo.f5757a;
            java.util.Iterator it2 = ((java.util.HashMap) sparseArray.get(sparseArray.keyAt(i2))).values().iterator();
            while (it2.hasNext()) {
                arrayList.add((io.appmetrica.analytics.impl.C0367fo) it2.next());
            }
        }
        c0444io.f6142a = (io.appmetrica.analytics.impl.C0367fo[]) arrayList.toArray(new io.appmetrica.analytics.impl.C0367fo[arrayList.size()]);
        io.appmetrica.analytics.impl.C0652qo a2 = f4402o.a(c0444io);
        if (!a2.f6701a) {
            this.f4405c.warning("UserInfo wasn't sent because " + a2.f6702b, new java.lang.Object[0]);
            return;
        }
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.P5 a3 = io.appmetrica.analytics.impl.M3.a(c0444io);
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str = fh.f4296f;
        }
        c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(a3, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str)));
        this.f4405c.info("User profile received", new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void resumeSession() {
        d(null);
        this.f4405c.info("Resume session", new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.IReporter, io.appmetrica.analytics.IModuleReporter
    public final void sendEventsBuffer() {
        this.f4405c.info("Send event buffer", new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", "", 256, 0, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setDataSendingEnabled(boolean z2) {
        this.f4404b.f4368b.setDataSendingEnabled(z2);
        this.f4405c.info("Updated data sending enabled: %s", java.lang.Boolean.valueOf(z2));
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void setSessionExtra(java.lang.String str, byte[] bArr) {
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3("", null, 8193, 0, publicLogger);
        if (bArr == null) {
            bArr = new byte[0];
        }
        m3.f4828p = java.util.Collections.singletonMap(str, bArr);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void setUserProfileID(java.lang.String str) {
        java.lang.String str2;
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.f4368b.getApiKey()));
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        m3.f4816d = 40962;
        m3.c(str);
        m3.f4814b = m3.e(str);
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str2 = fh.f4296f;
        }
        c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(m3, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str2)));
        this.f4405c.info("Set user profile ID: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str), new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportAdRevenue(io.appmetrica.analytics.AdRevenue adRevenue, boolean z2) {
        java.lang.String str;
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.E e2 = new io.appmetrica.analytics.impl.E(adRevenue, z2, this.f4415m, this.f4405c);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        io.appmetrica.analytics.impl.M3 a2 = io.appmetrica.analytics.impl.M3.a(io.appmetrica.analytics.coreutils.internal.logger.LoggerStorage.getOrCreatePublicLogger(fh.f4368b.getApiKey()), e2);
        io.appmetrica.analytics.impl.Bf bf = new io.appmetrica.analytics.impl.Bf(fh.f4367a);
        io.appmetrica.analytics.internal.CounterConfiguration counterConfiguration = new io.appmetrica.analytics.internal.CounterConfiguration(fh.f4368b);
        io.appmetrica.analytics.impl.D8 d8 = fh.f4293c;
        synchronized (fh) {
            str = fh.f4296f;
        }
        c0801wi.a(new io.appmetrica.analytics.impl.C0774vh(a2, false, 1, null, new io.appmetrica.analytics.impl.Fh(bf, counterConfiguration, d8, str)));
        this.f4405c.info("AdRevenue Received: AdRevenue{adRevenue=" + adRevenue.adRevenue + ", currency='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.currency.getCurrencyCode()) + "', adType=" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.adType) + ", adNetwork='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.adNetwork) + "', adUnitId='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.adUnitId) + "', adUnitName='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.adUnitName) + "', adPlacementId='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.adPlacementId) + "', adPlacementName='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.adPlacementName) + "', precision='" + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(adRevenue.precision) + "', payload=" + io.appmetrica.analytics.impl.AbstractC0380gb.b(adRevenue.payload) + ", autoCollected=" + z2 + "}", new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(java.lang.String str, java.lang.String str2) {
        this.f4405c.info("Event received: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str) + ". With value: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str2), new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(str2, str, 1, 0, publicLogger);
        m3.f4824l = io.appmetrica.analytics.impl.EnumC0533m9.JS;
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    public final void a(java.util.Map<java.lang.String, java.lang.String> map) {
        if (io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Map) map)) {
            return;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : map.entrySet()) {
            putAppEnvironmentValue(entry.getKey(), entry.getValue());
        }
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2) {
        reportError(str, str2, (java.lang.Throwable) null);
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.lang.String str2) {
        this.f4405c.info("Event received: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str) + ". With value: " + io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str2), new java.lang.Object[0]);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(str2, str, 1, 0, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
    }

    public final io.appmetrica.analytics.impl.Qn a(java.lang.Throwable th) {
        java.lang.Throwable th2;
        java.lang.StackTraceElement[] stackTraceElementArr;
        if (th == null) {
            stackTraceElementArr = null;
            th2 = null;
        } else if (th instanceof io.appmetrica.analytics.impl.N1) {
            stackTraceElementArr = th.getStackTrace();
            th2 = null;
        } else {
            th2 = th;
            stackTraceElementArr = null;
        }
        return io.appmetrica.analytics.impl.Tn.a(th2, new io.appmetrica.analytics.impl.V(null, null, this.f4412j.a()), stackTraceElementArr != null ? java.util.Arrays.asList(stackTraceElementArr) : null, (java.lang.String) this.f4413k.f4654b.a(), (java.lang.Boolean) this.f4413k.f4655c.a());
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportError(java.lang.String str, java.lang.String str2, java.lang.Throwable th) {
        io.appmetrica.analytics.impl.C0737u6 c0737u6 = new io.appmetrica.analytics.impl.C0737u6(new io.appmetrica.analytics.impl.Dg(str2, a(th)), str);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        byte[] byteArray = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4408f.fromModel(c0737u6));
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(byteArray, str2, 5896, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        this.f4405c.info("Error received: id: %s, message: %s", io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str), io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str2));
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportUnhandledException(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        io.appmetrica.analytics.impl.Qn a2 = this.f4414l.a(pluginErrorDetails);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.Gn gn = a2.f4873a;
        java.lang.String str = gn != null ? (java.lang.String) io.appmetrica.analytics.coreutils.internal.WrapUtils.getOrDefault(gn.f4353a, "") : "";
        byte[] byteArray = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4406d.fromModel(a2));
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(byteArray, str, 5891, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        this.f4405c.info("Crash from plugin received: %s", io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(pluginErrorDetails.getMessage()));
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final void b(java.lang.String str) {
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.P5 a2 = io.appmetrica.analytics.impl.P5.a(str);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(a2, fh), fh, 1, (java.util.Map) null);
    }

    @Override // io.appmetrica.analytics.impl.Da
    public final boolean b() {
        return this.f4404b.f();
    }

    @Override // io.appmetrica.analytics.IReporter
    public final void reportEvent(java.lang.String str, java.util.Map<java.lang.String, java.lang.Object> map) {
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        c0801wi.a(new io.appmetrica.analytics.impl.M3("", str, 1, 0, publicLogger), this.f4404b, 1, map);
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger2 = this.f4405c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Event received: ");
        sb.append(io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str));
        sb.append(". With value: ");
        sb.append(io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(map == null ? null : map.toString()));
        publicLogger2.info(sb.toString(), new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.Ua
    public final void a(io.appmetrica.analytics.impl.Qn qn) {
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        io.appmetrica.analytics.impl.C0774vh a2 = c0801wi.a(qn, this.f4404b);
        io.appmetrica.analytics.impl.Fh fh = a2.f6978e;
        io.appmetrica.analytics.impl.Pl pl = c0801wi.f7029e;
        if (pl != null) {
            fh.f4368b.setUuid(((io.appmetrica.analytics.impl.Ol) pl).g());
        } else {
            fh.getClass();
        }
        c0801wi.f7027c.b(a2);
        this.f4405c.info("Unhandled exception received: " + qn, new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails, java.lang.String str) {
        io.appmetrica.analytics.impl.Qn qn;
        io.appmetrica.analytics.impl.Je je = this.f4414l;
        if (pluginErrorDetails != null) {
            qn = je.a(pluginErrorDetails);
        } else {
            je.getClass();
            qn = null;
        }
        io.appmetrica.analytics.impl.Dg dg = new io.appmetrica.analytics.impl.Dg(str, qn);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        byte[] byteArray = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4407e.fromModel(dg));
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(byteArray, str, 5896, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        this.f4405c.info("Error from plugin received: %s", io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str));
    }

    @Override // io.appmetrica.analytics.impl.Ra, io.appmetrica.analytics.impl.InterfaceC0369g0
    public final void a(io.appmetrica.analytics.impl.V v2) {
        io.appmetrica.analytics.impl.C0266c0 c0266c0 = new io.appmetrica.analytics.impl.C0266c0(v2, (java.lang.String) this.f4413k.f4654b.a(), (java.lang.Boolean) this.f4413k.f4655c.a());
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        byte[] byteArray = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4409g.fromModel(c0266c0));
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(byteArray, "", 5968, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        java.lang.String str = null;
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger2 = this.f4405c;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ANR was reported ");
        io.appmetrica.analytics.impl.C0806wn c0806wn = v2.f5096a;
        if (c0806wn != null) {
            str = "Thread[name=" + c0806wn.f7064a + ",tid={" + c0806wn.f7066c + ", priority=" + c0806wn.f7065b + ", group=" + c0806wn.f7067d + "}] at " + i1.AbstractC0190i.Q(c0806wn.f7069f, "\n", null, null, null, 62);
        }
        sb.append(str);
        publicLogger2.info(sb.toString(), new java.lang.Object[0]);
    }

    @Override // io.appmetrica.analytics.IModuleReporter
    public final void reportEvent(io.appmetrica.analytics.ModuleEvent moduleEvent) {
        io.appmetrica.analytics.impl.EnumC0533m9 enumC0533m9;
        if (f4401n.contains(java.lang.Integer.valueOf(moduleEvent.getType()))) {
            return;
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        java.lang.String value = moduleEvent.getValue();
        java.lang.String name = moduleEvent.getName();
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(value, name, 8192, moduleEvent.getType(), publicLogger);
        int i2 = io.appmetrica.analytics.impl.E8.f4258a[moduleEvent.getCategory().ordinal()];
        if (i2 == 1) {
            enumC0533m9 = io.appmetrica.analytics.impl.EnumC0533m9.NATIVE;
        } else if (i2 == 2) {
            enumC0533m9 = io.appmetrica.analytics.impl.EnumC0533m9.SYSTEM;
        } else {
            throw new E1.A();
        }
        m3.f4824l = enumC0533m9;
        m3.f4815c = io.appmetrica.analytics.impl.AbstractC0380gb.b(moduleEvent.getEnvironment());
        if (moduleEvent.getExtras() != null) {
            m3.f4828p = moduleEvent.getExtras();
        }
        this.f4410h.a(m3, this.f4404b, moduleEvent.getServiceDataReporterType(), moduleEvent.getAttributes());
    }

    @Override // io.appmetrica.analytics.plugins.IPluginReporter
    public final void reportError(java.lang.String str, java.lang.String str2, io.appmetrica.analytics.plugins.PluginErrorDetails pluginErrorDetails) {
        io.appmetrica.analytics.impl.Qn qn;
        io.appmetrica.analytics.impl.Je je = this.f4414l;
        if (pluginErrorDetails != null) {
            qn = je.a(pluginErrorDetails);
        } else {
            je.getClass();
            qn = null;
        }
        io.appmetrica.analytics.impl.C0737u6 c0737u6 = new io.appmetrica.analytics.impl.C0737u6(new io.appmetrica.analytics.impl.Dg(str2, qn), str);
        io.appmetrica.analytics.impl.C0801wi c0801wi = this.f4410h;
        byte[] byteArray = io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f4408f.fromModel(c0737u6));
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = this.f4405c;
        java.util.Set set = io.appmetrica.analytics.impl.AbstractC0792w9.f7005a;
        io.appmetrica.analytics.impl.EnumC0251bb enumC0251bb = io.appmetrica.analytics.impl.EnumC0251bb.EVENT_TYPE_UNDEFINED;
        io.appmetrica.analytics.impl.M3 m3 = new io.appmetrica.analytics.impl.M3(byteArray, str2, 5896, publicLogger);
        io.appmetrica.analytics.impl.Fh fh = this.f4404b;
        c0801wi.getClass();
        c0801wi.a(io.appmetrica.analytics.impl.C0801wi.a(m3, fh), fh, 1, (java.util.Map) null);
        this.f4405c.info("Error with identifier: %s from plugin received: %s", str, io.appmetrica.analytics.coreutils.internal.WrapUtils.wrapToTag(str2));
    }
}
