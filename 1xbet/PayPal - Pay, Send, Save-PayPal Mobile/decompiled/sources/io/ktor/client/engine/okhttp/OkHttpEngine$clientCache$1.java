package io.ktor.client.engine.okhttp;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
final /* synthetic */ class OkHttpEngine$clientCache$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<io.ktor.client.plugins.HttpTimeoutConfig, okhttp3.OkHttpClient> {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public final okhttp3.OkHttpClient invoke(io.ktor.client.plugins.HttpTimeoutConfig httpTimeoutConfig) {
        return io.ktor.client.engine.okhttp.OkHttpEngine.access$createOkHttpClient((io.ktor.client.engine.okhttp.OkHttpEngine) this.receiver, httpTimeoutConfig);
    }

    OkHttpEngine$clientCache$1(java.lang.Object obj) {
        super(1, obj, io.ktor.client.engine.okhttp.OkHttpEngine.class, "createOkHttpClient", "createOkHttpClient(Lio/ktor/client/plugins/HttpTimeoutConfig;)Lokhttp3/OkHttpClient;", 0);
    }
}
