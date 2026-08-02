package androidx.appcompat.widget;

/* loaded from: classes3.dex */
final class AppCompatTextClassifierHelper {
    private android.widget.TextView Camera2StreamConfigurationMap;
    private android.view.textclassifier.TextClassifier getHighSpeedVideoFpsRangesFor;

    AppCompatTextClassifierHelper(android.widget.TextView textView) {
        this.Camera2StreamConfigurationMap = (android.widget.TextView) androidx.core.util.Preconditions.checkNotNull(textView);
    }

    public final void Camera2StreamConfigurationMap(android.view.textclassifier.TextClassifier textClassifier) {
        this.getHighSpeedVideoFpsRangesFor = textClassifier;
    }

    public final android.view.textclassifier.TextClassifier getHighSpeedVideoFpsRanges() {
        android.view.textclassifier.TextClassifier textClassifier = this.getHighSpeedVideoFpsRangesFor;
        return textClassifier == null ? androidx.appcompat.widget.AppCompatTextClassifierHelper.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(this.Camera2StreamConfigurationMap) : textClassifier;
    }

    static final class Api26Impl {
        private Api26Impl() {
        }

        static android.view.textclassifier.TextClassifier getHighResolutionOutputSizeshNQ4ISI(android.widget.TextView textView) {
            android.view.textclassifier.TextClassificationManager textClassificationManager = (android.view.textclassifier.TextClassificationManager) textView.getContext().getSystemService(android.view.textclassifier.TextClassificationManager.class);
            if (textClassificationManager != null) {
                return textClassificationManager.getTextClassifier();
            }
            return android.view.textclassifier.TextClassifier.NO_OP;
        }
    }
}
