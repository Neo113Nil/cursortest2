package com.paypal.oslo.core.network.http.cronet;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J1\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\n\u0010\u000bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/network/http/cronet/CronetEngineFactory;", "", "Landroid/content/Context;", "context", "", "enableSslPinning", "verifySslCert", "Lcom/paypal/oslo/core/network/http/config/CacheType;", "cacheType", "Lorg/chromium/net/CronetEngine;", "createEngine", "(Landroid/content/Context;ZZLcom/paypal/oslo/core/network/http/config/CacheType;)Lorg/chromium/net/CronetEngine;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface CronetEngineFactory {
    org.chromium.net.CronetEngine createEngine(android.content.Context context, boolean enableSslPinning, boolean verifySslCert, com.paypal.oslo.core.network.http.config.CacheType cacheType);
}
