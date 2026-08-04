package io.sentry.android.core.internal.modules;

import E2.f;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.RootViewsSpy;
import io.sentry.android.replay.WindowRecorder;
import io.sentry.logger.LoggerBatchProcessor;
import p148u5.c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14388b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f14387a = i7;
        this.f14388b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14387a) {
            case 0:
                ((AssetsModulesLoader) this.f14388b).lambda$new$0();
                break;
            case 1:
                ReplayIntegration.finalizePreviousReplay$lambda$10((ReplayIntegration) this.f14388b);
                break;
            case 2:
                RootViewsSpy.Companion.install$lambda$1$lambda$0((RootViewsSpy) this.f14388b);
                break;
            case 3:
                WindowRecorder.onConfigurationChanged$lambda$1((WindowRecorder) this.f14388b);
                break;
            case 4:
                ((LoggerBatchProcessor) this.f14388b).lambda$close$0();
                break;
            default:
                ((FlutterJNI) ((c) ((f) this.f14388b).f1918c).f16886e).prefetchDefaultFontManager();
                break;
        }
    }
}
