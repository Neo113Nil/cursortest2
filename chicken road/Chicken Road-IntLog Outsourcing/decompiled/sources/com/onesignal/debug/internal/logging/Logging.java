package com.onesignal.debug.internal.logging;

import B4.l;
import D4.AbstractC0024y;
import D4.E;
import D4.InterfaceC0022w;
import android.util.Log;
import com.onesignal.common.threading.ThreadUtilsKt;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.ILogListener;
import com.onesignal.debug.LogLevel;
import com.onesignal.debug.OneSignalLogEvent;
import com.onesignal.otel.IOtelOpenTelemetryRemote;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.i;
import n2.AbstractC1341c;
import t4.InterfaceC1441l;

/* loaded from: classes.dex */
public final class Logging {
    private static final String TAG = "OneSignal";
    private static IApplicationService applicationService;
    private static volatile IOtelOpenTelemetryRemote otelRemoteTelemetry;
    public static final Logging INSTANCE = new Logging();
    private static final CopyOnWriteArraySet<ILogListener> logListeners = new CopyOnWriteArraySet<>();
    private static volatile InterfaceC1441l shouldSendLogLevel = Logging$shouldSendLogLevel$1.INSTANCE;
    private static final InterfaceC0022w otelLoggingScope = AbstractC0024y.b(AbstractC1341c.A(AbstractC0024y.c(), E.f459a));
    private static LogLevel logLevel = LogLevel.WARN;
    private static LogLevel visualLogLevel = LogLevel.NONE;

    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogLevel.values().length];
            try {
                iArr[LogLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogLevel.DEBUG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LogLevel.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LogLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LogLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LogLevel.FATAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Logging() {
    }

    public static final boolean atLogLevel(LogLevel level) {
        i.e(level, "level");
        return level.compareTo(visualLogLevel) < 1 || level.compareTo(logLevel) < 1;
    }

    private final void callLogListeners(LogLevel logLevel2, String str, Throwable th) {
        CopyOnWriteArraySet<ILogListener> copyOnWriteArraySet = logListeners;
        if (copyOnWriteArraySet.isEmpty()) {
            return;
        }
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        Iterator<ILogListener> it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            it.next().onLogEvent(new OneSignalLogEvent(logLevel2, str));
        }
    }

    public static final void debug(String message, Throwable th) {
        i.e(message, "message");
        log(LogLevel.DEBUG, message, th);
    }

    public static /* synthetic */ void debug$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        debug(str, th);
    }

    public static final void error(String message, Throwable th) {
        i.e(message, "message");
        log(LogLevel.ERROR, message, th);
    }

    public static /* synthetic */ void error$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        error(str, th);
    }

    public static final void fatal(String message, Throwable th) {
        i.e(message, "message");
        log(LogLevel.FATAL, message, th);
    }

    public static /* synthetic */ void fatal$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        fatal(str, th);
    }

    public static final LogLevel getLogLevel() {
        return logLevel;
    }

    public static /* synthetic */ void getLogLevel$annotations() {
    }

    public static final LogLevel getVisualLogLevel() {
        return visualLogLevel;
    }

    public static /* synthetic */ void getVisualLogLevel$annotations() {
    }

    public static final void info(String message, Throwable th) {
        i.e(message, "message");
        log(LogLevel.INFO, message, th);
    }

    public static /* synthetic */ void info$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        info(str, th);
    }

    public static final void log(LogLevel level, String message) {
        i.e(level, "level");
        i.e(message, "message");
        log(level, message, null);
    }

    private final void logToLogcat(LogLevel logLevel2, String str, Throwable th) {
        if (logLevel2.compareTo(logLevel) >= 1) {
        }
        switch (WhenMappings.$EnumSwitchMapping$0[logLevel2.ordinal()]) {
            case 1:
                Log.v("OneSignal", str, th);
                break;
            case 2:
                Log.d("OneSignal", str, th);
                break;
            case 3:
                Log.i("OneSignal", str, th);
                break;
            case 4:
                Log.w("OneSignal", str, th);
                break;
            case 5:
            case 6:
                Log.e("OneSignal", str, th);
                break;
        }
    }

    private final void logToOtel(LogLevel logLevel2, String str, Throwable th) {
        IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote = otelRemoteTelemetry;
        if (iOtelOpenTelemetryRemote == null || logLevel2 == LogLevel.NONE || !((Boolean) shouldSendLogLevel.invoke(logLevel2)).booleanValue()) {
            return;
        }
        AbstractC0024y.n(otelLoggingScope, null, 0, new Logging$logToOtel$1(iOtelOpenTelemetryRemote, logLevel2, str, th, null), 3);
    }

    public static final void setLogLevel(LogLevel logLevel2) {
        i.e(logLevel2, "<set-?>");
        logLevel = logLevel2;
    }

    public static /* synthetic */ void setOtelTelemetry$default(Logging logging, IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, InterfaceC1441l interfaceC1441l, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            interfaceC1441l = Logging$setOtelTelemetry$1.INSTANCE;
        }
        logging.setOtelTelemetry(iOtelOpenTelemetryRemote, interfaceC1441l);
    }

    public static final void setVisualLogLevel(LogLevel logLevel2) {
        i.e(logLevel2, "<set-?>");
        visualLogLevel = logLevel2;
    }

    private final void showVisualLogging(LogLevel logLevel2, String str, Throwable th) {
        if (logLevel2.compareTo(visualLogLevel) >= 1) {
            return;
        }
        try {
            String E5 = l.E(str + '\n');
            if (th != null) {
                String str2 = E5 + th.getMessage();
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                E5 = str2 + stringWriter;
            }
            ThreadUtilsKt.suspendifyOnMain(new Logging$showVisualLogging$1(logLevel2, E5, null));
        } catch (Throwable th2) {
            Log.e("OneSignal", "Error showing logging message.", th2);
        }
    }

    public static final void verbose(String message, Throwable th) {
        i.e(message, "message");
        log(LogLevel.VERBOSE, message, th);
    }

    public static /* synthetic */ void verbose$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        verbose(str, th);
    }

    public static final void warn(String message, Throwable th) {
        i.e(message, "message");
        log(LogLevel.WARN, message, th);
    }

    public static /* synthetic */ void warn$default(String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        warn(str, th);
    }

    public final void addListener(ILogListener listener) {
        i.e(listener, "listener");
        logListeners.add(listener);
    }

    public final IApplicationService getApplicationService() {
        return applicationService;
    }

    public final void removeListener(ILogListener listener) {
        i.e(listener, "listener");
        logListeners.remove(listener);
    }

    public final void setApplicationService(IApplicationService iApplicationService) {
        applicationService = iApplicationService;
    }

    public final void setOtelTelemetry(IOtelOpenTelemetryRemote iOtelOpenTelemetryRemote, InterfaceC1441l shouldSend) {
        i.e(shouldSend, "shouldSend");
        otelRemoteTelemetry = iOtelOpenTelemetryRemote;
        shouldSendLogLevel = shouldSend;
    }

    public static final void log(LogLevel level, String message, Throwable th) {
        i.e(level, "level");
        i.e(message, "message");
        String str = "[" + Thread.currentThread().getName() + "] " + message;
        Logging logging = INSTANCE;
        logging.logToLogcat(level, str, th);
        logging.showVisualLogging(level, str, th);
        logging.callLogListeners(level, str, th);
        logging.logToOtel(level, str, th);
    }
}
