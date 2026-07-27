package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import e2.AbstractC0292g;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.common.ModuleSelfReporter;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClient;
import io.appmetrica.analytics.network.internal.Request;
import io.appmetrica.analytics.network.internal.Response;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f5615a;

    /* renamed from: b, reason: collision with root package name */
    public final B f5616b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f5617c = new SystemTimeProvider();

    /* renamed from: d, reason: collision with root package name */
    public final q f5618d;

    /* renamed from: e, reason: collision with root package name */
    public final s f5619e;
    public final i f;

    public p(ServiceContext serviceContext, B b3) {
        this.f5615a = serviceContext;
        this.f5616b = b3;
        this.f5618d = new q(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f5619e = new s(serviceContext);
        this.f = new i(serviceContext);
    }

    public static final void a(y yVar, p pVar) {
        if (yVar.f5627b) {
            B b3 = pVar.f5616b;
            String str = yVar.f5626a;
            b3.f5568d.put(str, new z(str, pVar.f5617c.currentTimeMillis(), yVar.f5629d ? 2 : 4));
            b3.f5565a.putString(b3.f5567c, b3.f5566b.fromModel(AbstractC0292g.f0(b3.f5568d.values())));
            i iVar = pVar.f;
            ModuleSelfReporter selfReporter = iVar.f5593a.getSelfReporter();
            iVar.f5594b.getClass();
            selfReporter.reportEvent("id_sync", j.a(yVar));
        }
    }

    public static final void a(p pVar, RequestConfig requestConfig) {
        t c0348a;
        s sVar = pVar.f5619e;
        Preconditions preconditions = requestConfig.getPreconditions();
        sVar.getClass();
        if (r.f5622a[preconditions.getNetworkType().ordinal()] == 1) {
            c0348a = new C0349b(sVar.f5623a);
        } else {
            c0348a = new C0348a();
        }
        if (c0348a.a()) {
            q qVar = pVar.f5618d;
            qVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), AbstractC0292g.Z(entry.getValue(), ", ", null, null, null, 62));
            }
            Response execute = new NetworkClient.Builder().withSslSocketFactory(qVar.f5620a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build().newCall(builder.build()).execute();
            qVar.f5621b.a(new y(requestConfig.getType(), execute.isCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData().length == 0 ? execute.getErrorData() : execute.getResponseData(), execute.getHeaders()));
        }
    }

    public final void a(y yVar) {
        this.f5615a.getExecutorProvider().getModuleExecutor().execute(new D1.a(yVar, 2, this));
    }

    public final void a(RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        z zVar = (z) this.f5616b.f5568d.get(requestConfig.getType());
        if (zVar != null) {
            long currentTimeMillis = this.f5617c.currentTimeMillis();
            int a3 = v.a(zVar.f5634c);
            if (a3 != 1) {
                resendIntervalForValidResponse = a3 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - zVar.f5633b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f5615a.getExecutorProvider().getSupportIOExecutor().execute(new D1.a(this, 1, requestConfig));
    }
}
