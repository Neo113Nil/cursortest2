package io.sentry.util;

import io.sentry.CheckIn;
import io.sentry.CheckInStatus;
import io.sentry.DateUtils;
import io.sentry.FilterString;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.MonitorConfig;
import io.sentry.Sentry;
import io.sentry.protocol.SentryId;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class CheckInUtils {
    public static boolean isIgnored(List<FilterString> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<FilterString> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().getFilterString().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            Iterator<FilterString> it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    if (it2.next().matches(str)) {
                        return true;
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return false;
    }

    public static <U> U withCheckIn(String str, String str2, MonitorConfig monitorConfig, Callable<U> callable) {
        ISentryLifecycleToken iSentryLifecycleTokenMakeCurrent = Sentry.forkedScopes("CheckInUtils").makeCurrent();
        try {
            IScopes currentScopes = Sentry.getCurrentScopes();
            long jCurrentTimeMillis = System.currentTimeMillis();
            TracingUtils.startNewTrace(currentScopes);
            CheckIn checkIn = new CheckIn(str, CheckInStatus.IN_PROGRESS);
            if (monitorConfig != null) {
                checkIn.setMonitorConfig(monitorConfig);
            }
            if (str2 != null) {
                checkIn.setEnvironment(str2);
            }
            SentryId sentryIdCaptureCheckIn = currentScopes.captureCheckIn(checkIn);
            try {
                U uCall = callable.call();
                CheckIn checkIn2 = new CheckIn(sentryIdCaptureCheckIn, str, CheckInStatus.OK);
                if (str2 != null) {
                    checkIn2.setEnvironment(str2);
                }
                checkIn2.setDuration(Double.valueOf(DateUtils.millisToSeconds(System.currentTimeMillis() - jCurrentTimeMillis)));
                currentScopes.captureCheckIn(checkIn2);
                if (iSentryLifecycleTokenMakeCurrent != null) {
                    iSentryLifecycleTokenMakeCurrent.close();
                }
                return uCall;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CheckIn checkIn3 = new CheckIn(sentryIdCaptureCheckIn, str, CheckInStatus.ERROR);
                    if (str2 != null) {
                        checkIn3.setEnvironment(str2);
                    }
                    checkIn3.setDuration(Double.valueOf(DateUtils.millisToSeconds(System.currentTimeMillis() - jCurrentTimeMillis)));
                    currentScopes.captureCheckIn(checkIn3);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (iSentryLifecycleTokenMakeCurrent != null) {
                try {
                    iSentryLifecycleTokenMakeCurrent.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    public static <U> U withCheckIn(String str, MonitorConfig monitorConfig, Callable<U> callable) {
        return (U) withCheckIn(str, null, monitorConfig, callable);
    }

    public static <U> U withCheckIn(String str, String str2, Callable<U> callable) {
        return (U) withCheckIn(str, str2, null, callable);
    }

    public static <U> U withCheckIn(String str, Callable<U> callable) {
        return (U) withCheckIn(str, null, null, callable);
    }
}
