package com.onesignal.otel;

import com.onesignal.otel.attributes.OtelFieldsPerEvent;
import com.onesignal.otel.attributes.OtelFieldsTopLevel;
import com.onesignal.otel.crash.OtelCrashHandler;
import com.onesignal.otel.crash.OtelCrashReporter;
import com.onesignal.otel.crash.OtelCrashUploader;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelFactory {
    public static final OtelFactory INSTANCE = new OtelFactory();

    private OtelFactory() {
    }

    public final IOtelCrashHandler createCrashHandler(IOtelPlatformProvider platformProvider, IOtelLogger logger) {
        i.e(platformProvider, "platformProvider");
        i.e(logger, "logger");
        return new OtelCrashHandler(createCrashReporter(createCrashLocalTelemetry(platformProvider), logger), logger);
    }

    public final IOtelOpenTelemetryCrash createCrashLocalTelemetry(IOtelPlatformProvider platformProvider) {
        i.e(platformProvider, "platformProvider");
        return new OneSignalOpenTelemetryCrashLocal(platformProvider, new OtelFieldsTopLevel(platformProvider), new OtelFieldsPerEvent(platformProvider));
    }

    public final IOtelCrashReporter createCrashReporter(IOtelOpenTelemetryCrash openTelemetryCrash, IOtelLogger logger) {
        i.e(openTelemetryCrash, "openTelemetryCrash");
        i.e(logger, "logger");
        return new OtelCrashReporter(openTelemetryCrash, logger);
    }

    public final OtelCrashUploader createCrashUploader(IOtelPlatformProvider platformProvider, IOtelLogger logger) {
        i.e(platformProvider, "platformProvider");
        i.e(logger, "logger");
        return new OtelCrashUploader(new OneSignalOpenTelemetryRemote(platformProvider, new OtelFieldsTopLevel(platformProvider), new OtelFieldsPerEvent(platformProvider)), platformProvider, logger);
    }

    public final IOtelOpenTelemetryRemote createRemoteTelemetry(IOtelPlatformProvider platformProvider) {
        i.e(platformProvider, "platformProvider");
        return new OneSignalOpenTelemetryRemote(platformProvider, new OtelFieldsTopLevel(platformProvider), new OtelFieldsPerEvent(platformProvider));
    }
}
