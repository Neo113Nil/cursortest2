package com.onesignal.debug.internal.crash;

import android.content.Context;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.debug.internal.logging.otel.android.OtelPlatformProviderKt;
import com.onesignal.otel.IOtelCrashHandler;
import com.onesignal.otel.IOtelLogger;
import com.onesignal.otel.OtelFactory;
import kotlin.jvm.internal.i;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalCrashHandlerFactory {
    public static final OneSignalCrashHandlerFactory INSTANCE = new OneSignalCrashHandlerFactory();

    private OneSignalCrashHandlerFactory() {
    }

    public final IOtelCrashHandler createCrashHandler(Context context, IOtelLogger logger, InterfaceC1430a featureManagerProvider) {
        i.e(context, "context");
        i.e(logger, "logger");
        i.e(featureManagerProvider, "featureManagerProvider");
        if (!OtelSdkSupport.INSTANCE.isSupported()) {
            throw new IllegalArgumentException("createCrashHandler called on unsupported SDK (< 26)");
        }
        Logging.info$default("OneSignal: Creating Otel crash handler (SDK >= 26)", null, 2, null);
        return OtelFactory.INSTANCE.createCrashHandler(OtelPlatformProviderKt.createAndroidOtelPlatformProvider(context, featureManagerProvider), logger);
    }
}
