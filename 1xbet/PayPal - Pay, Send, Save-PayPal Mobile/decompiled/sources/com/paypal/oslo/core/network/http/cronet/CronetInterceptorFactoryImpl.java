package com.paypal.oslo.core.network.http.cronet;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactoryImpl;", "Lcom/paypal/oslo/core/network/http/cronet/CronetInterceptorFactory;", "<init>", "()V", "Lorg/chromium/net/CronetEngine;", "engine", "Lokhttp3/Interceptor;", "createInterceptor", "(Lorg/chromium/net/CronetEngine;)Lokhttp3/Interceptor;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CronetInterceptorFactoryImpl implements com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory {
    @javax.inject.Inject
    public CronetInterceptorFactoryImpl() {
    }

    @Override // com.paypal.oslo.core.network.http.cronet.CronetInterceptorFactory
    public final okhttp3.Interceptor createInterceptor(org.chromium.net.CronetEngine engine) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(engine, "");
        com.google.net.cronet.okhttptransport.CronetInterceptor build = com.google.net.cronet.okhttptransport.CronetInterceptor.newBuilder(engine).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
