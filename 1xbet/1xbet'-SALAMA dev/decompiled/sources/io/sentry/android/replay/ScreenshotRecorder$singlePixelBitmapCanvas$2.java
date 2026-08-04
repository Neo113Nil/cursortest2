package io.sentry.android.replay;

import android.graphics.Canvas;
import t6.i;

/* JADX INFO: loaded from: classes2.dex */
public final class ScreenshotRecorder$singlePixelBitmapCanvas$2 extends i implements s6.a {
    final /* synthetic */ ScreenshotRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScreenshotRecorder$singlePixelBitmapCanvas$2(ScreenshotRecorder screenshotRecorder) {
        super(0);
        this.this$0 = screenshotRecorder;
    }

    @Override // s6.a
    public final Canvas invoke() {
        return new Canvas(this.this$0.getSinglePixelBitmap());
    }
}
