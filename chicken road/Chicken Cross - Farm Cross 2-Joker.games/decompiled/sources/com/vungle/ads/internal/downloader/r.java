package com.vungle.ads.internal.downloader;

import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.util.u;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes7.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11906a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(String str) {
        super(1);
        this.f11906a = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value = ((Result) obj).getValue();
        String str = this.f11906a;
        if (Result.m8086isSuccessimpl(value)) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.VM_TEMPLATE_PRE_DOWNLOAD_STATUS, 1L, null, str, 4);
            boolean z = u.f12190a;
            com.vungle.ads.internal.util.t.a("TemplateDownloadManager", "Pre-download succeeded: " + str);
        }
        String str2 = this.f11906a;
        Throwable m8082exceptionOrNullimpl = Result.m8082exceptionOrNullimpl(value);
        if (m8082exceptionOrNullimpl != null) {
            AnalyticsClient.a(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.VM_TEMPLATE_PRE_DOWNLOAD_STATUS, 2L, null, str2, 4);
            boolean z2 = u.f12190a;
            com.vungle.ads.internal.util.t.b("TemplateDownloadManager", "Pre-download failed: " + str2 + ", error: " + m8082exceptionOrNullimpl.getMessage());
        }
        return Unit.INSTANCE;
    }
}
