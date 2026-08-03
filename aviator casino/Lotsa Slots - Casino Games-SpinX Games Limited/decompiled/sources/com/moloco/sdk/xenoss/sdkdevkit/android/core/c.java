package com.moloco.sdk.xenoss.sdkdevkit.android.core;

/* loaded from: classes5.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.core.UserAgentService {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f7984a = "WebBrowserUserAgentService";
    public final kotlin.Lazy b = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.core.c$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final java.lang.Object invoke() {
            return com.moloco.sdk.xenoss.sdkdevkit.android.core.c.a(com.moloco.sdk.xenoss.sdkdevkit.android.core.c.this);
        }
    });

    public final java.lang.String a() {
        return (java.lang.String) this.b.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.core.UserAgentService
    public java.lang.String invoke() {
        return a();
    }

    public static final java.lang.String a(com.moloco.sdk.xenoss.sdkdevkit.android.core.c cVar) {
        try {
            java.lang.String property = java.lang.System.getProperty("http.agent");
            return property != null ? kotlin.text.StringsKt.isBlank(property) ? "" : property : "";
        } catch (java.lang.Exception e) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, cVar.f7984a, e.toString(), null, false, 12, null);
            return "";
        }
    }
}
