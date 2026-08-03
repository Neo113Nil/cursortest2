package io.appmetrica.analytics.idsync.impl;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.modulesapi.internal.service.ServiceContext f3953a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.G f3954b;

    /* renamed from: c, reason: collision with root package name */
    public io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers f3955c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider f3956d = new io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider();

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.o f3957e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.x f3958f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.idsync.impl.q f3959g;

    public n(io.appmetrica.analytics.modulesapi.internal.service.ServiceContext serviceContext, io.appmetrica.analytics.idsync.impl.G g2, io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        this.f3953a = serviceContext;
        this.f3954b = g2;
        this.f3955c = sdkIdentifiers;
        this.f3957e = new io.appmetrica.analytics.idsync.impl.o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f3958f = new io.appmetrica.analytics.idsync.impl.x(serviceContext);
        this.f3959g = new io.appmetrica.analytics.idsync.impl.q(serviceContext);
    }

    public static final void a(io.appmetrica.analytics.idsync.impl.D d2, io.appmetrica.analytics.idsync.impl.n nVar, io.appmetrica.analytics.idsync.internal.model.RequestConfig requestConfig) {
        if (d2.f3885b) {
            io.appmetrica.analytics.idsync.impl.G g2 = nVar.f3954b;
            java.lang.String str = d2.f3884a;
            g2.f3901d.put(str, new io.appmetrica.analytics.idsync.impl.E(str, nVar.f3956d.currentTimeMillis(), d2.f3887d ? 2 : 4));
            g2.f3898a.putString(g2.f3900c, g2.f3899b.fromModel(i1.AbstractC0190i.X(g2.f3901d.values())));
            io.appmetrica.analytics.idsync.impl.q qVar = nVar.f3959g;
            io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers = nVar.f3955c;
            qVar.f3964a.getClass();
            java.lang.String a2 = io.appmetrica.analytics.idsync.impl.v.a(d2);
            io.appmetrica.analytics.idsync.impl.t tVar = qVar.f3965b;
            tVar.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new io.appmetrica.analytics.idsync.impl.p(tVar.f3978a));
            }
            java.lang.String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !y1.g.T(reportUrl)) {
                arrayList.add(new io.appmetrica.analytics.idsync.impl.r(tVar.f3978a, requestConfig.getReportUrl()));
            }
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((io.appmetrica.analytics.idsync.impl.s) it.next()).a(a2, sdkIdentifiers);
            }
        }
    }

    public final io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers a() {
        return this.f3955c;
    }

    public final void a(io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers sdkIdentifiers) {
        this.f3955c = sdkIdentifiers;
    }

    public static final void a(io.appmetrica.analytics.idsync.impl.n nVar, io.appmetrica.analytics.idsync.internal.model.RequestConfig requestConfig) {
        io.appmetrica.analytics.idsync.impl.y c0206a;
        io.appmetrica.analytics.idsync.impl.x xVar = nVar.f3958f;
        io.appmetrica.analytics.idsync.internal.model.Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if (io.appmetrica.analytics.idsync.impl.w.f3980a[preconditions.getNetworkType().ordinal()] == 1) {
            c0206a = new io.appmetrica.analytics.idsync.impl.C0207b(xVar.f3981a);
        } else {
            c0206a = new io.appmetrica.analytics.idsync.impl.C0206a();
        }
        if (c0206a.a()) {
            io.appmetrica.analytics.idsync.impl.o oVar = nVar.f3957e;
            oVar.getClass();
            io.appmetrica.analytics.networkapi.Request.Builder builder = new io.appmetrica.analytics.networkapi.Request.Builder(requestConfig.getUrl());
            for (java.util.Map.Entry<java.lang.String, java.util.List<java.lang.String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), i1.AbstractC0190i.Q(entry.getValue(), ", ", null, null, null, 62));
            }
            io.appmetrica.analytics.networkapi.Response execute = new io.appmetrica.analytics.network.internal.NetworkClientBuilder().withSettings(new io.appmetrica.analytics.networkapi.NetworkClientSettings.Builder().withSslSocketFactory(oVar.f3960a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build()).build().newCall(builder.build()).execute();
            oVar.f3961b.a(new io.appmetrica.analytics.idsync.impl.D(requestConfig.getType(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(java.lang.Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData(), execute.getHeaders()), requestConfig);
        }
    }

    public final void a(io.appmetrica.analytics.idsync.impl.D d2, io.appmetrica.analytics.idsync.internal.model.RequestConfig requestConfig) {
        this.f3953a.getExecutorProvider().getModuleExecutor().execute(new F0.b(d2, this, requestConfig, 1));
    }

    public final void a(io.appmetrica.analytics.idsync.internal.model.RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (android.text.TextUtils.isEmpty(requestConfig.getType()) || android.text.TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        io.appmetrica.analytics.idsync.impl.E e2 = (io.appmetrica.analytics.idsync.impl.E) this.f3954b.f3901d.get(requestConfig.getType());
        if (e2 != null) {
            long currentTimeMillis = this.f3956d.currentTimeMillis();
            int a2 = io.appmetrica.analytics.idsync.impl.A.a(e2.f3893c);
            if (a2 != 1) {
                resendIntervalForValidResponse = a2 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - e2.f3892b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f3953a.getExecutorProvider().getSupportIOExecutor().execute(new F0.c(2, this, requestConfig));
    }
}
