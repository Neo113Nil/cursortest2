package io.sentry.util;

import W5.AbstractC0486a1;
import io.sentry.ManifestVersionDetector;
import io.sentry.NoopVersionDetector;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;

/* loaded from: classes2.dex */
public final class InitUtil {
    public static boolean shouldInit(SentryOptions sentryOptions, SentryOptions sentryOptions2, boolean z4) {
        if (Platform.isJvm() && (sentryOptions2.getVersionDetector() instanceof NoopVersionDetector)) {
            sentryOptions2.setVersionDetector(new ManifestVersionDetector(sentryOptions2));
        }
        if (!sentryOptions2.getVersionDetector().checkForMixedVersions()) {
            return !z4 || sentryOptions == null || sentryOptions2.isForceInit() || sentryOptions.getInitPriority().ordinal() <= sentryOptions2.getInitPriority().ordinal();
        }
        sentryOptions2.getLogger().log(SentryLevel.ERROR, "Not initializing Sentry because mixed SDK versions have been detected.", new Object[0]);
        throw new IllegalStateException(AbstractC0486a1.h("Sentry SDK has detected a mix of versions. This is not supported and likely leads to crashes. Please always use the same version of all SDK modules (dependencies). See ", Platform.isAndroid() ? "https://docs.sentry.io/platforms/android/troubleshooting/mixed-versions" : "https://docs.sentry.io/platforms/java/troubleshooting/mixed-versions", " for more details."));
    }
}
