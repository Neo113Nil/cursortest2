package io.appmetrica.analytics.coreutils.internal.logger;

/* loaded from: classes.dex */
public abstract class LoggerStorage {

    /* renamed from: a, reason: collision with root package name */
    private static java.util.HashMap f3751a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f3752b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f3753c = io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance();

    public static io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger getMainPublicOrAnonymousLogger() {
        return f3753c;
    }

    public static io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger getOrCreateMainPublicLogger(java.lang.String str) {
        f3753c = getOrCreatePublicLogger(str);
        return f3753c;
    }

    public static io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger getOrCreatePublicLogger(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance();
        }
        io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger publicLogger = (io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger) f3751a.get(str);
        if (publicLogger == null) {
            synchronized (f3752b) {
                try {
                    publicLogger = (io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger) f3751a.get(str);
                    if (publicLogger == null) {
                        publicLogger = new io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger(io.appmetrica.analytics.coreutils.internal.ApiKeyUtils.createPartialApiKey(str));
                        f3751a.put(str, publicLogger);
                    }
                } finally {
                }
            }
        }
        return publicLogger;
    }

    public static void unsetPublicLoggers() {
        f3751a = new java.util.HashMap();
        f3753c = io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.getAnonymousInstance();
    }
}
