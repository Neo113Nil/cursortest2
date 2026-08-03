package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class q implements io.appmetrica.analytics.coreapi.internal.data.JsonParser {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billing.impl.g f3477a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.billing.impl.f f3478b;

    /* JADX WARN: Multi-variable type inference failed */
    public q() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig parse(org.json.JSONObject jSONObject) {
        io.appmetrica.analytics.billing.impl.s sVar;
        io.appmetrica.analytics.billing.impl.g gVar = this.f3477a;
        this.f3478b.getClass();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("auto_inapp_collecting");
        if (optJSONObject == null) {
            sVar = new io.appmetrica.analytics.billing.impl.s();
        } else {
            io.appmetrica.analytics.billing.impl.s sVar2 = new io.appmetrica.analytics.billing.impl.s();
            java.lang.Integer optIntOrNull = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optIntOrNull(optJSONObject, "send_frequency_seconds");
            if (optIntOrNull != null) {
                sVar2.f3481a = optIntOrNull.intValue();
            }
            java.lang.Integer optIntOrNull2 = io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optIntOrNull(optJSONObject, "first_collecting_inapp_max_age_seconds");
            if (optIntOrNull2 != null) {
                sVar2.f3482b = optIntOrNull2.intValue();
            }
            sVar = sVar2;
        }
        gVar.getClass();
        return new io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig(true, new io.appmetrica.analytics.billing.internal.config.BillingConfig(sVar.f3481a, sVar.f3482b));
    }

    public final io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig b(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Parser
    public final java.lang.Object parseOrNull(org.json.JSONObject jSONObject) {
        return (io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig) io.appmetrica.analytics.coreapi.internal.data.JsonParser.DefaultImpls.parseOrNull(this, jSONObject);
    }

    public q(io.appmetrica.analytics.billing.impl.g gVar, io.appmetrica.analytics.billing.impl.f fVar) {
        this.f3477a = gVar;
        this.f3478b = fVar;
    }

    public /* synthetic */ q(io.appmetrica.analytics.billing.impl.g gVar, io.appmetrica.analytics.billing.impl.f fVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.billing.impl.g() : gVar, (i2 & 2) != 0 ? new io.appmetrica.analytics.billing.impl.f() : fVar);
    }
}
