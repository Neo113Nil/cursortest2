package io.appmetrica.analytics.billing.impl;

/* loaded from: classes.dex */
public final class p implements io.appmetrica.analytics.coreapi.internal.data.Converter {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.billing.impl.r f3476a;

    /* JADX WARN: Multi-variable type inference failed */
    public p() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig remoteBillingConfig) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f3476a.fromModel(remoteBillingConfig));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final java.lang.Object fromModel(java.lang.Object obj) {
        return io.appmetrica.analytics.protobuf.nano.MessageNano.toByteArray(this.f3476a.fromModel((io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig) obj));
    }

    public p(io.appmetrica.analytics.billing.impl.r rVar) {
        this.f3476a = rVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.billing.internal.config.RemoteBillingConfig toModel(byte[] bArr) {
        io.appmetrica.analytics.billing.impl.t tVar;
        try {
            tVar = (io.appmetrica.analytics.billing.impl.t) io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(new io.appmetrica.analytics.billing.impl.t(), bArr);
        } catch (java.lang.Throwable unused) {
            tVar = new io.appmetrica.analytics.billing.impl.t();
        }
        return this.f3476a.toModel(tVar);
    }

    public /* synthetic */ p(io.appmetrica.analytics.billing.impl.r rVar, int i2, kotlin.jvm.internal.e eVar) {
        this((i2 & 1) != 0 ? new io.appmetrica.analytics.billing.impl.r(null, 1, null) : rVar);
    }
}
