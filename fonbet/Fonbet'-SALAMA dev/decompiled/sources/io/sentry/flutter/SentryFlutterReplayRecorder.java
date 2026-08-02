package io.sentry.flutter;

import A5.s;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f6.C1111d;
import g6.AbstractC1170s;
import io.sentry.android.replay.Recorder;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.cache.f;
import io.sentry.rrweb.RRWebVideoEvent;
import t6.h;

/* loaded from: classes2.dex */
public final class SentryFlutterReplayRecorder implements Recorder {
    private final s channel;
    private final ReplayIntegration integration;

    public SentryFlutterReplayRecorder(s sVar, ReplayIntegration replayIntegration) {
        h.e(sVar, "channel");
        h.e(replayIntegration, "integration");
        this.channel = sVar;
        this.integration = replayIntegration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$2(SentryFlutterReplayRecorder sentryFlutterReplayRecorder, ScreenshotRecorderConfig screenshotRecorderConfig) {
        try {
            sentryFlutterReplayRecorder.channel.a("ReplayRecorder.onConfigurationChanged", AbstractC1170s.M0(new C1111d("width", Integer.valueOf(screenshotRecorderConfig.getRecordingWidth())), new C1111d("height", Integer.valueOf(screenshotRecorderConfig.getRecordingHeight())), new C1111d(RRWebVideoEvent.JsonKeys.FRAME_RATE, Integer.valueOf(screenshotRecorderConfig.getFrameRate()))), null);
        } catch (Exception e7) {
            Log.w("Sentry", "Failed to propagate configuration change to Flutter", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void pause$lambda$4(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.channel.a("ReplayRecorder.pause", null, null);
        } catch (Exception e7) {
            Log.w("Sentry", "Failed to pause replay recorder", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$3(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.channel.a("ReplayRecorder.reset", null, null);
        } catch (Exception e7) {
            Log.w("Sentry", "Failed to reset replay recorder", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void resume$lambda$1(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.channel.a("ReplayRecorder.resume", null, null);
        } catch (Exception e7) {
            Log.w("Sentry", "Failed to resume replay recorder", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.channel.a("ReplayRecorder.start", AbstractC1170s.L0(new C1111d("replayId", sentryFlutterReplayRecorder.integration.getReplayId().toString())), null);
        } catch (Exception e7) {
            Log.w("Sentry", "Failed to start replay recorder", e7);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$5(SentryFlutterReplayRecorder sentryFlutterReplayRecorder) {
        try {
            sentryFlutterReplayRecorder.channel.a("ReplayRecorder.stop", null, null);
        } catch (Exception e7) {
            Log.w("Sentry", "Failed to stop replay recorder", e7);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        stop();
    }

    @Override // io.sentry.android.replay.Recorder
    public void onConfigurationChanged(ScreenshotRecorderConfig screenshotRecorderConfig) {
        h.e(screenshotRecorderConfig, "config");
        new Handler(Looper.getMainLooper()).post(new f(4, this, screenshotRecorderConfig));
    }

    @Override // io.sentry.android.replay.Recorder
    public void pause() {
        new Handler(Looper.getMainLooper()).post(new a(this, 1));
    }

    @Override // io.sentry.android.replay.Recorder
    public void reset() {
        new Handler(Looper.getMainLooper()).post(new a(this, 4));
    }

    @Override // io.sentry.android.replay.Recorder
    public void resume() {
        new Handler(Looper.getMainLooper()).post(new a(this, 3));
    }

    @Override // io.sentry.android.replay.Recorder
    public void start() {
        new Handler(Looper.getMainLooper()).post(new a(this, 0));
    }

    @Override // io.sentry.android.replay.Recorder
    public void stop() {
        new Handler(Looper.getMainLooper()).post(new a(this, 2));
    }
}
