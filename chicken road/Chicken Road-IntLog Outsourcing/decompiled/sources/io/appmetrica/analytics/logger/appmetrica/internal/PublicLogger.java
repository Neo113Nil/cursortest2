package io.appmetrica.analytics.logger.appmetrica.internal;

import B0.o;
import io.appmetrica.analytics.logger.common.BaseReleaseLogger;
import kotlin.jvm.internal.e;

/* loaded from: classes.dex */
public final class PublicLogger extends BaseReleaseLogger {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private static final PublicLogger f9753a = new PublicLogger("");

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        public final PublicLogger getAnonymousInstance() {
            return PublicLogger.f9753a;
        }

        private Companion() {
        }
    }

    public PublicLogger(String str) {
        super("AppMetrica", o.j("[", str, ']'));
    }

    public static final PublicLogger getAnonymousInstance() {
        return Companion.getAnonymousInstance();
    }
}
