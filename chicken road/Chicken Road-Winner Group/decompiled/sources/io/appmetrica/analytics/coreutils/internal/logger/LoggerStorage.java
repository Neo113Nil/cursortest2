package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f5434a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f5435b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f5436c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f5436c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f5436c = getOrCreatePublicLogger(str);
        return f5436c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        PublicLogger publicLogger;
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger2 = (PublicLogger) f5434a.get(str);
        if (publicLogger2 != null) {
            return publicLogger2;
        }
        synchronized (f5435b) {
            try {
                publicLogger = (PublicLogger) f5434a.get(str);
                if (publicLogger == null) {
                    publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                    f5434a.put(str, publicLogger);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f5434a = new HashMap();
        f5436c = PublicLogger.getAnonymousInstance();
    }
}
