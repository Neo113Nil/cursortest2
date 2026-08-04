package io.sentry.android.core;

import android.app.Activity;
import android.graphics.Bitmap;
import io.sentry.Attachment;
import io.sentry.EventProcessor;
import io.sentry.Hint;
import io.sentry.SentryEvent;
import io.sentry.SentryLevel;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.internal.util.AndroidCurrentDateProvider;
import io.sentry.android.core.internal.util.Debouncer;
import io.sentry.android.core.internal.util.ScreenshotUtils;
import io.sentry.protocol.SentryTransaction;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenshotEventProcessor implements EventProcessor {
    private static final int DEBOUNCE_MAX_EXECUTIONS = 3;
    private static final long DEBOUNCE_WAIT_TIME_MS = 2000;
    private final BuildInfoProvider buildInfoProvider;
    private final Debouncer debouncer = new Debouncer(AndroidCurrentDateProvider.getInstance(), DEBOUNCE_WAIT_TIME_MS, 3);
    private final SentryAndroidOptions options;

    public ScreenshotEventProcessor(SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        if (sentryAndroidOptions.isAttachScreenshot()) {
            IntegrationUtils.addIntegrationToSdkVersion("Screenshot");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ byte[] lambda$process$0(Bitmap bitmap) {
        return ScreenshotUtils.compressBitmapToPng(bitmap, this.options.getLogger());
    }

    @Override // io.sentry.EventProcessor
    public Long getOrder() {
        return 10000L;
    }

    @Override // io.sentry.EventProcessor
    public SentryTransaction process(SentryTransaction sentryTransaction, Hint hint) {
        return sentryTransaction;
    }

    @Override // io.sentry.EventProcessor
    public SentryEvent process(SentryEvent sentryEvent, Hint hint) {
        if (!sentryEvent.isErrored()) {
            return sentryEvent;
        }
        if (!this.options.isAttachScreenshot()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "attachScreenshot is disabled.", new Object[0]);
            return sentryEvent;
        }
        Activity activity = CurrentActivityHolder.getInstance().getActivity();
        if (activity != null && !HintUtils.isFromHybridSdk(hint)) {
            boolean zCheckForDebounce = this.debouncer.checkForDebounce();
            SentryAndroidOptions.BeforeCaptureCallback beforeScreenshotCaptureCallback = this.options.getBeforeScreenshotCaptureCallback();
            if (beforeScreenshotCaptureCallback != null) {
                if (!beforeScreenshotCaptureCallback.execute(sentryEvent, hint, zCheckForDebounce)) {
                    return sentryEvent;
                }
            } else if (zCheckForDebounce) {
                return sentryEvent;
            }
            Bitmap bitmapCaptureScreenshot = ScreenshotUtils.captureScreenshot(activity, this.options.getThreadChecker(), this.options.getLogger(), this.buildInfoProvider);
            if (bitmapCaptureScreenshot == null) {
                return sentryEvent;
            }
            hint.setScreenshot(Attachment.fromByteProvider(new o(this, bitmapCaptureScreenshot, 1), "screenshot.png", "image/png", false));
            hint.set(TypeCheckHint.ANDROID_ACTIVITY, activity);
        }
        return sentryEvent;
    }
}
