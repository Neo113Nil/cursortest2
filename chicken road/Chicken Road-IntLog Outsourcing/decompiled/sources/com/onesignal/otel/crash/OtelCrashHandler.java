package com.onesignal.otel.crash;

import B4.k;
import D4.AbstractC0024y;
import com.onesignal.otel.IOtelCrashHandler;
import com.onesignal.otel.IOtelCrashReporter;
import com.onesignal.otel.IOtelLogger;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import k4.C1224j;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class OtelCrashHandler implements Thread.UncaughtExceptionHandler, IOtelCrashHandler {
    private final IOtelCrashReporter crashReporter;
    private Thread.UncaughtExceptionHandler existingHandler;
    private volatile boolean initialized;
    private final IOtelLogger logger;
    private final List<Throwable> seenThrowables;

    public OtelCrashHandler(IOtelCrashReporter crashReporter, IOtelLogger logger) {
        i.e(crashReporter, "crashReporter");
        i.e(logger, "logger");
        this.crashReporter = crashReporter;
        this.logger = logger;
        this.seenThrowables = new ArrayList();
    }

    @Override // com.onesignal.otel.IOtelCrashHandler
    public void initialize() {
        if (this.initialized) {
            this.logger.warn("OtelCrashHandler already initialized, skipping");
            return;
        }
        this.logger.info("OtelCrashHandler: Setting up uncaught exception handler...");
        this.existingHandler = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(this);
        this.initialized = true;
        this.logger.info("OtelCrashHandler: ✅ Successfully initialized and registered as default uncaught exception handler");
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable throwable) {
        String message;
        i.e(thread, "thread");
        i.e(throwable, "throwable");
        synchronized (this.seenThrowables) {
            if (this.seenThrowables.contains(throwable)) {
                this.logger.warn("OtelCrashHandler: Ignoring duplicate throwable instance");
                return;
            }
            this.seenThrowables.add(throwable);
            this.logger.info("OtelCrashHandler: Uncaught exception detected - " + throwable.getClass().getSimpleName() + ": " + throwable.getMessage());
            boolean z = true;
            if (!k.R(throwable.getClass().getSimpleName(), "ApplicationNotResponding", true) && ((message = throwable.getMessage()) == null || !k.R(message, "Application Not Responding", true))) {
                z = false;
            }
            if (!z && !OtelCrashHandlerKt.isOneSignalAtFault(throwable)) {
                this.logger.debug("OtelCrashHandler: Crash is not OneSignal-related, delegating to existing handler");
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.existingHandler;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, throwable);
                    return;
                }
                return;
            }
            if (z) {
                this.logger.info("OtelCrashHandler: ANR exception caught (unusual - ANRs are usually detected by standalone detector)");
            }
            this.logger.info("OtelCrashHandler: OneSignal-related crash detected, saving crash report...");
            try {
                AbstractC0024y.q(C1224j.f10720a, new OtelCrashHandler$uncaughtException$2(this, thread, throwable, null));
                this.logger.info("OtelCrashHandler: Crash report saved successfully");
            } catch (Throwable th) {
                this.logger.error("OtelCrashHandler: Failed to save crash report: " + th.getMessage() + " - " + th.getClass().getSimpleName());
            }
            this.logger.info("OtelCrashHandler: Delegating to existing crash handler");
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler2 = this.existingHandler;
            if (uncaughtExceptionHandler2 != null) {
                uncaughtExceptionHandler2.uncaughtException(thread, throwable);
            }
        }
    }

    @Override // com.onesignal.otel.IOtelCrashHandler
    public void unregister() {
        if (!this.initialized) {
            this.logger.debug("OtelCrashHandler: Not initialized, nothing to unregister");
            return;
        }
        this.logger.info("OtelCrashHandler: Unregistering — restoring previous exception handler");
        Thread.setDefaultUncaughtExceptionHandler(this.existingHandler);
        this.existingHandler = null;
        this.initialized = false;
    }
}
