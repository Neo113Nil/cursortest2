package io.sentry.flutter;

import io.sentry.Integration;
import io.sentry.android.replay.ReplayIntegration;
import kotlin.jvm.functions.Function1;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutterPlugin$setupReplay$1 extends i implements Function1 {
    public static final SentryFlutterPlugin$setupReplay$1 INSTANCE = new SentryFlutterPlugin$setupReplay$1();

    public SentryFlutterPlugin$setupReplay$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Integration integration) {
        return Boolean.valueOf(integration instanceof ReplayIntegration);
    }
}
