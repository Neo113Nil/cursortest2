package io.appmetrica.analytics.networktasks.internal;

/* loaded from: classes.dex */
public class DefaultNetworkResponseHandler implements io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler<io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response> {

    /* renamed from: a, reason: collision with root package name */
    private final io.appmetrica.analytics.networktasks.internal.DefaultResponseParser f7386a;

    public DefaultNetworkResponseHandler() {
        this(new io.appmetrica.analytics.networktasks.internal.DefaultResponseParser());
    }

    public DefaultNetworkResponseHandler(io.appmetrica.analytics.networktasks.internal.DefaultResponseParser defaultResponseParser) {
        this.f7386a = defaultResponseParser;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.appmetrica.analytics.networktasks.internal.NetworkResponseHandler
    public io.appmetrica.analytics.networktasks.internal.DefaultResponseParser.Response handle(io.appmetrica.analytics.networktasks.internal.ResponseDataHolder responseDataHolder) {
        if (200 == responseDataHolder.getResponseCode()) {
            return this.f7386a.parse(responseDataHolder.getResponseData());
        }
        return null;
    }
}
