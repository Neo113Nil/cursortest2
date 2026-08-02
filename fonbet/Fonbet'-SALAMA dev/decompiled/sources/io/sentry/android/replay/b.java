package io.sentry.android.replay;

import io.sentry.IScope;
import io.sentry.ScopeCallback;
import io.sentry.android.replay.capture.CaptureStrategy;
import t6.p;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements ScopeCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14438a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f14439b;

    public /* synthetic */ b(p pVar, int i7) {
        this.f14438a = i7;
        this.f14439b = pVar;
    }

    @Override // io.sentry.ScopeCallback
    public final void run(IScope iScope) {
        switch (this.f14438a) {
            case 0:
                ReplayIntegration.onScreenshotRecorded$lambda$4(this.f14439b, iScope);
                break;
            default:
                CaptureStrategy.Companion.createSegment$lambda$0(this.f14439b, iScope);
                break;
        }
    }
}
