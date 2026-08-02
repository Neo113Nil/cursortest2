package com.paypal.oslo.feature.paypalassistant.linkhandler;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/paypalassistant/linkhandler/WebSchemeHandler;", "Lcom/paypal/oslo/feature/paypalassistant/linkhandler/SchemeHandler;", "<init>", "()V", "", "url", "", "handleLink", "(Ljava/lang/String;)Z", "", "supportedSchemes", "Ljava/util/Set;", "getSupportedSchemes", "()Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class WebSchemeHandler implements com.paypal.oslo.feature.paypalassistant.linkhandler.SchemeHandler {
    public static final int $stable = 8;
    private final java.util.Set<java.lang.String> supportedSchemes = kotlin.collections.SetsKt.setOf("https");

    @javax.inject.Inject
    public WebSchemeHandler() {
    }

    @Override // com.paypal.oslo.feature.paypalassistant.linkhandler.SchemeHandler
    public final java.util.Set<java.lang.String> getSupportedSchemes() {
        return this.supportedSchemes;
    }

    @Override // com.paypal.oslo.feature.paypalassistant.linkhandler.SchemeHandler
    public final boolean handleLink(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "");
        return true;
    }
}
