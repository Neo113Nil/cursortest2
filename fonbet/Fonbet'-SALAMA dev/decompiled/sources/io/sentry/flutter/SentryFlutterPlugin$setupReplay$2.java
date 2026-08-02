package io.sentry.flutter;

import A5.s;
import io.sentry.android.replay.Recorder;
import io.sentry.android.replay.ReplayIntegration;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class SentryFlutterPlugin$setupReplay$2 extends i implements s6.a {
    final /* synthetic */ SentryFlutterPlugin this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SentryFlutterPlugin$setupReplay$2(SentryFlutterPlugin sentryFlutterPlugin) {
        super(0);
        this.this$0 = sentryFlutterPlugin;
    }

    @Override // s6.a
    public final Recorder invoke() {
        s sVar;
        sVar = this.this$0.channel;
        if (sVar == null) {
            h.h("channel");
            throw null;
        }
        ReplayIntegration replayIntegration = SentryFlutterPlugin.replay;
        h.b(replayIntegration);
        return new SentryFlutterReplayRecorder(sVar, replayIntegration);
    }
}
