package androidx.camera.core;

/* loaded from: classes6.dex */
final class ImageReaderFormatRecommender {
    private ImageReaderFormatRecommender() {
    }

    static abstract class FormatCombo {
        abstract int getHighSpeedVideoFpsRanges();

        abstract int getHighSpeedVideoSizes();

        FormatCombo() {
        }
    }
}
