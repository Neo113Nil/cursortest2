package io.sentry.android.replay;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.semantics.SemanticsPropertyKey;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class SentryReplayModifiers {
    public static final SentryReplayModifiers INSTANCE = new SentryReplayModifiers();
    private static final SemanticsPropertyKey<String> SentryPrivacy = new SemanticsPropertyKey<>("SentryPrivacy", SentryReplayModifiers$SentryPrivacy$1.INSTANCE);
    public static final int $stable = SemanticsPropertyKey.$stable;

    private SentryReplayModifiers() {
    }

    public final SemanticsPropertyKey<String> getSentryPrivacy() {
        return SentryPrivacy;
    }
}
