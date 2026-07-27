package io.appmetrica.analytics.coreutils.internal.logger;

import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static HashMap f6254a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Object f6255b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile PublicLogger f6256c = PublicLogger.getAnonymousInstance();

    public static PublicLogger getMainPublicOrAnonymousLogger() {
        return f6256c;
    }

    public static PublicLogger getOrCreateMainPublicLogger(String str) {
        f6256c = getOrCreatePublicLogger(str);
        return f6256c;
    }

    public static PublicLogger getOrCreatePublicLogger(String str) {
        if (TextUtils.isEmpty(str)) {
            return PublicLogger.getAnonymousInstance();
        }
        PublicLogger publicLogger = (PublicLogger) f6254a.get(str);
        if (publicLogger == null) {
            synchronized (f6255b) {
                try {
                    publicLogger = (PublicLogger) f6254a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new PublicLogger(ApiKeyUtils.createPartialApiKey(str));
                        f6254a.put(str, publicLogger);
                    }
                } finally {
                }
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f6254a = new HashMap();
        f6256c = PublicLogger.getAnonymousInstance();
    }
}
