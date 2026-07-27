package com.onesignal.debug.internal.logging.otel.android;

import com.onesignal.debug.internal.logging.Logging;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OtelPlatformProvider$crashStoragePath$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OtelPlatformProviderConfig $config;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelPlatformProvider$crashStoragePath$2(OtelPlatformProviderConfig otelPlatformProviderConfig) {
        super(0);
        this.$config = otelPlatformProviderConfig;
    }

    @Override // t4.InterfaceC1430a
    public final String invoke() {
        String crashStoragePath = this.$config.getCrashStoragePath();
        Logging.info$default("OneSignal: Crash logs stored at: " + crashStoragePath, null, 2, null);
        return crashStoragePath;
    }
}
