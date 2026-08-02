package com.paypal.oslo.core.network.http.cronet;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProviderImpl;", "Lcom/paypal/oslo/core/network/http/cronet/CronetBuilderProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Lorg/chromium/net/CronetEngine$Builder;", "createBuilder", "(Landroid/content/Context;)Lorg/chromium/net/CronetEngine$Builder;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CronetBuilderProviderImpl implements com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider {
    @javax.inject.Inject
    public CronetBuilderProviderImpl() {
    }

    @Override // com.paypal.oslo.core.network.http.cronet.CronetBuilderProvider
    public final org.chromium.net.CronetEngine.Builder createBuilder(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        com.google.android.gms.net.CronetProviderInstaller.installProvider(context);
        return new org.chromium.net.CronetEngine.Builder(context);
    }
}
