package io.sentry.android.replay;

import io.sentry.SentryReplayOptions;
import t6.h;

/* loaded from: classes2.dex */
public final class SessionReplayOptionsKt {
    public static final boolean getMaskAllImages(SentryReplayOptions sentryReplayOptions) {
        h.e(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final boolean getMaskAllText(SentryReplayOptions sentryReplayOptions) {
        h.e(sentryReplayOptions, "<this>");
        throw new IllegalStateException("Getter not supported");
    }

    public static final void setMaskAllImages(SentryReplayOptions sentryReplayOptions, boolean z4) {
        h.e(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllImages(z4);
    }

    public static final void setMaskAllText(SentryReplayOptions sentryReplayOptions, boolean z4) {
        h.e(sentryReplayOptions, "<this>");
        sentryReplayOptions.setMaskAllText(z4);
    }
}
