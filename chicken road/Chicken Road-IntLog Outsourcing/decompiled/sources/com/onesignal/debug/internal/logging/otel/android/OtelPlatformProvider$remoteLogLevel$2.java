package com.onesignal.debug.internal.logging.otel.android;

import com.onesignal.debug.LogLevel;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OtelPlatformProvider$remoteLogLevel$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OtelPlatformProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OtelPlatformProvider$remoteLogLevel$2(OtelPlatformProvider otelPlatformProvider) {
        super(0);
        this.this$0 = otelPlatformProvider;
    }

    @Override // t4.InterfaceC1430a
    public final String invoke() {
        OtelIdResolver otelIdResolver;
        try {
            otelIdResolver = this.this$0.idResolver;
            LogLevel resolveRemoteLogLevel = otelIdResolver.resolveRemoteLogLevel();
            if (resolveRemoteLogLevel != null) {
                return resolveRemoteLogLevel.name();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }
}
