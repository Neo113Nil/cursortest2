package com.unity3d.ads.core.domain;

/* compiled from: HandleDebugSettings.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/unity3d/ads/core/domain/HandleDebugSettings;", "", "logger", "Lcom/unity3d/ads/core/log/Logger;", "(Lcom/unity3d/ads/core/log/Logger;)V", "invoke", "", "debugSettings", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$DebugSettings;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HandleDebugSettings {
    private final com.unity3d.ads.core.log.Logger logger;

    public HandleDebugSettings(com.unity3d.ads.core.log.Logger logger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
    }

    public final void invoke(gatewayprotocol.v1.NativeConfigurationOuterClass.DebugSettings debugSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debugSettings, "debugSettings");
        if (debugSettings.getEnableTracing()) {
            this.logger.setLogLevel(com.unity3d.ads.core.log.LogLevel.TRACE);
        }
        android.webkit.WebView.setWebContentsDebuggingEnabled(debugSettings.getWebviewInspectable());
    }
}
