package io.sentry.android.replay;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes2.dex */
public interface ScreenshotRecorderCallback {
    void onScreenshotRecorded(Bitmap bitmap);

    void onScreenshotRecorded(File file, long j);
}
