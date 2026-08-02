package io.sentry.android.replay;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import io.sentry.SentryReplayOptions;
import q2.g;
import t6.e;
import t6.h;

@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class ScreenshotRecorderConfig {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final int bitRate;
    private final int frameRate;
    private final int recordingHeight;
    private final int recordingWidth;
    private final float scaleFactorX;
    private final float scaleFactorY;

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private final int adjustToBlockSize(int i7) {
            int i8 = i7 % 16;
            return i8 <= 8 ? i7 - i8 : i7 + (16 - i8);
        }

        public final ScreenshotRecorderConfig fromSize(Context context, SentryReplayOptions sentryReplayOptions, int i7, int i8) {
            h.e(context, "context");
            h.e(sentryReplayOptions, "sessionReplay");
            float f7 = i8;
            Integer valueOf = Integer.valueOf(adjustToBlockSize(g.d((f7 / context.getResources().getDisplayMetrics().density) * sentryReplayOptions.getQuality().sizeScale)));
            float f8 = i7;
            Integer valueOf2 = Integer.valueOf(adjustToBlockSize(g.d((f8 / context.getResources().getDisplayMetrics().density) * sentryReplayOptions.getQuality().sizeScale)));
            int intValue = valueOf.intValue();
            int intValue2 = valueOf2.intValue();
            return new ScreenshotRecorderConfig(intValue2, intValue, intValue2 / f8, intValue / f7, sentryReplayOptions.getFrameRate(), sentryReplayOptions.getQuality().bitRate);
        }

        private Companion() {
        }
    }

    public ScreenshotRecorderConfig(int i7, int i8, float f7, float f8, int i9, int i10) {
        this.recordingWidth = i7;
        this.recordingHeight = i8;
        this.scaleFactorX = f7;
        this.scaleFactorY = f8;
        this.frameRate = i9;
        this.bitRate = i10;
    }

    public static /* synthetic */ ScreenshotRecorderConfig copy$default(ScreenshotRecorderConfig screenshotRecorderConfig, int i7, int i8, float f7, float f8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i7 = screenshotRecorderConfig.recordingWidth;
        }
        if ((i11 & 2) != 0) {
            i8 = screenshotRecorderConfig.recordingHeight;
        }
        int i12 = i8;
        if ((i11 & 4) != 0) {
            f7 = screenshotRecorderConfig.scaleFactorX;
        }
        float f9 = f7;
        if ((i11 & 8) != 0) {
            f8 = screenshotRecorderConfig.scaleFactorY;
        }
        float f10 = f8;
        if ((i11 & 16) != 0) {
            i9 = screenshotRecorderConfig.frameRate;
        }
        int i13 = i9;
        if ((i11 & 32) != 0) {
            i10 = screenshotRecorderConfig.bitRate;
        }
        return screenshotRecorderConfig.copy(i7, i12, f9, f10, i13, i10);
    }

    public final int component1() {
        return this.recordingWidth;
    }

    public final int component2() {
        return this.recordingHeight;
    }

    public final float component3() {
        return this.scaleFactorX;
    }

    public final float component4() {
        return this.scaleFactorY;
    }

    public final int component5() {
        return this.frameRate;
    }

    public final int component6() {
        return this.bitRate;
    }

    public final ScreenshotRecorderConfig copy(int i7, int i8, float f7, float f8, int i9, int i10) {
        return new ScreenshotRecorderConfig(i7, i8, f7, f8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenshotRecorderConfig)) {
            return false;
        }
        ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) obj;
        return this.recordingWidth == screenshotRecorderConfig.recordingWidth && this.recordingHeight == screenshotRecorderConfig.recordingHeight && Float.compare(this.scaleFactorX, screenshotRecorderConfig.scaleFactorX) == 0 && Float.compare(this.scaleFactorY, screenshotRecorderConfig.scaleFactorY) == 0 && this.frameRate == screenshotRecorderConfig.frameRate && this.bitRate == screenshotRecorderConfig.bitRate;
    }

    public final int getBitRate() {
        return this.bitRate;
    }

    public final int getFrameRate() {
        return this.frameRate;
    }

    public final int getRecordingHeight() {
        return this.recordingHeight;
    }

    public final int getRecordingWidth() {
        return this.recordingWidth;
    }

    public final float getScaleFactorX() {
        return this.scaleFactorX;
    }

    public final float getScaleFactorY() {
        return this.scaleFactorY;
    }

    public int hashCode() {
        return Integer.hashCode(this.bitRate) + ((Integer.hashCode(this.frameRate) + ((Float.hashCode(this.scaleFactorY) + ((Float.hashCode(this.scaleFactorX) + ((Integer.hashCode(this.recordingHeight) + (Integer.hashCode(this.recordingWidth) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "ScreenshotRecorderConfig(recordingWidth=" + this.recordingWidth + ", recordingHeight=" + this.recordingHeight + ", scaleFactorX=" + this.scaleFactorX + ", scaleFactorY=" + this.scaleFactorY + ", frameRate=" + this.frameRate + ", bitRate=" + this.bitRate + ')';
    }

    public ScreenshotRecorderConfig(float f7, float f8) {
        this(0, 0, f7, f8, 0, 0);
    }
}
