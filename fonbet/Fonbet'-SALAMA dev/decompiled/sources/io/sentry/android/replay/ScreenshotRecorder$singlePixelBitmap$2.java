package io.sentry.android.replay;

import android.graphics.Bitmap;
import t6.h;
import t6.i;

/* loaded from: classes2.dex */
public final class ScreenshotRecorder$singlePixelBitmap$2 extends i implements s6.a {
    public static final ScreenshotRecorder$singlePixelBitmap$2 INSTANCE = new ScreenshotRecorder$singlePixelBitmap$2();

    public ScreenshotRecorder$singlePixelBitmap$2() {
        super(0);
    }

    @Override // s6.a
    public final Bitmap invoke() {
        Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        h.d(createBitmap, "createBitmap(1, 1, Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }
}
