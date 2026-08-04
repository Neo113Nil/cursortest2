package io.sentry.android.replay;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.android.replay.capture.CaptureStrategy;
import t6.p;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements ScopeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f14445b;

    public /* synthetic */ b(p pVar, int i7) {
        this.f14444a = i7;
        this.f14445b = pVar;
    }

    @Override // io.sentry.ScopeCallback
    public final void run(IScope iScope) {
        switch (this.f14444a) {
            case 0:
                ReplayIntegration.onScreenshotRecorded$lambda$4(this.f14445b, iScope);
                break;
            default:
                CaptureStrategy.Companion.createSegment$lambda$0(this.f14445b, iScope);
                break;
        }
    }
}
