package io.sentry.android.core.internal.modules;

import E2.f;
import io.flutter.embedding.engine.FlutterJNI;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.RootViewsSpy;
import io.sentry.android.replay.WindowRecorder;
import io.sentry.logger.LoggerBatchProcessor;
import u5.C1649c;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f14382b;

    public /* synthetic */ a(Object obj, int i7) {
        this.f14381a = i7;
        this.f14382b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14381a) {
            case 0:
                ((AssetsModulesLoader) this.f14382b).lambda$new$0();
                break;
            case 1:
                ReplayIntegration.finalizePreviousReplay$lambda$10((ReplayIntegration) this.f14382b);
                break;
            case 2:
                RootViewsSpy.Companion.install$lambda$1$lambda$0((RootViewsSpy) this.f14382b);
                break;
            case 3:
                WindowRecorder.onConfigurationChanged$lambda$1((WindowRecorder) this.f14382b);
                break;
            case 4:
                ((LoggerBatchProcessor) this.f14382b).lambda$close$0();
                break;
            default:
                ((FlutterJNI) ((C1649c) ((f) this.f14382b).f1918c).f16880e).prefetchDefaultFontManager();
                break;
        }
    }
}
