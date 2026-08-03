package io.appmetrica.analytics.logger.appmetrica.internal;

/* loaded from: classes.dex */
public final class PublicLogger extends io.appmetrica.analytics.logger.common.BaseReleaseLogger {
    public static final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion Companion = new io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger f7267a = new io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger("");

    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.e eVar) {
            this();
        }

        public final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger getAnonymousInstance() {
            return io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger.f7267a;
        }

        public final void init(android.content.Context context) {
            io.appmetrica.analytics.logger.common.BaseReleaseLogger.init(context);
        }

        private Companion() {
        }
    }

    public PublicLogger(java.lang.String str) {
        super("AppMetrica", "[" + str + ']');
    }

    public static final io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
